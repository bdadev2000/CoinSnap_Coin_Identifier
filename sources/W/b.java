package w;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public abstract class b extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public static final double f23657a = Math.cos(Math.toRadians(45.0d));

    public static float a(float f9, float f10, boolean z8) {
        if (z8) {
            return (float) (((1.0d - f23657a) * f10) + f9);
        }
        return f9;
    }

    public static float b(float f9, float f10, boolean z8) {
        if (z8) {
            return (float) (((1.0d - f23657a) * f10) + (f9 * 1.5f));
        }
        return f9 * 1.5f;
    }
}
