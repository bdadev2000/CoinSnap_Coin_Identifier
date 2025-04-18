package androidx.datastore.core;

import androidx.datastore.core.SingleProcessDataStore;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import q0.p;

@e(c = "androidx.datastore.core.SingleProcessDataStore$actor$3", f = "SingleProcessDataStore.kt", l = {239, 242}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SingleProcessDataStore$actor$3 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f19001a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f19002b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SingleProcessDataStore f19003c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$actor$3(SingleProcessDataStore singleProcessDataStore, g gVar) {
        super(2, gVar);
        this.f19003c = singleProcessDataStore;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        SingleProcessDataStore$actor$3 singleProcessDataStore$actor$3 = new SingleProcessDataStore$actor$3(this.f19003c, gVar);
        singleProcessDataStore$actor$3.f19002b = obj;
        return singleProcessDataStore$actor$3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((SingleProcessDataStore$actor$3) create((SingleProcessDataStore.Message) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        if (r7 == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        if (r7 == r0) goto L31;
     */
    @Override // j0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            i0.a r0 = i0.a.f30806a
            int r1 = r6.f19001a
            d0.b0 r2 = d0.b0.f30125a
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1b
            if (r1 == r4) goto L17
            if (r1 != r3) goto Lf
            goto L17
        Lf:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L17:
            kotlin.jvm.internal.q.m(r7)
            goto L7c
        L1b:
            kotlin.jvm.internal.q.m(r7)
            java.lang.Object r7 = r6.f19002b
            androidx.datastore.core.SingleProcessDataStore$Message r7 = (androidx.datastore.core.SingleProcessDataStore.Message) r7
            boolean r1 = r7 instanceof androidx.datastore.core.SingleProcessDataStore.Message.Read
            androidx.datastore.core.SingleProcessDataStore r5 = r6.f19003c
            if (r1 == 0) goto L6d
            androidx.datastore.core.SingleProcessDataStore$Message$Read r7 = (androidx.datastore.core.SingleProcessDataStore.Message.Read) r7
            r6.f19001a = r4
            e1.i1 r1 = r5.f18986h
            java.lang.Object r1 = r1.getValue()
            androidx.datastore.core.State r1 = (androidx.datastore.core.State) r1
            boolean r3 = r1 instanceof androidx.datastore.core.Data
            if (r3 == 0) goto L39
            goto L5d
        L39:
            boolean r3 = r1 instanceof androidx.datastore.core.ReadException
            if (r3 == 0) goto L4a
            androidx.datastore.core.State r7 = r7.f18994a
            if (r1 != r7) goto L48
            java.lang.Object r7 = r5.f(r6)
            if (r7 != r0) goto L48
            goto L5e
        L48:
            r7 = r2
            goto L5e
        L4a:
            androidx.datastore.core.UnInitialized r7 = androidx.datastore.core.UnInitialized.f19061a
            boolean r7 = p0.a.g(r1, r7)
            if (r7 == 0) goto L59
            java.lang.Object r7 = r5.f(r6)
            if (r7 != r0) goto L48
            goto L5e
        L59:
            boolean r7 = r1 instanceof androidx.datastore.core.Final
            if (r7 != 0) goto L61
        L5d:
            goto L48
        L5e:
            if (r7 != r0) goto L7c
            return r0
        L61:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Can't read in final state."
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L6d:
            boolean r1 = r7 instanceof androidx.datastore.core.SingleProcessDataStore.Message.Update
            if (r1 == 0) goto L7c
            androidx.datastore.core.SingleProcessDataStore$Message$Update r7 = (androidx.datastore.core.SingleProcessDataStore.Message.Update) r7
            r6.f19001a = r3
            java.lang.Object r7 = androidx.datastore.core.SingleProcessDataStore.b(r5, r7, r6)
            if (r7 != r0) goto L7c
            return r0
        L7c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore$actor$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
