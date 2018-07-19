package cn.no7player.controller;

import cn.no7player.model.User;
import cn.no7player.service.UserService;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zl on 2015/8/27.
 */
@Controller
public class UserController {

    private Logger logger = Logger.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/getUserInfo")
    @ResponseBody
    public List<User> getUserInfo() {
    	List<User> userList = userService.getUserInfo();
    	for (User u : userService.getUserInfo()) {
    		if(u != null){
                System.out.println("user.getName():"+u.getName());
                logger.info("user.getAge():"+u.getAge());
            }
    	}
        
        return userList;
    }
    
    @RequestMapping("/show")
    @ResponseBody
    public String show() {
    	String ss = "哈哈哈哈哈，老子天下第一";
        
        return ss;
    }
}
