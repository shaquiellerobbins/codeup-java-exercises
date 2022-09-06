public class Main {
    public static void main(String[] args) {
       makeDrivingDecision(TrafficLightColor.RED);
       makeDrivingDecision(TrafficLightColor.GREEN);
       makeDrivingDecision(TrafficLightColor.YELLOW);
    }

    public static void makeDrivingDecision(TrafficLightColor... colors) {
        for (TrafficLightColor color : colors) {
            switch (color) {
                case RED -> System.out.println("Stop!");
                case GREEN -> System.out.println("Go!");
                case YELLOW -> System.out.println("Slow down!");
            }
        }
    }

}
