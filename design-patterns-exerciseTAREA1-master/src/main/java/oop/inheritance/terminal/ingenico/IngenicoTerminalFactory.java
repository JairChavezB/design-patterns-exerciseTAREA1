package oop.inheritance.terminal.ingenico;

import oop.inheritance.terminal.Printer;
import oop.inheritance.terminal.TerminalFactory;
import oop.inheritance.terminal.Keyboard;
import oop.inheritance.terminal.Display;

public class IngenicoTerminalFactory extends TerminalFactory {

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
