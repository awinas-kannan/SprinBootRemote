package com.sella.boot;

public class GenerateFastHashJsonRequest {
	private final String accessToken;

	private final String channelId;
	private final String deviceId;

	public GenerateFastHashJsonRequest(String accessToken, String channelId, String deviceId) {
		this.accessToken = accessToken;
		this.channelId = channelId;
		this.deviceId = deviceId;
	}

	public String getAccessToken() {
		return accessToken;
	}

	public String getChannelId() {
		return channelId;
	}

	public String getDeviceId() {
		return deviceId;
	}
}
