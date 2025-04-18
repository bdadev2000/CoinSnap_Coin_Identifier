package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;

/* loaded from: classes.dex */
public abstract class OrientationHelper {
    public static final int HORIZONTAL = 0;
    private static final int INVALID_SIZE = Integer.MIN_VALUE;
    public static final int VERTICAL = 1;
    private int mLastTotalSpace;
    protected final v0 mLayoutManager;
    final Rect mTmpRect;

    public /* synthetic */ OrientationHelper(v0 v0Var, c0 c0Var) {
        this(v0Var);
    }

    public static OrientationHelper createHorizontalHelper(v0 v0Var) {
        return new c0(v0Var);
    }

    public static OrientationHelper createOrientationHelper(v0 v0Var, int i10) {
        if (i10 != 0) {
            if (i10 == 1) {
                return createVerticalHelper(v0Var);
            }
            throw new IllegalArgumentException("invalid orientation");
        }
        return createHorizontalHelper(v0Var);
    }

    public static OrientationHelper createVerticalHelper(v0 v0Var) {
        return new d0(v0Var);
    }

    public abstract int getDecoratedEnd(View view);

    public abstract int getDecoratedMeasurement(View view);

    public abstract int getDecoratedMeasurementInOther(View view);

    public abstract int getDecoratedStart(View view);

    public abstract int getEnd();

    public abstract int getEndAfterPadding();

    public abstract int getEndPadding();

    public v0 getLayoutManager() {
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

    public abstract void offsetChild(View view, int i10);

    public abstract void offsetChildren(int i10);

    public void onLayoutComplete() {
        this.mLastTotalSpace = getTotalSpace();
    }

    private OrientationHelper(v0 v0Var) {
        this.mLastTotalSpace = Integer.MIN_VALUE;
        this.mTmpRect = new Rect();
        this.mLayoutManager = v0Var;
    }
}
