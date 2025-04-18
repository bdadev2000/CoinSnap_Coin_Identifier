package mb;

import java.util.List;

/* loaded from: classes3.dex */
public final class j0 extends r2 {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21965b;

    /* renamed from: c, reason: collision with root package name */
    public final String f21966c;

    /* renamed from: d, reason: collision with root package name */
    public final long f21967d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f21968e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f21969f;

    /* renamed from: g, reason: collision with root package name */
    public final z1 f21970g;

    /* renamed from: h, reason: collision with root package name */
    public final q2 f21971h;

    /* renamed from: i, reason: collision with root package name */
    public final p2 f21972i;

    /* renamed from: j, reason: collision with root package name */
    public final a2 f21973j;

    /* renamed from: k, reason: collision with root package name */
    public final List f21974k;

    /* renamed from: l, reason: collision with root package name */
    public final int f21975l;

    public j0(String str, String str2, String str3, long j3, Long l10, boolean z10, z1 z1Var, q2 q2Var, p2 p2Var, a2 a2Var, List list, int i10) {
        this.a = str;
        this.f21965b = str2;
        this.f21966c = str3;
        this.f21967d = j3;
        this.f21968e = l10;
        this.f21969f = z10;
        this.f21970g = z1Var;
        this.f21971h = q2Var;
        this.f21972i = p2Var;
        this.f21973j = a2Var;
        this.f21974k = list;
        this.f21975l = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r2)) {
            return false;
        }
        j0 j0Var = (j0) ((r2) obj);
        if (this.a.equals(j0Var.a)) {
            if (this.f21965b.equals(j0Var.f21965b)) {
                String str = j0Var.f21966c;
                String str2 = this.f21966c;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.f21967d == j0Var.f21967d) {
                        Long l10 = j0Var.f21968e;
                        Long l11 = this.f21968e;
                        if (l11 != null ? l11.equals(l10) : l10 == null) {
                            if (this.f21969f == j0Var.f21969f && this.f21970g.equals(j0Var.f21970g)) {
                                q2 q2Var = j0Var.f21971h;
                                q2 q2Var2 = this.f21971h;
                                if (q2Var2 != null ? q2Var2.equals(q2Var) : q2Var == null) {
                                    p2 p2Var = j0Var.f21972i;
                                    p2 p2Var2 = this.f21972i;
                                    if (p2Var2 != null ? p2Var2.equals(p2Var) : p2Var == null) {
                                        a2 a2Var = j0Var.f21973j;
                                        a2 a2Var2 = this.f21973j;
                                        if (a2Var2 != null ? a2Var2.equals(a2Var) : a2Var == null) {
                                            List list = j0Var.f21974k;
                                            List list2 = this.f21974k;
                                            if (list2 != null ? list2.equals(list) : list == null) {
                                                if (this.f21975l == j0Var.f21975l) {
                                                    return true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i10;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6 = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f21965b.hashCode()) * 1000003;
        int i11 = 0;
        String str = this.f21966c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i12 = (hashCode6 ^ hashCode) * 1000003;
        long j3 = this.f21967d;
        int i13 = (i12 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        Long l10 = this.f21968e;
        if (l10 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l10.hashCode();
        }
        int i14 = (i13 ^ hashCode2) * 1000003;
        if (this.f21969f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int hashCode7 = (((i14 ^ i10) * 1000003) ^ this.f21970g.hashCode()) * 1000003;
        q2 q2Var = this.f21971h;
        if (q2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = q2Var.hashCode();
        }
        int i15 = (hashCode7 ^ hashCode3) * 1000003;
        p2 p2Var = this.f21972i;
        if (p2Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = p2Var.hashCode();
        }
        int i16 = (i15 ^ hashCode4) * 1000003;
        a2 a2Var = this.f21973j;
        if (a2Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = a2Var.hashCode();
        }
        int i17 = (i16 ^ hashCode5) * 1000003;
        List list = this.f21974k;
        if (list != null) {
            i11 = list.hashCode();
        }
        return ((i17 ^ i11) * 1000003) ^ this.f21975l;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Session{generator=");
        sb2.append(this.a);
        sb2.append(", identifier=");
        sb2.append(this.f21965b);
        sb2.append(", appQualitySessionId=");
        sb2.append(this.f21966c);
        sb2.append(", startedAt=");
        sb2.append(this.f21967d);
        sb2.append(", endedAt=");
        sb2.append(this.f21968e);
        sb2.append(", crashed=");
        sb2.append(this.f21969f);
        sb2.append(", app=");
        sb2.append(this.f21970g);
        sb2.append(", user=");
        sb2.append(this.f21971h);
        sb2.append(", os=");
        sb2.append(this.f21972i);
        sb2.append(", device=");
        sb2.append(this.f21973j);
        sb2.append(", events=");
        sb2.append(this.f21974k);
        sb2.append(", generatorType=");
        return vd.e.g(sb2, this.f21975l, "}");
    }
}
