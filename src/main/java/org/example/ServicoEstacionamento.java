package org.example;

public class ServicoEstacionamento implements IServico{
    @Override
    public String executar() {
        return "Vaga salva";
    }

    @Override
    public String cancelar() {
        return "Vaga liberada";
    }
}
