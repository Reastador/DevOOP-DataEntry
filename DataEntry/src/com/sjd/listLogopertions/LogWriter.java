package com.sjd.listLogopertions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.sjd.newsession.NewSession;

public class LogWriter {

public void writelog(String text) {
		File log = new File("log.txt");

				try{
				    if(!log.exists()){
				        System.out.println("We had to make a new file.");
				        log.createNewFile();
				    }

				    FileWriter fileWriter = new FileWriter(log, true);

				    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
				    bufferedWriter.write(text);
				    bufferedWriter.close();
                    
				} catch(IOException e) {
				    System.out.println("COULD NOT LOG!!");
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
				        System.out.println("We had to make a new file.");
				        log.createNewFile();
				    }

				    FileWriter fileWriter = new FileWriter(log, false);

				    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
				    bufferedWriter.write(text);
				    bufferedWriter.close();
                 
				} catch(IOException e) {
				    System.out.println("COULD NOT LOG!!");
				}	
}
}
