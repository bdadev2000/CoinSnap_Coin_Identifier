package v8;

/* loaded from: classes3.dex */
public final class n0 {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f26214b;

    public n0(int i10, boolean z10) {
        this.a = i10;
        this.f26214b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n0.class != obj.getClass()) {
            return false;
        }
        n0 n0Var = (n0) obj;
        if (this.a == n0Var.a && this.f26214b == n0Var.f26214b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + (this.f26214b ? 1 : 0);
    }
}
