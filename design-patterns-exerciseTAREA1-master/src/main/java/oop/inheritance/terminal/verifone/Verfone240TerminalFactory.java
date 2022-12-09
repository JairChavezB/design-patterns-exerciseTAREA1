package oop.inheritance.terminal.verifone;

import oop.inheritance.terminal.Keyboard;
import oop.inheritance.terminal.Display;
import oop.inheritance.terminal.Printer;
import oop.inheritance.terminal.TerminalFactory;

public class Verfone240TerminalFactory extends TerminalFactory {

    public Display getDisplay(){
        return new DisplayAdapter();
    }

    public Keyboard getKeyboard(){
        return new KeyboardAdapter();
    }

    public Printer getPrinter(){
        return new PrinterAdapter();
    }


}
