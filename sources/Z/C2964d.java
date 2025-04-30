package z;

import java.util.Arrays;

/* renamed from: z.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2964d extends C2962b {

    /* renamed from: f, reason: collision with root package name */
    public C2966f[] f24478f;

    /* renamed from: g, reason: collision with root package name */
    public C2966f[] f24479g;

    /* renamed from: h, reason: collision with root package name */
    public int f24480h;

    /* renamed from: i, reason: collision with root package name */
    public r4.c f24481i;

    @Override // z.C2962b
    public final C2966f d(boolean[] zArr) {
        int i9 = -1;
        for (int i10 = 0; i10 < this.f24480h; i10++) {
            C2966f[] c2966fArr = this.f24478f;
            C2966f c2966f = c2966fArr[i10];
            if (!zArr[c2966f.f24483c]) {
                r4.c cVar = this.f24481i;
                cVar.f22840c = c2966f;
                int i11 = 8;
                if (i9 == -1) {
                    while (i11 >= 0) {
                        float f9 = ((C2966f) cVar.f22840c).f24489j[i11];
                        if (f9 <= 0.0f) {
                            if (f9 < 0.0f) {
                                i9 = i10;
                                break;
                            }
                            i11--;
                        }
                    }
                } else {
                    C2966f c2966f2 = c2966fArr[i9];
                    while (true) {
                        if (i11 >= 0) {
                            float f10 = c2966f2.f24489j[i11];
                            float f11 = ((C2966f) cVar.f22840c).f24489j[i11];
                            if (f11 == f10) {
                                i11--;
                            } else if (f11 >= f10) {
                            }
                        }
                    }
                }
            }
        }
        if (i9 == -1) {
            return null;
        }
        return this.f24478f[i9];
    }

    @Override // z.C2962b
    public final boolean e() {
        if (this.f24480h == 0) {
            return true;
        }
        return false;
    }

    @Override // z.C2962b
    public final void i(C2963c c2963c, C2962b c2962b, boolean z8) {
        C2966f c2966f = c2962b.f24460a;
        if (c2966f == null) {
            return;
        }
        C2961a c2961a = c2962b.f24462d;
        int f9 = c2961a.f();
        for (int i9 = 0; i9 < f9; i9++) {
            C2966f g9 = c2961a.g(i9);
            float h6 = c2961a.h(i9);
            r4.c cVar = this.f24481i;
            cVar.f22840c = g9;
            boolean z9 = g9.b;
            float[] fArr = c2966f.f24489j;
            if (z9) {
                boolean z10 = true;
                for (int i10 = 0; i10 < 9; i10++) {
                    float[] fArr2 = ((C2966f) cVar.f22840c).f24489j;
                    float f10 = (fArr[i10] * h6) + fArr2[i10];
                    fArr2[i10] = f10;
                    if (Math.abs(f10) < 1.0E-4f) {
                        ((C2966f) cVar.f22840c).f24489j[i10] = 0.0f;
                    } else {
                        z10 = false;
                    }
                }
                if (z10) {
                    ((C2964d) cVar.f22841d).k((C2966f) cVar.f22840c);
                }
            } else {
                for (int i11 = 0; i11 < 9; i11++) {
                    float f11 = fArr[i11];
                    if (f11 != 0.0f) {
                        float f12 = f11 * h6;
                        if (Math.abs(f12) < 1.0E-4f) {
                            f12 = 0.0f;
                        }
                        ((C2966f) cVar.f22840c).f24489j[i11] = f12;
                    } else {
                        ((C2966f) cVar.f22840c).f24489j[i11] = 0.0f;
                    }
                }
                j(g9);
            }
            this.b = (c2962b.b * h6) + this.b;
        }
        k(c2966f);
    }

    public final void j(C2966f c2966f) {
        int i9;
        int i10 = this.f24480h + 1;
        C2966f[] c2966fArr = this.f24478f;
        if (i10 > c2966fArr.length) {
            C2966f[] c2966fArr2 = (C2966f[]) Arrays.copyOf(c2966fArr, c2966fArr.length * 2);
            this.f24478f = c2966fArr2;
            this.f24479g = (C2966f[]) Arrays.copyOf(c2966fArr2, c2966fArr2.length * 2);
        }
        C2966f[] c2966fArr3 = this.f24478f;
        int i11 = this.f24480h;
        c2966fArr3[i11] = c2966f;
        int i12 = i11 + 1;
        this.f24480h = i12;
        if (i12 > 1 && c2966fArr3[i11].f24483c > c2966f.f24483c) {
            int i13 = 0;
            while (true) {
                i9 = this.f24480h;
                if (i13 >= i9) {
                    break;
                }
                this.f24479g[i13] = this.f24478f[i13];
                i13++;
            }
            Arrays.sort(this.f24479g, 0, i9, new C5.c(10));
            for (int i14 = 0; i14 < this.f24480h; i14++) {
                this.f24478f[i14] = this.f24479g[i14];
            }
        }
        c2966f.b = true;
        c2966f.a(this);
    }

    public final void k(C2966f c2966f) {
        int i9 = 0;
        while (i9 < this.f24480h) {
            if (this.f24478f[i9] == c2966f) {
                while (true) {
                    int i10 = this.f24480h;
                    if (i9 < i10 - 1) {
                        C2966f[] c2966fArr = this.f24478f;
                        int i11 = i9 + 1;
                        c2966fArr[i9] = c2966fArr[i11];
                        i9 = i11;
                    } else {
                        this.f24480h = i10 - 1;
                        c2966f.b = false;
                        return;
                    }
                }
            } else {
                i9++;
            }
        }
    }

    @Override // z.C2962b
    public final String toString() {
        String str = " goal -> (" + this.b + ") : ";
        for (int i9 = 0; i9 < this.f24480h; i9++) {
            C2966f c2966f = this.f24478f[i9];
            r4.c cVar = this.f24481i;
            cVar.f22840c = c2966f;
            str = str + cVar + " ";
        }
        return str;
    }
}
