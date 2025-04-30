package f8;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* loaded from: classes3.dex */
public final class z implements a8.b {

    /* renamed from: a, reason: collision with root package name */
    public static final z f20411a = new Object();
    public static final c8.h b = android.support.v4.media.session.a.e("kotlinx.serialization.json.JsonPrimitive", c8.e.l, new c8.g[0], c8.j.b);

    @Override // a8.b
    public final Object deserialize(d8.c cVar) {
        G7.j.e(cVar, "decoder");
        j l = F2.h.b(cVar).l();
        if (l instanceof y) {
            return (y) l;
        }
        throw g8.k.d(l.toString(), -1, "Unexpected JSON element, expected JsonPrimitive, had " + G7.s.a(l.getClass()));
    }

    @Override // a8.b
    public final c8.g getDescriptor() {
        return b;
    }

    @Override // a8.b
    public final void serialize(d8.d dVar, Object obj) {
        y yVar = (y) obj;
        G7.j.e(dVar, "encoder");
        G7.j.e(yVar, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        F2.h.c(dVar);
        if (yVar instanceof t) {
            dVar.g(u.f20407a, t.b);
        } else {
            dVar.g(r.f20406a, (q) yVar);
        }
    }
}
