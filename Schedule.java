import java.util.List;

public class Schedule {
    private Run[][] data;
    public Schedule (List<Run> input) {
        int week = 0;
        int day = 0;
        for (int i = 0; i < input.size(); i++) {
            if (day > 7) {
                day = -1;
                week++;
            }
            day++;
            data[week][day] = input.get(i);
        }
    }

    @Override 
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
}