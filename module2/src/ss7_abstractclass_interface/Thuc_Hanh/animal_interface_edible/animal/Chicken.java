package ss7_abstractclass_interface.Thuc_Hanh.animal_interface_edible.animal;

import ss7_abstractclass_interface.Thuc_Hanh.animal_interface_edible.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "Chicken eat";
    }
}
