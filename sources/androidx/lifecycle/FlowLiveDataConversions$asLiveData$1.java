package androidx.lifecycle;

import d0.b0;
import e1.h;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.lifecycle.FlowLiveDataConversions$asLiveData$1", f = "FlowLiveData.kt", l = {78}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class FlowLiveDataConversions$asLiveData$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f19979a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f19980b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f19981c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowLiveDataConversions$asLiveData$1(h hVar, g gVar) {
        super(2, gVar);
        this.f19981c = hVar;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        FlowLiveDataConversions$asLiveData$1 flowLiveDataConversions$asLiveData$1 = new FlowLiveDataConversions$asLiveData$1(this.f19981c, gVar);
        flowLiveDataConversions$asLiveData$1.f19980b = obj;
        return flowLiveDataConversions$asLiveData$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((FlowLiveDataConversions$asLiveData$1) create((LiveDataScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f19979a;
        if (i2 == 0) {
            q.m(obj);
            final LiveDataScope liveDataScope = (LiveDataScope) this.f19980b;
            e1.i iVar = new e1.i() { // from class: androidx.lifecycle.FlowLiveDataConversions$asLiveData$1.1
                @Override // e1.i
                public final Object emit(Object obj2, g gVar) {
                    Object emit = LiveDataScope.this.emit(obj2, gVar);
                    return emit == i0.a.f30806a ? emit : b0.f30125a;
                }
            };
            this.f19979a = 1;
            if (this.f19981c.collect(iVar, this) == aVar) {
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
