package springboot.demo.module;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Springboot_test {

    @GetMapping("hello")
    public String getMessage(){
        System.out.println("==========2121=  1 sa============");
        return "七月的风,八月的雨!";
    }

    public static void main(String[] args) {

    }
}
