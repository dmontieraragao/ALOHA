
package br.ufc.russas.aloha.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Disciplina {

    //Implementar os tratamentos
    private int id;
    private String codigoModelo;
    private String codigo;
    private String nome;
    private int crPraticos;
    private int crTeoricos;
    private int vagas;
    private String tipoSala;
    private List<CursoSemestre> cursosSemestres;
    

    public Disciplina() {
        this.cursosSemestres = new ArrayList<CursoSemestre>();
    }

    public Disciplina(String codigo, String nome, int crPraticos, int crTeoricos, int vagas) {
        this(codigo, nome, vagas);
        setCrPraticos(crPraticos);
        setCrTeoricos(crTeoricos);
        
    }

    public Disciplina(String codigo, String nome, int vagas) {
        setCodigo(codigo);
        setNome(nome);
        setVagas(vagas);
    }

    public Disciplina(int id, String codigoModelo, String codigo, String nome, int crPraticos, int crTeoricos, int vagas, String tipoSala) {
        this.id = id;
        this.codigoModelo = codigoModelo;
        this.codigo = codigo;
        this.nome = nome;
        this.crPraticos = crPraticos;
        this.crTeoricos = crTeoricos;
        this.vagas = vagas;
        this.tipoSala = tipoSala;
        
    }
    
    public String geraCodigo( int id) {
        String cod;
        if (id < 10) {
            cod = "DISC" + "0000" + id;
        } else if (id < 100) {
            cod = "DISC" + "000" + id;
        } else if (id < 1000) {
            cod = "DISC" + "00" + id;
        } else if (id< 10000){
            cod = "DISC" + "0" + id;
        }else{
            cod = "DISC" + this.id;
        }
        return cod;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if(codigo !=null)this.codigo = codigo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigoModelo() {
        return codigoModelo;
    }

    public void setCodigoModelo(String codigoModelo) {
        this.codigoModelo = codigoModelo;
    }

    public String getTipoSala() {
        return tipoSala;
    }

    public void setTipoSala(String tipoSala) {
        this.tipoSala = tipoSala;
    }

    public List<CursoSemestre> getCursosSemestres() {
        return cursosSemestres;
    }

    public void setCursosSemestres(List<CursoSemestre> cursosSemestres) {
        this.cursosSemestres = cursosSemestres;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome!= null)this.nome = nome;
    }

    public int getCrPraticos() {
        return crPraticos;
    }

    public void setCrPraticos(int crPraticos) {
        if(crPraticos >0 && crPraticos <6) this.crPraticos = crPraticos;
        else this.crPraticos = 0;
    }

    public int getCrTeoricos() {
        return crTeoricos;
    }

    public void setCrTeoricos(int crTeoricos) {
        if(crTeoricos >0 && crTeoricos <6)this.crTeoricos = crTeoricos;
        else this.crTeoricos = 0;
    }

    public int getVagas() {
        return vagas;
    }

    public void setVagas(int vagas) {
        if (vagas >0) this.vagas = vagas;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.codigoModelo);
        hash = 67 * hash + Objects.hashCode(this.nome);
        return hash;
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Disciplina other = (Disciplina) obj;
        if (this.crPraticos != other.crPraticos) {
            return false;
        }
        if (this.crTeoricos != other.crTeoricos) {
            return false;
        }
        if (this.vagas != other.vagas) {
            return false;
        }
        if (!Objects.equals(this.codigoModelo, other.codigoModelo)) {
            return false;
        }
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.tipoSala, other.tipoSala)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
