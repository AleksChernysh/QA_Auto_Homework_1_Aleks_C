public class TheStrongestRobot {
    public TheStrongestRobot() {
    }

    public static void main(String[] args) {
        int[] weights = {300, 450, 200, 500, 350};
        int maxWeight = 0;
        int NumberOfWeight = 0;
        for( int i  = 0; i < weights.length; i++){
            if(weights[i] > maxWeight ) {
                maxWeight= weights[i];
                NumberOfWeight = i;
            }
        }
        System.out.println(maxWeight);
        System.out.println(NumberOfWeight);
    }
}