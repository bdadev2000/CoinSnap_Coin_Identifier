package x8;

import a4.g0;
import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import m9.i0;
import m9.j0;
import m9.k0;
import m9.l0;
import m9.n0;
import m9.q;
import m9.v0;
import n9.h0;
import s7.r0;
import v8.a1;
import v8.b1;
import v8.p;
import v8.u0;
import v8.y0;
import v8.z0;
import x7.u;
import y7.x;

/* loaded from: classes3.dex */
public final class j implements z0, b1, i0, l0 {

    /* renamed from: b, reason: collision with root package name */
    public final int f27535b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f27536c;

    /* renamed from: d, reason: collision with root package name */
    public final r0[] f27537d;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f27538f;

    /* renamed from: g, reason: collision with root package name */
    public final y8.a f27539g;

    /* renamed from: h, reason: collision with root package name */
    public final a1 f27540h;

    /* renamed from: i, reason: collision with root package name */
    public final f0.c f27541i;

    /* renamed from: j, reason: collision with root package name */
    public final ac.e f27542j;

    /* renamed from: k, reason: collision with root package name */
    public final n0 f27543k = new n0("ChunkSampleStream");

    /* renamed from: l, reason: collision with root package name */
    public final g0 f27544l = new g0(2);

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f27545m;

    /* renamed from: n, reason: collision with root package name */
    public final List f27546n;

    /* renamed from: o, reason: collision with root package name */
    public final y0 f27547o;

    /* renamed from: p, reason: collision with root package name */
    public final y0[] f27548p;

    /* renamed from: q, reason: collision with root package name */
    public final b f27549q;

    /* renamed from: r, reason: collision with root package name */
    public e f27550r;

    /* renamed from: s, reason: collision with root package name */
    public r0 f27551s;

    /* renamed from: t, reason: collision with root package name */
    public i f27552t;
    public long u;

    /* renamed from: v, reason: collision with root package name */
    public long f27553v;

    /* renamed from: w, reason: collision with root package name */
    public int f27554w;

    /* renamed from: x, reason: collision with root package name */
    public a f27555x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f27556y;

