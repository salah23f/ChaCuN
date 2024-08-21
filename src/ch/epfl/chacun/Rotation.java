package ch.epfl.chacun;

import java.util.List;

public enum Rotation {
    NONE, //qui correspond à une rotation nulle,

    RIGHT, //qui correspond à une rotation d'un quart de tour vers la droite (sens horaire),

    HALF_TURN, //qui correspond à une rotation d'un demi-tour,

    LEFT ;
    public static final List<Rotation> ALL = List.of(Rotation.values()); // pas sur je lai mis parce que java ma propose
    public static final int COUNT = ALL.size();
    public Rotation add(Rotation that){
        return ALL.get((this.ordinal()+that.ordinal())% COUNT);
        //pourquoi
    }


    public Rotation negated(){
        // RIGHT : 4 - 1 =3 => LEFT
        // LEFT : 4 - 3 = 1 => RIGHT
        // NONE : 4 - 0 = 4 != 0 => NONE
        // HALF_TURN : 4 -2 = 2 => HALF_TURN
        return ALL.get((COUNT-this.ordinal()) % COUNT);//ne sais pas comment finir
    }
    public int quarterTurnsCW(){

        return this.ordinal();
    }
    public int degreesCW(){
        return this.ordinal() * 90;

    }
}
