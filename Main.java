class Main {
  public static void main(String[] args) {
    int yahtzeeCount = yahtzeeRolling();
    System.out.println("No. f rolls to Yahtzee is: " + yahtzeeCount);
  }
  public static int rollDice(int min, int max) {
    int randNumGen = (int)(min + (Math.random() * ((max-min)+1)));
    return randNumGen;
  }
  public static int yahtzeeRolling() {
    int dice1 = rollDice(1,8);
    int dice2 = rollDice(1,8);
    int dice3 = rollDice(1,8);
    int dice4 = rollDice(1,8);
    int dice5 = rollDice(1,8);
    int count = 1;
    while (!(dice1==dice2 && dice2==dice3 && dice3==dice4 && dice4==dice5)) {
      dice1 = rollDice(1,8);
      dice2 = rollDice(1,8);
      dice3 = rollDice(1,8);
      dice4 = rollDice(1,8);
      dice5 = rollDice(1,8);
      count += 1;
    }
  return count;
  }
}