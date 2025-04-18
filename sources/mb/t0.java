package mb;

/* loaded from: classes3.dex */
public final class t0 {
    public long a;

    /* renamed from: b, reason: collision with root package name */
    public long f22102b;

    /* renamed from: c, reason: collision with root package name */
    public String f22103c;

    /* renamed from: d, reason: collision with root package name */
    public String f22104d;

    /* renamed from: e, reason: collision with root package name */
    public byte f22105e;

    public final u0 a() {
        String str;
        if (this.f22105e == 3 && (str = this.f22103c) != null) {
            return new u0(this.a, this.f22102b, str, this.f22104d);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f22105e & 1) == 0) {
            sb2.append(" baseAddress");
        }
        if ((this.f22105e & 2) == 0) {
            sb2.append(" size");
        }
        if (this.f22103c == null) {
            sb2.append(" name");
        }
        throw new IllegalStateException(vd.e.f("Missing required properties:", sb2));
    }
}
