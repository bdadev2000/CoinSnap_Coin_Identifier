package com.cooldev.gba.emulator.gameboy.features.home.models;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import p0.a;

@StabilityInferred
/* loaded from: classes3.dex */
public final class MagicNumber {
    public static final int $stable = 8;

    @NotNull
    private final byte[] numbers;
    private final int offset;

    @NotNull
    private final SystemID systemID;

    public MagicNumber(int i2, @NotNull byte[] bArr, @NotNull SystemID systemID) {
        a.s(bArr, "numbers");
        a.s(systemID, "systemID");
        this.offset = i2;
        this.numbers = bArr;
        this.systemID = systemID;
    }

    @NotNull
    public final byte[] getNumbers() {
        return this.numbers;
    }

    public final int getOffset() {
        return this.offset;
    }

    @NotNull
    public final SystemID getSystemID() {
        return this.systemID;
    }
}
