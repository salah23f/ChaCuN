package ch.epfl.chacun;

import java.time.ZoneId;
import java.util.List;

public sealed interface Zone {
    enum SpecialPower{
        SHAMAN,
        LOGBOAT,
        HUNTING_TRAP,
        PIT_TRAP,
        WILD_FIRE,
        RAFT;
    }
    static int tileId(int zoneId){
        return zoneId/10;
    }
    static int localId(int zoneId){
        return zoneId/10;

    }
       int id();

     default int tileId(){
         return tileId(id());

     }
     default int localId(){
         return localId(id());

     }
     default SpecialPower specialPower(){
         return null;

     }
     record Forest(int id,Kind kind) implements Zone{
         public enum Kind{
             PLAIN, //une forêt vide (plain signifiant « simple » en anglais),
             WITH_MENHIR, //une forêt contenant au moins un menhir,
             WITH_MUSHROOMS //une forêt contenant un groupe de champignons.

             }
     }
     record Meadow(int id, List<Animal> animals, SpecialPower specialPower) implements Zone{
         public Meadow{
             animals = List.copyOf(animals);
         }


     }
     sealed interface  Water extends Zone{
         public abstract int fishCount();

     }
     record Lake(int id,int fishCount,SpecialPower specialPower) implements Water{
     }
    record River(int id,int fishCount,Lake lake) implements Water{
        public boolean hasLake(){
            if (lake !=null){
                return true;
            }
            return false;
        }
    }
}










