package com.cooldev.gba.emulator.gameboy.features.home.utils;

import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import q0.l;

/* loaded from: classes.dex */
public final class GameUtils$computeTitle$1 extends r implements l {
    public static final GameUtils$computeTitle$1 INSTANCE = new GameUtils$computeTitle$1();

    public GameUtils$computeTitle$1() {
        super(1);
    }

    @NotNull
    public final Boolean invoke(char c2) {
        return Boolean.valueOf((c2 == '&') | Character.isDigit(c2) | Character.isUpperCase(c2));
    }

    @Override // q0.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Character) obj).charValue());
    }
}
