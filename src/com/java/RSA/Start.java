package com.java.RSA;

import com.java.RSA.util.PrivateAndPublicKeys;
import com.java.RSA.util.RSAUtil;

import java.util.Base64;

import static com.java.RSA.util.RSAUtil.encrypt;

public class Start {

    public static void main(String[] args){

        String encryptedString = Base64.getEncoder().encodeToString(encrypt("Joseph Wambugu is the author this en and de", PrivateAndPublicKeys.publicKey));
        System.out.println(encryptedString);
        String decryptedString = RSAUtil.decrypt(encryptedString, PrivateAndPublicKeys.privateKey);
        System.out.println(decryptedString);

    }
}

