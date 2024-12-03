package factoryMethod;

import org.example.IServico;
import org.example.ServicoFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ServicoPagamentoTest {
    @Test
    void deveExecutarPagamento(){
        IServico servico = ServicoFactory.obterServico("Pagamento");
        assertEquals("Pagamento realizado", servico.executar());
    }
    @Test
    void deveCancelarPagamento(){
        IServico servico = ServicoFactory.obterServico("Pagamento");
        assertEquals("Pagamento cancelado", servico.cancelar());
    }
}
