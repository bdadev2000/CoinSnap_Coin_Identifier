package q3;

import java.util.HashMap;
import java.util.Map;
import t3.C2707b;

/* renamed from: q3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2641a {

    /* renamed from: a, reason: collision with root package name */
    public final C2707b f22752a;
    public final Map b;

    public C2641a(C2707b c2707b, HashMap hashMap) {
        this.f22752a = c2707b;
        this.b = hashMap;
    }

    public final long a(h3.d dVar, long j7, int i9) {
        long j9;
        long a6 = j7 - this.f22752a.a();
        b bVar = (b) this.b.get(dVar);
        long j10 = bVar.f22753a;
        int i10 = i9 - 1;
        if (j10 > 1) {
            j9 = j10;
        } else {
            j9 = 2;
        }
        return Math.min(Math.max((long) (Math.pow(3.0d, i10) * j10 * Math.max(1.0d, Math.log(10000.0d) / Math.log(j9 * i10))), a6), bVar.b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2641a)) {
            return false;
        }
        C2641a c2641a = (C2641a) obj;
        if (this.f22752a.equals(c2641a.f22752a) && this.b.equals(c2641a.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f22752a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f22752a + ", values=" + this.b + "}";
    }
}
