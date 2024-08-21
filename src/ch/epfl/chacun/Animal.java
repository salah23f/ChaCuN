package ch.epfl.chacun;

public record Animal(int id ,Kind kind) {
    public enum Kind{
        MAMMOTH,// qui représente un mammouth,
        AUROCHS, //qui représente un auroch,
        DEER, //qui représente un cerf,
        TIGER //qui représente un smilodon
    }
    public int tileId(){
        return tileId(); // pas sur du tout de ca je lai mis parce que cest ce qi ma paru le plus logique

    }

}
