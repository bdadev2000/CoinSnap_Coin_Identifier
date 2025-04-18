package n1;

import org.objectweb.asm.signature.SignatureVisitor;

/* loaded from: classes4.dex */
public final class t implements k1.a {

    /* renamed from: a, reason: collision with root package name */
    public static final t f31132a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final a1 f31133b = new a1("kotlin.time.Duration", l1.e.f31028i);

    @Override // k1.a
    public final void a(p0.a aVar, Object obj) {
        long j2;
        long j3 = ((a1.a) obj).f60a;
        p0.a.s(aVar, "encoder");
        int i2 = a1.a.d;
        StringBuilder sb = new StringBuilder();
        if (j3 < 0) {
            sb.append(SignatureVisitor.SUPER);
        }
        sb.append("PT");
        boolean z2 = true;
        if (j3 < 0) {
            j2 = ((-(j3 >> 1)) << 1) + (((int) j3) & 1);
            int i3 = a1.b.f61a;
        } else {
            j2 = j3;
        }
        long h2 = a1.a.h(j2, a1.c.f65g);
        int h3 = a1.a.f(j2) ? 0 : (int) (a1.a.h(j2, a1.c.f64f) % 60);
        int h4 = a1.a.f(j2) ? 0 : (int) (a1.a.h(j2, a1.c.d) % 60);
        int e = a1.a.e(j2);
        if (a1.a.f(j3)) {
            h2 = 9999999999999L;
        }
        boolean z3 = h2 != 0;
        boolean z4 = (h4 == 0 && e == 0) ? false : true;
        if (h3 == 0 && (!z4 || !z3)) {
            z2 = false;
        }
        if (z3) {
            sb.append(h2);
            sb.append('H');
        }
        if (z2) {
            sb.append(h3);
            sb.append('M');
        }
        if (z4 || (!z3 && !z2)) {
            a1.a.b(sb, h4, e, 9, "S", true);
        }
        String sb2 = sb.toString();
        p0.a.r(sb2, "toString(...)");
        aVar.b0(sb2);
    }

    @Override // k1.a
    public final l1.f b() {
        return f31133b;
    }
}
