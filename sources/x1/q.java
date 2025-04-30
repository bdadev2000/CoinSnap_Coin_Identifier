package x1;

import java.util.List;
import v1.v;
import y1.InterfaceC2942a;

/* loaded from: classes.dex */
public final class q implements InterfaceC2942a, c {

    /* renamed from: a, reason: collision with root package name */
    public final v f24199a;
    public final y1.e b;

    /* renamed from: c, reason: collision with root package name */
    public C1.k f24200c;

    public q(v vVar, D1.b bVar, C1.j jVar) {
        this.f24199a = vVar;
        jVar.getClass();
        y1.e g9 = jVar.f462a.g();
        this.b = g9;
        bVar.d(g9);
        g9.a(this);
    }

    public static int d(int i9, int i10) {
        int i11 = i9 / i10;
        if ((i9 ^ i10) < 0 && i11 * i10 != i9) {
            i11--;
        }
        return i9 - (i11 * i10);
    }

    @Override // y1.InterfaceC2942a
    public final void a() {
        this.f24199a.invalidateSelf();
    }

    @Override // x1.c
    public final void b(List list, List list2) {
    }
}
