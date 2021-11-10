package com.company;

public class MonolitFactory implements StalkerFactory{
    @Override
    public Stalker newStalkerInZona() {
        return new Monolit();
    }
}
