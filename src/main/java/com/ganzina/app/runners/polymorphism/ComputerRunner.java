package com.ganzina.app.runners.polymorphism;

import com.ganzina.app.classwork.polymorphism.*;

/**
 * Created by Ievgeniia on 5/4/2017.
 */
public class ComputerRunner {
    public static void main(String[] args) {
//        IBM ibm = new IBM();
//        ibm.changeRAM();
        Computer ibmComputer = new IBM();
        Computer hpComputer = new HP();
        Computer acerComputer = new Acer();
        Computer macComputer = new Mac();
        Computer dellComputer=new Dell();
        Computer lenovoComputer = new Lenovo();
//        changeRamForComputers(ibmComputer);
//        changeRamForComputers(hpComputer);
//        changeRamForComputers(acerComputer);
//        changeRamForComputers(macComputer);


        Computer [] computers = new Computer[6];
        computers[0]=ibmComputer;
        computers[1]=hpComputer;
        computers[2]=acerComputer;
        computers[3]=macComputer;
        computers[4]=dellComputer;
        computers[5]=lenovoComputer;

        changeRamForComputersArray(computers);

    }

    public static void changeRamForComputers(Computer computer){
        computer.changeRAM();
        computer.changeToSSD();
        computer.changeCPU();


    }

    public static void changeRamForComputersArray(Computer[] computers){
        for (Computer arrayPos:computers) {
            changeRamForComputers(arrayPos);

        }


    }
}
