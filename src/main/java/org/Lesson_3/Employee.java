package org.Lesson_3;


public class Employee {
  String fullname;
  String position;
  String email;
  int phone;
  int salary;
  int age;

  public Employee(String fullname, String position, String email, int phone, int salary, int age) {
    this.fullname = fullname;
    this.position = position;
    this.email = email;
    this.phone = phone;
    this.salary = salary;
    this.age = age;
  }

  public void info() {
    System.out.println("fullname: " + fullname+" " + "должность: " + position+" " + "email: " + email+" "
        + "телефон: " + phone+" " + "зарплата: " + salary+" " + "возраст: " + age+" ");
  }

  public static void main(String[] args) {
    Employee[] persArray = new Employee[5];
    persArray[0] = new Employee("Iva Iva Iva", "pos1", "djdj@hfh.ru", 8999, 100, 20);
    persArray[1] = new Employee("Asa Asa Asa", "ass", "nguen@hihi.hi", 89898, 200, 45);
    persArray[2] = new Employee("Ere Ere Ere", "ere", "guik@kgk.hi", 8965, 300, 30);
    persArray[3] = new Employee("Bab Bab Bab", "bab", "bab@yt.yu", 78965, 1000, 80);
    persArray[4] = new Employee("Yty Yty Yty", "tyt", "jjkg@ty.tr", 752, 2000, 35);

    for (Employee emp : persArray) {
      if (emp != null && emp.age>40)
        emp.info();
    }

  }
}
