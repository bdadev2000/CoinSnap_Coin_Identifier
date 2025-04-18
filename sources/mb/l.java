package mb;

/* loaded from: classes3.dex */
public final class l implements vb.d {
    public static final l a = new l();

    /* renamed from: b, reason: collision with root package name */
    public static final vb.c f21992b = vb.c.a("baseAddress");

    /* renamed from: c, reason: collision with root package name */
    public static final vb.c f21993c = vb.c.a("size");

    /* renamed from: d, reason: collision with root package name */
    public static final vb.c f21994d = vb.c.a("name");

    /* renamed from: e, reason: collision with root package name */
    public static final vb.c f21995e = vb.c.a("uuid");

    @Override // vb.a
    public final void a(Object obj, Object obj2) {
        byte[] bArr;
        vb.e eVar = (vb.e) obj2;
        u0 u0Var = (u0) ((b2) obj);
        eVar.c(f21992b, u0Var.a);
        eVar.c(f21993c, u0Var.f22107b);
        eVar.a(f21994d, u0Var.f22108c);
        String str = u0Var.f22109d;
        if (str != null) {
            bArr = str.getBytes(s2.a);
        } else {
            bArr = null;
        }
        eVar.a(f21995e, bArr);
    }
}
