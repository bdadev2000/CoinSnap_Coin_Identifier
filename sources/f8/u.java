package f8;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* loaded from: classes3.dex */
public final class u implements a8.b {

    /* renamed from: a, reason: collision with root package name */
    public static final u f20407a = new Object();
    public static final c8.h b = android.support.v4.media.session.a.e("kotlinx.serialization.json.JsonNull", c8.k.f5452e, new c8.g[0], c8.j.b);

    @Override // a8.b
    public final Object deserialize(d8.c cVar) {
        G7.j.e(cVar, "decoder");
        F2.h.b(cVar);
        if (!cVar.v()) {
            return t.b;
        }
        throw new IllegalArgumentException("Expected 'null' literal");
    }

    @Override // a8.b
    public final c8.g getDescriptor() {
        return b;
    }

    @Override // a8.b
    public final void serialize(d8.d dVar, Object obj) {
        G7.j.e(dVar, "encoder");
        G7.j.e((t) obj, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        F2.h.c(dVar);
        dVar.f();
    }
}
