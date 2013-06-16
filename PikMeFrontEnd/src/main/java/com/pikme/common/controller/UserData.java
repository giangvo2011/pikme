package com.pikme.common.controller;
import java.io.Serializable;

import javax.faces.bean.ViewScoped;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pikme.common.bean.ExampleBean;
import com.pikme.common.bean.MessageService;

public class UserData implements Serializable {

    private static final long serialVersionUID = 1L;
     
    private MessageService messageService;

    public MessageService getMessageService() {
       return messageService;
    }

    public void setMessageService(MessageService messageService) {
       this.messageService = messageService;
    }

    public String getGreetingMessage(){
       return messageService.getGreetingMessage();
    }
}

