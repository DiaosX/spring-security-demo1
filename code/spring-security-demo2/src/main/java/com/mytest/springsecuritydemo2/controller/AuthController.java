package com.mytest.springsecuritydemo2.controller;

import com.mytest.springsecuritydemo2.common.base.BaseResp;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/auth")
@Api(value = "授权管理", tags = {"授权管理"})
public class AuthController {

    @RequestMapping(value = "/signin", method = {RequestMethod.GET})
    @ResponseBody
    @ApiOperation("登录")
    public BaseResp signin(@RequestParam("userName") String userName,
                           @RequestParam("password") String password) {
        return BaseResp.success("这个是管理员");
    }
}
