package t7;

/* renamed from: t7.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2730s implements Comparable {
    public final long b;

    public /* synthetic */ C2730s(long j7) {
        this.b = j7;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return G7.j.g(this.b ^ Long.MIN_VALUE, ((C2730s) obj).b ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2730s)) {
            return false;
        }
        if (this.b != ((C2730s) obj).b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        long j7 = this.b;
        if (j7 >= 0) {
            com.facebook.appevents.g.a(10);
            String l = Long.toString(j7, 10);
            G7.j.d(l, "toString(...)");
            return l;
        }
        long j9 = 10;
        long j10 = ((j7 >>> 1) / j9) << 1;
        long j11 = j7 - (j10 * j9);
        if (j11 >= j9) {
            j11 -= j9;
            j10++;
        }
        com.facebook.appevents.g.a(10);
        String l2 = Long.toString(j10, 10);
        G7.j.d(l2, "toString(...)");
        com.facebook.appevents.g.a(10);
        String l6 = Long.toString(j11, 10);
        G7.j.d(l6, "toString(...)");
        return l2.concat(l6);
    }
}
