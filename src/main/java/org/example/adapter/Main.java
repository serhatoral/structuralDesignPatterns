package org.example.adapter;

import org.example.adapter.model.XmlData;
import org.example.adapter.service.MyNotificationService;

public class Main {

    public static void main(String[] args) {
        MyNotificationService myNotificationService = new MyNotificationService();
        System.out.println(myNotificationService.sendNotification(new XmlData("xml data ile bildirim gönderiyorum")));


        System.out.println("---------------------");

        JsonNotificationServiceAdapter jsonNotificationServiceAdapter = new JsonNotificationServiceAdapter();
        System.out.println(jsonNotificationServiceAdapter.sendNotification(
                new XmlData("json kullanan bir bildirim gönderme servisine xml data veriyorum")));

    }
}