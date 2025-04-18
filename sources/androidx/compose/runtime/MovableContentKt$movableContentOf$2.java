package androidx.compose.runtime;

import d0.b0;
import kotlin.jvm.internal.r;
import q0.q;

/* loaded from: classes.dex */
final class MovableContentKt$movableContentOf$2 extends r implements q {
    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= (intValue & 8) == 0 ? composer.I(obj) : composer.w(obj) ? 4 : 2;
        }
        if ((intValue & 19) == 18 && composer.i()) {
            composer.A();
        } else {
            composer.k(obj);
        }
        return b0.f30125a;
    }
}
