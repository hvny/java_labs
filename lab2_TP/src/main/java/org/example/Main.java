package org.example;
import java.util.EnumSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        contestant[] contestants = new contestant[] {
            new Human("Василий", 1500, 5),
            new Human("Пётр", 3000, 2),
            new Cat("Матроскин", 1000, 3),
            new Robot("Фёдор", 3000, 10),
            new Cat("Шрёдингер", 1050, 3 )
        };

        obstacles[] obstacles = new obstacles[] {
                wall.SmallWall,
                wall.MediumWall,
                wall.HighWall,
                treadmill.ShortDistance,
                treadmill.MediumDistance,
                treadmill.LongDistance
        };

        for (contestant c : contestants){   //участники
            for (obstacles o : obstacles){   //препятствия
                if (!o.contest(c)) break;
            }
        }
    }
}