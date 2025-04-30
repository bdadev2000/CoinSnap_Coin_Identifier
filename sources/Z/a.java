package Z;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f3843a;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public float f3844c;

    /* renamed from: d, reason: collision with root package name */
    public float f3845d;

    /* renamed from: e, reason: collision with root package name */
    public long f3846e;

    /* renamed from: f, reason: collision with root package name */
    public long f3847f;

    /* renamed from: g, reason: collision with root package name */
    public long f3848g;

    /* renamed from: h, reason: collision with root package name */
    public float f3849h;

    /* renamed from: i, reason: collision with root package name */
    public int f3850i;

    public final float a(long j7) {
        long j9 = this.f3846e;
        if (j7 < j9) {
            return 0.0f;
        }
        long j10 = this.f3848g;
        if (j10 >= 0 && j7 >= j10) {
            float f9 = this.f3849h;
            return (g.b(((float) (j7 - j10)) / this.f3850i, 0.0f, 1.0f) * f9) + (1.0f - f9);
        }
        return g.b(((float) (j7 - j9)) / this.f3843a, 0.0f, 1.0f) * 0.5f;
    }
}
