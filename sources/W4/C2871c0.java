package w4;

import com.applovin.exoplayer2.common.base.Ascii;

/* renamed from: w4.c0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2871c0 {

    /* renamed from: a, reason: collision with root package name */
    public Double f23832a;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f23833c;

    /* renamed from: d, reason: collision with root package name */
    public int f23834d;

    /* renamed from: e, reason: collision with root package name */
    public long f23835e;

    /* renamed from: f, reason: collision with root package name */
    public long f23836f;

    /* renamed from: g, reason: collision with root package name */
    public byte f23837g;

    public final C2873d0 a() {
        if (this.f23837g != 31) {
            StringBuilder sb = new StringBuilder();
            if ((this.f23837g & 1) == 0) {
                sb.append(" batteryVelocity");
            }
            if ((this.f23837g & 2) == 0) {
                sb.append(" proximityOn");
            }
            if ((this.f23837g & 4) == 0) {
                sb.append(" orientation");
            }
            if ((this.f23837g & 8) == 0) {
                sb.append(" ramUsed");
            }
            if ((this.f23837g & Ascii.DLE) == 0) {
                sb.append(" diskUsed");
            }
            throw new IllegalStateException(com.mbridge.msdk.foundation.entity.o.m(sb, "Missing required properties:"));
        }
        return new C2873d0(this.f23832a, this.b, this.f23833c, this.f23834d, this.f23835e, this.f23836f);
    }
}
