package com.yichun.ip;

public class Ip {

	private final String ip;
	private final String status;
	
	public Ip(String ip, String status) {
		super();
		this.ip = ip;
		this.status = status;
	}
	
	public String getIp() {
		return ip;
	}
	
	public String getStatus() {
		return status;
	}
}
