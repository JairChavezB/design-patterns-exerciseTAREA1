package oop.inheritance.terminal.verifone;

import oop.inheritance.terminal.Keyboard;
import oop.library.v240m.VerifoneV240mKeyboard;

public class KeyboardAdapter implements Keyboard {

    private final VerifoneV240mKeyboard verfioneV240mKeyboard;

    public KeyboardAdapter(){
        verfioneV240mKeyboard = new VerfoneV240mKeyboard();
    }

    public String getChar(){
        return verfioneV240mKeyboard.get();
    }
}
