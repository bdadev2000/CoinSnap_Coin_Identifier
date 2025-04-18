package mb;

/* loaded from: classes3.dex */
public final class b1 {
    public long a;

    /* renamed from: b, reason: collision with root package name */
    public String f21854b;

    /* renamed from: c, reason: collision with root package name */
    public String f21855c;

    /* renamed from: d, reason: collision with root package name */
    public long f21856d;

    /* renamed from: e, reason: collision with root package name */
    public int f21857e;

    /* renamed from: f, reason: collision with root package name */
    public byte f21858f;

    public final c1 a() {
        String str;
        if (this.f21858f == 7 && (str = this.f21854b) != null) {
            return new c1(this.a, str, this.f21855c, this.f21856d, this.f21857e);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f21858f & 1) == 0) {
            sb2.append(" pc");
        }
        if (this.f21854b == null) {
            sb2.append(" symbol");
        }
        if ((this.f21858f & 2) == 0) {
            sb2.append(" offset");
        }
        if ((this.f21858f & 4) == 0) {
            sb2.append(" importance");
        }
        throw new IllegalStateException(vd.e.f("Missing required properties:", sb2));
    }
}
