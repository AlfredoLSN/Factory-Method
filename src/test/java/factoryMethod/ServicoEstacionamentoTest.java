package factoryMethod;

import org.example.IServico;
import org.example.ServicoFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ServicoEstacionamentoTest {
    @Test
    void deveExecutarEstacionamento(){
        IServico servico = ServicoFactory.obterServico("Estacionamento");
        assertEquals("Vaga salva", servico.executar());
    }
    @Test
    void deveCancelarEstacionamento(){
        IServico servico = ServicoFactory.obterServico("Estacionamento");
        assertEquals("Vaga liberada", servico.cancelar());
    }
}
