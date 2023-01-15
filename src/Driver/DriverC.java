package Driver;

public class DriverC extends Driver{
    public DriverC(String fio, boolean driversLicense, int experience) {
        super(fio, driversLicense, experience);
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель категории C " + getFio() + " начал движение");
    }

    @Override
    public void stop() {
        System.out.println("Водитель категорииC " + getFio() + " завершил движение");
    }

    @Override
    public void refuelTheCar() {
        System.out.println("Водитель категории C " + getFio() + " заправляет авто");
    }
}
