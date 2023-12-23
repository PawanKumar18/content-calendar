package com.example.contentcalendar.controller;

import com.example.contentcalendar.config.ContentCalendarProperties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

  private final ContentCalendarProperties properties;

  public HomeController(ContentCalendarProperties contentCalendarProperties) {
    this.properties = contentCalendarProperties;
  }


  @GetMapping("/")
  public ContentCalendarProperties home(){
    return properties;
  }


}
