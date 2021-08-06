package experiment7.Observe;

import java.util.ArrayList;
import java.util.List;

public class Bell {
    private List<People> list = new ArrayList<>();

    public void register(People people){
        list.add(people);
    }
    public void trigger(){
        for (People people : list) {
            people.alarm();
        }
    }
}

interface People{
    public void alarm();
}
class Teacher implements People{

    @Override
    public void alarm() {
        System.out.println("我是老师我走进教师");
    }
}

class Student implements People{
    @Override
    public void alarm() {
        System.out.println("我是学生我跑进教师");
    }
}

class Test{
    public static void main(String[] args) {
        Bell bell = new Bell();
        Teacher teacher1= new Teacher();
        Teacher teacher2 = new Teacher();
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();

        bell.register(teacher1);
        bell.register(teacher2);
        bell.register(student1);
        bell.register(student2);
        bell.register(student3);
        bell.register(student4);
        bell.register(student5);

        bell.trigger();
    }
}
