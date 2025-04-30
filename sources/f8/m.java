package f8;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* loaded from: classes3.dex */
public final class m implements a8.b {

    /* renamed from: a, reason: collision with root package name */
    public static final m f20403a = new Object();
    public static final c8.h b = android.support.v4.media.session.a.e("kotlinx.serialization.json.JsonElement", c8.c.f5430e, new c8.g[0], l.f20401c);

    @Override // a8.b
    public final Object deserialize(d8.c cVar) {
        G7.j.e(cVar, "decoder");
        return F2.h.b(cVar).l();
    }

    @Override // a8.b
    public final c8.g getDescriptor() {
        return b;
    }

    @Override // a8.b
    public final void serialize(d8.d dVar, Object obj) {
        j jVar = (j) obj;
        G7.j.e(dVar, "encoder");
        G7.j.e(jVar, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        F2.h.c(dVar);
        if (jVar instanceof y) {
            dVar.g(z.f20411a, jVar);
        } else if (jVar instanceof v) {
            dVar.g(x.f20410a, jVar);
        } else if (jVar instanceof c) {
            dVar.g(e.f20374a, jVar);
        }
    }
}
