package c7;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* loaded from: classes3.dex */
public final class B implements e8.D {
    public static final B INSTANCE;
    public static final /* synthetic */ c8.g descriptor;

    static {
        B b = new B();
        INSTANCE = b;
        e8.Y y4 = new e8.Y("com.vungle.ads.internal.model.AppNode", b, 3);
        y4.l("bundle", false);
        y4.l("ver", false);
        y4.l("id", false);
        descriptor = y4;
    }

    private B() {
    }

    @Override // e8.D
    public a8.b[] childSerializers() {
        e8.k0 k0Var = e8.k0.f20172a;
        return new a8.b[]{k0Var, k0Var, k0Var};
    }

    @Override // a8.b
    public D deserialize(d8.c cVar) {
        G7.j.e(cVar, "decoder");
        c8.g descriptor2 = getDescriptor();
        d8.a b = cVar.b(descriptor2);
        int i9 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
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
            } else {
                if (h6 != 2) {
                    throw new a8.l(h6);
                }
                str3 = b.w(descriptor2, 2);
                i9 |= 4;
            }
        }
        b.c(descriptor2);
        return new D(i9, str, str2, str3, null);
    }

    @Override // a8.b
    public c8.g getDescriptor() {
        return descriptor;
    }

    @Override // a8.b
    public void serialize(d8.d dVar, D d2) {
        G7.j.e(dVar, "encoder");
        G7.j.e(d2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        c8.g descriptor2 = getDescriptor();
        d8.b b = dVar.b(descriptor2);
        D.write$Self(d2, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // e8.D
    public a8.b[] typeParametersSerializers() {
        return e8.W.b;
    }
}
