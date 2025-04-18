package h7;

import java.util.List;

/* loaded from: classes3.dex */
public final class u extends g0 {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final long f18859b;

    /* renamed from: c, reason: collision with root package name */
    public final z f18860c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f18861d;

    /* renamed from: e, reason: collision with root package name */
    public final String f18862e;

    /* renamed from: f, reason: collision with root package name */
    public final List f18863f;

    /* renamed from: g, reason: collision with root package name */
    public final k0 f18864g;

    public u(long j3, long j10, z zVar, Integer num, String str, List list, k0 k0Var) {
        this.a = j3;
        this.f18859b = j10;
        this.f18860c = zVar;
        this.f18861d = num;
        this.f18862e = str;
        this.f18863f = list;
        this.f18864g = k0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        u uVar = (u) ((g0) obj);
        if (this.a == uVar.a) {
            if (this.f18859b == uVar.f18859b) {
                z zVar = uVar.f18860c;
                z zVar2 = this.f18860c;
                if (zVar2 != null ? zVar2.equals(zVar) : zVar == null) {
                    Integer num = uVar.f18861d;
                    Integer num2 = this.f18861d;
                    if (num2 != null ? num2.equals(num) : num == null) {
                        String str = uVar.f18862e;
                        String str2 = this.f18862e;
                        if (str2 != null ? str2.equals(str) : str == null) {
                            List list = uVar.f18863f;
                            List list2 = this.f18863f;
                            if (list2 != null ? list2.equals(list) : list == null) {
                                k0 k0Var = uVar.f18864g;
                                k0 k0Var2 = this.f18864g;
                                if (k0Var2 == null) {
                                    if (k0Var == null) {
                                        return true;
                                    }
                                } else if (k0Var2.equals(k0Var)) {
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
        long j10 = this.f18859b;
        int i10 = (((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003;
        int i11 = 0;
        z zVar = this.f18860c;
        if (zVar == null) {
            hashCode = 0;
        } else {
            hashCode = zVar.hashCode();
        }
        int i12 = (i10 ^ hashCode) * 1000003;
        Integer num = this.f18861d;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i13 = (i12 ^ hashCode2) * 1000003;
        String str = this.f18862e;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i14 = (i13 ^ hashCode3) * 1000003;
        List list = this.f18863f;
        if (list == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = list.hashCode();
        }
        int i15 = (i14 ^ hashCode4) * 1000003;
        k0 k0Var = this.f18864g;
        if (k0Var != null) {
            i11 = k0Var.hashCode();
        }
        return i15 ^ i11;
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.a + ", requestUptimeMs=" + this.f18859b + ", clientInfo=" + this.f18860c + ", logSource=" + this.f18861d + ", logSourceName=" + this.f18862e + ", logEvents=" + this.f18863f + ", qosTier=" + this.f18864g + "}";
    }
}
