package hospital;

public class ProcedimentoExame implements IProcedimento {

    public String executar() {
        return "Exame realizado";
    }

    public String cancelar() {
        return "Exame cancelado";
    }
}