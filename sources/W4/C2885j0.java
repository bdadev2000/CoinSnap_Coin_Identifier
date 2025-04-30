package w4;

/* renamed from: w4.j0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2885j0 {

    /* renamed from: a, reason: collision with root package name */
    public int f23894a;
    public String b;

    /* renamed from: c, reason: collision with root package name */
    public String f23895c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f23896d;

    /* renamed from: e, reason: collision with root package name */
    public byte f23897e;

    public final C2887k0 a() {
        String str;
        String str2;
        if (this.f23897e == 3 && (str = this.b) != null && (str2 = this.f23895c) != null) {
            return new C2887k0(this.f23894a, str, str2, this.f23896d);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f23897e & 1) == 0) {
            sb.append(" platform");
        }
        if (this.b == null) {
            sb.append(" version");
        }
        if (this.f23895c == null) {
            sb.append(" buildVersion");
        }
        if ((this.f23897e & 2) == 0) {
            sb.append(" jailbroken");
        }
        throw new IllegalStateException(com.mbridge.msdk.foundation.entity.o.m(sb, "Missing required properties:"));
    }
}
