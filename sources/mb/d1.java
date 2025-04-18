package mb;

/* loaded from: classes3.dex */
public final class d1 {
    public String a;

    /* renamed from: b, reason: collision with root package name */
    public int f21894b;

    /* renamed from: c, reason: collision with root package name */
    public int f21895c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f21896d;

    /* renamed from: e, reason: collision with root package name */
    public byte f21897e;

    public final e1 a() {
        String str;
        if (this.f21897e == 7 && (str = this.a) != null) {
            return new e1(str, this.f21894b, this.f21895c, this.f21896d);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.a == null) {
            sb2.append(" processName");
        }
        if ((this.f21897e & 1) == 0) {
            sb2.append(" pid");
        }
        if ((this.f21897e & 2) == 0) {
            sb2.append(" importance");
        }
        if ((this.f21897e & 4) == 0) {
            sb2.append(" defaultProcess");
        }
        throw new IllegalStateException(vd.e.f("Missing required properties:", sb2));
    }
}
