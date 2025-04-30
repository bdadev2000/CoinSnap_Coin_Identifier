package c7;

import M0.C0219j;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* loaded from: classes3.dex */
public final class Y implements e8.D {
    public static final Y INSTANCE;
    public static final /* synthetic */ c8.g descriptor;

    static {
        Y y4 = new Y();
        INSTANCE = y4;
        e8.Y y6 = new e8.Y("com.vungle.ads.internal.model.CommonRequestBody.RequestExt", y4, 2);
        y6.l("config_extension", true);
        y6.l("signals", true);
        descriptor = y6;
    }

    private Y() {
    }

    @Override // e8.D
    public a8.b[] childSerializers() {
        e8.k0 k0Var = e8.k0.f20172a;
        return new a8.b[]{C0219j.r(k0Var), C0219j.r(k0Var)};
    }

    @Override // a8.b
    public C0617a0 deserialize(d8.c cVar) {
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
                obj2 = b.z(descriptor2, 1, e8.k0.f20172a, obj2);
                i9 |= 2;
            }
        }
        b.c(descriptor2);
        return new C0617a0(i9, (String) obj, (String) obj2, g0Var);
    }

    @Override // a8.b
    public c8.g getDescriptor() {
        return descriptor;
    }

    @Override // a8.b
    public void serialize(d8.d dVar, C0617a0 c0617a0) {
        G7.j.e(dVar, "encoder");
        G7.j.e(c0617a0, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        c8.g descriptor2 = getDescriptor();
        d8.b b = dVar.b(descriptor2);
        C0617a0.write$Self(c0617a0, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // e8.D
    public a8.b[] typeParametersSerializers() {
        return e8.W.b;
    }
}
