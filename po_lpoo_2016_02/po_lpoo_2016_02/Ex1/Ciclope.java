package Ex1;

import java.util.Calendar;

public class Ciclope extends SuperHeroi{
    /***************
     *  CONSTRUTOR *
     ***************/
    public Ciclope(String nomeOriginal, String descricao, Calendar dataDeCriacao, String paisNatal, int nivelDeResistencia, int estadoDeSaude) {
        super(nomeOriginal, descricao, dataDeCriacao, paisNatal, nivelDeResistencia, estadoDeSaude);
    }

    @Override
    public void machucar(SuperHeroi atacado) {
        if(atacado instanceof HomemDeFerro){
            atacado.setNivelDeResistencia(atacado.getNivelDeResistencia() - 10);

        } else if(atacado instanceof Wolverine){
            atacado.setNivelDeResistencia(atacado.getNivelDeResistencia() - 10);

        } else if(atacado instanceof Ciclope){
            atacado.setNivelDeResistencia(atacado.getNivelDeResistencia() - 10);

        } else if(atacado instanceof Coringa){
            atacado.setNivelDeResistencia(atacado.getNivelDeResistencia() - 10);
        }
    }

    @Override
    public void ajudar(SuperHeroi ajudado) {
        if(ajudado instanceof HomemDeFerro){
            this.setNivelDeResistencia(this.getNivelDeResistencia() + 10);

        } else if(ajudado instanceof Wolverine){
            this.setNivelDeResistencia(this.getNivelDeResistencia() + 10);

        } else if(ajudado instanceof Ciclope){
            this.setNivelDeResistencia(this.getNivelDeResistencia() + 10);

        } else if(ajudado instanceof Coringa){
            this.setNivelDeResistencia(this.getNivelDeResistencia() + 10);
        }
    }
}
