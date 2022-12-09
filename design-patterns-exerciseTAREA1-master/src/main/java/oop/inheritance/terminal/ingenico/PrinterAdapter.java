package oop.inheritance.terminal.ingenico;

import oop.inheritance.terminal.Printer;
import oop.library.services.IngenicoPrinter;

public class PrinterAdapter implements Printer {

    private final IngenicoPrinter ingenicoPrinter = new IngenicoPrinter();

    public void print(int col, String text){
        ingenicoPrinter.print(col,text);
    }

    public void lineFeed(){
        ingenicoPrinter.lineFeed();
    }
}
