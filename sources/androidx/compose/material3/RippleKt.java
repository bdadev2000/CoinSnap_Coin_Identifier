package androidx.compose.material3;

import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.Indication;
import androidx.compose.material.ripple.PlatformRipple;
import androidx.compose.material.ripple.Ripple;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;

/* loaded from: classes2.dex */
public final class RippleKt {

    /* renamed from: a, reason: collision with root package name */
    public static final StaticProvidableCompositionLocal f10783a = new CompositionLocal(RippleKt$LocalUseFallbackRippleImplementation$1.f10787a);

    /* renamed from: b, reason: collision with root package name */
    public static final DynamicProvidableCompositionLocal f10784b = CompositionLocalKt.c(RippleKt$LocalRippleConfiguration$1.f10786a);

    /* renamed from: c, reason: collision with root package name */
    public static final RippleNodeFactory f10785c;
    public static final RippleNodeFactory d;

    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.compose.runtime.StaticProvidableCompositionLocal, androidx.compose.runtime.CompositionLocal] */
    static {
        long j2 = Color.f14962i;
        f10785c = new RippleNodeFactory(true, Float.NaN, j2);
        d = new RippleNodeFactory(false, Float.NaN, j2);
    }

    public static final Indication a(boolean z2, float f2, long j2, Composer composer, int i2, int i3) {
        Indication rippleNodeFactory;
        boolean z3 = true;
        if ((i3 & 1) != 0) {
            z2 = true;
        }
        if ((i3 & 2) != 0) {
            f2 = Float.NaN;
        }
        if ((i3 & 4) != 0) {
            j2 = Color.f14962i;
        }
        composer.J(-1280632857);
        if (((Boolean) composer.K(f10783a)).booleanValue()) {
            int i4 = (i2 & 896) | (i2 & 14) | (i2 & 112);
            TweenSpec tweenSpec = androidx.compose.material.ripple.RippleKt.f7451a;
            MutableState k2 = SnapshotStateKt.k(new Color(j2), composer);
            boolean z4 = (((i4 & 14) ^ 6) > 4 && composer.a(z2)) || (i4 & 6) == 4;
            if ((((i4 & 112) ^ 48) <= 32 || !composer.b(f2)) && (i4 & 48) != 32) {
                z3 = false;
            }
            boolean z5 = z4 | z3;
            Object u2 = composer.u();
            if (z5 || u2 == Composer.Companion.f13690a) {
                u2 = new Ripple(z2, f2, k2);
                composer.o(u2);
            }
            rippleNodeFactory = (PlatformRipple) u2;
        } else {
            rippleNodeFactory = (Dp.a(f2, Float.NaN) && Color.c(j2, Color.f14962i)) ? z2 ? f10785c : d : new RippleNodeFactory(z2, f2, j2);
        }
        composer.D();
        return rippleNodeFactory;
    }
}
