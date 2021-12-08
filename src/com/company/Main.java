package com.company;

public class Main {

    public static void main(String[] args) {
        //wyswietla okno, w ktorym przycisk "ucieka" przed myszka,
        //dopoki nie znajdzie sie w czerwonej strefie, wtedy po kliknieciu
        //strefa zmienia sie na kolor zielony
        new MyFrame();
        //po wcisnieciu przysiku "k" w miejscu w ktorym znajduje sie myszka
        //pojawia sie kwadrat, a po wcisnieciu "o" - kolo
        new Kanwa();
    }
}
