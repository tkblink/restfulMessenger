package org.tysonbowers.javabrains.restfulmessenger.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.tysonbowers.javabrains.restfulmessenger.service.MessageService;
import org.tysonbowers.javabrains.restfulmessenger.model.Message;

@Path("/messages")
public class MessageResource {
	
	MessageService messageService = new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessages() {
		return messageService.getAllMessages();
	}
}
