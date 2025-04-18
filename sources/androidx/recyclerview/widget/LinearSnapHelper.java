package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;

/* loaded from: classes3.dex */
public class LinearSnapHelper extends SnapHelper {

    /* renamed from: a, reason: collision with root package name */
    public OrientationHelper f21048a;

    /* renamed from: b, reason: collision with root package name */
    public OrientationHelper f21049b;

    public static View b(RecyclerView.LayoutManager layoutManager, OrientationHelper orientationHelper) {
        int childCount = layoutManager.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int l2 = (orientationHelper.l() / 2) + orientationHelper.k();
        int i2 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = layoutManager.getChildAt(i3);
            int abs = Math.abs(((orientationHelper.c(childAt) / 2) + orientationHelper.e(childAt)) - l2);
            if (abs < i2) {
                view = childAt;
                i2 = abs;
            }
        }
        return view;
    }

    public final int a(RecyclerView.LayoutManager layoutManager, OrientationHelper orientationHelper, int i2, int i3) {
        int[] calculateScrollDistance = calculateScrollDistance(i2, i3);
        int childCount = layoutManager.getChildCount();
        float f2 = 1.0f;
        if (childCount != 0) {
            View view = null;
            int i4 = Integer.MIN_VALUE;
            int i5 = Integer.MAX_VALUE;
            View view2 = null;
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = layoutManager.getChildAt(i6);
                int position = layoutManager.getPosition(childAt);
                if (position != -1) {
                    if (position < i5) {
                        view = childAt;
                        i5 = position;
                    }
                    if (position > i4) {
                        view2 = childAt;
                        i4 = position;
                    }
                }
            }
            if (view != null && view2 != null) {
                int max = Math.max(orientationHelper.b(view), orientationHelper.b(view2)) - Math.min(orientationHelper.e(view), orientationHelper.e(view2));
                if (max != 0) {
                    f2 = (max * 1.0f) / ((i4 - i5) + 1);
                }
            }
        }
        if (f2 <= 0.0f) {
            return 0;
        }
        return Math.round((Math.abs(calculateScrollDistance[0]) > Math.abs(calculateScrollDistance[1]) ? calculateScrollDistance[0] : calculateScrollDistance[1]) / f2);
    }

    public final OrientationHelper c(RecyclerView.LayoutManager layoutManager) {
        OrientationHelper orientationHelper = this.f21049b;
        if (orientationHelper == null || orientationHelper.f21052a != layoutManager) {
            this.f21049b = new OrientationHelper(layoutManager);
        }
        return this.f21049b;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public final int[] calculateDistanceToFinalSnap(RecyclerView.LayoutManager layoutManager, View view) {
        int[] iArr = new int[2];
        if (layoutManager.canScrollHorizontally()) {
            OrientationHelper c2 = c(layoutManager);
            iArr[0] = ((c2.c(view) / 2) + c2.e(view)) - ((c2.l() / 2) + c2.k());
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.canScrollVertically()) {
            OrientationHelper d = d(layoutManager);
            iArr[1] = ((d.c(view) / 2) + d.e(view)) - ((d.l() / 2) + d.k());
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public final OrientationHelper d(RecyclerView.LayoutManager layoutManager) {
        OrientationHelper orientationHelper = this.f21048a;
        if (orientationHelper == null || orientationHelper.f21052a != layoutManager) {
            this.f21048a = new OrientationHelper(layoutManager);
        }
        return this.f21048a;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public final View findSnapView(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager.canScrollVertically()) {
            return b(layoutManager, d(layoutManager));
        }
        if (layoutManager.canScrollHorizontally()) {
            return b(layoutManager, c(layoutManager));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.SnapHelper
    public final int findTargetSnapPosition(RecyclerView.LayoutManager layoutManager, int i2, int i3) {
        int itemCount;
        View findSnapView;
        int position;
        int i4;
        PointF computeScrollVectorForPosition;
        int i5;
        int i6;
        if (!(layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) || (itemCount = layoutManager.getItemCount()) == 0 || (findSnapView = findSnapView(layoutManager)) == null || (position = layoutManager.getPosition(findSnapView)) == -1 || (computeScrollVectorForPosition = ((RecyclerView.SmoothScroller.ScrollVectorProvider) layoutManager).computeScrollVectorForPosition(itemCount - 1)) == null) {
            return -1;
        }
        if (layoutManager.canScrollHorizontally()) {
            i5 = a(layoutManager, c(layoutManager), i2, 0);
            if (computeScrollVectorForPosition.x < 0.0f) {
                i5 = -i5;
            }
        } else {
            i5 = 0;
        }
        if (layoutManager.canScrollVertically()) {
            i6 = a(layoutManager, d(layoutManager), 0, i3);
            if (computeScrollVectorForPosition.y < 0.0f) {
                i6 = -i6;
            }
        } else {
            i6 = 0;
        }
        if (layoutManager.canScrollVertically()) {
            i5 = i6;
        }
        if (i5 == 0) {
            return -1;
        }
        int i7 = position + i5;
        int i8 = i7 >= 0 ? i7 : 0;
        return i8 >= itemCount ? i4 : i8;
    }
}
