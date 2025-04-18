package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import java.util.ConcurrentModificationException;
import p0.a;

/* loaded from: classes3.dex */
public final class ArraySetKt {
    public static final void a(ArraySet arraySet, int i2) {
        a.s(arraySet, "<this>");
        arraySet.f1398a = new int[i2];
        arraySet.f1399b = new Object[i2];
    }

    public static final int b(ArraySet arraySet, Object obj, int i2) {
        a.s(arraySet, "<this>");
        int i3 = arraySet.f1400c;
        if (i3 == 0) {
            return -1;
        }
        try {
            int a2 = ContainerHelpersKt.a(arraySet.f1400c, i2, arraySet.f1398a);
            if (a2 < 0 || a.g(obj, arraySet.f1399b[a2])) {
                return a2;
            }
            int i4 = a2 + 1;
            while (i4 < i3 && arraySet.f1398a[i4] == i2) {
                if (a.g(obj, arraySet.f1399b[i4])) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = a2 - 1; i5 >= 0 && arraySet.f1398a[i5] == i2; i5--) {
                if (a.g(obj, arraySet.f1399b[i5])) {
                    return i5;
                }
            }
            return ~i4;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
