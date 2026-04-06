package hospital;

public class ProcedimentoConsulta implements IProcedimento {

    public String executar() {
        return "Consulta realizada";
    }

    public String cancelar() {
        return "Consulta cancelada";
    }
}