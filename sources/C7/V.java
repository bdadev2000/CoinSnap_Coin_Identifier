package c7;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* loaded from: classes3.dex */
public final class V implements e8.D {
    public static final V INSTANCE;
    public static final /* synthetic */ c8.g descriptor;

    static {
        V v6 = new V();
        INSTANCE = v6;
        e8.Y y4 = new e8.Y("com.vungle.ads.internal.model.CommonRequestBody.GDPR", v6, 4);
        y4.l("consent_status", false);
        y4.l("consent_source", false);
        y4.l("consent_timestamp", false);
        y4.l("consent_message_version", false);
        descriptor = y4;
    }

    private V() {
    }

    @Override // e8.D
    public a8.b[] childSerializers() {
        e8.k0 k0Var = e8.k0.f20172a;
        return new a8.b[]{k0Var, k0Var, e8.O.f20131a, k0Var};
    }

    @Override // a8.b
    public X deserialize(d8.c cVar) {
        G7.j.e(cVar, "decoder");
        c8.g descriptor2 = getDescriptor();
        d8.a b = cVar.b(descriptor2);
        int i9 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        long j7 = 0;
        boolean z8 = true;
        while (z8) {
            int h6 = b.h(descriptor2);
            if (h6 == -1) {
                z8 = false;
            } else if (h6 == 0) {
                str = b.w(descriptor2, 0);
                i9 |= 1;
            } else if (h6 == 1) {
                str2 = b.w(descriptor2, 1);
                i9 |= 2;
            } else if (h6 == 2) {
                j7 = b.o(descriptor2, 2);
                i9 |= 4;
            } else {
                if (h6 != 3) {
                    throw new a8.l(h6);
                }
                str3 = b.w(descriptor2, 3);
                i9 |= 8;
            }
        }
        b.c(descriptor2);
        return new X(i9, str, str2, j7, str3, null);
    }

    @Override // a8.b
    public c8.g getDescriptor() {
        return descriptor;
    }

    @Override // a8.b
    public void serialize(d8.d dVar, X x9) {
        G7.j.e(dVar, "encoder");
        G7.j.e(x9, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        c8.g descriptor2 = getDescriptor();
        d8.b b = dVar.b(descriptor2);
        X.write$Self(x9, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // e8.D
    public a8.b[] typeParametersSerializers() {
        return e8.W.b;
    }
}
