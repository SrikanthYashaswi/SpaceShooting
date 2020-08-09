package org.spaceimpact.controller;

import org.spaceimpact.models.ShootingShipState;
import org.spaceimpact.models.base.Bullet;
import org.spaceimpact.models.base.Mass;
import org.spaceimpact.models.base.Ship;
import org.spaceimpact.models.base.Sprite;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollisionDetector extends Controller<ShootingShipState> {
    private void addBullets(Map<String, Mass> locationMap, List<Bullet> bullets) {
        String locationId;
        for (Bullet bullet : bullets) {
            if (!detectCollision(locationMap, bullet)) {
                locationId = formLocationId(bullet);
                locationMap.put(locationId, bullet);
            }
        }
    }

    private void addShip(Map<String, Mass> locationMap, Ship playerShip) {
        String locationId = formLocationId(playerShip);
        locationMap.put(locationId, playerShip);
    }

    private String formLocationId(Sprite sprite) {
        return sprite.getX() + "-" + sprite.getY();
    }

    private boolean detectCollision(Map<String, Mass> locationMap, Mass currentEntity) {
        String locationId = formLocationId(currentEntity);
        if (locationMap.containsKey(locationId)) {
            Mass entityAtLocation = locationMap.get(locationId);
            int entityHealth = entityAtLocation.getHealth();
            entityAtLocation.impact(currentEntity.getHealth());
            currentEntity.impact(entityHealth);
            return true;
        }
        return false;
    }

    @Override
    public void update(ShootingShipState state) {
        Map<String, Mass> locationMap = new HashMap<>();
        addShip(locationMap, state.getPlayerShip());
        addShip(locationMap, state.getComputerShip());
        addBullets(locationMap, state.getBullets());
    }
}
