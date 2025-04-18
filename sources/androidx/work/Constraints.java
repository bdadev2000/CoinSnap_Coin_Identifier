package androidx.work;

/* loaded from: classes3.dex */
public final class Constraints {

    /* renamed from: i, reason: collision with root package name */
    public static final Constraints f21853i = new Builder().a();

    /* renamed from: b, reason: collision with root package name */
    public boolean f21855b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f21856c;
    public boolean d;
    public boolean e;

    /* renamed from: a, reason: collision with root package name */
    public NetworkType f21854a = NetworkType.f21881a;

    /* renamed from: f, reason: collision with root package name */
    public long f21857f = -1;

    /* renamed from: g, reason: collision with root package name */
    public long f21858g = -1;

    /* renamed from: h, reason: collision with root package name */
    public ContentUriTriggers f21859h = new ContentUriTriggers();

    /* loaded from: classes3.dex */
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public NetworkType f21860a = NetworkType.f21881a;

        /* renamed from: b, reason: collision with root package name */
        public final ContentUriTriggers f21861b = new ContentUriTriggers();

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.work.Constraints, java.lang.Object] */
        public final Constraints a() {
            ?? obj = new Object();
            obj.f21854a = NetworkType.f21881a;
            obj.f21857f = -1L;
            obj.f21858g = -1L;
            new ContentUriTriggers();
            obj.f21855b = false;
            obj.f21856c = false;
            obj.f21854a = this.f21860a;
            obj.d = false;
            obj.e = false;
            obj.f21859h = this.f21861b;
            obj.f21857f = -1L;
            obj.f21858g = -1L;
            return obj;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Constraints.class != obj.getClass()) {
            return false;
        }
        Constraints constraints = (Constraints) obj;
        if (this.f21855b == constraints.f21855b && this.f21856c == constraints.f21856c && this.d == constraints.d && this.e == constraints.e && this.f21857f == constraints.f21857f && this.f21858g == constraints.f21858g && this.f21854a == constraints.f21854a) {
            return this.f21859h.equals(constraints.f21859h);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((((((this.f21854a.hashCode() * 31) + (this.f21855b ? 1 : 0)) * 31) + (this.f21856c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31;
        long j2 = this.f21857f;
        int i2 = (hashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f21858g;
        return this.f21859h.f21862a.hashCode() + ((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31);
    }
}
