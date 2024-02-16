package com.example.kafka_poc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PublisherService {
	
	@Autowired
	FeedPublisher feedPublisher;
	
	void listener() {
		feedPublisher.publishMessageForNewItems("new items added");
	}

}
