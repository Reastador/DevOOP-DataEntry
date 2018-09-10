package com.sjd.secondthread;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.sjd.Main;
import com.sjd.newsessionconnection.NewSessionConection;

public class SecondThread extends Thread{
	private static Logger logger = Logger.getLogger(Main.class.getName());
	
	@Override
	public void run() {
		File log = new File("log.txt");
		NewSessionConection con = new NewSessionConection();
				
		 		for(int i = 0;i < 3; i++) {
		 		try {
		 			sleep(60000);
		 		}catch(InterruptedException e){}
				try{
				    if(!log.exists()){
				    	logger.log(Level.INFO,"We had to make a new file.");
				        log.createNewFile();
				    }

				    FileWriter fileWriter = new FileWriter(log, true);

				    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
				    bufferedWriter.write(con.sessionCreation());
				    bufferedWriter.close();
	                
				} catch(IOException e) {
					logger.log(Level.INFO,"COULD NOT LOG!!");
				}
		 		}		
	}
	
}
