package com.sjd.randomizer;

import java.util.Date;

public class Randomizer {
	public static long dateCreation() {
		Date date = new Date();
		long newTime = date.getTime();
		return newTime;
	}
    public static String idCreation() {
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
	
	public static int sesionCreation() {
		int min=100000000;
		int max= 999999999;
		int sesionRandom = min + (int)(Math.random()*((max-min)+1));
		return sesionRandom;
	}
}
