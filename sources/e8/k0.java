package e8;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* loaded from: classes3.dex */
public final class k0 implements a8.b {

    /* renamed from: a, reason: collision with root package name */
    public static final k0 f20172a = new Object();
    public static final c0 b = new c0("kotlin.String", c8.e.l);

    @Override // a8.b
    public final Object deserialize(d8.c cVar) {
        G7.j.e(cVar, "decoder");
        return cVar.p();
    }

    @Override // a8.b
    public final c8.g getDescriptor() {
        return b;
    }

    @Override // a8.b
    public final void serialize(d8.d dVar, Object obj) {
        String str = (String) obj;
        G7.j.e(dVar, "encoder");
        G7.j.e(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        dVar.F(str);
    }
}
