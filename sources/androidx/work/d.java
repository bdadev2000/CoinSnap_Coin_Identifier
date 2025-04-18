package androidx.work;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: i, reason: collision with root package name */
    public static final d f2187i = new d(new c());
    public q a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2188b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2189c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2190d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2191e;

    /* renamed from: f, reason: collision with root package name */
    public long f2192f;

    /* renamed from: g, reason: collision with root package name */
    public long f2193g;

    /* renamed from: h, reason: collision with root package name */
    public f f2194h;

    public d() {
        this.a = q.NOT_REQUIRED;
        this.f2192f = -1L;
        this.f2193g = -1L;
        this.f2194h = new f();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f2188b != dVar.f2188b || this.f2189c != dVar.f2189c || this.f2190d != dVar.f2190d || this.f2191e != dVar.f2191e || this.f2192f != dVar.f2192f || this.f2193g != dVar.f2193g || this.a != dVar.a) {
            return false;
        }
        return this.f2194h.equals(dVar.f2194h);
    }

    public final int hashCode() {
        int hashCode = ((((((((this.a.hashCode() * 31) + (this.f2188b ? 1 : 0)) * 31) + (this.f2189c ? 1 : 0)) * 31) + (this.f2190d ? 1 : 0)) * 31) + (this.f2191e ? 1 : 0)) * 31;
        long j3 = this.f2192f;
        int i10 = (hashCode + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j10 = this.f2193g;
        return this.f2194h.hashCode() + ((i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31);
    }

    public d(c cVar) {
        this.a = q.NOT_REQUIRED;
        this.f2192f = -1L;
        this.f2193g = -1L;
        new f();
        this.f2188b = false;
        this.f2189c = false;
        this.a = cVar.a;
        this.f2190d = false;
        this.f2191e = false;
        this.f2194h = cVar.f2186b;
        this.f2192f = -1L;
        this.f2193g = -1L;
    }

    public d(d dVar) {
        this.a = q.NOT_REQUIRED;
        this.f2192f = -1L;
        this.f2193g = -1L;
        this.f2194h = new f();
        this.f2188b = dVar.f2188b;
        this.f2189c = dVar.f2189c;
        this.a = dVar.a;
        this.f2190d = dVar.f2190d;
        this.f2191e = dVar.f2191e;
        this.f2194h = dVar.f2194h;
    }
}
