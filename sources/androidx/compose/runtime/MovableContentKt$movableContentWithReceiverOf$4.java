package androidx.compose.runtime;

import d0.b0;
import d0.k;
import kotlin.jvm.internal.r;
import org.objectweb.asm.Opcodes;
import q0.t;

/* loaded from: classes.dex */
final class MovableContentKt$movableContentWithReceiverOf$4 extends r implements t {
    @Override // q0.t
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int i2;
        Composer composer = (Composer) obj5;
        int intValue = ((Number) obj6).intValue();
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
        if ((intValue & 3072) == 0) {
            i2 |= (intValue & 4096) == 0 ? composer.I(obj4) : composer.w(obj4) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((i2 & 9363) == 9362 && composer.i()) {
            composer.A();
        } else {
            composer.k(new k(new k(obj, obj2), new k(obj3, obj4)));
        }
        return b0.f30125a;
    }
}
