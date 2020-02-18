package com.java.RSA;

/**
 * Created by Kibe Joseph Wambugu
 * User: Joseph
 * Day: Saturday
 * Date: 2/15/2020
 * Time: 5:46 PM
 * Project: RSAencryption
 */

public interface DataEncryptAndDecrypt {

    String encryptData(String data);
    String decryptData(String encryptedData);
    String getPrivateKey();
    String getPublicKey();

}
