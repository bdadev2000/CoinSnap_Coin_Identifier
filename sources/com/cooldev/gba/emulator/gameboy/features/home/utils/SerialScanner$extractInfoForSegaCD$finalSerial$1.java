package com.cooldev.gba.emulator.gameboy.features.home.utils;

import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;
import z0.m;

/* loaded from: classes.dex */
public final class SerialScanner$extractInfoForSegaCD$finalSerial$1 extends r implements l {
    public static final SerialScanner$extractInfoForSegaCD$finalSerial$1 INSTANCE = new SerialScanner$extractInfoForSegaCD$finalSerial$1();

    public SerialScanner$extractInfoForSegaCD$finalSerial$1() {
        super(1);
    }

    @Override // q0.l
    @NotNull
    public final Boolean invoke(@NotNull String str) {
        a.s(str, "it");
        return Boolean.valueOf(!m.Z0(str));
    }
}
