package com.company;

public class Main {

    public static void main(String[] args) {
        StalkerFactory svobodaFactory = new SvobodaFactory();
        Stalker svobodovec = svobodaFactory.newStalkerInZona();
        svobodovec.zona();

        StalkerFactory dolgFactory = new DolgFactory();
        Stalker dologovec = dolgFactory.newStalkerInZona();
        dologovec.zona();

        StalkerFactory monolitFactory = new MonolitFactory();
        Stalker monolitovec = monolitFactory.newStalkerInZona();
        monolitovec.zona();

    }
}
