package z;

import java.util.Arrays;

/* renamed from: z.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2966f implements Comparable {
    public boolean b;

    /* renamed from: g, reason: collision with root package name */
    public float f24486g;

    /* renamed from: n, reason: collision with root package name */
    public int f24491n;

    /* renamed from: c, reason: collision with root package name */
    public int f24483c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f24484d = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f24485f = 0;

    /* renamed from: h, reason: collision with root package name */
    public boolean f24487h = false;

    /* renamed from: i, reason: collision with root package name */
    public final float[] f24488i = new float[9];

    /* renamed from: j, reason: collision with root package name */
    public final float[] f24489j = new float[9];

    /* renamed from: k, reason: collision with root package name */
    public C2962b[] f24490k = new C2962b[16];
    public int l = 0;
    public int m = 0;

    public C2966f(int i9) {
        this.f24491n = i9;
    }

    public final void a(C2962b c2962b) {
        int i9 = 0;
        while (true) {
            int i10 = this.l;
            if (i9 < i10) {
                if (this.f24490k[i9] == c2962b) {
                    return;
                } else {
                    i9++;
                }
            } else {
                C2962b[] c2962bArr = this.f24490k;
                if (i10 >= c2962bArr.length) {
                    this.f24490k = (C2962b[]) Arrays.copyOf(c2962bArr, c2962bArr.length * 2);
                }
                C2962b[] c2962bArr2 = this.f24490k;
                int i11 = this.l;
                c2962bArr2[i11] = c2962b;
                this.l = i11 + 1;
                return;
            }
        }
    }

    public final void b(C2962b c2962b) {
        int i9 = this.l;
        int i10 = 0;
        while (i10 < i9) {
            if (this.f24490k[i10] == c2962b) {
                while (i10 < i9 - 1) {
                    C2962b[] c2962bArr = this.f24490k;
                    int i11 = i10 + 1;
                    c2962bArr[i10] = c2962bArr[i11];
                    i10 = i11;
                }
                this.l--;
                return;
            }
            i10++;
        }
    }

    public final void c() {
        this.f24491n = 5;
        this.f24485f = 0;
        this.f24483c = -1;
        this.f24484d = -1;
        this.f24486g = 0.0f;
        this.f24487h = false;
        int i9 = this.l;
        for (int i10 = 0; i10 < i9; i10++) {
            this.f24490k[i10] = null;
        }
        this.l = 0;
        this.m = 0;
        this.b = false;
        Arrays.fill(this.f24489j, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f24483c - ((C2966f) obj).f24483c;
    }

    public final void d(C2963c c2963c, float f9) {
        this.f24486g = f9;
        this.f24487h = true;
        int i9 = this.l;
        this.f24484d = -1;
        for (int i10 = 0; i10 < i9; i10++) {
            this.f24490k[i10].h(c2963c, this, false);
        }
        this.l = 0;
    }

    public final void e(C2963c c2963c, C2962b c2962b) {
        int i9 = this.l;
        for (int i10 = 0; i10 < i9; i10++) {
            this.f24490k[i10].i(c2963c, c2962b, false);
        }
        this.l = 0;
    }

    public final String toString() {
        return "" + this.f24483c;
    }
}
