package task2.problem4;

import java.util.ArrayList;

public class Shop {
    private ArrayList<Computer> computers = new ArrayList<>();

    public Shop(){}

    public void add(Computer newComputer){
        computers.add(newComputer);
    }

    public String find(String motherboard, String videoAdapter, int ram){
        for (int i = 0; i < computers.size(); i++)
        {
            if(computers.get(i).getMotherboard().equals(motherboard)
                    && computers.get(i).getCPU().equals(videoAdapter)
                    && computers.get(i).getRam() == ram)
            {
                return "Computer found: " + computers.get(i).toString();
            }
        }
        return "Computer not found";
    }

}
