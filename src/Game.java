class Game extends Player{
      private int Score = 0;

      Game(String Name, int Age, String Team){
            super(Name, Age, Team);
      }

      public void getScore(){
            System.out.println(Score);
      }

      public void goal(){
            Score++;
      }
}
