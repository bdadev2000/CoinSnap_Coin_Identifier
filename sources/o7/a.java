package o7;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final a f23135f;
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23136b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23137c;

    /* renamed from: d, reason: collision with root package name */
    public final long f23138d;

    /* renamed from: e, reason: collision with root package name */
    public final int f23139e;

    static {
        String str;
        w3.h hVar = new w3.h();
        hVar.a = 10485760L;
        hVar.f26699b = 200;
        hVar.f26700c = 10000;
        hVar.f26701d = 604800000L;
        hVar.f26702e = 81920;
        if (((Long) hVar.a) == null) {
            str = " maxStorageSizeInBytes";
        } else {
            str = "";
        }
        if (((Integer) hVar.f26699b) == null) {
            str = str.concat(" loadBatchSize");
        }
        if (((Integer) hVar.f26700c) == null) {
            str = eb.j.k(str, " criticalSectionEnterTimeoutMs");
        }
        if (((Long) hVar.f26701d) == null) {
            str = eb.j.k(str, " eventCleanUpAge");
        }
        if (((Integer) hVar.f26702e) == null) {
            str = eb.j.k(str, " maxBlobByteSizePerRow");
        }
        if (str.isEmpty()) {
            f23135f = new a(((Long) hVar.a).longValue(), ((Integer) hVar.f26699b).intValue(), ((Integer) hVar.f26700c).intValue(), ((Long) hVar.f26701d).longValue(), ((Integer) hVar.f26702e).intValue());
            return;
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public a(long j3, int i10, int i11, long j10, int i12) {
        this.a = j3;
        this.f23136b = i10;
        this.f23137c = i11;
        this.f23138d = j10;
        this.f23139e = i12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.a == aVar.a && this.f23136b == aVar.f23136b && this.f23137c == aVar.f23137c && this.f23138d == aVar.f23138d && this.f23139e == aVar.f23139e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.a;
        int i10 = (((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f23136b) * 1000003) ^ this.f23137c) * 1000003;
        long j10 = this.f23138d;
        return ((i10 ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003) ^ this.f23139e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.a);
        sb2.append(", loadBatchSize=");
        sb2.append(this.f23136b);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.f23137c);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.f23138d);
        sb2.append(", maxBlobByteSizePerRow=");
        return vd.e.g(sb2, this.f23139e, "}");
    }
}
