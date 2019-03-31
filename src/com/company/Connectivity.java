package com.company;

public class Connectivity {

    public String checkConnectivity() throws Exception{
        Process process = Runtime.getRuntime().exec("ping www.google.com");
        int x = process.waitFor();

        if(x == 0){
            return "online";
        } else {
            return "offline";
        }
    }
}
