package com.glority.widget.uitls;

import android.graphics.PointF;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ModelUtils.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004J.\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010¨\u0006\u0011"}, d2 = {"Lcom/glority/widget/uitls/ModelUtils;", "", "()V", "calculateAngle", "", "x1", "y1", "x2", "y2", "calculatePoint", "", "x", "y", "r", "angle", "toPoint", "Landroid/graphics/PointF;", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final class ModelUtils {
    public static final ModelUtils INSTANCE = new ModelUtils();

    private ModelUtils() {
    }

    public final float calculateAngle(float x1, float y1, float x2, float y2) {
        float f = x2 - x1;
        float f2 = y2 - y1;
        float degrees = (float) Math.toDegrees(Math.asin(Math.abs(f2) / ((float) Math.sqrt((f * f) + (f2 * f2)))));
        float f3 = 0;
        return (f <= f3 || f2 <= f3) ? f2 > f3 ? 180 - degrees : f > f3 ? -degrees : degrees + 180 : degrees;
    }

    public final void calculatePoint(float x, float y, float r, float angle, PointF toPoint) {
        Intrinsics.checkNotNullParameter(toPoint, "toPoint");
        double d = r;
        double d2 = angle % 360;
        toPoint.x = x + ((float) (Math.cos(Math.toRadians(d2)) * d));
        toPoint.y = y + ((float) (d * Math.sin(Math.toRadians(d2))));
    }
}
