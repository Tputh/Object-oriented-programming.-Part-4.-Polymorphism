package Driver;

public abstract class Driver {
    private String fio;
    private boolean driversLicense;
    private int experience;

    public Driver(String fio, boolean driversLicense, int experience) {
        this.fio = fio;
        this.driversLicense = driversLicense;
        this.experience = experience;
    }

    public String getFio() {
        return fio;
    }
    public void setFio(String fio) {
        this.fio = fio;
    }

    public boolean isDriversLicense() {
        return driversLicense;
    }
    public void setDriversLicense(boolean driversLicense) {
        this.driversLicense = driversLicense;
    }

    public int getExperience() {
        return experience;
    }
    public void setExperience(int experience) {
        this.experience = experience;
    }

    public abstract void startMoving();

    public abstract void stop();

    public abstract void refuelTheCar();


}
