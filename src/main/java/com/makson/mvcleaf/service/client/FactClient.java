package com.makson.mvcleaf.service.client;

import com.makson.mvcleaf.model.FactDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FactClient {
    private final WebClient webClient = WebClient.create();

    public Optional<FactDto> getDto(String uri) {
        return Optional.ofNullable(webClient
                .get()
                .uri(uri)
                .retrieve()
                .bodyToMono(FactDto.class)
                .block());
    }
}
