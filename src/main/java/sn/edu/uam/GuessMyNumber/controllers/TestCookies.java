package sn.edu.uam.GuessMyNumber.controllers;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestCookies {

    @GetMapping("/visit")
    public String visitSite(HttpServletRequest request, HttpServletResponse response, HttpSession session) {

        Cookie visitCookie = new Cookie("visited", "true");
        visitCookie.setMaxAge(3600); // 1 heure


        int nbre = 0;
        nbre = nbre + 1;
        session.setAttribute("nbre", nbre);

//        session.setAttribute("nombreSecret", randomNumber);
//        session.setAttribute("tentatives", 0);

        visitCookie.setPath("/");   // accessible sur tout le site

        response.addCookie(visitCookie);

        return "visitView";
    }
}
