package j7;

import eb.j;

/* loaded from: classes3.dex */
public final class b {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final long f19773b;

    public b(int i10, long j3) {
        if (i10 != 0) {
            this.a = i10;
            this.f19773b = j3;
            return;
        }
        throw new NullPointerException("Null status");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (t.h.a(this.a, bVar.a) && this.f19773b == bVar.f19773b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int b3 = (t.h.b(this.a) ^ 1000003) * 1000003;
        long j3 = this.f19773b;
        return b3 ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BackendResponse{status=");
        sb2.append(j.A(this.a));
        sb2.append(", nextRequestWaitMillis=");
        return a4.j.j(sb2, this.f19773b, "}");
    }
}
