package ge.edu.btu;

public class StationSquare {
    public static void main(String[] args) {
        Passanger gio=new Passanger("Gio",true);
        Passanger nika=new Passanger("Nika",false);
        Passanger ana=new Passanger("Ana",true);

        Train train=new Train();

        String passanger1=train.addPassanger(gio);
        String passanger2=train.addPassanger(nika);
        String passanger3=train.addPassanger(ana);

        System.out.println(passanger1+"\n"+passanger2+"\n"+passanger3);
    }
}