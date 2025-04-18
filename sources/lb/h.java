package lb;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name */
    public static final h f21308c = new h(0, 0);
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21309b;

    public h(int i10, int i11) {
        this.a = i10;
        this.f21309b = i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(h.class.getSimpleName());
        sb2.append("[position = ");
        sb2.append(this.a);
        sb2.append(", length = ");
        return vd.e.g(sb2, this.f21309b, "]");
    }
}
