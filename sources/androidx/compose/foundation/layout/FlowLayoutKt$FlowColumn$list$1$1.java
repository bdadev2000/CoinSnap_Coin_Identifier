package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composer;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;
import q0.q;

/* loaded from: classes.dex */
final class FlowLayoutKt$FlowColumn$list$1$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f3920a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowLayoutKt$FlowColumn$list$1$1(q qVar) {
        super(2);
        this.f3920a = qVar;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            this.f3920a.invoke(FlowColumnScopeInstance.f3899a, composer, 6);
        }
        return b0.f30125a;
    }
}
