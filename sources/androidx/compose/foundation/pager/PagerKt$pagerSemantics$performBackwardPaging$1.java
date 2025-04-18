package androidx.compose.foundation.pager;

import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import q0.p;

@e(c = "androidx.compose.foundation.pager.PagerKt$pagerSemantics$performBackwardPaging$1", f = "Pager.kt", l = {474}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PagerKt$pagerSemantics$performBackwardPaging$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f5190a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PagerState f5191b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerKt$pagerSemantics$performBackwardPaging$1(PagerState pagerState, g gVar) {
        super(2, gVar);
        this.f5191b = pagerState;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new PagerKt$pagerSemantics$performBackwardPaging$1(this.f5191b, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((PagerKt$pagerSemantics$performBackwardPaging$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        r5 = r5.f(r5.j() - 1, 0.0f, androidx.compose.animation.core.AnimationSpecKt.c(0.0f, 0.0f, null, 7), r4);
     */
    @Override // j0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            i0.a r0 = i0.a.f30806a
            int r1 = r4.f5190a
            d0.b0 r2 = d0.b0.f30125a
            r3 = 1
            if (r1 == 0) goto L17
            if (r1 != r3) goto Lf
            kotlin.jvm.internal.q.m(r5)
            goto L37
        Lf:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L17:
            kotlin.jvm.internal.q.m(r5)
            r4.f5190a = r3
            float r5 = androidx.compose.foundation.pager.PagerStateKt.f5306a
            androidx.compose.foundation.pager.PagerState r5 = r4.f5191b
            int r1 = r5.j()
            int r1 = r1 - r3
            if (r1 < 0) goto L33
            int r1 = r5.j()
            int r1 = r1 - r3
            java.lang.Object r5 = androidx.compose.foundation.pager.PagerState.g(r5, r1, r4)
            if (r5 != r0) goto L33
            goto L34
        L33:
            r5 = r2
        L34:
            if (r5 != r0) goto L37
            return r0
        L37:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerKt$pagerSemantics$performBackwardPaging$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
