package fr.sdv.m12526.demoboot.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("SMS")
public class SmsService implements MessageService {

    @Override
    public String getMessage() {
        return "Message envoyé par SMS.";
    }
}