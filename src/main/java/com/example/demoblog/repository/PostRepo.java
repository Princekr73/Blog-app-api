package com.example.demoblog.repository;

import com.example.demoblog.entities.Category;
import com.example.demoblog.entities.Post;
import com.example.demoblog.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PostRepo extends JpaRepository<Post,Integer> {
    List<Post>findByUser(User user);
    List<Post>findByCategory(Category category);


    //  List<Post>findByTitleContaining(String title);
    @Query("select p from Post p where p.title like :key")
    List<Post>searchBytitle(@Param("key") String title);
}
