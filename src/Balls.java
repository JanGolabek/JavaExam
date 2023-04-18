public class Balls {
    private String equipmentType;
    private int id;
    private String locker;
    private boolean change;
    private String typeOfBall;
    private boolean air;

    public Balls (String equipmentType, int id, String locker, boolean change,
                  String typeOfBall, boolean air){
        this.equipmentType = equipmentType;
        this.id = id;
        this.locker = locker;
        this.change = change;
        this.typeOfBall = typeOfBall;
        this.air = air;
    }

    public String getEquipmentType(){
        return equipmentType;
    }
    public int getId(){
        return id;
    }
    public String getLocker(){
        return locker;
    }
    public boolean isChange(){
        return change;
    }
    public String getTypeOfBall(){
        return typeOfBall;
    }
    public boolean isAir(){
        return air;
    }
    public String getString(){
        return "Equipment type: " + getEquipmentType() + " ID: " + getId() + " " + getLocker() +
                " Ball needs change? " + isChange() + " Type of ball: " + getTypeOfBall() + "Ball needs air refill? "
                + isAir();
    }
}
