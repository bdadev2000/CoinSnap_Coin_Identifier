package q;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public abstract class b extends Drawable {
    public static final double a = Math.cos(Math.toRadians(45.0d));

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f23658b = 0;

    public static float a(float f10, float f11, boolean z10) {
        if (!z10) {
            return f10 * 1.5f;
        }
        return (float) (((1.0d - a) * f11) + (f10 * 1.5f));
    }
}
