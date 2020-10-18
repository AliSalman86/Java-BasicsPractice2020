class ArraysPractice {
  public static void main(String [] args) {
    String agencyRep = reporterPicker();
    double [] tempsArray = {15.3, 22.1, 25.7, 18.5};
    double tempAverage = calcTempAverage(tempsArray);
    System.out.println(tempAverage);
    System.out.println(agencyRep);
  }
  public static double calcTempAverage(double [] temps) {
    int arrSize = temps.length;
    double total = 0;
    for (int i = 0; i < arrSize; i++) {
      total = total + temps[i];
    }
    return (total/arrSize);
  }
  public static String reporterPicker() {
    String [] reportersArray = {"AP", "BBC", "CNN", "Fox", "CNBC", "npr", "CBS", "SKY", "ABC", "WP"};
    int luckyNumb = (int)(Math.random()*10);
    String reporter = reportersArray[luckyNumb];
    return reporter;
  }
}