package androidx.datastore.core;

import b1.d0;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.datastore.core.SingleProcessDataStore$transformAndWrite$newData$1", f = "SingleProcessDataStore.kt", l = {402}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class SingleProcessDataStore$transformAndWrite$newData$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f19052a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f19053b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f19054c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$transformAndWrite$newData$1(Object obj, g gVar, p pVar) {
        super(2, gVar);
        this.f19053b = pVar;
        this.f19054c = obj;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new SingleProcessDataStore$transformAndWrite$newData$1(this.f19054c, gVar, this.f19053b);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((SingleProcessDataStore$transformAndWrite$newData$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        int i2 = this.f19052a;
        if (i2 == 0) {
            q.m(obj);
            this.f19052a = 1;
            obj = this.f19053b.invoke(this.f19054c, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        return obj;
    }
}
