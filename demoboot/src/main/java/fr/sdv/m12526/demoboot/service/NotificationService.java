package fr.sdv.m12526.demoboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

@Component
public class NotificationService {

    private MessageService messageService;


    // Setter injection
    @Autowired
    public NotificationService(MessageService messageService) {
        this.messageService = messageService;
    }

    public String notifyUser() {
        //System.out.println("Notification : " + messageService.getMessage());
        return "Notification : " + messageService.getMessage();
    }
}
