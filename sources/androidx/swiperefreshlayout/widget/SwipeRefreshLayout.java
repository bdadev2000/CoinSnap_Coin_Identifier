package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ListView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.content.ContextCompat;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.NestedScrollingParent;
import androidx.core.view.ViewCompat;
import com.google.common.primitives.Ints;

/* loaded from: classes2.dex */
public class SwipeRefreshLayout extends ViewGroup implements NestedScrollingParent, NestedScrollingChild {

    /* renamed from: a, reason: collision with root package name */
    public View f21503a;

    /* renamed from: b, reason: collision with root package name */
    public OnRefreshListener f21504b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f21505c;
    public float d;

    /* renamed from: f, reason: collision with root package name */
    public float f21506f;

    /* renamed from: g, reason: collision with root package name */
    public float f21507g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f21508h;

    /* renamed from: i, reason: collision with root package name */
    public int f21509i;

    /* renamed from: j, reason: collision with root package name */
    public int f21510j;

    /* renamed from: k, reason: collision with root package name */
    public OnChildScrollUpCallback f21511k;

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 implements Animation.AnimationListener {
        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            throw null;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$2, reason: invalid class name */
    /* loaded from: classes2.dex */
    class AnonymousClass2 extends Animation {
        @Override // android.view.animation.Animation
        public final void applyTransformation(float f2, Transformation transformation) {
            throw null;
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$4, reason: invalid class name */
    /* loaded from: classes2.dex */
    class AnonymousClass4 extends Animation {
        @Override // android.view.animation.Animation
        public final void applyTransformation(float f2, Transformation transformation) {
            throw null;
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$5, reason: invalid class name */
    /* loaded from: classes2.dex */
    class AnonymousClass5 implements Animation.AnimationListener {
        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            throw null;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$6, reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass6 extends Animation {
        @Override // android.view.animation.Animation
        public final void applyTransformation(float f2, Transformation transformation) {
            throw null;
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$7, reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass7 extends Animation {
        @Override // android.view.animation.Animation
        public final void applyTransformation(float f2, Transformation transformation) {
            throw null;
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$8, reason: invalid class name */
    /* loaded from: classes2.dex */
    class AnonymousClass8 extends Animation {
        @Override // android.view.animation.Animation
        public final void applyTransformation(float f2, Transformation transformation) {
            throw null;
        }
    }

    /* loaded from: classes2.dex */
    public interface OnChildScrollUpCallback {
        boolean a();
    }

    /* loaded from: classes2.dex */
    public interface OnRefreshListener {
    }

    private void setColorViewAlpha(int i2) {
        throw null;
    }

    public final void a() {
        if (this.f21503a == null) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                if (!childAt.equals(null)) {
                    this.f21503a = childAt;
                    return;
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        throw null;
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f2, float f3) {
        throw null;
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        throw null;
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        throw null;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i2, int i3) {
        if (i3 == i2 - 1) {
            return 0;
        }
        return i3 >= 0 ? i3 + 1 : i3;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        throw null;
    }

    public int getProgressCircleDiameter() {
        return this.f21510j;
    }

    public int getProgressViewEndOffset() {
        return 0;
    }

    public int getProgressViewStartOffset() {
        return 0;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        throw null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        throw null;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean canScrollList;
        a();
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled()) {
            OnChildScrollUpCallback onChildScrollUpCallback = this.f21511k;
            if (onChildScrollUpCallback != null) {
                canScrollList = onChildScrollUpCallback.a();
            } else {
                View view = this.f21503a;
                canScrollList = view instanceof ListView ? ((ListView) view).canScrollList(-1) : view.canScrollVertically(-1);
            }
            if (!canScrollList && !this.f21505c) {
                if (actionMasked == 0) {
                    throw null;
                }
                if (actionMasked != 1) {
                    if (actionMasked == 2) {
                        int i2 = this.f21509i;
                        if (i2 == -1) {
                            Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but don't have an active pointer id.");
                            return false;
                        }
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex < 0) {
                            return false;
                        }
                        float f2 = 0;
                        if (motionEvent.getY(findPointerIndex) - 0.0f > f2 && !this.f21508h) {
                            this.f21507g = 0.0f + f2;
                            this.f21508h = true;
                            throw null;
                        }
                    } else if (actionMasked != 3) {
                        if (actionMasked == 6) {
                            int actionIndex = motionEvent.getActionIndex();
                            if (motionEvent.getPointerId(actionIndex) == this.f21509i) {
                                this.f21509i = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                            }
                        }
                    }
                    return this.f21508h;
                }
                this.f21508h = false;
                this.f21509i = -1;
                return this.f21508h;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f21503a == null) {
            a();
        }
        View view = this.f21503a;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        throw null;
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f21503a == null) {
            a();
        }
        View view = this.f21503a;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), Ints.MAX_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), Ints.MAX_POWER_OF_TWO));
        View.MeasureSpec.makeMeasureSpec(this.f21510j, Ints.MAX_POWER_OF_TWO);
        View.MeasureSpec.makeMeasureSpec(this.f21510j, Ints.MAX_POWER_OF_TWO);
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        return dispatchNestedFling(f2, f3, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f3) {
        return dispatchNestedPreFling(f2, f3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        if (i3 > 0) {
            float f2 = this.f21506f;
            if (f2 > 0.0f) {
                float f3 = i3;
                if (f3 > f2) {
                    iArr[1] = i3 - ((int) f2);
                    this.f21506f = 0.0f;
                    throw null;
                }
                this.f21506f = f2 - f3;
                iArr[1] = i3;
                throw null;
            }
        }
        if (dispatchNestedPreScroll(i2 - iArr[0], i3 - iArr[1], null, null)) {
            int i4 = iArr[0];
            throw null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        dispatchNestedScroll(i2, i3, i4, i5, null);
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        return (!isEnabled() || this.f21505c || (i2 & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        throw null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean canScrollList;
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled()) {
            OnChildScrollUpCallback onChildScrollUpCallback = this.f21511k;
            if (onChildScrollUpCallback != null) {
                canScrollList = onChildScrollUpCallback.a();
            } else {
                View view = this.f21503a;
                canScrollList = view instanceof ListView ? ((ListView) view).canScrollList(-1) : view.canScrollVertically(-1);
            }
            if (!canScrollList && !this.f21505c) {
                if (actionMasked == 0) {
                    this.f21509i = motionEvent.getPointerId(0);
                    this.f21508h = false;
                } else {
                    if (actionMasked == 1) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f21509i);
                        if (findPointerIndex < 0) {
                            Log.e("SwipeRefreshLayout", "Got ACTION_UP event but don't have an active pointer id.");
                            return false;
                        }
                        if (this.f21508h) {
                            float y2 = (motionEvent.getY(findPointerIndex) - this.f21507g) * 0.5f;
                            this.f21508h = false;
                            if (y2 <= this.d) {
                                this.f21505c = false;
                                throw null;
                            }
                            if (!this.f21505c) {
                                a();
                                this.f21505c = true;
                                throw null;
                            }
                        }
                        this.f21509i = -1;
                        return false;
                    }
                    if (actionMasked == 2) {
                        int findPointerIndex2 = motionEvent.findPointerIndex(this.f21509i);
                        if (findPointerIndex2 < 0) {
                            Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but have an invalid active pointer id.");
                            return false;
                        }
                        float y3 = motionEvent.getY(findPointerIndex2);
                        float f2 = 0;
                        if (y3 - 0.0f > f2 && !this.f21508h) {
                            this.f21507g = 0.0f + f2;
                            this.f21508h = true;
                            throw null;
                        }
                        if (this.f21508h) {
                            if ((y3 - this.f21507g) * 0.5f <= 0.0f) {
                                return false;
                            }
                            throw null;
                        }
                    } else {
                        if (actionMasked == 3) {
                            return false;
                        }
                        if (actionMasked == 5) {
                            int actionIndex = motionEvent.getActionIndex();
                            if (actionIndex < 0) {
                                Log.e("SwipeRefreshLayout", "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                                return false;
                            }
                            this.f21509i = motionEvent.getPointerId(actionIndex);
                        } else if (actionMasked == 6) {
                            int actionIndex2 = motionEvent.getActionIndex();
                            if (motionEvent.getPointerId(actionIndex2) == this.f21509i) {
                                this.f21509i = motionEvent.getPointerId(actionIndex2 == 0 ? 1 : 0);
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        View view = this.f21503a;
        if (view == null || ViewCompat.s(view)) {
            super.requestDisallowInterceptTouchEvent(z2);
        }
    }

    public void setAnimationProgress(float f2) {
        throw null;
    }

    @Deprecated
    public void setColorScheme(@ColorRes int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(@ColorInt int... iArr) {
        a();
        throw null;
    }

    public void setColorSchemeResources(@ColorRes int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr2[i2] = ContextCompat.getColor(context, iArr[i2]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i2) {
        this.d = i2;
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        if (!z2) {
            throw null;
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        throw null;
    }

    public void setOnChildScrollUpCallback(@Nullable OnChildScrollUpCallback onChildScrollUpCallback) {
        this.f21511k = onChildScrollUpCallback;
    }

    public void setOnRefreshListener(@Nullable OnRefreshListener onRefreshListener) {
        this.f21504b = onRefreshListener;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i2) {
        setProgressBackgroundColorSchemeResource(i2);
    }

    public void setProgressBackgroundColorSchemeColor(@ColorInt int i2) {
        throw null;
    }

    public void setProgressBackgroundColorSchemeResource(@ColorRes int i2) {
        setProgressBackgroundColorSchemeColor(ContextCompat.getColor(getContext(), i2));
    }

    public void setRefreshing(boolean z2) {
        if (z2 && this.f21505c != z2) {
            this.f21505c = z2;
            setTargetOffsetTopAndBottom(0);
            throw null;
        }
        if (this.f21505c != z2) {
            a();
            this.f21505c = z2;
            if (z2) {
                throw null;
            }
            new Animation() { // from class: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.3
                @Override // android.view.animation.Animation
                public final void applyTransformation(float f2, Transformation transformation) {
                    SwipeRefreshLayout.this.setAnimationProgress(1.0f - f2);
                }
            }.setDuration(150L);
            throw null;
        }
    }

    public void setSize(int i2) {
        if (i2 == 0 || i2 == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i2 == 0) {
                this.f21510j = (int) (displayMetrics.density * 56.0f);
            } else {
                this.f21510j = (int) (displayMetrics.density * 40.0f);
            }
            throw null;
        }
    }

    public void setSlingshotDistance(@Px int i2) {
    }

    public void setTargetOffsetTopAndBottom(int i2) {
        throw null;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i2) {
        throw null;
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        throw null;
    }
}
