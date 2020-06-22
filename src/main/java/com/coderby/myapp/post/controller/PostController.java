package com.coderby.myapp.post.controller;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.coderby.myapp.post.model.PostVO;
import com.coderby.myapp.post.service.IPostService;
import com.coderby.myapp.user.model.UserVO;
import com.coderby.myapp.user.service.IUserService;
import com.coderby.myapp.user.service.UserService;

@Controller
public class PostController {

	@Autowired
	IPostService postService;
	@Autowired
	IUserService userService;

	@RequestMapping(value = "/count")
	public String postCount(@RequestParam(value = "postid", required = false, defaultValue = "0") int postid,
			Model model) {
		model.addAttribute("count", postService.getPostCount());
		return "/count";
	}

	@RequestMapping(value = "/post/{postId}")
	public String getPostInfo(@PathVariable int postId, Model model) {
		PostVO post = postService.getPostInfo(postId);
		model.addAttribute("post", post);
		return "/post/view";
	}

	@RequestMapping(value = "/post/list")
	public String getPostList(Model model) {
		model.addAttribute("postList", postService.getPostList());
		return "/post/list";
	}

// 	생성
	@RequestMapping(value = "/post/insert", method = RequestMethod.GET)
	public String postInsert(Model model, HttpServletRequest req) {
		HttpSession session = req.getSession();
		UserVO login = (UserVO) session.getAttribute("member");

		if (login == null) {
			return "redirect:/user/signin";
		}
		return "/post/insert";

	}

	@RequestMapping(value = "/post/insert", method = RequestMethod.POST)
	public String insertPost(PostVO post, Model model) {
		postService.insertPost(post);
		return "redirect:/post/list";
	}

//	수정
	@RequestMapping(value = "/post/update/{postId}", method = RequestMethod.GET)
	public String updatePost(@PathVariable int postId, Model model) {
		PostVO post = postService.getPostInfo(postId);
		model.addAttribute("post", post); 
		model.addAttribute("user", userService.getUserInfo(post.getUserId()));
		return "/post/update";
	}

	@RequestMapping(value = "/post/update", method = RequestMethod.POST)
	public String updatePost(PostVO post, Model model) {
		postService.updatePost(post);
		return "redirect:/post/list";
	}

//	삭제
	@RequestMapping(value = "/post/delete/{postid}", method = RequestMethod.GET)
	public String deletePost(@PathVariable int postid, Model model) {
		postService.deletePost(postid);
		return "redirect:/post/list";
	}

}
