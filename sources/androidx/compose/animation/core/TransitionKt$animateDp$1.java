package androidx.compose.animation.core;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.r;
import q0.q;

/* loaded from: classes4.dex */
public final class TransitionKt$animateDp$1 extends r implements q {
    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        composer.J(-575880366);
        Rect rect = VisibilityThresholdsKt.f2404a;
        SpringSpec c2 = AnimationSpecKt.c(0.0f, 0.0f, new Dp(0.1f), 3);
        composer.D();
        return c2;
    }
}
