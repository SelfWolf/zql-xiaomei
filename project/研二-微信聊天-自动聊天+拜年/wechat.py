# -*- coding: utf-8 -*-
import itchat, requests, random
from itchat.content import *
import json

replied = []

@itchat.msg_register([TEXT])
def text_reply(msg):
    # 替换为自己的图灵机器人的key
    cont = requests.get('http://www.tuling123.com/openapi/api?key=97c066cfb1dc4e87abd021a58373a6e2&info=%s' % msg['Content']).content
    m = json.loads(cont)
    if '年' in msg['Text'] and '快乐' in msg['Text'] :
      sendGreeting(msg)
    elif m['code'] == 200000:
      itchat.send(m['url'], msg['FromUserName'])
    elif m['code'] == 302000:
       itchat.send(m['list'], msg['FromUserName'])
    elif m['code'] == 308000:
       itchat.send(m['list'], msg['FromUserName'])
    else:
       itchat.send(m['text'], msg['FromUserName'])

def sendGreeting(msg):
  friend = itchat.search_friends(userName=msg['FromUserName'])
  itchat.send((friend['RemarkName']+'，'+getRandomGreeting()), msg['FromUserName'])
  replied.append(msg['FromUserName'])

def getRandomGreeting():
  response = requests.get("http://www.xjihe.com/api/life/greetings?festival=新年&page=10", headers = {'apiKey':'sQS2ylErlfm9Ao2oNPqw6TqMYbJjbs4g'})
  results = response.json()['result']
  greeting = results[random.randrange(len(results))]['words']
  return greeting

itchat.auto_login()
itchat.run()