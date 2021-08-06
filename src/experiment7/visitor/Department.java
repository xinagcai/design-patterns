package experiment7.visitor;

import java.util.ArrayList;
import java.util.List;

public abstract class Department {
    public abstract void visit(FulltimeEmployee employee);

    public abstract void visit(ParttimeEmployee employee);

}

class FADepartment extends Department {
    @Override
    public void visit(FulltimeEmployee employee) {
        int workTime = employee.getWorkTime();
        double weekSlary = employee.getWeekSalary();
        String name = employee.getName();
        if (workTime > 40)
            weekSlary = weekSlary + (workTime - 40) * 100;
        else {
            weekSlary = weekSlary - (40 - workTime) * 80;
            if (weekSlary < 0) {
                weekSlary = 0;
            }
        }

        System.out.println("正式员工：" + name + "实际工资为：" + weekSlary);

    }

    @Override
    public void visit(ParttimeEmployee employee) {
        int workTime = employee.getWorkTime();
        double hourSlary = employee.getHourSalary();
        String name = employee.getName();
        System.out.println("临时员工：" + name + "实际工资为：" + (workTime * hourSlary));

    }
}


class HRDepartment extends Department {
    @Override
    public void visit(FulltimeEmployee employee) {
        int workTime = employee.getWorkTime();
        String name = employee.getName();
        System.out.println("正式员工：" + name + "实际工作时间：" + workTime);
        if (workTime > 40)
            System.out.println("正式员工：" + name + "加班时间：" + (workTime - 40));
        else {
            System.out.println("正式员工：" + name + "请假时间：" + (40 - workTime));
        }
    }

    @Override
    public void visit(ParttimeEmployee employee) {
        int workTime = employee.getWorkTime();
        String name = employee.getName();
        System.out.println("临时员工：" + name + "实际工作时间：" + workTime);
    }
}

interface Employee {
    public void accept(Department handler);
}

class FulltimeEmployee implements Employee {
    private String name;
    private double weekSalary;
    private int workTime;

    public FulltimeEmployee(String name, double weekSalary, int workTime) {
        this.name = name;
        this.weekSalary = weekSalary;
        this.workTime = workTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeekSalary() {
        return weekSalary;
    }

    public void setWeekSalary(double weekSalary) {
        this.weekSalary = weekSalary;
    }

    public int getWorkTime() {
        return workTime;
    }

    public void setWorkTime(int workTime) {
        this.workTime = workTime;
    }

    @Override
    public void accept(Department handler) {
        handler.visit(this);
    }
}

class ParttimeEmployee implements Employee {
    private String name;
    private double hourSalary;
    private int workTime;

    public ParttimeEmployee(String name, double hourSalary, int workTime) {
        this.name = name;
        this.hourSalary = hourSalary;
        this.workTime = workTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHourSalary() {
        return hourSalary;
    }

    public void setHourSalary(double hourSalary) {
        this.hourSalary = hourSalary;
    }

    public int getWorkTime() {
        return workTime;
    }

    public void setWorkTime(int workTime) {
        this.workTime = workTime;
    }

    @Override
    public void accept(Department handler) {
        handler.visit(this);
    }
}

class EmployList {
    private List<Employee> list = new ArrayList();

    public void addList(Employee employee) {
        list.add(employee);
    }

    public void accept(Department handler) {
        for (Employee employee : list) {
            employee.accept(handler);
        }
    }
}

class Client{
    public static void main(String[] args) {
        EmployList list = new EmployList();
        Employee employee1 = new FulltimeEmployee("张三",400,43);
        Employee employee2 = new FulltimeEmployee("李四",450,40);
        Employee employee3 = new ParttimeEmployee("Lily",20,30);
        Employee employee4 = new FulltimeEmployee("Mark",430,35);
        Employee employee5 = new ParttimeEmployee("Jack",30,20);

        list.addList(employee1);
        list.addList(employee2);
        list.addList(employee3);
        list.addList(employee4);
        list.addList(employee5);

        FADepartment faDepartment = new FADepartment();
        HRDepartment hrDepartment = new HRDepartment();
        System.out.println("------财务部处理数据---------");
        list.accept(faDepartment);
        System.out.println("------人力资源部处理数据-------");
        list.accept(hrDepartment);
    }
}
