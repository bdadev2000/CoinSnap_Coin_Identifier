package c7;

import M0.C0219j;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e8.C2231f;

/* renamed from: c7.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0630h implements e8.D {
    public static final C0630h INSTANCE;
    public static final /* synthetic */ c8.g descriptor;

    static {
        C0630h c0630h = new C0630h();
        INSTANCE = c0630h;
        e8.Y y4 = new e8.Y("com.vungle.ads.internal.model.AdPayload.CacheableReplacement", c0630h, 3);
        y4.l("url", true);
        y4.l("extension", true);
        y4.l("required", true);
        descriptor = y4;
    }

    private C0630h() {
    }

    @Override // e8.D
    public a8.b[] childSerializers() {
        e8.k0 k0Var = e8.k0.f20172a;
        return new a8.b[]{C0219j.r(k0Var), C0219j.r(k0Var), C0219j.r(C2231f.f20162a)};
    }

    @Override // a8.b
    public C0634j deserialize(d8.c cVar) {
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
                obj = b.z(descriptor2, 0, e8.k0.f20172a, obj);
                i9 |= 1;
            } else if (h6 == 1) {
                obj2 = b.z(descriptor2, 1, e8.k0.f20172a, obj2);
                i9 |= 2;
            } else {
                if (h6 != 2) {
                    throw new a8.l(h6);
                }
                obj3 = b.z(descriptor2, 2, C2231f.f20162a, obj3);
                i9 |= 4;
            }
        }
        b.c(descriptor2);
        return new C0634j(i9, (String) obj, (String) obj2, (Boolean) obj3, (e8.g0) null);
    }

    @Override // a8.b
    public c8.g getDescriptor() {
        return descriptor;
    }

    @Override // a8.b
    public void serialize(d8.d dVar, C0634j c0634j) {
        G7.j.e(dVar, "encoder");
        G7.j.e(c0634j, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        c8.g descriptor2 = getDescriptor();
        d8.b b = dVar.b(descriptor2);
        C0634j.write$Self(c0634j, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // e8.D
    public a8.b[] typeParametersSerializers() {
        return e8.W.b;
    }
}
