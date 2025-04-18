package ta;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import v8.u0;

/* loaded from: classes3.dex */
public final class a extends AbstractList implements RandomAccess, Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f25375b;

    /* renamed from: c, reason: collision with root package name */
    public final int f25376c;

    /* renamed from: d, reason: collision with root package name */
    public final int f25377d;

    public a(int[] iArr, int i10, int i11) {
        this.f25375b = iArr;
        this.f25376c = i10;
        this.f25377d = i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i10 = this.f25376c;
            while (true) {
                if (i10 < this.f25377d) {
                    if (this.f25375b[i10] == intValue) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 != -1) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            int i10 = this.f25377d;
            int i11 = this.f25376c;
            int i12 = i10 - i11;
            if (aVar.f25377d - aVar.f25376c != i12) {
                return false;
            }
            for (int i13 = 0; i13 < i12; i13++) {
                if (this.f25375b[i11 + i13] != aVar.f25375b[aVar.f25376c + i13]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        int i11 = this.f25377d;
        int i12 = this.f25376c;
        u0.g(i10, i11 - i12);
        return Integer.valueOf(this.f25375b[i12 + i10]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = this.f25376c; i11 < this.f25377d; i11++) {
            i10 = (i10 * 31) + this.f25375b[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i10 = this.f25376c;
            int i11 = i10;
            while (true) {
                if (i11 < this.f25377d) {
                    if (this.f25375b[i11] == intValue) {
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 >= 0) {
                return i11 - i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int i10;
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i11 = this.f25377d - 1;
            while (true) {
                i10 = this.f25376c;
                if (i11 >= i10) {
                    if (this.f25375b[i11] == intValue) {
                        break;
                    }
                    i11--;
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 >= 0) {
                return i11 - i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        Integer num = (Integer) obj;
        int i11 = this.f25377d;
        int i12 = this.f25376c;
        u0.g(i10, i11 - i12);
        int i13 = i12 + i10;
        int[] iArr = this.f25375b;
        int i14 = iArr[i13];
        num.getClass();
        iArr[i13] = num.intValue();
        return Integer.valueOf(i14);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f25377d - this.f25376c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i10, int i11) {
        int i12 = this.f25377d;
        int i13 = this.f25376c;
        u0.l(i10, i11, i12 - i13);
        if (i10 == i11) {
            return Collections.emptyList();
        }
        return new a(this.f25375b, i10 + i13, i13 + i11);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        int i10 = this.f25377d;
        int i11 = this.f25376c;
        StringBuilder sb2 = new StringBuilder((i10 - i11) * 5);
        sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
        int[] iArr = this.f25375b;
        sb2.append(iArr[i11]);
        while (true) {
            i11++;
            if (i11 < i10) {
                sb2.append(", ");
                sb2.append(iArr[i11]);
            } else {
                sb2.append(AbstractJsonLexerKt.END_LIST);
                return sb2.toString();
            }
        }
    }
}