    public j(int i10, int[] iArr, r0[] r0VarArr, y8.m mVar, a1 a1Var, q qVar, long j3, u uVar, x7.q qVar2, ac.e eVar, f0.c cVar) {
        this.f27535b = i10;
        this.f27536c = iArr;
        this.f27537d = r0VarArr;
        this.f27539g = mVar;
        this.f27540h = a1Var;
        this.f27541i = cVar;
        this.f27542j = eVar;
        ArrayList arrayList = new ArrayList();
        this.f27545m = arrayList;
        this.f27546n = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f27548p = new y0[length];
        this.f27538f = new boolean[length];
        int i11 = length + 1;
        int[] iArr2 = new int[i11];
        y0[] y0VarArr = new y0[i11];
        uVar.getClass();
        qVar2.getClass();
        y0 y0Var = new y0(qVar, uVar, qVar2);
        this.f27547o = y0Var;
        int i12 = 0;
        iArr2[0] = i10;
        y0VarArr[0] = y0Var;
        while (i12 < length) {
            y0 y0Var2 = new y0(qVar, null, null);
            this.f27548p[i12] = y0Var2;
            int i13 = i12 + 1;
            y0VarArr[i13] = y0Var2;
            iArr2[i13] = this.f27536c[i12];
            i12 = i13;
        }
        this.f27549q = new b(iArr2, y0VarArr);
        this.u = j3;
        this.f27553v = j3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00bc, code lost:
    
        if (r3 == false) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x02a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0164 A[LOOP:1: B:91:0x015e->B:93:0x0164, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x018e A[LOOP:2: B:96:0x0188->B:98:0x018e, LOOP_END] */
    @Override // m9.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final j8.e a(m9.k0 r24, long r25, long r27, java.io.IOException r29, int r30) {
        /*
            Method dump skipped, instructions count: 724
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x8.j.a(m9.k0, long, long, java.io.IOException, int):j8.e");
    }

    @Override // m9.i0
    public final void b(k0 k0Var, long j3, long j10, boolean z10) {
        e eVar = (e) k0Var;
        this.f27550r = null;
        this.f27555x = null;
        long j11 = eVar.f27521b;
        v0 v0Var = eVar.f27529k;
        Uri uri = v0Var.f21778c;
        p pVar = new p(v0Var.f21779d);
        this.f27542j.getClass();
        this.f27541i.l(pVar, eVar.f27523d, this.f27535b, eVar.f27524f, eVar.f27525g, eVar.f27526h, eVar.f27527i, eVar.f27528j);
        if (!z10) {
            if (h()) {
                this.f27547o.t(false);
                for (y0 y0Var : this.f27548p) {
                    y0Var.t(false);
                }
            } else if (eVar instanceof a) {
                ArrayList arrayList = this.f27545m;
                e(arrayList.size() - 1);
                if (arrayList.isEmpty()) {
                    this.u = this.f27553v;
                }
            }
            this.f27540h.b(this);
        }
    }

    @Override // m9.i0
    public final void c(k0 k0Var, long j3, long j10) {
        e eVar = (e) k0Var;
        y7.f fVar = null;
        this.f27550r = null;
        y8.m mVar = (y8.m) this.f27539g;
        mVar.getClass();
        if (eVar instanceof l) {
            int b3 = mVar.f28095i.b(((l) eVar).f27524f);
            y8.k[] kVarArr = mVar.f28094h;
            y8.k kVar = kVarArr[b3];
            if (kVar.f28081d == null) {
                g gVar = kVar.a;
                x xVar = ((d) gVar).f27519j;
                if (xVar instanceof y7.f) {
                    fVar = (y7.f) xVar;
                }
                if (fVar != null) {
                    z8.m mVar2 = kVar.f28079b;
                    kVarArr[b3] = new y8.k(kVar.f28082e, mVar2, kVar.f28080c, gVar, kVar.f28083f, new androidx.recyclerview.widget.c(fVar, mVar2.f28637d, 5));
                }
            }
        }
        y8.p pVar = mVar.f28093g;
        if (pVar != null) {
            long j11 = pVar.f28111d;
            if (j11 == C.TIME_UNSET || eVar.f27528j > j11) {
                pVar.f28111d = eVar.f27528j;
            }
            pVar.f28112e.f28119i = true;
        }
        long j12 = eVar.f27521b;
        v0 v0Var = eVar.f27529k;
        Uri uri = v0Var.f21778c;
        p pVar2 = new p(v0Var.f21779d);
        this.f27542j.getClass();
        this.f27541i.n(pVar2, eVar.f27523d, this.f27535b, eVar.f27524f, eVar.f27525g, eVar.f27526h, eVar.f27527i, eVar.f27528j);
        this.f27540h.b(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00cc, code lost:
    
        if (r1 == false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01cb  */
    @Override // v8.b1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean continueLoading(long r56) {
        /*
            Method dump skipped, instructions count: 1118
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x8.j.continueLoading(long):boolean");
    }

    @Override // v8.z0
    public final int d(r4.c cVar, w7.i iVar, int i10) {
        if (h()) {
            return -3;
        }
        a aVar = this.f27555x;
        y0 y0Var = this.f27547o;
        if (aVar != null && aVar.a(0) <= y0Var.f26337q + y0Var.f26339s) {
            return -3;
        }
        i();
        return y0Var.s(cVar, iVar, i10, this.f27556y);
    }

    public final a e(int i10) {
        ArrayList arrayList = this.f27545m;
        a aVar = (a) arrayList.get(i10);
        int size = arrayList.size();
        int i11 = h0.a;
        if (i10 >= 0 && size <= arrayList.size() && i10 <= size) {
            if (i10 != size) {
                arrayList.subList(i10, size).clear();
            }
            this.f27554w = Math.max(this.f27554w, arrayList.size());
            int i12 = 0;
            this.f27547o.k(aVar.a(0));
            while (true) {
                y0[] y0VarArr = this.f27548p;
                if (i12 < y0VarArr.length) {
                    y0 y0Var = y0VarArr[i12];
                    i12++;
                    y0Var.k(aVar.a(i12));
                } else {
                    return aVar;
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final a f() {
        return (a) this.f27545m.get(r0.size() - 1);
    }

    public final boolean g(int i10) {
        y0 y0Var;
        a aVar = (a) this.f27545m.get(i10);
        y0 y0Var2 = this.f27547o;
        if (y0Var2.f26337q + y0Var2.f26339s > aVar.a(0)) {
            return true;
        }
        int i11 = 0;
        do {
            y0[] y0VarArr = this.f27548p;
            if (i11 >= y0VarArr.length) {
                return false;
            }
            y0Var = y0VarArr[i11];
            i11++;
        } while (y0Var.f26337q + y0Var.f26339s <= aVar.a(i11));
        return true;
    }

    @Override // v8.b1
    public final long getBufferedPositionUs() {
        long j3;
        if (this.f27556y) {
            return Long.MIN_VALUE;
        }
        if (h()) {
            return this.u;
        }
        long j10 = this.f27553v;
        a f10 = f();
        if (!f10.c()) {
            ArrayList arrayList = this.f27545m;
            if (arrayList.size() > 1) {
                f10 = (a) arrayList.get(arrayList.size() - 2);
            } else {
                f10 = null;
            }
        }
        if (f10 != null) {
            j10 = Math.max(j10, f10.f27528j);
        }
        y0 y0Var = this.f27547o;
        synchronized (y0Var) {
            j3 = y0Var.f26341v;
        }
        return Math.max(j10, j3);
    }

    @Override // v8.b1
    public final long getNextLoadPositionUs() {
        if (h()) {
            return this.u;
        }
        if (this.f27556y) {
            return Long.MIN_VALUE;
        }
        return f().f27528j;
    }

    public final boolean h() {
        return this.u != C.TIME_UNSET;
    }

    public final void i() {
        y0 y0Var = this.f27547o;
        int j3 = j(y0Var.f26337q + y0Var.f26339s, this.f27554w - 1);
        while (true) {
            int i10 = this.f27554w;
            if (i10 <= j3) {
                this.f27554w = i10 + 1;
                a aVar = (a) this.f27545m.get(i10);
                r0 r0Var = aVar.f27524f;
                if (!r0Var.equals(this.f27551s)) {
                    this.f27541i.d(this.f27535b, r0Var, aVar.f27525g, aVar.f27526h, aVar.f27527i);
                }
                this.f27551s = r0Var;
            } else {
                return;
            }
        }
    }

    @Override // v8.b1
    public final boolean isLoading() {
        return this.f27543k.a();
    }

    @Override // v8.z0
    public final boolean isReady() {
        return !h() && this.f27547o.p(this.f27556y);
    }

    public final int j(int i10, int i11) {
        ArrayList arrayList;
        do {
            i11++;
            arrayList = this.f27545m;
            if (i11 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (((a) arrayList.get(i11)).a(0) <= i10);
        return i11 - 1;
    }

    @Override // v8.z0
    public final void maybeThrowError() {
        n0 n0Var = this.f27543k;
        n0Var.maybeThrowError();
        y0 y0Var = this.f27547o;
        x7.n nVar = y0Var.f26328h;
        if (nVar != null && nVar.getState() == 1) {
            x7.m error = y0Var.f26328h.getError();
            error.getClass();
            throw error;
        }
        if (!n0Var.a()) {
            y8.m mVar = (y8.m) this.f27539g;
            v8.b bVar = mVar.f28098l;
            if (bVar == null) {
                mVar.a.maybeThrowError();
                return;
            }
            throw bVar;
        }
    }

    @Override // m9.l0
    public final void onLoaderReleased() {
        y0 y0Var = this.f27547o;
        y0Var.t(true);
        x7.n nVar = y0Var.f26328h;
        if (nVar != null) {
            nVar.e(y0Var.f26325e);
            y0Var.f26328h = null;
            y0Var.f26327g = null;
        }
        for (y0 y0Var2 : this.f27548p) {
            y0Var2.t(true);
            x7.n nVar2 = y0Var2.f26328h;
            if (nVar2 != null) {
                nVar2.e(y0Var2.f26325e);
                y0Var2.f26328h = null;
                y0Var2.f26327g = null;
            }
        }
        for (y8.k kVar : ((y8.m) this.f27539g).f28094h) {
            g gVar = kVar.a;
            if (gVar != null) {
                ((d) gVar).f27512b.release();
            }
        }
        i iVar = this.f27552t;
        if (iVar != null) {
            y8.c cVar = (y8.c) iVar;
            synchronized (cVar) {
                y8.p pVar = (y8.p) cVar.f28037p.remove(this);
                if (pVar != null) {
                    y0 y0Var3 = pVar.a;
                    y0Var3.t(true);
                    x7.n nVar3 = y0Var3.f26328h;
                    if (nVar3 != null) {
                        nVar3.e(y0Var3.f26325e);
                        y0Var3.f26328h = null;
                        y0Var3.f26327g = null;
                    }
                }
            }
        }
    }

    @Override // v8.b1
    public final void reevaluateBuffer(long j3) {
        boolean z10;
        int size;
        boolean g10;
        n0 n0Var = this.f27543k;
        if (n0Var.f21695d != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && !h()) {
            boolean a = n0Var.a();
            ArrayList arrayList = this.f27545m;
            List list = this.f27546n;
            y8.a aVar = this.f27539g;
            if (a) {
                e eVar = this.f27550r;
                eVar.getClass();
                boolean z11 = eVar instanceof a;
                if (z11 && g(arrayList.size() - 1)) {
                    return;
                }
                y8.m mVar = (y8.m) aVar;
                if (mVar.f28098l != null) {
                    g10 = false;
                } else {
                    g10 = mVar.f28095i.g(j3, eVar, list);
                }
                if (g10) {
                    j0 j0Var = n0Var.f21694c;
                    u0.p(j0Var);
                    j0Var.a(false);
                    if (z11) {
                        this.f27555x = (a) eVar;
                        return;
                    }
                    return;
                }
                return;
            }
            y8.m mVar2 = (y8.m) aVar;
            if (mVar2.f28098l == null && mVar2.f28095i.length() >= 2) {
                size = mVar2.f28095i.evaluateQueueSize(j3, list);
            } else {
                size = list.size();
            }
            if (size < arrayList.size()) {
                u0.m(!n0Var.a());
                int size2 = arrayList.size();
                while (true) {
                    if (size < size2) {
                        if (!g(size)) {
                            break;
                        } else {
                            size++;
                        }
                    } else {
                        size = -1;
                        break;
                    }
                }
                if (size != -1) {
                    long j10 = f().f27528j;
                    a e2 = e(size);
                    if (arrayList.isEmpty()) {
                        this.u = this.f27553v;
                    }
                    this.f27556y = false;
                    int i10 = this.f27535b;
                    f0.c cVar = this.f27541i;
                    cVar.getClass();
                    cVar.u(new v8.u(1, i10, null, 3, null, h0.Q(e2.f27527i), h0.Q(j10)));
                }
            }
        }
    }

    @Override // v8.z0
    public final int skipData(long j3) {
        if (h()) {
            return 0;
        }
        boolean z10 = this.f27556y;
        y0 y0Var = this.f27547o;
        int o10 = y0Var.o(j3, z10);
        a aVar = this.f27555x;
        if (aVar != null) {
            o10 = Math.min(o10, aVar.a(0) - (y0Var.f26337q + y0Var.f26339s));
        }
        y0Var.v(o10);
        i();
        return o10;
    }
}
