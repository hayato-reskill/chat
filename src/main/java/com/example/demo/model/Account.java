package com.example.demo.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;

import lombok.Data;

@Component
@ApplicationScope
@Data
public class Account {
	private Integer id;
	private String name;
}
