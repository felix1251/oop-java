class Person {
      private int Age;
      private String Name;

      Person(String Name, int Age){
            this.Name = Name;
            this.Age = Age;
      }

      public void getAge(){
            System.out.println(Age);
      }

      public void getName(){
            System.out.println(Name);
      }
}
