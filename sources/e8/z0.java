package e8;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* loaded from: classes3.dex */
public final class z0 implements a8.b {
    public static final z0 b = new z0();

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U f20208a = new U();

    @Override // a8.b
    public final Object deserialize(d8.c cVar) {
        G7.j.e(cVar, "decoder");
        this.f20208a.deserialize(cVar);
        return t7.y.f23029a;
    }

    @Override // a8.b
    public final c8.g getDescriptor() {
        return this.f20208a.getDescriptor();
    }

    @Override // a8.b
    public final void serialize(d8.d dVar, Object obj) {
        t7.y yVar = (t7.y) obj;
        G7.j.e(dVar, "encoder");
        G7.j.e(yVar, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.f20208a.serialize(dVar, yVar);
    }
}
