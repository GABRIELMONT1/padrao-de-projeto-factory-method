package hospital;

public class ProcedimentoFactory {

    public static IProcedimento obterProcedimento(String procedimento) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("hospital.Procedimento" + procedimento);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Procedimento inexistente");
        }
        if (!(objeto instanceof IProcedimento)) {
            throw new IllegalArgumentException("Procedimento invalido");
        }
        return (IProcedimento) objeto;
    }
}