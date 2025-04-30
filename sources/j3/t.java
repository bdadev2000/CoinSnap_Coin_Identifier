package j3;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class t extends F {

    /* renamed from: a, reason: collision with root package name */
    public final long f21085a;
    public final Integer b;

    /* renamed from: c, reason: collision with root package name */
    public final B f21086c;

    /* renamed from: d, reason: collision with root package name */
    public final long f21087d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f21088e;

    /* renamed from: f, reason: collision with root package name */
    public final String f21089f;

    /* renamed from: g, reason: collision with root package name */
    public final long f21090g;

    /* renamed from: h, reason: collision with root package name */
    public final J f21091h;

    /* renamed from: i, reason: collision with root package name */
    public final C f21092i;

    public t(long j7, Integer num, p pVar, long j9, byte[] bArr, String str, long j10, w wVar, q qVar) {
        this.f21085a = j7;
        this.b = num;
        this.f21086c = pVar;
        this.f21087d = j9;
        this.f21088e = bArr;
        this.f21089f = str;
        this.f21090g = j10;
        this.f21091h = wVar;
        this.f21092i = qVar;
    }

    public final boolean equals(Object obj) {
        Integer num;
        B b;
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f9 = (F) obj;
        if (this.f21085a == ((t) f9).f21085a && ((num = this.b) != null ? num.equals(((t) f9).b) : ((t) f9).b == null) && ((b = this.f21086c) != null ? b.equals(((t) f9).f21086c) : ((t) f9).f21086c == null)) {
            t tVar = (t) f9;
            if (this.f21087d == tVar.f21087d) {
                if (f9 instanceof t) {
                    bArr = ((t) f9).f21088e;
                } else {
                    bArr = tVar.f21088e;
                }
                if (Arrays.equals(this.f21088e, bArr)) {
                    String str = tVar.f21089f;
                    String str2 = this.f21089f;
                    if (str2 != null ? str2.equals(str) : str == null) {
                        if (this.f21090g == tVar.f21090g) {
                            J j7 = tVar.f21091h;
                            J j9 = this.f21091h;
                            if (j9 != null ? j9.equals(j7) : j7 == null) {
                                C c9 = tVar.f21092i;
                                C c10 = this.f21092i;
                                if (c10 == null) {
                                    if (c9 == null) {
                                        return true;
                                    }
                                } else if (c10.equals(c9)) {
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
        long j7 = this.f21085a;
        int i9 = (((int) (j7 ^ (j7 >>> 32))) ^ 1000003) * 1000003;
        int i10 = 0;
        Integer num = this.b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i11 = (i9 ^ hashCode) * 1000003;
        B b = this.f21086c;
        if (b == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = b.hashCode();
        }
        int i12 = (i11 ^ hashCode2) * 1000003;
        long j9 = this.f21087d;
        int hashCode5 = (((i12 ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f21088e)) * 1000003;
        String str = this.f21089f;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i13 = (hashCode5 ^ hashCode3) * 1000003;
        long j10 = this.f21090g;
        int i14 = (i13 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        J j11 = this.f21091h;
        if (j11 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = j11.hashCode();
        }
        int i15 = (i14 ^ hashCode4) * 1000003;
        C c9 = this.f21092i;
        if (c9 != null) {
            i10 = c9.hashCode();
        }
        return i15 ^ i10;
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f21085a + ", eventCode=" + this.b + ", complianceData=" + this.f21086c + ", eventUptimeMs=" + this.f21087d + ", sourceExtension=" + Arrays.toString(this.f21088e) + ", sourceExtensionJsonProto3=" + this.f21089f + ", timezoneOffsetSeconds=" + this.f21090g + ", networkConnectionInfo=" + this.f21091h + ", experimentIds=" + this.f21092i + "}";
    }
}
