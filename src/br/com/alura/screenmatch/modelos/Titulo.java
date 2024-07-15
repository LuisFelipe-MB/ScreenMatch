package br.com.alura.screenmatch.modelos;

public class Titulo {
    private String name;
    private int releaseYear;
    private boolean includedInPlan;
    private double sumOfEvaluations; //Atalho para troca de nome "Shift + F6"
    private int totalEvaluations;
    private int durationInMinutes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public boolean isIncludedInPlan() {
        return includedInPlan;
    }

    public void setIncludedInPlan(boolean includedInPlan) {
        this.includedInPlan = includedInPlan;
    }

    public double getSumOfEvaluations() {
        return sumOfEvaluations;
    }

    public int getTotalEvaluations(){
        return totalEvaluations;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public void showDataSheet(){
        System.out.println("Nome do filme: " + this.name);
        System.out.println("Ana de lançamento: " + this.releaseYear);
    }

    public void evaluateMovie(double nota){
        this.sumOfEvaluations += nota;
        this.totalEvaluations++;
    }

    public double pegaMedia(){
        return this.sumOfEvaluations / this.totalEvaluations;
    }
}
