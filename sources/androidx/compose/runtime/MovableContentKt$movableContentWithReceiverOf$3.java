package androidx.compose.runtime;

import d0.b0;
import d0.k;
import kotlin.jvm.internal.r;
import q0.s;

/* loaded from: classes.dex */
final class MovableContentKt$movableContentWithReceiverOf$3 extends r implements s {
    @Override // q0.s
    public final Object k(Object obj, Object obj2, Object obj3, Composer composer, Integer num) {
        int i2;
        int intValue = num.intValue();
        if ((intValue & 6) == 0) {
            i2 = ((intValue & 8) == 0 ? composer.I(obj) : composer.w(obj) ? 4 : 2) | intValue;
        } else {
            i2 = intValue;
        }
        if ((intValue & 48) == 0) {
            i2 |= (intValue & 64) == 0 ? composer.I(obj2) : composer.w(obj2) ? 32 : 16;
        }
        if ((intValue & 384) == 0) {
            i2 |= (intValue & 512) == 0 ? composer.I(obj3) : composer.w(obj3) ? 256 : 128;
        }
        if ((i2 & 1171) == 1170 && composer.i()) {
            composer.A();
        } else {
            composer.k(new k(new k(obj, obj2), obj3));
        }
        return b0.f30125a;
    }
}
