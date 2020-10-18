public class pyramidBlocksCounter {
  public static void main(String[] args) {
    int results = blocksCounter(3);
    System.out.println(results);
  }
  public static int blocksCounter(int levels) {
    int blocksCount = 0;
    for (int i = 1; i <= levels; i++) {
      blocksCount = blocksCount + (i*i); 
    }
    return blocksCount;
  }
}