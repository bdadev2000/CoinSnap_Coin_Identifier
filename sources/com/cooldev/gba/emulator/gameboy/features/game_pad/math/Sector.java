package com.cooldev.gba.emulator.gameboy.features.game_pad.math;

import android.graphics.PointF;
import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

@StabilityInferred
/* loaded from: classes.dex */
public final class Sector {
    public static final int $stable = 8;

    @NotNull
    private final PointF center;
    private final float maxAngle;
    private final float maxRadius;
    private final float minAngle;
    private final float minRadius;

    public Sector(@NotNull PointF pointF, float f2, float f3, float f4, float f5) {
        a.s(pointF, "center");
        this.center = pointF;
        this.minRadius = f2;
        this.maxRadius = f3;
        this.minAngle = f4;
        this.maxAngle = f5;
    }

    public static /* synthetic */ Sector copy$default(Sector sector, PointF pointF, float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            pointF = sector.center;
        }
        if ((i2 & 2) != 0) {
            f2 = sector.minRadius;
        }
        float f6 = f2;
        if ((i2 & 4) != 0) {
            f3 = sector.maxRadius;
        }
        float f7 = f3;
        if ((i2 & 8) != 0) {
            f4 = sector.minAngle;
        }
        float f8 = f4;
        if ((i2 & 16) != 0) {
            f5 = sector.maxAngle;
        }
        return sector.copy(pointF, f6, f7, f8, f5);
    }

    @NotNull
    public final PointF component1() {
        return this.center;
    }

    public final float component2() {
        return this.minRadius;
    }

    public final float component3() {
        return this.maxRadius;
    }

    public final float component4() {
        return this.minAngle;
    }

    public final float component5() {
        return this.maxAngle;
    }

    @NotNull
    public final Sector copy(@NotNull PointF pointF, float f2, float f3, float f4, float f5) {
        a.s(pointF, "center");
        return new Sector(pointF, f2, f3, f4, f5);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Sector)) {
            return false;
        }
        Sector sector = (Sector) obj;
        return a.g(this.center, sector.center) && Float.compare(this.minRadius, sector.minRadius) == 0 && Float.compare(this.maxRadius, sector.maxRadius) == 0 && Float.compare(this.minAngle, sector.minAngle) == 0 && Float.compare(this.maxAngle, sector.maxAngle) == 0;
    }

    @NotNull
    public final PointF getCenter() {
        return this.center;
    }

    public final float getMaxAngle() {
        return this.maxAngle;
    }

    public final float getMaxRadius() {
        return this.maxRadius;
    }

    public final float getMinAngle() {
        return this.minAngle;
    }

    public final float getMinRadius() {
        return this.minRadius;
    }

    public int hashCode() {
        return Float.hashCode(this.maxAngle) + d.b(this.minAngle, d.b(this.maxRadius, d.b(this.minRadius, this.center.hashCode() * 31, 31), 31), 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Sector(center=");
        sb.append(this.center);
        sb.append(", minRadius=");
        sb.append(this.minRadius);
        sb.append(", maxRadius=");
        sb.append(this.maxRadius);
        sb.append(", minAngle=");
        sb.append(this.minAngle);
        sb.append(", maxAngle=");
        return d.n(sb, this.maxAngle, ')');
    }
}
