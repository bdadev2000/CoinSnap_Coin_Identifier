package w4;

import java.util.List;

/* loaded from: classes2.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    public String f23727a;
    public String b;

    /* renamed from: c, reason: collision with root package name */
    public String f23728c;

    /* renamed from: d, reason: collision with root package name */
    public long f23729d;

    /* renamed from: e, reason: collision with root package name */
    public Long f23730e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f23731f;

    /* renamed from: g, reason: collision with root package name */
    public w0 f23732g;

    /* renamed from: h, reason: collision with root package name */
    public N0 f23733h;

    /* renamed from: i, reason: collision with root package name */
    public M0 f23734i;

    /* renamed from: j, reason: collision with root package name */
    public x0 f23735j;

    /* renamed from: k, reason: collision with root package name */
    public List f23736k;
    public int l;
    public byte m;

    public final K a() {
        String str;
        String str2;
        w0 w0Var;
        if (this.m == 7 && (str = this.f23727a) != null && (str2 = this.b) != null && (w0Var = this.f23732g) != null) {
            return new K(str, str2, this.f23728c, this.f23729d, this.f23730e, this.f23731f, w0Var, this.f23733h, this.f23734i, this.f23735j, this.f23736k, this.l);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f23727a == null) {
            sb.append(" generator");
        }
        if (this.b == null) {
            sb.append(" identifier");
        }
        if ((this.m & 1) == 0) {
            sb.append(" startedAt");
        }
        if ((this.m & 2) == 0) {
            sb.append(" crashed");
        }
        if (this.f23732g == null) {
            sb.append(" app");
        }
        if ((this.m & 4) == 0) {
            sb.append(" generatorType");
        }
        throw new IllegalStateException(com.mbridge.msdk.foundation.entity.o.m(sb, "Missing required properties:"));
    }
}
