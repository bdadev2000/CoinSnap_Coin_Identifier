package e8;

/* renamed from: e8.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2247w {

    /* renamed from: e, reason: collision with root package name */
    public static final long[] f20198e = new long[0];

    /* renamed from: a, reason: collision with root package name */
    public final c8.g f20199a;
    public final F7.p b;

    /* renamed from: c, reason: collision with root package name */
    public long f20200c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f20201d;

    public C2247w(c8.g gVar, g8.i iVar) {
        G7.j.e(gVar, "descriptor");
        this.f20199a = gVar;
        this.b = iVar;
        int f9 = gVar.f();
        if (f9 <= 64) {
            this.f20200c = f9 != 64 ? (-1) << f9 : 0L;
            this.f20201d = f20198e;
            return;
        }
        this.f20200c = 0L;
        int i9 = (f9 - 1) >>> 6;
        long[] jArr = new long[i9];
        if ((f9 & 63) != 0) {
            jArr[i9 - 1] = (-1) << f9;
        }
        this.f20201d = jArr;
    }
}
