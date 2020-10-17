package guru.springframework.sfgdi.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String sayhello(){
        System.out.println("hello world!!");

        return "hi folksi";
    }
}
