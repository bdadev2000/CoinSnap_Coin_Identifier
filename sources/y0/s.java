package y0;

import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes.dex */
public final class s implements FlowCollector {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27835b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f27836c;

    public /* synthetic */ s(Object obj, int i10) {
        this.f27835b = i10;
        this.f27836c = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            int r0 = r6.f27835b
            r1 = 1
            java.lang.Object r2 = r6.f27836c
            switch(r0) {
                case 0: goto L98;
                case 1: goto L29;
                case 2: goto La;
                default: goto L8;
            }
        L8:
            goto La8
        La:
            kotlin.Unit r7 = (kotlin.Unit) r7
            y0.u0 r2 = (y0.u0) r2
            kc.c r7 = r2.f27856g
            y0.j1 r7 = r7.q()
            boolean r7 = r7 instanceof y0.v0
            if (r7 != 0) goto L26
            java.lang.Object r7 = y0.u0.c(r2, r1, r8)
            java.lang.Object r8 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r7 != r8) goto L23
            goto L28
        L23:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            goto L28
        L26:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
        L28:
            return r7
        L29:
            boolean r0 = r8 instanceof y0.a0
            if (r0 == 0) goto L3c
            r0 = r8
            y0.a0 r0 = (y0.a0) r0
            int r3 = r0.f27685c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L3c
            int r3 = r3 - r4
            r0.f27685c = r3
            goto L41
        L3c:
            y0.a0 r0 = new y0.a0
            r0.<init>(r6, r8)
        L41:
            java.lang.Object r8 = r0.f27684b
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r0.f27685c
            if (r4 == 0) goto L59
            if (r4 != r1) goto L51
            kotlin.ResultKt.throwOnFailure(r8)
            goto L75
        L51:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L59:
            kotlin.ResultKt.throwOnFailure(r8)
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            y0.j1 r7 = (y0.j1) r7
            boolean r8 = r7 instanceof y0.y0
            if (r8 != 0) goto L93
            boolean r8 = r7 instanceof y0.d
            if (r8 == 0) goto L78
            y0.d r7 = (y0.d) r7
            java.lang.Object r7 = r7.f27701b
            r0.f27685c = r1
            java.lang.Object r7 = r2.emit(r7, r0)
            if (r7 != r3) goto L75
            goto L77
        L75:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
        L77:
            return r3
        L78:
            boolean r8 = r7 instanceof y0.v0
            if (r8 == 0) goto L7d
            goto L7f
        L7d:
            boolean r1 = r7 instanceof y0.n1
        L7f:
            if (r1 == 0) goto L8d
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L8d:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L93:
            y0.y0 r7 = (y0.y0) r7
            java.lang.Throwable r7 = r7.f27877b
            throw r7
        L98:
            kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
            java.lang.Object r7 = r2.send(r7, r8)
            java.lang.Object r8 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r7 != r8) goto La5
            goto La7
        La5:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
        La7:
            return r7
        La8:
            qc.p r7 = (qc.p) r7
            qc.g0 r2 = (qc.g0) r2
            java.util.concurrent.atomic.AtomicReference r8 = r2.f23804c
            r8.set(r7)
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.s.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
