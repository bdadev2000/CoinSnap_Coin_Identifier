package w4;

/* renamed from: w4.a0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2867a0 {

    /* renamed from: a, reason: collision with root package name */
    public String f23814a;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public int f23815c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f23816d;

    /* renamed from: e, reason: collision with root package name */
    public byte f23817e;

    public final C2869b0 a() {
        String str;
        if (this.f23817e == 7 && (str = this.f23814a) != null) {
            return new C2869b0(str, this.b, this.f23815c, this.f23816d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f23814a == null) {
            sb.append(" processName");
        }
        if ((this.f23817e & 1) == 0) {
            sb.append(" pid");
        }
        if ((this.f23817e & 2) == 0) {
            sb.append(" importance");
        }
        if ((this.f23817e & 4) == 0) {
            sb.append(" defaultProcess");
        }
        throw new IllegalStateException(com.mbridge.msdk.foundation.entity.o.m(sb, "Missing required properties:"));
    }
}
