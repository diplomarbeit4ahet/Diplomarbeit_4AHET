package Diplomarbeit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Timo on 03.07.2017.
 */
@RestController
public class Controller {

    @GetMapping("/test")
    public String handleTest() {
        return "test";
    }
}
