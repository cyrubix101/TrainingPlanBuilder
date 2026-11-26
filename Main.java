import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Run> runs = new ArrayList<>();

        runs.add(new Run(12.07, "Base", 4));
        runs.add(new Run(12.08, "Base", 4));
        runs.add(new Run(12.09, "Base", 4));
        runs.add(new Run(12.10, "Base", 4));
        runs.add(new Run(12.11, "Base", 4));
        runs.add(new Run(12.12, "Base", 4));
        runs.add(new Run(12.13, "Base", 4));

        Schedule test = new Schedule(runs);
        System.out.println(test);
    }
}
