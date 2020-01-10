package com.yichun.ip;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class IpController {
	
	// Sends ping request to a provided IP address 
	// Codes adapted from https://www.geeksforgeeks.org/pinging-ip-address-java/
	@RequestMapping("/check")
	public static Ip sendPingRequest(@RequestParam(value="ip", defaultValue="255.255.255.0") String ipAddress) { 
		String status = "";
	    try{
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
	    return new Ip(ipAddress, status);
	} 
}
