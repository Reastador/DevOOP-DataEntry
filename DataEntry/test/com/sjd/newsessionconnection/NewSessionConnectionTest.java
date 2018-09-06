package com.sjd.newsessionconnection;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.sjd.newsession.NewSession;
import com.sjd.randomizer.Randomizer;

class NewSessionConnectionTest {
    List <NewSession> listtest = new ArrayList<NewSession>();
    NewSession sessiontest = new NewSession();
	@Test
	void test() {
		sessiontest.setTime(Randomizer.dateCreation());
		sessiontest.setSession(Randomizer.sesionCreation());
		sessiontest.setId(Randomizer.idCreation());
		listtest.add(sessiontest);
		assertEquals(1,listtest.size());
	}
	@Test
	void test1() {
		NewSessionConection conTest = new NewSessionConection();
		sessiontest.setTime(sessiontest.getTime() + 259200000);
		conTest.deleteSessions();
		assertEquals(0,listtest.size());
	}
}
