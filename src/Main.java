import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Main {
    public static void main(String[] args) {
        Filme myFilme = new Filme();
        myFilme.setName("O lobo de wall street");
        myFilme.setReleaseYear(2013);
        myFilme.setDurationInMinutes(180);
        System.out.println("Duração do filme " + myFilme.getDurationInMinutes() + " minutos");

        myFilme.showDataSheet();
        myFilme.evaluateMovie(7);
        myFilme.evaluateMovie(9);
        myFilme.evaluateMovie(5);
        System.out.println("Total de avaliações: " + myFilme.getTotalEvaluations());
        System.out.println(myFilme.pegaMedia());

        Serie lost = new Serie();
        lost.setName("Lost");
        lost.setReleaseYear(2000);
        lost.setSeasons(10);
        lost.setSeasonEpisode(10);
        lost.setMinutesEpisode(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDurationInMinutes() + " minutos");
        lost.showDataSheet();

        Filme outroFilme = new Filme();
        outroFilme.setName("Kikess");
        outroFilme.setReleaseYear(2011);
        outroFilme.setDurationInMinutes(200);
        System.out.println("Duração do filme " + outroFilme.getDurationInMinutes() + " minutos");
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(myFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println("Tempo total para assistir " + myFilme.getName() + " , " + outroFilme.getName()
                + " e " + lost.getName() + " é " + calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(myFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacao(300);
        filtro.filtra(episodio);

    }
}
