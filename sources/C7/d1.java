package c7;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* loaded from: classes3.dex */
public final class d1 implements e8.D {
    public static final d1 INSTANCE;
    public static final /* synthetic */ c8.g descriptor;

    static {
        d1 d1Var = new d1();
        INSTANCE = d1Var;
        e8.Y y4 = new e8.Y("com.vungle.ads.internal.model.DeviceNode.DeviceExt", d1Var, 1);
        y4.l("vungle", false);
        descriptor = y4;
    }

    private d1() {
    }

    @Override // e8.D
    public a8.b[] childSerializers() {
        return new a8.b[]{g1.INSTANCE};
    }

    @Override // a8.b
    public f1 deserialize(d8.c cVar) {
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
                obj = b.A(descriptor2, 0, g1.INSTANCE, obj);
                i9 = 1;
            }
        }
        b.c(descriptor2);
        return new f1(i9, (i1) obj, g0Var);
    }

    @Override // a8.b
    public c8.g getDescriptor() {
        return descriptor;
    }

    @Override // a8.b
    public void serialize(d8.d dVar, f1 f1Var) {
        G7.j.e(dVar, "encoder");
        G7.j.e(f1Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        c8.g descriptor2 = getDescriptor();
        d8.b b = dVar.b(descriptor2);
        f1.write$Self(f1Var, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // e8.D
    public a8.b[] typeParametersSerializers() {
        return e8.W.b;
    }
}
