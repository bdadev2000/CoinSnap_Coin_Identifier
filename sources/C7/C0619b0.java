package c7;

import M0.C0219j;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.MBridgeConstans;
import e8.C2228c;
import e8.C2231f;
import java.util.List;

/* renamed from: c7.b0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0619b0 implements e8.D {
    public static final C0619b0 INSTANCE;
    public static final /* synthetic */ c8.g descriptor;

    static {
        C0619b0 c0619b0 = new C0619b0();
        INSTANCE = c0619b0;
        e8.Y y4 = new e8.Y("com.vungle.ads.internal.model.CommonRequestBody.RequestParam", c0619b0, 7);
        y4.l("placements", true);
        y4.l("header_bidding", true);
        y4.l("ad_size", true);
        y4.l("adStartTime", true);
        y4.l(MBridgeConstans.APP_ID, true);
        y4.l("placement_reference_id", true);
        y4.l("user", true);
        descriptor = y4;
    }

    private C0619b0() {
    }

    @Override // e8.D
    public a8.b[] childSerializers() {
        e8.k0 k0Var = e8.k0.f20172a;
        return new a8.b[]{C0219j.r(new C2228c(k0Var, 0)), C0219j.r(C2231f.f20162a), C0219j.r(k0Var), C0219j.r(e8.O.f20131a), C0219j.r(k0Var), C0219j.r(k0Var), C0219j.r(k0Var)};
    }

    @Override // a8.b
    public C0623d0 deserialize(d8.c cVar) {
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
        Object obj6 = null;
        Object obj7 = null;
        while (z8) {
            int h6 = b.h(descriptor2);
            switch (h6) {
                case -1:
                    z8 = false;
                    break;
                case 0:
                    obj = b.z(descriptor2, 0, new C2228c(e8.k0.f20172a, 0), obj);
                    i9 |= 1;
                    break;
                case 1:
                    obj2 = b.z(descriptor2, 1, C2231f.f20162a, obj2);
                    i9 |= 2;
                    break;
                case 2:
                    obj3 = b.z(descriptor2, 2, e8.k0.f20172a, obj3);
                    i9 |= 4;
                    break;
                case 3:
                    obj4 = b.z(descriptor2, 3, e8.O.f20131a, obj4);
                    i9 |= 8;
                    break;
                case 4:
                    obj5 = b.z(descriptor2, 4, e8.k0.f20172a, obj5);
                    i9 |= 16;
                    break;
                case 5:
                    obj6 = b.z(descriptor2, 5, e8.k0.f20172a, obj6);
                    i9 |= 32;
                    break;
                case 6:
                    obj7 = b.z(descriptor2, 6, e8.k0.f20172a, obj7);
                    i9 |= 64;
                    break;
                default:
                    throw new a8.l(h6);
            }
        }
        b.c(descriptor2);
        return new C0623d0(i9, (List) obj, (Boolean) obj2, (String) obj3, (Long) obj4, (String) obj5, (String) obj6, (String) obj7, (e8.g0) null);
    }

    @Override // a8.b
    public c8.g getDescriptor() {
        return descriptor;
    }

    @Override // a8.b
    public void serialize(d8.d dVar, C0623d0 c0623d0) {
        G7.j.e(dVar, "encoder");
        G7.j.e(c0623d0, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        c8.g descriptor2 = getDescriptor();
        d8.b b = dVar.b(descriptor2);
        C0623d0.write$Self(c0623d0, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // e8.D
    public a8.b[] typeParametersSerializers() {
        return e8.W.b;
    }
}
