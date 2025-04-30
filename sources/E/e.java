package E;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class e extends ViewGroup.MarginLayoutParams {

    /* renamed from: A, reason: collision with root package name */
    public int f773A;

    /* renamed from: B, reason: collision with root package name */
    public int f774B;

    /* renamed from: C, reason: collision with root package name */
    public int f775C;

    /* renamed from: D, reason: collision with root package name */
    public int f776D;

    /* renamed from: E, reason: collision with root package name */
    public float f777E;

    /* renamed from: F, reason: collision with root package name */
    public float f778F;

    /* renamed from: G, reason: collision with root package name */
    public String f779G;

    /* renamed from: H, reason: collision with root package name */
    public float f780H;

    /* renamed from: I, reason: collision with root package name */
    public float f781I;

    /* renamed from: J, reason: collision with root package name */
    public int f782J;

    /* renamed from: K, reason: collision with root package name */
    public int f783K;

    /* renamed from: L, reason: collision with root package name */
    public int f784L;

    /* renamed from: M, reason: collision with root package name */
    public int f785M;

    /* renamed from: N, reason: collision with root package name */
    public int f786N;
    public int O;

    /* renamed from: P, reason: collision with root package name */
    public int f787P;

    /* renamed from: Q, reason: collision with root package name */
    public int f788Q;

    /* renamed from: R, reason: collision with root package name */
    public float f789R;

    /* renamed from: S, reason: collision with root package name */
    public float f790S;

    /* renamed from: T, reason: collision with root package name */
    public int f791T;

    /* renamed from: U, reason: collision with root package name */
    public int f792U;

    /* renamed from: V, reason: collision with root package name */
    public int f793V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f794W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f795X;

    /* renamed from: Y, reason: collision with root package name */
    public String f796Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f797Z;

    /* renamed from: a, reason: collision with root package name */
    public int f798a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f799a0;
    public int b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f800b0;

    /* renamed from: c, reason: collision with root package name */
    public float f801c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f802c0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f803d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f804d0;

    /* renamed from: e, reason: collision with root package name */
    public int f805e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f806e0;

    /* renamed from: f, reason: collision with root package name */
    public int f807f;
    public int f0;

    /* renamed from: g, reason: collision with root package name */
    public int f808g;

    /* renamed from: g0, reason: collision with root package name */
    public int f809g0;

    /* renamed from: h, reason: collision with root package name */
    public int f810h;

    /* renamed from: h0, reason: collision with root package name */
    public int f811h0;

    /* renamed from: i, reason: collision with root package name */
    public int f812i;

    /* renamed from: i0, reason: collision with root package name */
    public int f813i0;

    /* renamed from: j, reason: collision with root package name */
    public int f814j;

    /* renamed from: j0, reason: collision with root package name */
    public int f815j0;

    /* renamed from: k, reason: collision with root package name */
    public int f816k;

    /* renamed from: k0, reason: collision with root package name */
    public int f817k0;
    public int l;

    /* renamed from: l0, reason: collision with root package name */
    public float f818l0;
    public int m;

    /* renamed from: m0, reason: collision with root package name */
    public int f819m0;

    /* renamed from: n, reason: collision with root package name */
    public int f820n;

    /* renamed from: n0, reason: collision with root package name */
    public int f821n0;

    /* renamed from: o, reason: collision with root package name */
    public int f822o;

    /* renamed from: o0, reason: collision with root package name */
    public float f823o0;

    /* renamed from: p, reason: collision with root package name */
    public int f824p;

    /* renamed from: p0, reason: collision with root package name */
    public B.d f825p0;

    /* renamed from: q, reason: collision with root package name */
    public int f826q;

    /* renamed from: r, reason: collision with root package name */
    public float f827r;

    /* renamed from: s, reason: collision with root package name */
    public int f828s;

    /* renamed from: t, reason: collision with root package name */
    public int f829t;

    /* renamed from: u, reason: collision with root package name */
    public int f830u;

    /* renamed from: v, reason: collision with root package name */
    public int f831v;

    /* renamed from: w, reason: collision with root package name */
    public int f832w;

    /* renamed from: x, reason: collision with root package name */
    public int f833x;

    /* renamed from: y, reason: collision with root package name */
    public int f834y;

    /* renamed from: z, reason: collision with root package name */
    public int f835z;

    public final void a() {
        this.f804d0 = false;
        this.f799a0 = true;
        this.f800b0 = true;
        int i9 = ((ViewGroup.MarginLayoutParams) this).width;
        if (i9 == -2 && this.f794W) {
            this.f799a0 = false;
            if (this.f784L == 0) {
                this.f784L = 1;
            }
        }
        int i10 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i10 == -2 && this.f795X) {
            this.f800b0 = false;
            if (this.f785M == 0) {
                this.f785M = 1;
            }
        }
        if (i9 == 0 || i9 == -1) {
            this.f799a0 = false;
            if (i9 == 0 && this.f784L == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.f794W = true;
            }
        }
        if (i10 == 0 || i10 == -1) {
            this.f800b0 = false;
            if (i10 == 0 && this.f785M == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.f795X = true;
            }
        }
        if (this.f801c != -1.0f || this.f798a != -1 || this.b != -1) {
            this.f804d0 = true;
            this.f799a0 = true;
            this.f800b0 = true;
            if (!(this.f825p0 instanceof B.h)) {
                this.f825p0 = new B.h();
            }
            ((B.h) this.f825p0).S(this.f793V);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void resolveLayoutDirection(int r11) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: E.e.resolveLayoutDirection(int):void");
    }
}
