package androidx.slidingpanelayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.content.ContextCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.ViewDragHelper;
import com.google.common.primitives.Ints;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class SlidingPaneLayout extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public int f21441a;

    /* renamed from: b, reason: collision with root package name */
    public int f21442b;

    /* renamed from: c, reason: collision with root package name */
    public Drawable f21443c;
    public Drawable d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f21444f;

    /* renamed from: g, reason: collision with root package name */
    public View f21445g;

    /* renamed from: h, reason: collision with root package name */
    public int f21446h;

    /* renamed from: i, reason: collision with root package name */
    public float f21447i;

    /* renamed from: j, reason: collision with root package name */
    public float f21448j;

    /* renamed from: k, reason: collision with root package name */
    public PanelSlideListener f21449k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f21450l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f21451m;

    /* loaded from: classes.dex */
    public class AccessibilityDelegate extends AccessibilityDelegateCompat {
        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(SlidingPaneLayout.class.getName());
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfoCompat.f18826a);
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2 = new AccessibilityNodeInfoCompat(obtain);
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat2);
            accessibilityNodeInfoCompat2.f(null);
            accessibilityNodeInfoCompat.i(null);
            obtain.getBoundsInScreen(null);
            accessibilityNodeInfoCompat.j(null);
            boolean isVisibleToUser = obtain.isVisibleToUser();
            AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.f18826a;
            accessibilityNodeInfo.setVisibleToUser(isVisibleToUser);
            accessibilityNodeInfo.setPackageName(obtain.getPackageName());
            accessibilityNodeInfoCompat.k(obtain.getClassName());
            accessibilityNodeInfoCompat.o(obtain.getContentDescription());
            accessibilityNodeInfo.setEnabled(obtain.isEnabled());
            accessibilityNodeInfoCompat.l(obtain.isClickable());
            accessibilityNodeInfo.setFocusable(obtain.isFocusable());
            accessibilityNodeInfo.setFocused(obtain.isFocused());
            accessibilityNodeInfoCompat.h(obtain.isAccessibilityFocused());
            accessibilityNodeInfo.setSelected(obtain.isSelected());
            accessibilityNodeInfo.setLongClickable(obtain.isLongClickable());
            accessibilityNodeInfoCompat.a(obtain.getActions());
            accessibilityNodeInfo.setMovementGranularities(obtain.getMovementGranularities());
            accessibilityNodeInfoCompat.k(SlidingPaneLayout.class.getName());
            accessibilityNodeInfoCompat.f18828c = -1;
            accessibilityNodeInfo.setSource(view);
            WeakHashMap weakHashMap = ViewCompat.f18740a;
            Object parentForAccessibility = view.getParentForAccessibility();
            if (!(parentForAccessibility instanceof View)) {
                throw null;
            }
            accessibilityNodeInfoCompat.f18827b = -1;
            accessibilityNodeInfo.setParent((View) parentForAccessibility);
            throw null;
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public class DisableLayerRunnable implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public class DragHelperCallback extends ViewDragHelper.Callback {
        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final int clampViewPositionHorizontal(View view, int i2, int i3) {
            throw null;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final int clampViewPositionVertical(View view, int i2, int i3) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final int getViewHorizontalDragRange(View view) {
            throw null;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onEdgeDragStarted(int i2, int i3) {
            throw null;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onViewCaptured(View view, int i2) {
            throw null;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onViewDragStateChanged(int i2) {
            throw null;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onViewPositionChanged(View view, int i2, int i3, int i4, int i5) {
            throw null;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onViewReleased(View view, float f2, float f3) {
            throw null;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final boolean tryCaptureView(View view, int i2) {
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: c, reason: collision with root package name */
        public static final int[] f21452c = {R.attr.layout_weight};

        /* renamed from: a, reason: collision with root package name */
        public float f21453a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f21454b;
    }

    /* loaded from: classes.dex */
    public interface PanelSlideListener {
    }

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Object();

        /* renamed from: a, reason: collision with root package name */
        public boolean f21455a;

        /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$SavedState$1, reason: invalid class name */
        /* loaded from: classes.dex */
        public static class AnonymousClass1 implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i2) {
                return new SavedState[i2];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel, null);
            this.f21455a = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f21455a ? 1 : 0);
        }
    }

    /* loaded from: classes.dex */
    public static class SimplePanelSlideListener implements PanelSlideListener {
    }

    public final boolean a() {
        WeakHashMap weakHashMap = ViewCompat.f18740a;
        return getLayoutDirection() == 1;
    }

    public final void b() {
        if (this.f21444f) {
            boolean a2 = a();
            LayoutParams layoutParams = (LayoutParams) this.f21445g.getLayoutParams();
            if (a2) {
                getPaddingRight();
                int i2 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                this.f21445g.getWidth();
                getWidth();
            } else {
                getPaddingLeft();
                int i3 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            }
            this.f21445g.getTop();
            throw null;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        throw null;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i2;
        int i3;
        super.draw(canvas);
        Drawable drawable = a() ? this.d : this.f21443c;
        View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt == null || drawable == null) {
            return;
        }
        int top = childAt.getTop();
        int bottom = childAt.getBottom();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (a()) {
            i3 = childAt.getRight();
            i2 = intrinsicWidth + i3;
        } else {
            int left = childAt.getLeft();
            int i4 = left - intrinsicWidth;
            i2 = left;
            i3 = i4;
        }
        drawable.setBounds(i3, top, i2, bottom);
        drawable.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int save = canvas.save();
        if (!this.f21444f || layoutParams.f21454b || this.f21445g == null) {
            boolean drawChild = super.drawChild(canvas, view, j2);
            canvas.restoreToCount(save);
            return drawChild;
        }
        canvas.getClipBounds(null);
        if (a()) {
            throw null;
        }
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, androidx.slidingpanelayout.widget.SlidingPaneLayout$LayoutParams] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        marginLayoutParams.f21453a = 0.0f;
        return marginLayoutParams;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, androidx.slidingpanelayout.widget.SlidingPaneLayout$LayoutParams] */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, androidx.slidingpanelayout.widget.SlidingPaneLayout$LayoutParams] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ?? marginLayoutParams = new ViewGroup.MarginLayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            marginLayoutParams.f21453a = 0.0f;
            return marginLayoutParams;
        }
        ?? marginLayoutParams2 = new ViewGroup.MarginLayoutParams(layoutParams);
        marginLayoutParams2.f21453a = 0.0f;
        return marginLayoutParams2;
    }

    @ColorInt
    public int getCoveredFadeColor() {
        return this.f21442b;
    }

    @Px
    public int getParallaxDistance() {
        return this.f21446h;
    }

    @ColorInt
    public int getSliderFadeColor() {
        return this.f21441a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f21451m = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f21451m = true;
        throw null;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (!this.f21444f && actionMasked == 0 && getChildCount() > 1 && getChildAt(1) != null) {
            motionEvent.getX();
            motionEvent.getY();
            throw null;
        }
        if (!this.f21444f) {
            throw null;
        }
        if (actionMasked == 3) {
            throw null;
        }
        if (actionMasked == 1) {
            throw null;
        }
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y2 = motionEvent.getY();
            this.f21447i = x;
            this.f21448j = y2;
            throw null;
        }
        if (actionMasked != 2) {
            throw null;
        }
        float x2 = motionEvent.getX();
        float y3 = motionEvent.getY();
        Math.abs(x2 - this.f21447i);
        Math.abs(y3 - this.f21448j);
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        if (!a()) {
            throw null;
        }
        throw null;
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        int paddingTop;
        int i4;
        int i5;
        int i6;
        int makeMeasureSpec;
        int i7;
        int makeMeasureSpec2;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
            }
            if (mode != Integer.MIN_VALUE && mode == 0) {
                size = 300;
            }
        } else if (mode2 == 0) {
            if (!isInEditMode()) {
                throw new IllegalStateException("Height must not be UNSPECIFIED");
            }
            if (mode2 == 0) {
                size2 = 300;
                mode2 = Integer.MIN_VALUE;
            }
        }
        if (mode2 == Integer.MIN_VALUE) {
            paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
            i4 = 0;
        } else if (mode2 != 1073741824) {
            i4 = 0;
            paddingTop = 0;
        } else {
            i4 = (size2 - getPaddingTop()) - getPaddingBottom();
            paddingTop = i4;
        }
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int childCount = getChildCount();
        if (childCount > 2) {
            Log.e("SlidingPaneLayout", "onMeasure: More than two child views are not supported.");
        }
        this.f21445g = null;
        float f2 = 0.0f;
        int i8 = paddingLeft;
        float f3 = 0.0f;
        int i9 = 0;
        boolean z2 = false;
        while (true) {
            i5 = 8;
            if (i9 >= childCount) {
                break;
            }
            View childAt = getChildAt(i9);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (childAt.getVisibility() == 8) {
                layoutParams.getClass();
            } else {
                float f4 = layoutParams.f21453a;
                if (f4 > f2) {
                    f3 += f4;
                    if (((ViewGroup.MarginLayoutParams) layoutParams).width == 0) {
                    }
                }
                int i10 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                int i11 = ((ViewGroup.MarginLayoutParams) layoutParams).width;
                int makeMeasureSpec3 = i11 == -2 ? View.MeasureSpec.makeMeasureSpec(paddingLeft - i10, Integer.MIN_VALUE) : i11 == -1 ? View.MeasureSpec.makeMeasureSpec(paddingLeft - i10, Ints.MAX_POWER_OF_TWO) : View.MeasureSpec.makeMeasureSpec(i11, Ints.MAX_POWER_OF_TWO);
                int i12 = ((ViewGroup.MarginLayoutParams) layoutParams).height;
                childAt.measure(makeMeasureSpec3, i12 == -2 ? View.MeasureSpec.makeMeasureSpec(paddingTop, Integer.MIN_VALUE) : i12 == -1 ? View.MeasureSpec.makeMeasureSpec(paddingTop, Ints.MAX_POWER_OF_TWO) : View.MeasureSpec.makeMeasureSpec(i12, Ints.MAX_POWER_OF_TWO));
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (mode2 == Integer.MIN_VALUE && measuredHeight > i4) {
                    i4 = Math.min(measuredHeight, paddingTop);
                }
                i8 -= measuredWidth;
                boolean z3 = i8 < 0;
                layoutParams.f21454b = z3;
                z2 |= z3;
                if (z3) {
                    this.f21445g = childAt;
                }
            }
            i9++;
            f2 = 0.0f;
        }
        if (z2 || f3 > 0.0f) {
            int i13 = 0;
            while (i13 < childCount) {
                View childAt2 = getChildAt(i13);
                if (childAt2.getVisibility() != i5) {
                    LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                    if (childAt2.getVisibility() != i5) {
                        int i14 = ((ViewGroup.MarginLayoutParams) layoutParams2).width;
                        float f5 = layoutParams2.f21453a;
                        boolean z4 = i14 == 0 && f5 > 0.0f;
                        int measuredWidth2 = z4 ? 0 : childAt2.getMeasuredWidth();
                        if (!z2 || childAt2 == this.f21445g) {
                            if (f5 > 0.0f) {
                                if (((ViewGroup.MarginLayoutParams) layoutParams2).width == 0) {
                                    int i15 = ((ViewGroup.MarginLayoutParams) layoutParams2).height;
                                    if (i15 == -2) {
                                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingTop, Integer.MIN_VALUE);
                                        i6 = Ints.MAX_POWER_OF_TWO;
                                    } else if (i15 == -1) {
                                        i6 = Ints.MAX_POWER_OF_TWO;
                                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingTop, Ints.MAX_POWER_OF_TWO);
                                    } else {
                                        i6 = Ints.MAX_POWER_OF_TWO;
                                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, Ints.MAX_POWER_OF_TWO);
                                    }
                                } else {
                                    i6 = Ints.MAX_POWER_OF_TWO;
                                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), Ints.MAX_POWER_OF_TWO);
                                }
                                if (z2) {
                                    int i16 = paddingLeft - (((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin);
                                    int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(i16, i6);
                                    if (measuredWidth2 != i16) {
                                        childAt2.measure(makeMeasureSpec4, makeMeasureSpec);
                                    }
                                } else {
                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2 + ((int) ((f5 * Math.max(0, i8)) / f3)), Ints.MAX_POWER_OF_TWO), makeMeasureSpec);
                                    i13++;
                                    i5 = 8;
                                }
                            }
                        } else if (((ViewGroup.MarginLayoutParams) layoutParams2).width < 0 && (measuredWidth2 > paddingLeft || f5 > 0.0f)) {
                            if (z4) {
                                int i17 = ((ViewGroup.MarginLayoutParams) layoutParams2).height;
                                if (i17 == -2) {
                                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(paddingTop, Integer.MIN_VALUE);
                                    i7 = Ints.MAX_POWER_OF_TWO;
                                } else if (i17 == -1) {
                                    i7 = Ints.MAX_POWER_OF_TWO;
                                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(paddingTop, Ints.MAX_POWER_OF_TWO);
                                } else {
                                    i7 = Ints.MAX_POWER_OF_TWO;
                                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i17, Ints.MAX_POWER_OF_TWO);
                                }
                            } else {
                                i7 = Ints.MAX_POWER_OF_TWO;
                                makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), Ints.MAX_POWER_OF_TWO);
                            }
                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i7), makeMeasureSpec2);
                        }
                    }
                }
                i13++;
                i5 = 8;
            }
        }
        setMeasuredDimension(size, getPaddingBottom() + getPaddingTop() + i4);
        this.f21444f = z2;
        throw null;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.f21455a) {
            if (this.f21451m) {
                this.f21450l = true;
            } else {
                b();
            }
        } else if (this.f21451m) {
            this.f21450l = false;
        } else {
            b();
        }
        this.f21450l = savedState.f21455a;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, androidx.customview.view.AbsSavedState, androidx.slidingpanelayout.widget.SlidingPaneLayout$SavedState] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? absSavedState = new AbsSavedState(super.onSaveInstanceState());
        boolean z2 = this.f21444f;
        absSavedState.f21455a = z2 ? !z2 : this.f21450l;
        return absSavedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4) {
            this.f21451m = true;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f21444f) {
            throw null;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (isInTouchMode() || this.f21444f) {
            return;
        }
        this.f21450l = view == this.f21445g;
    }

    public void setCoveredFadeColor(@ColorInt int i2) {
        this.f21442b = i2;
    }

    public void setPanelSlideListener(@Nullable PanelSlideListener panelSlideListener) {
        this.f21449k = panelSlideListener;
    }

    public void setParallaxDistance(@Px int i2) {
        this.f21446h = i2;
        requestLayout();
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(@Nullable Drawable drawable) {
        this.f21443c = drawable;
    }

    public void setShadowDrawableRight(@Nullable Drawable drawable) {
        this.d = drawable;
    }

    @Deprecated
    public void setShadowResource(@DrawableRes int i2) {
        setShadowDrawable(getResources().getDrawable(i2));
    }

    public void setShadowResourceLeft(int i2) {
        setShadowDrawableLeft(ContextCompat.getDrawable(getContext(), i2));
    }

    public void setShadowResourceRight(int i2) {
        setShadowDrawableRight(ContextCompat.getDrawable(getContext(), i2));
    }

    public void setSliderFadeColor(@ColorInt int i2) {
        this.f21441a = i2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, androidx.slidingpanelayout.widget.SlidingPaneLayout$LayoutParams] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);
        marginLayoutParams.f21453a = 0.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, LayoutParams.f21452c);
        marginLayoutParams.f21453a = obtainStyledAttributes.getFloat(0, 0.0f);
        obtainStyledAttributes.recycle();
        return marginLayoutParams;
    }
}
