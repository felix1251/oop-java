class Game extends Player{
      private Integer Score;

      Game(String Name, Integer Age, String Team){
            super(Name, Age, Team);
            this.Score = 0;
      }

      public void getScore(){
            System.out.println(Score);
      }

      public void goal(){
            Score++;
      }
}
