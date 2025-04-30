package i8;

/* loaded from: classes3.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public C f20764a;
    public A b;

    /* renamed from: d, reason: collision with root package name */
    public String f20766d;

    /* renamed from: e, reason: collision with root package name */
    public r f20767e;

    /* renamed from: g, reason: collision with root package name */
    public M f20769g;

    /* renamed from: h, reason: collision with root package name */
    public I f20770h;

    /* renamed from: i, reason: collision with root package name */
    public I f20771i;

    /* renamed from: j, reason: collision with root package name */
    public I f20772j;

    /* renamed from: k, reason: collision with root package name */
    public long f20773k;
    public long l;
    public J1.B m;

    /* renamed from: c, reason: collision with root package name */
    public int f20765c = -1;

    /* renamed from: f, reason: collision with root package name */
    public J1.k f20768f = new J1.k(3);

    public static void b(I i9, String str) {
        if (i9 != null) {
            if (i9.f20779i == null) {
                if (i9.f20780j == null) {
                    if (i9.f20781k == null) {
                        if (i9.l == null) {
                            return;
                        } else {
                            throw new IllegalArgumentException(G7.j.j(".priorResponse != null", str).toString());
                        }
                    }
                    throw new IllegalArgumentException(G7.j.j(".cacheResponse != null", str).toString());
                }
                throw new IllegalArgumentException(G7.j.j(".networkResponse != null", str).toString());
            }
            throw new IllegalArgumentException(G7.j.j(".body != null", str).toString());
        }
    }

    public final I a() {
        int i9 = this.f20765c;
        if (i9 >= 0) {
            C c9 = this.f20764a;
            if (c9 != null) {
                A a6 = this.b;
                if (a6 != null) {
                    String str = this.f20766d;
                    if (str != null) {
                        return new I(c9, a6, str, i9, this.f20767e, this.f20768f.e(), this.f20769g, this.f20770h, this.f20771i, this.f20772j, this.f20773k, this.l, this.m);
                    }
                    throw new IllegalStateException("message == null".toString());
                }
                throw new IllegalStateException("protocol == null".toString());
            }
            throw new IllegalStateException("request == null".toString());
        }
        throw new IllegalStateException(G7.j.j(Integer.valueOf(i9), "code < 0: ").toString());
    }

    public final void c(s sVar) {
        G7.j.e(sVar, "headers");
        this.f20768f = sVar.d();
    }
}
