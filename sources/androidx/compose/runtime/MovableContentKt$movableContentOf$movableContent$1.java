package androidx.compose.runtime;

import d0.b0;
import kotlin.jvm.internal.r;
import q0.q;

/* loaded from: classes.dex */
final class MovableContentKt$movableContentOf$movableContent$1 extends r implements q {
    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        if ((((Number) obj3).intValue() & 17) != 16 || !composer.i()) {
            throw null;
        }
        composer.A();
        return b0.f30125a;
    }
}
