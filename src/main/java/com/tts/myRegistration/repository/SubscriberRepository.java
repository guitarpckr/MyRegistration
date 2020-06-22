package com.tts.myRegistration.repository;

import org.springframework.data.repository.CrudRepository;

import com.tts.myRegistration.model.Subscriber;

public interface SubscriberRepository
    extends CrudRepository<Subscriber, Long> {

	

}
