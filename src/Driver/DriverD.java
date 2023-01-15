package Driver;

public class DriverD extends Driver{
    public DriverD(String fio, boolean driversLicense, int experience) {
        super(fio, driversLicense, experience);
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель категории D " + getFio() + " начал движение");
    }

    @Override
    public void stop() {
        System.out.println("Водитель категории D " + getFio() + " завершил движение");
    }

    @Override
    public void refuelTheCar() {
        System.out.println("Водитель категории D " + getFio() + " заправляет авто");
    }
}
