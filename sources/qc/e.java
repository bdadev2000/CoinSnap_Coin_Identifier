package qc;

/* loaded from: classes3.dex */
public final class e implements vb.d {
    public static final e a = new e();

    /* renamed from: b, reason: collision with root package name */
    public static final vb.c f23786b = vb.c.a("performance");

    /* renamed from: c, reason: collision with root package name */
    public static final vb.c f23787c = vb.c.a("crashlytics");

    /* renamed from: d, reason: collision with root package name */
    public static final vb.c f23788d = vb.c.a("sessionSamplingRate");

    @Override // vb.a
    public final void a(Object obj, Object obj2) {
        j jVar = (j) obj;
        vb.e eVar = (vb.e) obj2;
        eVar.a(f23786b, jVar.a);
        eVar.a(f23787c, jVar.f23823b);
        eVar.d(f23788d, jVar.f23824c);
    }
}
