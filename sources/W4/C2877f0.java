package w4;

/* renamed from: w4.f0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2877f0 {

    /* renamed from: a, reason: collision with root package name */
    public I0 f23858a;
    public String b;

    /* renamed from: c, reason: collision with root package name */
    public String f23859c;

    /* renamed from: d, reason: collision with root package name */
    public long f23860d;

    /* renamed from: e, reason: collision with root package name */
    public byte f23861e;

    public final C2879g0 a() {
        I0 i02;
        String str;
        String str2;
        if (this.f23861e == 1 && (i02 = this.f23858a) != null && (str = this.b) != null && (str2 = this.f23859c) != null) {
            return new C2879g0(i02, str, str2, this.f23860d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f23858a == null) {
            sb.append(" rolloutVariant");
        }
        if (this.b == null) {
            sb.append(" parameterKey");
        }
        if (this.f23859c == null) {
            sb.append(" parameterValue");
        }
        if ((1 & this.f23861e) == 0) {
            sb.append(" templateVersion");
        }
        throw new IllegalStateException(com.mbridge.msdk.foundation.entity.o.m(sb, "Missing required properties:"));
    }
}
