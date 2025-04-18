package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import b1.d0;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1", f = "Scrollable.kt", l = {477}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ScrollableNode$onKeyEvent$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f3463a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScrollableNode f3464b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f3465c;

    /* JADX INFO: Access modifiers changed from: package-private */
    @e(c = "androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1$1", f = "Scrollable.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass1 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f3466a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f3467b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j2, g gVar) {
            super(2, gVar);
            this.f3467b = j2;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f3467b, gVar);
            anonymousClass1.f3466a = obj;
            return anonymousClass1;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((NestedScrollScope) obj, (g) obj2);
            b0 b0Var = b0.f30125a;
            anonymousClass1.invokeSuspend(b0Var);
            return b0Var;
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f30806a;
            q.m(obj);
            ((NestedScrollScope) this.f3466a).a(this.f3467b);
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableNode$onKeyEvent$1(ScrollableNode scrollableNode, long j2, g gVar) {
        super(2, gVar);
        this.f3464b = scrollableNode;
        this.f3465c = j2;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new ScrollableNode$onKeyEvent$1(this.f3464b, this.f3465c, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((ScrollableNode$onKeyEvent$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        int i2 = this.f3463a;
        if (i2 == 0) {
            q.m(obj);
            ScrollingLogic scrollingLogic = this.f3464b.D;
            MutatePriority mutatePriority = MutatePriority.f2812b;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f3465c, null);
            this.f3463a = 1;
            if (scrollingLogic.e(mutatePriority, anonymousClass1, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        return b0.f30125a;
    }
}
