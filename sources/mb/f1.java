package mb;

import com.applovin.exoplayer2.common.base.Ascii;

/* loaded from: classes3.dex */
public final class f1 {
    public Double a;

    /* renamed from: b, reason: collision with root package name */
    public int f21908b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f21909c;

    /* renamed from: d, reason: collision with root package name */
    public int f21910d;

    /* renamed from: e, reason: collision with root package name */
    public long f21911e;

    /* renamed from: f, reason: collision with root package name */
    public long f21912f;

    /* renamed from: g, reason: collision with root package name */
    public byte f21913g;

    public final g1 a() {
        if (this.f21913g != 31) {
            StringBuilder sb2 = new StringBuilder();
            if ((this.f21913g & 1) == 0) {
                sb2.append(" batteryVelocity");
            }
            if ((this.f21913g & 2) == 0) {
                sb2.append(" proximityOn");
            }
            if ((this.f21913g & 4) == 0) {
                sb2.append(" orientation");
            }
            if ((this.f21913g & 8) == 0) {
                sb2.append(" ramUsed");
            }
            if ((this.f21913g & Ascii.DLE) == 0) {
                sb2.append(" diskUsed");
            }
            throw new IllegalStateException(vd.e.f("Missing required properties:", sb2));
        }
        return new g1(this.a, this.f21908b, this.f21909c, this.f21910d, this.f21911e, this.f21912f);
    }
}
