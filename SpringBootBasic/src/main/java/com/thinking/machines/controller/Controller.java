package com.thinking.machines.controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/basic")
public class Controller {
@GetMapping
public String get()
{
	return "Ujjain is the city of GODS";
}
@PostMapping
public String post()
{
	return "God is Great";
}
@PutMapping
public String put()
{
	return "Put mapping got called";
}
@DeleteMapping
public String delete()
{
	return "delete got called";
}
}
