package e8;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import x0.AbstractC2914a;

/* renamed from: e8.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2246v implements a8.b {

    /* renamed from: a, reason: collision with root package name */
    public static final C2246v f20196a = new Object();
    public static final c0 b = new c0("kotlin.time.Duration", c8.e.l);

    @Override // a8.b
    public final Object deserialize(d8.c cVar) {
        G7.j.e(cVar, "decoder");
        int i9 = P7.a.f2440f;
        String p2 = cVar.p();
        G7.j.e(p2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        try {
            return new P7.a(r8.k.c(p2));
        } catch (IllegalArgumentException e4) {
            throw new IllegalArgumentException(AbstractC2914a.e("Invalid ISO duration string format: '", p2, "'."), e4);
        }
    }

    @Override // a8.b
    public final c8.g getDescriptor() {
        return b;
    }

    @Override // a8.b
    public final void serialize(d8.d dVar, Object obj) {
        long j7;
        int f9;
        int f10;
        boolean z8;
        boolean z9;
        long j9 = ((P7.a) obj).b;
        G7.j.e(dVar, "encoder");
        int i9 = P7.a.f2440f;
        StringBuilder sb = new StringBuilder();
        if (j9 < 0) {
            sb.append('-');
        }
        sb.append("PT");
        boolean z10 = true;
        if (j9 < 0) {
            j7 = ((-(j9 >> 1)) << 1) + (((int) j9) & 1);
            int i10 = P7.b.f2441a;
        } else {
            j7 = j9;
        }
        long f11 = P7.a.f(j7, P7.c.HOURS);
        if (P7.a.d(j7)) {
            f9 = 0;
        } else {
            f9 = (int) (P7.a.f(j7, P7.c.MINUTES) % 60);
        }
        if (P7.a.d(j7)) {
            f10 = 0;
        } else {
            f10 = (int) (P7.a.f(j7, P7.c.SECONDS) % 60);
        }
        int c9 = P7.a.c(j7);
        if (P7.a.d(j9)) {
            f11 = 9999999999999L;
        }
        if (f11 != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (f10 == 0 && c9 == 0) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (f9 == 0 && (!z9 || !z8)) {
            z10 = false;
        }
        if (z8) {
            sb.append(f11);
            sb.append('H');
        }
        if (z10) {
            sb.append(f9);
            sb.append('M');
        }
        if (z9 || (!z8 && !z10)) {
            P7.a.b(sb, f10, c9, 9, "S", true);
        }
        String sb2 = sb.toString();
        G7.j.d(sb2, "toString(...)");
        dVar.F(sb2);
    }
}
