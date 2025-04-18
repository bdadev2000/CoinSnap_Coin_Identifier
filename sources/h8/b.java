package h8;

import n9.h0;
import v8.u0;
import y7.x;

/* loaded from: classes3.dex */
public final class b implements h {

    /* renamed from: b, reason: collision with root package name */
    public final g f18868b;

    /* renamed from: c, reason: collision with root package name */
    public final long f18869c;

    /* renamed from: d, reason: collision with root package name */
    public final long f18870d;

    /* renamed from: f, reason: collision with root package name */
    public final j f18871f;

    /* renamed from: g, reason: collision with root package name */
    public int f18872g;

    /* renamed from: h, reason: collision with root package name */
    public long f18873h;

    /* renamed from: i, reason: collision with root package name */
    public long f18874i;

    /* renamed from: j, reason: collision with root package name */
    public long f18875j;

    /* renamed from: k, reason: collision with root package name */
    public long f18876k;

    /* renamed from: l, reason: collision with root package name */
    public long f18877l;

    /* renamed from: m, reason: collision with root package name */
    public long f18878m;

    /* renamed from: n, reason: collision with root package name */
    public long f18879n;

    public b(j jVar, long j3, long j10, long j11, long j12, boolean z10) {
        boolean z11;
        if (j3 >= 0 && j10 > j3) {
            z11 = true;
        } else {
            z11 = false;
        }
        u0.d(z11);
        this.f18871f = jVar;
        this.f18869c = j3;
        this.f18870d = j10;
        if (j11 != j10 - j3 && !z10) {
            this.f18872g = 0;
        } else {
            this.f18873h = j12;
            this.f18872g = 4;
        }
        this.f18868b = new g();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00cd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ce  */
    @Override // h8.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(y7.m r25) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h8.b.a(y7.m):long");
    }

    @Override // h8.h
    public final x createSeekMap() {
        if (this.f18873h != 0) {
            return new a(this);
        }
        return null;
    }

    @Override // h8.h
    public final void startSeek(long j3) {
        this.f18875j = h0.i(j3, 0L, this.f18873h - 1);
        this.f18872g = 2;
        this.f18876k = this.f18869c;
        this.f18877l = this.f18870d;
        this.f18878m = 0L;
        this.f18879n = this.f18873h;
    }
}
