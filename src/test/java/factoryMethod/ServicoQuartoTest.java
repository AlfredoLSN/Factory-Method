package factoryMethod;

import org.example.IServico;
import org.example.ServicoFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ServicoQuartoTest {
    @Test
    void deveExecutarQuarto(){
        IServico servico = ServicoFactory.obterServico("Quarto");
        assertEquals("Quarto reservado", servico.executar());
    }
    @Test
    void deveCancelarQuarto(){
        IServico servico = ServicoFactory.obterServico("Quarto");
        assertEquals("Quarto liberado", servico.cancelar());
    }

}
