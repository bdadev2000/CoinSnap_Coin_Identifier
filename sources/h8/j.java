package h8;

import n9.x;
import y7.a0;
import y7.n;

/* loaded from: classes3.dex */
public abstract class j {

    /* renamed from: b, reason: collision with root package name */
    public a0 f18901b;

    /* renamed from: c, reason: collision with root package name */
    public n f18902c;

    /* renamed from: d, reason: collision with root package name */
    public h f18903d;

    /* renamed from: e, reason: collision with root package name */
    public long f18904e;

    /* renamed from: f, reason: collision with root package name */
    public long f18905f;

    /* renamed from: g, reason: collision with root package name */
    public long f18906g;

    /* renamed from: h, reason: collision with root package name */
    public int f18907h;

    /* renamed from: i, reason: collision with root package name */
    public int f18908i;

    /* renamed from: k, reason: collision with root package name */
    public long f18910k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f18911l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f18912m;
    public final f a = new f();

    /* renamed from: j, reason: collision with root package name */
    public r4.c f18909j = new r4.c(21, 0);

    public void a(long j3) {
        this.f18906g = j3;
    }

    public abstract long b(x xVar);

    public abstract boolean c(x xVar, long j3, r4.c cVar);

    public void d(boolean z10) {
        if (z10) {
            this.f18909j = new r4.c(21, 0);
            this.f18905f = 0L;
            this.f18907h = 0;
        } else {
            this.f18907h = 1;
        }
        this.f18904e = -1L;
        this.f18906g = 0L;
    }
}
