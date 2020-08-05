package com.grape.memoo.handler;

import com.grape.memoo.dto.model.UserModel;
import com.grape.memoo.repository.UserModelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class UserHandler {

    private final UserModelRepository userModelRepository;

    public Mono<ServerResponse> saveUser(ServerRequest serverRequest) {
        return serverRequest.bodyToMono(UserModel.class)
                .doOnNext(UserModel::validate)
                .flatMap(userModelRepository::save)
                .flatMap(userModel -> ServerResponse.ok().body(Mono.just(userModel), UserModel.class));
    }

    public Mono<ServerResponse> getUserById(ServerRequest serverRequest) {
        return ServerResponse.ok().body(userModelRepository.findById(serverRequest.pathVariable("id")), UserModel.class);
    }
}
