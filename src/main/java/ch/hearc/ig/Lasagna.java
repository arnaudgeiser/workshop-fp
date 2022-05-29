package ch.hearc.ig;

public class Lasagna {

  public static final int expectedTime = 40;

  public static int remainingTime(int actualTime) {
    return expectedTime - actualTime;
  }

  public static int prepTime(int numLayers) {
    return numLayers * 2;
  }

  public static int totalTime(int numLayers, int actualTime) {
    return actualTime + numLayers * 2;
  }
}
