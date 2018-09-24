package site.jackwang.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import site.jackwang.annotation.RequestLimit;
import site.jackwang.entity.User;

import javax.servlet.http.HttpServletRequest;


/**
 * @author wangjie<https://my.oschina.net/xiaowangqiongyou>
 * @date 2017/7/16
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestLimit(maxCount = 2)
    @RequestMapping("/login")
    public String login(HttpServletRequest request, User user) {
        return "成功";
    }
}
