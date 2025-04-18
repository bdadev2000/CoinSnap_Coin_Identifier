package mb;

/* loaded from: classes3.dex */
public final class i1 {
    public l2 a;

    /* renamed from: b, reason: collision with root package name */
    public String f21949b;

    /* renamed from: c, reason: collision with root package name */
    public String f21950c;

    /* renamed from: d, reason: collision with root package name */
    public long f21951d;

    /* renamed from: e, reason: collision with root package name */
    public byte f21952e;

    public final j1 a() {
        l2 l2Var;
        String str;
        String str2;
        if (this.f21952e == 1 && (l2Var = this.a) != null && (str = this.f21949b) != null && (str2 = this.f21950c) != null) {
            return new j1(l2Var, str, str2, this.f21951d);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.a == null) {
            sb2.append(" rolloutVariant");
        }
        if (this.f21949b == null) {
            sb2.append(" parameterKey");
        }
        if (this.f21950c == null) {
            sb2.append(" parameterValue");
        }
        if ((1 & this.f21952e) == 0) {
            sb2.append(" templateVersion");
        }
        throw new IllegalStateException(vd.e.f("Missing required properties:", sb2));
    }
}
