package c7;

import M0.C0219j;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;

/* renamed from: c7.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0644o implements e8.D {
    public static final C0644o INSTANCE;
    public static final /* synthetic */ c8.g descriptor;

    static {
        C0644o c0644o = new C0644o();
        INSTANCE = c0644o;
        e8.Y y4 = new e8.Y("com.vungle.ads.internal.model.AdPayload.TemplateSettings", c0644o, 2);
        y4.l("normal_replacements", true);
        y4.l("cacheable_replacements", true);
        descriptor = y4;
    }

    private C0644o() {
    }

    @Override // e8.D
    public a8.b[] childSerializers() {
        e8.k0 k0Var = e8.k0.f20172a;
        return new a8.b[]{C0219j.r(new e8.F(k0Var, k0Var, 1)), C0219j.r(new e8.F(k0Var, C0630h.INSTANCE, 1))};
    }

    @Override // a8.b
    public C0648q deserialize(d8.c cVar) {
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
                e8.k0 k0Var = e8.k0.f20172a;
                obj = b.z(descriptor2, 0, new e8.F(k0Var, k0Var, 1), obj);
                i9 |= 1;
            } else {
                if (h6 != 1) {
                    throw new a8.l(h6);
                }
                obj2 = b.z(descriptor2, 1, new e8.F(e8.k0.f20172a, C0630h.INSTANCE, 1), obj2);
                i9 |= 2;
            }
        }
        b.c(descriptor2);
        return new C0648q(i9, (Map) obj, (Map) obj2, g0Var);
    }

    @Override // a8.b
    public c8.g getDescriptor() {
        return descriptor;
    }

    @Override // a8.b
    public void serialize(d8.d dVar, C0648q c0648q) {
        G7.j.e(dVar, "encoder");
        G7.j.e(c0648q, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        c8.g descriptor2 = getDescriptor();
        d8.b b = dVar.b(descriptor2);
        C0648q.write$Self(c0648q, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // e8.D
    public a8.b[] typeParametersSerializers() {
        return e8.W.b;
    }
}
