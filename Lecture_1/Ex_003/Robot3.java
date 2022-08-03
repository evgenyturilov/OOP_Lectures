package Lecture_1.Ex_003;

import java.util.ArrayList;

public class Robot3 {

    enum State {
        On, Off
    }

    private static int defaultIndex;
    private static ArrayList<String> names;

    static {
        defaultIndex = 1;
        names = new ArrayList<String>();
    }
    /**Уровень робота */
    private int level;

    /**Имя робота */
    private String name;

    private State state;

    /**
     * Создание робота
     * @param name
     * @param level
     */
    private Robot3(String name, int level) {
        if ((name.isEmpty()
            || Character.isDigit(name.charAt(0)))
            || Robot3.names.indexOf(name) != -1)
        {
            this.name = String.format("DefaultName_%d", defaultIndex++);
        } else {
            this.name = name;
        }

        Robot3.names.add(this.name);
        this.level = level;
        this.state = State.On;
    }


    // Методы включения\выключения подсистем

    public void power() {
        if (this.state == State.Off) {
            this.powerOn();
            this.state = State.On;
        } else {
            this.powerOff();
            this.state = State.Off;
        }
        System.out.println();
    }

    private void powerOn() {
        this.startBIOS();
        this.startOS();
        this.sayHi();
    }

    private void powerOff() {
        this.sayBye();
        this.stopOS();
        this.stopBIOS();
    }

    public int getLevel() {
        return this.level;
    }

    public String getName() {
        return this.name;
    }

    /**Загрузка BIOS */
    private void startBIOS() {
        System.out.println("Start BIOS...");
    }
    /**Загрузка OS */
    private void startOS() {
        System.out.println("Start OS...");
    }
    /**Приветствие */
    private void sayHi() {
        System.out.println("Hello word...");
    }
    //**Выгрузка BIOS */
    private void stopBIOS() {
        System.out.println("Stop BIOS...");
    }
    /**Выгрузка OS */
    private void stopOS() {
        System.out.println("Stop OS...");
    }
    /**Прощание */
    private void sayBye() {
        System.out.println("Bye...");
    }
    /**Работа */
    private void work() {
        if (this.state == State.On) {
            System.out.println("Working...");
    }
}

@Override
public String toString() {
    return String.format("%s %d\n", this.name, this.level);
}

}