package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import b0.c;
import b0.e;
import b0.f;
import b0.g;
import com.plantcare.ai.identifier.plantid.R;
import ef.b;
import f.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import m0.d;
import n0.r2;
import n0.x;
import n0.y;
import r.k;
import s2.h;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements x, y {

    /* renamed from: v, reason: collision with root package name */
    public static final String f1144v;

    /* renamed from: w, reason: collision with root package name */
    public static final Class[] f1145w;

    /* renamed from: x, reason: collision with root package name */
    public static final ThreadLocal f1146x;

    /* renamed from: y, reason: collision with root package name */
    public static final g f1147y;

    /* renamed from: z, reason: collision with root package name */
    public static final d f1148z;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1149b;

    /* renamed from: c, reason: collision with root package name */
    public final h f1150c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f1151d;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f1152f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f1153g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f1154h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1155i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1156j;

    /* renamed from: k, reason: collision with root package name */
    public final int[] f1157k;

    /* renamed from: l, reason: collision with root package name */
    public View f1158l;

    /* renamed from: m, reason: collision with root package name */
    public View f1159m;

    /* renamed from: n, reason: collision with root package name */
    public e f1160n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1161o;

    /* renamed from: p, reason: collision with root package name */
    public r2 f1162p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1163q;

    /* renamed from: r, reason: collision with root package name */
    public Drawable f1164r;

    /* renamed from: s, reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f1165s;

    /* renamed from: t, reason: collision with root package name */
    public a f1166t;
    public final b u;

    static {
        String str;
        Package r02 = CoordinatorLayout.class.getPackage();
        if (r02 != null) {
            str = r02.getName();
        } else {
            str = null;
        }
        f1144v = str;
        f1147y = new g(0);
        f1145w = new Class[]{Context.class, AttributeSet.class};
        f1146x = new ThreadLocal();
        f1148z = new d(12);
    }

    public CoordinatorLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.f1149b = new ArrayList();
        this.f1150c = new h(3);
        this.f1151d = new ArrayList();
        this.f1152f = new ArrayList();
        this.f1153g = new int[2];
        this.f1154h = new int[2];
        this.u = new b();
        int[] iArr = a0.a.a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f1157k = intArray;
            float f10 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i10 = 0; i10 < length; i10++) {
                this.f1157k[i10] = (int) (r2[i10] * f10);
            }
        }
        this.f1164r = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        w();
        super.setOnHierarchyChangeListener(new c(this));
        if (ViewCompat.getImportantForAccessibility(this) == 0) {
            ViewCompat.setImportantForAccessibility(this, 1);
        }
    }

    public static Rect g() {
        Rect rect = (Rect) f1148z.d();
        if (rect == null) {
            return new Rect();
        }
        return rect;
    }

    public static void l(int i10, Rect rect, Rect rect2, b0.d dVar, int i11, int i12) {
        int width;
        int height;
        int i13 = dVar.f2249c;
        if (i13 == 0) {
            i13 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i13, i10);
        int i14 = dVar.f2250d;
        if ((i14 & 7) == 0) {
            i14 |= 8388611;
        }
        if ((i14 & 112) == 0) {
            i14 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i14, i10);
        int i15 = absoluteGravity & 7;
        int i16 = absoluteGravity & 112;
        int i17 = absoluteGravity2 & 7;
        int i18 = absoluteGravity2 & 112;
        if (i17 != 1) {
            if (i17 != 5) {
                width = rect.left;
            } else {
                width = rect.right;
            }
        } else {
            width = rect.left + (rect.width() / 2);
        }
        if (i18 != 16) {
            if (i18 != 80) {
                height = rect.top;
            } else {
                height = rect.bottom;
            }
        } else {
            height = rect.top + (rect.height() / 2);
        }
        if (i15 != 1) {
            if (i15 != 5) {
                width -= i11;
            }
        } else {
            width -= i11 / 2;
        }
        if (i16 != 16) {
            if (i16 != 80) {
                height -= i12;
            }
        } else {
            height -= i12 / 2;
        }
        rect2.set(width, height, i11 + width, i12 + height);
    }

    public static b0.d n(View view) {
        b0.d dVar = (b0.d) view.getLayoutParams();
        if (!dVar.f2248b) {
            b0.b bVar = null;
            for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                bVar = (b0.b) cls.getAnnotation(b0.b.class);
                if (bVar != null) {
                    break;
                }
            }
            if (bVar != null) {
                try {
                    b0.a aVar = (b0.a) bVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    b0.a aVar2 = dVar.a;
                    if (aVar2 != aVar) {
                        if (aVar2 != null) {
                            aVar2.j();
                        }
                        dVar.a = aVar;
                        dVar.f2248b = true;
                        if (aVar != null) {
                            aVar.g(dVar);
                        }
                    }
                } catch (Exception e2) {
                    Log.e("CoordinatorLayout", "Default behavior class " + bVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e2);
                }
            }
            dVar.f2248b = true;
        }
        return dVar;
    }

    public static void u(int i10, View view) {
        b0.d dVar = (b0.d) view.getLayoutParams();
        int i11 = dVar.f2255i;
        if (i11 != i10) {
            ViewCompat.offsetLeftAndRight(view, i10 - i11);
            dVar.f2255i = i10;
        }
    }

    public static void v(int i10, View view) {
        b0.d dVar = (b0.d) view.getLayoutParams();
        int i11 = dVar.f2256j;
        if (i11 != i10) {
            ViewCompat.offsetTopAndBottom(view, i10 - i11);
            dVar.f2256j = i10;
        }
    }

    @Override // n0.x
    public final void a(int i10, View view) {
        b bVar = this.u;
        if (i10 == 1) {
            bVar.f17350b = 0;
        } else {
            bVar.a = 0;
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            b0.d dVar = (b0.d) childAt.getLayoutParams();
            if (dVar.a(i10)) {
                b0.a aVar = dVar.a;
                if (aVar != null) {
                    aVar.u(childAt, view, i10);
                }
                if (i10 != 0) {
                    if (i10 == 1) {
                        dVar.f2261o = false;
                    }
                } else {
                    dVar.f2260n = false;
                }
                dVar.f2262p = false;
            }
        }
        this.f1159m = null;
    }

    @Override // n0.x
    public final void b(View view, View view2, int i10, int i11) {
        b bVar = this.u;
        if (i11 == 1) {
            bVar.f17350b = i10;
        } else {
            bVar.a = i10;
        }
        this.f1159m = view2;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            ((b0.d) getChildAt(i12).getLayoutParams()).getClass();
        }
    }

    @Override // n0.x
    public final void c(View view, int i10, int i11, int[] iArr, int i12) {
        b0.a aVar;
        int childCount = getChildCount();
        int i13 = 0;
        int i14 = 0;
        boolean z10 = false;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                b0.d dVar = (b0.d) childAt.getLayoutParams();
                if (dVar.a(i12) && (aVar = dVar.a) != null) {
                    int[] iArr2 = this.f1153g;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    aVar.o(childAt, view, i11, iArr2, i12);
                    if (i10 > 0) {
                        i13 = Math.max(i13, iArr2[0]);
                    } else {
                        i13 = Math.min(i13, iArr2[0]);
                    }
                    if (i11 > 0) {
                        i14 = Math.max(i14, iArr2[1]);
                    } else {
                        i14 = Math.min(i14, iArr2[1]);
                    }
                    z10 = true;
                }
            }
        }
        iArr[0] = i13;
        iArr[1] = i14;
        if (z10) {
            p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof b0.d) && super.checkLayoutParams(layoutParams);
    }

    @Override // n0.y
    public final void d(View view, int i10, int i11, int i12, int i13, int[] iArr, int i14) {
        b0.a aVar;
        int min;
        int min2;
        int childCount = getChildCount();
        boolean z10 = false;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                b0.d dVar = (b0.d) childAt.getLayoutParams();
                if (dVar.a(i14) && (aVar = dVar.a) != null) {
                    int[] iArr2 = this.f1153g;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    aVar.p(this, childAt, i11, i12, i13, iArr2);
                    if (i12 > 0) {
                        min = Math.max(i15, iArr2[0]);
                    } else {
                        min = Math.min(i15, iArr2[0]);
                    }
                    i15 = min;
                    if (i13 > 0) {
                        min2 = Math.max(i16, iArr2[1]);
                    } else {
                        min2 = Math.min(i16, iArr2[1]);
                    }
                    i16 = min2;
                    z10 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i15;
        iArr[1] = iArr[1] + i16;
        if (z10) {
            p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        b0.a aVar = ((b0.d) view.getLayoutParams()).a;
        if (aVar != null) {
            aVar.getClass();
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1164r;
        boolean z10 = false;
        if (drawable != null && drawable.isStateful()) {
            z10 = false | drawable.setState(drawableState);
        }
        if (z10) {
            invalidate();
        }
    }

    @Override // n0.x
    public final void e(View view, int i10, int i11, int i12, int i13, int i14) {
        d(view, i10, i11, i12, i13, this.f1154h, 0);
    }

    @Override // n0.x
    public final boolean f(View view, View view2, int i10, int i11) {
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                b0.d dVar = (b0.d) childAt.getLayoutParams();
                b0.a aVar = dVar.a;
                if (aVar != null) {
                    boolean t5 = aVar.t(childAt, i10, i11);
                    z10 |= t5;
                    if (i11 != 0) {
                        if (i11 == 1) {
                            dVar.f2261o = t5;
                        }
                    } else {
                        dVar.f2260n = t5;
                    }
                } else if (i11 != 0) {
                    if (i11 == 1) {
                        dVar.f2261o = false;
                    }
                } else {
                    dVar.f2260n = false;
                }
            }
        }
        return z10;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new b0.d();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new b0.d(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        s();
        return Collections.unmodifiableList(this.f1149b);
    }

    public final r2 getLastWindowInsets() {
        return this.f1162p;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        b bVar = this.u;
        return bVar.f17350b | bVar.a;
    }

    @Nullable
    public Drawable getStatusBarBackground() {
        return this.f1164r;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void h(b0.d dVar, Rect rect, int i10, int i11) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) dVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i10) - ((ViewGroup.MarginLayoutParams) dVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) dVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i11) - ((ViewGroup.MarginLayoutParams) dVar).bottomMargin));
        rect.set(max, max2, i10 + max, i11 + max2);
    }

    public final void i(View view, boolean z10, Rect rect) {
        if (!view.isLayoutRequested() && view.getVisibility() != 8) {
            if (z10) {
                k(view, rect);
                return;
            } else {
                rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                return;
            }
        }
        rect.setEmpty();
    }

    public final ArrayList j(View view) {
        h hVar = this.f1150c;
        int i10 = ((k) hVar.f24170c).f23955d;
        ArrayList arrayList = null;
        for (int i11 = 0; i11 < i10; i11++) {
            ArrayList arrayList2 = (ArrayList) ((k) hVar.f24170c).l(i11);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(((k) hVar.f24170c).h(i11));
            }
        }
        ArrayList arrayList3 = this.f1152f;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final void k(View view, Rect rect) {
        ThreadLocal threadLocal = b0.h.a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = b0.h.a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        b0.h.a(this, view, matrix);
        ThreadLocal threadLocal3 = b0.h.f2268b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final int m(int i10) {
        int[] iArr = this.f1157k;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i10);
            return 0;
        }
        if (i10 >= 0 && i10 < iArr.length) {
            return iArr[i10];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i10 + " out of range for " + this);
        return 0;
    }

    public final boolean o(View view, int i10, int i11) {
        d dVar = f1148z;
        Rect g10 = g();
        k(view, g10);
        try {
            return g10.contains(i10, i11);
        } finally {
            g10.setEmpty();
            dVar.c(g10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t(false);
        if (this.f1161o) {
            if (this.f1160n == null) {
                this.f1160n = new e(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f1160n);
        }
        if (this.f1162p == null && ViewCompat.getFitsSystemWindows(this)) {
            ViewCompat.requestApplyInsets(this);
        }
        this.f1156j = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t(false);
        if (this.f1161o && this.f1160n != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f1160n);
        }
        View view = this.f1159m;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f1156j = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        super.onDraw(canvas);
        if (this.f1163q && this.f1164r != null) {
            r2 r2Var = this.f1162p;
            if (r2Var != null) {
                i10 = r2Var.e();
            } else {
                i10 = 0;
            }
            if (i10 > 0) {
                this.f1164r.setBounds(0, 0, getWidth(), i10);
                this.f1164r.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            t(true);
        }
        boolean r6 = r(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            t(true);
        }
        return r6;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        b0.a aVar;
        int layoutDirection = ViewCompat.getLayoutDirection(this);
        ArrayList arrayList = this.f1149b;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            View view = (View) arrayList.get(i14);
            if (view.getVisibility() != 8 && ((aVar = ((b0.d) view.getLayoutParams()).a) == null || !aVar.l(this, view, layoutDirection))) {
                q(layoutDirection, view);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0195, code lost:
    
        if (r0.m(r32, r19, r25, r20, r26) == false) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0198  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r33, int r34) {
        /*
            Method dump skipped, instructions count: 528
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                b0.d dVar = (b0.d) childAt.getLayoutParams();
                if (dVar.a(0)) {
                    b0.a aVar = dVar.a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        b0.a aVar;
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                b0.d dVar = (b0.d) childAt.getLayoutParams();
                if (dVar.a(0) && (aVar = dVar.a) != null) {
                    z10 |= aVar.n(view);
                }
            }
        }
        return z10;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        c(view, i10, i11, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        e(view, i10, i11, i12, i13, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        b(view, view2, i10, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.f26666b);
        SparseArray sparseArray = fVar.f2266d;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            b0.a aVar = n(childAt).a;
            if (id2 != -1 && aVar != null && (parcelable2 = (Parcelable) sparseArray.get(id2)) != null) {
                aVar.r(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable s5;
        f fVar = new f(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            b0.a aVar = ((b0.d) childAt.getLayoutParams()).a;
            if (id2 != -1 && aVar != null && (s5 = aVar.s(childAt)) != null) {
                sparseArray.append(id2, s5);
            }
        }
        fVar.f2266d = sparseArray;
        return fVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        return f(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        a(0, view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r3 != false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f1158l
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L15
            boolean r3 = r0.r(r1, r4)
            if (r3 == 0) goto L29
            goto L16
        L15:
            r3 = r5
        L16:
            android.view.View r6 = r0.f1158l
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            b0.d r6 = (b0.d) r6
            b0.a r6 = r6.a
            if (r6 == 0) goto L29
            android.view.View r7 = r0.f1158l
            boolean r6 = r6.v(r7, r1)
            goto L2a
        L29:
            r6 = r5
        L2a:
            android.view.View r7 = r0.f1158l
            r8 = 0
            if (r7 != 0) goto L35
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L48
        L35:
            if (r3 == 0) goto L48
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L48:
            if (r8 == 0) goto L4d
            r8.recycle()
        L4d:
            if (r2 == r4) goto L52
            r1 = 3
            if (r2 != r1) goto L55
        L52:
            r0.t(r5)
        L55:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(int i10) {
        int i11;
        Rect rect;
        int i12;
        ArrayList arrayList;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int width;
        int i13;
        int i14;
        int i15;
        int height;
        int i16;
        int i17;
        int i18;
        int i19;
        b0.d dVar;
        ArrayList arrayList2;
        int i20;
        Rect rect2;
        int i21;
        View view;
        d dVar2;
        b0.d dVar3;
        int i22;
        boolean z14;
        b0.a aVar;
        int layoutDirection = ViewCompat.getLayoutDirection(this);
        ArrayList arrayList3 = this.f1149b;
        int size = arrayList3.size();
        Rect g10 = g();
        Rect g11 = g();
        Rect g12 = g();
        int i23 = i10;
        int i24 = 0;
        while (true) {
            d dVar4 = f1148z;
            if (i24 < size) {
                View view2 = (View) arrayList3.get(i24);
                b0.d dVar5 = (b0.d) view2.getLayoutParams();
                if (i23 == 0 && view2.getVisibility() == 8) {
                    arrayList = arrayList3;
                    i12 = size;
                    rect = g12;
                    i11 = i24;
                } else {
                    int i25 = 0;
                    while (i25 < i24) {
                        if (dVar5.f2258l == ((View) arrayList3.get(i25))) {
                            b0.d dVar6 = (b0.d) view2.getLayoutParams();
                            if (dVar6.f2257k != null) {
                                Rect g13 = g();
                                Rect g14 = g();
                                arrayList2 = arrayList3;
                                Rect g15 = g();
                                i19 = i25;
                                k(dVar6.f2257k, g13);
                                i(view2, false, g14);
                                int measuredWidth = view2.getMeasuredWidth();
                                i20 = size;
                                int measuredHeight = view2.getMeasuredHeight();
                                i21 = i24;
                                dVar = dVar5;
                                view = view2;
                                rect2 = g12;
                                dVar2 = dVar4;
                                l(layoutDirection, g13, g15, dVar6, measuredWidth, measuredHeight);
                                if (g15.left == g14.left && g15.top == g14.top) {
                                    dVar3 = dVar6;
                                    i22 = measuredWidth;
                                    z14 = false;
                                } else {
                                    dVar3 = dVar6;
                                    i22 = measuredWidth;
                                    z14 = true;
                                }
                                h(dVar3, g15, i22, measuredHeight);
                                int i26 = g15.left - g14.left;
                                int i27 = g15.top - g14.top;
                                if (i26 != 0) {
                                    ViewCompat.offsetLeftAndRight(view, i26);
                                }
                                if (i27 != 0) {
                                    ViewCompat.offsetTopAndBottom(view, i27);
                                }
                                if (z14 && (aVar = dVar3.a) != null) {
                                    aVar.h(this, view, dVar3.f2257k);
                                }
                                g13.setEmpty();
                                dVar2.c(g13);
                                g14.setEmpty();
                                dVar2.c(g14);
                                g15.setEmpty();
                                dVar2.c(g15);
                                i25 = i19 + 1;
                                dVar4 = dVar2;
                                view2 = view;
                                arrayList3 = arrayList2;
                                size = i20;
                                i24 = i21;
                                dVar5 = dVar;
                                g12 = rect2;
                            }
                        }
                        i19 = i25;
                        dVar = dVar5;
                        arrayList2 = arrayList3;
                        i20 = size;
                        rect2 = g12;
                        i21 = i24;
                        view = view2;
                        dVar2 = dVar4;
                        i25 = i19 + 1;
                        dVar4 = dVar2;
                        view2 = view;
                        arrayList3 = arrayList2;
                        size = i20;
                        i24 = i21;
                        dVar5 = dVar;
                        g12 = rect2;
                    }
                    b0.d dVar7 = dVar5;
                    ArrayList arrayList4 = arrayList3;
                    int i28 = size;
                    Rect rect3 = g12;
                    i11 = i24;
                    View view3 = view2;
                    m0.c cVar = dVar4;
                    i(view3, true, g11);
                    if (dVar7.f2253g != 0 && !g11.isEmpty()) {
                        int absoluteGravity = Gravity.getAbsoluteGravity(dVar7.f2253g, layoutDirection);
                        int i29 = absoluteGravity & 112;
                        if (i29 != 48) {
                            if (i29 == 80) {
                                g10.bottom = Math.max(g10.bottom, getHeight() - g11.top);
                            }
                        } else {
                            g10.top = Math.max(g10.top, g11.bottom);
                        }
                        int i30 = absoluteGravity & 7;
                        if (i30 != 3) {
                            if (i30 == 5) {
                                g10.right = Math.max(g10.right, getWidth() - g11.left);
                            }
                        } else {
                            g10.left = Math.max(g10.left, g11.right);
                        }
                    }
                    if (dVar7.f2254h != 0 && view3.getVisibility() == 0 && ViewCompat.isLaidOut(view3) && view3.getWidth() > 0 && view3.getHeight() > 0) {
                        b0.d dVar8 = (b0.d) view3.getLayoutParams();
                        b0.a aVar2 = dVar8.a;
                        Rect g16 = g();
                        Rect g17 = g();
                        g17.set(view3.getLeft(), view3.getTop(), view3.getRight(), view3.getBottom());
                        if (aVar2 != null && aVar2.e(view3)) {
                            if (!g17.contains(g16)) {
                                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + g16.toShortString() + " | Bounds:" + g17.toShortString());
                            }
                        } else {
                            g16.set(g17);
                        }
                        g17.setEmpty();
                        cVar.c(g17);
                        if (g16.isEmpty()) {
                            g16.setEmpty();
                            cVar.c(g16);
                        } else {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(dVar8.f2254h, layoutDirection);
                            if ((absoluteGravity2 & 48) == 48 && (i17 = (g16.top - ((ViewGroup.MarginLayoutParams) dVar8).topMargin) - dVar8.f2256j) < (i18 = g10.top)) {
                                v(i18 - i17, view3);
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - g16.bottom) - ((ViewGroup.MarginLayoutParams) dVar8).bottomMargin) + dVar8.f2256j) < (i16 = g10.bottom)) {
                                v(height - i16, view3);
                                z11 = true;
                            }
                            if (!z11) {
                                v(0, view3);
                            }
                            if ((absoluteGravity2 & 3) == 3 && (i14 = (g16.left - ((ViewGroup.MarginLayoutParams) dVar8).leftMargin) - dVar8.f2255i) < (i15 = g10.left)) {
                                u(i15 - i14, view3);
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - g16.right) - ((ViewGroup.MarginLayoutParams) dVar8).rightMargin) + dVar8.f2255i) < (i13 = g10.right)) {
                                u(width - i13, view3);
                                z13 = true;
                            } else {
                                z13 = z12;
                            }
                            if (!z13) {
                                u(0, view3);
                            }
                            g16.setEmpty();
                            cVar.c(g16);
                        }
                    }
                    if (i10 != 2) {
                        rect = rect3;
                        rect.set(((b0.d) view3.getLayoutParams()).f2263q);
                        if (rect.equals(g11)) {
                            arrayList = arrayList4;
                            i12 = i28;
                            i23 = i10;
                        } else {
                            ((b0.d) view3.getLayoutParams()).f2263q.set(g11);
                        }
                    } else {
                        rect = rect3;
                    }
                    int i31 = i11 + 1;
                    i12 = i28;
                    while (true) {
                        arrayList = arrayList4;
                        if (i31 >= i12) {
                            break;
                        }
                        View view4 = (View) arrayList.get(i31);
                        b0.d dVar9 = (b0.d) view4.getLayoutParams();
                        b0.a aVar3 = dVar9.a;
                        if (aVar3 != null && aVar3.f(view4, view3)) {
                            if (i10 == 0 && dVar9.f2262p) {
                                dVar9.f2262p = false;
                            } else {
                                if (i10 != 2) {
                                    z10 = aVar3.h(this, view4, view3);
                                } else {
                                    aVar3.i();
                                    z10 = true;
                                }
                                if (i10 == 1) {
                                    dVar9.f2262p = z10;
                                }
                            }
                        }
                        i31++;
                        arrayList4 = arrayList;
                    }
                    i23 = i10;
                }
                i24 = i11 + 1;
                g12 = rect;
                size = i12;
                arrayList3 = arrayList;
            } else {
                Rect rect4 = g12;
                g10.setEmpty();
                dVar4.c(g10);
                g11.setEmpty();
                dVar4.c(g11);
                rect4.setEmpty();
                dVar4.c(rect4);
                return;
            }
        }
    }

    public final void q(int i10, View view) {
        boolean z10;
        Rect g10;
        Rect g11;
        b0.d dVar = (b0.d) view.getLayoutParams();
        View view2 = dVar.f2257k;
        int i11 = 0;
        if (view2 == null && dVar.f2252f != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            d dVar2 = f1148z;
            if (view2 != null) {
                g10 = g();
                g11 = g();
                try {
                    k(view2, g10);
                    b0.d dVar3 = (b0.d) view.getLayoutParams();
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    l(i10, g10, g11, dVar3, measuredWidth, measuredHeight);
                    h(dVar3, g11, measuredWidth, measuredHeight);
                    view.layout(g11.left, g11.top, g11.right, g11.bottom);
                    return;
                } finally {
                    g10.setEmpty();
                    dVar2.c(g10);
                    g11.setEmpty();
                    dVar2.c(g11);
                }
            }
            int i12 = dVar.f2251e;
            if (i12 >= 0) {
                b0.d dVar4 = (b0.d) view.getLayoutParams();
                int i13 = dVar4.f2249c;
                if (i13 == 0) {
                    i13 = 8388661;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i13, i10);
                int i14 = absoluteGravity & 7;
                int i15 = absoluteGravity & 112;
                int width = getWidth();
                int height = getHeight();
                int measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                if (i10 == 1) {
                    i12 = width - i12;
                }
                int m10 = m(i12) - measuredWidth2;
                if (i14 != 1) {
                    if (i14 == 5) {
                        m10 += measuredWidth2;
                    }
                } else {
                    m10 += measuredWidth2 / 2;
                }
                if (i15 != 16) {
                    if (i15 == 80) {
                        i11 = measuredHeight2 + 0;
                    }
                } else {
                    i11 = 0 + (measuredHeight2 / 2);
                }
                int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) dVar4).leftMargin, Math.min(m10, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) dVar4).rightMargin));
                int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) dVar4).topMargin, Math.min(i11, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) dVar4).bottomMargin));
                view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
                return;
            }
            b0.d dVar5 = (b0.d) view.getLayoutParams();
            g10 = g();
            g10.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) dVar5).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) dVar5).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) dVar5).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) dVar5).bottomMargin);
            if (this.f1162p != null && ViewCompat.getFitsSystemWindows(this) && !ViewCompat.getFitsSystemWindows(view)) {
                g10.left = this.f1162p.c() + g10.left;
                g10.top = this.f1162p.e() + g10.top;
                g10.right -= this.f1162p.d();
                g10.bottom -= this.f1162p.b();
            }
            g11 = g();
            int i16 = dVar5.f2249c;
            if ((i16 & 7) == 0) {
                i16 |= 8388611;
            }
            if ((i16 & 112) == 0) {
                i16 |= 48;
            }
            Gravity.apply(i16, view.getMeasuredWidth(), view.getMeasuredHeight(), g10, g11, i10);
            view.layout(g11.left, g11.top, g11.right, g11.bottom);
            return;
        }
        throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
    }

    public final boolean r(MotionEvent motionEvent, int i10) {
        boolean z10;
        int i11;
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f1151d;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i12 = childCount - 1; i12 >= 0; i12--) {
            if (isChildrenDrawingOrderEnabled) {
                i11 = getChildDrawingOrder(childCount, i12);
            } else {
                i11 = i12;
            }
            arrayList.add(getChildAt(i11));
        }
        g gVar = f1147y;
        if (gVar != null) {
            Collections.sort(arrayList, gVar);
        }
        int size = arrayList.size();
        MotionEvent motionEvent2 = null;
        boolean z11 = false;
        boolean z12 = false;
        for (int i13 = 0; i13 < size; i13++) {
            View view = (View) arrayList.get(i13);
            b0.d dVar = (b0.d) view.getLayoutParams();
            b0.a aVar = dVar.a;
            if ((z11 || z12) && actionMasked != 0) {
                if (aVar != null) {
                    if (motionEvent2 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i10 != 0) {
                        if (i10 == 1) {
                            aVar.v(view, motionEvent2);
                        }
                    } else {
                        aVar.k(this, view, motionEvent2);
                    }
                }
            } else {
                if (!z11 && aVar != null) {
                    if (i10 != 0) {
                        if (i10 == 1) {
                            z11 = aVar.v(view, motionEvent);
                        }
                    } else {
                        z11 = aVar.k(this, view, motionEvent);
                    }
                    if (z11) {
                        this.f1158l = view;
                    }
                }
                if (dVar.a == null) {
                    dVar.f2259m = false;
                }
                boolean z13 = dVar.f2259m;
                if (z13) {
                    z10 = true;
                } else {
                    z10 = z13 | false;
                    dVar.f2259m = z10;
                }
                if (z10 && !z13) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z10 && !z12) {
                    break;
                }
            }
        }
        arrayList.clear();
        return z11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        b0.a aVar = ((b0.d) view.getLayoutParams()).a;
        if (aVar != null) {
            aVar.q(this, view);
        }
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (z10 && !this.f1155i) {
            t(false);
            this.f1155i = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x007a, code lost:
    
        if (r10 != false) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s() {
        /*
            Method dump skipped, instructions count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.s():void");
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z10) {
        super.setFitsSystemWindows(z10);
        w();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f1165s = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(@Nullable Drawable drawable) {
        boolean z10;
        Drawable drawable2 = this.f1164r;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f1164r = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f1164r.setState(getDrawableState());
                }
                h0.b.b(this.f1164r, ViewCompat.getLayoutDirection(this));
                Drawable drawable4 = this.f1164r;
                if (getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                drawable4.setVisible(z10, false);
                this.f1164r.setCallback(this);
            }
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public void setStatusBarBackgroundColor(int i10) {
        setStatusBarBackground(new ColorDrawable(i10));
    }

    public void setStatusBarBackgroundResource(int i10) {
        setStatusBarBackground(i10 != 0 ? d0.h.getDrawable(getContext(), i10) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        boolean z10;
        super.setVisibility(i10);
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable = this.f1164r;
        if (drawable != null && drawable.isVisible() != z10) {
            this.f1164r.setVisible(z10, false);
        }
    }

    public final void t(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            b0.a aVar = ((b0.d) childAt.getLayoutParams()).a;
            if (aVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z10) {
                    aVar.k(this, childAt, obtain);
                } else {
                    aVar.v(childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            ((b0.d) getChildAt(i11).getLayoutParams()).f2259m = false;
        }
        this.f1158l = null;
        this.f1155i = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1164r;
    }

    public final void w() {
        if (ViewCompat.getFitsSystemWindows(this)) {
            if (this.f1166t == null) {
                this.f1166t = new a(this, 3);
            }
            ViewCompat.setOnApplyWindowInsetsListener(this, this.f1166t);
            setSystemUiVisibility(1280);
            return;
        }
        ViewCompat.setOnApplyWindowInsetsListener(this, null);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof b0.d) {
            return new b0.d((b0.d) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new b0.d((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new b0.d(layoutParams);
    }
}
