package w4;

/* renamed from: w4.B, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2863B {

    /* renamed from: a, reason: collision with root package name */
    public String f23686a;
    public String b;

    /* renamed from: c, reason: collision with root package name */
    public int f23687c;

    /* renamed from: d, reason: collision with root package name */
    public String f23688d;

    /* renamed from: e, reason: collision with root package name */
    public String f23689e;

    /* renamed from: f, reason: collision with root package name */
    public String f23690f;

    /* renamed from: g, reason: collision with root package name */
    public String f23691g;

    /* renamed from: h, reason: collision with root package name */
    public String f23692h;

    /* renamed from: i, reason: collision with root package name */
    public String f23693i;

    /* renamed from: j, reason: collision with root package name */
    public O0 f23694j;

    /* renamed from: k, reason: collision with root package name */
    public u0 f23695k;
    public r0 l;
    public byte m;

    public final C2864C a() {
        if (this.m == 1 && this.f23686a != null && this.b != null && this.f23688d != null && this.f23692h != null && this.f23693i != null) {
            return new C2864C(this.f23686a, this.b, this.f23687c, this.f23688d, this.f23689e, this.f23690f, this.f23691g, this.f23692h, this.f23693i, this.f23694j, this.f23695k, this.l);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f23686a == null) {
            sb.append(" sdkVersion");
        }
        if (this.b == null) {
            sb.append(" gmpAppId");
        }
        if ((1 & this.m) == 0) {
            sb.append(" platform");
        }
        if (this.f23688d == null) {
            sb.append(" installationUuid");
        }
        if (this.f23692h == null) {
            sb.append(" buildVersion");
        }
        if (this.f23693i == null) {
            sb.append(" displayVersion");
        }
        throw new IllegalStateException(com.mbridge.msdk.foundation.entity.o.m(sb, "Missing required properties:"));
    }
}
