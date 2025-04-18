package p3;

import java.util.Collections;

/* loaded from: classes.dex */
public final class t extends d {

    /* renamed from: i, reason: collision with root package name */
    public final Object f23412i;

    public t(h.c cVar, Object obj) {
        super(Collections.emptyList());
        k(cVar);
        this.f23412i = obj;
    }

    @Override // p3.d
    public final float c() {
        return 1.0f;
    }

    @Override // p3.d
    public final Object f() {
        h.c cVar = this.f23363e;
        Object obj = this.f23412i;
        float f10 = this.f23362d;
        return cVar.A(0.0f, 0.0f, obj, obj, f10, f10, f10);
    }

    @Override // p3.d
    public final Object g(z3.a aVar, float f10) {
        return f();
    }

    @Override // p3.d
    public final void i() {
        if (this.f23363e != null) {
            super.i();
        }
    }

    @Override // p3.d
    public final void j(float f10) {
        this.f23362d = f10;
    }
}
