package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Talk;

public interface TalkRepository extends JpaRepository<Talk, Integer> {

	List<Talk> findBySenderId(Integer id);

}
