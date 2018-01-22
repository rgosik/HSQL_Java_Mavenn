package com.example.shdemo.service;

import java.sql.Connection;
import java.util.List;

import com.example.shdemo.domain.Ball;


public interface BallManager {	
	int addBall(Ball ball);
	int updateBall(Ball ball);
	Connection getConnection();
	void addAll(List<Ball> balls);
	void deleteAll(List<Ball> balls);
	List<Ball> getAllBalls();
	Ball searchBall(String s);
	void clearBalls();
}
