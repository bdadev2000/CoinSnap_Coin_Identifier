package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.compose.foundation.text.input.a;
import androidx.core.content.ContextCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.view.AbsSavedState;
import com.google.common.primitives.Ints;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Comparator;

/* loaded from: classes2.dex */
public class ViewPager extends ViewGroup {
    public static final int[] E = {R.attr.layout_gravity};
    public OnPageChangeListener A;
    public OnPageChangeListener B;
    public ArrayList C;
    public int D;

    /* renamed from: a, reason: collision with root package name */
    public int f21757a;

    /* renamed from: b, reason: collision with root package name */
    public PagerAdapter f21758b;

    /* renamed from: c, reason: collision with root package name */
    public int f21759c;
    public int d;

    /* renamed from: f, reason: collision with root package name */
    public Parcelable f21760f;

    /* renamed from: g, reason: collision with root package name */
    public ClassLoader f21761g;

    /* renamed from: h, reason: collision with root package name */
    public PagerObserver f21762h;

    /* renamed from: i, reason: collision with root package name */
    public int f21763i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f21764j;

    /* renamed from: k, reason: collision with root package name */
    public int f21765k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f21766l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f21767m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f21768n;

    /* renamed from: o, reason: collision with root package name */
    public int f21769o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f21770p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f21771q;

    /* renamed from: r, reason: collision with root package name */
    public int f21772r;

    /* renamed from: s, reason: collision with root package name */
    public float f21773s;

    /* renamed from: t, reason: collision with root package name */
    public float f21774t;

    /* renamed from: u, reason: collision with root package name */
    public float f21775u;

    /* renamed from: v, reason: collision with root package name */
    public float f21776v;
    public int w;
    public VelocityTracker x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f21777y;

    /* renamed from: z, reason: collision with root package name */
    public ArrayList f21778z;

    /* renamed from: androidx.viewpager.widget.ViewPager$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static class AnonymousClass1 implements Comparator<ItemInfo> {
        @Override // java.util.Comparator
        public final int compare(ItemInfo itemInfo, ItemInfo itemInfo2) {
            itemInfo.getClass();
            itemInfo2.getClass();
            return 0;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$2, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static class AnonymousClass2 implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$3, reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass3 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$4, reason: invalid class name */
    /* loaded from: classes4.dex */
    class AnonymousClass4 implements OnApplyWindowInsetsListener {
        @Override // androidx.core.view.OnApplyWindowInsetsListener
        public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            WindowInsetsCompat u2 = ViewCompat.u(view, windowInsetsCompat);
            if (u2.o()) {
                return u2;
            }
            u2.i();
            throw null;
        }
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes2.dex */
    public @interface DecorView {
    }

    /* loaded from: classes2.dex */
    public static class ItemInfo {
    }

    /* loaded from: classes2.dex */
    public static class LayoutParams extends ViewGroup.LayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public boolean f21779a;

