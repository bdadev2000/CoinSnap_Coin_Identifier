package c7;

import M0.C0219j;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e8.C2231f;

/* renamed from: c7.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0657v implements e8.D {
    public static final C0657v INSTANCE;
    public static final /* synthetic */ c8.g descriptor;

    static {
        C0657v c0657v = new C0657v();
        INSTANCE = c0657v;
        e8.Y y4 = new e8.Y("com.vungle.ads.internal.model.AdPayload.ViewabilityInfo", c0657v, 2);
        y4.l("is_enabled", true);
        y4.l("extra_vast", true);
        descriptor = y4;
    }

    private C0657v() {
    }

    @Override // e8.D
    public a8.b[] childSerializers() {
        return new a8.b[]{C0219j.r(C2231f.f20162a), C0219j.r(e8.k0.f20172a)};
    }

    @Override // a8.b
    public C0661x deserialize(d8.c cVar) {
        G7.j.e(cVar, "decoder");
        c8.g descriptor2 = getDescriptor();
        d8.a b = cVar.b(descriptor2);
        e8.g0 g0Var = null;
        boolean z8 = true;
        int i9 = 0;
        Object obj = null;
        Object obj2 = null;
        while (z8) {
            int h6 = b.h(descriptor2);
            if (h6 == -1) {
                z8 = false;
            } else if (h6 == 0) {
                obj = b.z(descriptor2, 0, C2231f.f20162a, obj);
                i9 |= 1;
            } else {
                if (h6 != 1) {
                    throw new a8.l(h6);
                }
                obj2 = b.z(descriptor2, 1, e8.k0.f20172a, obj2);
                i9 |= 2;
            }
        }
        b.c(descriptor2);
        return new C0661x(i9, (Boolean) obj, (String) obj2, g0Var);
    }

    @Override // a8.b
    public c8.g getDescriptor() {
        return descriptor;
    }

    @Override // a8.b
    public void serialize(d8.d dVar, C0661x c0661x) {
        G7.j.e(dVar, "encoder");
        G7.j.e(c0661x, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        c8.g descriptor2 = getDescriptor();
        d8.b b = dVar.b(descriptor2);
        C0661x.write$Self(c0661x, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // e8.D
    public a8.b[] typeParametersSerializers() {
        return e8.W.b;
    }
}
