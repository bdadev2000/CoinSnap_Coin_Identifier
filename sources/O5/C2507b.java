package o5;

import com.mbridge.msdk.foundation.entity.o;

/* renamed from: o5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2507b {

    /* renamed from: a, reason: collision with root package name */
    public String f21976a;
    public String b;

    /* renamed from: c, reason: collision with root package name */
    public String f21977c;

    /* renamed from: d, reason: collision with root package name */
    public String f21978d;

    /* renamed from: e, reason: collision with root package name */
    public long f21979e;

    /* renamed from: f, reason: collision with root package name */
    public byte f21980f;

    public final C2508c a() {
        if (this.f21980f == 1 && this.f21976a != null && this.b != null && this.f21977c != null && this.f21978d != null) {
            return new C2508c(this.f21976a, this.b, this.f21977c, this.f21978d, this.f21979e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f21976a == null) {
            sb.append(" rolloutId");
        }
        if (this.b == null) {
            sb.append(" variantId");
        }
        if (this.f21977c == null) {
            sb.append(" parameterKey");
        }
        if (this.f21978d == null) {
            sb.append(" parameterValue");
        }
        if ((1 & this.f21980f) == 0) {
            sb.append(" templateVersion");
        }
        throw new IllegalStateException(o.m(sb, "Missing required properties:"));
    }
}
