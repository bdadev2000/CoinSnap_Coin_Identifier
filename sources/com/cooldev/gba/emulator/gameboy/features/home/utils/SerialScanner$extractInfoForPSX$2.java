package com.cooldev.gba.emulator.gameboy.features.home.utils;

import com.cooldev.gba.emulator.gameboy.features.home.models.SystemID;
import com.cooldev.gba.emulator.gameboy.features.home.utils.SerialScanner;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class SerialScanner$extractInfoForPSX$2 extends r implements l {
    public static final SerialScanner$extractInfoForPSX$2 INSTANCE = new SerialScanner$extractInfoForPSX$2();

    public SerialScanner$extractInfoForPSX$2() {
        super(1);
    }

    @Override // q0.l
    @NotNull
    public final SerialScanner.DiskInfo invoke(@NotNull String str) {
        a.s(str, "serial");
        return new SerialScanner.DiskInfo(str, SystemID.PSX);
    }
}
