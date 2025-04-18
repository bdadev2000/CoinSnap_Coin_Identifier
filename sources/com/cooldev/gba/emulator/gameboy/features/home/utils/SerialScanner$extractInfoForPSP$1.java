package com.cooldev.gba.emulator.gameboy.features.home.utils;

import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class SerialScanner$extractInfoForPSP$1 extends r implements l {
    public static final SerialScanner$extractInfoForPSP$1 INSTANCE = new SerialScanner$extractInfoForPSP$1();

    public SerialScanner$extractInfoForPSP$1() {
        super(1);
    }

    @Override // q0.l
    @Nullable
    public final String invoke(@NotNull String str) {
        String parsePSXSerial;
        a.s(str, "serial");
        parsePSXSerial = SerialScanner.INSTANCE.parsePSXSerial(str);
        return parsePSXSerial;
    }
}
