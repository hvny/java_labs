package org.example;

public enum wall implements obstacles{
    HighWall("Высокая стена", 5), MediumWall("Средняя стена", 3),
    SmallWall("Низкая стена", 1);

    private String title;
    private int height;



    public boolean contest(contestant Contestant){
        return Contestant.jump(height);
    }

    wall(String title, int height) {
        this.title = title;
        this.height = height;
    }
}
