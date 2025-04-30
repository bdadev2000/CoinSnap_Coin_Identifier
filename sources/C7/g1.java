package c7;

import M0.C0219j;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* loaded from: classes3.dex */
public final class g1 implements e8.D {
    public static final g1 INSTANCE;
    public static final /* synthetic */ c8.g descriptor;

    static {
        g1 g1Var = new g1();
        INSTANCE = g1Var;
        e8.Y y4 = new e8.Y("com.vungle.ads.internal.model.DeviceNode.VungleExt", g1Var, 2);
        y4.l("android", true);
        y4.l("amazon", true);
        descriptor = y4;
    }

    private g1() {
    }

    @Override // e8.D
    public a8.b[] childSerializers() {
        W0 w02 = W0.INSTANCE;
        return new a8.b[]{C0219j.r(w02), C0219j.r(w02)};
    }

    @Override // a8.b
    public i1 deserialize(d8.c cVar) {
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
                obj = b.z(descriptor2, 0, W0.INSTANCE, obj);
                i9 |= 1;
            } else {
                if (h6 != 1) {
                    throw new a8.l(h6);
                }
                obj2 = b.z(descriptor2, 1, W0.INSTANCE, obj2);
                i9 |= 2;
            }
        }
        b.c(descriptor2);
        return new i1(i9, (Y0) obj, (Y0) obj2, g0Var);
    }

    @Override // a8.b
    public c8.g getDescriptor() {
        return descriptor;
    }

    @Override // a8.b
    public void serialize(d8.d dVar, i1 i1Var) {
        G7.j.e(dVar, "encoder");
        G7.j.e(i1Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        c8.g descriptor2 = getDescriptor();
        d8.b b = dVar.b(descriptor2);
        i1.write$Self(i1Var, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // e8.D
    public a8.b[] typeParametersSerializers() {
        return e8.W.b;
    }
}
