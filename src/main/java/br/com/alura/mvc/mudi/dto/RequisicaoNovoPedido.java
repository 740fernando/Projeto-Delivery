package br.com.alura.mvc.mudi.dto;

import br.com.alura.mvc.mudi.model.Pedido;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


//Os atributos vão ter os nomes que eu estou mandando na requisição.
@Data
public class RequisicaoNovoPedido {

    @NotBlank
    private String nomeProduto;

    @NotBlank
    private String urlProduto;

    @NotBlank
    private String urlImagem;

    private String descricao;

    public Pedido toPedido() {
        Pedido pedido = new Pedido();
        pedido.setDescricao(descricao);
        pedido.setNomeProduto(nomeProduto);
        pedido.setUrlImagem(urlImagem);
        pedido.setUrlProduto(urlProduto);
        return pedido;
    }
}
/**
 * Então, olhe o que eu vou fazer: eu vou dizer que esse aqui vai receber uma “RequisicaoNovoPedido”.
 * Então “Requisicao”. Essa classe não existe. Eu vou criar dentro de um pacote, não no “controller”.
 * Vamos colocar no “dto”. O “dto data” transforma objetos. É uma classe que serve apenas transferir objetos.
 */