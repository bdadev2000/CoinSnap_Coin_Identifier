package androidx.compose.foundation;

import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes4.dex */
public final class EdgeEffectCompat {
    public static float a(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return Api31Impl.f2489a.b(edgeEffect);
        }
        return 0.0f;
    }

    public static void b(EdgeEffect edgeEffect, int i2) {
        if (Build.VERSION.SDK_INT >= 31) {
            edgeEffect.onAbsorb(i2);
        } else if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(i2);
        }
    }

    public static float c(EdgeEffect edgeEffect, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 31) {
            return Api31Impl.f2489a.c(edgeEffect, f2, f3);
        }
        edgeEffect.onPull(f2, f3);
        return f2;
    }

    public static void d(EdgeEffect edgeEffect, float f2) {
        if (!(edgeEffect instanceof GlowEdgeEffectCompat)) {
            edgeEffect.onRelease();
            return;
        }
        GlowEdgeEffectCompat glowEdgeEffectCompat = (GlowEdgeEffectCompat) edgeEffect;
        float f3 = glowEdgeEffectCompat.f2726b + f2;
        glowEdgeEffectCompat.f2726b = f3;
        if (Math.abs(f3) > glowEdgeEffectCompat.f2725a) {
            glowEdgeEffectCompat.onRelease();
        }
    }
}
