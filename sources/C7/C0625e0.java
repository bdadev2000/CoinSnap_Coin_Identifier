package c7;

import M0.C0219j;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* renamed from: c7.e0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0625e0 implements e8.D {
    public static final C0625e0 INSTANCE;
    public static final /* synthetic */ c8.g descriptor;

    static {
        C0625e0 c0625e0 = new C0625e0();
        INSTANCE = c0625e0;
        e8.Y y4 = new e8.Y("com.vungle.ads.internal.model.CommonRequestBody.User", c0625e0, 3);
        y4.l("gdpr", true);
        y4.l("ccpa", true);
        y4.l("coppa", true);
        descriptor = y4;
    }

    private C0625e0() {
    }

    @Override // e8.D
    public a8.b[] childSerializers() {
        return new a8.b[]{C0219j.r(V.INSTANCE), C0219j.r(N.INSTANCE), C0219j.r(Q.INSTANCE)};
    }

    @Override // a8.b
    public C0629g0 deserialize(d8.c cVar) {
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
                obj = b.z(descriptor2, 0, V.INSTANCE, obj);
                i9 |= 1;
            } else if (h6 == 1) {
                obj2 = b.z(descriptor2, 1, N.INSTANCE, obj2);
                i9 |= 2;
            } else {
                if (h6 != 2) {
                    throw new a8.l(h6);
                }
                obj3 = b.z(descriptor2, 2, Q.INSTANCE, obj3);
                i9 |= 4;
            }
        }
        b.c(descriptor2);
        return new C0629g0(i9, (X) obj, (P) obj2, (T) obj3, (e8.g0) null);
    }

    @Override // a8.b
    public c8.g getDescriptor() {
        return descriptor;
    }

    @Override // a8.b
    public void serialize(d8.d dVar, C0629g0 c0629g0) {
        G7.j.e(dVar, "encoder");
        G7.j.e(c0629g0, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        c8.g descriptor2 = getDescriptor();
        d8.b b = dVar.b(descriptor2);
        C0629g0.write$Self(c0629g0, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // e8.D
    public a8.b[] typeParametersSerializers() {
        return e8.W.b;
    }
}
