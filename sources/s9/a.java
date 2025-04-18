package s9;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import vd.e;

/* loaded from: classes3.dex */
public abstract class a {
    public static final LinearInterpolator a = new LinearInterpolator();

    /* renamed from: b, reason: collision with root package name */
    public static final i1.b f24933b = new i1.b();

    /* renamed from: c, reason: collision with root package name */
    public static final i1.a f24934c = new i1.a();

    /* renamed from: d, reason: collision with root package name */
    public static final i1.c f24935d = new i1.c();

    static {
        new DecelerateInterpolator();
    }

    public static float a(float f10, float f11, float f12, float f13, float f14) {
        return f14 <= f12 ? f10 : f14 >= f13 ? f11 : e.b(f11, f10, (f14 - f12) / (f13 - f12), f10);
    }

    public static int b(float f10, int i10, int i11) {
        return Math.round(f10 * (i11 - i10)) + i10;
    }
}
