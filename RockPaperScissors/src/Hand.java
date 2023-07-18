public enum Hand {
    ROCK,
    PAPER,
    SCISSORS;


    public static String showHand() {
        String result = " ";

        for (Hand play : Hand.values()) {
          result += play;
        }
        return result;
    }
}


