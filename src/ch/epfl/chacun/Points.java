package ch.epfl.chacun;

public final class Points {
    public static int forClosedForest(int tileCount, int mushroomGroupCount){
        if (tileCount > 1 && mushroomGroupCount >= 0){
            throw new IllegalArgumentException();
        }
        return  tileCount + mushroomGroupCount; // pas sur de moi jai juste mis la somme des 2

    }
    public static int forClosedRiver(int tileCount, int fishCount){
        if (tileCount > 1 && fishCount>=0){
            throw new IllegalArgumentException();
        }
        return tileCount + fishCount;

    }
    public static int forMeadow(int mammothCount, int aurochsCount, int deerCount){
        if (mammothCount >=0 && aurochsCount>=0 && deerCount>=0){
            throw new IllegalArgumentException();
        }
        return mammothCount + aurochsCount + deerCount;

    }
    public static int forRiverSystem(int fishCount){
        if (fishCount >=0){
            throw new IllegalArgumentException();
        }
        return fishCount;

    }
    public static int forLogboat(int lakeCount){
        if (lakeCount>=0){
            throw new IllegalArgumentException();
        }
        return lakeCount;

    }
    public static int forRaft(int lakeCount){
        if (lakeCount>=0){
            throw new IllegalArgumentException();
        }
        return lakeCount;

    }


}
