package hospital;

public class ProcedimentoInternacao implements IProcedimento {

    public String executar() {
        return "Internacao realizada";
    }

    public String cancelar() {
        return "Internacao cancelada";
    }
}