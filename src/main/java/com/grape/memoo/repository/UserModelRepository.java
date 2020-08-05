package com.grape.memoo.repository;

import com.grape.memoo.dto.model.UserModel;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Service;

@Service
public interface UserModelRepository extends ReactiveMongoRepository<UserModel, String> {
}
