package com.tts.myRegistration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.tts.myRegistration.model.Subscriber;
import com.tts.myRegistration.repository.SubscriberRepository;

@Controller
public class SubscriberController {

  @Autowired
  private SubscriberRepository subscriberRepository;
  
//  private Subscriber subscriber;

  @GetMapping(value = "/")
  public String index(Subscriber subscriber) {
    return "subscriber/index";
  }

  @PostMapping(value = "/")
  public String addNewSubscriber(Subscriber subscriber,
      Model model) {
    subscriberRepository.save(new Subscriber(
        subscriber.getFirstName(), subscriber.getLastName(),
        subscriber.getUsername(),
        subscriber.getSignupDate()));
    model.addAttribute("firstName",
        subscriber.getFirstName());
    model.addAttribute("lastName",
        subscriber.getLastName());
    model.addAttribute("username",
        subscriber.getUsername());
    return "subscriber/show";
  }

}
