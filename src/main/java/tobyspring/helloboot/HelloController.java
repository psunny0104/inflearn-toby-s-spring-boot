package tobyspring.helloboot;

import java.util.Objects;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

public class HelloController {
    public String hello(String name) {
        SimpleHelloService helloService = new SimpleHelloService();

        return helloService.sayHello(Objects.requireNonNull(name)); // null 검증
    }
}
