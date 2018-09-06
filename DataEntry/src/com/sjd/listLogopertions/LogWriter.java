package com.sjd.listLogopertions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.sjd.Main;
import com.sjd.newsession.NewSession;
import com.sjd.randomizer.Randomizer;

public class LogWriter {
	private static Logger logger = Logger.getLogger(Main.class.getName());
public void writelog(String text) {
		File log = new File("log.txt");

				try{
				    if(!log.exists()){
				    	logger.log(Level.INFO,"We had to make a new file.");
				        log.createNewFile();
				    }

				    FileWriter fileWriter = new FileWriter(log, true);

				    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
				    bufferedWriter.write(text);
				    bufferedWriter.close();
                    
				} catch(IOException e) {
					logger.log(Level.INFO,"COULD NOT LOG!!");
				}	
 }

public void writeObjectTolog() {
	File log = new File("log.txt");
	NewSession newsession = new NewSession();
	
    newsession.setId(Randomizer.idCreation());
	newsession.setTime(Randomizer.dateCreation());
	newsession.setSession(Randomizer.sesionCreation());   
	
	String textToAdd = newsession.getTime() + " " + newsession.getSession() + " " + newsession.getId() + "\n"; 
			try{
			    if(!log.exists()){
			    	logger.log(Level.INFO,"We had to make a new file.");
			        log.createNewFile();
			    }

			    FileWriter fileWriter = new FileWriter(log, true);

			    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			    bufferedWriter.write(textToAdd);
			    bufferedWriter.close();
                
			} catch(IOException e) {
				logger.log(Level.INFO,"COULD NOT LOG!!");
			}	
}

 public static List<NewSession> getAllSessions(){
		List<NewSession> list = new ArrayList<>();
		
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		
		try {
			fileReader = new FileReader("log.txt");
			bufferedReader = new BufferedReader(fileReader);
			String tempText;
			
			while ((tempText = bufferedReader.readLine()) != null ) {
				String[] words = tempText.split(" ");
				NewSession newSession = new NewSession();
				if(words[0].equals("")) {
					break;
				}
				newSession.setTime(Long.parseLong(words[0]));
				newSession.setSession(Integer.parseInt(words[1]));
				newSession.setId(words[2]);

				list.add(newSession);
				
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return list;
 }
 public void reWritelog(String text) {
		File log = new File("log.txt");

				try{
				    if(!log.exists()){
				    	logger.log(Level.INFO,"We had to make a new file.");
				        log.createNewFile();
				    }

				    FileWriter fileWriter = new FileWriter(log, false);

				    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
				    bufferedWriter.write(text);
				    bufferedWriter.close();
                 
				} catch(IOException e) {
					logger.log(Level.INFO,"COULD NOT LOG!!");
				}	
}
}
