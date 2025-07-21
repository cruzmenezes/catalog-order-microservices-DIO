package com.example.simuladorpedido.controller;

import com.example.simuladorpedido.model.ProdutoDTO;
import com.example.simuladorpedido.service.ProdutoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PedidoController {

    private final ProdutoService produtoService;

    public PedidoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @GetMapping("/simular-pedido")
    public List<ProdutoDTO> simularPedido() {
        return produtoService.obterProdutos();
    }
}
