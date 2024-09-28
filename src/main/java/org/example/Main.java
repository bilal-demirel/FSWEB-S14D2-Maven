package org.example;

import org.example.model.*;

public class Main {
    public static void main(String[] args) {
        Wall wall1 = new Wall("south");
        Wall wall2 = new Wall("north");
        Wall wall3 = new Wall("east");
        Wall wall4 = new Wall("west");
        Ceiling ceiling = new Ceiling(3, PaintColor.RED);
        Bed bed = new Bed("Big", 2, 2, 3, 3);
        Lamp lamp = new Lamp(LampType.NORMAL,true, 5);
        Wardrobe wardrobe = new Wardrobe(2,2,3);
        Carpet carpet = new Carpet(2,2, PaintColor.GREEN);
        Bedroom bedroom = new Bedroom(
                "My Bedroom", wall1, wall2, wall3, wall4, ceiling, bed, lamp, wardrobe, carpet
                );
        System.out.println(bedroom.getBed().getPillows());
    }
}