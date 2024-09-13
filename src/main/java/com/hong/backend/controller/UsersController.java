package com.hong.backend.controller;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author HQ
 * @since 2024-09-13
 */
@RestController
@RequestMapping("/users")
@Tag(name = "用户模块")
public class UsersController {

    @Operation(summary = "用户测试")
    @GetMapping("/ha")
    public void test(){
        System.out.println("hahaha");
    }

}
