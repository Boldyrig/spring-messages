package com.gmail.fuskerr.springdev.repository;

import com.gmail.fuskerr.springdev.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
