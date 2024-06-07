package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Repository.TalkRepository;
import com.example.demo.entity.Talk;
import com.example.demo.model.Account;

@Controller
public class TalkController {

	@Autowired
	Account ownAccount;

	@Autowired
	TalkRepository talkRepository;

	@GetMapping("/talk")
	public String talkAll() {
		return "talk";
	}

	@GetMapping("/talk/{pairAccountId}")
	public String talkRoom(Model model,
			@PathVariable("pairAccountId") Integer pairAccountId) {

		ownAccount.setName("user1");
		ownAccount.setId(2);
		List<Talk> Talk = talkRepository.findBySenderId(ownAccount.getId());
		for (Talk pariAccountTalk : talkRepository.findBySenderId(pairAccountId)) {
			Talk.add(pariAccountTalk);
		}
		model.addAttribute("Talk", Talk);

		return "talk-room";
	}

	@PostMapping("/talk/{pairAccountId}/post")
	public String talkPost(
			@RequestParam("postText") String postText,
			@PathVariable("pairAccountId") Integer pairAccountId) {

		talkRepository.save(new Talk(ownAccount.getId(), pairAccountId, postText));
		return "redirect:/talk";
	}
}
