package c7;

import M0.C0219j;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e8.C2228c;
import java.util.List;

/* loaded from: classes3.dex */
public final class E implements e8.D {
    public static final E INSTANCE;
    public static final /* synthetic */ c8.g descriptor;

    static {
        E e4 = new E();
        INSTANCE = e4;
        e8.Y y4 = new e8.Y("com.vungle.ads.internal.model.BidPayload", e4, 4);
        y4.l("version", true);
        y4.l("adunit", true);
        y4.l("impression", true);
        y4.l("ad", true);
        descriptor = y4;
    }

    private E() {
    }

    @Override // e8.D
    public a8.b[] childSerializers() {
        a8.b r9 = C0219j.r(e8.K.f20127a);
        e8.k0 k0Var = e8.k0.f20172a;
        return new a8.b[]{r9, C0219j.r(k0Var), C0219j.r(new C2228c(k0Var, 0)), C0219j.r(C0622d.INSTANCE)};
    }

    @Override // a8.b
    public I deserialize(d8.c cVar) {
        G7.j.e(cVar, "decoder");
        c8.g descriptor2 = getDescriptor();
        d8.a b = cVar.b(descriptor2);
        Object obj = null;
        boolean z8 = true;
        int i9 = 0;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (z8) {
            int h6 = b.h(descriptor2);
            if (h6 == -1) {
                z8 = false;
            } else if (h6 == 0) {
                obj = b.z(descriptor2, 0, e8.K.f20127a, obj);
                i9 |= 1;
            } else if (h6 == 1) {
                obj2 = b.z(descriptor2, 1, e8.k0.f20172a, obj2);
                i9 |= 2;
            } else if (h6 == 2) {
                obj3 = b.z(descriptor2, 2, new C2228c(e8.k0.f20172a, 0), obj3);
                i9 |= 4;
            } else {
                if (h6 != 3) {
                    throw new a8.l(h6);
                }
                obj4 = b.z(descriptor2, 3, C0622d.INSTANCE, obj4);
                i9 |= 8;
            }
        }
        b.c(descriptor2);
        return new I(i9, (Integer) obj, (String) obj2, (List) obj3, (C0665z) obj4, null);
    }

    @Override // a8.b
    public c8.g getDescriptor() {
        return descriptor;
    }

    @Override // a8.b
    public void serialize(d8.d dVar, I i9) {
        G7.j.e(dVar, "encoder");
        G7.j.e(i9, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        c8.g descriptor2 = getDescriptor();
        d8.b b = dVar.b(descriptor2);
        I.write$Self(i9, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // e8.D
    public a8.b[] typeParametersSerializers() {
        return e8.W.b;
    }
}
