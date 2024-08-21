package ch.epfl.chacun;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

public record Tile(int id, Kind kind, TileSide n, TileSide e, TileSide s, TileSide w){
    public enum Kind{
        START, //qui identifie l'unique tuile de départ,
        NORMAL, //qui identifie les tuiles normales,
        MENHIR //qui identifie les tuiles menhir.
    }
    public List<TileSide> sides(){
        return List.of(n,e,s,w);
    }
    public Set<Zone> sideZones(){
        Set<Zone> sideZone = new HashSet<>();
        //ne suis pas sur et ne sais pas commet terminer
        return sideZone;

    }
    public Set<Zone> zones(){
        Set<Zone> zones = new HashSet<>();
        return zones;

    }


}

