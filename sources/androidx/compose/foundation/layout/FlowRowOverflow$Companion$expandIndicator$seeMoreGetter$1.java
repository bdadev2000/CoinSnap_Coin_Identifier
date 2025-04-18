package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;
import q0.q;

/* loaded from: classes3.dex */
final class FlowRowOverflow$Companion$expandIndicator$seeMoreGetter$1 extends r implements l {

    /* renamed from: androidx.compose.foundation.layout.FlowRowOverflow$Companion$expandIndicator$seeMoreGetter$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass1 extends r implements p {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q f4003a = null;

        public AnonymousClass1(FlowLayoutOverflowState flowLayoutOverflowState) {
            super(2);
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            Composer composer = (Composer) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
                composer.A();
            } else {
                this.f4003a.invoke(new FlowRowOverflowScopeImpl(), composer, 0);
            }
            return b0.f30125a;
        }
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1((FlowLayoutOverflowState) obj);
        Object obj2 = ComposableLambdaKt.f14482a;
        return new ComposableLambdaImpl(263270381, anonymousClass1, true);
    }
}
