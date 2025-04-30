package w4;

/* loaded from: classes2.dex */
public final class Y {

    /* renamed from: a, reason: collision with root package name */
    public long f23802a;
    public String b;

    /* renamed from: c, reason: collision with root package name */
    public String f23803c;

    /* renamed from: d, reason: collision with root package name */
    public long f23804d;

    /* renamed from: e, reason: collision with root package name */
    public int f23805e;

    /* renamed from: f, reason: collision with root package name */
    public byte f23806f;

    public final Z a() {
        String str;
        if (this.f23806f == 7 && (str = this.b) != null) {
            return new Z(this.f23802a, str, this.f23803c, this.f23804d, this.f23805e);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f23806f & 1) == 0) {
            sb.append(" pc");
        }
        if (this.b == null) {
            sb.append(" symbol");
        }
        if ((this.f23806f & 2) == 0) {
            sb.append(" offset");
        }
        if ((this.f23806f & 4) == 0) {
            sb.append(" importance");
        }
        throw new IllegalStateException(com.mbridge.msdk.foundation.entity.o.m(sb, "Missing required properties:"));
    }
}
