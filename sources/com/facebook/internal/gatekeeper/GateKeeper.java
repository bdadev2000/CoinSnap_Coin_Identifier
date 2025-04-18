package com.facebook.internal.gatekeeper;

import android.support.v4.media.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

/* loaded from: classes4.dex */
public final class GateKeeper {

    @NotNull
    private final String name;
    private final boolean value;

    public GateKeeper(@NotNull String str, boolean z2) {
        a.s(str, "name");
        this.name = str;
        this.value = z2;
    }

    public static /* synthetic */ GateKeeper copy$default(GateKeeper gateKeeper, String str, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = gateKeeper.name;
        }
        if ((i2 & 2) != 0) {
            z2 = gateKeeper.value;
        }
        return gateKeeper.copy(str, z2);
    }

    @NotNull
    public final String component1() {
        return this.name;
    }

    public final boolean component2() {
        return this.value;
    }

    @NotNull
    public final GateKeeper copy(@NotNull String str, boolean z2) {
        a.s(str, "name");
        return new GateKeeper(str, z2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GateKeeper)) {
            return false;
        }
        GateKeeper gateKeeper = (GateKeeper) obj;
        return a.g(this.name, gateKeeper.name) && this.value == gateKeeper.value;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final boolean getValue() {
        return this.value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        boolean z2 = this.value;
        int i2 = z2;
        if (z2 != 0) {
            i2 = 1;
        }
        return hashCode + i2;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("GateKeeper(name=");
        sb.append(this.name);
        sb.append(", value=");
        return d.s(sb, this.value, ')');
    }
}
