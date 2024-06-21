package com.ibm.spring.boot.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DepandantBeanConfig {
    //create beans based on condition
//    @Bean
//    public OptionalBean optionalBean() {
//        return new OptionalBean();
//    }
    @Bean
    //create DependantBean only if optional Bean is present.
   // @ConditionalOnBean(OptionalBean.class)
    //create DependantBean only if optional Bean is not present
    @ConditionalOnMissingBean(OptionalBean.class)
    public DependantBean dependantBean() {
        return new DependantBean();
    }


}
