package com.xyz.main;

import org.apache.log4j.Logger;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class Main {

  private Logger logger = Logger.getLogger(Main.class);

  @Scheduled(cron="0/10 * * * * ?") //每10秒执行一次,这是cron表达式
  public void log() {
    Date date = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String dateTime = sdf.format(date);
    logger.info(dateTime);
  }
}
