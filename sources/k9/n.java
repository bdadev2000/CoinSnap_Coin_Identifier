package k9;

import com.google.common.collect.e0;
import com.google.common.collect.g0;
import com.google.common.collect.h2;
import com.google.common.collect.x1;
import com.google.common.collect.y1;
import n9.h0;

/* loaded from: classes3.dex */
public final class n extends m {

    /* renamed from: g, reason: collision with root package name */
    public final boolean f20447g;

    /* renamed from: h, reason: collision with root package name */
    public final h f20448h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f20449i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f20450j;

    /* renamed from: k, reason: collision with root package name */
    public final int f20451k;

    /* renamed from: l, reason: collision with root package name */
    public final int f20452l;

    /* renamed from: m, reason: collision with root package name */
    public final int f20453m;

    /* renamed from: n, reason: collision with root package name */
    public final int f20454n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f20455o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f20456p;

    /* renamed from: q, reason: collision with root package name */
    public final int f20457q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f20458r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f20459s;

    /* renamed from: t, reason: collision with root package name */
    public final int f20460t;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00d7 A[EDGE_INSN: B:133:0x00d7->B:70:0x00d7 BREAK  A[LOOP:0: B:62:0x00ba->B:131:0x00d4], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public n(int r5, v8.i1 r6, int r7, k9.h r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k9.n.<init>(int, v8.i1, int, k9.h, int, int, boolean):void");
    }

    public static int c(n nVar, n nVar2) {
        g0 c10 = g0.a.c(nVar.f20450j, nVar2.f20450j).a(nVar.f20454n, nVar2.f20454n).c(nVar.f20455o, nVar2.f20455o).c(nVar.f20447g, nVar2.f20447g).c(nVar.f20449i, nVar2.f20449i);
        Integer valueOf = Integer.valueOf(nVar.f20453m);
        Integer valueOf2 = Integer.valueOf(nVar2.f20453m);
        x1.f12053b.getClass();
        g0 b3 = c10.b(valueOf, valueOf2, h2.f11970b);
        boolean z10 = nVar2.f20458r;
        boolean z11 = nVar.f20458r;
        g0 c11 = b3.c(z11, z10);
        boolean z12 = nVar2.f20459s;
        boolean z13 = nVar.f20459s;
        g0 c12 = c11.c(z13, z12);
        if (z11 && z13) {
            c12 = c12.a(nVar.f20460t, nVar2.f20460t);
        }
        return c12.e();
    }

    public static int d(n nVar, n nVar2) {
        y1 b3;
        y1 y1Var;
        if (nVar.f20447g && nVar.f20450j) {
            b3 = o.f20461j;
        } else {
            b3 = o.f20461j.b();
        }
        e0 e0Var = g0.a;
        int i10 = nVar.f20451k;
        Integer valueOf = Integer.valueOf(i10);
        Integer valueOf2 = Integer.valueOf(nVar2.f20451k);
        if (nVar.f20448h.f20523y) {
            y1Var = o.f20461j.b();
        } else {
            y1Var = o.f20462k;
        }
        return e0Var.b(valueOf, valueOf2, y1Var).b(Integer.valueOf(nVar.f20452l), Integer.valueOf(nVar2.f20452l), b3).b(Integer.valueOf(i10), Integer.valueOf(nVar2.f20451k), b3).e();
    }

    @Override // k9.m
    public final int a() {
        return this.f20457q;
    }

    @Override // k9.m
    public final boolean b(m mVar) {
        n nVar = (n) mVar;
        if (this.f20456p || h0.a(this.f20446f.f24723n, nVar.f20446f.f24723n)) {
            if (!this.f20448h.F) {
                if (this.f20458r != nVar.f20458r || this.f20459s != nVar.f20459s) {
                }
            }
            return true;
        }
        return false;
    }
}
