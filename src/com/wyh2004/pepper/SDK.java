package com.wyh2004.pepper;

import com.aldebaran.qi.Application;
import com.aldebaran.qi.helper.proxies.ALTextToSpeech;

public class SDK {
    private static String robotIP = "tcp://127.0.0.1:9559";
    public static void main(String[] args) throws Exception {
        // Create a new application
        Application application = new Application(args, robotIP);
        // Start your application
        application.start();
        // Create an ALTextToSpeech object and link it to your current session
        ALTextToSpeech tts = new ALTextToSpeech(application.session());
        // Set Language for Chinese
        tts.setLanguage("Chinese");
        // Make your robot say something
        tts.say("中文测试");
    }
}
