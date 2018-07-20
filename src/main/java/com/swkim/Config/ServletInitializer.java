package com.swkim.Config;

import com.swkim.springbootvue.SpringbootvueApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {


    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringbootvueApplication.class);
    }

    /*@Override
    protected SpringApplicationBuilder congifure(SpringApplicationBuilder application) {
        return application.sources(SpringbootvueApplication.class);
    }*/
}
