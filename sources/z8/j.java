package z8;

import v8.u0;

/* loaded from: classes3.dex */
public final class j {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final long f28628b;

    /* renamed from: c, reason: collision with root package name */
    public final String f28629c;

    /* renamed from: d, reason: collision with root package name */
    public int f28630d;

    public j(String str, long j3, long j10) {
        this.f28629c = str == null ? "" : str;
        this.a = j3;
        this.f28628b = j10;
    }

    public final j a(j jVar, String str) {
        String e02 = u0.e0(str, this.f28629c);
        if (jVar != null && e02.equals(u0.e0(str, jVar.f28629c))) {
            long j3 = this.f28628b;
            long j10 = -1;
            long j11 = jVar.f28628b;
            if (j3 != -1) {
                long j12 = this.a;
                if (j12 + j3 == jVar.a) {
                    if (j11 != -1) {
                        j10 = j3 + j11;
                    }
                    return new j(e02, j12, j10);
                }
            }
            if (j11 != -1) {
                long j13 = jVar.a;
                if (j13 + j11 == this.a) {
                    if (j3 != -1) {
                        j10 = j11 + j3;
                    }
                    return new j(e02, j13, j10);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        if (this.a == jVar.a && this.f28628b == jVar.f28628b && this.f28629c.equals(jVar.f28629c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f28630d == 0) {
            this.f28630d = this.f28629c.hashCode() + ((((527 + ((int) this.a)) * 31) + ((int) this.f28628b)) * 31);
        }
        return this.f28630d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RangedUri(referenceUri=");
        sb2.append(this.f28629c);
        sb2.append(", start=");
        sb2.append(this.a);
        sb2.append(", length=");
        return a4.j.j(sb2, this.f28628b, ")");
    }
}
