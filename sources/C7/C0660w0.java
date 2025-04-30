package c7;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e8.C2231f;

/* renamed from: c7.w0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0660w0 implements e8.D {
    public static final C0660w0 INSTANCE;
    public static final /* synthetic */ c8.g descriptor;

    static {
        C0660w0 c0660w0 = new C0660w0();
        INSTANCE = c0660w0;
        e8.Y y4 = new e8.Y("com.vungle.ads.internal.model.ConfigPayload.GDPRSettings", c0660w0, 6);
        y4.l("is_country_data_protected", false);
        y4.l("consent_title", false);
        y4.l("consent_message", false);
        y4.l("consent_message_version", false);
        y4.l("button_accept", false);
        y4.l("button_deny", false);
        descriptor = y4;
    }

    private C0660w0() {
    }

    @Override // e8.D
    public a8.b[] childSerializers() {
        e8.k0 k0Var = e8.k0.f20172a;
        return new a8.b[]{C2231f.f20162a, k0Var, k0Var, k0Var, k0Var, k0Var};
    }

    @Override // a8.b
    public C0664y0 deserialize(d8.c cVar) {
        G7.j.e(cVar, "decoder");
        c8.g descriptor2 = getDescriptor();
        d8.a b = cVar.b(descriptor2);
        int i9 = 0;
        boolean z8 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        boolean z9 = true;
        while (z9) {
            int h6 = b.h(descriptor2);
            switch (h6) {
                case -1:
                    z9 = false;
                    break;
                case 0:
                    z8 = b.j(descriptor2, 0);
                    i9 |= 1;
                    break;
                case 1:
                    str = b.w(descriptor2, 1);
                    i9 |= 2;
                    break;
                case 2:
                    str2 = b.w(descriptor2, 2);
                    i9 |= 4;
                    break;
                case 3:
                    str3 = b.w(descriptor2, 3);
                    i9 |= 8;
                    break;
                case 4:
                    str4 = b.w(descriptor2, 4);
                    i9 |= 16;
                    break;
                case 5:
                    str5 = b.w(descriptor2, 5);
                    i9 |= 32;
                    break;
                default:
                    throw new a8.l(h6);
            }
        }
        b.c(descriptor2);
        return new C0664y0(i9, z8, str, str2, str3, str4, str5, null);
    }

    @Override // a8.b
    public c8.g getDescriptor() {
        return descriptor;
    }

    @Override // a8.b
    public void serialize(d8.d dVar, C0664y0 c0664y0) {
        G7.j.e(dVar, "encoder");
        G7.j.e(c0664y0, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        c8.g descriptor2 = getDescriptor();
        d8.b b = dVar.b(descriptor2);
        C0664y0.write$Self(c0664y0, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // e8.D
    public a8.b[] typeParametersSerializers() {
        return e8.W.b;
    }
}
