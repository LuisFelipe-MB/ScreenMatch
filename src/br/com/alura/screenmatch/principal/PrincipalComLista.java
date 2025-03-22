package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComLista {
    public static void main(String[] args) {

        Filme myFilme = new Filme("O lobo de wall street", 2013);
        myFilme.avaliarFilme(1.5);
        Filme outroFilme = new Filme("Kikess", 2011);
        outroFilme.avaliarFilme(9);
        var filmeDoLuis = new Filme("Doville", 2023);
        filmeDoLuis.avaliarFilme(10);
        Filme f5 = filmeDoLuis;
        f5.avaliarFilme(3);

        Serie lost = new Serie("Lost", 2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(myFilme);
        lista.add(outroFilme);
        lista.add(filmeDoLuis);
        lista.add(lost);

        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                //Filme filme = (Filme) item;
                System.out.println("Classificação " + filme.getClassificacao());
                /*O instanceof é um operador em Java que permite verificar
                se um objeto é uma instância de uma determinada classe ou interface.
                Ele é muito útil quando estamos trabalhando com herança e polimorfismo, pois
                nos ajuda a determinar o tipo real de um objeto em tempo de execução.*/
            }
        }

        //lista.forEach(item -> System.out.println(item));
        /* A expressão lambda nome -> System.out.println(nome) é uma forma compacta
        de definir uma função que recebe um parâmetro nome e realiza a operação de impressão.*/

        //lista.forEach(System.out::println);
        /* No código anterior, o símbolo :: é a sintaxe do Method Reference,
            que no exemplo mostrado faz uma referência para o método println.*/


        List<String> buscaPorArtista = new LinkedList<>();

        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo Cruzi");
        buscaPorArtista.add("Carlos Shagas");
        System.out.println(buscaPorArtista);

        //organizando em ordem alfabética
        Collections.sort(buscaPorArtista);
        System.out.println("Após a ordenação: " + buscaPorArtista);

        Collections.sort(lista);
        System.out.println("Ordenando por nome");
        System.out.println(lista);
        //compareTo() usado para ordernar
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano de lançamento");
        System.out.println(lista);
        //Comparator usado para ordenar por ano de lançamento para não modificar o anterior.


    }
}
