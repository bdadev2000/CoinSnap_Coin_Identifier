package i8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import t7.C2720i;
import u7.AbstractC2815f;
import u7.C2824o;

/* loaded from: classes3.dex */
public final class s implements Iterable, H7.a {
    public final String[] b;

    public s(String[] strArr) {
        this.b = strArr;
    }

    public final String b(String str) {
        G7.j.e(str, "name");
        String[] strArr = this.b;
        int length = strArr.length - 2;
        int p2 = R2.b.p(length, 0, -2);
        if (p2 <= length) {
            while (true) {
                int i9 = length - 2;
                if (str.equalsIgnoreCase(strArr[length])) {
                    return strArr[length + 1];
                }
                if (length == p2) {
                    break;
                }
                length = i9;
            }
        }
        return null;
    }

    public final String c(int i9) {
        return this.b[i9 * 2];
    }

    public final J1.k d() {
        J1.k kVar = new J1.k(3);
        ArrayList arrayList = kVar.f1526a;
        G7.j.e(arrayList, "<this>");
        String[] strArr = this.b;
        G7.j.e(strArr, "elements");
        arrayList.addAll(AbstractC2815f.t(strArr));
        return kVar;
    }

    public final String e(int i9) {
        return this.b[(i9 * 2) + 1];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            if (Arrays.equals(this.b, ((s) obj).b)) {
                return true;
            }
        }
        return false;
    }

    public final List f(String str) {
        G7.j.e(str, "name");
        int size = size();
        ArrayList arrayList = null;
        int i9 = 0;
        while (i9 < size) {
            int i10 = i9 + 1;
            if (str.equalsIgnoreCase(c(i9))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(e(i9));
            }
            i9 = i10;
        }
        if (arrayList != null) {
            List unmodifiableList = Collections.unmodifiableList(arrayList);
            G7.j.d(unmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
            return unmodifiableList;
        }
        return C2824o.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        C2720i[] c2720iArr = new C2720i[size];
        for (int i9 = 0; i9 < size; i9++) {
            c2720iArr[i9] = new C2720i(c(i9), e(i9));
        }
        return G7.j.h(c2720iArr);
    }

    public final int size() {
        return this.b.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        int i9 = 0;
        while (i9 < size) {
            int i10 = i9 + 1;
            String c9 = c(i9);
            String e4 = e(i9);
            sb.append(c9);
            sb.append(": ");
            if (j8.b.p(c9)) {
                e4 = "██";
            }
            sb.append(e4);
            sb.append("\n");
            i9 = i10;
        }
        String sb2 = sb.toString();
        G7.j.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
