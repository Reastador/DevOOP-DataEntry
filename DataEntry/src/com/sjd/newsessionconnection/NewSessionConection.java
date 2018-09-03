package com.sjd.newsessionconnection;

import java.util.ArrayList;

import java.util.List;

import com.sjd.newsession.NewSession;
import com.sjd.randomizer.Randomizer;

public class NewSessionConection {
 
	List <NewSession> list = new ArrayList<>();	
	
	public void listAdd() {
		NewSession newsession = new NewSession();
        newsession.setId(Randomizer.idCreation());
		
		newsession.setTime(Randomizer.dateCreation());
		
		newsession.setSession(Randomizer.sesionCreation());
		list.add(newsession);
	}
	public String showList() {
		String info =list.get(0).getTime() + " " + list.get(0).getSession() + " " + list.get(0).getId() + "\n";
		for(int i =1;i<list.size();i++) {
	    info += list.get(i).getTime() + " " + list.get(i).getSession()+ " " + list.get(i).getId() + "\n";
		}
	return info;	
	}
}
