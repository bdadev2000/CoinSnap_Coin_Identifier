package e8;

import androidx.fragment.app.C0477n;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import t7.AbstractC2712a;
import t7.EnumC2718g;
import t7.InterfaceC2717f;

/* loaded from: classes3.dex */
public final class U implements a8.b {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2717f f20139a = AbstractC2712a.c(EnumC2718g.f23018c, new C0477n(this));

    @Override // a8.b
    public final Object deserialize(d8.c cVar) {
        G7.j.e(cVar, "decoder");
        c8.g descriptor = getDescriptor();
        d8.a b = cVar.b(descriptor);
        int h6 = b.h(getDescriptor());
        if (h6 == -1) {
            b.c(descriptor);
            return t7.y.f23029a;
        }
        throw new IllegalArgumentException(com.mbridge.msdk.foundation.entity.o.h(h6, "Unexpected index "));
    }

    @Override // a8.b
    public final c8.g getDescriptor() {
        return (c8.g) this.f20139a.getValue();
    }

    @Override // a8.b
    public final void serialize(d8.d dVar, Object obj) {
        G7.j.e(dVar, "encoder");
        G7.j.e(obj, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        dVar.b(getDescriptor()).c(getDescriptor());
    }
}
