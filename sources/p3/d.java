package p3;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: c, reason: collision with root package name */
    public final b f23361c;

    /* renamed from: e, reason: collision with root package name */
    public h.c f23363e;
    public final ArrayList a = new ArrayList(1);

    /* renamed from: b, reason: collision with root package name */
    public boolean f23360b = false;

    /* renamed from: d, reason: collision with root package name */
    public float f23362d = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public Object f23364f = null;

    /* renamed from: g, reason: collision with root package name */
    public float f23365g = -1.0f;

    /* renamed from: h, reason: collision with root package name */
    public float f23366h = -1.0f;

    public d(List list) {
        b cVar;
        b bVar;
        Object obj = null;
        if (list.isEmpty()) {
            bVar = new z1.d(obj);
        } else {
            if (list.size() == 1) {
                cVar = new ka.g(list);
            } else {
                cVar = new c(list);
            }
            bVar = cVar;
        }
        this.f23361c = bVar;
    }

    public final void a(a aVar) {
        this.a.add(aVar);
    }

    public final z3.a b() {
        return this.f23361c.e();
    }

    public float c() {
        if (this.f23366h == -1.0f) {
            this.f23366h = this.f23361c.j();
        }
        return this.f23366h;
    }

    public final float d() {
        z3.a b3 = b();
        if (b3 != null && !b3.c()) {
            return b3.f28474d.getInterpolation(e());
        }
        return 0.0f;
    }

    public final float e() {
        if (this.f23360b) {
            return 0.0f;
        }
        z3.a b3 = b();
        if (b3.c()) {
            return 0.0f;
        }
        return (this.f23362d - b3.b()) / (b3.a() - b3.b());
    }

    public Object f() {
        Object g10;
        Interpolator interpolator;
        float e2 = e();
        if (this.f23363e == null && this.f23361c.d(e2)) {
            return this.f23364f;
        }
        z3.a b3 = b();
        Interpolator interpolator2 = b3.f28475e;
        if (interpolator2 != null && (interpolator = b3.f28476f) != null) {
            g10 = h(b3, e2, interpolator2.getInterpolation(e2), interpolator.getInterpolation(e2));
        } else {
            g10 = g(b3, d());
        }
        this.f23364f = g10;
        return g10;
    }

    public abstract Object g(z3.a aVar, float f10);

    public Object h(z3.a aVar, float f10, float f11, float f12) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void i() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i10 < arrayList.size()) {
                ((a) arrayList.get(i10)).a();
                i10++;
            } else {
                return;
            }
        }
    }

    public void j(float f10) {
        b bVar = this.f23361c;
        if (bVar.isEmpty()) {
            return;
        }
        if (this.f23365g == -1.0f) {
            this.f23365g = bVar.h();
        }
        float f11 = this.f23365g;
        if (f10 < f11) {
            if (f11 == -1.0f) {
                this.f23365g = bVar.h();
            }
            f10 = this.f23365g;
        } else if (f10 > c()) {
            f10 = c();
        }
        if (f10 == this.f23362d) {
            return;
        }
        this.f23362d = f10;
        if (bVar.g(f10)) {
            i();
        }
    }

    public final void k(h.c cVar) {
        h.c cVar2 = this.f23363e;
        if (cVar2 != null) {
            cVar2.f18524d = null;
        }
        this.f23363e = cVar;
        if (cVar != null) {
            cVar.f18524d = this;
        }
    }
}
