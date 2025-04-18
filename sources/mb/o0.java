package mb;

/* loaded from: classes3.dex */
public final class o0 {
    public long a;

    /* renamed from: b, reason: collision with root package name */
    public String f22033b;

    /* renamed from: c, reason: collision with root package name */
    public i2 f22034c;

    /* renamed from: d, reason: collision with root package name */
    public j2 f22035d;

    /* renamed from: e, reason: collision with root package name */
    public k2 f22036e;

    /* renamed from: f, reason: collision with root package name */
    public n2 f22037f;

    /* renamed from: g, reason: collision with root package name */
    public byte f22038g;

    public o0() {
    }

    public final p0 a() {
        String str;
        i2 i2Var;
        j2 j2Var;
        if (this.f22038g == 1 && (str = this.f22033b) != null && (i2Var = this.f22034c) != null && (j2Var = this.f22035d) != null) {
            return new p0(this.a, str, i2Var, j2Var, this.f22036e, this.f22037f);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((1 & this.f22038g) == 0) {
            sb2.append(" timestamp");
        }
        if (this.f22033b == null) {
            sb2.append(" type");
        }
        if (this.f22034c == null) {
            sb2.append(" app");
        }
        if (this.f22035d == null) {
            sb2.append(" device");
        }
        throw new IllegalStateException(vd.e.f("Missing required properties:", sb2));
    }

    public o0(o2 o2Var) {
        p0 p0Var = (p0) o2Var;
        this.a = p0Var.a;
        this.f22033b = p0Var.f22042b;
        this.f22034c = p0Var.f22043c;
        this.f22035d = p0Var.f22044d;
        this.f22036e = p0Var.f22045e;
        this.f22037f = p0Var.f22046f;
        this.f22038g = (byte) 1;
    }
}
