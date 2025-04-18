package androidx.compose.runtime;

import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes.dex */
final class MovableContentKt$movableContentOf$1 extends r implements p {
    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int intValue = ((Number) obj2).intValue() & 3;
        b0 b0Var = b0.f30125a;
        if (intValue == 2 && composer.i()) {
            composer.A();
        } else {
            composer.k(b0Var);
        }
        return b0Var;
    }
}
