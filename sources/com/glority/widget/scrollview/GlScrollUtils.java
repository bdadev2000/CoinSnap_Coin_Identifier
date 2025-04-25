package com.glority.widget.scrollview;

import android.graphics.Rect;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import androidx.core.view.ScrollingView;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.glority.widget.scrollview.GlNestedScrollView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes12.dex */
public class GlScrollUtils {
    private static final Rect mBounds = new Rect();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public static int computeVerticalScrollOffset(View view) {
        View scrolledView = getScrolledView(view);
        if (scrolledView instanceof ScrollingView) {
            return ((ScrollingView) scrolledView).computeVerticalScrollOffset();
        }
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeVerticalScrollOffset", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(scrolledView, new Object[0]);
            if (invoke != null) {
                return ((Integer) invoke).intValue();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return scrolledView.getScrollY();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public static int computeVerticalScrollRange(View view) {
        View scrolledView = getScrolledView(view);
        if (scrolledView instanceof ScrollingView) {
            return ((ScrollingView) scrolledView).computeVerticalScrollRange();
        }
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeVerticalScrollRange", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(scrolledView, new Object[0]);
            if (invoke != null) {
                return ((Integer) invoke).intValue();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return scrolledView.getHeight();
    }

    /* JADX WARN: Multi-variable type inference failed */
    static int computeVerticalScrollExtent(View view) {
        View scrolledView = getScrolledView(view);
        if (scrolledView instanceof ScrollingView) {
            return ((ScrollingView) scrolledView).computeVerticalScrollExtent();
        }
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeVerticalScrollExtent", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(scrolledView, new Object[0]);
            if (invoke != null) {
                return ((Integer) invoke).intValue();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return scrolledView.getHeight();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int getScrollTopOffset(View view) {
        if (isCoordinateScrollerChild(view) && canScrollVertically(view, -1)) {
            return Math.min(-computeVerticalScrollOffset(view), -1);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int getScrollBottomOffset(View view) {
        if (isCoordinateScrollerChild(view) && canScrollVertically(view, 1)) {
            return Math.max((computeVerticalScrollRange(view) - computeVerticalScrollOffset(view)) - computeVerticalScrollExtent(view), 1);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean canScrollHorizontally(View view) {
        return isCoordinateScrollerChild(view) && (view.canScrollHorizontally(1) || view.canScrollHorizontally(-1));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean canScrollVertically(View view) {
        return isCoordinateScrollerChild(view) && (canScrollVertically(view, 1) || canScrollVertically(view, -1));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean canScrollVertically(View view, int i) {
        View scrolledView = getScrolledView(view);
        if (scrolledView.getVisibility() == 8) {
            return false;
        }
        if (scrolledView instanceof AbsListView) {
            return ((AbsListView) scrolledView).canScrollList(i);
        }
        if (scrolledView instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) scrolledView;
            if ((recyclerView.canScrollHorizontally(1) || recyclerView.canScrollHorizontally(-1)) && !recyclerView.canScrollVertically(i)) {
                return false;
            }
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (layoutManager != null && adapter != null && adapter.getItemCount() > 0) {
                if (layoutManager.findViewByPosition(i > 0 ? adapter.getItemCount() - 1 : 0) == null) {
                    return true;
                }
                int childCount = recyclerView.getChildCount();
                if (i > 0) {
                    for (int i2 = childCount - 1; i2 >= 0; i2--) {
                        View childAt = recyclerView.getChildAt(i2);
                        Rect rect = mBounds;
                        recyclerView.getDecoratedBoundsWithMargins(childAt, rect);
                        if (rect.bottom > recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                            return true;
                        }
                    }
                    return false;
                }
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt2 = recyclerView.getChildAt(i3);
                    Rect rect2 = mBounds;
                    recyclerView.getDecoratedBoundsWithMargins(childAt2, rect2);
                    if (rect2.top < recyclerView.getPaddingTop()) {
                        return true;
                    }
                }
            }
            return false;
        }
        return scrolledView.canScrollVertically(i);
    }

    static List<View> getTouchViews(View view, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        addTouchViews(arrayList, view, i, i2);
        return arrayList;
    }

    private static void addTouchViews(List<View> list, View view, int i, int i2) {
        if (isCoordinateScrollerChild(view) && isTouchPointInView(view, i, i2)) {
            list.add(view);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    addTouchViews(list, viewGroup.getChildAt(i3), i, i2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isTouchPointInView(View view, int i, int i2) {
        if (view == null) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i3 = iArr[0];
        int i4 = iArr[1];
        return i >= i3 && i <= view.getMeasuredWidth() + i3 && i2 >= i4 && i2 <= view.getMeasuredHeight() + i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int getRawX(View view, MotionEvent motionEvent, int i) {
        float x;
        if (Build.VERSION.SDK_INT >= 29) {
            x = motionEvent.getRawX(i);
        } else {
            view.getLocationOnScreen(new int[2]);
            x = r0[0] + motionEvent.getX(i);
        }
        return (int) x;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int getRawY(View view, MotionEvent motionEvent, int i) {
        float y;
        if (Build.VERSION.SDK_INT >= 29) {
            y = motionEvent.getRawY(i);
        } else {
            view.getLocationOnScreen(new int[2]);
            y = r0[1] + motionEvent.getY(i);
        }
        return (int) y;
    }

    static List<Integer> getScrollOffsetForViews(List<View> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<View> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(computeVerticalScrollOffset(it.next())));
        }
        return arrayList;
    }

    static boolean equalsOffsets(List<Integer> list, List<Integer> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!list.get(i).equals(list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isCoordinateScrollerChild(View view) {
        if (view == null) {
            return false;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof GlNestedScrollView.LayoutParams) {
            return ((GlNestedScrollView.LayoutParams) layoutParams).isCoordinate;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static View getScrolledView(View view) {
        View scrollChild = getScrollChild(view);
        while (scrollChild instanceof GlNestedScroller) {
            View currentScrollerView = ((GlNestedScroller) scrollChild).getCurrentScrollerView();
            if (scrollChild == currentScrollerView) {
                return currentScrollerView;
            }
            scrollChild = currentScrollerView;
        }
        return scrollChild;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static View getScrollChild(View view) {
        int i;
        View findViewById;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof GlNestedScrollView.LayoutParams) && (i = ((GlNestedScrollView.LayoutParams) layoutParams).scrollChild) != -1 && (findViewById = view.findViewById(i)) != null) {
                return findViewById;
            }
        }
        return view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean startInterceptRequestLayout(RecyclerView recyclerView) {
        if ("InterceptRequestLayout".equals(recyclerView.getTag())) {
            try {
                Method declaredMethod = RecyclerView.class.getDeclaredMethod("startInterceptRequestLayout", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(recyclerView, new Object[0]);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void stopInterceptRequestLayout(RecyclerView recyclerView) {
        if ("InterceptRequestLayout".equals(recyclerView.getTag())) {
            try {
                Method declaredMethod = RecyclerView.class.getDeclaredMethod("stopInterceptRequestLayout", Boolean.TYPE);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(recyclerView, false);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isCoordinateScrollParent(View view) {
        while ((view.getParent() instanceof ViewGroup) && !(view.getParent() instanceof GlNestedScrollView)) {
            view = (View) view.getParent();
        }
        if (view.getParent() instanceof GlNestedScrollView) {
            return isCoordinateScrollerChild(view);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isHorizontalScroll(View view, int i, int i2) {
        for (View view2 : getTouchViews(view, i, i2)) {
            if (view2.canScrollHorizontally(1) || view2.canScrollHorizontally(-1)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isTouchNotTriggerScrollStick(View view, int i, int i2) {
        List<GlNestedScrollView> inTouchNestedScrollViews = getInTouchNestedScrollViews(view, i, i2);
        for (int size = inTouchNestedScrollViews.size() - 1; size >= 0; size--) {
            GlNestedScrollView glNestedScrollView = inTouchNestedScrollViews.get(size);
            View topViewInTouch = getTopViewInTouch(glNestedScrollView, i, i2);
            if (topViewInTouch != null && glNestedScrollView.isStickyView(topViewInTouch) && glNestedScrollView.theChildIsStick(topViewInTouch) && !((GlNestedScrollView.LayoutParams) topViewInTouch.getLayoutParams()).isTriggerScroll) {
                return true;
            }
        }
        return false;
    }

    static List<GlNestedScrollView> getInTouchNestedScrollViews(View view, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        for (View view2 : getTouchViews(view, i, i2)) {
            if (view2 instanceof GlNestedScrollView) {
                arrayList.add((GlNestedScrollView) view2);
            }
        }
        return arrayList;
    }

    static View getTopViewInTouch(GlNestedScrollView glNestedScrollView, int i, int i2) {
        int childCount = glNestedScrollView.getChildCount();
        View view = null;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = glNestedScrollView.getChildAt(i3);
            if (childAt.getVisibility() == 0 && isTouchPointInView(childAt, i, i2) && (view == null || ViewCompat.getZ(childAt) > ViewCompat.getZ(view) || (ViewCompat.getZ(childAt) == ViewCompat.getZ(view) && glNestedScrollView.getDrawingPosition(childAt) > glNestedScrollView.getDrawingPosition(view)))) {
                view = childAt;
            }
        }
        return view;
    }
}
