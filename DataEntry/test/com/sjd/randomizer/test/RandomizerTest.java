package com.sjd.randomizer.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

import com.sjd.newsession.NewSession;
import com.sjd.randomizer.Randomizer;

class RandomizerTest {
	NewSession sessionTest = new NewSession();
	Randomizer test = new Randomizer();
	@Test
	void test() {
	sessionTest.setId(test.idCreation());	
	String testId = sessionTest.getId();
	assertEquals(testId,sessionTest.getId());
	}
    
	@Test
	void test1() {
    sessionTest.setTime(test.dateCreation());	
    long testDate = sessionTest.getTime();
    assertEquals(testDate,sessionTest.getTime());
	}
	
	@Test
	void test2() {
    sessionTest.setSession(test.sesionCreation());
	int test = sessionTest.getSession();
	assertEquals(test,sessionTest.getSession());
	}
	
}
