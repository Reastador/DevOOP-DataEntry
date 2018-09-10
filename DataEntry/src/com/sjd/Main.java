package com.sjd;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.sjd.listLogopertions.LogWriter;
import com.sjd.newsessionconnection.NewSessionConection;
import com.sjd.secondthread.SecondThread;

public class Main {
	static SecondThread secthread;
	private static Logger logger = Logger.getLogger(Main.class.getName());
	public static void main(String[] args) {		
		NewSessionConection con = new NewSessionConection();
		LogWriter logOperations = new LogWriter();
		con.listAdd();		
		logger.log(Level.INFO,con.showList());
		
		logOperations.writelog(con.showList());
	
		con.renewList();
	
		con.deleteSessions();
		
		logOperations.reWritelog(con.showList());
		logOperations.writeObjectTolog(con.sessionCreation());
		
		secthread = new SecondThread();
		secthread.run();
		secthread.run();
		secthread.run();
	}

}
