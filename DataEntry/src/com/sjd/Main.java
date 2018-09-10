package com.sjd;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.sjd.listLogopertions.LogWriter;
import com.sjd.newsessionconnection.NewSessionConection;
import com.sjd.secondthread.SecondThread;

public class Main {
	private static Logger logger = Logger.getLogger(Main.class.getName());
	
	static SecondThread thread1;
	static SecondThread thread2;
	static SecondThread thread3;
	
	public static void main(String[] args) throws InterruptedException {		
		NewSessionConection con = new NewSessionConection();
		LogWriter logOperations = new LogWriter();
	
		con.listAdd();		
		logger.log(Level.INFO,con.showList());
		
		logOperations.writelog(con.showList());
	
		con.renewList();
	
		con.deleteSessions();
		
		logOperations.reWritelog(con.showList());
		logOperations.writeObjectTolog(con.sessionCreation());
		
		thread1 = new SecondThread();
		thread1.run();
		thread2 = new SecondThread();
		//thread2.sleep(60000);
		thread2.run();
		thread3 = new SecondThread();
		//thread3.sleep(60000);
		thread3.run();
	}

}
