package com.ganzina.app.runners.lesson17;

import com.ganzina.app.classwork.lesson17.User;

/**
 * Created by Ievgeniia on 5/16/2017.
 */
public class UserRunner {
    public static void main(String[] args) {

        User user1 = new User();
        user1.setAge(10);
        user1.setName("KIT");
        user1.setPassport("UKR");


        User user2 = new User();
        user2.setAge(10);
        user2.setName("KIT2");
        user2.setPassport("UKR2");


        System.out.println(user1.equals(user2));

        }
}
