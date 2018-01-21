# -*- coding: utf-8 -*-
"""
Created on Mon Jan 08 19:48:48 2018

@author: Administrator
"""

import pyscreenshot as ImageGrab
import urllib
import urllib2
import webbrowser

import sys
reload(sys)
sys.setdefaultencoding('utf-8')
import os

if __name__ == "__main__":
    # part of the screen
    im=ImageGrab.grab(bbox=(35,260,440,410)) # X1,Y1,X2,Y2
#    im.show()
    im.save("E:\\pythonTest\\kao.png")
    
    #from image to text    
    cmd = '''D: & \
    cd Program\Tesseract-OCR & \
    tesseract E:\\pythonTest\\kao.png E:\\pythonTest\\kao -l chi_sim & \
    '''
    
    os.system(cmd) 
    
    #using the text as the keywords and getting the searching result
#    text = ''
    with open("E:\\pythonTest\\kao.txt", 'r') as f:
        text = f.read().strip()
#    print text 
#    print '***********************'
    
    
    url = "http://www.baidu.com/s"
    text = text.replace('_','1')
#    text = text.translate(None,"`'^ (' )?'")
    print text
    print '-*-*-*-*-*-*-*-*-*-*-*-*'
    search = [('w',text)]
    getString = url + "?" + urllib.urlencode(search)

    req = urllib2.Request(getString)
    fd = urllib2.urlopen(req)
    baiduResponse=""
    while 1:
        data= fd.read(1024)
        if not len(data):
            break
        baiduResponse+=data
#    print baiduResponse
    fobj=open("baidu.html",'w')
    fobj.write(baiduResponse)
    fobj.close()
    
    webbrowser.open('E:\\pythonFile\\baidu.html')