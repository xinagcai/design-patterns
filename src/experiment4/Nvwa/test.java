package experiment4.Nvwa;

import experiment4.Nvwa.Nvwa;
import experiment4.Nvwa.People;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 5;
        while (i > 0) {
            System.out.println("请输入参数(w,m,或者r)");
            String kind = in.next();
            People people = Nvwa.makePeople(kind);
            try {
                people.say();
            } catch (Exception e) {
                e.printStackTrace();
            }
            i--;
        }
    }
}
