package c7;

import M0.C0219j;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e8.C2228c;
import e8.C2231f;
import java.util.List;

/* loaded from: classes3.dex */
public final class n1 implements e8.D {
    public static final n1 INSTANCE;
    public static final /* synthetic */ c8.g descriptor;

    static {
        n1 n1Var = new n1();
        INSTANCE = n1Var;
        e8.Y y4 = new e8.Y("com.vungle.ads.internal.model.Placement", n1Var, 10);
        y4.l("id", false);
        y4.l("reference_id", false);
        y4.l("is_incentivized", true);
        y4.l("supported_template_types", true);
        y4.l("supported_ad_formats", true);
        y4.l("ad_refresh_duration", true);
        y4.l("header_bidding", true);
        y4.l("ad_size", true);
        y4.l("isIncentivized", true);
        y4.l("placementAdType", true);
        descriptor = y4;
    }

    private n1() {
    }

    @Override // e8.D
    public a8.b[] childSerializers() {
        e8.k0 k0Var = e8.k0.f20172a;
        C2231f c2231f = C2231f.f20162a;
        return new a8.b[]{k0Var, k0Var, C0219j.r(c2231f), new C2228c(k0Var, 0), new C2228c(k0Var, 0), e8.K.f20127a, c2231f, C0219j.r(k0Var), c2231f, k0Var};
    }

    @Override // a8.b
    public p1 deserialize(d8.c cVar) {
        G7.j.e(cVar, "decoder");
        c8.g descriptor2 = getDescriptor();
        d8.a b = cVar.b(descriptor2);
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        String str = null;
        Object obj4 = null;
        String str2 = null;
        String str3 = null;
        int i9 = 0;
        boolean z8 = true;
        int i10 = 0;
        boolean z9 = false;
        boolean z10 = false;
        while (z8) {
            int h6 = b.h(descriptor2);
            switch (h6) {
                case -1:
                    z8 = false;
                    break;
                case 0:
                    str = b.w(descriptor2, 0);
                    i9 |= 1;
                    break;
                case 1:
                    str2 = b.w(descriptor2, 1);
                    i9 |= 2;
                    break;
                case 2:
                    obj = b.z(descriptor2, 2, C2231f.f20162a, obj);
                    i9 |= 4;
                    break;
                case 3:
                    obj2 = b.A(descriptor2, 3, new C2228c(e8.k0.f20172a, 0), obj2);
                    i9 |= 8;
                    break;
                case 4:
                    obj3 = b.A(descriptor2, 4, new C2228c(e8.k0.f20172a, 0), obj3);
                    i9 |= 16;
                    break;
                case 5:
                    i10 = b.E(descriptor2, 5);
                    i9 |= 32;
                    break;
                case 6:
                    z9 = b.j(descriptor2, 6);
                    i9 |= 64;
                    break;
                case 7:
                    obj4 = b.z(descriptor2, 7, e8.k0.f20172a, obj4);
                    i9 |= 128;
                    break;
                case 8:
                    z10 = b.j(descriptor2, 8);
                    i9 |= NotificationCompat.FLAG_LOCAL_ONLY;
                    break;
                case 9:
                    str3 = b.w(descriptor2, 9);
                    i9 |= 512;
                    break;
                default:
                    throw new a8.l(h6);
            }
        }
        b.c(descriptor2);
        return new p1(i9, str, str2, (Boolean) obj, (List) obj2, (List) obj3, i10, z9, (String) obj4, z10, str3, null);
    }

    @Override // a8.b
    public c8.g getDescriptor() {
        return descriptor;
    }

    @Override // a8.b
    public void serialize(d8.d dVar, p1 p1Var) {
        G7.j.e(dVar, "encoder");
        G7.j.e(p1Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        c8.g descriptor2 = getDescriptor();
        d8.b b = dVar.b(descriptor2);
        p1.write$Self(p1Var, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // e8.D
    public a8.b[] typeParametersSerializers() {
        return e8.W.b;
    }
}
