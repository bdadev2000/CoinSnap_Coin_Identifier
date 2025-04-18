package w3;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* loaded from: classes.dex */
public abstract class p {
    public static final LinearInterpolator a = new LinearInterpolator();

    /* renamed from: b, reason: collision with root package name */
    public static final d3.g f26715b = d3.g.z("t", "s", "e", "o", com.mbridge.msdk.foundation.same.report.i.a, "h", "to", "ti");

    /* renamed from: c, reason: collision with root package name */
    public static final d3.g f26716c = d3.g.z("x", "y");

    public static Interpolator a(PointF pointF, PointF pointF2) {
        pointF.x = y3.f.b(pointF.x, -1.0f, 1.0f);
        pointF.y = y3.f.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = y3.f.b(pointF2.x, -1.0f, 1.0f);
        float b3 = y3.f.b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = b3;
        float f10 = pointF.x;
        float f11 = pointF.y;
        float f12 = pointF2.x;
        y3.g gVar = y3.h.a;
        try {
            return p0.a.b(f10, f11, f12, b3);
        } catch (IllegalArgumentException e2) {
            if ("The Path cannot loop back on itself.".equals(e2.getMessage())) {
                return p0.a.b(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y);
            }
            return new LinearInterpolator();
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:139:0x025b. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x002b. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0217 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.animation.Interpolator] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static z3.a b(x3.b r23, m3.j r24, float r25, w3.e0 r26, boolean r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 760
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w3.p.b(x3.b, m3.j, float, w3.e0, boolean, boolean):z3.a");
    }
}
