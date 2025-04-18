package androidx.core.graphics;

import android.graphics.Rect;
import java.util.Iterator;
import r0.a;

/* loaded from: classes3.dex */
public final class RegionKt$iterator$1 implements Iterator<Rect>, a {
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Rect next() {
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
