package com.yichun.ip;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ip {

	private final String ip;
	private final String status;
	
	public Ip(String ip) {
		super();
		this.ip = ip;
		this.status = checkStatus(ip);
	}
	
	public String getIp() {
		return ip;
	}
	
	public String getStatus() {
		return status;
	}
	
	public static String checkStatus(String ipAddress) { 
		String status = "";
		try {
			InetAddress geek = InetAddress.getByName(ipAddress); 
			System.out.println("Sending Ping Request to " + ipAddress); 
			if (geek.isReachable(5000)) {
				System.out.println("Host is reachable"); 
				status = "Reachable";
			} else {
				System.out.println("Sorry ! We can't reach to this host"); 
				status = "Unreachable";
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return status;
	}
}
