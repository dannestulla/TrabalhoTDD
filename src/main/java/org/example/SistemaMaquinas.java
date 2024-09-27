package org.example;

import java.util.ArrayList;
import java.util.List;

public class SistemaMaquinas {
    public SistemaMaquinas(){
        listaMaquinas = new ArrayList<>();
    }

    private List<Maquina> listaMaquinas;

    public void cadastrarMaquina(Maquina maquina) {
        if (maquina != null){
            throw new IllegalArgumentException("A máquina não pode ser nula");
        }
        listaMaquinas.add(maquina);
    }

    public List<Maquina> getMaquinas() {
        return listaMaquinas;
    }

    public void removerMaquina(Maquina maquina) {
        listaMaquinas.remove(maquina);
    }

    public Maquina consultarMaquina(Maquina maquina) {
        for (Maquina m : listaMaquinas){
            if(m.equals(maquina)){
                return m;
            }
        }
        return null;
    }

    public void alterarMaquina(Long id, String novoNome) {
        for (Maquina m : listaMaquinas){
            if(m.getId().equals(id)){
                m.setName(novoNome);
            }
        }
    }
}
