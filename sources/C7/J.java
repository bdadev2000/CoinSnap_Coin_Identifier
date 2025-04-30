package c7;

import M0.C0219j;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e8.C2231f;

/* loaded from: classes3.dex */
public final class J implements e8.D {
    public static final J INSTANCE;
    public static final /* synthetic */ c8.g descriptor;

    static {
        J j7 = new J();
        INSTANCE = j7;
        e8.Y y4 = new e8.Y("com.vungle.ads.internal.model.CleverCache", j7, 3);
        y4.l("enabled", true);
        y4.l("disk_size", true);
        y4.l("disk_percentage", true);
        descriptor = y4;
    }

    private J() {
    }

    @Override // e8.D
    public a8.b[] childSerializers() {
        return new a8.b[]{C0219j.r(C2231f.f20162a), C0219j.r(e8.O.f20131a), C0219j.r(e8.K.f20127a)};
    }

    @Override // a8.b
    public L deserialize(d8.c cVar) {
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
                obj = b.z(descriptor2, 0, C2231f.f20162a, obj);
                i9 |= 1;
            } else if (h6 == 1) {
                obj2 = b.z(descriptor2, 1, e8.O.f20131a, obj2);
                i9 |= 2;
            } else {
                if (h6 != 2) {
                    throw new a8.l(h6);
                }
                obj3 = b.z(descriptor2, 2, e8.K.f20127a, obj3);
                i9 |= 4;
            }
        }
        b.c(descriptor2);
        return new L(i9, (Boolean) obj, (Long) obj2, (Integer) obj3, (e8.g0) null);
    }

    @Override // a8.b
    public c8.g getDescriptor() {
        return descriptor;
    }

    @Override // a8.b
    public void serialize(d8.d dVar, L l) {
        G7.j.e(dVar, "encoder");
        G7.j.e(l, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        c8.g descriptor2 = getDescriptor();
        d8.b b = dVar.b(descriptor2);
        L.write$Self(l, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // e8.D
    public a8.b[] typeParametersSerializers() {
        return e8.W.b;
    }
}
