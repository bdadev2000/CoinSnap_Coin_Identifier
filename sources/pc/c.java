package pc;

/* loaded from: classes3.dex */
public final class c {
    public String a;

    /* renamed from: b, reason: collision with root package name */
    public String f23584b;

    /* renamed from: c, reason: collision with root package name */
    public String f23585c;

    /* renamed from: d, reason: collision with root package name */
    public String f23586d;

    /* renamed from: e, reason: collision with root package name */
    public long f23587e;

    /* renamed from: f, reason: collision with root package name */
    public byte f23588f;

    public final d a() {
        if (this.f23588f == 1 && this.a != null && this.f23584b != null && this.f23585c != null && this.f23586d != null) {
            return new d(this.a, this.f23584b, this.f23585c, this.f23586d, this.f23587e);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.a == null) {
            sb2.append(" rolloutId");
        }
        if (this.f23584b == null) {
            sb2.append(" variantId");
        }
        if (this.f23585c == null) {
            sb2.append(" parameterKey");
        }
        if (this.f23586d == null) {
            sb2.append(" parameterValue");
        }
        if ((1 & this.f23588f) == 0) {
            sb2.append(" templateVersion");
        }
        throw new IllegalStateException(vd.e.f("Missing required properties:", sb2));
    }
}
