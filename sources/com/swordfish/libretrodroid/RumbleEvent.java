package com.swordfish.libretrodroid;

import android.support.v4.media.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class RumbleEvent {
    private final int port;
    private final float strengthStrong;
    private final float strengthWeak;

    public RumbleEvent(int i2, float f2, float f3) {
        this.port = i2;
        this.strengthWeak = f2;
        this.strengthStrong = f3;
    }

    public static /* synthetic */ RumbleEvent copy$default(RumbleEvent rumbleEvent, int i2, float f2, float f3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = rumbleEvent.port;
        }
        if ((i3 & 2) != 0) {
            f2 = rumbleEvent.strengthWeak;
        }
        if ((i3 & 4) != 0) {
            f3 = rumbleEvent.strengthStrong;
        }
        return rumbleEvent.copy(i2, f2, f3);
    }

    public final int component1() {
        return this.port;
    }

    public final float component2() {
        return this.strengthWeak;
    }

    public final float component3() {
        return this.strengthStrong;
    }

    @NotNull
    public final RumbleEvent copy(int i2, float f2, float f3) {
        return new RumbleEvent(i2, f2, f3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RumbleEvent)) {
            return false;
        }
        RumbleEvent rumbleEvent = (RumbleEvent) obj;
        return this.port == rumbleEvent.port && p0.a.g(Float.valueOf(this.strengthWeak), Float.valueOf(rumbleEvent.strengthWeak)) && p0.a.g(Float.valueOf(this.strengthStrong), Float.valueOf(rumbleEvent.strengthStrong));
    }

    public final int getPort() {
        return this.port;
    }

    public final float getStrengthStrong() {
        return this.strengthStrong;
    }

    public final float getStrengthWeak() {
        return this.strengthWeak;
    }

    public int hashCode() {
        return Float.hashCode(this.strengthStrong) + d.b(this.strengthWeak, Integer.hashCode(this.port) * 31, 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("RumbleEvent(port=");
        sb.append(this.port);
        sb.append(", strengthWeak=");
        sb.append(this.strengthWeak);
        sb.append(", strengthStrong=");
        return d.n(sb, this.strengthStrong, ')');
    }
}
