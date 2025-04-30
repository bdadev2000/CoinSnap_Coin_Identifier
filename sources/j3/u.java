package j3;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class u extends G {

    /* renamed from: a, reason: collision with root package name */
    public final long f21093a;
    public final long b;

    /* renamed from: c, reason: collision with root package name */
    public final z f21094c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f21095d;

    /* renamed from: e, reason: collision with root package name */
    public final String f21096e;

    /* renamed from: f, reason: collision with root package name */
    public final List f21097f;

    /* renamed from: g, reason: collision with root package name */
    public final K f21098g;

    public u(long j7, long j9, o oVar, Integer num, String str, ArrayList arrayList) {
        K k6 = K.b;
        this.f21093a = j7;
        this.b = j9;
        this.f21094c = oVar;
        this.f21095d = num;
        this.f21096e = str;
        this.f21097f = arrayList;
        this.f21098g = k6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g9 = (G) obj;
        if (this.f21093a == ((u) g9).f21093a) {
            u uVar = (u) g9;
            if (this.b == uVar.b) {
                z zVar = uVar.f21094c;
                z zVar2 = this.f21094c;
                if (zVar2 != null ? zVar2.equals(zVar) : zVar == null) {
                    Integer num = uVar.f21095d;
                    Integer num2 = this.f21095d;
                    if (num2 != null ? num2.equals(num) : num == null) {
                        String str = uVar.f21096e;
                        String str2 = this.f21096e;
                        if (str2 != null ? str2.equals(str) : str == null) {
                            List list = uVar.f21097f;
                            List list2 = this.f21097f;
                            if (list2 != null ? list2.equals(list) : list == null) {
                                K k6 = uVar.f21098g;
                                K k7 = this.f21098g;
                                if (k7 == null) {
                                    if (k6 == null) {
                                        return true;
                                    }
                                } else if (k7.equals(k6)) {
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
        long j7 = this.f21093a;
        long j9 = this.b;
        int i9 = (((((int) (j7 ^ (j7 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j9 >>> 32) ^ j9))) * 1000003;
        int i10 = 0;
        z zVar = this.f21094c;
        if (zVar == null) {
            hashCode = 0;
        } else {
            hashCode = zVar.hashCode();
        }
        int i11 = (i9 ^ hashCode) * 1000003;
        Integer num = this.f21095d;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i12 = (i11 ^ hashCode2) * 1000003;
        String str = this.f21096e;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i13 = (i12 ^ hashCode3) * 1000003;
        List list = this.f21097f;
        if (list == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = list.hashCode();
        }
        int i14 = (i13 ^ hashCode4) * 1000003;
        K k6 = this.f21098g;
        if (k6 != null) {
            i10 = k6.hashCode();
        }
        return i14 ^ i10;
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f21093a + ", requestUptimeMs=" + this.b + ", clientInfo=" + this.f21094c + ", logSource=" + this.f21095d + ", logSourceName=" + this.f21096e + ", logEvents=" + this.f21097f + ", qosTier=" + this.f21098g + "}";
    }
}
