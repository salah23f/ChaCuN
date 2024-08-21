package ch.epfl.chacun;

import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public final record TileDecks(List<Tile> startTiles, List<Tile> normalTiles, List<Tile> menhirTiles) {
    public TileDecks {
        startTiles = List.copyOf(startTiles);
        normalTiles = List.copyOf(normalTiles);
        menhirTiles = List.copyOf(menhirTiles);

    }

    public int deckSize(Tile.Kind kind) {
        return switch (kind) {
            case START -> startTiles().size();
            case MENHIR -> menhirTiles().size();
            case NORMAL -> normalTiles.size();
        };
    }

    public Tile topTile(Tile.Kind kind) {
        return switch (kind) {
            case START -> startTiles.isEmpty() ? null : startTiles.getFirst();
            case MENHIR -> menhirTiles.isEmpty() ? null : menhirTiles.getFirst();
            case NORMAL -> normalTiles.isEmpty() ? null : normalTiles.getFirst();
        };
    }



    public TileDecks withTopTileDrawn(Tile.Kind kind) {
        Preconditions.checkArgument(deckSize(kind) != 0);
        List<Tile> newStartTiles = startTiles;
        List<Tile> newMenhirTiles = menhirTiles;
        List<Tile> newNormalTiles = normalTiles;
        switch (kind){
            case START -> newStartTiles.removeFirst();
            case NORMAL -> newNormalTiles.removeFirst();
            case MENHIR -> newMenhirTiles.removeFirst();
        }
        return new TileDecks(newStartTiles,newNormalTiles,newMenhirTiles);


    }

    public TileDecks withTopTileDrawnUntil(Tile.Kind kind, Predicate<Tile> predicate) {
        return null;
    }


}
