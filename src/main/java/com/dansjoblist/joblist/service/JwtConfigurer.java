package com.dansjoblist.joblist.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;

@Configuration
public class JwtConfigurer extends WebSecurityConfiguration {

    @Autowired
    private JwtTokenProvider jwtTokenProvider;

    // @Override
    // protected void configure(HttpSecurity http) throws Exception {
    //     http.csrf().disable();
    //     http.authorizeRequests()
    //             .antMatchers("/jobs/**").authenticated()
    //             .and()
    //             .apply(new JwtTokenFilterConfigurer(jwtTokenProvider));
    // }
}
