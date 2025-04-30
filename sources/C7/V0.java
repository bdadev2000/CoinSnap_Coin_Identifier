package c7;

import M0.C0219j;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* loaded from: classes3.dex */
public final class V0 implements e8.D {
    public static final V0 INSTANCE;
    public static final /* synthetic */ c8.g descriptor;

    static {
        V0 v02 = new V0();
        INSTANCE = v02;
        e8.Y y4 = new e8.Y("com.vungle.ads.internal.model.DeviceNode", v02, 11);
        y4.l("make", false);
        y4.l("model", false);
        y4.l("osv", false);
        y4.l("carrier", true);
        y4.l("os", false);
        y4.l("w", false);
        y4.l("h", false);
        y4.l("ua", true);
        y4.l("ifa", true);
        y4.l("lmt", true);
        y4.l("ext", true);
        descriptor = y4;
    }

    private V0() {
    }

    @Override // e8.D
    public a8.b[] childSerializers() {
        e8.k0 k0Var = e8.k0.f20172a;
        a8.b r9 = C0219j.r(k0Var);
        e8.K k6 = e8.K.f20127a;
        return new a8.b[]{k0Var, k0Var, k0Var, r9, k0Var, k6, k6, C0219j.r(k0Var), C0219j.r(k0Var), C0219j.r(k6), C0219j.r(d1.INSTANCE)};
    }

    @Override // a8.b
    public j1 deserialize(d8.c cVar) {
        G7.j.e(cVar, "decoder");
        c8.g descriptor2 = getDescriptor();
        d8.a b = cVar.b(descriptor2);
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        String str = null;
        Object obj4 = null;
        Object obj5 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        boolean z8 = true;
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
                    str3 = b.w(descriptor2, 2);
                    i9 |= 4;
                    break;
                case 3:
                    obj = b.z(descriptor2, 3, e8.k0.f20172a, obj);
                    i9 |= 8;
                    break;
                case 4:
                    str4 = b.w(descriptor2, 4);
                    i9 |= 16;
                    break;
                case 5:
                    i10 = b.E(descriptor2, 5);
                    i9 |= 32;
                    break;
                case 6:
                    i11 = b.E(descriptor2, 6);
                    i9 |= 64;
                    break;
                case 7:
                    obj2 = b.z(descriptor2, 7, e8.k0.f20172a, obj2);
                    i9 |= 128;
                    break;
                case 8:
                    obj3 = b.z(descriptor2, 8, e8.k0.f20172a, obj3);
                    i9 |= NotificationCompat.FLAG_LOCAL_ONLY;
                    break;
                case 9:
                    obj4 = b.z(descriptor2, 9, e8.K.f20127a, obj4);
                    i9 |= 512;
                    break;
                case 10:
                    obj5 = b.z(descriptor2, 10, d1.INSTANCE, obj5);
                    i9 |= 1024;
                    break;
                default:
                    throw new a8.l(h6);
            }
        }
        b.c(descriptor2);
        return new j1(i9, str, str2, str3, (String) obj, str4, i10, i11, (String) obj2, (String) obj3, (Integer) obj4, (f1) obj5, (e8.g0) null);
    }

    @Override // a8.b
    public c8.g getDescriptor() {
        return descriptor;
    }

    @Override // a8.b
    public void serialize(d8.d dVar, j1 j1Var) {
        G7.j.e(dVar, "encoder");
        G7.j.e(j1Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        c8.g descriptor2 = getDescriptor();
        d8.b b = dVar.b(descriptor2);
        j1.write$Self(j1Var, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // e8.D
    public a8.b[] typeParametersSerializers() {
        return e8.W.b;
    }
}
