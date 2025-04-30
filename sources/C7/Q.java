package c7;

import M0.C0219j;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e8.C2231f;

/* loaded from: classes3.dex */
public final class Q implements e8.D {
    public static final Q INSTANCE;
    public static final /* synthetic */ c8.g descriptor;

    static {
        Q q9 = new Q();
        INSTANCE = q9;
        e8.Y y4 = new e8.Y("com.vungle.ads.internal.model.CommonRequestBody.COPPA", q9, 1);
        y4.l("is_coppa", false);
        descriptor = y4;
    }

    private Q() {
    }

    @Override // e8.D
    public a8.b[] childSerializers() {
        return new a8.b[]{C0219j.r(C2231f.f20162a)};
    }

    @Override // a8.b
    public T deserialize(d8.c cVar) {
        G7.j.e(cVar, "decoder");
        c8.g descriptor2 = getDescriptor();
        d8.a b = cVar.b(descriptor2);
        e8.g0 g0Var = null;
        boolean z8 = true;
        int i9 = 0;
        Object obj = null;
        while (z8) {
            int h6 = b.h(descriptor2);
            if (h6 == -1) {
                z8 = false;
            } else {
                if (h6 != 0) {
                    throw new a8.l(h6);
                }
                obj = b.z(descriptor2, 0, C2231f.f20162a, obj);
                i9 = 1;
            }
        }
        b.c(descriptor2);
        return new T(i9, (Boolean) obj, g0Var);
    }

    @Override // a8.b
    public c8.g getDescriptor() {
        return descriptor;
    }

    @Override // a8.b
    public void serialize(d8.d dVar, T t9) {
        G7.j.e(dVar, "encoder");
        G7.j.e(t9, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        c8.g descriptor2 = getDescriptor();
        d8.b b = dVar.b(descriptor2);
        T.write$Self(t9, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // e8.D
    public a8.b[] typeParametersSerializers() {
        return e8.W.b;
    }
}
