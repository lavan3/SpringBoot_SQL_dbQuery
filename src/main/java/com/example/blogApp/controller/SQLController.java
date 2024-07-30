package com.example.blogApp.controller;

import com.example.blogApp.service.SQLService; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping
public class SQLController {

    @Autowired
    private SQLService sqlService;

    @GetMapping("/all")
    public List<Map<String, Object>> getAllBlogPosts() {
        return sqlService.getAllBlogPosts();
    }

    @GetMapping("/commentCount")
    public List<Map<String, Object>> getCommentCount() {
        return sqlService.getCommentCount();

}}
