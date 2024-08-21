package ch.epfl.chacun;

import java.util.List;

public enum Direction {
    N,// qui correspond au nord
    E, //qui correspond à l'est
    S, //qui correspond au sud
    W;
    public static final List<Direction> ALL = List.of(Direction.values());
    public static final int COUNT = ALL.size();
    public Direction rotated(Rotation rotation){
        return ALL.get(this.ordinal() +this.ordinal()% COUNT);
    }
    public Direction opposite(){
        return rotated(Rotation.HALF_TURN); // pas sur de ca
    }

}
