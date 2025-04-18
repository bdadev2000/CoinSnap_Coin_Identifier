package t0;

/* loaded from: classes.dex */
public final class a {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public int f25139b;

    /* renamed from: c, reason: collision with root package name */
    public float f25140c;

    /* renamed from: d, reason: collision with root package name */
    public float f25141d;

    /* renamed from: h, reason: collision with root package name */
    public float f25145h;

    /* renamed from: i, reason: collision with root package name */
    public int f25146i;

    /* renamed from: e, reason: collision with root package name */
    public long f25142e = Long.MIN_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public long f25144g = -1;

    /* renamed from: f, reason: collision with root package name */
    public long f25143f = 0;

    public final float a(long j3) {
        long j10 = this.f25142e;
        if (j3 < j10) {
            return 0.0f;
        }
        long j11 = this.f25144g;
        if (j11 >= 0 && j3 >= j11) {
            float f10 = this.f25145h;
            return (g.b(((float) (j3 - j11)) / this.f25146i, 0.0f, 1.0f) * f10) + (1.0f - f10);
        }
        return g.b(((float) (j3 - j10)) / this.a, 0.0f, 1.0f) * 0.5f;
    }
}
