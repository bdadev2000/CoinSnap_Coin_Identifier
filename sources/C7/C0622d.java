package c7;

import M0.C0219j;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e8.C2228c;
import e8.C2231f;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: c7.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0622d implements e8.D {
    public static final C0622d INSTANCE;
    public static final /* synthetic */ c8.g descriptor;

    static {
        C0622d c0622d = new C0622d();
        INSTANCE = c0622d;
        e8.Y y4 = new e8.Y("com.vungle.ads.internal.model.AdPayload", c0622d, 5);
        y4.l(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, true);
        y4.l("config", true);
        y4.l("mraidFiles", true);
        y4.l("incentivizedTextSettings", true);
        y4.l("assetsFullyDownloaded", true);
        descriptor = y4;
    }

    private C0622d() {
    }

    @Override // e8.D
    public a8.b[] childSerializers() {
        a8.b r9 = C0219j.r(new C2228c(C0638l.INSTANCE, 0));
        a8.b r10 = C0219j.r(C0633i0.INSTANCE);
        G7.e a6 = G7.s.a(ConcurrentHashMap.class);
        e8.k0 k0Var = e8.k0.f20172a;
        return new a8.b[]{r9, r10, new a8.a(a6, new a8.b[]{k0Var, k0Var}), new e8.F(k0Var, k0Var, 1), C2231f.f20162a};
    }

    @Override // a8.b
    public C0665z deserialize(d8.c cVar) {
        G7.j.e(cVar, "decoder");
        c8.g descriptor2 = getDescriptor();
        d8.a b = cVar.b(descriptor2);
        Object obj = null;
        int i9 = 0;
        boolean z8 = false;
        boolean z9 = true;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (z9) {
            int h6 = b.h(descriptor2);
            if (h6 == -1) {
                z9 = false;
            } else if (h6 == 0) {
                obj = b.z(descriptor2, 0, new C2228c(C0638l.INSTANCE, 0), obj);
                i9 |= 1;
            } else if (h6 == 1) {
                obj2 = b.z(descriptor2, 1, C0633i0.INSTANCE, obj2);
                i9 |= 2;
            } else if (h6 == 2) {
                G7.e a6 = G7.s.a(ConcurrentHashMap.class);
                e8.k0 k0Var = e8.k0.f20172a;
                obj3 = b.A(descriptor2, 2, new a8.a(a6, new a8.b[]{k0Var, k0Var}), obj3);
                i9 |= 4;
            } else if (h6 == 3) {
                e8.k0 k0Var2 = e8.k0.f20172a;
                obj4 = b.A(descriptor2, 3, new e8.F(k0Var2, k0Var2, 1), obj4);
                i9 |= 8;
            } else {
                if (h6 != 4) {
                    throw new a8.l(h6);
                }
                z8 = b.j(descriptor2, 4);
                i9 |= 16;
            }
        }
        b.c(descriptor2);
        return new C0665z(i9, (List) obj, (C0637k0) obj2, (ConcurrentHashMap) obj3, (Map) obj4, z8, null);
    }

    @Override // a8.b
    public c8.g getDescriptor() {
        return descriptor;
    }

    @Override // a8.b
    public void serialize(d8.d dVar, C0665z c0665z) {
        G7.j.e(dVar, "encoder");
        G7.j.e(c0665z, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        c8.g descriptor2 = getDescriptor();
        d8.b b = dVar.b(descriptor2);
        C0665z.write$Self(c0665z, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // e8.D
    public a8.b[] typeParametersSerializers() {
        return e8.W.b;
    }
}
