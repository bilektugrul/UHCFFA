package io.github.bilektugrul.uhcffa.game;

import org.bukkit.Location;

import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class Area {

    private final Location edge, otherEdge;
    private final Set<Location> spawnLocations;

    public Area(Location edge, Location otherEdge, Set<Location> spawnLocations) {
        this.edge = edge;
        this.otherEdge = otherEdge;
        this.spawnLocations = spawnLocations;
    }

    public Location getEdge() {
        return edge;
    }

    public Location getOtherEdge() {
        return otherEdge;
    }

    public Location getRandomSpawn() {
        return spawnLocations.stream().skip(ThreadLocalRandom.current().nextInt(spawnLocations.size())).findFirst().orElse(null);
    }

}