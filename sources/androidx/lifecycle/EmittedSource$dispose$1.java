package androidx.lifecycle;

import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.lifecycle.EmittedSource$dispose$1", f = "CoroutineLiveData.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class EmittedSource$dispose$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ EmittedSource f19960a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmittedSource$dispose$1(EmittedSource emittedSource, g gVar) {
        super(2, gVar);
        this.f19960a = emittedSource;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new EmittedSource$dispose$1(this.f19960a, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((EmittedSource$dispose$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        throw null;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        q.m(obj);
        this.f19960a.getClass();
        throw null;
    }
}
