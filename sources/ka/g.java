package ka;

import java.util.List;

/* loaded from: classes3.dex */
public final class g implements p3.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20533b;

    /* renamed from: c, reason: collision with root package name */
    public float f20534c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f20535d;

    public /* synthetic */ g(i iVar, float f10, int i10) {
        this.f20533b = i10;
        this.f20535d = iVar;
        this.f20534c = f10;
    }

    public final c a(c cVar) {
        switch (this.f20533b) {
            case 0:
                if (!(cVar instanceof j)) {
                    return new b(this.f20534c, cVar);
                }
                return cVar;
            default:
                if (!(cVar instanceof j)) {
                    return new b(this.f20534c, cVar);
                }
                return cVar;
        }
    }

    @Override // p3.b
    public final boolean d(float f10) {
        if (this.f20534c == f10) {
            return true;
        }
        this.f20534c = f10;
        return false;
    }

    @Override // p3.b
    public final z3.a e() {
        return (z3.a) this.f20535d;
    }

    @Override // p3.b
    public final boolean g(float f10) {
        return !((z3.a) this.f20535d).c();
    }

    @Override // p3.b
    public final float h() {
        return ((z3.a) this.f20535d).b();
    }

    @Override // p3.b
    public final boolean isEmpty() {
        return false;
    }

    @Override // p3.b
    public final float j() {
        return ((z3.a) this.f20535d).a();
    }

    public g(List list) {
        this.f20533b = 2;
        this.f20534c = -1.0f;
        this.f20535d = (z3.a) list.get(0);
    }
}
