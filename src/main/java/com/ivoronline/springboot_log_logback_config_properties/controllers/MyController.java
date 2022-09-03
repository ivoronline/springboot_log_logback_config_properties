package com.ivoronline.springboot_log_logback_config_properties.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class MyController {

  //========================================================
  // HELLO
  //========================================================
  @ResponseBody
  @RequestMapping("/Hello")
  public String hello() {

    //LOG
    log.error("Hello from Controller");
    log.warn ("Hello from Controller");
    log.info ("Hello from Controller");
    log.debug("Hello from Controller");
    log.trace("Hello from Controller");

    //RETURN
    return "Hello from Controller";

  }

}
