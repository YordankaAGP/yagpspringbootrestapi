package com.bcaf.yagpspringbootrestapi.controller;

import com.bcaf.yagpspringbootrestapi.util.ExecuteSMTP;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hit")
public class HitController {
    @GetMapping("/v1/smtpz")
    public String hitSMTP()
    {
        ExecuteSMTP executeSMTP = new ExecuteSMTP();
        String [] strArr =
                {"excaviers@gmail.com",
                        "wahyuramadhani5284@gmail.com",
                        "emirat.millenium@yahoo.co.id",
                        "yordankaandre@gmail.com"};
        String [] strArr1 = {"Jemburadz","test","testtttttt"};

        executeSMTP.sendSMTPToken(strArr,"TEST123",strArr1,"\\data\\ver_regis.html");

        return "OK";
    }
}