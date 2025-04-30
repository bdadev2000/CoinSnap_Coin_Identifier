package S;

import G7.j;

/* loaded from: classes.dex */
public final class e extends d {

    /* renamed from: d, reason: collision with root package name */
    public final Object f2769d;

    public e(int i9) {
        super(i9);
        this.f2769d = new Object();
    }

    @Override // S.d, S.c
    public final boolean b(Object obj) {
        boolean b;
        j.e(obj, "instance");
        synchronized (this.f2769d) {
            b = super.b(obj);
        }
        return b;
    }

    @Override // S.d, S.c
    public final Object g() {
        Object g9;
        synchronized (this.f2769d) {
            g9 = super.g();
        }
        return g9;
    }
}
