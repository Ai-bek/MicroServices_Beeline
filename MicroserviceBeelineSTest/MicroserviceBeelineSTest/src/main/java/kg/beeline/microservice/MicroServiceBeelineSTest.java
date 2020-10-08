package kg.beeline.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MicroServiceBeelineSTest {

    @RequestMapping("/")
    public String home() {
        return "Hello Microservice and Docker World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(MicroServiceBeelineSTest.class, args);
    }
}
