package v4;

import Q7.n0;

/* renamed from: v4.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2850b extends m {
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23608c;

    /* renamed from: d, reason: collision with root package name */
    public final String f23609d;

    /* renamed from: e, reason: collision with root package name */
    public final String f23610e;

    /* renamed from: f, reason: collision with root package name */
    public final long f23611f;

    public C2850b(String str, String str2, String str3, String str4, long j7) {
        if (str != null) {
            this.b = str;
            if (str2 != null) {
                this.f23608c = str2;
                if (str3 != null) {
                    this.f23609d = str3;
                    if (str4 != null) {
                        this.f23610e = str4;
                        this.f23611f = j7;
                        return;
                    }
                    throw new NullPointerException("Null variantId");
                }
                throw new NullPointerException("Null parameterValue");
            }
            throw new NullPointerException("Null parameterKey");
        }
        throw new NullPointerException("Null rolloutId");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.b.equals(((C2850b) mVar).b)) {
            C2850b c2850b = (C2850b) mVar;
            if (this.f23608c.equals(c2850b.f23608c) && this.f23609d.equals(c2850b.f23609d) && this.f23610e.equals(c2850b.f23610e) && this.f23611f == c2850b.f23611f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.f23608c.hashCode()) * 1000003) ^ this.f23609d.hashCode()) * 1000003) ^ this.f23610e.hashCode()) * 1000003;
        long j7 = this.f23611f;
        return hashCode ^ ((int) ((j7 >>> 32) ^ j7));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutId=");
        sb.append(this.b);
        sb.append(", parameterKey=");
        sb.append(this.f23608c);
        sb.append(", parameterValue=");
        sb.append(this.f23609d);
        sb.append(", variantId=");
        sb.append(this.f23610e);
        sb.append(", templateVersion=");
        return n0.k(sb, this.f23611f, "}");
    }
}
