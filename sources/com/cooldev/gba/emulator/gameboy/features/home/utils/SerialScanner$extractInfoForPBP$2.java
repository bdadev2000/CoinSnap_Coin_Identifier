package com.cooldev.gba.emulator.gameboy.features.home.utils;

import com.cooldev.gba.emulator.gameboy.features.home.models.SystemID;
import com.cooldev.gba.emulator.gameboy.features.home.utils.SerialScanner;
import java.util.List;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class SerialScanner$extractInfoForPBP$2 extends r implements l {
    public static final SerialScanner$extractInfoForPBP$2 INSTANCE = new SerialScanner$extractInfoForPBP$2();

    public SerialScanner$extractInfoForPBP$2() {
        super(1);
    }

    @Override // q0.l
    @NotNull
    public final SerialScanner.DiskInfo invoke(@NotNull String str) {
        List list;
        List list2;
        a.s(str, "serial");
        list = SerialScanner.PSX_BASE_SERIALS;
        if (UtilsKt.startsWithAny(str, list)) {
            return new SerialScanner.DiskInfo(str, SystemID.PSX);
        }
        list2 = SerialScanner.PSP_BASE_SERIALS;
        return UtilsKt.startsWithAny(str, list2) ? new SerialScanner.DiskInfo(str, SystemID.PSP) : new SerialScanner.DiskInfo(str, null);
    }
}
