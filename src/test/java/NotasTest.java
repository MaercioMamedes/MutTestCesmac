import core.Notas;
import org.junit.Test;
import static org.junit.Assert.*;

public class NotasTest {

    @Test
    public void testCalcularAprovacaoFrequenciaAbaixo75_ResultadoFalse() {
        Notas notas = new Notas();
        boolean resultado = notas.calcularAprovacao(60, 70, 80, 60);
        assertFalse(resultado);
    }

    @Test
    public void testCalcularAprovacao_MediaAbaixo30_ResultadoFalse() {
        Notas notas = new Notas();
        boolean resultado = notas.calcularAprovacao(10, 20, 0, 80);
        assertFalse(resultado);
    }

    @Test
    public void testCalcularAprovacao_MediaIgualOuAcima70_ResultadoTrue() {
        Notas notas = new Notas();
        boolean resultado = notas.calcularAprovacao(80, 90, 0, 80);
        assertTrue(resultado);
    }

    @Test
    public void testCalcularAprovacao_MediaFinalAcimaOuIgual50_ResultadoTrue() {
        Notas notas = new Notas();
        boolean resultado = notas.calcularAprovacao(40, 50, 60, 80);
        assertTrue(resultado);
    }

    @Test
    public void testCalcularAprovacao_OutrosCasos_ResultadoFalse() {
        Notas notas = new Notas();
        boolean resultado = notas.calcularAprovacao(50, 60, 40, 80);
        assertFalse(resultado);
    }
}
