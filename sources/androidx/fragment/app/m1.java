package androidx.fragment.app;

/* loaded from: classes.dex */
public final class m1 {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public Fragment f1687b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1688c;

    /* renamed from: d, reason: collision with root package name */
    public int f1689d;

    /* renamed from: e, reason: collision with root package name */
    public int f1690e;

    /* renamed from: f, reason: collision with root package name */
    public int f1691f;

    /* renamed from: g, reason: collision with root package name */
    public int f1692g;

    /* renamed from: h, reason: collision with root package name */
    public androidx.lifecycle.o f1693h;

    /* renamed from: i, reason: collision with root package name */
    public androidx.lifecycle.o f1694i;

    public m1() {
    }

    public m1(int i10, Fragment fragment) {
        this.a = i10;
        this.f1687b = fragment;
        this.f1688c = false;
        androidx.lifecycle.o oVar = androidx.lifecycle.o.RESUMED;
        this.f1693h = oVar;
        this.f1694i = oVar;
    }

    public m1(int i10, Fragment fragment, int i11) {
        this.a = i10;
        this.f1687b = fragment;
        this.f1688c = true;
        androidx.lifecycle.o oVar = androidx.lifecycle.o.RESUMED;
        this.f1693h = oVar;
        this.f1694i = oVar;
    }

    public m1(Fragment fragment, androidx.lifecycle.o oVar) {
        this.a = 10;
        this.f1687b = fragment;
        this.f1688c = false;
        this.f1693h = fragment.mMaxState;
        this.f1694i = oVar;
    }

    public m1(m1 m1Var) {
        this.a = m1Var.a;
        this.f1687b = m1Var.f1687b;
        this.f1688c = m1Var.f1688c;
        this.f1689d = m1Var.f1689d;
        this.f1690e = m1Var.f1690e;
        this.f1691f = m1Var.f1691f;
        this.f1692g = m1Var.f1692g;
        this.f1693h = m1Var.f1693h;
        this.f1694i = m1Var.f1694i;
    }
}
