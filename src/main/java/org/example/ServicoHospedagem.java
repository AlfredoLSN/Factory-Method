package org.example;
public class ServicoHospedagem implements IServico{
    @Override
    public String executar() {
        return "Hospedagem feita";
    }

    @Override
    public String cancelar() {
        return "Hospedagem cancelada";
    }
}
