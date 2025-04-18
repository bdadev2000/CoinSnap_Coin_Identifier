package a8;

import n9.h0;
import v8.u0;
import y7.a0;
import y7.w;
import y7.y;

/* loaded from: classes3.dex */
public final class f {
    public final a0 a;

    /* renamed from: b, reason: collision with root package name */
    public final int f331b;

    /* renamed from: c, reason: collision with root package name */
    public final int f332c;

    /* renamed from: d, reason: collision with root package name */
    public final long f333d;

    /* renamed from: e, reason: collision with root package name */
    public final int f334e;

    /* renamed from: f, reason: collision with root package name */
    public int f335f;

    /* renamed from: g, reason: collision with root package name */
    public int f336g;

    /* renamed from: h, reason: collision with root package name */
    public int f337h;

    /* renamed from: i, reason: collision with root package name */
    public int f338i;

    /* renamed from: j, reason: collision with root package name */
    public int f339j;

    /* renamed from: k, reason: collision with root package name */
    public long[] f340k;

    /* renamed from: l, reason: collision with root package name */
    public int[] f341l;

    public f(int i10, int i11, long j3, int i12, a0 a0Var) {
        int i13;
        int i14;
        boolean z10 = true;
        if (i11 != 1 && i11 != 2) {
            z10 = false;
        }
        u0.d(z10);
        this.f333d = j3;
        this.f334e = i12;
        this.a = a0Var;
        if (i11 == 2) {
            i13 = 1667497984;
        } else {
            i13 = 1651965952;
        }
        int i15 = (((i10 % 10) + 48) << 8) | ((i10 / 10) + 48);
        this.f331b = i13 | i15;
        if (i11 == 2) {
            i14 = i15 | 1650720768;
        } else {
            i14 = -1;
        }
        this.f332c = i14;
        this.f340k = new long[512];
        this.f341l = new int[512];
    }

    public final y a(int i10) {
        return new y(((this.f333d * 1) / this.f334e) * this.f341l[i10], this.f340k[i10]);
    }

    public final w b(long j3) {
        int i10 = (int) (j3 / ((this.f333d * 1) / this.f334e));
        int e2 = h0.e(this.f341l, i10, true, true);
        if (this.f341l[e2] == i10) {
            y a = a(e2);
            return new w(a, a);
        }
        y a10 = a(e2);
        int i11 = e2 + 1;
        if (i11 < this.f340k.length) {
            return new w(a10, a(i11));
        }
        return new w(a10, a10);
    }
}
