package Lecture_1.Ex_003;

public class Programm {
    public static void main(String[] args) {
        // #region Robot1 demo
        //Lecture_1.Ex_003.Robot1;
        Robot3 robot3 = new Robot3("name_3");

        System.out.printf("%s %d\n", robot3.getName(), robot2.getLevel());
        robot3.powerOn();
        robot2.work();
        robot2.work();
        robot2.work();
        robot2.powerOff();

      
    }
}
