package androidx.compose.foundation.lazy;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ScrollScope;
import b1.d0;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.compose.foundation.lazy.LazyListState$requestScrollToItem$1", f = "LazyListState.kt", l = {338}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class LazyListState$requestScrollToItem$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f4417a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LazyListState f4418b;

    /* JADX INFO: Access modifiers changed from: package-private */
    @e(c = "androidx.compose.foundation.lazy.LazyListState$requestScrollToItem$1$1", f = "LazyListState.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.lazy.LazyListState$requestScrollToItem$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 extends i implements p {
        @Override // j0.a
        public final g create(Object obj, g gVar) {
            return new i(2, gVar);
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((ScrollScope) obj, (g) obj2);
            b0 b0Var = b0.f30125a;
            anonymousClass1.invokeSuspend(b0Var);
            return b0Var;
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f30806a;
            q.m(obj);
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyListState$requestScrollToItem$1(LazyListState lazyListState, g gVar) {
        super(2, gVar);
        this.f4418b = lazyListState;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new LazyListState$requestScrollToItem$1(this.f4418b, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((LazyListState$requestScrollToItem$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [j0.i, q0.p] */
    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        int i2 = this.f4417a;
        if (i2 == 0) {
            q.m(obj);
            ?? iVar = new i(2, null);
            this.f4417a = 1;
            if (this.f4418b.b(MutatePriority.f2811a, iVar, this) == aVar) {
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
