package ch.epfl.chacun;

public record Occupant(Kind kind, int zoneId) {


    public enum Kind {

        PAWN, //qui représente un pion
        HUT; //qui représente une hutte.

    }

    public Occupant {
        if (0 > zoneId()) {
            throw new IllegalArgumentException();

        }
        if (0 > zoneId()) {
            throw new NullPointerException();
        }

    }

    public static int occupantsCount(Kind kind) {
        return switch (kind) {
            case PAWN -> 5;
            case HUT -> 3;
        };

    }

}
