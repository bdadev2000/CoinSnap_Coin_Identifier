package he;

import android.location.Location;
import com.google.android.gms.tasks.Tasks;
import com.google.common.collect.c1;
import com.otaliastudios.cameraview.CameraView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class v extends a0 {
    public boolean A;
    public re.d B;
    public final ne.a C;
    public ze.c D;
    public ze.c E;
    public ze.c F;
    public ge.f G;
    public ge.j H;
    public ge.a I;
    public long J;
    public int K;
    public int L;
    public int M;
    public long N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public we.b T;

    /* renamed from: f, reason: collision with root package name */
    public ye.b f19086f;

    /* renamed from: g, reason: collision with root package name */
    public oe.a f19087g;

    /* renamed from: h, reason: collision with root package name */
    public k.d f19088h;

    /* renamed from: i, reason: collision with root package name */
    public ze.b f19089i;

    /* renamed from: j, reason: collision with root package name */
    public ze.b f19090j;

    /* renamed from: k, reason: collision with root package name */
    public ze.b f19091k;

    /* renamed from: l, reason: collision with root package name */
    public int f19092l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f19093m;

    /* renamed from: n, reason: collision with root package name */
    public ge.g f19094n;

    /* renamed from: o, reason: collision with root package name */
    public ge.n f19095o;

    /* renamed from: p, reason: collision with root package name */
    public ge.m f19096p;

    /* renamed from: q, reason: collision with root package name */
    public ge.b f19097q;

    /* renamed from: r, reason: collision with root package name */
    public ge.i f19098r;

    /* renamed from: s, reason: collision with root package name */
    public ge.k f19099s;

    /* renamed from: t, reason: collision with root package name */
    public Location f19100t;
    public float u;

    /* renamed from: v, reason: collision with root package name */
    public float f19101v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f19102w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f19103x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f19104y;

    /* renamed from: z, reason: collision with root package name */
    public float f19105z;

    public v(c1 c1Var) {
        super(c1Var);
        this.C = new ne.a();
        Tasks.forResult(null);
        Tasks.forResult(null);
        Tasks.forResult(null);
        Tasks.forResult(null);
        Tasks.forResult(null);
        Tasks.forResult(null);
        Tasks.forResult(null);
        Tasks.forResult(null);
    }

    public final ze.b I(ge.j jVar) {
        ze.c cVar;
        Set unmodifiableSet;
        boolean b3 = this.C.b(2, 3);
        if (jVar == ge.j.PICTURE) {
            cVar = this.E;
            unmodifiableSet = Collections.unmodifiableSet(this.f19087g.f17822e);
        } else {
            cVar = this.F;
            unmodifiableSet = Collections.unmodifiableSet(this.f19087g.f17823f);
        }
        ze.e eVar = new ze.e(new ze.c[]{cVar, com.bumptech.glide.e.g()}, 1);
        ArrayList arrayList = new ArrayList(unmodifiableSet);
        ze.b bVar = (ze.b) eVar.a(arrayList).get(0);
        if (arrayList.contains(bVar)) {
            a0.f19026e.a(1, "computeCaptureSize:", "result:", bVar, "flip:", Boolean.valueOf(b3), "mode:", jVar);
            if (b3) {
                return bVar.a();
            }
            return bVar;
        }
        throw new RuntimeException("SizeSelectors must not return Sizes other than those in the input list.");
    }

    public final ze.b J() {
        ArrayList<ze.b> N = N();
        boolean b3 = this.C.b(2, 3);
        ArrayList arrayList = new ArrayList(N.size());
        for (ze.b bVar : N) {
            if (b3) {
                bVar = bVar.a();
            }
            arrayList.add(bVar);
        }
        ze.b O = O(3);
        if (O != null) {
            ze.b bVar2 = this.f19089i;
            ze.a a = ze.a.a(bVar2.f28749b, bVar2.f28750c);
            if (b3) {
                a = ze.a.a(a.f28748c, a.f28747b);
            }
            int i10 = 1;
            fe.c cVar = a0.f19026e;
            cVar.a(1, "computePreviewStreamSize:", "targetRatio:", a, "targetMinSize:", O);
            ze.e e2 = com.bumptech.glide.e.e(com.bumptech.glide.e.f(a), com.bumptech.glide.e.g());
            ze.e e10 = com.bumptech.glide.e.e(com.bumptech.glide.e.J(O.f28750c), com.bumptech.glide.e.K(O.f28749b), com.bumptech.glide.e.T());
            ze.e eVar = new ze.e(new ze.c[]{com.bumptech.glide.e.e(e2, e10), e10, e2, com.bumptech.glide.e.g()}, i10);
            ze.c cVar2 = this.D;
            if (cVar2 != null) {
                eVar = new ze.e(new ze.c[]{cVar2, eVar}, i10);
            }
            ze.b bVar3 = (ze.b) eVar.a(arrayList).get(0);
            if (arrayList.contains(bVar3)) {
                if (b3) {
                    bVar3 = bVar3.a();
                }
                cVar.a(1, "computePreviewStreamSize:", "result:", bVar3, "flip:", Boolean.valueOf(b3));
                return bVar3;
            }
            throw new RuntimeException("SizeSelectors must not return Sizes other than those in the input list.");
        }
        throw new IllegalStateException("targetMinSize should not be null here.");
    }

    public re.b K() {
        return (re.b) L();
    }

    public final re.d L() {
        if (this.B == null) {
            this.B = Q(this.S);
        }
        return this.B;
    }

    public final ze.b M() {
        ze.b bVar = this.f19089i;
        if (bVar != null && this.H != ge.j.VIDEO) {
            if (this.C.b(2, 4)) {
                return bVar.a();
            }
            return bVar;
        }
        return null;
    }

    public abstract ArrayList N();

    public final ze.b O(int i10) {
        ye.b bVar = this.f19086f;
        if (bVar == null) {
            return null;
        }
        if (this.C.b(3, i10)) {
            return new ze.b(bVar.f28178d, bVar.f28179e).a();
        }
        return new ze.b(bVar.f28178d, bVar.f28179e);
    }

    public final ze.b P(int i10) {
        int i11;
        int i12;
        ze.b e2 = e(i10);
        if (e2 == null) {
            return null;
        }
        boolean b3 = this.C.b(i10, 3);
        if (b3) {
            i11 = this.P;
        } else {
            i11 = this.O;
        }
        if (b3) {
            i12 = this.O;
        } else {
            i12 = this.P;
        }
        if (i11 <= 0) {
            i11 = Integer.MAX_VALUE;
        }
        if (i12 <= 0) {
            i12 = Integer.MAX_VALUE;
        }
        HashMap hashMap = ze.a.f28746d;
        int i13 = e2.f28749b;
        int i14 = e2.f28750c;
        if (ze.a.a(i11, i12).c() >= ze.a.a(i13, i14).c()) {
            return new ze.b((int) Math.floor(r6 * r3), Math.min(i14, i12));
        }
        return new ze.b(Math.min(i13, i11), (int) Math.floor(r6 / r3));
    }

    public abstract re.d Q(int i10);

    public abstract void R();

    public abstract void S(fe.k kVar, boolean z10);

    public abstract void T(fe.k kVar, ze.a aVar, boolean z10);

    public final void U(ge.a aVar) {
        if (this.I != aVar) {
            this.I = aVar;
        }
    }

    public void a(fe.k kVar, Exception exc) {
        this.f19088h = null;
        y yVar = this.f19028c;
        if (kVar != null) {
            c1 c1Var = (c1) yVar;
            ((fe.c) c1Var.f11924c).a(1, "dispatchOnPictureTaken", kVar);
            ((CameraView) c1Var.f11925d).f16484l.post(new androidx.appcompat.widget.j(26, c1Var, kVar));
        } else {
            a0.f19026e.a(3, "onPictureResult", "result is null: something went wrong.", exc);
            ((c1) yVar).f(new fe.a(exc, 4));
        }
    }

    @Override // he.a0
    public final ze.b e(int i10) {
        ze.b bVar = this.f19090j;
        if (bVar == null) {
            return null;
        }
        if (this.C.b(2, i10)) {
            return bVar.a();
        }
        return bVar;
    }
}
