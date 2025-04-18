package androidx.compose.ui.text.android.selection;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes3.dex */
public abstract class GraphemeClusterSegmentFinder implements SegmentFinder {
    @Override // androidx.compose.ui.text.android.selection.SegmentFinder
    public final int a(int i2) {
        int e = e(i2);
        if (e == -1 || e(e) == -1) {
            return -1;
        }
        return e;
    }

    @Override // androidx.compose.ui.text.android.selection.SegmentFinder
    public final int b(int i2) {
        return f(i2);
    }

    @Override // androidx.compose.ui.text.android.selection.SegmentFinder
    public final int c(int i2) {
        return e(i2);
    }

    @Override // androidx.compose.ui.text.android.selection.SegmentFinder
    public final int d(int i2) {
        int f2 = f(i2);
        if (f2 == -1 || f(f2) == -1) {
            return -1;
        }
        return f2;
    }

    public abstract int e(int i2);

    public abstract int f(int i2);
}
