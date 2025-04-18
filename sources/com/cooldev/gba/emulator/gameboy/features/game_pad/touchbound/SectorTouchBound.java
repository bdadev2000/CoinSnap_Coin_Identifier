package com.cooldev.gba.emulator.gameboy.features.game_pad.touchbound;

import androidx.compose.runtime.internal.StabilityInferred;
import com.cooldev.gba.emulator.gameboy.features.game_pad.math.MathUtils;
import com.cooldev.gba.emulator.gameboy.features.game_pad.math.Sector;
import org.jetbrains.annotations.NotNull;
import p0.a;

@StabilityInferred
/* loaded from: classes4.dex */
public final class SectorTouchBound implements TouchBound {
    public static final int $stable = 8;

    @NotNull
    private final Sector sector;

    public SectorTouchBound(@NotNull Sector sector) {
        a.s(sector, "sector");
        this.sector = sector;
    }

    @Override // com.cooldev.gba.emulator.gameboy.features.game_pad.touchbound.TouchBound
    public boolean contains(float f2, float f3) {
        MathUtils mathUtils = MathUtils.INSTANCE;
        float angle = mathUtils.angle(this.sector.getCenter().x, f2, this.sector.getCenter().y, f3) % 6.2831855f;
        float distance = mathUtils.distance(f2, this.sector.getCenter().x, f3, this.sector.getCenter().y);
        return distance > this.sector.getMinRadius() && distance < this.sector.getMaxRadius() && mathUtils.isAngleInRange(angle, this.sector.getMinAngle(), this.sector.getMaxAngle());
    }
}
