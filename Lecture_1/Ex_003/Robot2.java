package Lecture_1.Ex_003;

public class Robot2 {
    /**Уровень робота */
    private int level;

    /**Имя робота */
    private String name;

    /**
     * Создание робота
     * @param name
     * @param level
     */
    public Robot2(String name, int level) {
        this.name = name;
        this.level = level;
    }

    // Методы включения\выключения подсистем

    public void powerOn() {
        this.startBIOS();
        this.startOS();
        this.sayHi();
    }

    public void powerOff() {
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
        System.out.println("Working...");
    }
}
