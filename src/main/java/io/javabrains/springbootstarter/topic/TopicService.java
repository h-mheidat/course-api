package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
public class TopicService {
	
	@Autowired
	private TopicDAO topicDAO;
	
	public List<Topic> getAllTopic() {
		List <Topic> topics = new ArrayList<>();
		topicDAO.findAll().forEach(topics::add);
		return topics;
	}
	
	public Optional<Topic> getTopic(String id) {
		return topicDAO.findById(id);
	}
	
	public void addTopic(Topic topic) {
		topicDAO.save(topic);
	}

	public void updateTopic(Topic topic, String id) {
		topicDAO.save(topic);
	}

	public void deleteTopic(String id) {
		topicDAO.deleteById(id);
	}

}
