package io;

public class TestIO {
    public static void main(String[] args) throws Exception {

        boolean weiter;

        do {

            System.out.print("Geben sie ein String ein: ");
            System.out.println(IO.readString());

            System.out.print("Geben sie ein Integer ein: ");
            System.out.println(IO.readInteger());

            System.out.print("Geben sie ein double ein: ");
            System.out.println(IO.readDouble());

            System.out.print("Soll das Programm wiederholt werden? ");
            weiter = IO.readBoolean();
        } while (weiter == true);
    }
}