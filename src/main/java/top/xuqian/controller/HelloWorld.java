package top.xuqian.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.xuqian.dto.Person;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@Controller
public class HelloWorld {
    @ResponseBody
    @RequestMapping(value = "/hello.do")
    public Person hello(HttpServletRequest response, HttpSession session){
        Person person = new Person();
        person.setNama("xuqian");
        person.setCode("1");
        return person;
    }
}

