package e0;

import Q7.InterfaceC0253v;
import y7.AbstractC2960i;

/* loaded from: classes.dex */
public final class l extends AbstractC2960i implements F7.p {

    /* renamed from: g, reason: collision with root package name */
    public F7.p f19979g;

    /* renamed from: h, reason: collision with root package name */
    public int f19980h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ U4.y f19981i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(U4.y yVar, w7.f fVar) {
        super(2, fVar);
        this.f19981i = yVar;
    }

    @Override // y7.AbstractC2952a
    public final w7.f c(Object obj, w7.f fVar) {
        return new l(this.f19981i, fVar);
    }

    @Override // F7.p
    public final Object g(Object obj, Object obj2) {
        return ((l) c((InterfaceC0253v) obj, (w7.f) obj2)).i(t7.y.f23029a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0062  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0055 -> B:6:0x0058). Please report as a decompilation issue!!! */
    @Override // y7.AbstractC2952a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(java.lang.Object r7) {
        /*
            r6 = this;
            x7.a r0 = x7.EnumC2928a.b
            int r1 = r6.f19980h
            r2 = 2
            r3 = 1
            U4.y r4 = r6.f19981i
            if (r1 == 0) goto L20
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            t7.AbstractC2712a.f(r7)
            goto L58
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            F7.p r1 = r6.f19979g
            t7.AbstractC2712a.f(r7)
            goto L4c
        L20:
            t7.AbstractC2712a.f(r7)
            java.lang.Object r7 = r4.f3336d
            java.util.concurrent.atomic.AtomicInteger r7 = (java.util.concurrent.atomic.AtomicInteger) r7
            int r7 = r7.get()
            if (r7 <= 0) goto L65
        L2d:
            java.lang.Object r7 = r4.f3334a
            Q7.v r7 = (Q7.InterfaceC0253v) r7
            w7.k r7 = r7.k()
            Q7.AbstractC0255x.e(r7)
            java.lang.Object r7 = r4.b
            r1 = r7
            F7.p r1 = (F7.p) r1
            r6.f19979g = r1
            r6.f19980h = r3
            java.lang.Object r7 = r4.f3335c
            S7.c r7 = (S7.c) r7
            java.lang.Object r7 = r7.y(r6)
            if (r7 != r0) goto L4c
            return r0
        L4c:
            r5 = 0
            r6.f19979g = r5
            r6.f19980h = r2
            java.lang.Object r7 = r1.g(r7, r6)
            if (r7 != r0) goto L58
            return r0
        L58:
            java.lang.Object r7 = r4.f3336d
            java.util.concurrent.atomic.AtomicInteger r7 = (java.util.concurrent.atomic.AtomicInteger) r7
            int r7 = r7.decrementAndGet()
            if (r7 != 0) goto L2d
            t7.y r7 = t7.y.f23029a
            return r7
        L65:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.l.i(java.lang.Object):java.lang.Object");
    }
}
