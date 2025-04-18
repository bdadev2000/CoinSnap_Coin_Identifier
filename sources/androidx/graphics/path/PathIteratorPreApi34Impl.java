package androidx.graphics.path;

import android.graphics.Path;
import dalvik.annotation.optimization.FastNative;

/* loaded from: classes.dex */
public final class PathIteratorPreApi34Impl extends PathIteratorImpl {
    private final native long createInternalPathIterator(Path path, int i2, float f2);

    private final native void destroyInternalPathIterator(long j2);

    @FastNative
    private final native boolean internalPathIteratorHasNext(long j2);

    @FastNative
    private final native int internalPathIteratorNext(long j2, float[] fArr, int i2);

    @FastNative
    private final native int internalPathIteratorPeek(long j2);

    @FastNative
    private final native int internalPathIteratorRawSize(long j2);

    @FastNative
    private final native int internalPathIteratorSize(long j2);

    public final void finalize() {
        destroyInternalPathIterator(0L);
    }
}
