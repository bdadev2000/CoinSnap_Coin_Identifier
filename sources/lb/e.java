package lb;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public static final com.facebook.internal.m f21305c = new com.facebook.internal.m((com.facebook.internal.l) null);
    public final ob.c a;

    /* renamed from: b, reason: collision with root package name */
    public c f21306b;

    public e(ob.c cVar) {
        this.a = cVar;
        this.f21306b = f21305c;
    }

    public final void a(String str) {
        this.f21306b.a();
        this.f21306b = f21305c;
        if (str == null) {
            return;
        }
        this.f21306b = new m(this.a.o(str, "userlog"));
    }

    public e(ob.c cVar, String str) {
        this(cVar);
        a(str);
    }
}
