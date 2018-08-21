package com.sjd;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.sjd.serverconection.ServerConnection;

public class Main {
	private static Logger logger = Logger.getLogger(Main.class.getName());
	public static void main(String[] args) {		
		ServerConnection con = new ServerConnection();
		con.listAdd();
		con.listAdd();
		logger.log(Level.INFO,"Server info : " + con.showList());
	}

}
