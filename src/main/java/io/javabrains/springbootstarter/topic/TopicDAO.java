package io.javabrains.springbootstarter.topic;

import org.springframework.data.repository.CrudRepository;

public interface TopicDAO extends CrudRepository<Topic, String>{}
