package fr.sdv.m12526.demoboot;

import fr.sdv.m12526.demoboot.Round.ClassA;
import fr.sdv.m12526.demoboot.service.NotificationService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@RestController
@Configuration
public class DemobootApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemobootApplication.class, args);
	}

    private NotificationService notificationService;
    private ClassA classA;

    @Autowired
    public void setNotificationService( NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    //GetMapping("/hello")
    //public String hello() {
    //    return bavardService.parler();
    //}

    @GetMapping("/hello")
    public String Notif() {
        return notificationService.notifyUser();
    }

    @PostConstruct()
    private void postConstruct() {

    }



    @Autowired
    public void setClassA(ClassA classA) {
        this.classA = classA;
    }
}
