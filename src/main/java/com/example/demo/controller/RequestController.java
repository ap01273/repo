package com.example.demo.controller;

import com.example.demo.pojo.Result;
import com.example.demo.pojo.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@RestController
//@ResponseBody--可以在类和方法上使用---表示当前类下所有方法的返回值会作为响应数据，如果是对象或集合先转json再作为响应
public class RequestController {
    //    @RequestMapping("/simpleParam")
//    public String simpleParam(HttpServletRequest request) {
//        String name = request.getParameter("name");
//        String ageStr = request.getParameter("ageStr");
//        int age=Integer.parseInt(ageStr);
//        System.out.println(name+" "+age);
//        return  null;
//    }
    //每一个对外开放的方法都是一个功能接口，下面就是接口的访问路径
    @RequestMapping("/simpleParam")
    public String simpleParam(@RequestParam(name = "name") String usename, Integer age) {
        System.out.println(usename + " " + age);
        return "OK";
    }

    @RequestMapping("/simplePojo")
    public String simplePojo(User user) {
        System.out.println(user);
        return "OK";
    }

    @RequestMapping("/complexPojo")
    public Result complexPojo(User user) {
        System.out.println(user);
        return Result.success(user);
    }//使用Result统一响应格式

    @RequestMapping("/arrayParam")
    public Result complexPojo(String[] hobby) {
        System.out.println(Arrays.toString(hobby));
        return Result.success(hobby);
    }

    @RequestMapping("/listParam")
    public String complexPojo(@RequestParam List<String> hobby) {
        System.out.println(hobby);
        return "OK";
    }

    @RequestMapping("/dateParam")
    public String dateParam(@DateTimeFormat(pattern = "yyyy-M-d HH:mm:ss")LocalDateTime updateTime) {
        System.out.println(updateTime);
        return "OK";
    }

    @RequestMapping("/jsonParam")
    public String jsonParam(@RequestBody User user) {//将json格式转为实体参数
        System.out.println(user);
        return "OK";
    }

    @RequestMapping("/path/{id}")
    public String pathParam(@PathVariable Integer id) {
        System.out.println(id);
        return "OK";
    }

    @RequestMapping("/path/{id}/{name}")
    public String pathParam(@PathVariable Integer id,@PathVariable String name) {
        System.out.println(id+" "+name);
        return "OK";
    }
}
