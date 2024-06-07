package com.example.demo.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "messages")
public class Talk {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "sender_id")
	private Integer senderId;

	@Column(name = "receiver_id")
	private Integer receiverId;

	@Column(name = "message_text")
	private String messageText;

	@Column(name = "sent_at")
	private LocalDateTime sentAt;

	public Talk() {

	}

	public Talk(Integer senderId, Integer receiverId, String messageText) {
		super();
		this.senderId = senderId;
		this.receiverId = receiverId;
		this.messageText = messageText;
		this.sentAt = LocalDateTime.now();
	}

}
