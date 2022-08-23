package com.nykj.swagger.controller;

import com.nykj.swagger.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @description:
 * @author: chenlin
 * @date: Created in 2022.8.20 18:14
 * @version: 1.0
 * @modified By:
 */
@RestController
@RequestMapping("/user")
@Api(value = "用户操作接口")
public class UserController {

    @PostMapping("/save")
    @ApiOperation(value = "新增用户")
    /* @ApiResponse(code = 0, message = "success")*/
    public ResponseEntity<?> save(@ApiParam(value = "用户对象", required = true) @RequestBody User user) {
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "查询新用户")
    public ResponseEntity<?> one(@ApiParam(value = "用户id",required = true) @PathVariable String id) {
        User user = new User();
        user.setId(1L);
        user.setName("chan");
        user.setSex(1);
        user.setPhone("13247529607");
        user.setAddress("永新汇");
        return ResponseEntity.ok(user);
    }

}
