/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojava.classes;

import java.util.Objects;

/**
 *
 * @author wesle
 */
public class Disciplina {

    private double nota;
    private String disciplina;

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.nota) ^ (Double.doubleToLongBits(this.nota) >>> 32));
        hash = 17 * hash + Objects.hashCode(this.disciplina);
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
        if (Double.doubleToLongBits(this.nota) != Double.doubleToLongBits(other.nota)) {
            return false;
        }
        if (!Objects.equals(this.disciplina, other.disciplina)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Disciplina{" + "nota=" + nota + ", disciplina=" + disciplina + '}';
    }

}
