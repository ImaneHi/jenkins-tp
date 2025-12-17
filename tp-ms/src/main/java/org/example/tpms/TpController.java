package org.example.tpms;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping("/tp")
public class TpController {
    @GetMapping("/")
    public String index() {
        return "Greetings from TPController!";
    }
}
