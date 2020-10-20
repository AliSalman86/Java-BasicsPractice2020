class studentsAveragesCalc {
  public static void main(String[] args) {
    String [] studentsNames = {"Gale", "Tim", "Sandra", "Sam", "Eric"};
    String [] subjects = {"Maths", "English", "Biology", "Arts"};
    int [][] grades = {{87, 93, 82, 90}, {93, 70, 75, 75}, {99, 98, 95, 99}, {75, 90, 80, 85}, {60, 75, 66, 70}};
    int [] results = studentsAverage(studentsNames, subjects, grades);
    for(int x = 0; x < subjects.length; x++) {
      System.out.println(studentsNames[x] + " scores avergae is: " + results[x]);
    }
  }
  /**
  * studentsAverage is a function that calculates scores average for each student
  * in the studentsNames array.
  * @param names is an array of students names
  * @param subs is an array of subjects that students graded for
  * @param grades is a 2D array of students grades
  * @return an array of the average of each student.
  */
  public static int[] studentsAverage(String [] names, String [] subs, int [][] grades) {
    int [] studentsAverages = new int [10];
    for(int i = 0; i < names.length; i++) {
      int sum = 0;
      for(int j = 0; j < subs.length; j++) {
        sum += grades[i][j];
      }
      studentsAverages[i] = sum/subs.length;
    }
    return studentsAverages;
  }
}