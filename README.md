# linkPepper
***
###个人学习使用
> Pepper机器人的几个通信方案  
> 机器人型号: Pepper (NAOqi 2.5)


#### SDK下载地址: [softbankrobotics developer](https://developer.softbankrobotics.com/pepper-2-5/downloads/pepper-naoqi-25-downloads-windows) 
#### 官方使用说明: [英文文档](https://developer.softbankrobotics.com/pepper-naoqi-25/naoqi-developer-guide/sdks/java-sdk)
***
>使用官方SDK通信，Windows需要32位的JDK(JDK1.6以上即可)  
>还需要修改系统变量(Linux查看下面)

```
nano /home/nao/java/sourceme  
export JAVA_HOME=/home/nao/java/jre  
export PATH=$PATH:/home/nao/java/jre/bin  
export CLASSPATH=/home/nao/java/java-naoqi-sdk-<version>-atom.jar  
```

***
>UDP通信需要在机器人程序中用Python写入监听端口  
> 默认端口为10024

