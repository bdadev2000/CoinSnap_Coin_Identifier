package u2;

/* loaded from: classes.dex */
public final class d {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f25446b;

    public d(String str, long j3) {
        this.a = str;
        this.f25446b = Long.valueOf(j3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!this.a.equals(dVar.a)) {
            return false;
        }
        Long l10 = dVar.f25446b;
        Long l11 = this.f25446b;
        if (l11 != null) {
            return l11.equals(l10);
        }
        if (l10 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.a.hashCode() * 31;
        Long l10 = this.f25446b;
        if (l10 != null) {
            i10 = l10.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }
}
