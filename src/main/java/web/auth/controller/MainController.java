package web.auth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

//    ------------------------------
//    /
//    ------------------------------
    @GetMapping("/")
    public String showIndex() {
        return "index";
    }

//    ------------------------------
//    /admin
//    ------------------------------
    @GetMapping("/admin")
    public String showAdmin() {
        return "admin";
    }

//    ------------------------------
//    /user
//    ------------------------------
    @GetMapping("/user")
    public String showUser() {
        return "user";
    }

//    ------------------------------
//    /access-denied
//    ------------------------------
    @GetMapping("/access-denied")
    public String showAccessDenied() {
        return "access-denied";
    }

}
