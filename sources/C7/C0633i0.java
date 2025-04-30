package c7;

import M0.C0219j;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e8.C2231f;

/* renamed from: c7.i0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0633i0 implements e8.D {
    public static final C0633i0 INSTANCE;
    public static final /* synthetic */ c8.g descriptor;

    static {
        C0633i0 c0633i0 = new C0633i0();
        INSTANCE = c0633i0;
        e8.Y y4 = new e8.Y("com.vungle.ads.internal.model.ConfigExtension", c0633i0, 2);
        y4.l("need_refresh", true);
        y4.l("config_extension", true);
        descriptor = y4;
    }

    private C0633i0() {
    }

    @Override // e8.D
    public a8.b[] childSerializers() {
        return new a8.b[]{C0219j.r(C2231f.f20162a), C0219j.r(e8.k0.f20172a)};
    }

    @Override // a8.b
    public C0637k0 deserialize(d8.c cVar) {
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
        return new C0637k0(i9, (Boolean) obj, (String) obj2, g0Var);
    }

    @Override // a8.b
    public c8.g getDescriptor() {
        return descriptor;
    }

    @Override // a8.b
    public void serialize(d8.d dVar, C0637k0 c0637k0) {
        G7.j.e(dVar, "encoder");
        G7.j.e(c0637k0, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        c8.g descriptor2 = getDescriptor();
        d8.b b = dVar.b(descriptor2);
        C0637k0.write$Self(c0637k0, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // e8.D
    public a8.b[] typeParametersSerializers() {
        return e8.W.b;
    }
}
