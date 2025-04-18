package n7;

import java.util.Map;

/* loaded from: classes3.dex */
public final class a {
    public final q7.a a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f22461b;

    public a(q7.a aVar, Map map) {
        if (aVar != null) {
            this.a = aVar;
            if (map != null) {
                this.f22461b = map;
                return;
            }
            throw new NullPointerException("Null values");
        }
        throw new NullPointerException("Null clock");
    }

    public final long a(f7.d dVar, long j3, int i10) {
        long j10;
        long a = j3 - ((q7.b) this.a).a();
        b bVar = (b) this.f22461b.get(dVar);
        long j11 = bVar.a;
        int i11 = i10 - 1;
        if (j11 > 1) {
            j10 = j11;
        } else {
            j10 = 2;
        }
        return Math.min(Math.max((long) (Math.pow(3.0d, i11) * j11 * Math.max(1.0d, Math.log(10000.0d) / Math.log(j10 * i11))), a), bVar.f22462b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.a.equals(aVar.a) && this.f22461b.equals(aVar.f22461b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f22461b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.a + ", values=" + this.f22461b + "}";
    }
}
