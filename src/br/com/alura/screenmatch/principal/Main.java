package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Filme myFilme = new Filme("O lobo de wall street", 2013);
        myFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme " + myFilme.getDuracaoEmMinutos() + " minutos");

        myFilme.mostrarFichaDeDados();
        myFilme.avaliarFilme(7);
        myFilme.avaliarFilme(9);
        myFilme.avaliarFilme(5);
        System.out.println("Total de avaliações: " + myFilme.getTotalDeAvaliacao());
        System.out.println(myFilme.pegaMedia());

        Serie lost = new Serie("Lost", 2000);
        lost.setSeasons(10);
        lost.setSeasonEpisode(10);
        lost.setMinutesEpisode(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos() + " minutos");
        lost.mostrarFichaDeDados();

        Filme outroFilme = new Filme("Kikess", 2011);
        outroFilme.setDuracaoEmMinutos(200);
        System.out.println("Duração do filme " + outroFilme.getDuracaoEmMinutos() + " minutos");
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(myFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println("Tempo total para assistir " + myFilme.getNome() + " , " + outroFilme.getNome()
                + " e " + lost.getNome() + " é " + calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(myFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacao(300);
        filtro.filtra(episodio);

        var filmeDoLuis = new Filme("Doville", 2023);
        filmeDoLuis.setDuracaoEmMinutos(200);
        filmeDoLuis.avaliarFilme(8.7);

        ArrayList<Filme> listaDeFilme = new ArrayList<>();
        listaDeFilme.add(myFilme);
        listaDeFilme.add(outroFilme);
        listaDeFilme.add(filmeDoLuis);
        System.out.println("Tamanho da lista " + listaDeFilme.size());
        System.out.println("Primeiro filme da lista " + listaDeFilme.get(0).getNome());
        System.out.println(listaDeFilme);
        System.out.println("toString do filme " + listaDeFilme.get(0).toString());

    }
}
