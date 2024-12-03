package org.example;

public class ServicoPagamento implements IServico{
    @Override
    public String executar() {
        return "Pagamento realizado";
    }

    @Override
    public String cancelar() {
        return "Pagamento cancelado";
    }
}
