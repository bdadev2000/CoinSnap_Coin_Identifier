package androidx.compose.foundation.lazy;

import androidx.compose.runtime.Composer;
import d0.b0;
import kotlin.jvm.internal.r;
import org.objectweb.asm.Opcodes;

/* loaded from: classes4.dex */
public final class LazyDslKt$items$8 extends r implements q0.r {
    @Override // q0.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i2;
        LazyItemScope lazyItemScope = (LazyItemScope) obj;
        int intValue = ((Number) obj2).intValue();
        Composer composer = (Composer) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i2 = (composer.I(lazyItemScope) ? 4 : 2) | intValue2;
        } else {
            i2 = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i2 |= composer.c(intValue) ? 32 : 16;
        }
        if ((i2 & Opcodes.I2S) != 146 || !composer.i()) {
            throw null;
        }
        composer.A();
        return b0.f30125a;
    }
}
