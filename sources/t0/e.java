package t0;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* loaded from: classes.dex */
public abstract class e {
    public static EdgeEffect a(Context context, AttributeSet attributeSet) {
        try {
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.y();
            return com.google.android.gms.internal.ads.b.n(context, attributeSet);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    public static float b(EdgeEffect edgeEffect) {
        float distance;
        try {
            distance = edgeEffect.getDistance();
            return distance;
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public static float c(EdgeEffect edgeEffect, float f10, float f11) {
        float onPullDistance;
        try {
            onPullDistance = edgeEffect.onPullDistance(f10, f11);
            return onPullDistance;
        } catch (Throwable unused) {
            edgeEffect.onPull(f10, f11);
            return 0.0f;
        }
    }
}
