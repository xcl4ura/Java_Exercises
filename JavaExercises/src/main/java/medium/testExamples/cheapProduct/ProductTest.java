package medium.testExamples.cheapProduct;

import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ProductTest {
    BigDecimal precoMenor = new BigDecimal("1.50");

    @Test
    public void VerificarSeOPrimeiroProdutoEOMaisBarato(){

        Product prod1 = new Product("Lápis", new BigDecimal("1.50"));

        prod1.comprarProduto(prod1, precoMenor);
        assertEquals(precoMenor, prod1.getPreco());
    }

    @Test
    public void VerificarSeOSegundoProdutoEOMaisBarato(){
        Product prod2 = new Product("Borracha", new BigDecimal("2.50"));
        prod2.comprarProduto(prod2, precoMenor);
        assertNotEquals(precoMenor, prod2.getPreco());
    }

    @Test
    public void VerificarSeOTerceiroProdutoEOMaisBarato(){
        Product prod3 = new Product("Apontador", new BigDecimal("3.50"));
        prod3.comprarProduto(prod3, precoMenor);
        assertNotEquals(precoMenor, prod3.getPreco());
    }

}
