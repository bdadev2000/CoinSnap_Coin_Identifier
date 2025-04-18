package h7;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class t extends f0 {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f18851b;

    /* renamed from: c, reason: collision with root package name */
    public final b0 f18852c;

    /* renamed from: d, reason: collision with root package name */
    public final long f18853d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f18854e;

    /* renamed from: f, reason: collision with root package name */
    public final String f18855f;

    /* renamed from: g, reason: collision with root package name */
    public final long f18856g;

    /* renamed from: h, reason: collision with root package name */
    public final j0 f18857h;

    /* renamed from: i, reason: collision with root package name */
    public final c0 f18858i;

    public t(long j3, Integer num, b0 b0Var, long j10, byte[] bArr, String str, long j11, j0 j0Var, c0 c0Var) {
        this.a = j3;
        this.f18851b = num;
        this.f18852c = b0Var;
        this.f18853d = j10;
        this.f18854e = bArr;
        this.f18855f = str;
        this.f18856g = j11;
        this.f18857h = j0Var;
        this.f18858i = c0Var;
    }

    public final boolean equals(Object obj) {
        Integer num;
        b0 b0Var;
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        t tVar = (t) f0Var;
        if (this.a == tVar.a && ((num = this.f18851b) != null ? num.equals(tVar.f18851b) : tVar.f18851b == null) && ((b0Var = this.f18852c) != null ? b0Var.equals(tVar.f18852c) : tVar.f18852c == null)) {
            if (this.f18853d == tVar.f18853d) {
                if (f0Var instanceof t) {
                    bArr = ((t) f0Var).f18854e;
                } else {
                    bArr = tVar.f18854e;
                }
                if (Arrays.equals(this.f18854e, bArr)) {
                    String str = tVar.f18855f;
                    String str2 = this.f18855f;
                    if (str2 != null ? str2.equals(str) : str == null) {
                        if (this.f18856g == tVar.f18856g) {
                            j0 j0Var = tVar.f18857h;
                            j0 j0Var2 = this.f18857h;
                            if (j0Var2 != null ? j0Var2.equals(j0Var) : j0Var == null) {
                                c0 c0Var = tVar.f18858i;
                                c0 c0Var2 = this.f18858i;
                                if (c0Var2 == null) {
                                    if (c0Var == null) {
                                        return true;
                                    }
                                } else if (c0Var2.equals(c0Var)) {
                                    return true;
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
        int hashCode3;
        int hashCode4;
        long j3 = this.a;
        int i10 = (((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003;
        int i11 = 0;
        Integer num = this.f18851b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i12 = (i10 ^ hashCode) * 1000003;
        b0 b0Var = this.f18852c;
        if (b0Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = b0Var.hashCode();
        }
        int i13 = (i12 ^ hashCode2) * 1000003;
        long j10 = this.f18853d;
        int hashCode5 = (((i13 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f18854e)) * 1000003;
        String str = this.f18855f;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i14 = (hashCode5 ^ hashCode3) * 1000003;
        long j11 = this.f18856g;
        int i15 = (i14 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        j0 j0Var = this.f18857h;
        if (j0Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = j0Var.hashCode();
        }
        int i16 = (i15 ^ hashCode4) * 1000003;
        c0 c0Var = this.f18858i;
        if (c0Var != null) {
            i11 = c0Var.hashCode();
        }
        return i16 ^ i11;
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.a + ", eventCode=" + this.f18851b + ", complianceData=" + this.f18852c + ", eventUptimeMs=" + this.f18853d + ", sourceExtension=" + Arrays.toString(this.f18854e) + ", sourceExtensionJsonProto3=" + this.f18855f + ", timezoneOffsetSeconds=" + this.f18856g + ", networkConnectionInfo=" + this.f18857h + ", experimentIds=" + this.f18858i + "}";
    }
}
