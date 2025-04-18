package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.runtime.Composer;
import d0.b0;
import kotlin.jvm.internal.r;
import org.objectweb.asm.Opcodes;

/* loaded from: classes2.dex */
final class LazyStaggeredGridIntervalContent$item$4 extends r implements q0.r {
    @Override // q0.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        LazyStaggeredGridItemScope lazyStaggeredGridItemScope = (LazyStaggeredGridItemScope) obj;
        ((Number) obj2).intValue();
        Composer composer = (Composer) obj3;
        int intValue = ((Number) obj4).intValue();
        if ((intValue & 6) == 0) {
            intValue |= composer.I(lazyStaggeredGridItemScope) ? 4 : 2;
        }
        if ((intValue & Opcodes.LXOR) != 130 || !composer.i()) {
            throw null;
        }
        composer.A();
        return b0.f30125a;
    }
}
