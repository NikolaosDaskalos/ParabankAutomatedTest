package com.parasoft.screenshot;

import com.parasoft.Browser;

public class ScreenShot {
    public static void ifFailScreenShot(String name,Boolean isAt){
        if(isAt == false){
            Browser.takeScreenShot(name);
            System.out.println("Failed Test Screenshot Taken: " + name);
        }
    }
    public static void takeScreenShot (String name){
        Browser.takeScreenShot(name);
        System.out.println("Screenshot Taken: " + name);
    }
}
