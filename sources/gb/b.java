package gb;

import androidx.core.app.h;
import db.q;
import java.util.concurrent.atomic.AtomicReference;
import mb.p1;

/* loaded from: classes3.dex */
public final class b implements a {

    /* renamed from: c, reason: collision with root package name */
    public static final ni.a f18377c = new ni.a(null);
    public final cc.b a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f18378b = new AtomicReference(null);

    public b(cc.b bVar) {
        this.a = bVar;
        ((q) bVar).a(new h(this, 29));
    }

    public final ni.a a(String str) {
        a aVar = (a) this.f18378b.get();
        if (aVar == null) {
            return f18377c;
        }
        return ((b) aVar).a(str);
    }

    public final boolean b() {
        a aVar = (a) this.f18378b.get();
        if (aVar != null && ((b) aVar).b()) {
            return true;
        }
        return false;
    }

    public final boolean c(String str) {
        a aVar = (a) this.f18378b.get();
        if (aVar != null && ((b) aVar).c(str)) {
            return true;
        }
        return false;
    }

    public final void d(String str, String str2, long j3, p1 p1Var) {
        b6.a.f2288f.h("Deferring native open session: " + str);
        ((q) this.a).a(new n7.h(str, str2, j3, p1Var, 3));
    }
}
