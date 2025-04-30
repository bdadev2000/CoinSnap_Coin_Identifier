package c7;

import M0.C0219j;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentTransaction;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e8.C2231f;

/* loaded from: classes3.dex */
public final class Z0 implements e8.D {
    public static final Z0 INSTANCE;
    public static final /* synthetic */ c8.g descriptor;

    static {
        Z0 z02 = new Z0();
        INSTANCE = z02;
        e8.Y y4 = new e8.Y("com.vungle.ads.internal.model.DeviceNode.CommonVungleExt", z02, 17);
        y4.l("android_id", true);
        y4.l("is_google_play_services_available", true);
        y4.l("app_set_id", true);
        y4.l("battery_level", true);
        y4.l("battery_state", true);
        y4.l("battery_saver_enabled", true);
        y4.l("connection_type", true);
        y4.l("connection_type_detail", true);
        y4.l("locale", true);
        y4.l("language", true);
        y4.l("time_zone", true);
        y4.l("volume_level", true);
        y4.l("sound_enabled", true);
        y4.l("is_tv", true);
        y4.l("sd_card_available", true);
        y4.l("is_sideload_enabled", true);
        y4.l("os_name", true);
        descriptor = y4;
    }

    private Z0() {
    }

    @Override // e8.D
    public a8.b[] childSerializers() {
        e8.k0 k0Var = e8.k0.f20172a;
        a8.b r9 = C0219j.r(k0Var);
        a8.b r10 = C0219j.r(k0Var);
        a8.b r11 = C0219j.r(k0Var);
        a8.b r12 = C0219j.r(k0Var);
        a8.b r13 = C0219j.r(k0Var);
        a8.b r14 = C0219j.r(k0Var);
        a8.b r15 = C0219j.r(k0Var);
        a8.b r16 = C0219j.r(k0Var);
        a8.b r17 = C0219j.r(k0Var);
        C2231f c2231f = C2231f.f20162a;
        e8.C c9 = e8.C.f20117a;
        e8.K k6 = e8.K.f20127a;
        return new a8.b[]{r9, c2231f, r10, c9, r11, k6, r12, r13, r14, r15, r16, c9, k6, c2231f, k6, c2231f, r17};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0032. Please report as an issue. */
    @Override // a8.b
    public b1 deserialize(d8.c cVar) {
        int i9;
        G7.j.e(cVar, "decoder");
        c8.g descriptor2 = getDescriptor();
        d8.a b = cVar.b(descriptor2);
        Object obj = null;
        boolean z8 = true;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        float f9 = 0.0f;
        float f10 = 0.0f;
        int i10 = 0;
        boolean z9 = false;
        int i11 = 0;
        int i12 = 0;
        boolean z10 = false;
        int i13 = 0;
        boolean z11 = false;
        Object obj9 = null;
        while (z8) {
            int h6 = b.h(descriptor2);
            switch (h6) {
                case -1:
                    z8 = false;
                case 0:
                    obj = b.z(descriptor2, 0, e8.k0.f20172a, obj);
                    i10 |= 1;
                case 1:
                    z9 = b.j(descriptor2, 1);
                    i10 |= 2;
                case 2:
                    obj9 = b.z(descriptor2, 2, e8.k0.f20172a, obj9);
                    i10 |= 4;
                case 3:
                    f9 = b.n(descriptor2, 3);
                    i10 |= 8;
                case 4:
                    obj2 = b.z(descriptor2, 4, e8.k0.f20172a, obj2);
                    i10 |= 16;
                case 5:
                    i11 = b.E(descriptor2, 5);
                    i10 |= 32;
                case 6:
                    obj3 = b.z(descriptor2, 6, e8.k0.f20172a, obj3);
                    i10 |= 64;
                case 7:
                    obj4 = b.z(descriptor2, 7, e8.k0.f20172a, obj4);
                    i10 |= 128;
                case 8:
                    obj5 = b.z(descriptor2, 8, e8.k0.f20172a, obj5);
                    i10 |= NotificationCompat.FLAG_LOCAL_ONLY;
                case 9:
                    obj6 = b.z(descriptor2, 9, e8.k0.f20172a, obj6);
                    i10 |= 512;
                case 10:
                    obj7 = b.z(descriptor2, 10, e8.k0.f20172a, obj7);
                    i10 |= 1024;
                case 11:
                    f10 = b.n(descriptor2, 11);
                    i10 |= 2048;
                case 12:
                    i12 = b.E(descriptor2, 12);
                    i10 |= 4096;
                case 13:
                    z10 = b.j(descriptor2, 13);
                    i10 |= FragmentTransaction.TRANSIT_EXIT_MASK;
                case 14:
                    i13 = b.E(descriptor2, 14);
                    i10 |= 16384;
                case 15:
                    z11 = b.j(descriptor2, 15);
                    i9 = 32768;
                    i10 |= i9;
                case 16:
                    obj8 = b.z(descriptor2, 16, e8.k0.f20172a, obj8);
                    i9 = 65536;
                    i10 |= i9;
                default:
                    throw new a8.l(h6);
            }
        }
        b.c(descriptor2);
        return new b1(i10, (String) obj, z9, (String) obj9, f9, (String) obj2, i11, (String) obj3, (String) obj4, (String) obj5, (String) obj6, (String) obj7, f10, i12, z10, i13, z11, (String) obj8, null);
    }

    @Override // a8.b
    public c8.g getDescriptor() {
        return descriptor;
    }

    @Override // a8.b
    public void serialize(d8.d dVar, b1 b1Var) {
        G7.j.e(dVar, "encoder");
        G7.j.e(b1Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        c8.g descriptor2 = getDescriptor();
        d8.b b = dVar.b(descriptor2);
        b1.write$Self(b1Var, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // e8.D
    public a8.b[] typeParametersSerializers() {
        return e8.W.b;
    }
}
