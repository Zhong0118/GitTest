package Warehouse;

import java.time.LocalDate;
import java.util.*;

public class WarehouseDemo {
	public static void main(String[] args) {

        List<Item> warehouse = new ArrayList<>();
        Food food1 = new Food("Bread", 4,LocalDate.of(2023, 4, 1),false);
        Food food2 = new Food("Meat", 3,LocalDate.of(2023, 2, 1),false);
        Drink drink1 = new Drink("Coke",7,LocalDate.of(2023,5,16),true);
        Drink drink2 = new Drink("Milk", 1, LocalDate.of(2023,1,16),false);
        Weapons bomb = new Bomb("BigBang",2,false);
        Weapons gun1 = new Gun("AK47",6,5);
        Weapons gun2 = new Gun("Eagle",8,0);
        warehouse.add(food1);
        warehouse.add(food2);
        warehouse.add(drink1);
        warehouse.add(drink2);
        warehouse.add(bomb);
        warehouse.add(gun1);
        warehouse.add(gun2);

        sorting(warehouse);

//        warehouse.sort(new Comparator<Warehouse>() {
//            @Override
//            public int compare(Warehouse o1, Warehouse o2) {
//                return Integer.compare(o1.weight, o2.weight);
//            }
//        });

        for (Item w:warehouse) {
            if (w instanceof Food){
                System.out.println(w);
                ((Food) w).eat();
            } else if (w instanceof Drink) {
                System.out.println(w);
                ((Drink) w).drink();
            } else if (w instanceof Weapons) {
                System.out.println(w);
                ((Weapons) w).use();
            } 
        }
        

        System.out.println("This is testing of github");
       
    }

    public static void sorting(List<Item> warehouse){
        for (int i = 1; i < warehouse.size(); i++) {
            boolean flag = true;
            for (int j = 0; j < warehouse.size() - i; j++) {
                if (warehouse.get(j).compareTo(warehouse.get(j + 1)) > 0){
                    Item temp = warehouse.get(j);
                    warehouse.set(j,warehouse.get(j + 1));
                    warehouse.set(j+1,temp);

                    flag = false;
                }
            }
            if (flag){
                break;
            }

        }
    }
}
