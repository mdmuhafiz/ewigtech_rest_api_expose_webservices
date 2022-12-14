package com.ewigtech.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ewigtech.entity.LetsWorkTogether;
import com.ewigtech.repository.LetsWorkTogetherRepository;

@RestController
public class LetsWorkTogetherController {
	@Autowired
	private LetsWorkTogetherRepository letsWorkRepo;
	@RequestMapping("/letsworktogether/{id}")
	public LetsWorkTogether letsWorkTogether(@PathVariable("id") long id) {
		Optional<LetsWorkTogether> findById = letsWorkRepo.findById(id);
		LetsWorkTogether letsWorkTogether = findById.get();
		return letsWorkTogether;
	}

}
