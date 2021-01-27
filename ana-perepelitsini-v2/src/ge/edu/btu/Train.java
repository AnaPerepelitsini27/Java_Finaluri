package ge.edu.btu;

import java.util.List;

public class Train {
    public String addPassanger(Passanger passanger){
        if(passanger.haveTicket()==true)
            return "Added to the train";
        else
            return "Refused from adding to the train";
    }

    List<Passanger> passangerList;
    public List<Passanger> getPassengerList() {
        for(int i=0;i<3;i++){
            Passanger passanger=new Passanger(passangerList.get(i));
            passangerList.add(passanger);
        }
        return passangerList;
    }


}
