package org.example.springgetallbeans.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BeanController {

    @Autowired
    private ApplicationContext applicationContext;

    @GetMapping("/beans")
    public String getAllBeans() {
        StringBuilder result = new StringBuilder();
        String[] allBeans = applicationContext.getBeanDefinitionNames();
        for (String beanName : allBeans) {
            result.append(beanName).append("\n");
        }
        return result.toString();
    }

    @GetMapping("/bean1")
    public String getBean1() {
        return applicationContext.getBean("bean1").toString();
    }

    @GetMapping("/bean2")
    public String getBean2() {
        return applicationContext.getBean("bean2").toString();
    }

    @GetMapping("/bean3")
    public String getBean3() {
        return applicationContext.getBean("bean3").toString();
    }
}
