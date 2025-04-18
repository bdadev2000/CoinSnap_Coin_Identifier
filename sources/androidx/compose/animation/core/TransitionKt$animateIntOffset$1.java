package androidx.compose.animation.core;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import kotlin.jvm.internal.r;
import q0.q;

/* loaded from: classes2.dex */
public final class TransitionKt$animateIntOffset$1 extends r implements q {
    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        composer.J(-1953479610);
        SpringSpec c2 = AnimationSpecKt.c(0.0f, 0.0f, new IntOffset(IntOffsetKt.a(1, 1)), 3);
        composer.D();
        return c2;
    }
}
