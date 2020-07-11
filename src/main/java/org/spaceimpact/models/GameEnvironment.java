package org.spaceimpact.models;

import org.spaceimpact.models.base.BaseFrame;

public interface GameEnvironment {
    BaseFrame updateEnvironment(GameInput input);
}
