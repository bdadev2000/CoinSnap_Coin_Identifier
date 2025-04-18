package androidx.compose.animation.core;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.jvm.internal.r;
import q0.q;

/* loaded from: classes4.dex */
public final class TransitionKt$animateIntSize$1 extends r implements q {
    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        composer.J(967893300);
        SpringSpec c2 = AnimationSpecKt.c(0.0f, 0.0f, new IntSize(IntSizeKt.a(1, 1)), 3);
        composer.D();
        return c2;
    }
}
