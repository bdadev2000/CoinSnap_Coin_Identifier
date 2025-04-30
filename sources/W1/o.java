package W1;

/* loaded from: classes.dex */
public final class o {
    public static final o b = new o(2);

    /* renamed from: c, reason: collision with root package name */
    public static final o f3579c = new o(0);

    /* renamed from: d, reason: collision with root package name */
    public static final o f3580d;

    /* renamed from: e, reason: collision with root package name */
    public static final o f3581e;

    /* renamed from: f, reason: collision with root package name */
    public static final o f3582f;

    /* renamed from: g, reason: collision with root package name */
    public static final N1.h f3583g;

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f3584h;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3585a;

    static {
        o oVar = new o(1);
        f3580d = oVar;
        f3581e = new o(3);
        f3582f = oVar;
        f3583g = N1.h.a(oVar, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy");
        f3584h = true;
    }

    public /* synthetic */ o(int i9) {
        this.f3585a = i9;
    }

    public final int a(int i9, int i10, int i11, int i12) {
        switch (this.f3585a) {
            case 0:
                if (b(i9, i10, i11, i12) == 1.0f) {
                    return 2;
                }
                return b.a(i9, i10, i11, i12);
            case 1:
                return 2;
            case 2:
                if (f3584h) {
                    return 2;
                }
                return 1;
            default:
                return 2;
        }
    }

    public final float b(int i9, int i10, int i11, int i12) {
        switch (this.f3585a) {
            case 0:
                return Math.min(1.0f, b.b(i9, i10, i11, i12));
            case 1:
                return Math.max(i11 / i9, i12 / i10);
            case 2:
                if (f3584h) {
                    return Math.min(i11 / i9, i12 / i10);
                }
                int max = Math.max(i10 / i12, i9 / i11);
                float f9 = 1.0f;
                if (max != 0) {
                    f9 = 1.0f / Integer.highestOneBit(max);
                }
                return f9;
            default:
                return 1.0f;
        }
    }
}
