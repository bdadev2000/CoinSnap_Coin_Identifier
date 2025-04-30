package L7;

import java.util.Iterator;

/* loaded from: classes3.dex */
public class a implements Iterable, H7.a {
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1830c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1831d;

    public a(int i9, int i10, int i11) {
        if (i11 != 0) {
            if (i11 != Integer.MIN_VALUE) {
                this.b = i9;
                this.f1830c = R2.b.p(i9, i10, i11);
                this.f1831d = i11;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            if (!isEmpty() || !((a) obj).isEmpty()) {
                a aVar = (a) obj;
                if (this.b != aVar.b || this.f1830c != aVar.f1830c || this.f1831d != aVar.f1831d) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.b * 31) + this.f1830c) * 31) + this.f1831d;
    }

    public boolean isEmpty() {
        int i9 = this.f1831d;
        int i10 = this.f1830c;
        int i11 = this.b;
        if (i9 > 0) {
            if (i11 <= i10) {
                return false;
            }
        } else if (i11 >= i10) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new b(this.b, this.f1830c, this.f1831d);
    }

    public String toString() {
        StringBuilder sb;
        int i9 = this.f1830c;
        int i10 = this.b;
        int i11 = this.f1831d;
        if (i11 > 0) {
            sb = new StringBuilder();
            sb.append(i10);
            sb.append("..");
            sb.append(i9);
            sb.append(" step ");
            sb.append(i11);
        } else {
            sb = new StringBuilder();
            sb.append(i10);
            sb.append(" downTo ");
            sb.append(i9);
            sb.append(" step ");
            sb.append(-i11);
        }
        return sb.toString();
    }
}
