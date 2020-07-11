package com.sella.boot;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class Sathis {

	public static void main(String[] args) {
		Client client = Client.create();
		String url = "http://svil-sso.bansel.it/sso/rest/api/connector/hash";
		WebResource resource = client.resource(url);
		ClientResponse response = resource.accept(MediaType.APPLICATION_JSON)
				.entity(new GenerateFastHashJsonRequest("bce1b8d1-0c1d-4f75-abef-0439b8ab8d8b", "SELLA_WEB",
						"TODO_TODO_TODO"))
				.header("content-type", MediaType.APPLICATION_JSON).post(ClientResponse.class);
		System.out.println(response.getStatus());
	}

}
