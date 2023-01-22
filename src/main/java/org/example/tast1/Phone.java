package org.example.tast1;

public class Phone extends AbstractPhone{

    @Override
    public void faceId() {
        System.out.println("По распознаванию лица");
    }

    @Override
    public void fingerPrint() {
        System.out.println("По отпечатку пальца");
    }

    @Override
    public void pin() {
        System.out.println("С пин-кодом");
    }

    @Override
    public void start() {
        System.out.println("Без пароля");
    }
}
