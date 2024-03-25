package com.blog.weiblog.utils;

import org.junit.jupiter.api.Test;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Util {
    private static String byteArrayToHexString(byte[] bytes) {
        StringBuffer resultBuf = new StringBuffer();
        for (int i = 0; i < bytes.length; i++) {
            resultBuf.append(byteToHexString(bytes[i]));
        }
        return resultBuf.toString();
    }

    private static String byteToHexString(byte b) {
        int n = b;
        if (n < 0) {
            n += 256;
        }
        int n1 = n / 16;
        int n2 = n % 16;
        return hexDigits[n1] + hexDigits[n2];
    }

    private static final String hexDigits[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};

    public static String MD5Encode(String originString, String charsetName) {
        String resultString = null;
        try {
            resultString = new String(originString);
            MessageDigest encoder = MessageDigest.getInstance("MD5");
            if (charsetName == null || "".equals(charsetName)) {
                resultString = byteArrayToHexString(encoder.digest(resultString.getBytes()));
            } else {
                resultString = byteArrayToHexString(encoder.digest(resultString.getBytes(charsetName)));
            }
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return resultString;
    }
    @Test
    public void test1(){
        String admin = MD5Encode("admin123", "utf-8");
        System.out.println(admin);
    }
}
