package experiment4.Nvwa;



public class Nvwa {
    public static People makePeople(String kind){
     People people = null;
     kind = kind.toLowerCase();
     switch (kind){
         case "m":people = new Man();break;
         case "w":people = new Woman();break;
         //添加robot
         case "r":people = new Robot();break;
     }
     return people;
    }
}
