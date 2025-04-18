package com.cooldev.gba.emulator.gameboy.features.game.utils;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes3.dex */
public final class SaveInfo {
    public static final int $stable = 0;
    private final long date;
    private final boolean exists;

    public SaveInfo(boolean z2, long j2) {
        this.exists = z2;
        this.date = j2;
    }

    public static /* synthetic */ SaveInfo copy$default(SaveInfo saveInfo, boolean z2, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = saveInfo.exists;
        }
        if ((i2 & 2) != 0) {
            j2 = saveInfo.date;
        }
        return saveInfo.copy(z2, j2);
    }

    public final boolean component1() {
        return this.exists;
    }

    public final long component2() {
        return this.date;
    }

    @NotNull
    public final SaveInfo copy(boolean z2, long j2) {
        return new SaveInfo(z2, j2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SaveInfo)) {
            return false;
        }
        SaveInfo saveInfo = (SaveInfo) obj;
        return this.exists == saveInfo.exists && this.date == saveInfo.date;
    }

    public final long getDate() {
        return this.date;
    }

    public final boolean getExists() {
        return this.exists;
    }

    public int hashCode() {
        return Long.hashCode(this.date) + (Boolean.hashCode(this.exists) * 31);
    }

    @NotNull
    public String toString() {
        return "SaveInfo(exists=" + this.exists + ", date=" + this.date + ')';
    }
}
