package androidx.datastore.preferences.protobuf;

import java.io.Serializable;
import java.util.Iterator;

/* renamed from: androidx.datastore.preferences.protobuf.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0432g implements Iterable, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final C0432g f4560d = new C0432g(AbstractC0449y.b);

    /* renamed from: f, reason: collision with root package name */
    public static final C0431f f4561f;
    private static final long serialVersionUID = 1;
    public int b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f4562c;

    static {
        C0431f c0431f;
        if (AbstractC0428c.a()) {
            c0431f = new C0431f(1);
        } else {
            c0431f = new C0431f(0);
        }
        f4561f = c0431f;
    }

    public C0432g(byte[] bArr) {
        bArr.getClass();
        this.f4562c = bArr;
    }

    public static C0432g c(int i9, int i10, byte[] bArr) {
        int i11 = i9 + i10;
        int length = bArr.length;
        if (((i11 - i9) | i9 | i11 | (length - i11)) < 0) {
            if (i9 >= 0) {
                if (i11 < i9) {
                    throw new IndexOutOfBoundsException(Q7.n0.e(i9, i11, "Beginning index larger than ending index: ", ", "));
                }
                throw new IndexOutOfBoundsException(Q7.n0.e(i11, length, "End index: ", " >= "));
            }
            throw new IndexOutOfBoundsException(Q7.n0.f(i9, "Beginning index: ", " < 0"));
        }
        return new C0432g(f4561f.a(bArr, i9, i10));
    }

    public byte b(int i9) {
        return this.f4562c[i9];
    }

    public int d() {
        return 0;
    }

    public byte e(int i9) {
        return this.f4562c[i9];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0432g) || size() != ((C0432g) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof C0432g) {
            C0432g c0432g = (C0432g) obj;
            int i9 = this.b;
            int i10 = c0432g.b;
            if (i9 != 0 && i10 != 0 && i9 != i10) {
                return false;
            }
            int size = size();
            if (size <= c0432g.size()) {
                if (size <= c0432g.size()) {
                    int d2 = d() + size;
                    int d9 = d();
                    int d10 = c0432g.d();
                    while (d9 < d2) {
                        if (this.f4562c[d9] != c0432g.f4562c[d10]) {
                            return false;
                        }
                        d9++;
                        d10++;
                    }
                    return true;
                }
                StringBuilder p2 = Q7.n0.p(size, "Ran off end of other: 0, ", ", ");
                p2.append(c0432g.size());
                throw new IllegalArgumentException(p2.toString());
            }
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        return obj.equals(this);
    }

    public final int hashCode() {
        int i9 = this.b;
        if (i9 == 0) {
            int size = size();
            int d2 = d();
            int i10 = size;
            for (int i11 = d2; i11 < d2 + size; i11++) {
                i10 = (i10 * 31) + this.f4562c[i11];
            }
            if (i10 == 0) {
                i9 = 1;
            } else {
                i9 = i10;
            }
            this.b = i9;
        }
        return i9;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0430e(this);
    }

    public int size() {
        return this.f4562c.length;
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }
}
