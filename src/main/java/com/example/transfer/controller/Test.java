package com.example.transfer.controller;
import com.example.transfer.dao.UserMapper;
import com.example.transfer.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther: liwang
 * @Date: 2019/4/10 21:44
 * @Description:
 */
@Controller
public class Test {

    @Autowired
    UserMapper userMapper;
    //http://localhost:8080/test
    @RequestMapping("/test")
    @ResponseBody
    public void test(){
        int add1= userMapper.addTest();
        System.out.println("自定义insert:"+add1);

        User user=new User();
        user.setName("admin");
        int add2=userMapper.insert(user);
        System.out.println("通用insert:"+add2);
    }
}
