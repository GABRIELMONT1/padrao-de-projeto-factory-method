package hospital;

public class ProcedimentoCirurgia implements IProcedimento {

    public String executar() {
        return "Cirurgia realizada";
    }

    public String cancelar() {
        return "Cirurgia cancelada";
    }
}