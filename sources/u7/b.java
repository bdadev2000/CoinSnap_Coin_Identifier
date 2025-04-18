package u7;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class b {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public Serializable f25536b;

    /* renamed from: c, reason: collision with root package name */
    public int f25537c;

    /* renamed from: d, reason: collision with root package name */
    public int f25538d;

    /* renamed from: e, reason: collision with root package name */
    public int f25539e;

    /* renamed from: f, reason: collision with root package name */
    public int f25540f;

    /* renamed from: g, reason: collision with root package name */
    public int f25541g;

    public b() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(int i10, int i11, int i12, int i13, int i14, int i15, byte[] bArr) {
        this.a = i10;
        this.f25537c = i11;
        this.f25538d = i12;
        this.f25539e = i13;
        this.f25540f = i14;
        this.f25541g = i15;
        this.f25536b = bArr;
    }

    public final boolean a(int i10) {
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        if ((i10 & (-2097152)) == -2097152) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return false;
        }
        this.a = i11;
        this.f25536b = com.bumptech.glide.c.f9614c[3 - i12];
        int i17 = com.bumptech.glide.c.f9615d[i14];
        this.f25538d = i17;
        int i18 = 2;
        if (i11 == 2) {
            this.f25538d = i17 / 2;
        } else if (i11 == 0) {
            this.f25538d = i17 / 4;
        }
        int i19 = (i10 >>> 9) & 1;
        int i20 = 1152;
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 == 3) {
                    i20 = 384;
                } else {
                    throw new IllegalArgumentException();
                }
            }
        } else if (i11 != 3) {
            i20 = 576;
        }
        this.f25541g = i20;
        if (i12 == 3) {
            if (i11 == 3) {
                i16 = com.bumptech.glide.c.f9616e[i13 - 1];
            } else {
                i16 = com.bumptech.glide.c.f9617f[i13 - 1];
            }
            this.f25540f = i16;
            this.f25537c = (((i16 * 12) / this.f25538d) + i19) * 4;
        } else {
            int i21 = 144;
            if (i11 == 3) {
                if (i12 == 2) {
                    i15 = com.bumptech.glide.c.f9618g[i13 - 1];
                } else {
                    i15 = com.bumptech.glide.c.f9619h[i13 - 1];
                }
                this.f25540f = i15;
                this.f25537c = ((i15 * 144) / this.f25538d) + i19;
            } else {
                int i22 = com.bumptech.glide.c.f9620i[i13 - 1];
                this.f25540f = i22;
                if (i12 == 1) {
                    i21 = 72;
                }
                this.f25537c = ((i21 * i22) / this.f25538d) + i19;
            }
        }
        if (((i10 >> 6) & 3) == 3) {
            i18 = 1;
        }
        this.f25539e = i18;
        return true;
    }

    public b(String str, int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f25536b = str;
        this.a = i10;
        this.f25538d = i11;
        this.f25537c = i12;
        this.f25539e = i13;
        this.f25540f = i14;
        this.f25541g = i15;
    }
}
