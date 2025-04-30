package w4;

import com.applovin.exoplayer2.common.base.Ascii;

/* loaded from: classes2.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    public int f23752a;
    public String b;

    /* renamed from: c, reason: collision with root package name */
    public int f23753c;

    /* renamed from: d, reason: collision with root package name */
    public long f23754d;

    /* renamed from: e, reason: collision with root package name */
    public long f23755e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f23756f;

    /* renamed from: g, reason: collision with root package name */
    public int f23757g;

    /* renamed from: h, reason: collision with root package name */
    public String f23758h;

    /* renamed from: i, reason: collision with root package name */
    public String f23759i;

    /* renamed from: j, reason: collision with root package name */
    public byte f23760j;

    public final O a() {
        String str;
        String str2;
        String str3;
        if (this.f23760j == 63 && (str = this.b) != null && (str2 = this.f23758h) != null && (str3 = this.f23759i) != null) {
            return new O(this.f23752a, str, this.f23753c, this.f23754d, this.f23755e, this.f23756f, this.f23757g, str2, str3);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f23760j & 1) == 0) {
            sb.append(" arch");
        }
        if (this.b == null) {
            sb.append(" model");
        }
        if ((this.f23760j & 2) == 0) {
            sb.append(" cores");
        }
        if ((this.f23760j & 4) == 0) {
            sb.append(" ram");
        }
        if ((this.f23760j & 8) == 0) {
            sb.append(" diskSpace");
        }
        if ((this.f23760j & Ascii.DLE) == 0) {
            sb.append(" simulator");
        }
        if ((this.f23760j & 32) == 0) {
            sb.append(" state");
        }
        if (this.f23758h == null) {
            sb.append(" manufacturer");
        }
        if (this.f23759i == null) {
            sb.append(" modelClass");
        }
        throw new IllegalStateException(com.mbridge.msdk.foundation.entity.o.m(sb, "Missing required properties:"));
    }
}
