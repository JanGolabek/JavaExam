
public class Rackets {
    private String equipmentType;
    private int id;
    private String locker;
    private boolean racketChange;
    private boolean rubberChange;


    public Rackets (String equipmentType, int id, String locker,
                    boolean racketChange, boolean rubberChange){
        this.equipmentType = equipmentType;
        this.id = id;
        this.locker = locker;
        this.racketChange = racketChange;
        this.rubberChange = rubberChange;

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
    public boolean isRacketChange(){
        return racketChange;
    }
    public boolean isRubberChange(){
        return rubberChange;
    }
    public String getString(){
        return "Equipment type: " + getEquipmentType() + " ID: " + getId() + " " + getLocker() +
                " Racket needs change? " + isRacketChange() + " Racket needs rubber change? "
                + isRubberChange();
    }

}
