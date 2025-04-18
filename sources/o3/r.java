package o3;

import java.util.List;
import m3.x;

/* loaded from: classes.dex */
public final class r implements p3.a, d {
    public final x a;

    /* renamed from: b, reason: collision with root package name */
    public final p3.d f23113b;

    /* renamed from: c, reason: collision with root package name */
    public t3.k f23114c;

    public r(x xVar, u3.b bVar, t3.j jVar) {
        this.a = xVar;
        jVar.getClass();
        p3.d a = jVar.a.a();
        this.f23113b = a;
        bVar.f(a);
        a.a(this);
    }

    public static int c(int i10, int i11) {
        int i12 = i10 / i11;
        if ((i10 ^ i11) < 0 && i11 * i12 != i10) {
            i12--;
        }
        return i10 - (i12 * i11);
    }

    @Override // p3.a
    public final void a() {
        this.a.invalidateSelf();
    }

    @Override // o3.d
    public final void b(List list, List list2) {
    }
}
