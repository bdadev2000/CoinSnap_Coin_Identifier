package y1;

import java.util.List;

/* renamed from: y1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2944c implements InterfaceC2943b {
    public final List b;

    /* renamed from: d, reason: collision with root package name */
    public I1.a f24286d = null;

    /* renamed from: f, reason: collision with root package name */
    public float f24287f = -1.0f;

    /* renamed from: c, reason: collision with root package name */
    public I1.a f24285c = b(0.0f);

    public C2944c(List list) {
        this.b = list;
    }

    @Override // y1.InterfaceC2943b
    public final boolean a(float f9) {
        I1.a aVar = this.f24286d;
        I1.a aVar2 = this.f24285c;
        if (aVar == aVar2 && this.f24287f == f9) {
            return true;
        }
        this.f24286d = aVar2;
        this.f24287f = f9;
        return false;
    }

    public final I1.a b(float f9) {
        List list = this.b;
        I1.a aVar = (I1.a) list.get(list.size() - 1);
        if (f9 >= aVar.b()) {
            return aVar;
        }
        for (int size = list.size() - 2; size >= 1; size--) {
            I1.a aVar2 = (I1.a) list.get(size);
            if (this.f24285c != aVar2 && f9 >= aVar2.b() && f9 < aVar2.a()) {
                return aVar2;
            }
        }
        return (I1.a) list.get(0);
    }

    @Override // y1.InterfaceC2943b
    public final I1.a c() {
        return this.f24285c;
    }

    @Override // y1.InterfaceC2943b
    public final boolean d(float f9) {
        boolean z8;
        I1.a aVar = this.f24285c;
        if (f9 >= aVar.b() && f9 < aVar.a()) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            return !this.f24285c.c();
        }
        this.f24285c = b(f9);
        return true;
    }

    @Override // y1.InterfaceC2943b
    public final float e() {
        return ((I1.a) this.b.get(r0.size() - 1)).a();
    }

    @Override // y1.InterfaceC2943b
    public final float f() {
        return ((I1.a) this.b.get(0)).b();
    }

    @Override // y1.InterfaceC2943b
    public final boolean isEmpty() {
        return false;
    }
}
