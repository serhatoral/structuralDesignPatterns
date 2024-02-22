package org.example.adapter;

import org.example.adapter.model.JsonData;
import org.example.adapter.model.XmlData;
import org.example.adapter.service.JsonNotificationService;

public class JsonNotificationServiceAdapter implements NotificationSender{
    private JsonNotificationService jsonNotificationService;

    public JsonNotificationServiceAdapter() {
        this.jsonNotificationService = new JsonNotificationService();
    }

    @Override
    public String sendNotification(XmlData xmlMessage) {
        JsonData jsonData = convertXmlToJson(xmlMessage);
        jsonNotificationService.sendNotification(jsonData);
        return "Sending json message notification";
    }

    private JsonData convertXmlToJson(XmlData xmlData){
        return new JsonData("test");
    }
}
