package org.Lesson_4;

import java.util.Scanner;

public abstract class Animals {
  protected String name;
  protected int maxRunDistance;
  protected int runDistance;
  protected int maxSwimDistance;
  protected int swimDistance;
  protected int foodEaten;
  protected int fullAmount;


  public Animals(String name, int fullAmount, int maxRunDistance, int maxSwimDistance) {
    this.name = name;
    this.fullAmount = fullAmount;
    this.maxRunDistance = maxRunDistance;
    this.maxSwimDistance = maxSwimDistance;
  }

  public void eat(int amount) {
    if (amount > 0) {
      foodEaten += amount;
      System.out.println(name + " съел " + amount);
    }
  }

  public boolean isFull() {
    return foodEaten >= fullAmount;
  }

  public void run(int distance) {
    if (distance > maxRunDistance) {
      System.out.println(
          name + "  не побжит: " + distance + " максимальная дистанция - " + maxRunDistance);
      return;
    } else
      runDistance += distance;
    System.out.println(name + " пробежал " + runDistance);
  }

  public void swim(int distance) {
    if (distance > maxSwimDistance) {
      System.out.println(
          name + "  не проплывет: " + distance + " максимальная дистанция - " + maxSwimDistance);
      return;
    } else
      swimDistance += distance;
    System.out.println(name + " проплыл " + swimDistance);
  }

  public void printResult() {
    System.out.println(
        name + " пробежал: " + runDistance + " м. Проплыл: " + swimDistance + " м. Скушал: "
            + foodEaten + " ед. Уровень сытости: " + (isFull() ? "сыт!" : "голоден :(("));
  }
}


class Dogs extends Animals {
  public Dogs(String name) {
    super(name, 30, 500, 10);
  }
}


class Cats extends Animals {
  public Cats(String name) {
    super(name, 20, 200, 0);
  }
}


class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Animals[] animals = new Animals[4];
    animals[0] = new Dogs("Бобик");
    animals[1] = new Dogs("Шарик");
    animals[2] = new Cats("Мурка");
    animals[3] = new Cats("Дурка");

    for (Animals animal : animals) {

      System.out.println("Сколько еды дать " + animal.name);
      int food = scanner.nextInt();
      animal.eat(food);

      System.out.println("Сколько пробежал " + animal.name);
      int distance = scanner.nextInt();
      animal.run(distance);

      System.out.println("Сколько проплыл " + animal.name);
      int swimDistance = scanner.nextInt();
      animal.swim(swimDistance);

    }
    System.out.println("Итоги: ");
    for (Animals animal : animals) {
      animal.printResult();
    }
    scanner.close();

  }
}
