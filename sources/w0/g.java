package w0;

/* loaded from: classes2.dex */
public final class g extends e {
    public static final g d = new e(1, 0, 1);

    public final boolean c(int i2) {
        return this.f31406a <= i2 && i2 <= this.f31407b;
    }

    @Override // w0.e
    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            if (!isEmpty() || !((g) obj).isEmpty()) {
                g gVar = (g) obj;
                if (this.f31406a == gVar.f31406a) {
                    if (this.f31407b == gVar.f31407b) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // w0.e
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f31406a * 31) + this.f31407b;
    }

    @Override // w0.e
    public final boolean isEmpty() {
        return this.f31406a > this.f31407b;
    }

    @Override // w0.e
    public final String toString() {
        return this.f31406a + ".." + this.f31407b;
    }
}
