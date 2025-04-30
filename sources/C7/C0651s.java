package c7;

import M0.C0219j;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* renamed from: c7.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0651s implements e8.D {
    public static final C0651s INSTANCE;
    public static final /* synthetic */ c8.g descriptor;

    static {
        C0651s c0651s = new C0651s();
        INSTANCE = c0651s;
        e8.Y y4 = new e8.Y("com.vungle.ads.internal.model.AdPayload.Viewability", c0651s, 1);
        y4.l("om", true);
        descriptor = y4;
    }

    private C0651s() {
    }

    @Override // e8.D
    public a8.b[] childSerializers() {
        return new a8.b[]{C0219j.r(C0657v.INSTANCE)};
    }

    @Override // a8.b
    public C0655u deserialize(d8.c cVar) {
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
                obj = b.z(descriptor2, 0, C0657v.INSTANCE, obj);
                i9 = 1;
            }
        }
        b.c(descriptor2);
        return new C0655u(i9, (C0661x) obj, g0Var);
    }

    @Override // a8.b
    public c8.g getDescriptor() {
        return descriptor;
    }

    @Override // a8.b
    public void serialize(d8.d dVar, C0655u c0655u) {
        G7.j.e(dVar, "encoder");
        G7.j.e(c0655u, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        c8.g descriptor2 = getDescriptor();
        d8.b b = dVar.b(descriptor2);
        C0655u.write$Self(c0655u, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // e8.D
    public a8.b[] typeParametersSerializers() {
        return e8.W.b;
    }
}
