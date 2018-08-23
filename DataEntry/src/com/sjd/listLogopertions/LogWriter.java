package com.sjd.listLogopertions;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

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
				    bufferedWriter.write(text + "\n");
				    bufferedWriter.close();
                    
				} catch(IOException e) {
				    System.out.println("COULD NOT LOG!!");
				}	
 }
}
