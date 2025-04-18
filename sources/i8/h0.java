package i8;

/* loaded from: classes3.dex */
public final class h0 {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19315b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19316c;

    /* renamed from: d, reason: collision with root package name */
    public int f19317d;

    /* renamed from: e, reason: collision with root package name */
    public String f19318e;

    public h0(int i10, int i11) {
        this(Integer.MIN_VALUE, i10, i11);
    }

    public final void a() {
        int i10;
        int i11 = this.f19317d;
        if (i11 == Integer.MIN_VALUE) {
            i10 = this.f19315b;
        } else {
            i10 = i11 + this.f19316c;
        }
        this.f19317d = i10;
        this.f19318e = this.a + this.f19317d;
    }

    public final void b() {
        if (this.f19317d != Integer.MIN_VALUE) {
        } else {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public h0(int i10, int i11, int i12) {
        String str;
        if (i10 != Integer.MIN_VALUE) {
            str = i10 + "/";
        } else {
            str = "";
        }
        this.a = str;
        this.f19315b = i11;
        this.f19316c = i12;
        this.f19317d = Integer.MIN_VALUE;
        this.f19318e = "";
    }
}
