package Driver;

public class DriverB extends Driver{
    public DriverB(String fio, boolean driversLicense, int experience) {
        super(fio, driversLicense, experience);
    }

    @Override
    public void startMoving() {
     System.out.println("Водитель категории В " + getFio() + " начал движение");
    }

    @Override
    public void stop() {
        System.out.println("Водитель категории В " + getFio() + " завершил движение");
    }

    @Override
    public void refuelTheCar() {
        System.out.println("Водитель категории В " + getFio() + " заправляет авто");
    }
}
