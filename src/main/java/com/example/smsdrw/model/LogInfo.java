package com.example.smsdrw.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class LogInfo {
	private String ip;
	private String hostname;
	private String method;
	private String serviceName;
	private String username;
	private String agent;
	private String userHost;
}
