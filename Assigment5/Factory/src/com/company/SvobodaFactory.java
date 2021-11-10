package com.company;

public class SvobodaFactory implements StalkerFactory{

    @Override
    public Stalker newStalkerInZona() {
        return new Svoboda();
    }
}
