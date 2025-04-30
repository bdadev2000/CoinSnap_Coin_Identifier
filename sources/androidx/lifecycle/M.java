package androidx.lifecycle;

import Q7.InterfaceC0253v;
import y7.AbstractC2960i;

/* loaded from: classes.dex */
public final class M extends AbstractC2960i implements F7.p {

    /* renamed from: g, reason: collision with root package name */
    public G7.r f4850g;

    /* renamed from: h, reason: collision with root package name */
    public G7.r f4851h;

    /* renamed from: i, reason: collision with root package name */
    public int f4852i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ AbstractC0505o f4853j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ EnumC0504n f4854k;
    public final /* synthetic */ InterfaceC0253v l;
    public final /* synthetic */ F7.p m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(AbstractC0505o abstractC0505o, EnumC0504n enumC0504n, InterfaceC0253v interfaceC0253v, F7.p pVar, w7.f fVar) {
        super(2, fVar);
        this.f4853j = abstractC0505o;
        this.f4854k = enumC0504n;
        this.l = interfaceC0253v;
        this.m = pVar;
    }

    @Override // y7.AbstractC2952a
    public final w7.f c(Object obj, w7.f fVar) {
        return new M(this.f4853j, this.f4854k, this.l, this.m, fVar);
    }

    @Override // F7.p
    public final Object g(Object obj, Object obj2) {
        return ((M) c((InterfaceC0253v) obj, (w7.f) obj2)).i(t7.y.f23029a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a5  */
    /* JADX WARN: Type inference failed for: r2v4, types: [G7.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [G7.r, java.lang.Object] */
    @Override // y7.AbstractC2952a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(java.lang.Object r18) {
        /*
            r17 = this;
            r1 = r17
            x7.a r0 = x7.EnumC2928a.b
            int r2 = r1.f4852i
            t7.y r3 = t7.y.f23029a
            androidx.lifecycle.o r5 = r1.f4853j
            r6 = 1
            if (r2 == 0) goto L22
            if (r2 != r6) goto L1a
            G7.r r2 = r1.f4851h
            G7.r r6 = r1.f4850g
            t7.AbstractC2712a.f(r18)     // Catch: java.lang.Throwable -> L17
            goto L7e
        L17:
            r0 = move-exception
            goto L95
        L1a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L22:
            t7.AbstractC2712a.f(r18)
            r2 = r5
            androidx.lifecycle.x r2 = (androidx.lifecycle.C0513x) r2
            androidx.lifecycle.n r2 = r2.f4904d
            androidx.lifecycle.n r7 = androidx.lifecycle.EnumC0504n.b
            if (r2 != r7) goto L2f
            return r3
        L2f:
            G7.r r2 = new G7.r
            r2.<init>()
            G7.r r7 = new G7.r
            r7.<init>()
            androidx.lifecycle.n r8 = r1.f4854k     // Catch: java.lang.Throwable -> L92
            Q7.v r11 = r1.l     // Catch: java.lang.Throwable -> L92
            F7.p r15 = r1.m     // Catch: java.lang.Throwable -> L92
            r1.f4850g = r2     // Catch: java.lang.Throwable -> L92
            r1.f4851h = r7     // Catch: java.lang.Throwable -> L92
            r1.f4852i = r6     // Catch: java.lang.Throwable -> L92
            Q7.f r14 = new Q7.f     // Catch: java.lang.Throwable -> L92
            w7.f r9 = F2.h.x(r17)     // Catch: java.lang.Throwable -> L92
            r14.<init>(r6, r9)     // Catch: java.lang.Throwable -> L92
            r14.t()     // Catch: java.lang.Throwable -> L92
            androidx.lifecycle.k r6 = androidx.lifecycle.EnumC0503m.Companion     // Catch: java.lang.Throwable -> L92
            r6.getClass()     // Catch: java.lang.Throwable -> L92
            androidx.lifecycle.m r9 = androidx.lifecycle.C0501k.c(r8)     // Catch: java.lang.Throwable -> L92
            androidx.lifecycle.m r12 = androidx.lifecycle.C0501k.a(r8)     // Catch: java.lang.Throwable -> L92
            Y7.d r6 = new Y7.d     // Catch: java.lang.Throwable -> L92
            r8 = 0
            r6.<init>(r8)     // Catch: java.lang.Throwable -> L92
            androidx.lifecycle.L r13 = new androidx.lifecycle.L     // Catch: java.lang.Throwable -> L92
            r8 = r13
            r10 = r2
            r4 = r13
            r13 = r14
            r16 = r14
            r14 = r6
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L92
            r7.b = r4     // Catch: java.lang.Throwable -> L92
            r5.a(r4)     // Catch: java.lang.Throwable -> L92
            java.lang.Object r4 = r16.s()     // Catch: java.lang.Throwable -> L92
            if (r4 != r0) goto L7c
            return r0
        L7c:
            r6 = r2
            r2 = r7
        L7e:
            java.lang.Object r0 = r6.b
            Q7.U r0 = (Q7.U) r0
            if (r0 == 0) goto L88
            r4 = 0
            r0.a(r4)
        L88:
            java.lang.Object r0 = r2.b
            androidx.lifecycle.t r0 = (androidx.lifecycle.InterfaceC0509t) r0
            if (r0 == 0) goto L91
            r5.b(r0)
        L91:
            return r3
        L92:
            r0 = move-exception
            r6 = r2
            r2 = r7
        L95:
            java.lang.Object r3 = r6.b
            Q7.U r3 = (Q7.U) r3
            if (r3 == 0) goto L9f
            r4 = 0
            r3.a(r4)
        L9f:
            java.lang.Object r2 = r2.b
            androidx.lifecycle.t r2 = (androidx.lifecycle.InterfaceC0509t) r2
            if (r2 == 0) goto La8
            r5.b(r2)
        La8:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.M.i(java.lang.Object):java.lang.Object");
    }
}
