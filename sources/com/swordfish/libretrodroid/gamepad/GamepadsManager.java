package com.swordfish.libretrodroid.gamepad;

import b1.f0;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.objectweb.asm.Opcodes;

/* loaded from: classes2.dex */
public final class GamepadsManager {

    @NotNull
    public static final GamepadsManager INSTANCE = new GamepadsManager();

    @NotNull
    private static final Set<Integer> GAMEPAD_KEYS = f0.C(19, 20, 22, 21, 271, 269, 268, 270, 109, 108, 96, 99, 100, 97, 102, 104, 103, 105, 106, 107);

    private GamepadsManager() {
    }

    @NotNull
    public final Set<Integer> getGAMEPAD_KEYS() {
        return GAMEPAD_KEYS;
    }

    public final int getGamepadKeyEvent(int i2) {
        switch (i2) {
            case 96:
                return 97;
            case Opcodes.LADD /* 97 */:
                return 96;
            case Opcodes.FADD /* 98 */:
            default:
                return i2;
            case Opcodes.DADD /* 99 */:
                return 100;
            case 100:
                return 99;
        }
    }
}
