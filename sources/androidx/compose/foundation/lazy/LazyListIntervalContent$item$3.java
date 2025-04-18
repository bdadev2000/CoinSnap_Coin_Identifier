package androidx.compose.foundation.lazy;

import androidx.compose.runtime.Composer;
import d0.b0;
import kotlin.jvm.internal.r;
import org.objectweb.asm.Opcodes;
import q0.q;

/* loaded from: classes4.dex */
final class LazyListIntervalContent$item$3 extends r implements q0.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f4292a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyListIntervalContent$item$3(q qVar) {
        super(4);
        this.f4292a = qVar;
    }

    @Override // q0.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        LazyItemScope lazyItemScope = (LazyItemScope) obj;
        ((Number) obj2).intValue();
        Composer composer = (Composer) obj3;
        int intValue = ((Number) obj4).intValue();
        if ((intValue & 6) == 0) {
            intValue |= composer.I(lazyItemScope) ? 4 : 2;
        }
        if ((intValue & Opcodes.LXOR) == 130 && composer.i()) {
            composer.A();
        } else {
            this.f4292a.invoke(lazyItemScope, composer, Integer.valueOf(intValue & 14));
        }
        return b0.f30125a;
    }
}
