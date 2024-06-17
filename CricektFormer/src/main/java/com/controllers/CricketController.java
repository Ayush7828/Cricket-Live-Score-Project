package com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entites.Match;
import com.service.CricketService;

@RestController
@RequestMapping("/cricket")
@CrossOrigin("*")
public class CricketController {

	@Autowired
	private CricketService cricketService;

	public CricketController(CricketService cricketService) {
		this.cricketService = cricketService;
	}

	@GetMapping("/livematch")
	public ResponseEntity<?> getLiveMatchScores() throws InterruptedException {
		System.out.println("getting live match");
		return new ResponseEntity<>(this.cricketService.getLiveMatchScores(), HttpStatus.OK);
	}

	@GetMapping("/point-table")
	public ResponseEntity<?> getCWC2023PointTable() {
		return new ResponseEntity<>(this.cricketService.getCWC2023PointTable(), HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity<List<Match>> getAllMatches() {
		return new ResponseEntity<>(this.cricketService.getAllMatches(), HttpStatus.OK);
	}
}
