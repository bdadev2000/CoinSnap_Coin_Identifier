package androidx.drawerlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.Openable;
import androidx.customview.widget.ViewDragHelper;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class DrawerLayout extends ViewGroup implements Openable {

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f19437q = {R.attr.layout_gravity};

    /* renamed from: r, reason: collision with root package name */
    public static final boolean f19438r;

    /* renamed from: s, reason: collision with root package name */
    public static final boolean f19439s;

    /* renamed from: t, reason: collision with root package name */
    public static final boolean f19440t;

    /* renamed from: a, reason: collision with root package name */
    public float f19441a;

    /* renamed from: b, reason: collision with root package name */
    public float f19442b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f19443c;
    public boolean d;

    /* renamed from: f, reason: collision with root package name */
    public int f19444f;

    /* renamed from: g, reason: collision with root package name */
    public int f19445g;

    /* renamed from: h, reason: collision with root package name */
    public int f19446h;

    /* renamed from: i, reason: collision with root package name */
    public int f19447i;

    /* renamed from: j, reason: collision with root package name */
    public DrawerListener f19448j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f19449k;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f19450l;

    /* renamed from: m, reason: collision with root package name */
    public Object f19451m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f19452n;

    /* renamed from: o, reason: collision with root package name */
    public Rect f19453o;

    /* renamed from: p, reason: collision with root package name */
    public Matrix f19454p;

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements AccessibilityViewCommand {
        @Override // androidx.core.view.accessibility.AccessibilityViewCommand
        public final boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
            throw null;
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    class AnonymousClass2 implements View.OnApplyWindowInsetsListener {
        @Override // android.view.View.OnApplyWindowInsetsListener
        public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            DrawerLayout drawerLayout = (DrawerLayout) view;
            boolean z2 = false;
            boolean z3 = windowInsets.getSystemWindowInsetTop() > 0;
            drawerLayout.f19451m = windowInsets;
            drawerLayout.f19452n = z3;
            if (!z3 && drawerLayout.getBackground() == null) {
                z2 = true;
            }
            drawerLayout.setWillNotDraw(z2);
            drawerLayout.requestLayout();
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    /* loaded from: classes.dex */
    public class AccessibilityDelegate extends AccessibilityDelegateCompat {
        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() != 32) {
                return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
            }
            accessibilityEvent.getText();
            throw null;
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            if (DrawerLayout.f19438r) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            } else {
                AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfoCompat.f18826a);
                super.onInitializeAccessibilityNodeInfo(view, new AccessibilityNodeInfoCompat(obtain));
                accessibilityNodeInfoCompat.f18828c = -1;
                AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.f18826a;
                accessibilityNodeInfo.setSource(view);
                WeakHashMap weakHashMap = ViewCompat.f18740a;
                Object parentForAccessibility = view.getParentForAccessibility();
                if (parentForAccessibility instanceof View) {
                    accessibilityNodeInfoCompat.f18827b = -1;
                    accessibilityNodeInfo.setParent((View) parentForAccessibility);
                }
                obtain.getBoundsInScreen(null);
                accessibilityNodeInfoCompat.j(null);
                accessibilityNodeInfo.setVisibleToUser(obtain.isVisibleToUser());
                accessibilityNodeInfo.setPackageName(obtain.getPackageName());
                accessibilityNodeInfoCompat.k(obtain.getClassName());
                accessibilityNodeInfoCompat.o(obtain.getContentDescription());
                accessibilityNodeInfo.setEnabled(obtain.isEnabled());
                accessibilityNodeInfo.setFocused(obtain.isFocused());
                accessibilityNodeInfoCompat.h(obtain.isAccessibilityFocused());
                accessibilityNodeInfo.setSelected(obtain.isSelected());
                accessibilityNodeInfoCompat.a(obtain.getActions());
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (DrawerLayout.g(childAt)) {
                        accessibilityNodeInfo.addChild(childAt);
                    }
                }
            }
            accessibilityNodeInfoCompat.k("androidx.drawerlayout.widget.DrawerLayout");
            AccessibilityNodeInfo accessibilityNodeInfo2 = accessibilityNodeInfoCompat.f18826a;
            accessibilityNodeInfo2.setFocusable(false);
            accessibilityNodeInfo2.setFocused(false);
            accessibilityNodeInfo2.removeAction((AccessibilityNodeInfo.AccessibilityAction) AccessibilityNodeInfoCompat.AccessibilityActionCompat.e.f18843a);
            accessibilityNodeInfo2.removeAction((AccessibilityNodeInfo.AccessibilityAction) AccessibilityNodeInfoCompat.AccessibilityActionCompat.f18829f.f18843a);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.f19438r || DrawerLayout.g(view)) {
                return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static final class ChildAccessibilityDelegate extends AccessibilityDelegateCompat {
        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            if (DrawerLayout.g(view)) {
                return;
            }
            accessibilityNodeInfoCompat.f18827b = -1;
            accessibilityNodeInfoCompat.f18826a.setParent(null);
        }
    }

    /* loaded from: classes.dex */
    public interface DrawerListener {
        void onDrawerSlide(View view, float f2);
    }

    /* loaded from: classes.dex */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public int f19455a;

        /* renamed from: b, reason: collision with root package name */
        public float f19456b;

        /* renamed from: c, reason: collision with root package name */
        public int f19457c;
    }

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Object();

        /* renamed from: a, reason: collision with root package name */
        public int f19458a;

        /* renamed from: b, reason: collision with root package name */
        public int f19459b;

        /* renamed from: c, reason: collision with root package name */
        public int f19460c;
        public int d;

        /* renamed from: f, reason: collision with root package name */
        public int f19461f;

        /* renamed from: androidx.drawerlayout.widget.DrawerLayout$SavedState$1, reason: invalid class name */
        /* loaded from: classes.dex */
        public class AnonymousClass1 implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i2) {
                return new SavedState[i2];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f19458a = 0;
            this.f19458a = parcel.readInt();
            this.f19459b = parcel.readInt();
            this.f19460c = parcel.readInt();
            this.d = parcel.readInt();
            this.f19461f = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f19458a);
            parcel.writeInt(this.f19459b);
            parcel.writeInt(this.f19460c);
            parcel.writeInt(this.d);
            parcel.writeInt(this.f19461f);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class SimpleDrawerListener implements DrawerListener {
        @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public void onDrawerSlide(View view, float f2) {
        }

        public void onDrawerStateChanged(int i2) {
        }
    }

    /* loaded from: classes.dex */
    public class ViewDragCallback extends ViewDragHelper.Callback {

        /* renamed from: androidx.drawerlayout.widget.DrawerLayout$ViewDragCallback$1, reason: invalid class name */
        /* loaded from: classes.dex */
        public class AnonymousClass1 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

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
            if ((i2 & 1) != 1) {
                throw null;
            }
            throw null;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final boolean onEdgeLock(int i2) {
            return false;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onEdgeTouched(int i2, int i3) {
            throw null;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onViewCaptured(View view, int i2) {
            ((LayoutParams) view.getLayoutParams()).getClass();
            throw null;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onViewDragStateChanged(int i2) {
            throw null;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onViewPositionChanged(View view, int i2, int i3, int i4, int i5) {
            view.getWidth();
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

    static {
        int i2 = Build.VERSION.SDK_INT;
        f19438r = true;
        f19439s = true;
        f19440t = i2 >= 29;
    }

    public static String f(int i2) {
        return (i2 & 3) == 3 ? "LEFT" : (i2 & 5) == 5 ? "RIGHT" : Integer.toHexString(i2);
    }

    public static boolean g(View view) {
        WeakHashMap weakHashMap = ViewCompat.f18740a;
        return (view.getImportantForAccessibility() == 4 || view.getImportantForAccessibility() == 2) ? false : true;
    }

    public static boolean h(View view) {
        return ((LayoutParams) view.getLayoutParams()).f19455a == 0;
    }

    public static boolean i(View view) {
        if (j(view)) {
            return (((LayoutParams) view.getLayoutParams()).f19457c & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public static boolean j(View view) {
        int i2 = ((LayoutParams) view.getLayoutParams()).f19455a;
        WeakHashMap weakHashMap = ViewCompat.f18740a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, view.getLayoutDirection());
        return ((absoluteGravity & 3) == 0 && (absoluteGravity & 5) == 0) ? false : true;
    }

    public static boolean k(View view) {
        if (j(view)) {
            return ((LayoutParams) view.getLayoutParams()).f19456b > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public final boolean a(View view) {
        int i2 = ((LayoutParams) view.getLayoutParams()).f19455a;
        WeakHashMap weakHashMap = ViewCompat.f18740a;
        return (Gravity.getAbsoluteGravity(i2, getLayoutDirection()) & 3) == 3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i2, int i3) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (!j(childAt)) {
                throw null;
            }
            if (i(childAt)) {
                childAt.addFocusables(arrayList, i2, i3);
                z2 = true;
            }
        }
        if (!z2) {
            throw null;
        }
        throw null;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        View view2;
        super.addView(view, i2, layoutParams);
        int childCount = getChildCount();
        int i3 = 0;
        while (true) {
            if (i3 >= childCount) {
                view2 = null;
                break;
            }
            view2 = getChildAt(i3);
            if ((((LayoutParams) view2.getLayoutParams()).f19457c & 1) == 1) {
                break;
            } else {
                i3++;
            }
        }
        if (view2 != null || j(view)) {
            WeakHashMap weakHashMap = ViewCompat.f18740a;
            view.setImportantForAccessibility(4);
        } else {
            WeakHashMap weakHashMap2 = ViewCompat.f18740a;
            view.setImportantForAccessibility(1);
        }
        if (f19438r) {
            return;
        }
        ViewCompat.A(view, null);
    }

    public final void b(View view, boolean z2) {
        if (!j(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (this.d) {
            layoutParams.f19456b = 0.0f;
            layoutParams.f19457c = 0;
            invalidate();
        } else {
            if (!z2) {
                l(0.0f, view);
                throw null;
            }
            layoutParams.f19457c |= 4;
            if (a(view)) {
                view.getWidth();
                view.getTop();
                throw null;
            }
            getWidth();
            view.getTop();
            throw null;
        }
    }

    public final void c(boolean z2) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (j(childAt)) {
                if (!z2) {
                    childAt.getWidth();
                    if (a(childAt)) {
                        childAt.getTop();
                        throw null;
                    }
                    getWidth();
                    childAt.getTop();
                    throw null;
                }
                layoutParams.getClass();
            }
        }
        throw null;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        int childCount = getChildCount();
        float f2 = 0.0f;
        for (int i2 = 0; i2 < childCount; i2++) {
            f2 = Math.max(f2, ((LayoutParams) getChildAt(i2).getLayoutParams()).f19456b);
        }
        this.f19442b = f2;
        throw null;
    }

    public final View d(int i2) {
        WeakHashMap weakHashMap = ViewCompat.f18740a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, getLayoutDirection()) & 7;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            int i4 = ((LayoutParams) childAt.getLayoutParams()).f19455a;
            WeakHashMap weakHashMap2 = ViewCompat.f18740a;
            if ((Gravity.getAbsoluteGravity(i4, getLayoutDirection()) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean dispatchGenericMotionEvent;
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f19442b <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x = motionEvent.getX();
        float y2 = motionEvent.getY();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            View childAt = getChildAt(i2);
            if (this.f19453o == null) {
                this.f19453o = new Rect();
            }
            childAt.getHitRect(this.f19453o);
            if (this.f19453o.contains((int) x, (int) y2) && !h(childAt)) {
                if (childAt.getMatrix().isIdentity()) {
                    float scrollX = getScrollX() - childAt.getLeft();
                    float scrollY = getScrollY() - childAt.getTop();
                    motionEvent.offsetLocation(scrollX, scrollY);
                    dispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEvent);
                    motionEvent.offsetLocation(-scrollX, -scrollY);
                } else {
                    float scrollX2 = getScrollX() - childAt.getLeft();
                    float scrollY2 = getScrollY() - childAt.getTop();
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(scrollX2, scrollY2);
                    Matrix matrix = childAt.getMatrix();
                    if (!matrix.isIdentity()) {
                        if (this.f19454p == null) {
                            this.f19454p = new Matrix();
                        }
                        matrix.invert(this.f19454p);
                        obtain.transform(this.f19454p);
                    }
                    dispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(obtain);
                    obtain.recycle();
                }
                if (dispatchGenericMotionEvent) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        Drawable background;
        int height = getHeight();
        boolean h2 = h(view);
        int width = getWidth();
        int save = canvas.save();
        if (h2) {
            int childCount = getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != view && childAt.getVisibility() == 0 && (background = childAt.getBackground()) != null && background.getOpacity() == -1 && j(childAt) && childAt.getHeight() >= height) {
                    if (a(childAt)) {
                        int right = childAt.getRight();
                        if (right > i2) {
                            i2 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i2, 0, width, getHeight());
        }
        boolean drawChild = super.drawChild(canvas, view, j2);
        canvas.restoreToCount(save);
        if (this.f19442b <= 0.0f || !h2) {
            return drawChild;
        }
        throw null;
    }

    public final int e(View view) {
        if (!j(view)) {
            throw new IllegalArgumentException("View " + view + " is not a drawer");
        }
        int i2 = ((LayoutParams) view.getLayoutParams()).f19455a;
        WeakHashMap weakHashMap = ViewCompat.f18740a;
        int layoutDirection = getLayoutDirection();
        if (i2 == 3) {
            int i3 = this.f19444f;
            if (i3 != 3) {
                return i3;
            }
            int i4 = layoutDirection == 0 ? this.f19446h : this.f19447i;
            if (i4 != 3) {
                return i4;
            }
        } else if (i2 == 5) {
            int i5 = this.f19445g;
            if (i5 != 3) {
                return i5;
            }
            int i6 = layoutDirection == 0 ? this.f19447i : this.f19446h;
            if (i6 != 3) {
                return i6;
            }
        } else if (i2 == 8388611) {
            int i7 = this.f19446h;
            if (i7 != 3) {
                return i7;
            }
            int i8 = layoutDirection == 0 ? this.f19444f : this.f19445g;
            if (i8 != 3) {
                return i8;
            }
        } else if (i2 == 8388613) {
            int i9 = this.f19447i;
            if (i9 != 3) {
                return i9;
            }
            int i10 = layoutDirection == 0 ? this.f19445g : this.f19444f;
            if (i10 != 3) {
                return i10;
            }
        }
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, androidx.drawerlayout.widget.DrawerLayout$LayoutParams] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        marginLayoutParams.f19455a = 0;
        return marginLayoutParams;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, androidx.drawerlayout.widget.DrawerLayout$LayoutParams] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, androidx.drawerlayout.widget.DrawerLayout$LayoutParams] */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, androidx.drawerlayout.widget.DrawerLayout$LayoutParams] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            ?? marginLayoutParams = new ViewGroup.MarginLayoutParams((ViewGroup.MarginLayoutParams) layoutParams2);
            marginLayoutParams.f19455a = 0;
            marginLayoutParams.f19455a = layoutParams2.f19455a;
            return marginLayoutParams;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ?? marginLayoutParams2 = new ViewGroup.MarginLayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            marginLayoutParams2.f19455a = 0;
            return marginLayoutParams2;
        }
        ?? marginLayoutParams3 = new ViewGroup.MarginLayoutParams(layoutParams);
        marginLayoutParams3.f19455a = 0;
        return marginLayoutParams3;
    }

    public float getDrawerElevation() {
        if (f19439s) {
            return this.f19441a;
        }
        return 0.0f;
    }

    @Nullable
    public Drawable getStatusBarBackgroundDrawable() {
        return this.f19450l;
    }

    public final void l(float f2, View view) {
        float f3 = ((LayoutParams) view.getLayoutParams()).f19456b;
        float width = view.getWidth();
        int i2 = ((int) (width * f2)) - ((int) (f3 * width));
        if (!a(view)) {
            i2 = -i2;
        }
        view.offsetLeftAndRight(i2);
        o(f2, view);
    }

    public final void m(View view) {
        if (!j(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!this.d) {
            layoutParams.f19457c |= 2;
            if (a(view)) {
                view.getTop();
                throw null;
            }
            getWidth();
            view.getWidth();
            view.getTop();
            throw null;
        }
        layoutParams.f19456b = 1.0f;
        layoutParams.f19457c = 1;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt == view) {
                WeakHashMap weakHashMap = ViewCompat.f18740a;
                childAt.setImportantForAccessibility(1);
            } else {
                WeakHashMap weakHashMap2 = ViewCompat.f18740a;
                childAt.setImportantForAccessibility(4);
            }
        }
        AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat = AccessibilityNodeInfoCompat.AccessibilityActionCompat.f18837n;
        ViewCompat.w(accessibilityActionCompat.a(), view);
        ViewCompat.t(0, view);
        if (i(view) && e(view) != 2) {
            ViewCompat.x(view, accessibilityActionCompat, null, null);
        }
        invalidate();
    }

    public final void n(int i2, int i3) {
        View d;
        WeakHashMap weakHashMap = ViewCompat.f18740a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i3, getLayoutDirection());
        if (i3 == 3) {
            this.f19444f = i2;
        } else if (i3 == 5) {
            this.f19445g = i2;
        } else if (i3 == 8388611) {
            this.f19446h = i2;
        } else if (i3 == 8388613) {
            this.f19447i = i2;
        }
        if (i2 != 0) {
            throw null;
        }
        if (i2 != 1) {
            if (i2 == 2 && (d = d(absoluteGravity)) != null) {
                m(d);
                return;
            }
            return;
        }
        View d2 = d(absoluteGravity);
        if (d2 != null) {
            b(d2, true);
        }
    }

    public final void o(float f2, View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f2 == layoutParams.f19456b) {
            return;
        }
        layoutParams.f19456b = f2;
        ArrayList arrayList = this.f19449k;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((DrawerListener) this.f19449k.get(size)).onDrawerSlide(view, f2);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d = true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f19452n || this.f19450l == null) {
            return;
        }
        Object obj = this.f19451m;
        int systemWindowInsetTop = obj != null ? ((WindowInsets) obj).getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.f19450l.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.f19450l.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        motionEvent.getActionMasked();
        throw null;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        View view;
        if (i2 == 4) {
            int childCount = getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    view = null;
                    break;
                }
                view = getChildAt(i3);
                if (j(view) && k(view)) {
                    break;
                }
                i3++;
            }
            if (view != null) {
                keyEvent.startTracking();
                return true;
            }
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i2, KeyEvent keyEvent) {
        View view;
        if (i2 != 4) {
            return super.onKeyUp(i2, keyEvent);
        }
        int childCount = getChildCount();
        int i3 = 0;
        while (true) {
            if (i3 >= childCount) {
                view = null;
                break;
            }
            view = getChildAt(i3);
            if (j(view) && k(view)) {
                break;
            }
            i3++;
        }
        if (view == null || e(view) != 0) {
            return view != null;
        }
        c(false);
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        WindowInsets rootWindowInsets;
        float f2;
        int i6;
        boolean z3 = true;
        this.f19443c = true;
        int i7 = i4 - i2;
        int childCount = getChildCount();
        int i8 = 0;
        while (i8 < childCount) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (h(childAt)) {
                    int i9 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    childAt.layout(i9, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, childAt.getMeasuredWidth() + i9, childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a(childAt)) {
                        float f3 = measuredWidth;
                        i6 = (-measuredWidth) + ((int) (layoutParams.f19456b * f3));
                        f2 = (measuredWidth + i6) / f3;
                    } else {
                        float f4 = measuredWidth;
                        f2 = (i7 - r11) / f4;
                        i6 = i7 - ((int) (layoutParams.f19456b * f4));
                    }
                    boolean z4 = f2 != layoutParams.f19456b ? z3 : false;
                    int i10 = layoutParams.f19455a & 112;
                    if (i10 == 16) {
                        int i11 = i5 - i3;
                        int i12 = (i11 - measuredHeight) / 2;
                        int i13 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                        if (i12 < i13) {
                            i12 = i13;
                        } else {
                            int i14 = i12 + measuredHeight;
                            int i15 = i11 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                            if (i14 > i15) {
                                i12 = i15 - measuredHeight;
                            }
                        }
                        childAt.layout(i6, i12, measuredWidth + i6, measuredHeight + i12);
                    } else if (i10 != 80) {
                        int i16 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                        childAt.layout(i6, i16, measuredWidth + i6, measuredHeight + i16);
                    } else {
                        int i17 = i5 - i3;
                        childAt.layout(i6, (i17 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i6, i17 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                    }
                    if (z4) {
                        o(f2, childAt);
                    }
                    int i18 = layoutParams.f19456b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i18) {
                        childAt.setVisibility(i18);
                    }
                }
            }
            i8++;
            z3 = true;
        }
        if (f19440t && (rootWindowInsets = getRootWindowInsets()) != null) {
            WindowInsetsCompat.s(null, rootWindowInsets).g();
            throw null;
        }
        this.f19443c = false;
        this.d = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0048  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r18, int r19) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        View d;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        int i2 = savedState.f19458a;
        if (i2 != 0 && (d = d(i2)) != null) {
            m(d);
        }
        int i3 = savedState.f19459b;
        if (i3 != 3) {
            n(i3, 3);
        }
        int i4 = savedState.f19460c;
        if (i4 != 3) {
            n(i4, 5);
        }
        int i5 = savedState.d;
        if (i5 != 3) {
            n(i5, 8388611);
        }
        int i6 = savedState.f19461f;
        if (i6 != 3) {
            n(i6, 8388613);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i2) {
        if (f19439s) {
            return;
        }
        WeakHashMap weakHashMap = ViewCompat.f18740a;
        getLayoutDirection();
        getLayoutDirection();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.drawerlayout.widget.DrawerLayout$SavedState, android.os.Parcelable, androidx.customview.view.AbsSavedState] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? absSavedState = new AbsSavedState(super.onSaveInstanceState());
        absSavedState.f19458a = 0;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i2).getLayoutParams();
            int i3 = layoutParams.f19457c;
            boolean z2 = i3 == 1;
            boolean z3 = i3 == 2;
            if (z2 || z3) {
                absSavedState.f19458a = layoutParams.f19455a;
                break;
            }
        }
        absSavedState.f19459b = this.f19444f;
        absSavedState.f19460c = this.f19445g;
        absSavedState.d = this.f19446h;
        absSavedState.f19461f = this.f19447i;
        return absSavedState;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        super.requestDisallowInterceptTouchEvent(z2);
        if (z2) {
            c(true);
            throw null;
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f19443c) {
            return;
        }
        super.requestLayout();
    }

    public void setDrawerElevation(float f2) {
        this.f19441a = f2;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (j(childAt)) {
                ViewCompat.F(childAt, this.f19441a);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(DrawerListener drawerListener) {
        ArrayList arrayList;
        DrawerListener drawerListener2 = this.f19448j;
        if (drawerListener2 != null && (arrayList = this.f19449k) != null) {
            arrayList.remove(drawerListener2);
        }
        if (drawerListener != null) {
            if (this.f19449k == null) {
                this.f19449k = new ArrayList();
            }
            this.f19449k.add(drawerListener);
        }
        this.f19448j = drawerListener;
    }

    public void setDrawerLockMode(int i2) {
        n(i2, 3);
        n(i2, 5);
    }

    public void setScrimColor(@ColorInt int i2) {
        invalidate();
    }

    public void setStatusBarBackground(@Nullable Drawable drawable) {
        this.f19450l = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(@ColorInt int i2) {
        this.f19450l = new ColorDrawable(i2);
        invalidate();
    }

    public void setStatusBarBackground(int i2) {
        this.f19450l = i2 != 0 ? ContextCompat.getDrawable(getContext(), i2) : null;
        invalidate();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, androidx.drawerlayout.widget.DrawerLayout$LayoutParams] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);
        marginLayoutParams.f19455a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f19437q);
        marginLayoutParams.f19455a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        return marginLayoutParams;
    }
}
