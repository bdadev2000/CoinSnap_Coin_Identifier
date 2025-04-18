package t;

import ic.t;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class c {

    /* renamed from: d, reason: collision with root package name */
    public b f25100d;
    public i a = null;

    /* renamed from: b, reason: collision with root package name */
    public float f25098b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f25099c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f25101e = false;

    public c(t tVar) {
        this.f25100d = new a(this, tVar);
    }

    public final void a(d dVar, int i10) {
        this.f25100d.c(dVar.j(i10), 1.0f);
        this.f25100d.c(dVar.j(i10), -1.0f);
    }

    public final void b(i iVar, i iVar2, i iVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f25098b = i10;
        }
        if (!z10) {
            this.f25100d.c(iVar, -1.0f);
            this.f25100d.c(iVar2, 1.0f);
            this.f25100d.c(iVar3, 1.0f);
        } else {
            this.f25100d.c(iVar, 1.0f);
            this.f25100d.c(iVar2, -1.0f);
            this.f25100d.c(iVar3, -1.0f);
        }
    }

    public final void c(i iVar, i iVar2, i iVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f25098b = i10;
        }
        if (!z10) {
            this.f25100d.c(iVar, -1.0f);
            this.f25100d.c(iVar2, 1.0f);
            this.f25100d.c(iVar3, -1.0f);
        } else {
            this.f25100d.c(iVar, 1.0f);
            this.f25100d.c(iVar2, -1.0f);
            this.f25100d.c(iVar3, 1.0f);
        }
    }

    public i d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.a == null && this.f25098b == 0.0f && this.f25100d.g() == 0;
    }

    public final i f(boolean[] zArr, i iVar) {
        int i10;
        int g10 = this.f25100d.g();
        i iVar2 = null;
        float f10 = 0.0f;
        for (int i11 = 0; i11 < g10; i11++) {
            float h10 = this.f25100d.h(i11);
            if (h10 < 0.0f) {
                i a = this.f25100d.a(i11);
                if ((zArr == null || !zArr[a.f25128c]) && a != iVar && (((i10 = a.f25138n) == 3 || i10 == 4) && h10 < f10)) {
                    f10 = h10;
                    iVar2 = a;
                }
            }
        }
        return iVar2;
    }

    public final void g(i iVar) {
        i iVar2 = this.a;
        if (iVar2 != null) {
            this.f25100d.c(iVar2, -1.0f);
            this.a.f25129d = -1;
            this.a = null;
        }
        float f10 = this.f25100d.f(iVar, true) * (-1.0f);
        this.a = iVar;
        if (f10 == 1.0f) {
            return;
        }
        this.f25098b /= f10;
        this.f25100d.j(f10);
    }

    public final void h(d dVar, i iVar, boolean z10) {
        if (iVar != null && iVar.f25132h) {
            float d10 = this.f25100d.d(iVar);
            this.f25098b = (iVar.f25131g * d10) + this.f25098b;
            this.f25100d.f(iVar, z10);
            if (z10) {
                iVar.b(this);
            }
            if (this.f25100d.g() == 0) {
                this.f25101e = true;
                dVar.a = true;
            }
        }
    }

    public void i(d dVar, c cVar, boolean z10) {
        float i10 = this.f25100d.i(cVar, z10);
        this.f25098b = (cVar.f25098b * i10) + this.f25098b;
        if (z10) {
            cVar.a.b(this);
        }
        if (this.a != null && this.f25100d.g() == 0) {
            this.f25101e = true;
            dVar.a = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r9 = this;
            t.i r0 = r9.a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L17
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            t.i r1 = r9.a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            java.lang.String r1 = " = "
            java.lang.String r0 = eb.j.k(r0, r1)
            float r1 = r9.f25098b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L35
            java.lang.StringBuilder r0 = eb.j.m(r0)
            float r1 = r9.f25098b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r3
            goto L36
        L35:
            r1 = r4
        L36:
            t.b r5 = r9.f25100d
            int r5 = r5.g()
        L3c:
            if (r4 >= r5) goto L9b
            t.b r6 = r9.f25100d
            t.i r6 = r6.a(r4)
            if (r6 != 0) goto L47
            goto L98
        L47:
            t.b r7 = r9.f25100d
            float r7 = r7.h(r4)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L52
            goto L98
        L52:
            java.lang.String r6 = r6.toString()
            if (r1 != 0) goto L63
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L75
            java.lang.String r1 = "- "
            java.lang.String r0 = eb.j.k(r0, r1)
            goto L72
        L63:
            if (r8 <= 0) goto L6c
            java.lang.String r1 = " + "
            java.lang.String r0 = eb.j.k(r0, r1)
            goto L75
        L6c:
            java.lang.String r1 = " - "
            java.lang.String r0 = eb.j.k(r0, r1)
        L72:
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r7 = r7 * r1
        L75:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L80
            java.lang.String r0 = eb.j.k(r0, r6)
            goto L97
        L80:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L97:
            r1 = r3
        L98:
            int r4 = r4 + 1
            goto L3c
        L9b:
            if (r1 != 0) goto La3
            java.lang.String r1 = "0.0"
            java.lang.String r0 = eb.j.k(r0, r1)
        La3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t.c.toString():java.lang.String");
    }
}
