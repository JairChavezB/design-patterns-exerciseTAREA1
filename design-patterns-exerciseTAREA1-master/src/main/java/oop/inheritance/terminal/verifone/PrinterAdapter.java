package oop.inheritance.terminal.verifone;

import oop.inheritance.terminal.Printer;
import oop.library.v240m.VerfioneV240mPrinter;

public class PrinterAdapter implements Printer {

    private final VerifoneV240mPrinter verfioneV240mPrinter = new VerfioneV240mPrinter;

    public void print(int col, String text){
        verfioneV240mPrinter.print(col,text);
    }

    public void lineFeed(){
        verfioneV240mPrinter.lineFeed();
    }
}