        /* renamed from: b, reason: collision with root package name */
        public int f21780b;
    }

    /* loaded from: classes2.dex */
    public class MyAccessibilityDelegate extends AccessibilityDelegateCompat {
        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            throw null;
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.k(ViewPager.class.getName());
            throw null;
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final boolean performAccessibilityAction(View view, int i2, Bundle bundle) {
            if (super.performAccessibilityAction(view, i2, bundle)) {
                return true;
            }
            if (i2 == 4096) {
                throw null;
            }
            if (i2 != 8192) {
                return false;
            }
            throw null;
        }
    }

    /* loaded from: classes2.dex */
    public interface OnAdapterChangeListener {
        void onAdapterChanged(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2);
    }

    /* loaded from: classes2.dex */
    public interface OnPageChangeListener {
        void onPageScrollStateChanged(int i2);

        void onPageSelected(int i2);
    }

    /* loaded from: classes2.dex */
    public interface PageTransformer {
    }

    /* loaded from: classes2.dex */
    public class PagerObserver extends DataSetObserver {
        public PagerObserver() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            ViewPager viewPager = ViewPager.this;
            viewPager.f21757a = viewPager.f21758b.a();
            throw null;
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            ViewPager viewPager = ViewPager.this;
            viewPager.f21757a = viewPager.f21758b.a();
            throw null;
        }
    }

    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Object();

        /* renamed from: a, reason: collision with root package name */
        public int f21782a;

        /* renamed from: b, reason: collision with root package name */
        public Parcelable f21783b;

        /* renamed from: c, reason: collision with root package name */
        public final ClassLoader f21784c;

        /* renamed from: androidx.viewpager.widget.ViewPager$SavedState$1, reason: invalid class name */
        /* loaded from: classes2.dex */
        public static class AnonymousClass1 implements Parcelable.ClassLoaderCreator<SavedState> {
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
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f21782a = parcel.readInt();
            this.f21783b = parcel.readParcelable(classLoader);
            this.f21784c = classLoader;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FragmentPager.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" position=");
            return a.n(sb, this.f21782a, "}");
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f21782a);
            parcel.writeParcelable(this.f21783b, i2);
        }
    }

    /* loaded from: classes2.dex */
    public static class SimpleOnPageChangeListener implements OnPageChangeListener {
        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageScrollStateChanged(int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageSelected(int i2) {
        }
    }

    /* loaded from: classes2.dex */
    public static class ViewPositionComparator implements Comparator<View> {
        @Override // java.util.Comparator
        public final int compare(View view, View view2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
            boolean z2 = layoutParams.f21779a;
            if (z2 != layoutParams2.f21779a) {
                return z2 ? 1 : -1;
            }
            return 0;
        }
    }

    public static boolean b(int i2, int i3, int i4, View view, boolean z2) {
        int i5;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i6 = i3 + scrollX;
                if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && (i5 = i4 + scrollY) >= childAt.getTop() && i5 < childAt.getBottom() && b(i2, i6 - childAt.getLeft(), i5 - childAt.getTop(), childAt, true)) {
                    return true;
                }
            }
        }
        return z2 && view.canScrollHorizontally(-i2);
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z2) {
        if (this.f21767m != z2) {
            this.f21767m = z2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(int r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.findFocus()
            r1 = 0
            if (r0 != r6) goto L9
        L7:
            r0 = r1
            goto L60
        L9:
            if (r0 == 0) goto L60
            android.view.ViewParent r2 = r0.getParent()
        Lf:
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L1b
            if (r2 != r6) goto L16
            goto L60
        L16:
            android.view.ViewParent r2 = r2.getParent()
            goto Lf
        L1b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
        L2f:
            boolean r3 = r0 instanceof android.view.ViewGroup
            if (r3 == 0) goto L48
            java.lang.String r3 = " => "
            r2.append(r3)
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
            goto L2f
        L48:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "arrowScroll tried to find focus based on non-child current focused view "
            r0.<init>(r3)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "ViewPager"
            android.util.Log.e(r2, r0)
            goto L7
        L60:
            android.view.FocusFinder r1 = android.view.FocusFinder.getInstance()
            android.view.View r1 = r1.findNextFocus(r6, r0, r7)
            r2 = 1
            r3 = 0
            r4 = 66
            r5 = 17
            if (r1 == 0) goto Lb1
            if (r1 == r0) goto Lb1
            if (r7 != r5) goto L95
            android.graphics.Rect r4 = r6.c(r1)
            int r4 = r4.left
            android.graphics.Rect r5 = r6.c(r0)
            int r5 = r5.left
            if (r0 == 0) goto L8f
            if (r4 < r5) goto L8f
            int r0 = r6.f21759c
            if (r0 <= 0) goto Lcb
            int r0 = r0 - r2
            r6.f21768n = r3
            r6.g(r0, r3)
            goto Lcc
        L8f:
            boolean r0 = r1.requestFocus()
        L93:
            r3 = r0
            goto Lcd
        L95:
            if (r7 != r4) goto Lcd
            android.graphics.Rect r2 = r6.c(r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r6.c(r0)
            int r3 = r3.left
            if (r0 == 0) goto Lac
            if (r2 > r3) goto Lac
            boolean r0 = r6.e()
            goto L93
        Lac:
            boolean r0 = r1.requestFocus()
            goto L93
        Lb1:
            if (r7 == r5) goto Lc0
            if (r7 != r2) goto Lb6
            goto Lc0
        Lb6:
            if (r7 == r4) goto Lbb
            r0 = 2
            if (r7 != r0) goto Lcd
        Lbb:
            boolean r3 = r6.e()
            goto Lcd
        Lc0:
            int r0 = r6.f21759c
            if (r0 <= 0) goto Lcb
            int r0 = r0 - r2
            r6.f21768n = r3
            r6.g(r0, r3)
            goto Lcc
        Lcb:
            r2 = r3
        Lcc:
            r3 = r2
        Lcd:
            if (r3 == 0) goto Ld6
            int r7 = android.view.SoundEffectConstants.getContantForFocusDirection(r7)
            r6.playSoundEffect(r7)
        Ld6:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.a(int):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i2, int i3) {
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                if (getChildAt(i4).getVisibility() == 0) {
                    throw null;
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i3 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList arrayList) {
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2).getVisibility() == 0) {
                throw null;
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        boolean z2 = layoutParams2.f21779a | (view.getClass().getAnnotation(DecorView.class) != null);
        layoutParams2.f21779a = z2;
        if (!this.f21766l) {
            super.addView(view, i2, layoutParams);
        } else {
            if (z2) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            addViewInLayout(view, i2, layoutParams);
        }
    }

    public final Rect c(View view) {
        Rect rect = new Rect();
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i2) {
        if (this.f21758b == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i2 < 0 ? scrollX > ((int) (((float) clientWidth) * 0.0f)) : i2 > 0 && scrollX < ((int) (((float) clientWidth) * 0.0f));
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        throw null;
    }

    public final void d(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.w) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.f21773s = motionEvent.getX(i2);
            this.w = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.x;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        /*
            r5 = this;
            boolean r0 = super.dispatchKeyEvent(r6)
            r1 = 1
            if (r0 != 0) goto L63
            int r0 = r6.getAction()
            r2 = 0
            if (r0 != 0) goto L62
            int r0 = r6.getKeyCode()
            r3 = 21
            r4 = 2
            if (r0 == r3) goto L48
            r3 = 22
            if (r0 == r3) goto L36
            r3 = 61
            if (r0 == r3) goto L20
            goto L62
        L20:
            boolean r0 = r6.hasNoModifiers()
            if (r0 == 0) goto L2b
            boolean r6 = r5.a(r4)
            goto L5f
        L2b:
            boolean r6 = r6.hasModifiers(r1)
            if (r6 == 0) goto L62
            boolean r6 = r5.a(r1)
            goto L5f
        L36:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L41
            boolean r6 = r5.e()
            goto L5f
        L41:
            r6 = 66
            boolean r6 = r5.a(r6)
            goto L5f
        L48:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L59
            int r6 = r5.f21759c
            if (r6 <= 0) goto L62
            int r6 = r6 - r1
            r5.f21768n = r2
            r5.g(r6, r2)
            goto L63
        L59:
            r6 = 17
            boolean r6 = r5.a(r6)
        L5f:
            if (r6 == 0) goto L62
            goto L63
        L62:
            r1 = r2
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (getChildAt(i2).getVisibility() == 0) {
                throw null;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        if (overScrollMode == 0) {
            throw null;
        }
        if (overScrollMode != 1) {
            throw null;
        }
        PagerAdapter pagerAdapter = this.f21758b;
        if (pagerAdapter == null) {
            throw null;
        }
        if (pagerAdapter.a() <= 1) {
            throw null;
        }
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f21764j;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public final boolean e() {
        PagerAdapter pagerAdapter = this.f21758b;
        if (pagerAdapter == null || this.f21759c >= pagerAdapter.a() - 1) {
            return false;
        }
        int i2 = this.f21759c + 1;
        this.f21768n = false;
        g(i2, false);
        return true;
    }

    public final void f(int i2) {
        String hexString;
        if (this.f21759c != i2) {
            throw null;
        }
        if (this.f21758b == null || this.f21768n || getWindowToken() == null) {
            return;
        }
        this.f21758b.d(this);
        int i3 = this.f21769o;
        Math.max(0, this.f21759c - i3);
        int a2 = this.f21758b.a();
        Math.min(a2 - 1, this.f21759c + i3);
        if (a2 == this.f21757a) {
            throw null;
        }
        try {
            hexString = getResources().getResourceName(getId());
        } catch (Resources.NotFoundException unused) {
            hexString = Integer.toHexString(getId());
        }
        throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.f21757a + ", found: " + a2 + " Pager id: " + hexString + " Pager class: " + getClass() + " Problematic adapter: " + this.f21758b.getClass());
    }

    public final void g(int i2, boolean z2) {
        PagerAdapter pagerAdapter = this.f21758b;
        if (pagerAdapter == null || pagerAdapter.a() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z2 && this.f21759c == i2) {
            throw null;
        }
        if (i2 < 0) {
            i2 = 0;
        } else if (i2 >= this.f21758b.a()) {
            i2 = this.f21758b.a() - 1;
        }
        int i3 = this.f21769o;
        int i4 = this.f21759c;
        if (i2 > i4 + i3) {
            throw null;
        }
        if (i2 < i4 - i3) {
            throw null;
        }
        boolean z3 = i4 != i2;
        if (!this.f21777y) {
            f(i2);
            throw null;
        }
        this.f21759c = i2;
        if (z3) {
            OnPageChangeListener onPageChangeListener = this.A;
            if (onPageChangeListener != null) {
                onPageChangeListener.onPageSelected(i2);
            }
            ArrayList arrayList = this.f21778z;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    OnPageChangeListener onPageChangeListener2 = (OnPageChangeListener) this.f21778z.get(i5);
                    if (onPageChangeListener2 != null) {
                        onPageChangeListener2.onPageSelected(i2);
                    }
                }
            }
            OnPageChangeListener onPageChangeListener3 = this.B;
            if (onPageChangeListener3 != null) {
                onPageChangeListener3.onPageSelected(i2);
            }
        }
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    @Nullable
    public PagerAdapter getAdapter() {
        return this.f21758b;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i2, int i3) {
        throw null;
    }

    public int getCurrentItem() {
        return this.f21759c;
    }

    public int getOffscreenPageLimit() {
        return this.f21769o;
    }

    public int getPageMargin() {
        return this.f21763i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f21777y = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(null);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f21763i > 0 && this.f21764j != null) {
            throw null;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            this.w = -1;
            this.f21770p = false;
            this.f21771q = false;
            VelocityTracker velocityTracker = this.x;
            if (velocityTracker == null) {
                throw null;
            }
            velocityTracker.recycle();
            this.x = null;
            throw null;
        }
        if (action != 0) {
            if (this.f21770p) {
                return true;
            }
            if (this.f21771q) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.f21775u = x;
            this.f21773s = x;
            float y2 = motionEvent.getY();
            this.f21776v = y2;
            this.f21774t = y2;
            this.w = motionEvent.getPointerId(0);
            this.f21771q = false;
            throw null;
        }
        if (action == 2) {
            int i2 = this.w;
            if (i2 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i2);
                float x2 = motionEvent.getX(findPointerIndex);
                float f2 = x2 - this.f21773s;
                float abs = Math.abs(f2);
                float y3 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y3 - this.f21776v);
                if (f2 != 0.0f) {
                    float f3 = this.f21773s;
                    if ((f3 >= this.f21772r || f2 <= 0.0f) && ((f3 <= getWidth() - this.f21772r || f2 >= 0.0f) && b((int) f2, (int) x2, (int) y3, this, false))) {
                        this.f21773s = x2;
                        this.f21774t = y3;
                        this.f21771q = true;
                        return false;
                    }
                }
                float f4 = 0;
                if (abs > f4 && abs * 0.5f > abs2) {
                    this.f21770p = true;
                    ViewParent parent = getParent();
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                    float f5 = this.f21775u;
                    this.f21773s = f2 > 0.0f ? f5 + f4 : f5 - f4;
                    this.f21774t = y3;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > f4) {
                    this.f21771q = true;
                }
                if (this.f21770p) {
                    this.f21773s = x2;
                    getScrollX();
                    getClientWidth();
                    throw null;
                }
            }
        } else if (action == 6) {
            d(motionEvent);
        }
        if (this.x == null) {
            this.x = VelocityTracker.obtain();
        }
        this.x.addMovement(motionEvent);
        return this.f21770p;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        LayoutParams layoutParams;
        LayoutParams layoutParams2;
        int i4;
        setMeasuredDimension(View.getDefaultSize(0, i2), View.getDefaultSize(0, i3));
        int measuredWidth = getMeasuredWidth();
        this.f21772r = Math.min(measuredWidth / 10, 0);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i5 = 0;
        while (true) {
            boolean z2 = true;
            int i6 = Ints.MAX_POWER_OF_TWO;
            if (i5 >= childCount) {
                break;
            }
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8 && (layoutParams2 = (LayoutParams) childAt.getLayoutParams()) != null && layoutParams2.f21779a) {
                int i7 = layoutParams2.f21780b;
                int i8 = i7 & 7;
                int i9 = i7 & 112;
                boolean z3 = i9 == 48 || i9 == 80;
                if (i8 != 3 && i8 != 5) {
                    z2 = false;
                }
                int i10 = Integer.MIN_VALUE;
                if (z3) {
                    i4 = Integer.MIN_VALUE;
                    i10 = 1073741824;
                } else {
                    i4 = z2 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i11 = ((ViewGroup.LayoutParams) layoutParams2).width;
                if (i11 != -2) {
                    if (i11 == -1) {
                        i11 = paddingLeft;
                    }
                    i10 = 1073741824;
                } else {
                    i11 = paddingLeft;
                }
                int i12 = ((ViewGroup.LayoutParams) layoutParams2).height;
                if (i12 == -2) {
                    i12 = measuredHeight;
                    i6 = i4;
                } else if (i12 == -1) {
                    i12 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i11, i10), View.MeasureSpec.makeMeasureSpec(i12, i6));
                if (z3) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z2) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i5++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, Ints.MAX_POWER_OF_TWO);
        this.f21765k = View.MeasureSpec.makeMeasureSpec(measuredHeight, Ints.MAX_POWER_OF_TWO);
        this.f21766l = true;
        f(this.f21759c);
        this.f21766l = false;
        int childCount2 = getChildCount();
        for (int i13 = 0; i13 < childCount2; i13++) {
            View childAt2 = getChildAt(i13);
            if (childAt2.getVisibility() != 8 && ((layoutParams = (LayoutParams) childAt2.getLayoutParams()) == null || !layoutParams.f21779a)) {
                layoutParams.getClass();
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * 0.0f), Ints.MAX_POWER_OF_TWO), this.f21765k);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i2, Rect rect) {
        int i3;
        int i4;
        int i5;
        int childCount = getChildCount();
        if ((i2 & 2) != 0) {
            i4 = 1;
            i5 = childCount;
            i3 = 0;
        } else {
            i3 = childCount - 1;
            i4 = -1;
            i5 = -1;
        }
        while (i3 != i5) {
            if (getChildAt(i3).getVisibility() == 0) {
                throw null;
            }
            i3 += i4;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        PagerAdapter pagerAdapter = this.f21758b;
        ClassLoader classLoader = savedState.f21784c;
        if (pagerAdapter != null) {
            pagerAdapter.b(savedState.f21783b, classLoader);
            g(savedState.f21782a, true);
        } else {
            this.d = savedState.f21782a;
            this.f21760f = savedState.f21783b;
            this.f21761g = classLoader;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.viewpager.widget.ViewPager$SavedState, android.os.Parcelable, androidx.customview.view.AbsSavedState] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? absSavedState = new AbsSavedState(super.onSaveInstanceState());
        absSavedState.f21782a = this.f21759c;
        PagerAdapter pagerAdapter = this.f21758b;
        if (pagerAdapter != null) {
            absSavedState.f21783b = pagerAdapter.c();
        }
        return absSavedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4) {
            if (i4 <= 0) {
                throw null;
            }
            throw null;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        PagerAdapter pagerAdapter;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (pagerAdapter = this.f21758b) == null || pagerAdapter.a() == 0) {
            return false;
        }
        if (this.x == null) {
            this.x = VelocityTracker.obtain();
        }
        this.x.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            throw null;
        }
        if (action != 1) {
            if (action == 2) {
                if (!this.f21770p) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.w);
                    if (findPointerIndex == -1) {
                        this.w = -1;
                        this.f21770p = false;
                        this.f21771q = false;
                        VelocityTracker velocityTracker = this.x;
                        if (velocityTracker == null) {
                            throw null;
                        }
                        velocityTracker.recycle();
                        this.x = null;
                        throw null;
                    }
                    float x = motionEvent.getX(findPointerIndex);
                    float abs = Math.abs(x - this.f21773s);
                    float y2 = motionEvent.getY(findPointerIndex);
                    float abs2 = Math.abs(y2 - this.f21774t);
                    float f2 = 0;
                    if (abs > f2 && abs > abs2) {
                        this.f21770p = true;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                        float f3 = this.f21775u;
                        this.f21773s = x - f3 > 0.0f ? f3 + f2 : f3 - f2;
                        this.f21774t = y2;
                        setScrollState(1);
                        setScrollingCacheEnabled(true);
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
                if (this.f21770p) {
                    this.f21773s = motionEvent.getX(motionEvent.findPointerIndex(this.w));
                    getScrollX();
                    getClientWidth();
                    throw null;
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    this.f21773s = motionEvent.getX(actionIndex);
                    this.w = motionEvent.getPointerId(actionIndex);
                } else if (action == 6) {
                    d(motionEvent);
                    this.f21773s = motionEvent.getX(motionEvent.findPointerIndex(this.w));
                }
            } else if (this.f21770p) {
                throw null;
            }
        } else if (this.f21770p) {
            VelocityTracker velocityTracker2 = this.x;
            velocityTracker2.computeCurrentVelocity(1000, 0);
            velocityTracker2.getXVelocity(this.w);
            this.f21768n = true;
            getClientWidth();
            getScrollX();
            if (getClientWidth() <= 0) {
                throw null;
            }
            getScrollX();
            throw null;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.f21766l) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(@Nullable PagerAdapter pagerAdapter) {
        PagerAdapter pagerAdapter2 = this.f21758b;
        if (pagerAdapter2 != null) {
            synchronized (pagerAdapter2) {
            }
            this.f21758b.d(this);
            throw null;
        }
        this.f21758b = pagerAdapter;
        this.f21757a = 0;
        if (pagerAdapter != null) {
            if (this.f21762h == null) {
                this.f21762h = new PagerObserver();
            }
            synchronized (this.f21758b) {
            }
            this.f21768n = false;
            boolean z2 = this.f21777y;
            this.f21777y = true;
            this.f21757a = this.f21758b.a();
            if (this.d >= 0) {
                this.f21758b.b(this.f21760f, this.f21761g);
                g(this.d, true);
                this.d = -1;
                this.f21760f = null;
                this.f21761g = null;
            } else if (z2) {
                requestLayout();
            } else {
                f(this.f21759c);
            }
        }
        ArrayList arrayList = this.C;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.C.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((OnAdapterChangeListener) this.C.get(i2)).onAdapterChanged(this, pagerAdapter2, pagerAdapter);
        }
    }

    public void setCurrentItem(int i2) {
        this.f21768n = false;
        g(i2, false);
    }

    public void setOffscreenPageLimit(int i2) {
        if (i2 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i2 + " too small; defaulting to 1");
            i2 = 1;
        }
        if (i2 != this.f21769o) {
            this.f21769o = i2;
            f(this.f21759c);
        }
    }

    @Deprecated
    public void setOnPageChangeListener(OnPageChangeListener onPageChangeListener) {
        this.A = onPageChangeListener;
    }

    public void setPageMargin(int i2) {
        this.f21763i = i2;
        if (getWidth() <= 0) {
            throw null;
        }
        throw null;
    }

    public void setPageMarginDrawable(@Nullable Drawable drawable) {
        this.f21764j = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i2) {
        if (this.D == i2) {
            return;
        }
        this.D = i2;
        OnPageChangeListener onPageChangeListener = this.A;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrollStateChanged(i2);
        }
        ArrayList arrayList = this.f21778z;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                OnPageChangeListener onPageChangeListener2 = (OnPageChangeListener) this.f21778z.get(i3);
                if (onPageChangeListener2 != null) {
                    onPageChangeListener2.onPageScrollStateChanged(i2);
                }
            }
        }
        OnPageChangeListener onPageChangeListener3 = this.B;
        if (onPageChangeListener3 != null) {
            onPageChangeListener3.onPageScrollStateChanged(i2);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f21764j;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.viewpager.widget.ViewPager$LayoutParams, android.view.ViewGroup$LayoutParams] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ?? layoutParams = new ViewGroup.LayoutParams(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, E);
        layoutParams.f21780b = obtainStyledAttributes.getInteger(0, 48);
        obtainStyledAttributes.recycle();
        return layoutParams;
    }

    public void setPageMarginDrawable(@DrawableRes int i2) {
        setPageMarginDrawable(ContextCompat.getDrawable(getContext(), i2));
    }
}
