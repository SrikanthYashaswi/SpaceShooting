package org.spaceimpact.factories;

import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.input.KeyType;
import org.spaceimpact.models.GameInput;

public class GameInputFactory {
    public static GameInput getInput(KeyStroke keyStroke) {
        if (keyStroke == null) {
            return GameInput.Undefined;
        }
        KeyType inputKeyType = keyStroke.getKeyType();
        switch (inputKeyType) {
            case ArrowUp:
                return GameInput.Up;
            case ArrowDown:
                return GameInput.Down;
            case ArrowLeft:
                return GameInput.Left;
            case ArrowRight:
                return GameInput.Right;
            case Character:
                if (keyStroke.getCharacter().equals('s')) {
                    return GameInput.Shoot;
                }
                if (keyStroke.getCharacter().equals('S')) {
                    return GameInput.PowerShoot;
                }
                if (keyStroke.getCharacter().equals('q')) {
                    return GameInput.Quit;
                }
                if (keyStroke.getCharacter().equals('c')) {
                    return GameInput.ClearScreen;
                }
                if (keyStroke.getCharacter().equals('p')) {
                    return GameInput.Toggle;
                }
                break;
        }
        return GameInput.Undefined;
    }
}
