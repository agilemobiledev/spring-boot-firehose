package org.springframework.boot.firehose.integration.test;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.firehose.annotations.EnableFirehoseMetrics;


/**
 * Created by vcarvalho on 4/20/15.
 */

@SpringBootApplication
@EnableFirehoseMetrics
public class Application {


    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Application.class);
        app.run(args);
    }








}
