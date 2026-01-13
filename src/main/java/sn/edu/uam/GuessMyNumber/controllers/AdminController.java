package sn.edu.uam.GuessMyNumber.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    @GetMapping("/config")
    public String configuration() {
        return "config";
    }

    @GetMapping("/admin/dashboard")
    public String adminDashboard() {
        return "admin";
    }
}