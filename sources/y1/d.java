package y1;

import java.util.List;

/* loaded from: classes.dex */
public final class d implements InterfaceC2943b {
    public final I1.a b;

    /* renamed from: c, reason: collision with root package name */
    public float f24288c = -1.0f;

    public d(List list) {
        this.b = (I1.a) list.get(0);
    }

    @Override // y1.InterfaceC2943b
    public final boolean a(float f9) {
        if (this.f24288c == f9) {
            return true;
        }
        this.f24288c = f9;
        return false;
    }

    @Override // y1.InterfaceC2943b
    public final I1.a c() {
        return this.b;
    }

    @Override // y1.InterfaceC2943b
    public final boolean d(float f9) {
        return !this.b.c();
    }

    @Override // y1.InterfaceC2943b
    public final float e() {
        return this.b.a();
    }

    @Override // y1.InterfaceC2943b
    public final float f() {
        return this.b.b();
    }

    @Override // y1.InterfaceC2943b
    public final boolean isEmpty() {
        return false;
    }
}
