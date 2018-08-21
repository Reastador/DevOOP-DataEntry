package com.sjd.server;


import java.util.Date;

public class Server {
	
	private long time;
	private String id;
	private int session;
	
	public long getTime() {
		return time;
	}
	public void setTime(long l) {	
		this.time = l;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		
		this.id = id;
	}
	
	public int getSession() {
		return session;
	}
	public void setSession(int session) {
		this.session = session;
	}
	public long dateCreation() {
		Date date = new Date();
		long newTime = date.getTime();
		return newTime;
	}
    public String idCreation() {
    	int min = 100;
		int max = 255;
		String iD ="";
		for(int i = 0; i < 3; i++) {
			int idGenerate =  min + (int)(Math.random()*((max-min)+1));
			iD += Integer.toString(idGenerate) + ".";
			if(i == 2) {
				iD+= Integer.toString(idGenerate/10);
			}
		}
		return iD;
    }
	
	public int sesionCreation() {
		int min=100000000;
		int max= 999999999;
		int sesionRandom = min + (int)(Math.random()*((max-min)+1));
		return sesionRandom;
	}
	
	
}
