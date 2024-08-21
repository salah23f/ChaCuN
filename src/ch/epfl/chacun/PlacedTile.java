package ch.epfl.chacun;

import java.util.Objects;
import java.util.Set;

public record PlacedTile(Tile tile, PlayerColor placer, Rotation rotation, Pos pos, Occupant occupant) {
    public PlacedTile {
        Objects.requireNonNull(tile,"tuile non null");
        Objects.requireNonNull(rotation,"rotation non null");
        Objects.requireNonNull(pos,"position non  null");
    }
    public PlacedTile(Tile tile, PlayerColor placer, Rotation rotation, Pos pos){
        this(tile,placer,rotation,pos,null); // je veux bien comprendre l'utilite de this et that
    }
    public int id(){
        return tile.id();
    }
    public Tile.Kind kind(){
        return tile.kind();
    }
    public TileSide side(Direction direction){
        return tile.n(); // je pense quil faudrait utilise un switch case pur les differents casmais je ne sais pas comment
    }
    public Zone zoneWithId(int id){return null;}
    public Zone specialPowerZone(){return null;}
    public Set<Zone.Forest> forestZones(){return null;}
    public Set<Zone.Meadow> meadowZones(){return null;}
    public Set<Zone.River> riverZones(){return null;}
    public Set<Occupant> potentialOccupants(){return null;}
    public PlacedTile withOccupant(Occupant occupant){return null;}
    public PlacedTile withNoOccupant(){return null;}
    public int idOfZoneOccupiedBy(Occupant.Kind occupantKind){return 0;}


}
