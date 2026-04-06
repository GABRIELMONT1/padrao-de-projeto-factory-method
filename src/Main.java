package hospital;

public class Main {
    public static void main(String[] args) {

        IProcedimento cirurgia = ProcedimentoFactory.obterProcedimento("Cirurgia");
        System.out.println(cirurgia.executar());
        System.out.println(cirurgia.cancelar());

        IProcedimento consulta = ProcedimentoFactory.obterProcedimento("Consulta");
        System.out.println(consulta.executar());
        System.out.println(consulta.cancelar());

        IProcedimento exame = ProcedimentoFactory.obterProcedimento("Exame");
        System.out.println(exame.executar());

        IProcedimento internacao = ProcedimentoFactory.obterProcedimento("Internacao");
        System.out.println(internacao.executar());
    }
}