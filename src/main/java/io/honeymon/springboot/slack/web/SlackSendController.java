package io.honeymon.springboot.slack.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.honeymon.springboot.slack.integration.SlackNotifier;
import io.honeymon.springboot.slack.integration.SlackNotifier.SlackMessage;
import io.honeymon.springboot.slack.integration.SlackNotifier.SlackMessageAttachement;
import io.honeymon.springboot.slack.integration.SlackNotifier.SlackTarget;

@RestController
public class SlackSendController {
	@Autowired
	private SlackNotifier slackNotifier;
	
	@RequestMapping(value="/", method=RequestMethod.POST)
	public ResponseEntity<Boolean> send(@RequestBody SlackMessageAttachement message) {
		return ResponseEntity.ok(slackNotifier.notify(SlackTarget.CH_INCOMING, message));
	}
}
