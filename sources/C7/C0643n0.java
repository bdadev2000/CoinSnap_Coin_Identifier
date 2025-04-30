package c7;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* renamed from: c7.n0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0643n0 implements e8.D {
    public static final C0643n0 INSTANCE;
    public static final /* synthetic */ c8.g descriptor;

    static {
        C0643n0 c0643n0 = new C0643n0();
        INSTANCE = c0643n0;
        e8.Y y4 = new e8.Y("com.vungle.ads.internal.model.ConfigPayload.ConfigSettings", c0643n0, 1);
        y4.l("refresh_time", false);
        descriptor = y4;
    }

    private C0643n0() {
    }

    @Override // e8.D
    public a8.b[] childSerializers() {
        return new a8.b[]{e8.K.f20127a};
    }

    @Override // a8.b
    public C0647p0 deserialize(d8.c cVar) {
        G7.j.e(cVar, "decoder");
        c8.g descriptor2 = getDescriptor();
        d8.a b = cVar.b(descriptor2);
        boolean z8 = true;
        int i9 = 0;
        int i10 = 0;
        while (z8) {
            int h6 = b.h(descriptor2);
            if (h6 == -1) {
                z8 = false;
            } else {
                if (h6 != 0) {
                    throw new a8.l(h6);
                }
                i10 = b.E(descriptor2, 0);
                i9 = 1;
            }
        }
        b.c(descriptor2);
        return new C0647p0(i9, i10, null);
    }

    @Override // a8.b
    public c8.g getDescriptor() {
        return descriptor;
    }

    @Override // a8.b
    public void serialize(d8.d dVar, C0647p0 c0647p0) {
        G7.j.e(dVar, "encoder");
        G7.j.e(c0647p0, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        c8.g descriptor2 = getDescriptor();
        d8.b b = dVar.b(descriptor2);
        C0647p0.write$Self(c0647p0, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // e8.D
    public a8.b[] typeParametersSerializers() {
        return e8.W.b;
    }
}
