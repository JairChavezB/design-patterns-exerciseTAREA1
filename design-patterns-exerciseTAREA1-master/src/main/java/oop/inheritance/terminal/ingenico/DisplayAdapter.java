package oop.inheritance.terminal.ingenico;

import oop.inheritance.terminal.Display;
import oop.inheritance.terminal.ingenico.services.IngenicoDsiplay;

public class DisplayAdapter implements Display {

    private IngenicoDisplay ingenicoDisplay;

    public void showMessage(int x,int y, String text){
        ingenicoDisplay.showMessage(x,y,text);
    }

    public void clear(){
        ingenicoDisplay.clear();
    }
}
