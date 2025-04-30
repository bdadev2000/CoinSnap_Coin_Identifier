package c7;

import M0.C0219j;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* loaded from: classes3.dex */
public final class t1 implements e8.D {
    public static final t1 INSTANCE;
    public static final /* synthetic */ c8.g descriptor;

    static {
        t1 t1Var = new t1();
        INSTANCE = t1Var;
        e8.Y y4 = new e8.Y("com.vungle.ads.internal.model.RtbToken", t1Var, 5);
        y4.l("device", false);
        y4.l("user", true);
        y4.l("ext", true);
        y4.l(com.vungle.ads.internal.ui.i.REQUEST_KEY_EXTRA, true);
        y4.l("ordinal_view", false);
        descriptor = y4;
    }

    private t1() {
    }

    @Override // e8.D
    public a8.b[] childSerializers() {
        return new a8.b[]{V0.INSTANCE, C0219j.r(C0625e0.INSTANCE), C0219j.r(Y.INSTANCE), C0219j.r(q1.INSTANCE), e8.K.f20127a};
    }

    @Override // a8.b
    public v1 deserialize(d8.c cVar) {
        G7.j.e(cVar, "decoder");
        c8.g descriptor2 = getDescriptor();
        d8.a b = cVar.b(descriptor2);
        Object obj = null;
        boolean z8 = true;
        int i9 = 0;
        int i10 = 0;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (z8) {
            int h6 = b.h(descriptor2);
            if (h6 == -1) {
                z8 = false;
            } else if (h6 == 0) {
                obj = b.A(descriptor2, 0, V0.INSTANCE, obj);
                i9 |= 1;
            } else if (h6 == 1) {
                obj2 = b.z(descriptor2, 1, C0625e0.INSTANCE, obj2);
                i9 |= 2;
            } else if (h6 == 2) {
                obj3 = b.z(descriptor2, 2, Y.INSTANCE, obj3);
                i9 |= 4;
            } else if (h6 == 3) {
                obj4 = b.z(descriptor2, 3, q1.INSTANCE, obj4);
                i9 |= 8;
            } else {
                if (h6 != 4) {
                    throw new a8.l(h6);
                }
                i10 = b.E(descriptor2, 4);
                i9 |= 16;
            }
        }
        b.c(descriptor2);
        return new v1(i9, (j1) obj, (C0629g0) obj2, (C0617a0) obj3, (s1) obj4, i10, (e8.g0) null);
    }

    @Override // a8.b
    public c8.g getDescriptor() {
        return descriptor;
    }

    @Override // a8.b
    public void serialize(d8.d dVar, v1 v1Var) {
        G7.j.e(dVar, "encoder");
        G7.j.e(v1Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        c8.g descriptor2 = getDescriptor();
        d8.b b = dVar.b(descriptor2);
        v1.write$Self(v1Var, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // e8.D
    public a8.b[] typeParametersSerializers() {
        return e8.W.b;
    }
}
