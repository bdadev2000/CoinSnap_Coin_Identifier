package pc;

import a4.j;

/* loaded from: classes3.dex */
public final class d extends f {

    /* renamed from: b, reason: collision with root package name */
    public final String f23589b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23590c;

    /* renamed from: d, reason: collision with root package name */
    public final String f23591d;

    /* renamed from: e, reason: collision with root package name */
    public final String f23592e;

    /* renamed from: f, reason: collision with root package name */
    public final long f23593f;

    public d(String str, String str2, String str3, String str4, long j3) {
        this.f23589b = str;
        this.f23590c = str2;
        this.f23591d = str3;
        this.f23592e = str4;
        this.f23593f = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f23589b.equals(((d) fVar).f23589b)) {
            d dVar = (d) fVar;
            if (this.f23590c.equals(dVar.f23590c) && this.f23591d.equals(dVar.f23591d) && this.f23592e.equals(dVar.f23592e) && this.f23593f == dVar.f23593f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((this.f23589b.hashCode() ^ 1000003) * 1000003) ^ this.f23590c.hashCode()) * 1000003) ^ this.f23591d.hashCode()) * 1000003) ^ this.f23592e.hashCode()) * 1000003;
        long j3 = this.f23593f;
        return hashCode ^ ((int) ((j3 >>> 32) ^ j3));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutId=");
        sb2.append(this.f23589b);
        sb2.append(", variantId=");
        sb2.append(this.f23590c);
        sb2.append(", parameterKey=");
        sb2.append(this.f23591d);
        sb2.append(", parameterValue=");
        sb2.append(this.f23592e);
        sb2.append(", templateVersion=");
        return j.j(sb2, this.f23593f, "}");
    }
}
