package androidx.compose.runtime;

import b1.f0;
import b1.l;
import h0.g;
import j0.c;
import j0.e;
import kotlin.jvm.internal.q;

@e(c = "androidx.compose.runtime.ProduceStateScopeImpl", f = "ProduceState.kt", l = {224}, m = "awaitDispose")
/* loaded from: classes3.dex */
final class ProduceStateScopeImpl$awaitDispose$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public q0.a f13859a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f13860b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ProduceStateScopeImpl f13861c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProduceStateScopeImpl$awaitDispose$1(ProduceStateScopeImpl produceStateScopeImpl, g gVar) {
        super(gVar);
        this.f13861c = produceStateScopeImpl;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        ProduceStateScopeImpl$awaitDispose$1 produceStateScopeImpl$awaitDispose$1;
        q0.a aVar;
        Throwable th;
        this.f13860b = obj;
        this.d |= Integer.MIN_VALUE;
        ProduceStateScopeImpl produceStateScopeImpl = this.f13861c;
        produceStateScopeImpl.getClass();
        int i2 = this.d;
        if ((i2 & Integer.MIN_VALUE) != 0) {
            this.d = i2 - Integer.MIN_VALUE;
            produceStateScopeImpl$awaitDispose$1 = this;
        } else {
            produceStateScopeImpl$awaitDispose$1 = new ProduceStateScopeImpl$awaitDispose$1(produceStateScopeImpl, this);
        }
        Object obj2 = produceStateScopeImpl$awaitDispose$1.f13860b;
        i0.a aVar2 = i0.a.f30806a;
        int i3 = produceStateScopeImpl$awaitDispose$1.d;
        if (i3 == 0) {
            q.m(obj2);
            try {
                produceStateScopeImpl$awaitDispose$1.f13859a = null;
                produceStateScopeImpl$awaitDispose$1.d = 1;
                l lVar = new l(1, f0.r(produceStateScopeImpl$awaitDispose$1));
                lVar.p();
                if (lVar.o() == aVar2) {
                    return aVar2;
                }
                aVar = null;
            } catch (Throwable th2) {
                aVar = null;
                th = th2;
                aVar.invoke();
                throw th;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = produceStateScopeImpl$awaitDispose$1.f13859a;
            try {
                q.m(obj2);
            } catch (Throwable th3) {
                th = th3;
                aVar.invoke();
                throw th;
            }
        }
        throw new RuntimeException();
    }
}
