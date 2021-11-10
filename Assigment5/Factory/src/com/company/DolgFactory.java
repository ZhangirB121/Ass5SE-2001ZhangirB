package com.company;

public class DolgFactory implements StalkerFactory{
    @Override
    public Stalker newStalkerInZona() {
        return new Dolg();
    }
}
