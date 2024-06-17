package com.service;

import java.util.List;

import com.entites.Match;

public interface CricketService {
	List<Match> getLiveMatchScores();

	List<List<String>> getCWC2023PointTable();

	List<Match> getAllMatches();
}
