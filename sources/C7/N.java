package c7;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* loaded from: classes3.dex */
public final class N implements e8.D {
    public static final N INSTANCE;
    public static final /* synthetic */ c8.g descriptor;

    static {
        N n2 = new N();
        INSTANCE = n2;
        e8.Y y4 = new e8.Y("com.vungle.ads.internal.model.CommonRequestBody.CCPA", n2, 1);
        y4.l(NotificationCompat.CATEGORY_STATUS, false);
        descriptor = y4;
    }

    private N() {
    }

    @Override // e8.D
    public a8.b[] childSerializers() {
        return new a8.b[]{e8.k0.f20172a};
    }

    @Override // a8.b
    public P deserialize(d8.c cVar) {
        G7.j.e(cVar, "decoder");
        c8.g descriptor2 = getDescriptor();
        d8.a b = cVar.b(descriptor2);
        e8.g0 g0Var = null;
        boolean z8 = true;
        int i9 = 0;
        String str = null;
        while (z8) {
            int h6 = b.h(descriptor2);
            if (h6 == -1) {
                z8 = false;
            } else {
                if (h6 != 0) {
                    throw new a8.l(h6);
                }
                str = b.w(descriptor2, 0);
                i9 = 1;
            }
        }
        b.c(descriptor2);
        return new P(i9, str, g0Var);
    }

    @Override // a8.b
    public c8.g getDescriptor() {
        return descriptor;
    }

    @Override // a8.b
    public void serialize(d8.d dVar, P p2) {
        G7.j.e(dVar, "encoder");
        G7.j.e(p2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        c8.g descriptor2 = getDescriptor();
        d8.b b = dVar.b(descriptor2);
        P.write$Self(p2, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // e8.D
    public a8.b[] typeParametersSerializers() {
        return e8.W.b;
    }
}
