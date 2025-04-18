package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composer;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;
import q0.q;

/* loaded from: classes3.dex */
final class FlowLayoutKt$FlowRow$list$1$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f3929a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowLayoutKt$FlowRow$list$1$1(q qVar) {
        super(2);
        this.f3929a = qVar;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            this.f3929a.invoke(FlowRowScopeInstance.f4007a, composer, 6);
        }
        return b0.f30125a;
    }
}
