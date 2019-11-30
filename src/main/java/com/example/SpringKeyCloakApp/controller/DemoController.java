package com.example.SpringKeyCloakApp.controller;

import org.keycloak.KeycloakSecurityContext;
import org.keycloak.authorization.client.util.Http;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

@RestController
public class DemoController {

    @GetMapping(path = "/")
    public String index() {
        return "<center>" +
                "<font size=\"8\">" +
                "<p>HOME PAGE</p>\n" +
                "</font>" +
                "<font size=\"5\">" +
                "<p>Hello stranger, this is a freely accessible page.</p>\n" +
                "<p>In order to visit page for registered users, please click " +
                "<a href=\"http://127.0.0.1:8081/users\">here</a>.</p>" +
                "</font>" +
                "</center>";
    }

    @GetMapping(value = "/users")
    public String user(
    ) {
        return "<center>" +
                "<font size=\"8\">" +
                "<p>USER PAGE</p>\n" +
                "</font>" +
                "<font size=\"5\">" +
                "<p>Welcome user.</p>\n" +
                "<p>Click <a href=\"http://127.0.0.1:8081/logout\">here</a> to logout.</p>" +
                "</font>" +
                "</center>";
    }

    @GetMapping(value = "/logout")
    public String logout(HttpServletRequest request) throws ServletException {
        request.logout();
        return "<center>" +
                "<font size=\"8\">" +
                "<p>EXIT PAGE</p>\n" +
                "</font>" +
                "<font size=\"5\">" +
                "<p>You've been logged out.</p>\n" +
                "<p>Click <a href=\"http://127.0.0.1:8081/\">here</a> to go to main page.</p>" +
                "</font>" +
                "</center>";
    }

    //---------------------------- TESTING DIFFERRENT APPROACH BELOW -----------------------------------
    //        //  getKeycloakSecurityContext().getToken()
    //    private KeycloakSecurityContext getKeycloakSecurityContext() {
    //        return (KeycloakSecurityContext) request.getAttribute(KeycloakSecurityContext.class.getName());
    //    }


    //    //TODO other logout in progress...
    //    private String logoutString = "client_id=SpringKeyCloakApp&refresh_token=" +
    //            "eyJhbGciOiJIUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICIxMmE4ZjE5Mi1hZTEyLTRiMzUtODYyNy0wZjMzYmVlM" +
    //            "jM3NjAifQ.eyJqdGkiOiJkYTRjNjY5Zi1hMTMzLTQyMzYtOGNlYS1iN2ViMTM2MjAzMjMiLCJleHAiOjE1NzUxMjA2OTks" +
    //            "Im5iZiI6MCwiaWF0IjoxNTc1MTE4ODk5LCJpc3MiOiJodHRwOi8vbG9jYWxob3N0OjgwODAvYXV0aC9yZWFsbXMvbXlSZW" +
    //            "FsbSIsImF1ZCI6Imh0dHA6Ly9sb2NhbGhvc3Q6ODA4MC9hdXRoL3JlYWxtcy9teVJlYWxtIiwic3ViIjoiZDYwYTQ1Nzkt" +
    //            "ZTdjZS00NzNiLTg3NmMtOWM1Zjc4ZmNkMjU5IiwidHlwIjoiUmVmcmVzaCIsImF6cCI6IlNwcmluZ0tleUNsb2FrQXBwIiw" +
    //            "iYXV0aF90aW1lIjowLCJzZXNzaW9uX3N0YXRlIjoiZGJkNjZhMjctMTgwNC00M2ZmLTlkMjUtYjA4MmZhOWQ1ODJlIiwicm" +
    //            "VhbG1fYWNjZXNzIjp7InJvbGVzIjpbIm9mZmxpbmVfYWNjZXNzIiwidW1hX2F1dGhvcml6YXRpb24iLCJ1c2VyIl19LCJyZX" +
    //            "NvdXJjZV9hY2Nlc3MiOnsiYWNjb3VudCI6eyJyb2xlcyI6WyJtYW5hZ2UtYWNjb3VudCIsIm1hbmFnZS1hY2NvdW50LWxpb" +
    //            "mtzIiwidmlldy1wcm9maWxlIl19fSwic2NvcGUiOiJwcm9maWxlIGVtYWlsIn0.EycnqV5OTIwTfh1tb_ghNsiRNHdq2pMPgOQhYAnKS7Y";
    //
    //    @PostMapping(value = "/logout2", produces = "application/x-www-form-urlencoded")
    //    public String logout2(
    //            @RequestBody String logoutString
    //    ) {
    //        return "http://localhost:8080/auth/realms/myRealm/protocol/openid-connect/logout";
    //
    //    }
}
