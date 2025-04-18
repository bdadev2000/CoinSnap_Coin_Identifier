package v8;

import com.google.common.collect.s1;
import com.google.common.collect.u1;
import com.google.common.collect.v1;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import s7.x2;

/* loaded from: classes3.dex */
public final class j0 extends j {

    /* renamed from: r, reason: collision with root package name */
    public static final s7.j1 f26171r;

    /* renamed from: k, reason: collision with root package name */
    public final a[] f26172k;

    /* renamed from: l, reason: collision with root package name */
    public final x2[] f26173l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f26174m;

    /* renamed from: n, reason: collision with root package name */
    public final com.facebook.internal.m f26175n;

    /* renamed from: o, reason: collision with root package name */
    public int f26176o;

    /* renamed from: p, reason: collision with root package name */
    public long[][] f26177p;

    /* renamed from: q, reason: collision with root package name */
    public i0 f26178q;

    static {
        s7.w0 w0Var = new s7.w0();
        w0Var.a = "MergingMediaSource";
        f26171r = w0Var.a();
    }

    public j0(a... aVarArr) {
        com.facebook.internal.m mVar = new com.facebook.internal.m();
        this.f26172k = aVarArr;
        this.f26175n = mVar;
        this.f26174m = new ArrayList(Arrays.asList(aVarArr));
        this.f26176o = -1;
        this.f26173l = new x2[aVarArr.length];
        this.f26177p = new long[0];
        new HashMap();
        a6.k.j(8, "expectedKeys");
        s1 s1Var = new s1();
        a6.k.j(2, "expectedValuesPerKey");
        new v1(s1Var.j(), new u1(2));
    }

    @Override // v8.a
    public final w a(z zVar, m9.q qVar, long j3) {
        a[] aVarArr = this.f26172k;
        int length = aVarArr.length;
        w[] wVarArr = new w[length];
        x2[] x2VarArr = this.f26173l;
        int b3 = x2VarArr[0].b(zVar.a);
        for (int i10 = 0; i10 < length; i10++) {
            wVarArr[i10] = aVarArr[i10].a(zVar.b(x2VarArr[i10].l(b3)), qVar, j3 - this.f26177p[b3][i10]);
        }
        return new h0(this.f26175n, this.f26177p[b3], wVarArr);
    }

    @Override // v8.a
    public final s7.j1 g() {
        a[] aVarArr = this.f26172k;
        return aVarArr.length > 0 ? aVarArr[0].g() : f26171r;
    }

    @Override // v8.j, v8.a
    public final void i() {
        i0 i0Var = this.f26178q;
        if (i0Var == null) {
            super.i();
            return;
        }
        throw i0Var;
    }

    @Override // v8.a
    public final void k(m9.w0 w0Var) {
        this.f26170j = w0Var;
        this.f26169i = n9.h0.j(null);
        int i10 = 0;
        while (true) {
            a[] aVarArr = this.f26172k;
            if (i10 < aVarArr.length) {
                v(Integer.valueOf(i10), aVarArr[i10]);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // v8.a
    public final void m(w wVar) {
        h0 h0Var = (h0) wVar;
        int i10 = 0;
        while (true) {
            a[] aVarArr = this.f26172k;
            if (i10 < aVarArr.length) {
                a aVar = aVarArr[i10];
                w wVar2 = h0Var.f26140b[i10];
                if (wVar2 instanceof f0) {
                    wVar2 = ((f0) wVar2).f26106b;
                }
                aVar.m(wVar2);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // v8.j, v8.a
    public final void o() {
        super.o();
        Arrays.fill(this.f26173l, (Object) null);
        this.f26176o = -1;
        this.f26178q = null;
        ArrayList arrayList = this.f26174m;
        arrayList.clear();
        Collections.addAll(arrayList, this.f26172k);
    }

    @Override // v8.j
    public final z r(Object obj, z zVar) {
        if (((Integer) obj).intValue() != 0) {
            return null;
        }
        return zVar;
    }

    @Override // v8.j
    public final void u(Object obj, a aVar, x2 x2Var) {
        Integer num = (Integer) obj;
        if (this.f26178q == null) {
            if (this.f26176o == -1) {
                this.f26176o = x2Var.h();
            } else if (x2Var.h() != this.f26176o) {
                this.f26178q = new i0(0);
                return;
            }
            int length = this.f26177p.length;
            x2[] x2VarArr = this.f26173l;
            if (length == 0) {
                this.f26177p = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.f26176o, x2VarArr.length);
            }
            ArrayList arrayList = this.f26174m;
            arrayList.remove(aVar);
            x2VarArr[num.intValue()] = x2Var;
            if (arrayList.isEmpty()) {
                l(x2VarArr[0]);
            }
        }
    }
}
