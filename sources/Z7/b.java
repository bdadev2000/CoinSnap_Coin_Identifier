package z7;

import G7.j;
import Q7.n0;
import java.io.Serializable;
import u7.AbstractC2812c;

/* loaded from: classes3.dex */
public final class b extends AbstractC2812c implements InterfaceC2979a, Serializable {
    public final Enum[] b;

    public b(Enum[] enumArr) {
        this.b = enumArr;
    }

    private final Object writeReplace() {
        return new c(this.b);
    }

    @Override // u7.AbstractC2812c
    public final int b() {
        return this.b.length;
    }

    @Override // u7.AbstractC2812c, java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        Enum r02;
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r52 = (Enum) obj;
        j.e(r52, "element");
        int ordinal = r52.ordinal();
        Enum[] enumArr = this.b;
        j.e(enumArr, "<this>");
        if (ordinal >= 0 && ordinal < enumArr.length) {
            r02 = enumArr[ordinal];
        } else {
            r02 = null;
        }
        if (r02 != r52) {
            return false;
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i9) {
        Enum[] enumArr = this.b;
        int length = enumArr.length;
        if (i9 >= 0 && i9 < length) {
            return enumArr[i9];
        }
        throw new IndexOutOfBoundsException(n0.e(i9, length, "index: ", ", size: "));
    }

    @Override // u7.AbstractC2812c, java.util.List
    public final int indexOf(Object obj) {
        Enum r22;
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r52 = (Enum) obj;
        j.e(r52, "element");
        int ordinal = r52.ordinal();
        Enum[] enumArr = this.b;
        j.e(enumArr, "<this>");
        if (ordinal >= 0 && ordinal < enumArr.length) {
            r22 = enumArr[ordinal];
        } else {
            r22 = null;
        }
        if (r22 != r52) {
            return -1;
        }
        return ordinal;
    }

    @Override // u7.AbstractC2812c, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r22 = (Enum) obj;
        j.e(r22, "element");
        return indexOf(r22);
    }
}
