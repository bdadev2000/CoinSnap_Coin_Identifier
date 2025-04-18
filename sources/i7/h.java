package i7;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class h {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f19169b;

    /* renamed from: c, reason: collision with root package name */
    public final l f19170c;

    /* renamed from: d, reason: collision with root package name */
    public final long f19171d;

    /* renamed from: e, reason: collision with root package name */
    public final long f19172e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f19173f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f19174g;

    /* renamed from: h, reason: collision with root package name */
    public final String f19175h;

    /* renamed from: i, reason: collision with root package name */
    public final byte[] f19176i;

    /* renamed from: j, reason: collision with root package name */
    public final byte[] f19177j;

    public h(String str, Integer num, l lVar, long j3, long j10, Map map, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.a = str;
        this.f19169b = num;
        this.f19170c = lVar;
        this.f19171d = j3;
        this.f19172e = j10;
        this.f19173f = map;
        this.f19174g = num2;
        this.f19175h = str2;
        this.f19176i = bArr;
        this.f19177j = bArr2;
    }

    public final String a(String str) {
        String str2 = (String) this.f19173f.get(str);
        return str2 == null ? "" : str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f19173f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final u2.l c() {
        u2.l lVar = new u2.l();
        lVar.t(this.a);
        lVar.f25469b = this.f19169b;
        lVar.f25474g = this.f19174g;
        lVar.f25475h = this.f19175h;
        lVar.f25476i = this.f19176i;
        lVar.f25477j = this.f19177j;
        lVar.p(this.f19170c);
        lVar.f25471d = Long.valueOf(this.f19171d);
        lVar.f25472e = Long.valueOf(this.f19172e);
        lVar.f25473f = new HashMap(this.f19173f);
        return lVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.a.equals(hVar.a)) {
            Integer num = hVar.f19169b;
            Integer num2 = this.f19169b;
            if (num2 != null ? num2.equals(num) : num == null) {
                if (this.f19170c.equals(hVar.f19170c) && this.f19171d == hVar.f19171d && this.f19172e == hVar.f19172e && this.f19173f.equals(hVar.f19173f)) {
                    Integer num3 = hVar.f19174g;
                    Integer num4 = this.f19174g;
                    if (num4 != null ? num4.equals(num3) : num3 == null) {
                        String str = hVar.f19175h;
                        String str2 = this.f19175h;
                        if (str2 != null ? str2.equals(str) : str == null) {
                            if (Arrays.equals(this.f19176i, hVar.f19176i) && Arrays.equals(this.f19177j, hVar.f19177j)) {
                                return true;
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
        int hashCode3 = (this.a.hashCode() ^ 1000003) * 1000003;
        int i10 = 0;
        Integer num = this.f19169b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode4 = (((hashCode3 ^ hashCode) * 1000003) ^ this.f19170c.hashCode()) * 1000003;
        long j3 = this.f19171d;
        int i11 = (hashCode4 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        long j10 = this.f19172e;
        int hashCode5 = (((i11 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f19173f.hashCode()) * 1000003;
        Integer num2 = this.f19174g;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int i12 = (hashCode5 ^ hashCode2) * 1000003;
        String str = this.f19175h;
        if (str != null) {
            i10 = str.hashCode();
        }
        return ((((i12 ^ i10) * 1000003) ^ Arrays.hashCode(this.f19176i)) * 1000003) ^ Arrays.hashCode(this.f19177j);
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.a + ", code=" + this.f19169b + ", encodedPayload=" + this.f19170c + ", eventMillis=" + this.f19171d + ", uptimeMillis=" + this.f19172e + ", autoMetadata=" + this.f19173f + ", productId=" + this.f19174g + ", pseudonymousId=" + this.f19175h + ", experimentIdsClear=" + Arrays.toString(this.f19176i) + ", experimentIdsEncrypted=" + Arrays.toString(this.f19177j) + "}";
    }
}
