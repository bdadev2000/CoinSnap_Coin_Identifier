package androidx.compose.runtime;

import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* renamed from: androidx.compose.runtime.ComposableSingletons$RecomposerKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$RecomposerKt$lambda1$1 extends r implements p {
    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        }
        return b0.f30125a;
    }
}
