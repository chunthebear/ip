package com.yichun.ip;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ip {

	private String ip;
	private String status;
	
	public Ip(String ip) {
		super();
		this.ip = ip;
		this.status = setStatus();
	}
	
	public String getIp() {
		return ip;
	}
	
	public String getStatus() {
		return status;
	}
	
	public String setStatus() { 
		String status = "";
		try {
			InetAddress geek = InetAddress.getByName(this.ip); 
			System.out.println("Sending Ping Request to " + this.ip); 
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
