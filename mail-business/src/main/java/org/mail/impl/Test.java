package org.mail.impl;

import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
public class Test {

    public static void main(String[] args) {
        EmailManagerImpl emailManager = new EmailManagerImpl();
        int i = 0;
        while(i < 99999){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("i: "+i);
        i++;

        }
    }
}
