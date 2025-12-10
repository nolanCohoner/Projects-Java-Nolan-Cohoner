package fr.sdv.m12526.demoboot.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class DevMessageService implements MessageService{
    @Override
    public String getMessage() {
        return "Je suis sur dev";
    }
}
