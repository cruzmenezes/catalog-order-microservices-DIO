package com.example.simuladorpedido.service;

import com.example.simuladorpedido.model.ProdutoDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;

@Service
public class ProdutoService {

    private final WebClient webClient;

    public ProdutoService(WebClient.Builder builder) {
        this.webClient = builder.baseUrl("http://localhost:8080").build(); // endereço do catálogo
    }

    public List<ProdutoDTO> obterProdutos() {
        Mono<ProdutoDTO[]> monoProdutos = webClient.get()
                .uri("/produtos")
                .retrieve()
                .bodyToMono(ProdutoDTO[].class);

        ProdutoDTO[] produtos = monoProdutos.block(); // pode ser melhorado com abordagem reativa
        return Arrays.asList(produtos);
    }
}

