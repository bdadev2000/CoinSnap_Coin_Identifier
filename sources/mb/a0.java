package mb;

/* loaded from: classes3.dex */
public final class a0 {
    public String a;

    /* renamed from: b, reason: collision with root package name */
    public String f21819b;

    /* renamed from: c, reason: collision with root package name */
    public int f21820c;

    /* renamed from: d, reason: collision with root package name */
    public String f21821d;

    /* renamed from: e, reason: collision with root package name */
    public String f21822e;

    /* renamed from: f, reason: collision with root package name */
    public String f21823f;

    /* renamed from: g, reason: collision with root package name */
    public String f21824g;

    /* renamed from: h, reason: collision with root package name */
    public String f21825h;

    /* renamed from: i, reason: collision with root package name */
    public String f21826i;

    /* renamed from: j, reason: collision with root package name */
    public r2 f21827j;

    /* renamed from: k, reason: collision with root package name */
    public x1 f21828k;

    /* renamed from: l, reason: collision with root package name */
    public u1 f21829l;

    /* renamed from: m, reason: collision with root package name */
    public byte f21830m;

    public a0() {
    }

    public final b0 a() {
        if (this.f21830m == 1 && this.a != null && this.f21819b != null && this.f21821d != null && this.f21825h != null && this.f21826i != null) {
            return new b0(this.a, this.f21819b, this.f21820c, this.f21821d, this.f21822e, this.f21823f, this.f21824g, this.f21825h, this.f21826i, this.f21827j, this.f21828k, this.f21829l);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.a == null) {
            sb2.append(" sdkVersion");
        }
        if (this.f21819b == null) {
            sb2.append(" gmpAppId");
        }
        if ((1 & this.f21830m) == 0) {
            sb2.append(" platform");
        }
        if (this.f21821d == null) {
            sb2.append(" installationUuid");
        }
        if (this.f21825h == null) {
            sb2.append(" buildVersion");
        }
        if (this.f21826i == null) {
            sb2.append(" displayVersion");
        }
        throw new IllegalStateException(vd.e.f("Missing required properties:", sb2));
    }

    public a0(s2 s2Var) {
        b0 b0Var = (b0) s2Var;
        this.a = b0Var.f21842b;
        this.f21819b = b0Var.f21843c;
        this.f21820c = b0Var.f21844d;
        this.f21821d = b0Var.f21845e;
        this.f21822e = b0Var.f21846f;
        this.f21823f = b0Var.f21847g;
        this.f21824g = b0Var.f21848h;
        this.f21825h = b0Var.f21849i;
        this.f21826i = b0Var.f21850j;
        this.f21827j = b0Var.f21851k;
        this.f21828k = b0Var.f21852l;
        this.f21829l = b0Var.f21853m;
        this.f21830m = (byte) 1;
    }
}
