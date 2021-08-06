package experiment7.iterate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Clazz implements MyCollection {

    private List<Student> students;

    @Override
    public void setArray(List<Student> array) {
        this.students =  array;
    }

    @Override
    public List<Student> getArray() {
        return students;
    }

    @Override
    public Iterate createIterate() {
        return new ConcreteIterate(this);
    }
}

interface MyCollection {
    public void setArray(List<Student> array);

    public List<Student> getArray();

    public Iterate createIterate();
}

interface Iterate {
    public void first();

    public void last();

    public void next();

    public void previous();

    public boolean isLast();

    public boolean isFirst();

    public Object getItem();
}

class ConcreteIterate implements Iterate {

    private List<Student> objects;
    private int index = 0;

    public ConcreteIterate(Clazz clazz) {
        this.objects = clazz.getArray();


    }

    @Override
    public void first() {
        index = 0;
    }

    @Override
    public void last() {
        index = objects.size() - 1;
    }

    @Override
    public void next() {
        if (index < objects.size())
            index++;
    }

    @Override
    public void previous() {
        if (index>0){
            index--;
        }
    }

    @Override
    public boolean isLast() {
        return index == objects.size();
    }

    @Override
    public boolean isFirst() {
        return index == 0;
    }

    @Override
    public Object getItem() {
        return objects.get(index);
    }
}

class Student implements Comparable<Student>{
    private int age;

    public Student(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void display(){
        System.out.println("我的年龄是"+age);
    }

    @Override
    public int compareTo(Student student) {
        return this.age-student.getAge();
    }
}

class Client{
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(4));
        students.add(new Student(5));
        students.add(new Student(2));
        students.add(new Student(5));
        students.add(new Student(6));
        students.add(new Student(4));
        students.add(new Student(7));
        students.add(new Student(3));
        Collections.sort(students);

        MyCollection myCollection = new Clazz();
        myCollection .setArray(students);
        Iterate iterate = myCollection.createIterate();

        while (!iterate.isLast()){
            Student student = (Student) iterate.getItem();
            student.display();
            iterate.next();
        }
    }
}
