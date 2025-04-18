package androidx.compose.runtime;

import d0.b0;
import d0.k;
import kotlin.jvm.internal.r;
import org.objectweb.asm.Opcodes;

/* loaded from: classes.dex */
final class MovableContentKt$movableContentWithReceiverOf$2 extends r implements q0.r {
    @Override // q0.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i2;
        Composer composer = (Composer) obj3;
        int intValue = ((Number) obj4).intValue();
        if ((intValue & 6) == 0) {
            i2 = ((intValue & 8) == 0 ? composer.I(obj) : composer.w(obj) ? 4 : 2) | intValue;
        } else {
            i2 = intValue;
        }
        if ((intValue & 48) == 0) {
            i2 |= (intValue & 64) == 0 ? composer.I(obj2) : composer.w(obj2) ? 32 : 16;
        }
        if ((i2 & Opcodes.I2S) == 146 && composer.i()) {
            composer.A();
        } else {
            composer.k(new k(obj, obj2));
        }
        return b0.f30125a;
    }
}
