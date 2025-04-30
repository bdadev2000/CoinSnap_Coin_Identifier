package z;

import java.util.ArrayList;
import l5.k;

/* renamed from: z.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2962b {

    /* renamed from: d, reason: collision with root package name */
    public final C2961a f24462d;

    /* renamed from: a, reason: collision with root package name */
    public C2966f f24460a = null;
    public float b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f24461c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f24463e = false;

    public C2962b(k kVar) {
        this.f24462d = new C2961a(this, kVar);
    }

    public final void a(C2963c c2963c, int i9) {
        this.f24462d.j(c2963c.j(i9), 1.0f);
        this.f24462d.j(c2963c.j(i9), -1.0f);
    }

    public final void b(C2966f c2966f, C2966f c2966f2, C2966f c2966f3, int i9) {
        boolean z8 = false;
        if (i9 != 0) {
            if (i9 < 0) {
                i9 *= -1;
                z8 = true;
            }
            this.b = i9;
        }
        if (!z8) {
            this.f24462d.j(c2966f, -1.0f);
            this.f24462d.j(c2966f2, 1.0f);
            this.f24462d.j(c2966f3, 1.0f);
        } else {
            this.f24462d.j(c2966f, 1.0f);
            this.f24462d.j(c2966f2, -1.0f);
            this.f24462d.j(c2966f3, -1.0f);
        }
    }

    public final void c(C2966f c2966f, C2966f c2966f2, C2966f c2966f3, int i9) {
        boolean z8 = false;
        if (i9 != 0) {
            if (i9 < 0) {
                i9 *= -1;
                z8 = true;
            }
            this.b = i9;
        }
        if (!z8) {
            this.f24462d.j(c2966f, -1.0f);
            this.f24462d.j(c2966f2, 1.0f);
            this.f24462d.j(c2966f3, -1.0f);
        } else {
            this.f24462d.j(c2966f, 1.0f);
            this.f24462d.j(c2966f2, -1.0f);
            this.f24462d.j(c2966f3, 1.0f);
        }
    }

    public C2966f d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        if (this.f24460a == null && this.b == 0.0f && this.f24462d.f() == 0) {
            return true;
        }
        return false;
    }

    public final C2966f f(boolean[] zArr, C2966f c2966f) {
        int i9;
        int f9 = this.f24462d.f();
        C2966f c2966f2 = null;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < f9; i10++) {
            float h6 = this.f24462d.h(i10);
            if (h6 < 0.0f) {
                C2966f g9 = this.f24462d.g(i10);
                if ((zArr == null || !zArr[g9.f24483c]) && g9 != c2966f && (((i9 = g9.f24491n) == 3 || i9 == 4) && h6 < f10)) {
                    f10 = h6;
                    c2966f2 = g9;
                }
            }
        }
        return c2966f2;
    }

    public final void g(C2966f c2966f) {
        C2966f c2966f2 = this.f24460a;
        if (c2966f2 != null) {
            this.f24462d.j(c2966f2, -1.0f);
            this.f24460a.f24484d = -1;
            this.f24460a = null;
        }
        float k6 = this.f24462d.k(c2966f, true) * (-1.0f);
        this.f24460a = c2966f;
        if (k6 == 1.0f) {
            return;
        }
        this.b /= k6;
        this.f24462d.d(k6);
    }

    public final void h(C2963c c2963c, C2966f c2966f, boolean z8) {
        if (c2966f != null && c2966f.f24487h) {
            float e4 = this.f24462d.e(c2966f);
            this.b = (c2966f.f24486g * e4) + this.b;
            this.f24462d.k(c2966f, z8);
            if (z8) {
                c2966f.b(this);
            }
            if (this.f24462d.f() == 0) {
                this.f24463e = true;
                c2963c.f24466a = true;
            }
        }
    }

    public void i(C2963c c2963c, C2962b c2962b, boolean z8) {
        float l = this.f24462d.l(c2962b, z8);
        this.b = (c2962b.b * l) + this.b;
        if (z8) {
            c2962b.f24460a.b(this);
        }
        if (this.f24460a != null && this.f24462d.f() == 0) {
            this.f24463e = true;
            c2963c.f24466a = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r10 = this;
            z.f r0 = r10.f24460a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L17
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            z.f r1 = r10.f24460a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            java.lang.String r1 = " = "
            java.lang.String r0 = com.mbridge.msdk.foundation.entity.o.j(r0, r1)
            float r1 = r10.b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L35
            java.lang.StringBuilder r0 = z.AbstractC2965e.b(r0)
            float r1 = r10.b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r3
            goto L36
        L35:
            r1 = r4
        L36:
            z.a r5 = r10.f24462d
            int r5 = r5.f()
        L3c:
            if (r4 >= r5) goto L9c
            z.a r6 = r10.f24462d
            z.f r6 = r6.g(r4)
            if (r6 != 0) goto L47
            goto L99
        L47:
            z.a r7 = r10.f24462d
            float r7 = r7.h(r4)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L52
            goto L99
        L52:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L66
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L76
            java.lang.String r1 = "- "
            java.lang.String r0 = com.mbridge.msdk.foundation.entity.o.j(r0, r1)
        L64:
            float r7 = r7 * r9
            goto L76
        L66:
            if (r8 <= 0) goto L6f
            java.lang.String r1 = " + "
            java.lang.String r0 = com.mbridge.msdk.foundation.entity.o.j(r0, r1)
            goto L76
        L6f:
            java.lang.String r1 = " - "
            java.lang.String r0 = com.mbridge.msdk.foundation.entity.o.j(r0, r1)
            goto L64
        L76:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L81
            java.lang.String r0 = com.mbridge.msdk.foundation.entity.o.j(r0, r6)
            goto L98
        L81:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L98:
            r1 = r3
        L99:
            int r4 = r4 + 1
            goto L3c
        L9c:
            if (r1 != 0) goto La4
            java.lang.String r1 = "0.0"
            java.lang.String r0 = com.mbridge.msdk.foundation.entity.o.j(r0, r1)
        La4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z.C2962b.toString():java.lang.String");
    }
}
