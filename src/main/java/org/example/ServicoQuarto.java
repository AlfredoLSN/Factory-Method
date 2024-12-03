package org.example;

public class ServicoQuarto implements IServico{
    @Override
    public String executar() {
        return "Quarto reservado";
    }

    @Override
    public String cancelar() {
        return "Quarto liberado";
    }
}
