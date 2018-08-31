package Ex2_Pokemons.Tipo_Pokemons;

import Ex2_Pokemons.Main_Pokemons.Pokemon;

public class Eletricidade extends Pokemon{

    public Eletricidade(String nomes, int nivelDeVida, int forca) {
        super(nomes, nivelDeVida, forca);
    }

    @Override
    public void ataque(Pokemon atacado) {
        if(atacado instanceof Agua) {
            //Não recebe dano
            atacado.setNivelDeVida(atacado.getNivelDeVida() - 25);

        }else if(atacado instanceof Eletricidade) {
            this.setNivelDeVida(getNivelDeVida() - 15);
            atacado.setNivelDeVida(atacado.getNivelDeVida() - 10);

        }else if(atacado instanceof Fogo) {
            //Não recebe dano
            atacado.setNivelDeVida(atacado.getNivelDeVida() - 10);

        }else if(atacado instanceof Normais) {
            //Não recebe dano
            atacado.setNivelDeVida(getNivelDeVida() - 10);

        }else if(atacado instanceof Terra) {
            //Não da dano
            this.setNivelDeVida(getNivelDeVida() - 25);
        }
    }

}