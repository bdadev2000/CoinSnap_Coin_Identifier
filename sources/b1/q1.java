package b1;

/* loaded from: classes2.dex */
public final class q1 extends j0.h implements q0.p {

    /* renamed from: a, reason: collision with root package name */
    public v1 f22364a;

    /* renamed from: b, reason: collision with root package name */
    public g1.p f22365b;

    /* renamed from: c, reason: collision with root package name */
    public int f22366c;
    public /* synthetic */ Object d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r1 f22367f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(h0.g gVar, r1 r1Var) {
        super(gVar);
        this.f22367f = r1Var;
    }

    @Override // j0.a
    public final h0.g create(Object obj, h0.g gVar) {
        q1 q1Var = new q1(gVar, this.f22367f);
        q1Var.d = obj;
        return q1Var;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((q1) create((y0.l) obj, (h0.g) obj2)).invokeSuspend(d0.b0.f30125a);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0062  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0064 -> B:6:0x007b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0078 -> B:6:0x007b). Please report as a decompilation issue!!! */
    @Override // j0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            i0.a r0 = i0.a.f30806a
            int r1 = r7.f22366c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L25
            if (r1 == r3) goto L21
            if (r1 != r2) goto L19
            g1.p r1 = r7.f22365b
            b1.v1 r3 = r7.f22364a
            java.lang.Object r4 = r7.d
            y0.l r4 = (y0.l) r4
            kotlin.jvm.internal.q.m(r8)
            r8 = r7
            goto L7b
        L19:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L21:
            kotlin.jvm.internal.q.m(r8)
            goto L80
        L25:
            kotlin.jvm.internal.q.m(r8)
            java.lang.Object r8 = r7.d
            y0.l r8 = (y0.l) r8
            b1.r1 r1 = r7.f22367f
            java.lang.Object r1 = r1.T()
            boolean r4 = r1 instanceof b1.p
            if (r4 == 0) goto L40
            b1.p r1 = (b1.p) r1
            b1.q r1 = r1.f22360f
            r7.f22366c = r3
            r8.b(r1, r7)
            return r0
        L40:
            boolean r3 = r1 instanceof b1.d1
            if (r3 == 0) goto L80
            b1.d1 r1 = (b1.d1) r1
            b1.v1 r1 = r1.c()
            if (r1 == 0) goto L80
            java.lang.Object r3 = r1.q()
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            p0.a.q(r3, r4)
            g1.p r3 = (g1.p) r3
            r4 = r8
            r8 = r7
            r6 = r3
            r3 = r1
            r1 = r6
        L5c:
            boolean r5 = p0.a.g(r1, r3)
            if (r5 != 0) goto L80
            boolean r5 = r1 instanceof b1.p
            if (r5 == 0) goto L7b
            r5 = r1
            b1.p r5 = (b1.p) r5
            r8.d = r4
            r8.f22364a = r3
            r8.f22365b = r1
            r8.f22366c = r2
            b1.q r5 = r5.f22360f
            r4.b(r5, r8)
            i0.a r5 = i0.a.f30806a
            if (r5 != r0) goto L7b
            return r0
        L7b:
            g1.p r1 = r1.v()
            goto L5c
        L80:
            d0.b0 r8 = d0.b0.f30125a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.q1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
