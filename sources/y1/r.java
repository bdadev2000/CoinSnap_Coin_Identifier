package y1;

import java.util.Collections;

/* loaded from: classes.dex */
public final class r extends e {

    /* renamed from: i, reason: collision with root package name */
    public final Object f24333i;

    public r(E1.d dVar, Object obj) {
        super(Collections.emptyList());
        j(dVar);
        this.f24333i = obj;
    }

    @Override // y1.e
    public final float b() {
        return 1.0f;
    }

    @Override // y1.e
    public final Object e() {
        E1.d dVar = this.f24292e;
        float f9 = this.f24291d;
        Object obj = this.f24333i;
        return dVar.t(0.0f, 0.0f, obj, obj, f9, f9, f9);
    }

    @Override // y1.e
    public final Object f(I1.a aVar, float f9) {
        return e();
    }

    @Override // y1.e
    public final void h() {
        if (this.f24292e != null) {
            super.h();
        }
    }

    @Override // y1.e
    public final void i(float f9) {
        this.f24291d = f9;
    }
}
