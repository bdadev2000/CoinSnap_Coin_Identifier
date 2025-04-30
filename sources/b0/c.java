package B0;

import x0.AbstractC2914a;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f255a;
    public final long b;

    /* renamed from: c, reason: collision with root package name */
    public final int f256c;

    public c(long j7, long j9, int i9) {
        this.f255a = j7;
        this.b = j9;
        this.f256c = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f255a == cVar.f255a && this.b == cVar.b && this.f256c == cVar.f256c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f256c) + ((Long.hashCode(this.b) + (Long.hashCode(this.f255a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TaxonomyVersion=");
        sb.append(this.f255a);
        sb.append(", ModelVersion=");
        sb.append(this.b);
        sb.append(", TopicCode=");
        return AbstractC2914a.d("Topic { ", AbstractC2914a.g(sb, this.f256c, " }"));
    }
}
