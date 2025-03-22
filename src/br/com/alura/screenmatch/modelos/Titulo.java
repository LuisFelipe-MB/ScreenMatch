package br.com.alura.screenmatch.modelos;

public class Titulo implements Comparable<Titulo>{
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvalicoes; //Atalho para troca de nome "Shift + F6"
    private int totalDeAvaliacao;
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String name) {
        this.nome = name;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoLancamento(int releaseYear) {
        this.anoDeLancamento = releaseYear;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public double getSomaDasAvalicoes() {
        return somaDasAvalicoes;
    }

    public int getTotalDeAvaliacao(){
        return totalDeAvaliacao;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int durationInMinutes) {
        this.duracaoEmMinutos = durationInMinutes;
    }

    public void mostrarFichaDeDados(){
        System.out.println("Nome do filme: " + this.nome);
        System.out.println("Ana de lançamento: " + this.anoDeLancamento);
    }

    public void avaliarFilme(double nota){
        this.somaDasAvalicoes += nota;
        this.totalDeAvaliacao++;
    }

    public double pegaMedia(){
        return this.somaDasAvalicoes / this.totalDeAvaliacao;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
        //Ordenado por nome.

        //return Integer.compare(this.getAnoDeLancamento(), outroTitulo.getAnoDeLancamento());
        //Ordenado por Ano de lançamento.
    }
}
