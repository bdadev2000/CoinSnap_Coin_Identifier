package r3;

import x0.AbstractC2914a;

/* renamed from: r3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2658a {

    /* renamed from: f, reason: collision with root package name */
    public static final C2658a f22817f = new C2658a(200, 10000, 81920, 10485760, 604800000);

    /* renamed from: a, reason: collision with root package name */
    public final long f22818a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22819c;

    /* renamed from: d, reason: collision with root package name */
    public final long f22820d;

    /* renamed from: e, reason: collision with root package name */
    public final int f22821e;

    public C2658a(int i9, int i10, int i11, long j7, long j9) {
        this.f22818a = j7;
        this.b = i9;
        this.f22819c = i10;
        this.f22820d = j9;
        this.f22821e = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2658a)) {
            return false;
        }
        C2658a c2658a = (C2658a) obj;
        if (this.f22818a == c2658a.f22818a && this.b == c2658a.b && this.f22819c == c2658a.f22819c && this.f22820d == c2658a.f22820d && this.f22821e == c2658a.f22821e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j7 = this.f22818a;
        int i9 = (((((((int) (j7 ^ (j7 >>> 32))) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.f22819c) * 1000003;
        long j9 = this.f22820d;
        return ((i9 ^ ((int) ((j9 >>> 32) ^ j9))) * 1000003) ^ this.f22821e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.f22818a);
        sb.append(", loadBatchSize=");
        sb.append(this.b);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.f22819c);
        sb.append(", eventCleanUpAge=");
        sb.append(this.f22820d);
        sb.append(", maxBlobByteSizePerRow=");
        return AbstractC2914a.g(sb, this.f22821e, "}");
    }
}
