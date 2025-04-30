package x3;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import x0.AbstractC2914a;

/* renamed from: x3.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2920a {

    /* renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f24226a = new LinearInterpolator();
    public static final p0.a b = new p0.a(1);

    /* renamed from: c, reason: collision with root package name */
    public static final p0.a f24227c = new p0.a(0);

    /* renamed from: d, reason: collision with root package name */
    public static final p0.a f24228d = new p0.a(2);

    static {
        new DecelerateInterpolator();
    }

    public static float a(float f9, float f10, float f11) {
        return AbstractC2914a.a(f10, f9, f11, f9);
    }

    public static float b(float f9, float f10, float f11, float f12, float f13) {
        if (f13 <= f11) {
            return f9;
        }
        if (f13 >= f12) {
            return f10;
        }
        return a(f9, f10, (f13 - f11) / (f12 - f11));
    }

    public static int c(float f9, int i9, int i10) {
        return Math.round(f9 * (i10 - i9)) + i9;
    }
}
