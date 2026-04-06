package hospital;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ProcedimentoTeste {

    @Test
    void deveExecutarCirurgia() {
        IProcedimento p = ProcedimentoFactory.obterProcedimento("Cirurgia");
        assertEquals("Cirurgia realizada", p.executar());
    }

    @Test
    void deveCancelarCirurgia() {
        IProcedimento p = ProcedimentoFactory.obterProcedimento("Cirurgia");
        assertEquals("Cirurgia cancelada", p.cancelar());
    }

    @Test
    void deveExecutarConsulta() {
        IProcedimento p = ProcedimentoFactory.obterProcedimento("Consulta");
        assertEquals("Consulta realizada", p.executar());
    }

    @Test
    void deveExecutarExame() {
        IProcedimento p = ProcedimentoFactory.obterProcedimento("Exame");
        assertEquals("Exame realizado", p.executar());
    }

    @Test
    void deveExecutarInternacao() {
        IProcedimento p = ProcedimentoFactory.obterProcedimento("Internacao");
        assertEquals("Internacao realizada", p.executar());
    }

    @Test
    void deveLancarExcecaoParaProcedimentoInexistente() {
        try {
            ProcedimentoFactory.obterProcedimento("Inexistente");
        } catch (IllegalArgumentException e) {
            assertEquals("Procedimento inexistente", e.getMessage());
        }
    }
}