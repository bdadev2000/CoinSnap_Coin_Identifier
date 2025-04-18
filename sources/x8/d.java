package x8;

import android.util.SparseArray;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import s7.r0;
import v8.u0;
import y7.a0;
import y7.p;
import y7.x;

/* loaded from: classes3.dex */
public final class d implements y7.n, g {

    /* renamed from: l, reason: collision with root package name */
    public static final p f27511l;

    /* renamed from: b, reason: collision with root package name */
    public final y7.l f27512b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27513c;

    /* renamed from: d, reason: collision with root package name */
    public final r0 f27514d;

    /* renamed from: f, reason: collision with root package name */
    public final SparseArray f27515f = new SparseArray();

    /* renamed from: g, reason: collision with root package name */
    public boolean f27516g;

    /* renamed from: h, reason: collision with root package name */
    public f f27517h;

    /* renamed from: i, reason: collision with root package name */
    public long f27518i;

    /* renamed from: j, reason: collision with root package name */
    public x f27519j;

    /* renamed from: k, reason: collision with root package name */
    public r0[] f27520k;

    static {
        new n0.h(3);
        f27511l = new p();
    }

    public d(y7.l lVar, int i10, r0 r0Var) {
        this.f27512b = lVar;
        this.f27513c = i10;
        this.f27514d = r0Var;
    }

    public final void a(f fVar, long j3, long j10) {
        this.f27517h = fVar;
        this.f27518i = j10;
        boolean z10 = this.f27516g;
        y7.l lVar = this.f27512b;
        if (!z10) {
            lVar.a(this);
            if (j3 != C.TIME_UNSET) {
                lVar.seek(0L, j3);
            }
            this.f27516g = true;
            return;
        }
        if (j3 == C.TIME_UNSET) {
            j3 = 0;
        }
        lVar.seek(0L, j3);
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f27515f;
            if (i10 < sparseArray.size()) {
                ((c) sparseArray.valueAt(i10)).g(fVar, j10);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // y7.n
    public final void d(x xVar) {
        this.f27519j = xVar;
    }

    @Override // y7.n
    public final void endTracks() {
        SparseArray sparseArray = this.f27515f;
        r0[] r0VarArr = new r0[sparseArray.size()];
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            r0 r0Var = ((c) sparseArray.valueAt(i10)).f27508d;
            u0.p(r0Var);
            r0VarArr[i10] = r0Var;
        }
        this.f27520k = r0VarArr;
    }

    @Override // y7.n
    public final a0 track(int i10, int i11) {
        boolean z10;
        r0 r0Var;
        SparseArray sparseArray = this.f27515f;
        c cVar = (c) sparseArray.get(i10);
        if (cVar == null) {
            if (this.f27520k == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            u0.m(z10);
            if (i11 == this.f27513c) {
                r0Var = this.f27514d;
            } else {
                r0Var = null;
            }
            cVar = new c(i10, i11, r0Var);
            cVar.g(this.f27517h, this.f27518i);
            sparseArray.put(i10, cVar);
        }
        return cVar;
    }
}
