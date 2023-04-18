import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {


    public static void main(String[] args){

        new Print().test();

        ArrayList<Balls> balls = new ArrayList<>();
        ArrayList<Rackets> rackets = new ArrayList<>();

        ArrayList<Integer> replacement = new ArrayList();
        ArrayList<Integer> needsAir = new ArrayList<>();
        ArrayList<Integer> newPadding = new ArrayList<>();

        try (Scanner scanner = new Scanner(Paths.get("equipment.txt"))) {

                while (scanner.hasNextLine()) {

                    String typeOfEquipment = scanner.nextLine();
                    int id = Integer.valueOf(scanner.nextLine());
                    String locker = scanner.nextLine();
                    boolean change = Boolean.valueOf(scanner.nextLine());

                    if (typeOfEquipment.equals("Ball")) {
                        String type = scanner.nextLine();
                        boolean air = Boolean.valueOf(scanner.nextLine());
                        balls.add(new Balls(typeOfEquipment, id, locker, change, type, air));
                        if (air=true){
                            needsAir.add(id);
                        }
                    }else {
                        boolean rubberChange = Boolean.valueOf(scanner.nextLine());
                        rackets.add(new Rackets(typeOfEquipment, id, locker, change, rubberChange));
                        if (rubberChange=true){
                            newPadding.add(id);
                        }
                    }
                    if (change=true){
                        replacement.add(id);
                    }




                }
            }catch(Exception e){
                System.out.println("Reading the file failed");
            }
            for (Balls addBalls : balls) {
                System.out.println(addBalls.getString());
            }
            for (Rackets addRackets : rackets){
                System.out.println(addRackets.getString());
            }


            System.out.println("These balls need replacing: ");
            for (Integer replace : replacement){
                System.out.println(replace);
            }

            System.out.println("These balls need air: ");
            for (Integer ballsThatNeedAir : needsAir){
                System.out.println(ballsThatNeedAir);
            }

            System.out.println("These rackets need new padding: ");
            for (Integer racketChange: newPadding){
                System.out.println(racketChange);
            }

    }

    }
