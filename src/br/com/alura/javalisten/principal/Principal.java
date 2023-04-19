package br.com.alura.javalisten.principal;

import br.com.alura.javalisten.modelos.MinhasPreferidas;
import br.com.alura.javalisten.modelos.Musica;
import br.com.alura.javalisten.modelos.Podcast;

public class Principal {

    public static void main(String[] args) {

        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Tornado of Souls");
        minhaMusica.setCantor("Megadeth");
        minhaMusica.setAlbum("Rust in Peace");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("PodPah");
        meuPodcast.setApresentador("Igão e Mítico");
        meuPodcast.setDescricao("Podcast de variedades");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(minhaMusica);
        preferidas.inclui(meuPodcast);

    }

}
