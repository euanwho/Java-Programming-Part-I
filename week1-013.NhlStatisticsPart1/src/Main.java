import java.util.Scanner;
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Top ten by goals");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        
        System.out.println("\nTop twenty-five by penalties");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        
        System.out.println("\nSidney Crosby's statistics");
        NHLStatistics.searchByPlayer("Crosby");
        
        System.out.println("\nPhiladelphia Flyer's statistics");
        NHLStatistics.teamStatistics("PHI");
        
        System.out.println("\nAnaheim Ducks' players");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
        
        
    }
}
