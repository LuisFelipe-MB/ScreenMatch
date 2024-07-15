package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

//    public void inclui(Movie f) {
//        tempoTotal += f.getDurationInMinutes();
//    }
//
//    public void inclui(Series s) {
//        tempoTotal += s.getDurationInMinutes();
//    }

    public void inclui(Titulo titulo) {
        System.out.println("Adicionando duração em minutos de " + titulo.getName());
        this.tempoTotal += titulo.getDurationInMinutes();
    }

}
