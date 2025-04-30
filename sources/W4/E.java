package w4;

import java.util.List;

/* loaded from: classes2.dex */
public final class E extends r0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f23714a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23715c;

    /* renamed from: d, reason: collision with root package name */
    public final int f23716d;

    /* renamed from: e, reason: collision with root package name */
    public final long f23717e;

    /* renamed from: f, reason: collision with root package name */
    public final long f23718f;

    /* renamed from: g, reason: collision with root package name */
    public final long f23719g;

    /* renamed from: h, reason: collision with root package name */
    public final String f23720h;

    /* renamed from: i, reason: collision with root package name */
    public final List f23721i;

    public E(int i9, String str, int i10, int i11, long j7, long j9, long j10, String str2, List list) {
        this.f23714a = i9;
        this.b = str;
        this.f23715c = i10;
        this.f23716d = i11;
        this.f23717e = j7;
        this.f23718f = j9;
        this.f23719g = j10;
        this.f23720h = str2;
        this.f23721i = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        if (this.f23714a == ((E) r0Var).f23714a) {
            E e4 = (E) r0Var;
            if (this.b.equals(e4.b) && this.f23715c == e4.f23715c && this.f23716d == e4.f23716d && this.f23717e == e4.f23717e && this.f23718f == e4.f23718f && this.f23719g == e4.f23719g) {
                String str = e4.f23720h;
                String str2 = this.f23720h;
                if (str2 != null ? str2.equals(str) : str == null) {
                    List list = e4.f23721i;
                    List list2 = this.f23721i;
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
        int hashCode2 = (((((((this.f23714a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.f23715c) * 1000003) ^ this.f23716d) * 1000003;
        long j7 = this.f23717e;
        int i9 = (hashCode2 ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003;
        long j9 = this.f23718f;
        int i10 = (i9 ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        long j10 = this.f23719g;
        int i11 = (i10 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        int i12 = 0;
        String str = this.f23720h;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i13 = (i11 ^ hashCode) * 1000003;
        List list = this.f23721i;
        if (list != null) {
            i12 = list.hashCode();
        }
        return i13 ^ i12;
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f23714a + ", processName=" + this.b + ", reasonCode=" + this.f23715c + ", importance=" + this.f23716d + ", pss=" + this.f23717e + ", rss=" + this.f23718f + ", timestamp=" + this.f23719g + ", traceFile=" + this.f23720h + ", buildIdMappingForArch=" + this.f23721i + "}";
    }
}
