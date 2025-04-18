package androidx.datastore.core;

import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.datastore.core.SimpleActor$offer$2", f = "SimpleActor.kt", l = {122, 122}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class SimpleActor$offer$2 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public p f18976a;

    /* renamed from: b, reason: collision with root package name */
    public int f18977b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SimpleActor f18978c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleActor$offer$2(SimpleActor simpleActor, g gVar) {
        super(2, gVar);
        this.f18978c = simpleActor;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new SimpleActor$offer$2(this.f18978c, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((SimpleActor$offer$2) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005a -> B:6:0x005c). Please report as a decompilation issue!!! */
    @Override // j0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            i0.a r0 = i0.a.f30806a
            int r1 = r7.f18977b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L19
            if (r1 != r2) goto L11
            kotlin.jvm.internal.q.m(r8)
            r8 = r7
            goto L5c
        L11:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L19:
            q0.p r1 = r7.f18976a
            kotlin.jvm.internal.q.m(r8)
            r4 = r1
            r1 = r0
            r0 = r7
            goto L4e
        L22:
            kotlin.jvm.internal.q.m(r8)
            androidx.datastore.core.SimpleActor r8 = r7.f18978c
            java.util.concurrent.atomic.AtomicInteger r8 = r8.d
            int r8 = r8.get()
            if (r8 <= 0) goto L69
            r8 = r7
        L30:
            androidx.datastore.core.SimpleActor r1 = r8.f18978c
            b1.d0 r4 = r1.f18970a
            h0.l r4 = r4.getCoroutineContext()
            kotlin.jvm.internal.e.l(r4)
            q0.p r4 = r1.f18971b
            r8.f18976a = r4
            r8.f18977b = r3
            d1.b r1 = r1.f18972c
            java.lang.Object r1 = r1.g(r8)
            if (r1 != r0) goto L4a
            return r0
        L4a:
            r6 = r0
            r0 = r8
            r8 = r1
            r1 = r6
        L4e:
            r5 = 0
            r0.f18976a = r5
            r0.f18977b = r2
            java.lang.Object r8 = r4.invoke(r8, r0)
            if (r8 != r1) goto L5a
            return r1
        L5a:
            r8 = r0
            r0 = r1
        L5c:
            androidx.datastore.core.SimpleActor r1 = r8.f18978c
            java.util.concurrent.atomic.AtomicInteger r1 = r1.d
            int r1 = r1.decrementAndGet()
            if (r1 != 0) goto L30
            d0.b0 r8 = d0.b0.f30125a
            return r8
        L69:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SimpleActor$offer$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
