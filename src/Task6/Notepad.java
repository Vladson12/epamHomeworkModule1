package Task6;

import java.util.Arrays;

public class Notepad {
    Note[] notes;
    int index = 0;

    public Notepad(int size) {
        notes = new Note[size];
    }

    public void add(Note note) {
        if (index == notes.length) {
            Note[] temp = notes;
            notes = new Note[temp.length * 2];
            System.arraycopy(temp, 0, notes, 0, temp.length);
        }
        notes[index++] = note;
    }

    public void remove(int key) {
        for (int i = key; i < index - 1; i++) {
            notes[i] = notes[i + 1];
        }
        index--;
    }

    public void edit(int key, String str) {
        notes[key].setText(str);
    }

    public void print() {
        for (int i = 0; i < index; i++) {
            System.out.println("Note " + i + ": " + notes[i]);
        }
    }

    public static void main(String[] args) {
        Notepad notepad = new Notepad(10);
        notepad.add(new Note("I want to break free"));
        notepad.add(new Note("Grab your Glocks when you see Tupac"));
        notepad.add(new Note("You're simply the best"));
        notepad.add(new Note("I did it my way"));
        notepad.print();
        notepad.remove(2);
        System.out.println("");
        notepad.print();
    }



}
