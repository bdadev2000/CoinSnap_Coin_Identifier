package k3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f21424a;
    public final Integer b;

    /* renamed from: c, reason: collision with root package name */
    public final m f21425c;

    /* renamed from: d, reason: collision with root package name */
    public final long f21426d;

    /* renamed from: e, reason: collision with root package name */
    public final long f21427e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f21428f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f21429g;

    /* renamed from: h, reason: collision with root package name */
    public final String f21430h;

    /* renamed from: i, reason: collision with root package name */
    public final byte[] f21431i;

    /* renamed from: j, reason: collision with root package name */
    public final byte[] f21432j;

    public i(String str, Integer num, m mVar, long j7, long j9, Map map, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.f21424a = str;
        this.b = num;
        this.f21425c = mVar;
        this.f21426d = j7;
        this.f21427e = j9;
        this.f21428f = map;
        this.f21429g = num2;
        this.f21430h = str2;
        this.f21431i = bArr;
        this.f21432j = bArr2;
    }

    public final String a(String str) {
        String str2 = (String) this.f21428f.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f21428f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [k3.h, java.lang.Object] */
    public final h c() {
        ?? obj = new Object();
        String str = this.f21424a;
        if (str != null) {
            obj.f21415a = str;
            obj.b = this.b;
            obj.f21420g = this.f21429g;
            obj.f21421h = this.f21430h;
            obj.f21422i = this.f21431i;
            obj.f21423j = this.f21432j;
            m mVar = this.f21425c;
            if (mVar != null) {
                obj.f21416c = mVar;
                obj.f21417d = Long.valueOf(this.f21426d);
                obj.f21418e = Long.valueOf(this.f21427e);
                obj.f21419f = new HashMap(this.f21428f);
                return obj;
            }
            throw new NullPointerException("Null encodedPayload");
        }
        throw new NullPointerException("Null transportName");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f21424a.equals(iVar.f21424a)) {
            Integer num = iVar.b;
            Integer num2 = this.b;
            if (num2 != null ? num2.equals(num) : num == null) {
                if (this.f21425c.equals(iVar.f21425c) && this.f21426d == iVar.f21426d && this.f21427e == iVar.f21427e && this.f21428f.equals(iVar.f21428f)) {
                    Integer num3 = iVar.f21429g;
                    Integer num4 = this.f21429g;
                    if (num4 != null ? num4.equals(num3) : num3 == null) {
                        String str = iVar.f21430h;
                        String str2 = this.f21430h;
                        if (str2 != null ? str2.equals(str) : str == null) {
                            if (Arrays.equals(this.f21431i, iVar.f21431i) && Arrays.equals(this.f21432j, iVar.f21432j)) {
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
        int hashCode3 = (this.f21424a.hashCode() ^ 1000003) * 1000003;
        int i9 = 0;
        Integer num = this.b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode4 = (((hashCode3 ^ hashCode) * 1000003) ^ this.f21425c.hashCode()) * 1000003;
        long j7 = this.f21426d;
        int i10 = (hashCode4 ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003;
        long j9 = this.f21427e;
        int hashCode5 = (((i10 ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003) ^ this.f21428f.hashCode()) * 1000003;
        Integer num2 = this.f21429g;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int i11 = (hashCode5 ^ hashCode2) * 1000003;
        String str = this.f21430h;
        if (str != null) {
            i9 = str.hashCode();
        }
        return ((((i11 ^ i9) * 1000003) ^ Arrays.hashCode(this.f21431i)) * 1000003) ^ Arrays.hashCode(this.f21432j);
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f21424a + ", code=" + this.b + ", encodedPayload=" + this.f21425c + ", eventMillis=" + this.f21426d + ", uptimeMillis=" + this.f21427e + ", autoMetadata=" + this.f21428f + ", productId=" + this.f21429g + ", pseudonymousId=" + this.f21430h + ", experimentIdsClear=" + Arrays.toString(this.f21431i) + ", experimentIdsEncrypted=" + Arrays.toString(this.f21432j) + "}";
    }
}
