public class WaterIntakeTracker {
    public WaterIntakeTracker() {
    }

    public static void main(String[] args) {
        int[] waterIntake = {3, 1, 4, 2, 0, 5, 2};
        int i = 0;
        int TotalGlasses = 0;
        while (i < 7) {
            if (waterIntake[i] > 1) {
                TotalGlasses = TotalGlasses + waterIntake[i];
            }
            i++;
        }
        System.out.println(" Total glasses of water a week: " + TotalGlasses);
    }
}
