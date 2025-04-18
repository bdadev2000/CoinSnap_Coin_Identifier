package androidx.compose.runtime.collection;

import android.support.v4.media.d;
import java.util.List;

/* loaded from: classes2.dex */
public final class MutableVectorKt {
    public static final void a(int i2, List list) {
        int size = list.size();
        if (i2 < 0 || i2 >= size) {
            throw new IndexOutOfBoundsException(d.l("Index ", i2, " is out of bounds. The list has ", size, " elements."));
        }
    }

    public static final void b(int i2, int i3, List list) {
        int size = list.size();
        if (i2 > i3) {
            throw new IllegalArgumentException(d.l("Indices are out of order. fromIndex (", i2, ") is greater than toIndex (", i3, ")."));
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException(d.j("fromIndex (", i2, ") is less than 0."));
        }
        if (i3 <= size) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i3 + ") is more than than the list size (" + size + ')');
    }
}
