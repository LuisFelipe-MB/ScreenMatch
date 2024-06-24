public class Movie {
    String name;
    int releaseYear;
    boolean includedInPlan;
    double sumOfEvaluations; //Atalho para troca de nome "Shift + F6"
    int totalEvaluations;
    int durationInMinutes;

    void showDataSheet(){
        System.out.println("Nome do filme: " + this.name);
        System.out.println("Ana de lançamento: " + this.releaseYear);
    }

    void evaluateMovie(double nota){
        this.sumOfEvaluations += nota;
        this.totalEvaluations++;
    }

    double averageOfEvaluations(){
        return this.sumOfEvaluations / this.totalEvaluations;
    }

}
