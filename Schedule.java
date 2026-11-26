import java.util.List;

public class Schedule {
    private Run[][] data = new Run[16][7];
    public Schedule (List<Run> input) {
        int week = 0;
        int day = 0;
        for (int i = 0; i < input.size(); i++) {
            if (day > 6) {
                day = 0;
                week++;
            }
            data[week][day] = input.get(i);
            day++;
        }
    }

    public String toString() {
        String result = "";
        for (int week = 0; week < data.length; week++) {
            result += "| ";
            for (int day = 0; day < data[0].length; day++) {
                result += data[week][day] + " |";
            }
            result += "\n";
        }
        return result;
    }

    public double getMilageForWeek(int week) {
        Run[] currWeek = data[week];
        double sum = 0;
        for (Run x: currWeek) {
            sum += x.getMilage();
        }

        return sum;
    }
}