package com.yichun.ip;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class IpController {
	
	// Sends ping request to a provided IP address 
	// Codes adapted from https://www.geeksforgeeks.org/pinging-ip-address-java/
	@RequestMapping("/check")
	public static Ip checkStatus(@RequestParam(value="ip", defaultValue="255.255.255.0") String ipAddress) { 
		return new Ip(ipAddress);
	} 
}
