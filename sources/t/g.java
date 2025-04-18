package t;

import ic.t;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class g extends c {

    /* renamed from: f, reason: collision with root package name */
    public i[] f25123f;

    /* renamed from: g, reason: collision with root package name */
    public i[] f25124g;

    /* renamed from: h, reason: collision with root package name */
    public int f25125h;

    /* renamed from: i, reason: collision with root package name */
    public final h.c f25126i;

    public g(t tVar) {
        super(tVar);
        this.f25123f = new i[128];
        this.f25124g = new i[128];
        this.f25125h = 0;
        this.f25126i = new h.c(this, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0051, code lost:
    
        if (r9 < r8) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0054, code lost:
    
        r5 = false;
     */
    @Override // t.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final t.i d(boolean[] r12) {
        /*
            r11 = this;
            r0 = -1
            r1 = 0
            r3 = r0
            r2 = r1
        L4:
            int r4 = r11.f25125h
            if (r2 >= r4) goto L5b
            t.i[] r4 = r11.f25123f
            r5 = r4[r2]
            int r6 = r5.f25128c
            boolean r6 = r12[r6]
            if (r6 == 0) goto L13
            goto L58
        L13:
            h.c r6 = r11.f25126i
            r6.f18523c = r5
            r5 = 1
            r7 = 8
            if (r3 != r0) goto L38
        L1c:
            if (r7 < 0) goto L34
            java.lang.Object r4 = r6.f18523c
            t.i r4 = (t.i) r4
            float[] r4 = r4.f25134j
            r4 = r4[r7]
            r8 = 0
            int r9 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r9 <= 0) goto L2c
            goto L34
        L2c:
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 >= 0) goto L31
            goto L35
        L31:
            int r7 = r7 + (-1)
            goto L1c
        L34:
            r5 = r1
        L35:
            if (r5 == 0) goto L58
            goto L57
        L38:
            r4 = r4[r3]
        L3a:
            if (r7 < 0) goto L54
            float[] r8 = r4.f25134j
            r8 = r8[r7]
            java.lang.Object r9 = r6.f18523c
            t.i r9 = (t.i) r9
            float[] r9 = r9.f25134j
            r9 = r9[r7]
            int r10 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r10 != 0) goto L4f
            int r7 = r7 + (-1)
            goto L3a
        L4f:
            int r4 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r4 >= 0) goto L54
            goto L55
        L54:
            r5 = r1
        L55:
            if (r5 == 0) goto L58
        L57:
            r3 = r2
        L58:
            int r2 = r2 + 1
            goto L4
        L5b:
            if (r3 != r0) goto L5f
            r12 = 0
            return r12
        L5f:
            t.i[] r12 = r11.f25123f
            r12 = r12[r3]
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: t.g.d(boolean[]):t.i");
    }

    @Override // t.c
    public final boolean e() {
        return this.f25125h == 0;
    }

    @Override // t.c
    public final void i(d dVar, c cVar, boolean z10) {
        boolean z11;
        i iVar = cVar.a;
        if (iVar == null) {
            return;
        }
        b bVar = cVar.f25100d;
        int g10 = bVar.g();
        for (int i10 = 0; i10 < g10; i10++) {
            i a = bVar.a(i10);
            float h10 = bVar.h(i10);
            h.c cVar2 = this.f25126i;
            cVar2.f18523c = a;
            boolean z12 = a.f25127b;
            float[] fArr = iVar.f25134j;
            if (z12) {
                boolean z13 = true;
                for (int i11 = 0; i11 < 9; i11++) {
                    float[] fArr2 = ((i) cVar2.f18523c).f25134j;
                    float f10 = (fArr[i11] * h10) + fArr2[i11];
                    fArr2[i11] = f10;
                    if (Math.abs(f10) < 1.0E-4f) {
                        ((i) cVar2.f18523c).f25134j[i11] = 0.0f;
                    } else {
                        z13 = false;
                    }
                }
                if (z13) {
                    ((g) cVar2.f18525f).k((i) cVar2.f18523c);
                }
                z11 = false;
            } else {
                for (int i12 = 0; i12 < 9; i12++) {
                    float f11 = fArr[i12];
                    if (f11 != 0.0f) {
                        float f12 = f11 * h10;
                        if (Math.abs(f12) < 1.0E-4f) {
                            f12 = 0.0f;
                        }
                        ((i) cVar2.f18523c).f25134j[i12] = f12;
                    } else {
                        ((i) cVar2.f18523c).f25134j[i12] = 0.0f;
                    }
                }
                z11 = true;
            }
            if (z11) {
                j(a);
            }
            this.f25098b = (cVar.f25098b * h10) + this.f25098b;
        }
        k(iVar);
    }

    public final void j(i iVar) {
        int i10;
        int i11 = this.f25125h + 1;
        i[] iVarArr = this.f25123f;
        if (i11 > iVarArr.length) {
            i[] iVarArr2 = (i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f25123f = iVarArr2;
            this.f25124g = (i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        i[] iVarArr3 = this.f25123f;
        int i12 = this.f25125h;
        iVarArr3[i12] = iVar;
        int i13 = i12 + 1;
        this.f25125h = i13;
        if (i13 > 1 && iVarArr3[i13 - 1].f25128c > iVar.f25128c) {
            int i14 = 0;
            while (true) {
                i10 = this.f25125h;
                if (i14 >= i10) {
                    break;
                }
                this.f25124g[i14] = this.f25123f[i14];
                i14++;
            }
            Arrays.sort(this.f25124g, 0, i10, new f(this, 0));
            for (int i15 = 0; i15 < this.f25125h; i15++) {
                this.f25123f[i15] = this.f25124g[i15];
            }
        }
        iVar.f25127b = true;
        iVar.a(this);
    }

    public final void k(i iVar) {
        int i10 = 0;
        while (i10 < this.f25125h) {
            if (this.f25123f[i10] == iVar) {
                while (true) {
                    int i11 = this.f25125h;
                    if (i10 < i11 - 1) {
                        i[] iVarArr = this.f25123f;
                        int i12 = i10 + 1;
                        iVarArr[i10] = iVarArr[i12];
                        i10 = i12;
                    } else {
                        this.f25125h = i11 - 1;
                        iVar.f25127b = false;
                        return;
                    }
                }
            } else {
                i10++;
            }
        }
    }

    @Override // t.c
    public final String toString() {
        String str = " goal -> (" + this.f25098b + ") : ";
        for (int i10 = 0; i10 < this.f25125h; i10++) {
            i iVar = this.f25123f[i10];
            h.c cVar = this.f25126i;
            cVar.f18523c = iVar;
            str = str + cVar + " ";
        }
        return str;
    }
}
