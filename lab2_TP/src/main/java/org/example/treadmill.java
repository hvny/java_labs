package org.example;

public enum treadmill implements obstacles{

    LongDistance("Длинная дистанция", 2000), MediumDistance("Средняя дистанция", 500),
    ShortDistance("Короткая дистанция", 100);

    private String title;
    private int distance;

    treadmill(String title, int distance) {
        this.title = title;
        this.distance = distance;
    }

    public boolean contest(contestant Contestant){
        return Contestant.run(distance);
    }
}
