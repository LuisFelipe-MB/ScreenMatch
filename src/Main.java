public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.name = "O lobo de wall street";
        myMovie.releaseYear = 2013;
        myMovie.durationInMinutes = 180;

        myMovie.showDataSheet();
        myMovie.evaluateMovie(7);
        myMovie.evaluateMovie(9);
        myMovie.evaluateMovie(5);
        System.out.println(myMovie.sumOfEvaluations);
        System.out.println(myMovie.totalEvaluations);
        System.out.println(myMovie.averageOfEvaluations());
    }
}
