package w4;

/* loaded from: classes2.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    public long f23769a;
    public String b;

    /* renamed from: c, reason: collision with root package name */
    public F0 f23770c;

    /* renamed from: d, reason: collision with root package name */
    public G0 f23771d;

    /* renamed from: e, reason: collision with root package name */
    public H0 f23772e;

    /* renamed from: f, reason: collision with root package name */
    public K0 f23773f;

    /* renamed from: g, reason: collision with root package name */
    public byte f23774g;

    public final Q a() {
        String str;
        F0 f0;
        G0 g02;
        if (this.f23774g == 1 && (str = this.b) != null && (f0 = this.f23770c) != null && (g02 = this.f23771d) != null) {
            return new Q(this.f23769a, str, f0, g02, this.f23772e, this.f23773f);
        }
        StringBuilder sb = new StringBuilder();
        if ((1 & this.f23774g) == 0) {
            sb.append(" timestamp");
        }
        if (this.b == null) {
            sb.append(" type");
        }
        if (this.f23770c == null) {
            sb.append(" app");
        }
        if (this.f23771d == null) {
            sb.append(" device");
        }
        throw new IllegalStateException(com.mbridge.msdk.foundation.entity.o.m(sb, "Missing required properties:"));
    }
}
