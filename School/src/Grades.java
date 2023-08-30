public class Grades {
    public static String calculateGradeLetter(double totalScore) {
        if (totalScore > 89) return "A";
        else if (totalScore > 79) return "B";
        else if (totalScore > 64) return "C";
        else if (totalScore > 49) return "D";
        else if (totalScore < 50) return "F";
        else return "NA";
    }
}
