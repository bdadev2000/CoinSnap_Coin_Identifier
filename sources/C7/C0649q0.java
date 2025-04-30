package c7;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e8.C2231f;

/* renamed from: c7.q0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0649q0 implements e8.D {
    public static final C0649q0 INSTANCE;
    public static final /* synthetic */ c8.g descriptor;

    static {
        C0649q0 c0649q0 = new C0649q0();
        INSTANCE = c0649q0;
        e8.Y y4 = new e8.Y("com.vungle.ads.internal.model.ConfigPayload.CrashReportSettings", c0649q0, 3);
        y4.l("enabled", true);
        y4.l("max_send_amount", false);
        y4.l("collect_filter", false);
        descriptor = y4;
    }

    private C0649q0() {
    }

    @Override // e8.D
    public a8.b[] childSerializers() {
        return new a8.b[]{C2231f.f20162a, e8.K.f20127a, e8.k0.f20172a};
    }

    @Override // a8.b
    public C0652s0 deserialize(d8.c cVar) {
        G7.j.e(cVar, "decoder");
        c8.g descriptor2 = getDescriptor();
        d8.a b = cVar.b(descriptor2);
        int i9 = 0;
        boolean z8 = false;
        int i10 = 0;
        String str = null;
        boolean z9 = true;
        while (z9) {
            int h6 = b.h(descriptor2);
            if (h6 == -1) {
                z9 = false;
            } else if (h6 == 0) {
                z8 = b.j(descriptor2, 0);
                i9 |= 1;
            } else if (h6 == 1) {
                i10 = b.E(descriptor2, 1);
                i9 |= 2;
            } else {
                if (h6 != 2) {
                    throw new a8.l(h6);
                }
                str = b.w(descriptor2, 2);
                i9 |= 4;
            }
        }
        b.c(descriptor2);
        return new C0652s0(i9, z8, i10, str, (e8.g0) null);
    }

    @Override // a8.b
    public c8.g getDescriptor() {
        return descriptor;
    }

    @Override // a8.b
    public void serialize(d8.d dVar, C0652s0 c0652s0) {
        G7.j.e(dVar, "encoder");
        G7.j.e(c0652s0, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        c8.g descriptor2 = getDescriptor();
        d8.b b = dVar.b(descriptor2);
        C0652s0.write$Self(c0652s0, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // e8.D
    public a8.b[] typeParametersSerializers() {
        return e8.W.b;
    }
}
