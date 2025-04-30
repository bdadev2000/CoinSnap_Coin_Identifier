package L7;

/* loaded from: classes3.dex */
public final class c extends a {

    /* renamed from: f, reason: collision with root package name */
    public static final c f1835f = new a(1, 0, 1);

    public final boolean b(int i9) {
        if (this.b <= i9 && i9 <= this.f1830c) {
            return true;
        }
        return false;
    }

    @Override // L7.a
    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (this.b == cVar.b) {
                    if (this.f1830c == cVar.f1830c) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // L7.a
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.b * 31) + this.f1830c;
    }

    @Override // L7.a
    public final boolean isEmpty() {
        if (this.b > this.f1830c) {
            return true;
        }
        return false;
    }

    @Override // L7.a
    public final String toString() {
        return this.b + ".." + this.f1830c;
    }
}
