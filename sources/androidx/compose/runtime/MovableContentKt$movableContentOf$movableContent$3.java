package androidx.compose.runtime;

import d0.b0;
import d0.k;
import kotlin.jvm.internal.r;
import q0.q;

/* loaded from: classes.dex */
final class MovableContentKt$movableContentOf$movableContent$3 extends r implements q {
    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        k kVar = (k) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= (intValue & 8) == 0 ? composer.I(kVar) : composer.w(kVar) ? 4 : 2;
        }
        if ((intValue & 19) == 18 && composer.i()) {
            composer.A();
            return b0.f30125a;
        }
        k kVar2 = (k) kVar.f30134a;
        Object obj4 = kVar2.f30134a;
        Object obj5 = kVar2.f30135b;
        throw null;
    }
}
