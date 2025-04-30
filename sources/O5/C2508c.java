package o5;

import Q7.n0;

/* renamed from: o5.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2508c extends AbstractC2510e {
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final String f21981c;

    /* renamed from: d, reason: collision with root package name */
    public final String f21982d;

    /* renamed from: e, reason: collision with root package name */
    public final String f21983e;

    /* renamed from: f, reason: collision with root package name */
    public final long f21984f;

    public C2508c(String str, String str2, String str3, String str4, long j7) {
        this.b = str;
        this.f21981c = str2;
        this.f21982d = str3;
        this.f21983e = str4;
        this.f21984f = j7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2510e)) {
            return false;
        }
        AbstractC2510e abstractC2510e = (AbstractC2510e) obj;
        if (this.b.equals(((C2508c) abstractC2510e).b)) {
            C2508c c2508c = (C2508c) abstractC2510e;
            if (this.f21981c.equals(c2508c.f21981c) && this.f21982d.equals(c2508c.f21982d) && this.f21983e.equals(c2508c.f21983e) && this.f21984f == c2508c.f21984f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.f21981c.hashCode()) * 1000003) ^ this.f21982d.hashCode()) * 1000003) ^ this.f21983e.hashCode()) * 1000003;
        long j7 = this.f21984f;
        return hashCode ^ ((int) ((j7 >>> 32) ^ j7));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutId=");
        sb.append(this.b);
        sb.append(", variantId=");
        sb.append(this.f21981c);
        sb.append(", parameterKey=");
        sb.append(this.f21982d);
        sb.append(", parameterValue=");
        sb.append(this.f21983e);
        sb.append(", templateVersion=");
        return n0.k(sb, this.f21984f, "}");
    }
}
