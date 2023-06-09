package com.example.demoblog.controllers;


import com.example.demoblog.entities.Comment;
import com.example.demoblog.payloads.ApiResponse;
import com.example.demoblog.payloads.CommentDto;
import com.example.demoblog.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/")
public class CommentController {


    @Autowired
    private CommentService commentService;

    @PostMapping("/post/{postId}/comments")
    public ResponseEntity<CommentDto>createComment(@RequestBody CommentDto comment,@PathVariable Integer postId){

       CommentDto createComment=this.commentService.createComment(comment,postId);
       return new ResponseEntity<CommentDto>(createComment, HttpStatus.CREATED);
    }

    @DeleteMapping("/comment/{commentId}")
    public ResponseEntity<ApiResponse>deleteComment(@PathVariable Integer commentId){
        this.commentService.deleteComment(commentId);
        return new ResponseEntity<ApiResponse>(new ApiResponse("comment delete successfully !!",true),HttpStatus.OK);
    }
}
