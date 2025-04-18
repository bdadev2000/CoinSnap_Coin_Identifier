package n9;

/* loaded from: classes3.dex */
public final class n {
    public final Object a;

    /* renamed from: b, reason: collision with root package name */
    public a4.g0 f22558b = new a4.g0(4);

    /* renamed from: c, reason: collision with root package name */
    public boolean f22559c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f22560d;

    public n(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            return this.a.equals(((n) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
