package Diplomarbeit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

/**
 * Created by Timo on 03.07.2017.
 */

@Configuration
@SpringBootApplication

public class Main {
    public static void main(String[] args)
    {

        System.out.println("test");
        SpringApplication.run(Main.class, args);
    }
}
