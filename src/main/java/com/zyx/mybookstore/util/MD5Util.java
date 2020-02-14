package com.zyx.mybookstore.util;

import java.security.MessageDigest;

import java.security.MessageDigest;

public class MD5Util {
    public static String MD5(String s) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] bytes = md.digest(s.getBytes("utf-8"));
            return toHex(bytes);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static String toHex(byte[] bytes) {

        final char[] HEX_DIGITS = "0123456789ABCDEF".toCharArray();
        StringBuilder ret = new StringBuilder(bytes.length * 2);
        for (int i = 0; i < bytes.length; i++) {
            ret.append(HEX_DIGITS[(bytes[i] >> 4) & 0x0f]);
            ret.append(HEX_DIGITS[bytes[i] & 0x0f]);
        }
        return ret.toString();
    }

    public static String MD55(String str) {
        String pwd1 = MD5Util.MD5(str);
        String pwd2 = MD5Util.MD5(pwd1);
        String str1 = pwd1.substring(0, 15) + pwd2.substring(15);
        return str1;

    }
}
