package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;

/* loaded from: classes.dex */
public abstract class OrientationHelper {
    public static final int HORIZONTAL = 0;
    private static final int INVALID_SIZE = Integer.MIN_VALUE;
    public static final int VERTICAL = 1;
    private int mLastTotalSpace;
    protected final W mLayoutManager;
    final Rect mTmpRect;

    public /* synthetic */ OrientationHelper(W w2, C c9) {
        this(w2);
    }

    public static OrientationHelper createHorizontalHelper(W w2) {
        return new OrientationHelper(w2, null);
    }

    public static OrientationHelper createOrientationHelper(W w2, int i9) {
        if (i9 != 0) {
            if (i9 == 1) {
                return createVerticalHelper(w2);
            }
            throw new IllegalArgumentException("invalid orientation");
        }
        return createHorizontalHelper(w2);
    }

    public static OrientationHelper createVerticalHelper(W w2) {
        return new OrientationHelper(w2, null);
    }

    public abstract int getDecoratedEnd(View view);

    public abstract int getDecoratedMeasurement(View view);

    public abstract int getDecoratedMeasurementInOther(View view);

    public abstract int getDecoratedStart(View view);

    public abstract int getEnd();

    public abstract int getEndAfterPadding();

    public abstract int getEndPadding();

    public W getLayoutManager() {
        return this.mLayoutManager;
    }

    public abstract int getMode();

    public abstract int getModeInOther();

    public abstract int getStartAfterPadding();

    public abstract int getTotalSpace();

    public int getTotalSpaceChange() {
        if (Integer.MIN_VALUE == this.mLastTotalSpace) {
            return 0;
        }
        return getTotalSpace() - this.mLastTotalSpace;
    }

    public abstract int getTransformedEndWithDecoration(View view);

    public abstract int getTransformedStartWithDecoration(View view);

    public abstract void offsetChild(View view, int i9);

    public abstract void offsetChildren(int i9);

    public void onLayoutComplete() {
        this.mLastTotalSpace = getTotalSpace();
    }

    private OrientationHelper(W w2) {
        this.mLastTotalSpace = Integer.MIN_VALUE;
        this.mTmpRect = new Rect();
        this.mLayoutManager = w2;
    }
}
