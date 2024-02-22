package org.example.adapter.service;

import org.example.adapter.NotificationSender;
import org.example.adapter.model.XmlData;

public class MyNotificationService implements NotificationSender {
    @Override
    public String sendNotification(XmlData XmlMessage) {
        return "Sending Xml message notification";
    }
}
