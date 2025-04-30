package r5;

/* renamed from: r5.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2674f {

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f22863a;
    public final Double b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f22864c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f22865d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f22866e;

    public C2674f(Boolean bool, Double d2, Integer num, Integer num2, Long l) {
        this.f22863a = bool;
        this.b = d2;
        this.f22864c = num;
        this.f22865d = num2;
        this.f22866e = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2674f)) {
            return false;
        }
        C2674f c2674f = (C2674f) obj;
        if (G7.j.a(this.f22863a, c2674f.f22863a) && G7.j.a(this.b, c2674f.b) && G7.j.a(this.f22864c, c2674f.f22864c) && G7.j.a(this.f22865d, c2674f.f22865d) && G7.j.a(this.f22866e, c2674f.f22866e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i9 = 0;
        Boolean bool = this.f22863a;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i10 = hashCode * 31;
        Double d2 = this.b;
        if (d2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = d2.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        Integer num = this.f22864c;
        if (num == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        Integer num2 = this.f22865d;
        if (num2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num2.hashCode();
        }
        int i13 = (i12 + hashCode4) * 31;
        Long l = this.f22866e;
        if (l != null) {
            i9 = l.hashCode();
        }
        return i13 + i9;
    }

    public final String toString() {
        return "SessionConfigs(sessionEnabled=" + this.f22863a + ", sessionSamplingRate=" + this.b + ", sessionRestartTimeout=" + this.f22864c + ", cacheDuration=" + this.f22865d + ", cacheUpdatedTime=" + this.f22866e + ')';
    }
}
