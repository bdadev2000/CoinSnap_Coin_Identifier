package f8;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e8.C2227b;
import e8.C2228c;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class e implements a8.b {

    /* renamed from: a, reason: collision with root package name */
    public static final e f20374a = new Object();
    public static final d b = d.b;

    @Override // a8.b
    public final Object deserialize(d8.c cVar) {
        G7.j.e(cVar, "decoder");
        F2.h.b(cVar);
        return new c((List) new C2228c(m.f20403a, 0).deserialize(cVar));
    }

    @Override // a8.b
    public final c8.g getDescriptor() {
        return b;
    }

    @Override // a8.b
    public final void serialize(d8.d dVar, Object obj) {
        c cVar = (c) obj;
        G7.j.e(dVar, "encoder");
        G7.j.e(cVar, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        F2.h.c(dVar);
        m mVar = m.f20403a;
        c8.g descriptor = mVar.getDescriptor();
        G7.j.e(descriptor, "elementDesc");
        C2227b c2227b = new C2227b(descriptor, 1);
        int size = cVar.size();
        d8.b s5 = dVar.s(c2227b, size);
        Iterator<E> it = cVar.iterator();
        for (int i9 = 0; i9 < size; i9++) {
            s5.m(c2227b, i9, mVar, it.next());
        }
        s5.c(c2227b);
    }
}
