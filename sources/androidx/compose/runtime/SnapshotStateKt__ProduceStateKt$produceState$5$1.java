package androidx.compose.runtime;

import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$5$1", f = "ProduceState.kt", l = {219}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SnapshotStateKt__ProduceStateKt$produceState$5$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f14046a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f14047b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f14048c;
    public final /* synthetic */ MutableState d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotStateKt__ProduceStateKt$produceState$5$1(p pVar, MutableState mutableState, g gVar) {
        super(2, gVar);
        this.f14048c = pVar;
        this.d = mutableState;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        SnapshotStateKt__ProduceStateKt$produceState$5$1 snapshotStateKt__ProduceStateKt$produceState$5$1 = new SnapshotStateKt__ProduceStateKt$produceState$5$1(this.f14048c, this.d, gVar);
        snapshotStateKt__ProduceStateKt$produceState$5$1.f14047b = obj;
        return snapshotStateKt__ProduceStateKt$produceState$5$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((SnapshotStateKt__ProduceStateKt$produceState$5$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f14046a;
        if (i2 == 0) {
            q.m(obj);
            ProduceStateScopeImpl produceStateScopeImpl = new ProduceStateScopeImpl(this.d, ((d0) this.f14047b).getCoroutineContext());
            this.f14046a = 1;
            if (this.f14048c.invoke(produceStateScopeImpl, this) == aVar) {
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
