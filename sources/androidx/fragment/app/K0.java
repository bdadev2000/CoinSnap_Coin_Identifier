package androidx.fragment.app;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class K0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4664a;
    public boolean b;

    public boolean a() {
        return this instanceof C0465h;
    }

    public abstract void b(ViewGroup viewGroup);

    public abstract void c(ViewGroup viewGroup);

    public void d(f.b bVar, ViewGroup viewGroup) {
        G7.j.e(bVar, "backEvent");
        G7.j.e(viewGroup, "container");
    }

    public void e(ViewGroup viewGroup) {
        G7.j.e(viewGroup, "container");
    }
}
