package R1;

import P1.B;
import P1.n;
import h5.C2326g;

/* loaded from: classes.dex */
public final class d extends C2326g {

    /* renamed from: d, reason: collision with root package name */
    public e f2629d;

    @Override // h5.C2326g
    public final int b(Object obj) {
        B b = (B) obj;
        if (b == null) {
            return 1;
        }
        return b.getSize();
    }

    @Override // h5.C2326g
    public final void c(Object obj, Object obj2) {
        B b = (B) obj2;
        e eVar = this.f2629d;
        if (eVar != null && b != null) {
            ((n) eVar).f2361e.o(b, true);
        }
    }
}
