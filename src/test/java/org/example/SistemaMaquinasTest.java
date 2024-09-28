package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

public class SistemaMaquinasTest {

    /*
        Sistema de Cadastro de Máquinas
        1.0 Criar uma classe para representar máquinas. ok
        1.1 Criar método para adicionar máquina no sistema. ok
        1.2 Criar método para remover máquina no sistema. ok
        1.3 Criar método para consultar uma máquina no sistema. ok
        1.4 Criar metodo para listar todas maquina1s cadastradas ok
        1.5 Criar método para alterar dados de uma máquina ok
    */

    static SistemaMaquinas sistemaMaquinas;
    static Maquina maquina1;
    static Maquina maquina2;

    @BeforeAll
    static void setUp() {
        sistemaMaquinas = Mockito.spy(new SistemaMaquinas());
        maquina1 = new Maquina("Maquina 1", 1L);
        maquina2 = new Maquina("Maquina 2", 2L);
    }

    @Test
    void testCadastrarMaquina() {
        sistemaMaquinas.cadastrarMaquina(maquina1);

        assertTrue(sistemaMaquinas.getMaquinas().contains(maquina1));
        verify(sistemaMaquinas).cadastrarMaquina(maquina1);
    }
    
    @Test
    void testRemoverMaquina(){
        sistemaMaquinas.cadastrarMaquina(maquina1);
        sistemaMaquinas.removerMaquina(maquina1);

        assertFalse(sistemaMaquinas.getMaquinas().contains(maquina1));
        verify(sistemaMaquinas).cadastrarMaquina(maquina1);
        verify(sistemaMaquinas).removerMaquina(maquina1);
    }


    @Test
    void testConsultarUmaMaquina(){
        sistemaMaquinas.cadastrarMaquina(maquina1);

        var maquina1Consultada = sistemaMaquinas.consultarMaquina(maquina1);

        assertEquals(maquina1, maquina1Consultada);
        verify(sistemaMaquinas).consultarMaquina(maquina1);
    }


    @Test
    void testListarMaquinasCadastradas(){
        sistemaMaquinas.cadastrarMaquina(maquina1);
        sistemaMaquinas.cadastrarMaquina(maquina2);

        verify(sistemaMaquinas).cadastrarMaquina(maquina1);
        verify(sistemaMaquinas).cadastrarMaquina(maquina2);
        assertEquals(2, sistemaMaquinas.getMaquinas().size());
        assertEquals(maquina1, sistemaMaquinas.getMaquinas().getFirst());
        assertEquals(maquina2, sistemaMaquinas.getMaquinas().getLast());
    }

    @Test
    void testAlterarMaquina(){
        String novoNome = "Maquina 123";
        sistemaMaquinas.cadastrarMaquina(maquina1);

        sistemaMaquinas.alterarMaquina(maquina1.getId(), novoNome);

        assertEquals(novoNome, sistemaMaquinas.getMaquina(maquina1).getName());
        verify(sistemaMaquinas).alterarMaquina(maquina1.getId(), novoNome);

    }


}
