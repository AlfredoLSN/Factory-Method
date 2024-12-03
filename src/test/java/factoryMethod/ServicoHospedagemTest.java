package factoryMethod;

import org.example.IServico;
import org.example.ServicoFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ServicoHospedagemTest {
    @Test
    void deveExecutarHospedagem(){
        IServico servico = ServicoFactory.obterServico("Hospedagem");
        assertEquals("Hospedagem feita", servico.executar());
    }

    @Test
    void deveCancelarFormatura(){
        IServico servico = ServicoFactory.obterServico("Hospedagem");
        assertEquals("Hospedagem cancelada", servico.cancelar());
    }


}
