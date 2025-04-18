package t1;

/* loaded from: classes.dex */
public final class c {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final long f25172b;

    /* renamed from: c, reason: collision with root package name */
    public final int f25173c;

    public c(long j3, long j10, int i10) {
        this.a = j3;
        this.f25172b = j10;
        this.f25173c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.a == cVar.a && this.f25172b == cVar.f25172b && this.f25173c == cVar.f25173c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f25173c) + ((Long.hashCode(this.f25172b) + (Long.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TaxonomyVersion=");
        sb2.append(this.a);
        sb2.append(", ModelVersion=");
        sb2.append(this.f25172b);
        sb2.append(", TopicCode=");
        return vd.e.e("Topic { ", vd.e.g(sb2, this.f25173c, " }"));
    }
}
