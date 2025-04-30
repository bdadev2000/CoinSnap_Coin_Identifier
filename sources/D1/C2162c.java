package d1;

/* renamed from: d1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2162c {

    /* renamed from: a, reason: collision with root package name */
    public final String f19795a;
    public final Long b;

    public C2162c(String str, long j7) {
        this.f19795a = str;
        this.b = Long.valueOf(j7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2162c)) {
            return false;
        }
        C2162c c2162c = (C2162c) obj;
        if (!this.f19795a.equals(c2162c.f19795a)) {
            return false;
        }
        Long l = c2162c.b;
        Long l2 = this.b;
        if (l2 != null) {
            return l2.equals(l);
        }
        if (l == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        int hashCode = this.f19795a.hashCode() * 31;
        Long l = this.b;
        if (l != null) {
            i9 = l.hashCode();
        } else {
            i9 = 0;
        }
        return hashCode + i9;
    }
}
