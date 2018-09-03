package com.sjd.newsessionconnection;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.sjd.listLogopertions.LogWriter;
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
	public List<NewSession> renewList(){
		list=LogWriter.getAllSessions();
		return list;
	}
	public List<NewSession> deleteSessions() {
		List<NewSession> list2 = new ArrayList<>();
		list=LogWriter.getAllSessions();
		list2=list;
		Iterator<NewSession> iter = list2.iterator();
		while(iter.hasNext()) {
			Date date = new Date();
			long newTime = date.getTime();
			if((iter.next().getTime()+86400000) < newTime) {
				iter.remove();
			}
		}
		list=list2;
		return list;
	}
}
