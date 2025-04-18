package androidx.compose.animation.core;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import kotlin.jvm.internal.r;
import q0.q;

/* loaded from: classes3.dex */
public final class TransitionKt$animateOffset$1 extends r implements q {
    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        composer.J(1623385561);
        Rect rect = VisibilityThresholdsKt.f2404a;
        SpringSpec c2 = AnimationSpecKt.c(0.0f, 0.0f, new Offset(OffsetKt.a(0.5f, 0.5f)), 3);
        composer.D();
        return c2;
    }
}
