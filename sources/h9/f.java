package h9;

import android.text.Layout;

/* loaded from: classes3.dex */
public final class f {
    public String a;

    /* renamed from: b, reason: collision with root package name */
    public int f18959b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f18960c;

    /* renamed from: d, reason: collision with root package name */
    public int f18961d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f18962e;

    /* renamed from: k, reason: collision with root package name */
    public float f18968k;

    /* renamed from: l, reason: collision with root package name */
    public String f18969l;

    /* renamed from: o, reason: collision with root package name */
    public Layout.Alignment f18972o;

    /* renamed from: p, reason: collision with root package name */
    public Layout.Alignment f18973p;

    /* renamed from: r, reason: collision with root package name */
    public b f18975r;

    /* renamed from: f, reason: collision with root package name */
    public int f18963f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f18964g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f18965h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f18966i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f18967j = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f18970m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f18971n = -1;

    /* renamed from: q, reason: collision with root package name */
    public int f18974q = -1;

    /* renamed from: s, reason: collision with root package name */
    public float f18976s = Float.MAX_VALUE;

    public final void a(f fVar) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (fVar != null) {
            if (!this.f18960c && fVar.f18960c) {
                this.f18959b = fVar.f18959b;
                this.f18960c = true;
            }
            if (this.f18965h == -1) {
                this.f18965h = fVar.f18965h;
            }
            if (this.f18966i == -1) {
                this.f18966i = fVar.f18966i;
            }
            if (this.a == null && (str = fVar.a) != null) {
                this.a = str;
            }
            if (this.f18963f == -1) {
                this.f18963f = fVar.f18963f;
            }
            if (this.f18964g == -1) {
                this.f18964g = fVar.f18964g;
            }
            if (this.f18971n == -1) {
                this.f18971n = fVar.f18971n;
            }
            if (this.f18972o == null && (alignment2 = fVar.f18972o) != null) {
                this.f18972o = alignment2;
            }
            if (this.f18973p == null && (alignment = fVar.f18973p) != null) {
                this.f18973p = alignment;
            }
            if (this.f18974q == -1) {
                this.f18974q = fVar.f18974q;
            }
            if (this.f18967j == -1) {
                this.f18967j = fVar.f18967j;
                this.f18968k = fVar.f18968k;
            }
            if (this.f18975r == null) {
                this.f18975r = fVar.f18975r;
            }
            if (this.f18976s == Float.MAX_VALUE) {
                this.f18976s = fVar.f18976s;
            }
            if (!this.f18962e && fVar.f18962e) {
                this.f18961d = fVar.f18961d;
                this.f18962e = true;
            }
            if (this.f18970m == -1 && (i10 = fVar.f18970m) != -1) {
                this.f18970m = i10;
            }
        }
    }
}
