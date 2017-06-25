package com.java;

import java.net.*;  
public class DSender{  
  public static void main(String[] args) throws Exception {  
   for (int i = 0; i <10; i++) {
	   DatagramSocket ds = new DatagramSocket();  
	    String str = "Welcome java";  
	   // System.out.println(str);
	    InetAddress ip = InetAddress.getByName("192.168.2.180");  
	     
	    DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(), ip, 4444);  
	    ds.send(dp);  
	    ds.close();  
}
  }  
  
  
}  