package com.geturl;

import java.net.*;
import java.io.*;


public class Main {
    public static void main(String[] args) {
        try
        {
            URL url = new URL("http://www.baidu.com");
            URLConnection urlConnection = url.openConnection();
            HttpURLConnection connection = null;
            if(urlConnection instanceof HttpURLConnection)
            {
                connection = (HttpURLConnection) urlConnection;
            }
            else
            {
                System.out.println("请输入 URL 地址");
                return;
            }
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(connection.getInputStream()));
            String urlString = "";
            String current;
            while((current = in.readLine()) != null)
            {
                urlString += current;
            }
            System.out.println(urlString);
            System.out.println("end");
        }catch(IOException e)
        {
            e.printStackTrace();
        }

    }
}