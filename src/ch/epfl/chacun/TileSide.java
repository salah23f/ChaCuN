package ch.epfl.chacun;

import com.sun.source.tree.Tree;

import java.util.List;

public sealed interface TileSide{
       List<Zone> zones();

     boolean isSameKindAs(TileSide that);
    record Forest(Zone.Forest forest) implements TileSide{

        @Override
        public List<Zone> zones() {
            return List.of(forest);
        }

        @Override
        public boolean isSameKindAs(TileSide that) {
            return that instanceof Forest;
        }
    }
    record Meadow(Zone.Meadow meadow) implements TileSide{
        @Override
        public List<Zone> zones() {
            return List.of(meadow);
        }

        @Override
        public boolean isSameKindAs(TileSide that) {
            return that instanceof Meadow;
        }
    }
    record River(Zone.Meadow meadow1,Zone.River river,Zone.Meadow meadow2) implements TileSide{

        @Override
        public List<Zone> zones() {
                return List.of(meadow1,river,meadow2);
        }

        @Override
        public boolean isSameKindAs(TileSide that) {
            return that instanceof River;
        }
    }


}
