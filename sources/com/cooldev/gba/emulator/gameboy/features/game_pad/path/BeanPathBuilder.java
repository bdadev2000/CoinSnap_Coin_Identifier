package com.cooldev.gba.emulator.gameboy.features.game_pad.path;

import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.compose.runtime.internal.StabilityInferred;
import com.cooldev.gba.emulator.gameboy.features.game_pad.math.MathUtils;
import com.cooldev.gba.emulator.gameboy.features.game_pad.math.Sector;
import org.jetbrains.annotations.NotNull;
import p0.a;

@StabilityInferred
/* loaded from: classes.dex */
public final class BeanPathBuilder {
    public static final int $stable = 0;

    @NotNull
    public static final BeanPathBuilder INSTANCE = new BeanPathBuilder();

    private BeanPathBuilder() {
    }

    @NotNull
    public final Path build(@NotNull Rect rect, @NotNull Sector sector, float f2) {
        a.s(rect, "drawingBox");
        a.s(sector, "sector");
        float f3 = 2;
        float min = (1.0f - (f3 * f2)) * (Math.min(rect.width(), rect.height()) / 2);
        MathUtils mathUtils = MathUtils.INSTANCE;
        float lint = mathUtils.lint(1.0f - f2, sector.getMinRadius(), sector.getMaxRadius());
        float lint2 = mathUtils.lint(0.5f, sector.getMinRadius(), sector.getMaxRadius());
        float lint3 = mathUtils.lint(f2, sector.getMinRadius(), sector.getMaxRadius());
        float asin = ((float) Math.asin((r1 * f2) / lint2)) * 2.0f;
        float asin2 = (((float) Math.asin(min / lint2)) * 2.0f) / f3;
        float minAngle = sector.getMinAngle() + asin2 + asin;
        float lint4 = mathUtils.lint(0.5f, sector.getMinAngle(), sector.getMaxAngle());
        float maxAngle = (sector.getMaxAngle() - asin2) - asin;
        Path path = new Path();
        double d = minAngle;
        path.moveTo((((float) Math.cos(d)) * lint) + sector.getCenter().x, sector.getCenter().y - (((float) Math.sin(d)) * lint));
        path.arcTo(new RectF(((((float) Math.cos(d)) * lint2) + sector.getCenter().x) - min, (sector.getCenter().y - (((float) Math.sin(d)) * lint2)) - min, (((float) Math.cos(d)) * lint2) + sector.getCenter().x + min, (sector.getCenter().y - (((float) Math.sin(d)) * lint2)) + min), -mathUtils.toDegrees(minAngle), 180.0f);
        double d2 = lint4;
        double d3 = (maxAngle - minAngle) / 2.0f;
        double d4 = maxAngle;
        path.quadTo(((((float) Math.cos(d2)) * lint3) / ((float) Math.cos(d3))) + sector.getCenter().x, sector.getCenter().y - ((((float) Math.sin(d2)) * lint3) / ((float) Math.cos(d3))), (((float) Math.cos(d4)) * lint3) + sector.getCenter().x, sector.getCenter().y - (((float) Math.sin(d4)) * lint3));
        path.arcTo(new RectF(((((float) Math.cos(d4)) * lint2) + sector.getCenter().x) - min, (sector.getCenter().y - (((float) Math.sin(d4)) * lint2)) - min, (((float) Math.cos(d4)) * lint2) + sector.getCenter().x + min, (sector.getCenter().y - (((float) Math.sin(d4)) * lint2)) + min), (-mathUtils.toDegrees(maxAngle)) + 180.0f, 180.0f);
        path.quadTo(((((float) Math.cos(d2)) * lint) / ((float) Math.cos(d3))) + sector.getCenter().x, sector.getCenter().y - ((((float) Math.sin(d2)) * lint) / ((float) Math.cos(d3))), (((float) Math.cos(d)) * lint) + sector.getCenter().x, sector.getCenter().y - (((float) Math.sin(d)) * lint));
        path.close();
        return path;
    }
}
