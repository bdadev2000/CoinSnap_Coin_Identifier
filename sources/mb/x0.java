package mb;

/* loaded from: classes3.dex */
public final class x0 {
    public String a;

    /* renamed from: b, reason: collision with root package name */
    public String f22126b;

    /* renamed from: c, reason: collision with root package name */
    public long f22127c;

    /* renamed from: d, reason: collision with root package name */
    public byte f22128d;

    public final y0 a() {
        String str;
        String str2;
        if (this.f22128d == 1 && (str = this.a) != null && (str2 = this.f22126b) != null) {
            return new y0(str, str2, this.f22127c);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.a == null) {
            sb2.append(" name");
        }
        if (this.f22126b == null) {
            sb2.append(" code");
        }
        if ((1 & this.f22128d) == 0) {
            sb2.append(" address");
        }
        throw new IllegalStateException(vd.e.f("Missing required properties:", sb2));
    }
}
