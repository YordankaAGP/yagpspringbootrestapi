package com.bcaf.yagpspringbootrestapi;

import com.bcaf.yagpspringbootrestapi.util.ExecuteSMTP;

public class TestSMTPHit {

    public static void main(String[] args) {
//        public Boolean sendSMTPToken(String mailAddress, String subject,
//        String [] strVerification,String pathFile)

        ExecuteSMTP executeSMTP = new ExecuteSMTP();
        String [] strArr =
                {"rezafauzanakbar3@gmail.com",
                        "wahyuramadhani5284@gmail.com",
                        "emirat.millenium@yahoo.co.id",
                        "yordankaandre@gmail.com"
                };
        String [] strArr1 = {"Verifikasi1","Verifikasi2","Verifikasi3"};

        executeSMTP.sendSMTPToken(strArr,"TEST123",strArr1,"\\data\\ver_regis.html");
    }
}
