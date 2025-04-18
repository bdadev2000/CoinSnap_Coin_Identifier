package mb;

import java.util.List;

/* loaded from: classes3.dex */
public final class d0 extends u1 {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21886b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21887c;

    /* renamed from: d, reason: collision with root package name */
    public final int f21888d;

    /* renamed from: e, reason: collision with root package name */
    public final long f21889e;

    /* renamed from: f, reason: collision with root package name */
    public final long f21890f;

    /* renamed from: g, reason: collision with root package name */
    public final long f21891g;

    /* renamed from: h, reason: collision with root package name */
    public final String f21892h;

    /* renamed from: i, reason: collision with root package name */
    public final List f21893i;

    public d0(int i10, String str, int i11, int i12, long j3, long j10, long j11, String str2, List list) {
        this.a = i10;
        this.f21886b = str;
        this.f21887c = i11;
        this.f21888d = i12;
        this.f21889e = j3;
        this.f21890f = j10;
        this.f21891g = j11;
        this.f21892h = str2;
        this.f21893i = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u1)) {
            return false;
        }
        u1 u1Var = (u1) obj;
        if (this.a == ((d0) u1Var).a) {
            d0 d0Var = (d0) u1Var;
            if (this.f21886b.equals(d0Var.f21886b) && this.f21887c == d0Var.f21887c && this.f21888d == d0Var.f21888d && this.f21889e == d0Var.f21889e && this.f21890f == d0Var.f21890f && this.f21891g == d0Var.f21891g) {
                String str = d0Var.f21892h;
                String str2 = this.f21892h;
                if (str2 != null ? str2.equals(str) : str == null) {
                    List list = d0Var.f21893i;
                    List list2 = this.f21893i;
                    if (list2 == null) {
                        if (list == null) {
                            return true;
                        }
                    } else if (list2.equals(list)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (((((((this.a ^ 1000003) * 1000003) ^ this.f21886b.hashCode()) * 1000003) ^ this.f21887c) * 1000003) ^ this.f21888d) * 1000003;
        long j3 = this.f21889e;
        int i10 = (hashCode2 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        long j10 = this.f21890f;
        int i11 = (i10 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f21891g;
        int i12 = (i11 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        int i13 = 0;
        String str = this.f21892h;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i14 = (i12 ^ hashCode) * 1000003;
        List list = this.f21893i;
        if (list != null) {
            i13 = list.hashCode();
        }
        return i14 ^ i13;
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.a + ", processName=" + this.f21886b + ", reasonCode=" + this.f21887c + ", importance=" + this.f21888d + ", pss=" + this.f21889e + ", rss=" + this.f21890f + ", timestamp=" + this.f21891g + ", traceFile=" + this.f21892h + ", buildIdMappingForArch=" + this.f21893i + "}";
    }
}
