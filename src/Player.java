class Player extends Person {
      private String Team;

      Player(String Name, Integer Age, String Team) {
            super(Name, Age);
            this.Team = Team;
            
      }

      public void getTeam(){
            System.out.println(Team);
      }
}
