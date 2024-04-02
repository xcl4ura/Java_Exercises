package medium.testExamples.cheapProduct;
import java.math.BigDecimal;

public class Product {
    String nomeProduto;
    BigDecimal preco;
    public Product(String nomeProduto, BigDecimal preco) {
        this.nomeProduto = nomeProduto;
        this.preco = preco;
    }
    public BigDecimal getPreco() {
        return preco;
    }
    public void comprarProduto(Product produto, BigDecimal precoMenor){
        if (produto.getPreco().equals(precoMenor)){
            System.out.println("Compra Efetuada");
        }else {
            System.out.println("Não foi possível efetuar a compra");
        }

    }
}