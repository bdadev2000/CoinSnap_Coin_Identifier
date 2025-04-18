package y0;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o extends b1 {

    /* renamed from: c, reason: collision with root package name */
    public List f27814c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u0 f27815d;

    public o(u0 u0Var, List initTasksList) {
        Intrinsics.checkNotNullParameter(initTasksList, "initTasksList");
        this.f27815d = u0Var;
        this.f27814c = CollectionsKt.toList(initTasksList);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // y0.b1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof y0.k
            if (r0 == 0) goto L13
            r0 = r7
            y0.k r0 = (y0.k) r0
            int r1 = r0.f27777f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27777f = r1
            goto L18
        L13:
            y0.k r0 = new y0.k
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f27775c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f27777f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            y0.o r0 = r0.f27774b
            kotlin.ResultKt.throwOnFailure(r7)
            goto L65
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L36:
            y0.o r0 = r0.f27774b
            kotlin.ResultKt.throwOnFailure(r7)
            goto L75
        L3c:
            kotlin.ResultKt.throwOnFailure(r7)
            java.util.List r7 = r6.f27814c
            y0.u0 r2 = r6.f27815d
            if (r7 == 0) goto L68
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7)
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L4f
            goto L68
        L4f:
            y0.i1 r7 = r2.e()
            y0.n r4 = new y0.n
            r5 = 0
            r4.<init>(r2, r6, r5)
            r0.f27774b = r6
            r0.f27777f = r3
            java.lang.Object r7 = r7.b(r4, r0)
            if (r7 != r1) goto L64
            return r1
        L64:
            r0 = r6
        L65:
            y0.d r7 = (y0.d) r7
            goto L77
        L68:
            r0.f27774b = r6
            r0.f27777f = r4
            r7 = 0
            java.lang.Object r7 = y0.u0.d(r2, r7, r0)
            if (r7 != r1) goto L74
            return r1
        L74:
            r0 = r6
        L75:
            y0.d r7 = (y0.d) r7
        L77:
            y0.u0 r0 = r0.f27815d
            kc.c r0 = r0.f27856g
            r0.v(r7)
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.o.a(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
