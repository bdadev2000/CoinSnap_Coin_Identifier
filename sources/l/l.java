package l;

import android.content.Context;
import java.util.List;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final q.j f31005a;

    /* renamed from: b, reason: collision with root package name */
    public final List f31006b;

    /* renamed from: c, reason: collision with root package name */
    public final int f31007c;
    public final q.j d;
    public final r.g e;

    /* renamed from: f, reason: collision with root package name */
    public final f.e f31008f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f31009g;

    public l(q.j jVar, List list, int i2, q.j jVar2, r.g gVar, f.e eVar, boolean z2) {
        this.f31005a = jVar;
        this.f31006b = list;
        this.f31007c = i2;
        this.d = jVar2;
        this.e = gVar;
        this.f31008f = eVar;
        this.f31009g = z2;
    }

    public final void a(q.j jVar, j jVar2) {
        Context context = jVar.f31291a;
        q.j jVar3 = this.f31005a;
        if (context != jVar3.f31291a) {
            throw new IllegalStateException(("Interceptor '" + jVar2 + "' cannot modify the request's context.").toString());
        }
        if (jVar.f31292b == q.l.f31313a) {
            throw new IllegalStateException(("Interceptor '" + jVar2 + "' cannot set the request's data to null.").toString());
        }
        if (jVar.f31293c != jVar3.f31293c) {
            throw new IllegalStateException(("Interceptor '" + jVar2 + "' cannot modify the request's target.").toString());
        }
        if (jVar.A != jVar3.A) {
            throw new IllegalStateException(("Interceptor '" + jVar2 + "' cannot modify the request's lifecycle.").toString());
        }
        if (jVar.B == jVar3.B) {
            return;
        }
        throw new IllegalStateException(("Interceptor '" + jVar2 + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(q.j r13, h0.g r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof l.k
            if (r0 == 0) goto L13
            r0 = r14
            l.k r0 = (l.k) r0
            int r1 = r0.f31004f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31004f = r1
            goto L18
        L13:
            l.k r0 = new l.k
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.f31003c
            i0.a r1 = i0.a.f30806a
            int r2 = r0.f31004f
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            l.j r13 = r0.f31002b
            l.l r0 = r0.f31001a
            kotlin.jvm.internal.q.m(r14)
            goto L71
        L2b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L33:
            kotlin.jvm.internal.q.m(r14)
            java.util.List r14 = r12.f31006b
            int r2 = r12.f31007c
            if (r2 <= 0) goto L47
            int r4 = r2 + (-1)
            java.lang.Object r4 = r14.get(r4)
            l.j r4 = (l.j) r4
            r12.a(r13, r4)
        L47:
            java.lang.Object r14 = r14.get(r2)
            l.j r14 = (l.j) r14
            int r7 = r2 + 1
            r.g r9 = r12.e
            l.l r2 = new l.l
            q.j r5 = r12.f31005a
            java.util.List r6 = r12.f31006b
            f.e r10 = r12.f31008f
            boolean r11 = r12.f31009g
            r4 = r2
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r0.f31001a = r12
            r0.f31002b = r14
            r0.f31004f = r3
            r13 = r14
            l.i r13 = (l.i) r13
            java.lang.Object r14 = r13.d(r2, r0)
            if (r14 != r1) goto L70
            return r1
        L70:
            r0 = r12
        L71:
            q.k r14 = (q.k) r14
            q.j r1 = r14.b()
            r0.a(r1, r13)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: l.l.b(q.j, h0.g):java.lang.Object");
    }
}
