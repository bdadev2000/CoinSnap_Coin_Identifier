package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;
import q0.q;

/* loaded from: classes2.dex */
final class ContextualFlowRowOverflow$Companion$expandOrCollapseIndicator$1$collapseGetter$1 extends r implements l {

    /* renamed from: androidx.compose.foundation.layout.ContextualFlowRowOverflow$Companion$expandOrCollapseIndicator$1$collapseGetter$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass1 extends r implements p {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q f3872a = null;

        public AnonymousClass1(FlowLayoutOverflowState flowLayoutOverflowState) {
            super(2);
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            Composer composer = (Composer) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
                composer.A();
            } else {
                this.f3872a.invoke(new ContextualFlowRowOverflowScopeImpl(), composer, 0);
            }
            return b0.f30125a;
        }
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1((FlowLayoutOverflowState) obj);
        Object obj2 = ComposableLambdaKt.f14482a;
        return new ComposableLambdaImpl(307858874, anonymousClass1, true);
    }
}
