package com.eci.cosw.springbootsecureapi.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class StringUtils
{

    public static String getMD5Hash( String password )
    {
        try
        {
            MessageDigest messageDigest = MessageDigest.getInstance( "MD5" );
            messageDigest.update( password.getBytes() );
            //Get the hash's bytes
            byte[] bytes = messageDigest.digest();
            //This bytes[] has bytes in decimal format;
            //Convert it to hexadecimal format
            StringBuilder stringBuilder = new StringBuilder();
            for ( byte aByte : bytes )
            {
                stringBuilder.append( Integer.toString( ( aByte & 0xff ) + 0x100, 16 ).substring( 1 ) );
            }
            //Get complete hashed password in hex format
            return stringBuilder.toString();
        }
        catch ( NoSuchAlgorithmException e )
        {
            e.printStackTrace();
        }
        return "";
    }


    public static boolean isPasswordValid( String password, String passwordHash )
    {
        return getMD5Hash( password ).equals( passwordHash );
    }
}
