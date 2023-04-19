package br.com.alura.javalisten.modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio){
        if (audio.getClassificacao() >= 9) {
            System.out.println("É considerado um sucesso absoluto e preferido por todos: " + audio.getTitulo());
        } else {
            System.out.println("Também é um dos que todo mundo está curtindo: " + audio.getTitulo());
        }
    }

}
