package z;

import com.mbridge.msdk.foundation.entity.o;
import java.util.Arrays;
import l5.k;

/* renamed from: z.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2961a {
    public final C2962b b;

    /* renamed from: c, reason: collision with root package name */
    public final k f24452c;

    /* renamed from: a, reason: collision with root package name */
    public int f24451a = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f24453d = 8;

    /* renamed from: e, reason: collision with root package name */
    public int[] f24454e = new int[8];

    /* renamed from: f, reason: collision with root package name */
    public int[] f24455f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    public float[] f24456g = new float[8];

    /* renamed from: h, reason: collision with root package name */
    public int f24457h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f24458i = -1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f24459j = false;

    public C2961a(C2962b c2962b, k kVar) {
        this.b = c2962b;
        this.f24452c = kVar;
    }

    public final void a(C2966f c2966f, float f9, boolean z8) {
        if (f9 > -0.001f && f9 < 0.001f) {
            return;
        }
        int i9 = this.f24457h;
        C2962b c2962b = this.b;
        if (i9 == -1) {
            this.f24457h = 0;
            this.f24456g[0] = f9;
            this.f24454e[0] = c2966f.f24483c;
            this.f24455f[0] = -1;
            c2966f.m++;
            c2966f.a(c2962b);
            this.f24451a++;
            if (!this.f24459j) {
                int i10 = this.f24458i + 1;
                this.f24458i = i10;
                int[] iArr = this.f24454e;
                if (i10 >= iArr.length) {
                    this.f24459j = true;
                    this.f24458i = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i11 = -1;
        for (int i12 = 0; i9 != -1 && i12 < this.f24451a; i12++) {
            int i13 = this.f24454e[i9];
            int i14 = c2966f.f24483c;
            if (i13 == i14) {
                float[] fArr = this.f24456g;
                float f10 = fArr[i9] + f9;
                if (f10 > -0.001f && f10 < 0.001f) {
                    f10 = 0.0f;
                }
                fArr[i9] = f10;
                if (f10 == 0.0f) {
                    if (i9 == this.f24457h) {
                        this.f24457h = this.f24455f[i9];
                    } else {
                        int[] iArr2 = this.f24455f;
                        iArr2[i11] = iArr2[i9];
                    }
                    if (z8) {
                        c2966f.b(c2962b);
                    }
                    if (this.f24459j) {
                        this.f24458i = i9;
                    }
                    c2966f.m--;
                    this.f24451a--;
                    return;
                }
                return;
            }
            if (i13 < i14) {
                i11 = i9;
            }
            i9 = this.f24455f[i9];
        }
        int i15 = this.f24458i;
        int i16 = i15 + 1;
        if (this.f24459j) {
            int[] iArr3 = this.f24454e;
            if (iArr3[i15] != -1) {
                i15 = iArr3.length;
            }
        } else {
            i15 = i16;
        }
        int[] iArr4 = this.f24454e;
        if (i15 >= iArr4.length && this.f24451a < iArr4.length) {
            int i17 = 0;
            while (true) {
                int[] iArr5 = this.f24454e;
                if (i17 >= iArr5.length) {
                    break;
                }
                if (iArr5[i17] == -1) {
                    i15 = i17;
                    break;
                }
                i17++;
            }
        }
        int[] iArr6 = this.f24454e;
        if (i15 >= iArr6.length) {
            i15 = iArr6.length;
            int i18 = this.f24453d * 2;
            this.f24453d = i18;
            this.f24459j = false;
            this.f24458i = i15 - 1;
            this.f24456g = Arrays.copyOf(this.f24456g, i18);
            this.f24454e = Arrays.copyOf(this.f24454e, this.f24453d);
            this.f24455f = Arrays.copyOf(this.f24455f, this.f24453d);
        }
        this.f24454e[i15] = c2966f.f24483c;
        this.f24456g[i15] = f9;
        if (i11 != -1) {
            int[] iArr7 = this.f24455f;
            iArr7[i15] = iArr7[i11];
            iArr7[i11] = i15;
        } else {
            this.f24455f[i15] = this.f24457h;
            this.f24457h = i15;
        }
        c2966f.m++;
        c2966f.a(c2962b);
        this.f24451a++;
        if (!this.f24459j) {
            this.f24458i++;
        }
        int i19 = this.f24458i;
        int[] iArr8 = this.f24454e;
        if (i19 >= iArr8.length) {
            this.f24459j = true;
            this.f24458i = iArr8.length - 1;
        }
    }

    public final void b() {
        int i9 = this.f24457h;
        for (int i10 = 0; i9 != -1 && i10 < this.f24451a; i10++) {
            C2966f c2966f = ((C2966f[]) this.f24452c.f21619a)[this.f24454e[i9]];
            if (c2966f != null) {
                c2966f.b(this.b);
            }
            i9 = this.f24455f[i9];
        }
        this.f24457h = -1;
        this.f24458i = -1;
        this.f24459j = false;
        this.f24451a = 0;
    }

    public final boolean c(C2966f c2966f) {
        int i9 = this.f24457h;
        if (i9 == -1) {
            return false;
        }
        for (int i10 = 0; i9 != -1 && i10 < this.f24451a; i10++) {
            if (this.f24454e[i9] == c2966f.f24483c) {
                return true;
            }
            i9 = this.f24455f[i9];
        }
        return false;
    }

    public final void d(float f9) {
        int i9 = this.f24457h;
        for (int i10 = 0; i9 != -1 && i10 < this.f24451a; i10++) {
            float[] fArr = this.f24456g;
            fArr[i9] = fArr[i9] / f9;
            i9 = this.f24455f[i9];
        }
    }

    public final float e(C2966f c2966f) {
        int i9 = this.f24457h;
        for (int i10 = 0; i9 != -1 && i10 < this.f24451a; i10++) {
            if (this.f24454e[i9] == c2966f.f24483c) {
                return this.f24456g[i9];
            }
            i9 = this.f24455f[i9];
        }
        return 0.0f;
    }

    public final int f() {
        return this.f24451a;
    }

    public final C2966f g(int i9) {
        int i10 = this.f24457h;
        for (int i11 = 0; i10 != -1 && i11 < this.f24451a; i11++) {
            if (i11 == i9) {
                return ((C2966f[]) this.f24452c.f21619a)[this.f24454e[i10]];
            }
            i10 = this.f24455f[i10];
        }
        return null;
    }

    public final float h(int i9) {
        int i10 = this.f24457h;
        for (int i11 = 0; i10 != -1 && i11 < this.f24451a; i11++) {
            if (i11 == i9) {
                return this.f24456g[i10];
            }
            i10 = this.f24455f[i10];
        }
        return 0.0f;
    }

    public final void i() {
        int i9 = this.f24457h;
        for (int i10 = 0; i9 != -1 && i10 < this.f24451a; i10++) {
            float[] fArr = this.f24456g;
            fArr[i9] = fArr[i9] * (-1.0f);
            i9 = this.f24455f[i9];
        }
    }

    public final void j(C2966f c2966f, float f9) {
        if (f9 == 0.0f) {
            k(c2966f, true);
            return;
        }
        int i9 = this.f24457h;
        C2962b c2962b = this.b;
        if (i9 == -1) {
            this.f24457h = 0;
            this.f24456g[0] = f9;
            this.f24454e[0] = c2966f.f24483c;
            this.f24455f[0] = -1;
            c2966f.m++;
            c2966f.a(c2962b);
            this.f24451a++;
            if (!this.f24459j) {
                int i10 = this.f24458i + 1;
                this.f24458i = i10;
                int[] iArr = this.f24454e;
                if (i10 >= iArr.length) {
                    this.f24459j = true;
                    this.f24458i = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i11 = -1;
        for (int i12 = 0; i9 != -1 && i12 < this.f24451a; i12++) {
            int i13 = this.f24454e[i9];
            int i14 = c2966f.f24483c;
            if (i13 == i14) {
                this.f24456g[i9] = f9;
                return;
            }
            if (i13 < i14) {
                i11 = i9;
            }
            i9 = this.f24455f[i9];
        }
        int i15 = this.f24458i;
        int i16 = i15 + 1;
        if (this.f24459j) {
            int[] iArr2 = this.f24454e;
            if (iArr2[i15] != -1) {
                i15 = iArr2.length;
            }
        } else {
            i15 = i16;
        }
        int[] iArr3 = this.f24454e;
        if (i15 >= iArr3.length && this.f24451a < iArr3.length) {
            int i17 = 0;
            while (true) {
                int[] iArr4 = this.f24454e;
                if (i17 >= iArr4.length) {
                    break;
                }
                if (iArr4[i17] == -1) {
                    i15 = i17;
                    break;
                }
                i17++;
            }
        }
        int[] iArr5 = this.f24454e;
        if (i15 >= iArr5.length) {
            i15 = iArr5.length;
            int i18 = this.f24453d * 2;
            this.f24453d = i18;
            this.f24459j = false;
            this.f24458i = i15 - 1;
            this.f24456g = Arrays.copyOf(this.f24456g, i18);
            this.f24454e = Arrays.copyOf(this.f24454e, this.f24453d);
            this.f24455f = Arrays.copyOf(this.f24455f, this.f24453d);
        }
        this.f24454e[i15] = c2966f.f24483c;
        this.f24456g[i15] = f9;
        if (i11 != -1) {
            int[] iArr6 = this.f24455f;
            iArr6[i15] = iArr6[i11];
            iArr6[i11] = i15;
        } else {
            this.f24455f[i15] = this.f24457h;
            this.f24457h = i15;
        }
        c2966f.m++;
        c2966f.a(c2962b);
        int i19 = this.f24451a + 1;
        this.f24451a = i19;
        if (!this.f24459j) {
            this.f24458i++;
        }
        int[] iArr7 = this.f24454e;
        if (i19 >= iArr7.length) {
            this.f24459j = true;
        }
        if (this.f24458i >= iArr7.length) {
            this.f24459j = true;
            this.f24458i = iArr7.length - 1;
        }
    }

    public final float k(C2966f c2966f, boolean z8) {
        int i9 = this.f24457h;
        if (i9 == -1) {
            return 0.0f;
        }
        int i10 = 0;
        int i11 = -1;
        while (i9 != -1 && i10 < this.f24451a) {
            if (this.f24454e[i9] == c2966f.f24483c) {
                if (i9 == this.f24457h) {
                    this.f24457h = this.f24455f[i9];
                } else {
                    int[] iArr = this.f24455f;
                    iArr[i11] = iArr[i9];
                }
                if (z8) {
                    c2966f.b(this.b);
                }
                c2966f.m--;
                this.f24451a--;
                this.f24454e[i9] = -1;
                if (this.f24459j) {
                    this.f24458i = i9;
                }
                return this.f24456g[i9];
            }
            i10++;
            i11 = i9;
            i9 = this.f24455f[i9];
        }
        return 0.0f;
    }

    public final float l(C2962b c2962b, boolean z8) {
        float e4 = e(c2962b.f24460a);
        k(c2962b.f24460a, z8);
        C2961a c2961a = c2962b.f24462d;
        int f9 = c2961a.f();
        for (int i9 = 0; i9 < f9; i9++) {
            C2966f g9 = c2961a.g(i9);
            a(g9, c2961a.e(g9) * e4, z8);
        }
        return e4;
    }

    public final String toString() {
        int i9 = this.f24457h;
        String str = "";
        for (int i10 = 0; i9 != -1 && i10 < this.f24451a; i10++) {
            StringBuilder b = AbstractC2965e.b(o.j(str, " -> "));
            b.append(this.f24456g[i9]);
            b.append(" : ");
            StringBuilder b8 = AbstractC2965e.b(b.toString());
            b8.append(((C2966f[]) this.f24452c.f21619a)[this.f24454e[i9]]);
            str = b8.toString();
            i9 = this.f24455f[i9];
        }
        return str;
    }
}
