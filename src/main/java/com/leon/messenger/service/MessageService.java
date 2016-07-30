package com.leon.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.leon.messenger.database.DatabaseClass;
import com.leon.messenger.model.Message;

public class MessageService {
	
	private Map<Long, Message> messages = DatabaseClass.getMessages();
	
	
	
	public MessageService(){
		messages.put(1L, new Message(1L, "Hello Leon", "Leon"));
		messages.put(2L, new Message(2L, "Hi Abajaile", "Leon"));
		messages.put(3L, new Message(3L, "Hi Jane", "Leon"));
	}
	
	public List<Message> getMessageList(){
		return new ArrayList<Message>(messages.values());
	}
	
	public Message getMessage(long id){
		return messages.get(id);
	}
	
	public void addMessage(Message message){
		message.setId(messages.size()+1);
		messages.put(message.getId(), message);
	}
	
	public void updateMessage(Message message){
		messages.put(message.getId(), message);
	}
	
	public void removeMessage(long id){
		messages.remove(id);
	}
	
	

}
