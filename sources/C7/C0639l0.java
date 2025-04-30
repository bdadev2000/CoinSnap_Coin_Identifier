package c7;

import M0.C0219j;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentTransaction;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e8.C2228c;
import e8.C2231f;
import java.util.List;

/* renamed from: c7.l0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0639l0 implements e8.D {
    public static final C0639l0 INSTANCE;
    public static final /* synthetic */ c8.g descriptor;

    static {
        C0639l0 c0639l0 = new C0639l0();
        INSTANCE = c0639l0;
        e8.Y y4 = new e8.Y("com.vungle.ads.internal.model.ConfigPayload", c0639l0, 19);
        y4.l("endpoints", true);
        y4.l("placements", true);
        y4.l("config", true);
        y4.l("gdpr", true);
        y4.l("logging", true);
        y4.l("crash_report", true);
        y4.l("viewability", true);
        y4.l("ad_load_optimization", true);
        y4.l("ri", true);
        y4.l("disable_ad_id", true);
        y4.l("config_extension", true);
        y4.l("template", true);
        y4.l("log_metrics", true);
        y4.l("session", true);
        y4.l("reuse_assets", true);
        y4.l("rta_debugging", true);
        y4.l("cacheable_assets_required", true);
        y4.l("sdk_session_timeout", true);
        y4.l("signals_disabled", true);
        descriptor = y4;
    }

    private C0639l0() {
    }

    @Override // e8.D
    public a8.b[] childSerializers() {
        a8.b r9 = C0219j.r(C0654t0.INSTANCE);
        a8.b r10 = C0219j.r(new C2228c(n1.INSTANCE, 0));
        a8.b r11 = C0219j.r(C0643n0.INSTANCE);
        a8.b r12 = C0219j.r(C0660w0.INSTANCE);
        a8.b r13 = C0219j.r(F0.INSTANCE);
        a8.b r14 = C0219j.r(C0649q0.INSTANCE);
        a8.b r15 = C0219j.r(R0.INSTANCE);
        a8.b r16 = C0219j.r(C0666z0.INSTANCE);
        a8.b r17 = C0219j.r(I0.INSTANCE);
        C2231f c2231f = C2231f.f20162a;
        return new a8.b[]{r9, r10, r11, r12, r13, r14, r15, r16, r17, C0219j.r(c2231f), C0219j.r(e8.k0.f20172a), C0219j.r(O0.INSTANCE), C0219j.r(C0.INSTANCE), C0219j.r(L0.INSTANCE), C0219j.r(J.INSTANCE), C0219j.r(c2231f), C0219j.r(c2231f), C0219j.r(e8.K.f20127a), C0219j.r(c2231f)};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0033. Please report as an issue. */
    @Override // a8.b
    public U0 deserialize(d8.c cVar) {
        Object obj;
        int i9;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        G7.j.e(cVar, "decoder");
        c8.g descriptor2 = getDescriptor();
        d8.a b = cVar.b(descriptor2);
        Object obj10 = null;
        Object obj11 = null;
        Object obj12 = null;
        Object obj13 = null;
        Object obj14 = null;
        Object obj15 = null;
        Object obj16 = null;
        Object obj17 = null;
        Object obj18 = null;
        Object obj19 = null;
        Object obj20 = null;
        Object obj21 = null;
        Object obj22 = null;
        Object obj23 = null;
        Object obj24 = null;
        Object obj25 = null;
        Object obj26 = null;
        Object obj27 = null;
        Object obj28 = null;
        int i10 = 0;
        boolean z8 = true;
        while (z8) {
            Object obj29 = obj17;
            int h6 = b.h(descriptor2);
            switch (h6) {
                case -1:
                    Object obj30 = obj14;
                    Object obj31 = obj28;
                    Object obj32 = obj13;
                    Object obj33 = obj27;
                    Object obj34 = obj10;
                    Object obj35 = obj26;
                    z8 = false;
                    obj17 = obj29;
                    obj12 = obj12;
                    obj15 = obj15;
                    obj25 = obj25;
                    obj18 = obj18;
                    obj11 = obj11;
                    obj16 = obj16;
                    obj26 = obj35;
                    obj10 = obj34;
                    obj27 = obj33;
                    obj13 = obj32;
                    obj28 = obj31;
                    obj14 = obj30;
                    obj23 = obj23;
                    obj22 = obj22;
                case 0:
                    obj2 = obj14;
                    obj3 = obj28;
                    obj4 = obj13;
                    obj5 = obj27;
                    Object obj36 = obj10;
                    Object obj37 = obj26;
                    i10 |= 1;
                    obj22 = obj22;
                    obj12 = obj12;
                    obj25 = obj25;
                    obj18 = obj18;
                    obj23 = b.z(descriptor2, 0, C0654t0.INSTANCE, obj23);
                    obj11 = obj11;
                    obj16 = obj16;
                    obj26 = obj37;
                    obj17 = obj29;
                    obj10 = obj36;
                    obj15 = obj15;
                    obj27 = obj5;
                    obj13 = obj4;
                    obj28 = obj3;
                    obj14 = obj2;
                case 1:
                    obj2 = obj14;
                    obj3 = obj28;
                    obj4 = obj13;
                    obj5 = obj27;
                    obj6 = obj10;
                    obj7 = obj26;
                    obj24 = b.z(descriptor2, 1, new C2228c(n1.INSTANCE, 0), obj24);
                    i10 |= 2;
                    obj17 = obj29;
                    obj18 = obj18;
                    obj12 = obj12;
                    obj15 = obj15;
                    obj16 = obj16;
                    obj25 = obj25;
                    obj11 = obj11;
                    obj26 = obj7;
                    obj10 = obj6;
                    obj27 = obj5;
                    obj13 = obj4;
                    obj28 = obj3;
                    obj14 = obj2;
                case 2:
                    obj2 = obj14;
                    obj3 = obj28;
                    obj4 = obj13;
                    obj5 = obj27;
                    obj6 = obj10;
                    obj7 = obj26;
                    obj25 = b.z(descriptor2, 2, C0643n0.INSTANCE, obj25);
                    i10 |= 4;
                    obj17 = obj29;
                    obj18 = obj18;
                    obj11 = obj11;
                    obj15 = obj15;
                    obj16 = obj16;
                    obj26 = obj7;
                    obj10 = obj6;
                    obj27 = obj5;
                    obj13 = obj4;
                    obj28 = obj3;
                    obj14 = obj2;
                case 3:
                    obj2 = obj14;
                    obj3 = obj28;
                    obj4 = obj13;
                    obj5 = obj27;
                    obj26 = b.z(descriptor2, 3, C0660w0.INSTANCE, obj26);
                    i10 |= 8;
                    obj17 = obj29;
                    obj18 = obj18;
                    obj10 = obj10;
                    obj15 = obj15;
                    obj16 = obj16;
                    obj27 = obj5;
                    obj13 = obj4;
                    obj28 = obj3;
                    obj14 = obj2;
                case 4:
                    obj2 = obj14;
                    obj3 = obj28;
                    obj27 = b.z(descriptor2, 4, F0.INSTANCE, obj27);
                    i10 |= 16;
                    obj17 = obj29;
                    obj18 = obj18;
                    obj13 = obj13;
                    obj15 = obj15;
                    obj16 = obj16;
                    obj28 = obj3;
                    obj14 = obj2;
                case 5:
                    obj8 = obj15;
                    obj9 = obj16;
                    obj28 = b.z(descriptor2, 5, C0649q0.INSTANCE, obj28);
                    i10 |= 32;
                    obj17 = obj29;
                    obj18 = obj18;
                    obj14 = obj14;
                    obj15 = obj8;
                    obj16 = obj9;
                case 6:
                    obj9 = obj16;
                    obj8 = obj15;
                    obj17 = b.z(descriptor2, 6, R0.INSTANCE, obj29);
                    i10 |= 64;
                    obj18 = obj18;
                    obj15 = obj8;
                    obj16 = obj9;
                case 7:
                    obj9 = obj16;
                    obj18 = b.z(descriptor2, 7, C0666z0.INSTANCE, obj18);
                    i10 |= 128;
                    obj17 = obj29;
                    obj16 = obj9;
                case 8:
                    obj = obj18;
                    obj19 = b.z(descriptor2, 8, I0.INSTANCE, obj19);
                    i10 |= NotificationCompat.FLAG_LOCAL_ONLY;
                    obj17 = obj29;
                    obj18 = obj;
                case 9:
                    obj = obj18;
                    obj20 = b.z(descriptor2, 9, C2231f.f20162a, obj20);
                    i10 |= 512;
                    obj17 = obj29;
                    obj18 = obj;
                case 10:
                    obj = obj18;
                    obj21 = b.z(descriptor2, 10, e8.k0.f20172a, obj21);
                    i10 |= 1024;
                    obj17 = obj29;
                    obj18 = obj;
                case 11:
                    obj = obj18;
                    obj22 = b.z(descriptor2, 11, O0.INSTANCE, obj22);
                    i10 |= 2048;
                    obj17 = obj29;
                    obj18 = obj;
                case 12:
                    obj = obj18;
                    obj12 = b.z(descriptor2, 12, C0.INSTANCE, obj12);
                    i10 |= 4096;
                    obj17 = obj29;
                    obj18 = obj;
                case 13:
                    obj = obj18;
                    obj11 = b.z(descriptor2, 13, L0.INSTANCE, obj11);
                    i10 |= FragmentTransaction.TRANSIT_EXIT_MASK;
                    obj17 = obj29;
                    obj18 = obj;
                case 14:
                    obj = obj18;
                    obj10 = b.z(descriptor2, 14, J.INSTANCE, obj10);
                    i10 |= 16384;
                    obj17 = obj29;
                    obj18 = obj;
                case 15:
                    obj = obj18;
                    obj13 = b.z(descriptor2, 15, C2231f.f20162a, obj13);
                    i9 = 32768;
                    i10 |= i9;
                    obj17 = obj29;
                    obj18 = obj;
                case 16:
                    obj = obj18;
                    obj14 = b.z(descriptor2, 16, C2231f.f20162a, obj14);
                    i9 = 65536;
                    i10 |= i9;
                    obj17 = obj29;
                    obj18 = obj;
                case 17:
                    obj = obj18;
                    obj15 = b.z(descriptor2, 17, e8.K.f20127a, obj15);
                    i9 = 131072;
                    i10 |= i9;
                    obj17 = obj29;
                    obj18 = obj;
                case 18:
                    obj = obj18;
                    obj16 = b.z(descriptor2, 18, C2231f.f20162a, obj16);
                    i9 = 262144;
                    i10 |= i9;
                    obj17 = obj29;
                    obj18 = obj;
                default:
                    throw new a8.l(h6);
            }
        }
        Object obj38 = obj14;
        Object obj39 = obj15;
        Object obj40 = obj16;
        Object obj41 = obj18;
        Object obj42 = obj28;
        Object obj43 = obj13;
        Object obj44 = obj27;
        Object obj45 = obj10;
        Object obj46 = obj26;
        Object obj47 = obj11;
        Object obj48 = obj25;
        Object obj49 = obj23;
        b.c(descriptor2);
        return new U0(i10, (C0658v0) obj49, (List) obj24, (C0647p0) obj48, (C0664y0) obj46, (H0) obj44, (C0652s0) obj42, (T0) obj17, (B0) obj41, (K0) obj19, (Boolean) obj20, (String) obj21, (Q0) obj22, (E0) obj12, (N0) obj47, (L) obj45, (Boolean) obj43, (Boolean) obj38, (Integer) obj39, (Boolean) obj40, (e8.g0) null);
    }

    @Override // a8.b
    public c8.g getDescriptor() {
        return descriptor;
    }

    @Override // a8.b
    public void serialize(d8.d dVar, U0 u02) {
        G7.j.e(dVar, "encoder");
        G7.j.e(u02, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        c8.g descriptor2 = getDescriptor();
        d8.b b = dVar.b(descriptor2);
        U0.write$Self(u02, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // e8.D
    public a8.b[] typeParametersSerializers() {
        return e8.W.b;
    }
}
