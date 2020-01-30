package io.javabrains.springbootstarter.seed;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.javabrains.springbootstarter.topic.Topic;
import io.javabrains.springbootstarter.topic.TopicDAO;

@RestController
public class SeedController {
	
	@Autowired
	private TopicDAO topicDAO;
	
	List<Topic> topics = new ArrayList<>(Arrays.asList(
			 new Topic("spring", "Spring framework", "Spring framework Description"),
			 new Topic("java", "Core java", "Core java Description"),
			 new Topic("javax", "Core javax", "Core javax Description")));

	@RequestMapping("/seed")
	public String sayHi(){
		for (Topic topic : topics) {
			topicDAO.save(topic);
		}
		return "seeded";
	}

}
