package t;

import eb.j;
import ic.t;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: b, reason: collision with root package name */
    public final c f25089b;

    /* renamed from: c, reason: collision with root package name */
    public final t f25090c;
    public int a = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f25091d = 8;

    /* renamed from: e, reason: collision with root package name */
    public int[] f25092e = new int[8];

    /* renamed from: f, reason: collision with root package name */
    public int[] f25093f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    public float[] f25094g = new float[8];

    /* renamed from: h, reason: collision with root package name */
    public int f25095h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f25096i = -1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f25097j = false;

    public a(c cVar, t tVar) {
        this.f25089b = cVar;
        this.f25090c = tVar;
    }

    @Override // t.b
    public final i a(int i10) {
        int i11 = this.f25095h;
        for (int i12 = 0; i11 != -1 && i12 < this.a; i12++) {
            if (i12 == i10) {
                return ((i[]) this.f25090c.f19576d)[this.f25092e[i11]];
            }
            i11 = this.f25093f[i11];
        }
        return null;
    }

    @Override // t.b
    public final void b() {
        int i10 = this.f25095h;
        for (int i11 = 0; i10 != -1 && i11 < this.a; i11++) {
            float[] fArr = this.f25094g;
            fArr[i10] = fArr[i10] * (-1.0f);
            i10 = this.f25093f[i10];
        }
    }

    @Override // t.b
    public final void c(i iVar, float f10) {
        if (f10 == 0.0f) {
            f(iVar, true);
            return;
        }
        int i10 = this.f25095h;
        c cVar = this.f25089b;
        if (i10 == -1) {
            this.f25095h = 0;
            this.f25094g[0] = f10;
            this.f25092e[0] = iVar.f25128c;
            this.f25093f[0] = -1;
            iVar.f25137m++;
            iVar.a(cVar);
            this.a++;
            if (!this.f25097j) {
                int i11 = this.f25096i + 1;
                this.f25096i = i11;
                int[] iArr = this.f25092e;
                if (i11 >= iArr.length) {
                    this.f25097j = true;
                    this.f25096i = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i12 = -1;
        for (int i13 = 0; i10 != -1 && i13 < this.a; i13++) {
            int i14 = this.f25092e[i10];
            int i15 = iVar.f25128c;
            if (i14 == i15) {
                this.f25094g[i10] = f10;
                return;
            }
            if (i14 < i15) {
                i12 = i10;
            }
            i10 = this.f25093f[i10];
        }
        int i16 = this.f25096i;
        int i17 = i16 + 1;
        if (this.f25097j) {
            int[] iArr2 = this.f25092e;
            if (iArr2[i16] != -1) {
                i16 = iArr2.length;
            }
        } else {
            i16 = i17;
        }
        int[] iArr3 = this.f25092e;
        if (i16 >= iArr3.length && this.a < iArr3.length) {
            int i18 = 0;
            while (true) {
                int[] iArr4 = this.f25092e;
                if (i18 >= iArr4.length) {
                    break;
                }
                if (iArr4[i18] == -1) {
                    i16 = i18;
                    break;
                }
                i18++;
            }
        }
        int[] iArr5 = this.f25092e;
        if (i16 >= iArr5.length) {
            i16 = iArr5.length;
            int i19 = this.f25091d * 2;
            this.f25091d = i19;
            this.f25097j = false;
            this.f25096i = i16 - 1;
            this.f25094g = Arrays.copyOf(this.f25094g, i19);
            this.f25092e = Arrays.copyOf(this.f25092e, this.f25091d);
            this.f25093f = Arrays.copyOf(this.f25093f, this.f25091d);
        }
        this.f25092e[i16] = iVar.f25128c;
        this.f25094g[i16] = f10;
        if (i12 != -1) {
            int[] iArr6 = this.f25093f;
            iArr6[i16] = iArr6[i12];
            iArr6[i12] = i16;
        } else {
            this.f25093f[i16] = this.f25095h;
            this.f25095h = i16;
        }
        iVar.f25137m++;
        iVar.a(cVar);
        int i20 = this.a + 1;
        this.a = i20;
        if (!this.f25097j) {
            this.f25096i++;
        }
        int[] iArr7 = this.f25092e;
        if (i20 >= iArr7.length) {
            this.f25097j = true;
        }
        if (this.f25096i >= iArr7.length) {
            this.f25097j = true;
            this.f25096i = iArr7.length - 1;
        }
    }

    @Override // t.b
    public final void clear() {
        int i10 = this.f25095h;
        for (int i11 = 0; i10 != -1 && i11 < this.a; i11++) {
            i iVar = ((i[]) this.f25090c.f19576d)[this.f25092e[i10]];
            if (iVar != null) {
                iVar.b(this.f25089b);
            }
            i10 = this.f25093f[i10];
        }
        this.f25095h = -1;
        this.f25096i = -1;
        this.f25097j = false;
        this.a = 0;
    }

    @Override // t.b
    public final float d(i iVar) {
        int i10 = this.f25095h;
        for (int i11 = 0; i10 != -1 && i11 < this.a; i11++) {
            if (this.f25092e[i10] == iVar.f25128c) {
                return this.f25094g[i10];
            }
            i10 = this.f25093f[i10];
        }
        return 0.0f;
    }

    @Override // t.b
    public final boolean e(i iVar) {
        int i10 = this.f25095h;
        if (i10 == -1) {
            return false;
        }
        for (int i11 = 0; i10 != -1 && i11 < this.a; i11++) {
            if (this.f25092e[i10] == iVar.f25128c) {
                return true;
            }
            i10 = this.f25093f[i10];
        }
        return false;
    }

    @Override // t.b
    public final float f(i iVar, boolean z10) {
        int i10 = this.f25095h;
        if (i10 == -1) {
            return 0.0f;
        }
        int i11 = 0;
        int i12 = -1;
        while (i10 != -1 && i11 < this.a) {
            if (this.f25092e[i10] == iVar.f25128c) {
                if (i10 == this.f25095h) {
                    this.f25095h = this.f25093f[i10];
                } else {
                    int[] iArr = this.f25093f;
                    iArr[i12] = iArr[i10];
                }
                if (z10) {
                    iVar.b(this.f25089b);
                }
                iVar.f25137m--;
                this.a--;
                this.f25092e[i10] = -1;
                if (this.f25097j) {
                    this.f25096i = i10;
                }
                return this.f25094g[i10];
            }
            i11++;
            i12 = i10;
            i10 = this.f25093f[i10];
        }
        return 0.0f;
    }

    @Override // t.b
    public final int g() {
        return this.a;
    }

    @Override // t.b
    public final float h(int i10) {
        int i11 = this.f25095h;
        for (int i12 = 0; i11 != -1 && i12 < this.a; i12++) {
            if (i12 == i10) {
                return this.f25094g[i11];
            }
            i11 = this.f25093f[i11];
        }
        return 0.0f;
    }

    @Override // t.b
    public final float i(c cVar, boolean z10) {
        float d10 = d(cVar.a);
        f(cVar.a, z10);
        b bVar = cVar.f25100d;
        int g10 = bVar.g();
        for (int i10 = 0; i10 < g10; i10++) {
            i a = bVar.a(i10);
            k(a, bVar.d(a) * d10, z10);
        }
        return d10;
    }

    @Override // t.b
    public final void j(float f10) {
        int i10 = this.f25095h;
        for (int i11 = 0; i10 != -1 && i11 < this.a; i11++) {
            float[] fArr = this.f25094g;
            fArr[i10] = fArr[i10] / f10;
            i10 = this.f25093f[i10];
        }
    }

    @Override // t.b
    public final void k(i iVar, float f10, boolean z10) {
        if (f10 > -0.001f && f10 < 0.001f) {
            return;
        }
        int i10 = this.f25095h;
        c cVar = this.f25089b;
        if (i10 == -1) {
            this.f25095h = 0;
            this.f25094g[0] = f10;
            this.f25092e[0] = iVar.f25128c;
            this.f25093f[0] = -1;
            iVar.f25137m++;
            iVar.a(cVar);
            this.a++;
            if (!this.f25097j) {
                int i11 = this.f25096i + 1;
                this.f25096i = i11;
                int[] iArr = this.f25092e;
                if (i11 >= iArr.length) {
                    this.f25097j = true;
                    this.f25096i = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i12 = -1;
        for (int i13 = 0; i10 != -1 && i13 < this.a; i13++) {
            int i14 = this.f25092e[i10];
            int i15 = iVar.f25128c;
            if (i14 == i15) {
                float[] fArr = this.f25094g;
                float f11 = fArr[i10] + f10;
                if (f11 > -0.001f && f11 < 0.001f) {
                    f11 = 0.0f;
                }
                fArr[i10] = f11;
                if (f11 == 0.0f) {
                    if (i10 == this.f25095h) {
                        this.f25095h = this.f25093f[i10];
                    } else {
                        int[] iArr2 = this.f25093f;
                        iArr2[i12] = iArr2[i10];
                    }
                    if (z10) {
                        iVar.b(cVar);
                    }
                    if (this.f25097j) {
                        this.f25096i = i10;
                    }
                    iVar.f25137m--;
                    this.a--;
                    return;
                }
                return;
            }
            if (i14 < i15) {
                i12 = i10;
            }
            i10 = this.f25093f[i10];
        }
        int i16 = this.f25096i;
        int i17 = i16 + 1;
        if (this.f25097j) {
            int[] iArr3 = this.f25092e;
            if (iArr3[i16] != -1) {
                i16 = iArr3.length;
            }
        } else {
            i16 = i17;
        }
        int[] iArr4 = this.f25092e;
        if (i16 >= iArr4.length && this.a < iArr4.length) {
            int i18 = 0;
            while (true) {
                int[] iArr5 = this.f25092e;
                if (i18 >= iArr5.length) {
                    break;
                }
                if (iArr5[i18] == -1) {
                    i16 = i18;
                    break;
                }
                i18++;
            }
        }
        int[] iArr6 = this.f25092e;
        if (i16 >= iArr6.length) {
            i16 = iArr6.length;
            int i19 = this.f25091d * 2;
            this.f25091d = i19;
            this.f25097j = false;
            this.f25096i = i16 - 1;
            this.f25094g = Arrays.copyOf(this.f25094g, i19);
            this.f25092e = Arrays.copyOf(this.f25092e, this.f25091d);
            this.f25093f = Arrays.copyOf(this.f25093f, this.f25091d);
        }
        this.f25092e[i16] = iVar.f25128c;
        this.f25094g[i16] = f10;
        if (i12 != -1) {
            int[] iArr7 = this.f25093f;
            iArr7[i16] = iArr7[i12];
            iArr7[i12] = i16;
        } else {
            this.f25093f[i16] = this.f25095h;
            this.f25095h = i16;
        }
        iVar.f25137m++;
        iVar.a(cVar);
        this.a++;
        if (!this.f25097j) {
            this.f25096i++;
        }
        int i20 = this.f25096i;
        int[] iArr8 = this.f25092e;
        if (i20 >= iArr8.length) {
            this.f25097j = true;
            this.f25096i = iArr8.length - 1;
        }
    }

    public final String toString() {
        int i10 = this.f25095h;
        String str = "";
        for (int i11 = 0; i10 != -1 && i11 < this.a; i11++) {
            StringBuilder m10 = j.m(j.k(str, " -> "));
            m10.append(this.f25094g[i10]);
            m10.append(" : ");
            StringBuilder m11 = j.m(m10.toString());
            m11.append(((i[]) this.f25090c.f19576d)[this.f25092e[i10]]);
            str = m11.toString();
            i10 = this.f25093f[i10];
        }
        return str;
    }
}
