package p3;

import java.util.List;

/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: b, reason: collision with root package name */
    public final List f23356b;

    /* renamed from: d, reason: collision with root package name */
    public z3.a f23358d = null;

    /* renamed from: f, reason: collision with root package name */
    public float f23359f = -1.0f;

    /* renamed from: c, reason: collision with root package name */
    public z3.a f23357c = a(0.0f);

    public c(List list) {
        this.f23356b = list;
    }

    public final z3.a a(float f10) {
        List list = this.f23356b;
        z3.a aVar = (z3.a) list.get(list.size() - 1);
        if (f10 >= aVar.b()) {
            return aVar;
        }
        int size = list.size() - 2;
        while (true) {
            boolean z10 = false;
            if (size >= 1) {
                z3.a aVar2 = (z3.a) list.get(size);
                if (this.f23357c != aVar2) {
                    if (f10 >= aVar2.b() && f10 < aVar2.a()) {
                        z10 = true;
                    }
                    if (z10) {
                        return aVar2;
                    }
                }
                size--;
            } else {
                return (z3.a) list.get(0);
            }
        }
    }

    @Override // p3.b
    public final boolean d(float f10) {
        z3.a aVar = this.f23358d;
        z3.a aVar2 = this.f23357c;
        if (aVar == aVar2 && this.f23359f == f10) {
            return true;
        }
        this.f23358d = aVar2;
        this.f23359f = f10;
        return false;
    }

    @Override // p3.b
    public final z3.a e() {
        return this.f23357c;
    }

    @Override // p3.b
    public final boolean g(float f10) {
        boolean z10;
        z3.a aVar = this.f23357c;
        if (f10 >= aVar.b() && f10 < aVar.a()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return !this.f23357c.c();
        }
        this.f23357c = a(f10);
        return true;
    }

    @Override // p3.b
    public final float h() {
        return ((z3.a) this.f23356b.get(0)).b();
    }

    @Override // p3.b
    public final boolean isEmpty() {
        return false;
    }

    @Override // p3.b
    public final float j() {
        return ((z3.a) this.f23356b.get(r0.size() - 1)).a();
    }
}
