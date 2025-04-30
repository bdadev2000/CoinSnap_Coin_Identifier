package C5;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: e, reason: collision with root package name */
    public static final f f567e = new f(g.b, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f568a;
    public final g b;

    /* renamed from: c, reason: collision with root package name */
    public final int f569c;

    /* renamed from: d, reason: collision with root package name */
    public final int f570d;

    public f(g gVar, int i9, int i10, int i11) {
        this.b = gVar;
        this.f568a = i9;
        this.f569c = i10;
        this.f570d = i11;
    }

    public final f a(int i9) {
        int i10;
        g gVar = this.b;
        int i11 = this.f568a;
        int i12 = this.f570d;
        if (i11 == 4 || i11 == 2) {
            int[] iArr = d.f561c[i11];
            i11 = 0;
            int i13 = iArr[0];
            int i14 = 65535 & i13;
            int i15 = i13 >> 16;
            gVar.getClass();
            i12 += i15;
            gVar = new e(gVar, i14, i15);
        }
        int i16 = this.f569c;
        if (i16 != 0 && i16 != 31) {
            if (i16 == 62) {
                i10 = 9;
            } else {
                i10 = 8;
            }
        } else {
            i10 = 18;
        }
        int i17 = i16 + 1;
        f fVar = new f(gVar, i11, i17, i12 + i10);
        if (i17 == 2078) {
            return fVar.b(i9 + 1);
        }
        return fVar;
    }

    public final f b(int i9) {
        int i10 = this.f569c;
        if (i10 == 0) {
            return this;
        }
        g gVar = this.b;
        gVar.getClass();
        return new f(new a(gVar, i9 - i10, i10), this.f568a, 0, this.f570d);
    }

    public final boolean c(f fVar) {
        int i9;
        int i10 = this.f570d + (d.f561c[this.f568a][fVar.f568a] >> 16);
        int i11 = fVar.f569c;
        if (i11 > 0 && ((i9 = this.f569c) == 0 || i9 > i11)) {
            i10 += 10;
        }
        if (i10 <= fVar.f570d) {
            return true;
        }
        return false;
    }

    public final f d(int i9, int i10) {
        int i11;
        int i12 = this.f570d;
        g gVar = this.b;
        int i13 = this.f568a;
        if (i9 != i13) {
            int i14 = d.f561c[i13][i9];
            int i15 = 65535 & i14;
            int i16 = i14 >> 16;
            gVar.getClass();
            i12 += i16;
            gVar = new e(gVar, i15, i16);
        }
        if (i9 == 2) {
            i11 = 4;
        } else {
            i11 = 5;
        }
        gVar.getClass();
        return new f(new e(gVar, i10, i11), i9, 0, i12 + i11);
    }

    public final f e(int i9, int i10) {
        int i11;
        int i12 = this.f568a;
        if (i12 == 2) {
            i11 = 4;
        } else {
            i11 = 5;
        }
        int i13 = d.f563e[i12][i9];
        g gVar = this.b;
        gVar.getClass();
        return new f(new e(new e(gVar, i13, i11), i10, 5), i12, 0, this.f570d + i11 + 5);
    }

    public final String toString() {
        return String.format("%s bits=%d bytes=%d", d.b[this.f568a], Integer.valueOf(this.f570d), Integer.valueOf(this.f569c));
    }
}
