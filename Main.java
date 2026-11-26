import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Run> runs = new ArrayList<>();

        runs.add(new Run(12.07, "Base", 4));
        runs.add(new Run(12.08, "Recovery", 3));
        runs.add(new Run(12.09, "Recovery", 3));
        runs.add(new Run(12.10, "Base", 5));
        runs.add(new Run(12.11, "Recovery", 4));
        runs.add(new Run(12.12, "Long Run", 6.5));
        runs.add(new Run(12.13, "Full Rest", 0));

        runs.add(new Run(12.14, "Workout", 6));
        runs.add(new Run(12.15, "Recovery", 5));
        runs.add(new Run(12.17, "Recovery", 4));
        runs.add(new Run(12.18, "Workout", 6));
        runs.add(new Run(12.19, "Recovery", 4));
        runs.add(new Run(12.20, "Long", 8));
        runs.add(new Run(12.21, "Full Rest", 0));

        //Safe milage 40mpw
        runs.add(new Run(12.14, "Workout", 7));
        runs.add(new Run(12.15, "Recovery", 6.5));
        runs.add(new Run(12.17, "Recovery", 5));
        runs.add(new Run(12.18, "Workout", 7));
        runs.add(new Run(12.19, "Recovery", 5.5));
        runs.add(new Run(12.20, "Long", 9));
        runs.add(new Run(12.21, "Full Rest", 0));

        //Down week
        runs.add(new Run(12.14, "Recovery", 5));
        runs.add(new Run(12.15, "Workout", 7));
        runs.add(new Run(12.17, "Recovery", 6));
        runs.add(new Run(12.18, "Recovery + Spice", 6));
        runs.add(new Run(12.19, "Recovery", 6));
        runs.add(new Run(12.20, "Long", 10.5));
        runs.add(new Run(12.21, "Full Rest", 0));

        runs.add(new Run(12.14, "Workout", 8));
        runs.add(new Run(12.15, "Recovery", 6));
        runs.add(new Run(12.17, "Recovery", 5));
        runs.add(new Run(12.18, "Workout", 7));
        runs.add(new Run(12.19, "Recovery", 6));
        runs.add(new Run(12.20, "Long", 10));
        runs.add(new Run(12.21, "Full Rest", 0));

        runs.add(new Run(12.14, "VO2 MAX", 8));
        runs.add(new Run(12.15, "Recovery", 7));
        runs.add(new Run(12.17, "Recovery", 6));
        runs.add(new Run(12.18, "Workout", 8));
        runs.add(new Run(12.19, "Recovery", 6));
        runs.add(new DoubleRun(12.20, "Long", 11, "Recovery", 4));
        runs.add(new Run(12.21, "Full Rest", 0));

        runs.add(new Run(12.14, "Recovery", 7));
        runs.add(new Run(12.15, "Workout", 8));
        runs.add(new Run(12.17, "Recovery", 7));
        runs.add(new Run(12.18, "Recovery + Spice", 8.5));
        runs.add(new Run(12.19, "Recovery", 7));
        runs.add(new Run(12.20, "Long", 10.5));
        runs.add(new Run(12.21, "Full Rest", 0));
        

        Schedule test = new Schedule(runs);
        System.out.println(test);

        for (int i = 0; i < 100; i++) {
            System.out.println("Week "+ (i + 1) +" milage: " + test.getMilageForWeek(i));
        }
    }
}
