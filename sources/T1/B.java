package T1;

import W1.C0320d;
import android.content.res.Resources;
import b2.InterfaceC0554a;

/* loaded from: classes.dex */
public final class B implements v, InterfaceC0554a {
    public final Resources b;

    public /* synthetic */ B(Resources resources) {
        this.b = resources;
    }

    @Override // b2.InterfaceC0554a
    public P1.B a(P1.B b, N1.i iVar) {
        if (b == null) {
            return null;
        }
        return new C0320d(this.b, b);
    }

    @Override // T1.v
    public u i(A a6) {
        return new C0296b(this.b, E.b);
    }
}
