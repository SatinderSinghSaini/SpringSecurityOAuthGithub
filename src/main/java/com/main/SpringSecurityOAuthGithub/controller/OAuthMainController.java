package com.main.SpringSecurityOAuthGithub.controller;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OAuthMainController {
    public String main(OAuth2AuthenticationToken auth){
        System.out.println(auth.getPrincipal());
        return "test.html";
    }
}
