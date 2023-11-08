package L11ExamPrep01.P03VetClinic.vetClinic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Clinic {
    private List<Pet> data;
    private int capacity;

    public Clinic(int capacity) {
        this.data = new ArrayList<>();
        this.capacity = capacity;
    }

    public void add(Pet pet){
        if (haveRoomForNewPet()){
            data.add(pet);
        }
    }

    public boolean remove (String name){
        return data.removeIf(pet -> pet.getName().equals(name));
    }

    public Pet getPet (String name, String owner){
        for (Pet pet : data) {
            if (pet.getName().equals(name) && pet.getOwner().equals(owner)){
                return pet;
            }
        }
        return null;
    }

    public Pet getOldestPet(){
        return Collections.max(data, Comparator.comparingInt(Pet::getAge));

    }

    public int getCount(){
        return data.size();
    }

    private boolean haveRoomForNewPet() {
        return data.size() + 1 <= capacity;
    }

    public String getStatistics(){
//        o	"The clinic has the following patients:
//        {name} {owner}
//        {name} {owner}

        StringBuilder sb = new StringBuilder();

        sb.append(String.format("The clinic has the following patients:%n"));
        for (Pet pet : data) {
            sb.append(String.format("%s %s%n", pet.getName(), pet.getOwner()));
        }

        return sb.toString();

    }


}
