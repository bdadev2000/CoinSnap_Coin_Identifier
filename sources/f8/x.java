package f8;

import M0.C0219j;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e8.k0;
import java.util.Map;

/* loaded from: classes3.dex */
public final class x implements a8.b {

    /* renamed from: a, reason: collision with root package name */
    public static final x f20410a = new Object();
    public static final w b = w.b;

    @Override // a8.b
    public final Object deserialize(d8.c cVar) {
        G7.j.e(cVar, "decoder");
        F2.h.b(cVar);
        k0 k0Var = k0.f20172a;
        return new v((Map) C0219j.a(m.f20403a).deserialize(cVar));
    }

    @Override // a8.b
    public final c8.g getDescriptor() {
        return b;
    }

    @Override // a8.b
    public final void serialize(d8.d dVar, Object obj) {
        v vVar = (v) obj;
        G7.j.e(dVar, "encoder");
        G7.j.e(vVar, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        F2.h.c(dVar);
        k0 k0Var = k0.f20172a;
        C0219j.a(m.f20403a).serialize(dVar, vVar);
    }
}
