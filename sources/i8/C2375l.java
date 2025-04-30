package i8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import u7.AbstractC2816g;

/* renamed from: i8.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2375l {

    /* renamed from: c, reason: collision with root package name */
    public static final C2375l f20837c = new C2375l(AbstractC2816g.V(new ArrayList()), null);

    /* renamed from: a, reason: collision with root package name */
    public final Set f20838a;
    public final e1.f b;

    public C2375l(Set set, e1.f fVar) {
        G7.j.e(set, "pins");
        this.f20838a = set;
        this.b = fVar;
    }

    public final void a(String str, F7.a aVar) {
        G7.j.e(str, "hostname");
        Iterator it = this.f20838a.iterator();
        if (!it.hasNext()) {
            return;
        }
        com.mbridge.msdk.foundation.entity.o.v(it.next());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2375l) {
            C2375l c2375l = (C2375l) obj;
            if (G7.j.a(c2375l.f20838a, this.f20838a) && G7.j.a(c2375l.b, this.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        int hashCode = (this.f20838a.hashCode() + 1517) * 41;
        e1.f fVar = this.b;
        if (fVar != null) {
            i9 = fVar.hashCode();
        } else {
            i9 = 0;
        }
        return hashCode + i9;
    }
}
