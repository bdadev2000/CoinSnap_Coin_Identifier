package c7;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e8.C2231f;

/* renamed from: c7.z0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0666z0 implements e8.D {
    public static final C0666z0 INSTANCE;
    public static final /* synthetic */ c8.g descriptor;

    static {
        C0666z0 c0666z0 = new C0666z0();
        INSTANCE = c0666z0;
        e8.Y y4 = new e8.Y("com.vungle.ads.internal.model.ConfigPayload.LoadOptimizationSettings", c0666z0, 1);
        y4.l("enabled", false);
        descriptor = y4;
    }

    private C0666z0() {
    }

    @Override // e8.D
    public a8.b[] childSerializers() {
        return new a8.b[]{C2231f.f20162a};
    }

    @Override // a8.b
    public B0 deserialize(d8.c cVar) {
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
        return new B0(i9, z9, null);
    }

    @Override // a8.b
    public c8.g getDescriptor() {
        return descriptor;
    }

    @Override // a8.b
    public void serialize(d8.d dVar, B0 b02) {
        G7.j.e(dVar, "encoder");
        G7.j.e(b02, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        c8.g descriptor2 = getDescriptor();
        d8.b b = dVar.b(descriptor2);
        B0.write$Self(b02, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // e8.D
    public a8.b[] typeParametersSerializers() {
        return e8.W.b;
    }
}
