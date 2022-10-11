package task2.problem5;

import java.util.ArrayList;

public class NurseryDog {
    private ArrayList<Dog> dogs = new ArrayList<>();
    public void addDog(Dog newDog){
        dogs.add(newDog);
    }

    public ArrayList<Dog> getDogs() {
        return dogs;
    }

    public static void main(String[] args) {
        NurseryDog dogNursery = new NurseryDog();

        dogNursery.addDog(new Dog("Ilya", 7));
        dogNursery.addDog(new Dog("Andrey", 4));
        dogNursery.addDog(new Dog("Maria", 1));

        for (int i = 0; i < dogNursery.getDogs().size(); i++)
        {
            System.out.println(dogNursery.getDogs().get(i).toString());
            System.out.println("-".repeat(50));
        }
    }
}
