package c7;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e8.C2231f;

/* loaded from: classes3.dex */
public final class O0 implements e8.D {
    public static final O0 INSTANCE;
    public static final /* synthetic */ c8.g descriptor;

    static {
        O0 o02 = new O0();
        INSTANCE = o02;
        e8.Y y4 = new e8.Y("com.vungle.ads.internal.model.ConfigPayload.Template", o02, 1);
        y4.l("heartbeat_check_enabled", false);
        descriptor = y4;
    }

    private O0() {
    }

    @Override // e8.D
    public a8.b[] childSerializers() {
        return new a8.b[]{C2231f.f20162a};
    }

    @Override // a8.b
    public Q0 deserialize(d8.c cVar) {
        G7.j.e(cVar, "decoder");
        c8.g descriptor2 = getDescriptor();
        d8.a b = cVar.b(descriptor2);
        boolean z8 = true;
        int i9 = 0;
        boolean z9 = false;
        while (z8) {
            int h6 = b.h(descriptor2);
            if (h6 == -1) {
                z8 = false;
            } else {
                if (h6 != 0) {
                    throw new a8.l(h6);
                }
                z9 = b.j(descriptor2, 0);
                i9 = 1;
            }
        }
        b.c(descriptor2);
        return new Q0(i9, z9, null);
    }

    @Override // a8.b
    public c8.g getDescriptor() {
        return descriptor;
    }

    @Override // a8.b
    public void serialize(d8.d dVar, Q0 q02) {
        G7.j.e(dVar, "encoder");
        G7.j.e(q02, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        c8.g descriptor2 = getDescriptor();
        d8.b b = dVar.b(descriptor2);
        Q0.write$Self(q02, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // e8.D
    public a8.b[] typeParametersSerializers() {
        return e8.W.b;
    }
}
