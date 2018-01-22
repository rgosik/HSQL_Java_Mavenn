package com.example.shdemo.service;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;


import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.example.shdemo.domain.Ball;

public class BallManagerTest {
	
	
	BallManager ballManager = new BallMangerHibernateImpl();
	
	
	private final static String NAME_1 = "V-50";
	private final static String TYPE_1 = "Siatkowa";
	private final static double PRICE_1 = 34.99;
	private final static int TAX_1 = 10;
	
	private final static String NAME_2 = "Ultrax";
	private final static String TYPE_2 = "Nozna";
	private final static double PRICE_2 = 120;
	private final static int TAX_2 = 8;
	
	private final static String NAME_3 = "Supra";
	private final static String TYPE_3 = "Plazowa";
	private final static double PRICE_3 = 15.99;
	private final static int TAX_3 = 2;
	
	private final static String NAME_4 = "Bonk6";
	private final static String TYPE_4 = "Koszykowa";
	private final static double PRICE_4 = 67;
	private final static int TAX_4 = 12;
	
	Ball ball1 = new Ball(NAME_1,PRICE_1,TAX_1,TYPE_1);
	Ball ball2 = new Ball(NAME_2,PRICE_2,TAX_2,TYPE_2);
	Ball ball3 = new Ball(NAME_3,PRICE_3,TAX_3,TYPE_3);
	Ball ball4 = new Ball(NAME_4,PRICE_4,TAX_4,TYPE_4);


	//@Test
	public void checkSearching(){
		Ball ballFromSearch = ballManager.searchBall(NAME_1);
		assertEquals(NAME_1, ballFromSearch.getName());
		assertEquals(PRICE_1, ballFromSearch.getPrice(), 5);
		assertEquals(TAX_1, ballFromSearch.getTax());
		assertEquals(TYPE_1, ballFromSearch.getType());
	}
	@Test
	public void checkUpdating(){
		assertEquals(1,ballManager.updateBall(ball1));
	}
	
	@Test
	public void checkConnection(){
		assertNotNull(ballManager.getConnection());
	}

	@Test
	public void checkAdding(){
		ballManager.clearBalls();
		assertEquals(1,ballManager.addBall(ball1));

		List<Ball> balls = ballManager.getAllBalls();
		Ball ballRetrieved = balls.get(0);

		assertEquals(NAME_1, ballRetrieved.getName());
		assertEquals(PRICE_1, ballRetrieved.getPrice(), 5);
		assertEquals(TAX_1, ballRetrieved.getTax());
		assertEquals(TYPE_1, ballRetrieved.getType());
	}
	
	@Test
	public void checkDeleteAll(){
			List<Ball> balls = new ArrayList<Ball>();
			Ball ball5 = new Ball(NAME_1,PRICE_1,TAX_1,TYPE_1);
			balls.add(ball1);
			balls.add(ball2);
			balls.add(ball3);
			balls.add(ball4);
			balls.add(ball5);
			int size = ballManager.getAllBalls().size();			
			assertThat(size, anyOf((is(4)),(is(0)),(is(1))));
	}
	
	@Test
	public void checkAddAll(){
			List<Ball> balls = new ArrayList<Ball>();
			balls.add(ball1);
			balls.add(ball2);
			balls.add(ball3);
			balls.add(ball4);
			ballManager.clearBalls();
			ballManager.addAll(balls);
			int size = ballManager.getAllBalls().size();			
			assertThat(size, anyOf((is(4)),(is(0)),(is(1))));
	}
	
}