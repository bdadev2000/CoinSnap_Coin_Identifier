package w4;

import java.util.List;
import x0.AbstractC2914a;

/* loaded from: classes2.dex */
public final class K extends O0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f23737a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23738c;

    /* renamed from: d, reason: collision with root package name */
    public final long f23739d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f23740e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f23741f;

    /* renamed from: g, reason: collision with root package name */
    public final w0 f23742g;

    /* renamed from: h, reason: collision with root package name */
    public final N0 f23743h;

    /* renamed from: i, reason: collision with root package name */
    public final M0 f23744i;

    /* renamed from: j, reason: collision with root package name */
    public final x0 f23745j;

    /* renamed from: k, reason: collision with root package name */
    public final List f23746k;
    public final int l;

    public K(String str, String str2, String str3, long j7, Long l, boolean z8, w0 w0Var, N0 n02, M0 m02, x0 x0Var, List list, int i9) {
        this.f23737a = str;
        this.b = str2;
        this.f23738c = str3;
        this.f23739d = j7;
        this.f23740e = l;
        this.f23741f = z8;
        this.f23742g = w0Var;
        this.f23743h = n02;
        this.f23744i = m02;
        this.f23745j = x0Var;
        this.f23746k = list;
        this.l = i9;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w4.J] */
    @Override // w4.O0
    public final J a() {
        ?? obj = new Object();
        obj.f23727a = this.f23737a;
        obj.b = this.b;
        obj.f23728c = this.f23738c;
        obj.f23729d = this.f23739d;
        obj.f23730e = this.f23740e;
        obj.f23731f = this.f23741f;
        obj.f23732g = this.f23742g;
        obj.f23733h = this.f23743h;
        obj.f23734i = this.f23744i;
        obj.f23735j = this.f23745j;
        obj.f23736k = this.f23746k;
        obj.l = this.l;
        obj.m = (byte) 7;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof O0)) {
            return false;
        }
        O0 o02 = (O0) obj;
        if (this.f23737a.equals(((K) o02).f23737a)) {
            K k6 = (K) o02;
            if (this.b.equals(k6.b)) {
                String str = k6.f23738c;
                String str2 = this.f23738c;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.f23739d == k6.f23739d) {
                        Long l = k6.f23740e;
                        Long l2 = this.f23740e;
                        if (l2 != null ? l2.equals(l) : l == null) {
                            if (this.f23741f == k6.f23741f && this.f23742g.equals(k6.f23742g)) {
                                N0 n02 = k6.f23743h;
                                N0 n03 = this.f23743h;
                                if (n03 != null ? n03.equals(n02) : n02 == null) {
                                    M0 m02 = k6.f23744i;
                                    M0 m03 = this.f23744i;
                                    if (m03 != null ? m03.equals(m02) : m02 == null) {
                                        x0 x0Var = k6.f23745j;
                                        x0 x0Var2 = this.f23745j;
                                        if (x0Var2 != null ? x0Var2.equals(x0Var) : x0Var == null) {
                                            List list = k6.f23746k;
                                            List list2 = this.f23746k;
                                            if (list2 != null ? list2.equals(list) : list == null) {
                                                if (this.l == k6.l) {
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
        int i9;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6 = (((this.f23737a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        int i10 = 0;
        String str = this.f23738c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j7 = this.f23739d;
        int i11 = (((hashCode6 ^ hashCode) * 1000003) ^ ((int) ((j7 >>> 32) ^ j7))) * 1000003;
        Long l = this.f23740e;
        if (l == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l.hashCode();
        }
        int i12 = (i11 ^ hashCode2) * 1000003;
        if (this.f23741f) {
            i9 = 1231;
        } else {
            i9 = 1237;
        }
        int hashCode7 = (((i12 ^ i9) * 1000003) ^ this.f23742g.hashCode()) * 1000003;
        N0 n02 = this.f23743h;
        if (n02 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = n02.hashCode();
        }
        int i13 = (hashCode7 ^ hashCode3) * 1000003;
        M0 m02 = this.f23744i;
        if (m02 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = m02.hashCode();
        }
        int i14 = (i13 ^ hashCode4) * 1000003;
        x0 x0Var = this.f23745j;
        if (x0Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = x0Var.hashCode();
        }
        int i15 = (i14 ^ hashCode5) * 1000003;
        List list = this.f23746k;
        if (list != null) {
            i10 = list.hashCode();
        }
        return ((i15 ^ i10) * 1000003) ^ this.l;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Session{generator=");
        sb.append(this.f23737a);
        sb.append(", identifier=");
        sb.append(this.b);
        sb.append(", appQualitySessionId=");
        sb.append(this.f23738c);
        sb.append(", startedAt=");
        sb.append(this.f23739d);
        sb.append(", endedAt=");
        sb.append(this.f23740e);
        sb.append(", crashed=");
        sb.append(this.f23741f);
        sb.append(", app=");
        sb.append(this.f23742g);
        sb.append(", user=");
        sb.append(this.f23743h);
        sb.append(", os=");
        sb.append(this.f23744i);
        sb.append(", device=");
        sb.append(this.f23745j);
        sb.append(", events=");
        sb.append(this.f23746k);
        sb.append(", generatorType=");
        return AbstractC2914a.g(sb, this.l, "}");
    }
}
