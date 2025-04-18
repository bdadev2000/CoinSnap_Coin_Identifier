package androidx.compose.animation.core;

import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.r;
import q0.q;

/* loaded from: classes2.dex */
public final class TransitionKt$animateValue$1 extends r implements q {
    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        composer.J(-895531546);
        SpringSpec c2 = AnimationSpecKt.c(0.0f, 0.0f, null, 7);
        composer.D();
        return c2;
    }
}
