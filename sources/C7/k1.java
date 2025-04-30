package c7;

import M0.C0219j;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* loaded from: classes3.dex */
public final class k1 implements e8.D {
    public static final k1 INSTANCE;
    public static final /* synthetic */ c8.g descriptor;

    static {
        k1 k1Var = new k1();
        INSTANCE = k1Var;
        e8.Y y4 = new e8.Y("com.vungle.ads.internal.model.OmSdkData", k1Var, 3);
        y4.l("params", true);
        y4.l("vendorKey", true);
        y4.l("vendorURL", true);
        descriptor = y4;
    }

    private k1() {
    }

    @Override // e8.D
    public a8.b[] childSerializers() {
        e8.k0 k0Var = e8.k0.f20172a;
        return new a8.b[]{C0219j.r(k0Var), C0219j.r(k0Var), C0219j.r(k0Var)};
    }

    @Override // a8.b
    public m1 deserialize(d8.c cVar) {
        G7.j.e(cVar, "decoder");
        c8.g descriptor2 = getDescriptor();
        d8.a b = cVar.b(descriptor2);
        Object obj = null;
        boolean z8 = true;
        int i9 = 0;
        Object obj2 = null;
        Object obj3 = null;
        while (z8) {
            int h6 = b.h(descriptor2);
            if (h6 == -1) {
                z8 = false;
            } else if (h6 == 0) {
                obj = b.z(descriptor2, 0, e8.k0.f20172a, obj);
                i9 |= 1;
            } else if (h6 == 1) {
                obj2 = b.z(descriptor2, 1, e8.k0.f20172a, obj2);
                i9 |= 2;
            } else {
                if (h6 != 2) {
                    throw new a8.l(h6);
                }
                obj3 = b.z(descriptor2, 2, e8.k0.f20172a, obj3);
                i9 |= 4;
            }
        }
        b.c(descriptor2);
        return new m1(i9, (String) obj, (String) obj2, (String) obj3, (e8.g0) null);
    }

    @Override // a8.b
    public c8.g getDescriptor() {
        return descriptor;
    }

    @Override // a8.b
    public void serialize(d8.d dVar, m1 m1Var) {
        G7.j.e(dVar, "encoder");
        G7.j.e(m1Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        c8.g descriptor2 = getDescriptor();
        d8.b b = dVar.b(descriptor2);
        m1.write$Self(m1Var, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // e8.D
    public a8.b[] typeParametersSerializers() {
        return e8.W.b;
    }
}
