package com.example.treeter.repos;

import com.example.treeter.domain.Message
import org.springframework.data.repository.CrudRepository;

public interface MessageRepo extends CrudRepository<Message, Long> {
}
