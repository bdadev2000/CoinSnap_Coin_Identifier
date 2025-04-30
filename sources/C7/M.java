package c7;

import M0.C0219j;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.MBridgeConstans;

/* loaded from: classes3.dex */
public final class M implements e8.D {
    public static final M INSTANCE;
    public static final /* synthetic */ c8.g descriptor;

    static {
        M m = new M();
        INSTANCE = m;
        e8.Y y4 = new e8.Y("com.vungle.ads.internal.model.CommonRequestBody", m, 5);
        y4.l("device", false);
        y4.l(MBridgeConstans.DYNAMIC_VIEW_WX_APP, true);
        y4.l("user", true);
        y4.l("ext", true);
        y4.l(com.vungle.ads.internal.ui.i.REQUEST_KEY_EXTRA, true);
        descriptor = y4;
    }

    private M() {
    }

    @Override // e8.D
    public a8.b[] childSerializers() {
        return new a8.b[]{V0.INSTANCE, C0219j.r(B.INSTANCE), C0219j.r(C0625e0.INSTANCE), C0219j.r(Y.INSTANCE), C0219j.r(C0619b0.INSTANCE)};
    }

    @Override // a8.b
    public C0631h0 deserialize(d8.c cVar) {
        G7.j.e(cVar, "decoder");
        c8.g descriptor2 = getDescriptor();
        d8.a b = cVar.b(descriptor2);
        Object obj = null;
        boolean z8 = true;
        int i9 = 0;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (z8) {
            int h6 = b.h(descriptor2);
            if (h6 == -1) {
                z8 = false;
            } else if (h6 == 0) {
                obj = b.A(descriptor2, 0, V0.INSTANCE, obj);
                i9 |= 1;
            } else if (h6 == 1) {
                obj2 = b.z(descriptor2, 1, B.INSTANCE, obj2);
                i9 |= 2;
            } else if (h6 == 2) {
                obj3 = b.z(descriptor2, 2, C0625e0.INSTANCE, obj3);
                i9 |= 4;
            } else if (h6 == 3) {
                obj4 = b.z(descriptor2, 3, Y.INSTANCE, obj4);
                i9 |= 8;
            } else {
                if (h6 != 4) {
                    throw new a8.l(h6);
                }
                obj5 = b.z(descriptor2, 4, C0619b0.INSTANCE, obj5);
                i9 |= 16;
            }
        }
        b.c(descriptor2);
        return new C0631h0(i9, (j1) obj, (D) obj2, (C0629g0) obj3, (C0617a0) obj4, (C0623d0) obj5, (e8.g0) null);
    }

    @Override // a8.b
    public c8.g getDescriptor() {
        return descriptor;
    }

    @Override // a8.b
    public void serialize(d8.d dVar, C0631h0 c0631h0) {
        G7.j.e(dVar, "encoder");
        G7.j.e(c0631h0, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        c8.g descriptor2 = getDescriptor();
        d8.b b = dVar.b(descriptor2);
        C0631h0.write$Self(c0631h0, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // e8.D
    public a8.b[] typeParametersSerializers() {
        return e8.W.b;
    }
}
