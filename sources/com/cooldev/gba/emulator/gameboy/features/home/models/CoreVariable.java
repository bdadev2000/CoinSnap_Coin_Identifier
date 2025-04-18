package com.cooldev.gba.emulator.gameboy.features.home.models;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

@StabilityInferred
/* loaded from: classes4.dex */
public final class CoreVariable implements Serializable {
    public static final int $stable = 0;

    @NotNull
    private final String key;

    @NotNull
    private final String value;

    public CoreVariable(@NotNull String str, @NotNull String str2) {
        a.s(str, SDKConstants.PARAM_KEY);
        a.s(str2, "value");
        this.key = str;
        this.value = str2;
    }

    public static /* synthetic */ CoreVariable copy$default(CoreVariable coreVariable, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = coreVariable.key;
        }
        if ((i2 & 2) != 0) {
            str2 = coreVariable.value;
        }
        return coreVariable.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.key;
    }

    @NotNull
    public final String component2() {
        return this.value;
    }

    @NotNull
    public final CoreVariable copy(@NotNull String str, @NotNull String str2) {
        a.s(str, SDKConstants.PARAM_KEY);
        a.s(str2, "value");
        return new CoreVariable(str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoreVariable)) {
            return false;
        }
        CoreVariable coreVariable = (CoreVariable) obj;
        return a.g(this.key, coreVariable.key) && a.g(this.value, coreVariable.value);
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + (this.key.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("CoreVariable(key=");
        sb.append(this.key);
        sb.append(", value=");
        return d.q(sb, this.value, ')');
    }
}
