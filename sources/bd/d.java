package bd;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final d f2419e = new d(e.f2423b, 0, 0, 0);
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final e f2420b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2421c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2422d;

    public d(e eVar, int i10, int i11, int i12) {
        this.f2420b = eVar;
        this.a = i10;
        this.f2421c = i11;
        this.f2422d = i12;
    }

    public final d a(int i10) {
        int i11;
        e eVar = this.f2420b;
        int i12 = this.a;
        int i13 = this.f2422d;
        if (i12 == 4 || i12 == 2) {
            int[] iArr = b.f2414c[i12];
            i12 = 0;
            int i14 = iArr[0];
            int i15 = 65535 & i14;
            int i16 = i14 >> 16;
            eVar.getClass();
            i13 += i16;
            eVar = new c(eVar, i15, i16);
        }
        int i17 = this.f2421c;
        if (i17 != 0 && i17 != 31) {
            if (i17 == 62) {
                i11 = 9;
            } else {
                i11 = 8;
            }
        } else {
            i11 = 18;
        }
        int i18 = i17 + 1;
        d dVar = new d(eVar, i12, i18, i13 + i11);
        if (i18 == 2078) {
            return dVar.b(i10 + 1);
        }
        return dVar;
    }

    public final d b(int i10) {
        int i11 = this.f2421c;
        if (i11 == 0) {
            return this;
        }
        e eVar = this.f2420b;
        eVar.getClass();
        return new d(new a(eVar, i10 - i11, i11), this.a, 0, this.f2422d);
    }

    public final boolean c(d dVar) {
        int i10;
        int i11 = this.f2422d + (b.f2414c[this.a][dVar.a] >> 16);
        int i12 = dVar.f2421c;
        if (i12 > 0 && ((i10 = this.f2421c) == 0 || i10 > i12)) {
            i11 += 10;
        }
        if (i11 <= dVar.f2422d) {
            return true;
        }
        return false;
    }

    public final d d(int i10, int i11) {
        int i12;
        int i13 = this.f2422d;
        e eVar = this.f2420b;
        int i14 = this.a;
        if (i10 != i14) {
            int i15 = b.f2414c[i14][i10];
            int i16 = 65535 & i15;
            int i17 = i15 >> 16;
            eVar.getClass();
            i13 += i17;
            eVar = new c(eVar, i16, i17);
        }
        if (i10 == 2) {
            i12 = 4;
        } else {
            i12 = 5;
        }
        eVar.getClass();
        return new d(new c(eVar, i11, i12), i10, 0, i13 + i12);
    }

    public final d e(int i10, int i11) {
        int i12;
        int i13 = this.a;
        if (i13 == 2) {
            i12 = 4;
        } else {
            i12 = 5;
        }
        int i14 = b.f2416e[i13][i10];
        e eVar = this.f2420b;
        eVar.getClass();
        return new d(new c(new c(eVar, i14, i12), i11, 5), i13, 0, this.f2422d + i12 + 5);
    }

    public final String toString() {
        return String.format("%s bits=%d bytes=%d", b.f2413b[this.a], Integer.valueOf(this.f2422d), Integer.valueOf(this.f2421c));
    }
}
