package qc;

/* loaded from: classes3.dex */
public final class f implements vb.d {
    public static final f a = new f();

    /* renamed from: b, reason: collision with root package name */
    public static final vb.c f23791b = vb.c.a("processName");

    /* renamed from: c, reason: collision with root package name */
    public static final vb.c f23792c = vb.c.a("pid");

    /* renamed from: d, reason: collision with root package name */
    public static final vb.c f23793d = vb.c.a("importance");

    /* renamed from: e, reason: collision with root package name */
    public static final vb.c f23794e = vb.c.a("defaultProcess");

    @Override // vb.a
    public final void a(Object obj, Object obj2) {
        u uVar = (u) obj;
        vb.e eVar = (vb.e) obj2;
        eVar.a(f23791b, uVar.a);
        eVar.b(f23792c, uVar.f23879b);
        eVar.b(f23793d, uVar.f23880c);
        eVar.e(f23794e, uVar.f23881d);
    }
}
