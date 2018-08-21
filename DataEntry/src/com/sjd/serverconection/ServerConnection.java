package com.sjd.serverconection;

import java.util.ArrayList;

import java.util.List;

import com.sjd.server.Server;

public class ServerConnection {
 
	List <Server> list = new ArrayList<>();	
	
	public void listAdd() {
		Server server = new Server();
		
        server.setId(server.idCreation());
		
		server.setTime(server.dateCreation());
		
		server.setSession(server.sesionCreation());
		list.add(server);
	}
	public String showList() {
		String info ="";
		for(Server e : list) {
	    info += (String) e.getClass().getSimpleName() +" " +  e.getTime() + " " + e.getSession()+ " " + e.getId() + "\n";
		}
	return info;	
	}
}
