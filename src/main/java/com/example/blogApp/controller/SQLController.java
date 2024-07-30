package com.example.blogApp.controller;

import com.example.blogApp.service.SQLService; // we have to import our service to access it
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

    // Endpoint to get the top 10 most commented posts
    @GetMapping("/comments_added")
    public List<Map<String, Object>> getCommentCount() {
        return sqlService.getCommentCount();

    // the rest of your endpoints
}}