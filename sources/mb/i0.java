package mb;

import java.util.List;

/* loaded from: classes3.dex */
public final class i0 {
    public String a;

    /* renamed from: b, reason: collision with root package name */
    public String f21937b;

    /* renamed from: c, reason: collision with root package name */
    public String f21938c;

    /* renamed from: d, reason: collision with root package name */
    public long f21939d;

    /* renamed from: e, reason: collision with root package name */
    public Long f21940e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f21941f;

    /* renamed from: g, reason: collision with root package name */
    public z1 f21942g;

    /* renamed from: h, reason: collision with root package name */
    public q2 f21943h;

    /* renamed from: i, reason: collision with root package name */
    public p2 f21944i;

    /* renamed from: j, reason: collision with root package name */
    public a2 f21945j;

    /* renamed from: k, reason: collision with root package name */
    public List f21946k;

    /* renamed from: l, reason: collision with root package name */
    public int f21947l;

    /* renamed from: m, reason: collision with root package name */
    public byte f21948m;

    public i0() {
    }

    public final j0 a() {
        String str;
        String str2;
        z1 z1Var;
        if (this.f21948m == 7 && (str = this.a) != null && (str2 = this.f21937b) != null && (z1Var = this.f21942g) != null) {
            return new j0(str, str2, this.f21938c, this.f21939d, this.f21940e, this.f21941f, z1Var, this.f21943h, this.f21944i, this.f21945j, this.f21946k, this.f21947l);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.a == null) {
            sb2.append(" generator");
        }
        if (this.f21937b == null) {
            sb2.append(" identifier");
        }
        if ((this.f21948m & 1) == 0) {
            sb2.append(" startedAt");
        }
        if ((this.f21948m & 2) == 0) {
            sb2.append(" crashed");
        }
        if (this.f21942g == null) {
            sb2.append(" app");
        }
        if ((this.f21948m & 4) == 0) {
            sb2.append(" generatorType");
        }
        throw new IllegalStateException(vd.e.f("Missing required properties:", sb2));
    }

    public i0(r2 r2Var) {
        j0 j0Var = (j0) r2Var;
        this.a = j0Var.a;
        this.f21937b = j0Var.f21965b;
        this.f21938c = j0Var.f21966c;
        this.f21939d = j0Var.f21967d;
        this.f21940e = j0Var.f21968e;
        this.f21941f = j0Var.f21969f;
        this.f21942g = j0Var.f21970g;
        this.f21943h = j0Var.f21971h;
        this.f21944i = j0Var.f21972i;
        this.f21945j = j0Var.f21973j;
        this.f21946k = j0Var.f21974k;
        this.f21947l = j0Var.f21975l;
        this.f21948m = (byte) 7;
    }
}
