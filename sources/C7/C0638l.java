package c7;

import M0.C0219j;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* renamed from: c7.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0638l implements e8.D {
    public static final C0638l INSTANCE;
    public static final /* synthetic */ c8.g descriptor;

    static {
        C0638l c0638l = new C0638l();
        INSTANCE = c0638l;
        e8.Y y4 = new e8.Y("com.vungle.ads.internal.model.AdPayload.PlacementAdUnit", c0638l, 2);
        y4.l("placement_reference_id", true);
        y4.l("ad_markup", true);
        descriptor = y4;
    }

    private C0638l() {
    }

    @Override // e8.D
    public a8.b[] childSerializers() {
        return new a8.b[]{C0219j.r(e8.k0.f20172a), C0219j.r(C0624e.INSTANCE)};
    }

    @Override // a8.b
    public C0642n deserialize(d8.c cVar) {
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
                obj = b.z(descriptor2, 0, e8.k0.f20172a, obj);
                i9 |= 1;
            } else {
                if (h6 != 1) {
                    throw new a8.l(h6);
                }
                obj2 = b.z(descriptor2, 1, C0624e.INSTANCE, obj2);
                i9 |= 2;
            }
        }
        b.c(descriptor2);
        return new C0642n(i9, (String) obj, (C0628g) obj2, g0Var);
    }

    @Override // a8.b
    public c8.g getDescriptor() {
        return descriptor;
    }

    @Override // a8.b
    public void serialize(d8.d dVar, C0642n c0642n) {
        G7.j.e(dVar, "encoder");
        G7.j.e(c0642n, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        c8.g descriptor2 = getDescriptor();
        d8.b b = dVar.b(descriptor2);
        C0642n.write$Self(c0642n, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // e8.D
    public a8.b[] typeParametersSerializers() {
        return e8.W.b;
    }
}
