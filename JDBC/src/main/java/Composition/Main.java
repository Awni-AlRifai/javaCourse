package Composition;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(50,60,100);
        Resolution resolution = new Resolution(180,500);
        Case theCase = new Case("220B", "Dell","240",dimensions);
        Motherboard motherboard = new Motherboard("BJ-200","Asus",4,6,"v2.44");
        Monitor monitor = new Monitor("27inch Beast","Acer",50,resolution);
        PC pc = new PC(theCase,monitor,motherboard);
        /***
         * ?? composition first part
         * */
        // how to get a method inside the monitor
//        pc.getMonitor().drawPixelAt(5,5,"Red");
//        pc.getMotherboard().loadProgram("Window");
//        pc.getTheCase().pressPowerButton();

        /**
         * ?? Composition second part
         * ! we changed access modifieres for motherboard,monitor and case to private
         */
        System.out.println(14/10);
        HashMap<String,String> map = new HashMap<>();
          
        

    }
}
