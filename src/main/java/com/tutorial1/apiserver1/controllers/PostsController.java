package com.tutorial1.apiserver1.controllers;

import com.tutorial1.apiserver1.payload.request.PostsSaveRequestDto;
import com.tutorial1.apiserver1.payload.request.PostsUpdateRequestDto;
import com.tutorial1.apiserver1.payload.response.PostsListResponseDto;
import com.tutorial1.apiserver1.payload.response.PostsResponseDto;
import com.tutorial1.apiserver1.service.posts.PostsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class PostsController {
    private final PostsService postsService;

    @PostMapping("/api/board/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto){
        System.out.println("/api/board/posts save!");
        return postsService.save(requestDto);
    }

    @PutMapping("/api/board/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto) {
        return postsService.update(id, requestDto);
    }

    @GetMapping("/api/board/posts/")
    public List<PostsListResponseDto> findAll(){
        return postsService.findAllDesc();
    }

    @GetMapping("/api/board/posts/{id}")
    public PostsResponseDto findById (@PathVariable Long id){
        return postsService.findById(id);
    }

    @DeleteMapping("/api/board/posts/{id}")
    public Long delete(@PathVariable Long id) {
        postsService.delete(id);
        return id;
    }
}
