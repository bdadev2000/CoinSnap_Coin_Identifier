package w4;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.List;

/* renamed from: w4.D, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2865D {

    /* renamed from: a, reason: collision with root package name */
    public int f23705a;
    public String b;

    /* renamed from: c, reason: collision with root package name */
    public int f23706c;

    /* renamed from: d, reason: collision with root package name */
    public int f23707d;

    /* renamed from: e, reason: collision with root package name */
    public long f23708e;

    /* renamed from: f, reason: collision with root package name */
    public long f23709f;

    /* renamed from: g, reason: collision with root package name */
    public long f23710g;

    /* renamed from: h, reason: collision with root package name */
    public String f23711h;

    /* renamed from: i, reason: collision with root package name */
    public List f23712i;

    /* renamed from: j, reason: collision with root package name */
    public byte f23713j;

    public final E a() {
        String str;
        if (this.f23713j == 63 && (str = this.b) != null) {
            return new E(this.f23705a, str, this.f23706c, this.f23707d, this.f23708e, this.f23709f, this.f23710g, this.f23711h, this.f23712i);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f23713j & 1) == 0) {
            sb.append(" pid");
        }
        if (this.b == null) {
            sb.append(" processName");
        }
        if ((this.f23713j & 2) == 0) {
            sb.append(" reasonCode");
        }
        if ((this.f23713j & 4) == 0) {
            sb.append(" importance");
        }
        if ((this.f23713j & 8) == 0) {
            sb.append(" pss");
        }
        if ((this.f23713j & Ascii.DLE) == 0) {
            sb.append(" rss");
        }
        if ((this.f23713j & 32) == 0) {
            sb.append(" timestamp");
        }
        throw new IllegalStateException(com.mbridge.msdk.foundation.entity.o.m(sb, "Missing required properties:"));
    }
}
