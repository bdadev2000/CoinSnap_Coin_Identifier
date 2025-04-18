package s7;

/* loaded from: classes3.dex */
public final class o2 {

    /* renamed from: b, reason: collision with root package name */
    public static final o2 f24648b = new o2(false);
    public final boolean a;

    public o2(boolean z10) {
        this.a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o2.class == obj.getClass() && this.a == ((o2) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return !this.a ? 1 : 0;
    }
}
