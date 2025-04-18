package mb;

import java.util.List;

/* loaded from: classes3.dex */
public final class q0 {
    public g2 a;

    /* renamed from: b, reason: collision with root package name */
    public List f22054b;

    /* renamed from: c, reason: collision with root package name */
    public List f22055c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f22056d;

    /* renamed from: e, reason: collision with root package name */
    public h2 f22057e;

    /* renamed from: f, reason: collision with root package name */
    public List f22058f;

    /* renamed from: g, reason: collision with root package name */
    public int f22059g;

    /* renamed from: h, reason: collision with root package name */
    public byte f22060h;

    public q0() {
    }

    public final r0 a() {
        g2 g2Var;
        if (this.f22060h == 1 && (g2Var = this.a) != null) {
            return new r0(g2Var, this.f22054b, this.f22055c, this.f22056d, this.f22057e, this.f22058f, this.f22059g);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.a == null) {
            sb2.append(" execution");
        }
        if ((1 & this.f22060h) == 0) {
            sb2.append(" uiOrientation");
        }
        throw new IllegalStateException(vd.e.f("Missing required properties:", sb2));
    }

    public q0(r0 r0Var) {
        this.a = r0Var.a;
        this.f22054b = r0Var.f22070b;
        this.f22055c = r0Var.f22071c;
        this.f22056d = r0Var.f22072d;
        this.f22057e = r0Var.f22073e;
        this.f22058f = r0Var.f22074f;
        this.f22059g = r0Var.f22075g;
        this.f22060h = (byte) 1;
    }
}
