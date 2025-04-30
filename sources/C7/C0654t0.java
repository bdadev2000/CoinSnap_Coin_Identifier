package c7;

import M0.C0219j;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* renamed from: c7.t0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0654t0 implements e8.D {
    public static final C0654t0 INSTANCE;
    public static final /* synthetic */ c8.g descriptor;

    static {
        C0654t0 c0654t0 = new C0654t0();
        INSTANCE = c0654t0;
        e8.Y y4 = new e8.Y("com.vungle.ads.internal.model.ConfigPayload.Endpoints", c0654t0, 5);
        y4.l(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, true);
        y4.l("ri", true);
        y4.l("mraid_js", true);
        y4.l("metrics", true);
        y4.l("error_logs", true);
        descriptor = y4;
    }

    private C0654t0() {
    }

    @Override // e8.D
    public a8.b[] childSerializers() {
        e8.k0 k0Var = e8.k0.f20172a;
        return new a8.b[]{C0219j.r(k0Var), C0219j.r(k0Var), C0219j.r(k0Var), C0219j.r(k0Var), C0219j.r(k0Var)};
    }

    @Override // a8.b
    public C0658v0 deserialize(d8.c cVar) {
        G7.j.e(cVar, "decoder");
        c8.g descriptor2 = getDescriptor();
        d8.a b = cVar.b(descriptor2);
        Object obj = null;
        boolean z8 = true;
        int i9 = 0;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
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
            } else if (h6 == 2) {
                obj3 = b.z(descriptor2, 2, e8.k0.f20172a, obj3);
                i9 |= 4;
            } else if (h6 == 3) {
                obj4 = b.z(descriptor2, 3, e8.k0.f20172a, obj4);
                i9 |= 8;
            } else {
                if (h6 != 4) {
                    throw new a8.l(h6);
                }
                obj5 = b.z(descriptor2, 4, e8.k0.f20172a, obj5);
                i9 |= 16;
            }
        }
        b.c(descriptor2);
        return new C0658v0(i9, (String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, (e8.g0) null);
    }

    @Override // a8.b
    public c8.g getDescriptor() {
        return descriptor;
    }

    @Override // a8.b
    public void serialize(d8.d dVar, C0658v0 c0658v0) {
        G7.j.e(dVar, "encoder");
        G7.j.e(c0658v0, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        c8.g descriptor2 = getDescriptor();
        d8.b b = dVar.b(descriptor2);
        C0658v0.write$Self(c0658v0, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // e8.D
    public a8.b[] typeParametersSerializers() {
        return e8.W.b;
    }
}
