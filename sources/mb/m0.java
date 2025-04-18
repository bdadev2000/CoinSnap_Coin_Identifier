package mb;

import com.applovin.exoplayer2.common.base.Ascii;

/* loaded from: classes3.dex */
public final class m0 {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public String f22001b;

    /* renamed from: c, reason: collision with root package name */
    public int f22002c;

    /* renamed from: d, reason: collision with root package name */
    public long f22003d;

    /* renamed from: e, reason: collision with root package name */
    public long f22004e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f22005f;

    /* renamed from: g, reason: collision with root package name */
    public int f22006g;

    /* renamed from: h, reason: collision with root package name */
    public String f22007h;

    /* renamed from: i, reason: collision with root package name */
    public String f22008i;

    /* renamed from: j, reason: collision with root package name */
    public byte f22009j;

    public final n0 a() {
        String str;
        String str2;
        String str3;
        if (this.f22009j == 63 && (str = this.f22001b) != null && (str2 = this.f22007h) != null && (str3 = this.f22008i) != null) {
            return new n0(this.a, str, this.f22002c, this.f22003d, this.f22004e, this.f22005f, this.f22006g, str2, str3);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f22009j & 1) == 0) {
            sb2.append(" arch");
        }
        if (this.f22001b == null) {
            sb2.append(" model");
        }
        if ((this.f22009j & 2) == 0) {
            sb2.append(" cores");
        }
        if ((this.f22009j & 4) == 0) {
            sb2.append(" ram");
        }
        if ((this.f22009j & 8) == 0) {
            sb2.append(" diskSpace");
        }
        if ((this.f22009j & Ascii.DLE) == 0) {
            sb2.append(" simulator");
        }
        if ((this.f22009j & 32) == 0) {
            sb2.append(" state");
        }
        if (this.f22007h == null) {
            sb2.append(" manufacturer");
        }
        if (this.f22008i == null) {
            sb2.append(" modelClass");
        }
        throw new IllegalStateException(vd.e.f("Missing required properties:", sb2));
    }
}
