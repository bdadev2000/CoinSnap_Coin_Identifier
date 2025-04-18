package com.cooldev.gba.emulator.gameboy.features.home.utils;

import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.l;

/* loaded from: classes.dex */
public final class SerialScanner$parsePSXSerial$3 extends r implements l {
    public static final SerialScanner$parsePSXSerial$3 INSTANCE = new SerialScanner$parsePSXSerial$3();

    public SerialScanner$parsePSXSerial$3() {
        super(1);
    }

    @Override // q0.l
    @NotNull
    public final Boolean invoke(@Nullable String str) {
        return Boolean.valueOf(str != null);
    }
}
