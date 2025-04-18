package com.google.zxing;

import android.support.v4.media.d;
import com.google.zxing.common.detector.MathUtils;

/* loaded from: classes4.dex */
public class ResultPoint {
    private final float x;

    /* renamed from: y, reason: collision with root package name */
    private final float f28927y;

    public ResultPoint(float f2, float f3) {
        this.x = f2;
        this.f28927y = f3;
    }

    private static float crossProductZ(ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3) {
        float f2 = resultPoint2.x;
        float f3 = resultPoint2.f28927y;
        return ((resultPoint.f28927y - f3) * (resultPoint3.x - f2)) - ((resultPoint.x - f2) * (resultPoint3.f28927y - f3));
    }

    public static float distance(ResultPoint resultPoint, ResultPoint resultPoint2) {
        return MathUtils.distance(resultPoint.x, resultPoint.f28927y, resultPoint2.x, resultPoint2.f28927y);
    }

    public static void orderBestPatterns(ResultPoint[] resultPointArr) {
        ResultPoint resultPoint;
        ResultPoint resultPoint2;
        ResultPoint resultPoint3;
        float distance = distance(resultPointArr[0], resultPointArr[1]);
        float distance2 = distance(resultPointArr[1], resultPointArr[2]);
        float distance3 = distance(resultPointArr[0], resultPointArr[2]);
        if (distance2 >= distance && distance2 >= distance3) {
            resultPoint = resultPointArr[0];
            resultPoint2 = resultPointArr[1];
            resultPoint3 = resultPointArr[2];
        } else if (distance3 < distance2 || distance3 < distance) {
            resultPoint = resultPointArr[2];
            resultPoint2 = resultPointArr[0];
            resultPoint3 = resultPointArr[1];
        } else {
            resultPoint = resultPointArr[1];
            resultPoint2 = resultPointArr[0];
            resultPoint3 = resultPointArr[2];
        }
        if (crossProductZ(resultPoint2, resultPoint, resultPoint3) < 0.0f) {
            ResultPoint resultPoint4 = resultPoint3;
            resultPoint3 = resultPoint2;
            resultPoint2 = resultPoint4;
        }
        resultPointArr[0] = resultPoint2;
        resultPointArr[1] = resultPoint;
        resultPointArr[2] = resultPoint3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ResultPoint) {
            ResultPoint resultPoint = (ResultPoint) obj;
            if (this.x == resultPoint.x && this.f28927y == resultPoint.f28927y) {
                return true;
            }
        }
        return false;
    }

    public final float getX() {
        return this.x;
    }

    public final float getY() {
        return this.f28927y;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f28927y) + (Float.floatToIntBits(this.x) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.x);
        sb.append(',');
        return d.n(sb, this.f28927y, ')');
    }
}
