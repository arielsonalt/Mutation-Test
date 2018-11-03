package domain;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class AlunoTest {
    public AlunoTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    Aluno aluno = new Aluno();

    @Before
    public void setUp() {

    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getNotaFinal method, of class Aluno.
     */
    @Test
    public void testReprovacaoPorfrequencia(){
        aluno.setFrequencia(74);
        assertEquals(false,aluno.calcularAprovacao());
    }
    @Test
    public void testReprovacaoPorNota(){
        aluno.setFrequencia(75);
        aluno.setNota1(29);
        aluno.setNota2(30);
        assertEquals(false,aluno.calcularAprovacao());
    }
    @Test
    public void testAprovacaoPorNota(){
        aluno.setFrequencia(75);
        aluno.setNota1(70);
        aluno.setNota2(70);
        assertEquals(true,aluno.calcularAprovacao());
    }
    @Test
    public void testAprovacaoProvaFinal(){
        aluno.setFrequencia(75);
        aluno.setNota1(30);
        aluno.setNota2(30);
        aluno.setNotaFinal(70);
        assertEquals(true,aluno.calcularAprovacao());
    }
    @Test
    public void testReprovacaoProvaFinal(){
        aluno.setFrequencia(75);
        aluno.setNota1(30);
        aluno.setNota2(30);
        aluno.setNotaFinal(69);
        assertEquals(false,aluno.calcularAprovacao());
    }
}
