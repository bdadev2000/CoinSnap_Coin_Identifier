package y1;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2943b f24290c;

    /* renamed from: e, reason: collision with root package name */
    public E1.d f24292e;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f24289a = new ArrayList(1);
    public boolean b = false;

    /* renamed from: d, reason: collision with root package name */
    public float f24291d = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public Object f24293f = null;

    /* renamed from: g, reason: collision with root package name */
    public float f24294g = -1.0f;

    /* renamed from: h, reason: collision with root package name */
    public float f24295h = -1.0f;

    /* JADX WARN: Multi-variable type inference failed */
    public e(List list) {
        InterfaceC2943b c2944c;
        InterfaceC2943b interfaceC2943b;
        if (list.isEmpty()) {
            interfaceC2943b = new Object();
        } else {
            if (list.size() == 1) {
                c2944c = new d(list);
            } else {
                c2944c = new C2944c(list);
            }
            interfaceC2943b = c2944c;
        }
        this.f24290c = interfaceC2943b;
    }

    public final void a(InterfaceC2942a interfaceC2942a) {
        this.f24289a.add(interfaceC2942a);
    }

    public float b() {
        if (this.f24295h == -1.0f) {
            this.f24295h = this.f24290c.e();
        }
        return this.f24295h;
    }

    public final float c() {
        I1.a c9 = this.f24290c.c();
        if (c9 != null && !c9.c()) {
            return c9.f1410d.getInterpolation(d());
        }
        return 0.0f;
    }

    public final float d() {
        if (this.b) {
            return 0.0f;
        }
        I1.a c9 = this.f24290c.c();
        if (c9.c()) {
            return 0.0f;
        }
        return (this.f24291d - c9.b()) / (c9.a() - c9.b());
    }

    public Object e() {
        Object f9;
        Interpolator interpolator;
        float d2 = d();
        E1.d dVar = this.f24292e;
        InterfaceC2943b interfaceC2943b = this.f24290c;
        if (dVar == null && interfaceC2943b.a(d2)) {
            return this.f24293f;
        }
        I1.a c9 = interfaceC2943b.c();
        Interpolator interpolator2 = c9.f1411e;
        if (interpolator2 != null && (interpolator = c9.f1412f) != null) {
            f9 = g(c9, d2, interpolator2.getInterpolation(d2), interpolator.getInterpolation(d2));
        } else {
            f9 = f(c9, c());
        }
        this.f24293f = f9;
        return f9;
    }

    public abstract Object f(I1.a aVar, float f9);

    public Object g(I1.a aVar, float f9, float f10, float f11) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void h() {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.f24289a;
            if (i9 < arrayList.size()) {
                ((InterfaceC2942a) arrayList.get(i9)).a();
                i9++;
            } else {
                return;
            }
        }
    }

    public void i(float f9) {
        InterfaceC2943b interfaceC2943b = this.f24290c;
        if (interfaceC2943b.isEmpty()) {
            return;
        }
        if (this.f24294g == -1.0f) {
            this.f24294g = interfaceC2943b.f();
        }
        float f10 = this.f24294g;
        if (f9 < f10) {
            if (f10 == -1.0f) {
                this.f24294g = interfaceC2943b.f();
            }
            f9 = this.f24294g;
        } else if (f9 > b()) {
            f9 = b();
        }
        if (f9 == this.f24291d) {
            return;
        }
        this.f24291d = f9;
        if (interfaceC2943b.d(f9)) {
            h();
        }
    }

    public final void j(E1.d dVar) {
        E1.d dVar2 = this.f24292e;
        if (dVar2 != null) {
            dVar2.getClass();
        }
        this.f24292e = dVar;
    }
}
