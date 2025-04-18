package mb;

/* loaded from: classes3.dex */
public final class m1 {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public String f22010b;

    /* renamed from: c, reason: collision with root package name */
    public String f22011c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f22012d;

    /* renamed from: e, reason: collision with root package name */
    public byte f22013e;

    public final n1 a() {
        String str;
        String str2;
        if (this.f22013e == 3 && (str = this.f22010b) != null && (str2 = this.f22011c) != null) {
            return new n1(this.a, str, str2, this.f22012d);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f22013e & 1) == 0) {
            sb2.append(" platform");
        }
        if (this.f22010b == null) {
            sb2.append(" version");
        }
        if (this.f22011c == null) {
            sb2.append(" buildVersion");
        }
        if ((this.f22013e & 2) == 0) {
            sb2.append(" jailbroken");
        }
        throw new IllegalStateException(vd.e.f("Missing required properties:", sb2));
    }
}
