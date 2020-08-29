package comg.futurex.springdemo.SpringHelloWorld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloService {

    @RequestMapping("/")
    public String indexHello() {
        return ("Hello world 2020 123");
    }

    @RequestMapping("/abc")
    public String abcService() {
        return ("from ABC service");
    }

}
