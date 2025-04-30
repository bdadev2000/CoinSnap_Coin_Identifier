package androidx.coordinatorlayout.widget;

import C5.c;
import F.a;
import G.d;
import G.f;
import G.g;
import G.h;
import L5.b;
import S.e;
import T.G0;
import T.InterfaceC0290v;
import T.InterfaceC0291w;
import U4.y;
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
import b0.AbstractC0547b;
import com.tools.arruler.photomeasure.camera.ruler.R;
import j5.C2400c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import x.l;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC0290v, InterfaceC0291w {

    /* renamed from: v, reason: collision with root package name */
    public static final String f4341v;

    /* renamed from: w, reason: collision with root package name */
    public static final Class[] f4342w;

    /* renamed from: x, reason: collision with root package name */
    public static final ThreadLocal f4343x;

    /* renamed from: y, reason: collision with root package name */
    public static final c f4344y;

    /* renamed from: z, reason: collision with root package name */
    public static final e f4345z;
    public final ArrayList b;

    /* renamed from: c, reason: collision with root package name */
    public final y f4346c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f4347d;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f4348f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f4349g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f4350h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f4351i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4352j;

    /* renamed from: k, reason: collision with root package name */
    public final int[] f4353k;
    public View l;
    public View m;

    /* renamed from: n, reason: collision with root package name */
    public f f4354n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f4355o;

    /* renamed from: p, reason: collision with root package name */
    public G0 f4356p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f4357q;

    /* renamed from: r, reason: collision with root package name */
    public Drawable f4358r;

    /* renamed from: s, reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f4359s;

    /* renamed from: t, reason: collision with root package name */
    public C2400c f4360t;

    /* renamed from: u, reason: collision with root package name */
    public final b f4361u;

    static {
        String str;
        Package r02 = CoordinatorLayout.class.getPackage();
        if (r02 != null) {
            str = r02.getName();
        } else {
            str = null;
        }
        f4341v = str;
        f4344y = new c(1);
        f4342w = new Class[]{Context.class, AttributeSet.class};
        f4343x = new ThreadLocal();
        f4345z = new e(12);
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, L5.b] */
    public CoordinatorLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.b = new ArrayList();
        this.f4346c = new y(2);
        this.f4347d = new ArrayList();
        this.f4348f = new ArrayList();
        this.f4349g = new int[2];
        this.f4350h = new int[2];
        this.f4361u = new Object();
        int[] iArr = a.f1048a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f4353k = intArray;
            float f9 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i9 = 0; i9 < length; i9++) {
                this.f4353k[i9] = (int) (r1[i9] * f9);
            }
        }
        this.f4358r = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        w();
        super.setOnHierarchyChangeListener(new d(this));
        if (ViewCompat.getImportantForAccessibility(this) == 0) {
            ViewCompat.setImportantForAccessibility(this, 1);
        }
    }

    public static Rect g() {
        Rect rect = (Rect) f4345z.g();
        if (rect == null) {
            return new Rect();
        }
        return rect;
    }

    public static void l(int i9, Rect rect, Rect rect2, G.e eVar, int i10, int i11) {
        int width;
        int height;
        int i12 = eVar.f1226c;
        if (i12 == 0) {
            i12 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i12, i9);
        int i13 = eVar.f1227d;
        if ((i13 & 7) == 0) {
            i13 |= 8388611;
        }
        if ((i13 & 112) == 0) {
            i13 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i13, i9);
        int i14 = absoluteGravity & 7;
        int i15 = absoluteGravity & 112;
        int i16 = absoluteGravity2 & 7;
        int i17 = absoluteGravity2 & 112;
        if (i16 != 1) {
            if (i16 != 5) {
                width = rect.left;
            } else {
                width = rect.right;
            }
        } else {
            width = rect.left + (rect.width() / 2);
        }
        if (i17 != 16) {
            if (i17 != 80) {
                height = rect.top;
            } else {
                height = rect.bottom;
            }
        } else {
            height = rect.top + (rect.height() / 2);
        }
        if (i14 != 1) {
            if (i14 != 5) {
                width -= i10;
            }
        } else {
            width -= i10 / 2;
        }
        if (i15 != 16) {
            if (i15 != 80) {
                height -= i11;
            }
        } else {
            height -= i11 / 2;
        }
        rect2.set(width, height, i10 + width, i11 + height);
    }

    public static G.e n(View view) {
        G.e eVar = (G.e) view.getLayoutParams();
        if (!eVar.b) {
            G.c cVar = null;
            for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                cVar = (G.c) cls.getAnnotation(G.c.class);
                if (cVar != null) {
                    break;
                }
            }
            if (cVar != null) {
                try {
                    G.b bVar = (G.b) cVar.value().getDeclaredConstructor(null).newInstance(null);
                    G.b bVar2 = eVar.f1225a;
                    if (bVar2 != bVar) {
                        if (bVar2 != null) {
                            bVar2.i();
                        }
                        eVar.f1225a = bVar;
                        eVar.b = true;
                        if (bVar != null) {
                            bVar.g(eVar);
                        }
                    }
                } catch (Exception e4) {
                    Log.e("CoordinatorLayout", "Default behavior class " + cVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e4);
                }
            }
            eVar.b = true;
        }
        return eVar;
    }

    public static void u(View view, int i9) {
        G.e eVar = (G.e) view.getLayoutParams();
        int i10 = eVar.f1232i;
        if (i10 != i9) {
            ViewCompat.offsetLeftAndRight(view, i9 - i10);
            eVar.f1232i = i9;
        }
    }

    public static void v(View view, int i9) {
        G.e eVar = (G.e) view.getLayoutParams();
        int i10 = eVar.f1233j;
        if (i10 != i9) {
            ViewCompat.offsetTopAndBottom(view, i9 - i10);
            eVar.f1233j = i9;
        }
    }

    @Override // T.InterfaceC0291w
    public final void a(View view, int i9, int i10, int i11, int i12, int[] iArr, int i13) {
        G.b bVar;
        int min;
        int min2;
        int childCount = getChildCount();
        boolean z8 = false;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                G.e eVar = (G.e) childAt.getLayoutParams();
                if (eVar.a(i13) && (bVar = eVar.f1225a) != null) {
                    int[] iArr2 = this.f4349g;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    bVar.o(this, childAt, i10, i11, i12, iArr2);
                    if (i11 > 0) {
                        min = Math.max(i14, iArr2[0]);
                    } else {
                        min = Math.min(i14, iArr2[0]);
                    }
                    i14 = min;
                    if (i12 > 0) {
                        min2 = Math.max(i15, iArr2[1]);
                    } else {
                        min2 = Math.min(i15, iArr2[1]);
                    }
                    i15 = min2;
                    z8 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i14;
        iArr[1] = iArr[1] + i15;
        if (z8) {
            p(1);
        }
    }

    @Override // T.InterfaceC0290v
    public final void b(View view, int i9, int i10, int i11, int i12, int i13) {
        a(view, i9, i10, i11, i12, this.f4350h, 0);
    }

    @Override // T.InterfaceC0290v
    public final boolean c(View view, View view2, int i9, int i10) {
        int childCount = getChildCount();
        boolean z8 = false;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                G.e eVar = (G.e) childAt.getLayoutParams();
                G.b bVar = eVar.f1225a;
                if (bVar != null) {
                    boolean s5 = bVar.s(childAt, i9, i10);
                    z8 |= s5;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            eVar.f1236o = s5;
                        }
                    } else {
                        eVar.f1235n = s5;
                    }
                } else if (i10 != 0) {
                    if (i10 == 1) {
                        eVar.f1236o = false;
                    }
                } else {
                    eVar.f1235n = false;
                }
            }
        }
        return z8;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof G.e) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // T.InterfaceC0290v
    public final void d(View view, View view2, int i9, int i10) {
        b bVar = this.f4361u;
        if (i10 == 1) {
            bVar.b = i9;
        } else {
            bVar.f1822a = i9;
        }
        this.m = view2;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            ((G.e) getChildAt(i11).getLayoutParams()).getClass();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j7) {
        G.b bVar = ((G.e) view.getLayoutParams()).f1225a;
        if (bVar != null) {
            bVar.getClass();
        }
        return super.drawChild(canvas, view, j7);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        boolean z8;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f4358r;
        if (drawable != null && drawable.isStateful()) {
            z8 = drawable.setState(drawableState);
        } else {
            z8 = false;
        }
        if (z8) {
            invalidate();
        }
    }

    @Override // T.InterfaceC0290v
    public final void e(View view, int i9) {
        b bVar = this.f4361u;
        if (i9 == 1) {
            bVar.b = 0;
        } else {
            bVar.f1822a = 0;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            G.e eVar = (G.e) childAt.getLayoutParams();
            if (eVar.a(i9)) {
                G.b bVar2 = eVar.f1225a;
                if (bVar2 != null) {
                    bVar2.t(childAt, view, i9);
                }
                if (i9 != 0) {
                    if (i9 == 1) {
                        eVar.f1236o = false;
                    }
                } else {
                    eVar.f1235n = false;
                }
                eVar.getClass();
            }
        }
        this.m = null;
    }

    @Override // T.InterfaceC0290v
    public final void f(View view, int i9, int i10, int[] iArr, int i11) {
        G.b bVar;
        int min;
        int min2;
        int childCount = getChildCount();
        boolean z8 = false;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                G.e eVar = (G.e) childAt.getLayoutParams();
                if (eVar.a(i11) && (bVar = eVar.f1225a) != null) {
                    int[] iArr2 = this.f4349g;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    bVar.n(this, childAt, view, i9, i10, iArr2, i11);
                    int[] iArr3 = this.f4349g;
                    if (i9 > 0) {
                        min = Math.max(i12, iArr3[0]);
                    } else {
                        min = Math.min(i12, iArr3[0]);
                    }
                    i12 = min;
                    if (i10 > 0) {
                        min2 = Math.max(i13, iArr3[1]);
                    } else {
                        min2 = Math.min(i13, iArr3[1]);
                    }
                    i13 = min2;
                    z8 = true;
                }
            }
        }
        iArr[0] = i12;
        iArr[1] = i13;
        if (z8) {
            p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new G.e();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new G.e(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        s();
        return Collections.unmodifiableList(this.b);
    }

    public final G0 getLastWindowInsets() {
        return this.f4356p;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        b bVar = this.f4361u;
        return bVar.b | bVar.f1822a;
    }

    @Nullable
    public Drawable getStatusBarBackground() {
        return this.f4358r;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void h(G.e eVar, Rect rect, int i9, int i10) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i9) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i10) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin));
        rect.set(max, max2, i9 + max, i10 + max2);
    }

    public final void i(View view, Rect rect, boolean z8) {
        if (!view.isLayoutRequested() && view.getVisibility() != 8) {
            if (z8) {
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
        l lVar = (l) this.f4346c.b;
        int i9 = lVar.f24086d;
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < i9; i10++) {
            ArrayList arrayList2 = (ArrayList) lVar.m(i10);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(lVar.h(i10));
            }
        }
        ArrayList arrayList3 = this.f4348f;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final void k(View view, Rect rect) {
        ThreadLocal threadLocal = h.f1240a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = h.f1240a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        h.a(this, view, matrix);
        ThreadLocal threadLocal3 = h.b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final int m(int i9) {
        int[] iArr = this.f4353k;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i9);
            return 0;
        }
        if (i9 >= 0 && i9 < iArr.length) {
            return iArr[i9];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i9 + " out of range for " + this);
        return 0;
    }

    public final boolean o(View view, int i9, int i10) {
        e eVar = f4345z;
        Rect g9 = g();
        k(view, g9);
        try {
            return g9.contains(i9, i10);
        } finally {
            g9.setEmpty();
            eVar.b(g9);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t(false);
        if (this.f4355o) {
            if (this.f4354n == null) {
                this.f4354n = new f(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f4354n);
        }
        if (this.f4356p == null && ViewCompat.getFitsSystemWindows(this)) {
            ViewCompat.requestApplyInsets(this);
        }
        this.f4352j = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t(false);
        if (this.f4355o && this.f4354n != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f4354n);
        }
        View view = this.m;
        if (view != null) {
            e(view, 0);
        }
        this.f4352j = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i9;
        super.onDraw(canvas);
        if (this.f4357q && this.f4358r != null) {
            G0 g02 = this.f4356p;
            if (g02 != null) {
                i9 = g02.d();
            } else {
                i9 = 0;
            }
            if (i9 > 0) {
                this.f4358r.setBounds(0, 0, getWidth(), i9);
                this.f4358r.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            t(true);
        }
        boolean r9 = r(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            t(true);
        }
        return r9;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i9, int i10, int i11, int i12) {
        G.b bVar;
        int layoutDirection = ViewCompat.getLayoutDirection(this);
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            View view = (View) arrayList.get(i13);
            if (view.getVisibility() != 8 && ((bVar = ((G.e) view.getLayoutParams()).f1225a) == null || !bVar.k(this, view, layoutDirection))) {
                q(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x018a, code lost:
    
        if (r0.l(r30, r19, r25, r20, r26) == false) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r31, int r32) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f9, float f10, boolean z8) {
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                G.e eVar = (G.e) childAt.getLayoutParams();
                if (eVar.a(0)) {
                    G.b bVar = eVar.f1225a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f9, float f10) {
        G.b bVar;
        int childCount = getChildCount();
        boolean z8 = false;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                G.e eVar = (G.e) childAt.getLayoutParams();
                if (eVar.a(0) && (bVar = eVar.f1225a) != null) {
                    z8 |= bVar.m(view);
                }
            }
        }
        return z8;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i9, int i10, int[] iArr) {
        f(view, i9, i10, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i9, int i10, int i11, int i12) {
        b(view, i9, i10, i11, i12, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i9) {
        d(view, view2, i9, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.b);
        SparseArray sparseArray = gVar.f1239d;
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            int id = childAt.getId();
            G.b bVar = n(childAt).f1225a;
            if (id != -1 && bVar != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                bVar.q(childAt, parcelable2);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [G.g, android.os.Parcelable, b0.b] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable r9;
        ?? abstractC0547b = new AbstractC0547b(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            int id = childAt.getId();
            G.b bVar = ((G.e) childAt.getLayoutParams()).f1225a;
            if (id != -1 && bVar != null && (r9 = bVar.r(childAt)) != null) {
                sparseArray.append(id, r9);
            }
        }
        abstractC0547b.f1239d = sparseArray;
        return abstractC0547b;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i9) {
        return c(view, view2, i9, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        e(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r3 != false) goto L9;
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
            android.view.View r3 = r0.l
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L17
            boolean r3 = r0.r(r1, r4)
            if (r3 == 0) goto L15
            goto L18
        L15:
            r6 = r5
            goto L2a
        L17:
            r3 = r5
        L18:
            android.view.View r6 = r0.l
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            G.e r6 = (G.e) r6
            G.b r6 = r6.f1225a
            if (r6 == 0) goto L15
            android.view.View r7 = r0.l
            boolean r6 = r6.u(r7, r1)
        L2a:
            android.view.View r7 = r0.l
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

    /* JADX WARN: Removed duplicated region for block: B:107:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x027e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p(int r26) {
        /*
            Method dump skipped, instructions count: 736
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.p(int):void");
    }

    public final void q(View view, int i9) {
        Rect g9;
        Rect g10;
        int i10;
        G.e eVar = (G.e) view.getLayoutParams();
        View view2 = eVar.f1234k;
        if (view2 == null && eVar.f1229f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        e eVar2 = f4345z;
        if (view2 != null) {
            g9 = g();
            g10 = g();
            try {
                k(view2, g9);
                G.e eVar3 = (G.e) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                l(i9, g9, g10, eVar3, measuredWidth, measuredHeight);
                h(eVar3, g10, measuredWidth, measuredHeight);
                view.layout(g10.left, g10.top, g10.right, g10.bottom);
                return;
            } finally {
                g9.setEmpty();
                eVar2.b(g9);
                g10.setEmpty();
                eVar2.b(g10);
            }
        }
        int i11 = eVar.f1228e;
        if (i11 >= 0) {
            G.e eVar4 = (G.e) view.getLayoutParams();
            int i12 = eVar4.f1226c;
            if (i12 == 0) {
                i12 = 8388661;
            }
            int absoluteGravity = Gravity.getAbsoluteGravity(i12, i9);
            int i13 = absoluteGravity & 7;
            int i14 = absoluteGravity & 112;
            int width = getWidth();
            int height = getHeight();
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight2 = view.getMeasuredHeight();
            if (i9 == 1) {
                i11 = width - i11;
            }
            int m = m(i11) - measuredWidth2;
            if (i13 != 1) {
                if (i13 == 5) {
                    m += measuredWidth2;
                }
            } else {
                m += measuredWidth2 / 2;
            }
            if (i14 != 16) {
                if (i14 != 80) {
                    i10 = 0;
                } else {
                    i10 = measuredHeight2;
                }
            } else {
                i10 = measuredHeight2 / 2;
            }
            int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar4).leftMargin, Math.min(m, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) eVar4).rightMargin));
            int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar4).topMargin, Math.min(i10, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) eVar4).bottomMargin));
            view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
            return;
        }
        G.e eVar5 = (G.e) view.getLayoutParams();
        g9 = g();
        g9.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar5).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar5).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) eVar5).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) eVar5).bottomMargin);
        if (this.f4356p != null && ViewCompat.getFitsSystemWindows(this) && !ViewCompat.getFitsSystemWindows(view)) {
            g9.left = this.f4356p.b() + g9.left;
            g9.top = this.f4356p.d() + g9.top;
            g9.right -= this.f4356p.c();
            g9.bottom -= this.f4356p.a();
        }
        g10 = g();
        int i15 = eVar5.f1226c;
        if ((i15 & 7) == 0) {
            i15 |= 8388611;
        }
        if ((i15 & 112) == 0) {
            i15 |= 48;
        }
        Gravity.apply(i15, view.getMeasuredWidth(), view.getMeasuredHeight(), g9, g10, i9);
        view.layout(g10.left, g10.top, g10.right, g10.bottom);
    }

    public final boolean r(MotionEvent motionEvent, int i9) {
        boolean z8;
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f4347d;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i11 = childCount - 1; i11 >= 0; i11--) {
            if (isChildrenDrawingOrderEnabled) {
                i10 = getChildDrawingOrder(childCount, i11);
            } else {
                i10 = i11;
            }
            arrayList.add(getChildAt(i10));
        }
        c cVar = f4344y;
        if (cVar != null) {
            Collections.sort(arrayList, cVar);
        }
        int size = arrayList.size();
        MotionEvent motionEvent2 = null;
        boolean z9 = false;
        boolean z10 = false;
        for (int i12 = 0; i12 < size; i12++) {
            View view = (View) arrayList.get(i12);
            G.e eVar = (G.e) view.getLayoutParams();
            G.b bVar = eVar.f1225a;
            if ((z9 || z10) && actionMasked != 0) {
                if (bVar != null) {
                    if (motionEvent2 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i9 != 0) {
                        if (i9 == 1) {
                            bVar.u(view, motionEvent2);
                        }
                    } else {
                        bVar.j(this, view, motionEvent2);
                    }
                }
            } else {
                if (!z9 && bVar != null) {
                    if (i9 != 0) {
                        if (i9 == 1) {
                            z9 = bVar.u(view, motionEvent);
                        }
                    } else {
                        z9 = bVar.j(this, view, motionEvent);
                    }
                    if (z9) {
                        this.l = view;
                    }
                }
                if (eVar.f1225a == null) {
                    eVar.m = false;
                }
                boolean z11 = eVar.m;
                if (z11) {
                    z8 = true;
                } else {
                    eVar.m = z11;
                    z8 = z11;
                }
                if (z8 && !z11) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z8 && !z10) {
                    break;
                }
            }
        }
        arrayList.clear();
        return z9;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z8) {
        G.b bVar = ((G.e) view.getLayoutParams()).f1225a;
        if (bVar != null) {
            bVar.p(this, view);
        }
        return super.requestChildRectangleOnScreen(view, rect, z8);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z8) {
        super.requestDisallowInterceptTouchEvent(z8);
        if (z8 && !this.f4351i) {
            t(false);
            this.f4351i = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0142, code lost:
    
        throw new java.lang.IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s() {
        /*
            Method dump skipped, instructions count: 398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.s():void");
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z8) {
        super.setFitsSystemWindows(z8);
        w();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f4359s = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(@Nullable Drawable drawable) {
        boolean z8;
        Drawable drawable2 = this.f4358r;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f4358r = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f4358r.setState(getDrawableState());
                }
                M.b.b(this.f4358r, ViewCompat.getLayoutDirection(this));
                Drawable drawable4 = this.f4358r;
                if (getVisibility() == 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                drawable4.setVisible(z8, false);
                this.f4358r.setCallback(this);
            }
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public void setStatusBarBackgroundColor(int i9) {
        setStatusBarBackground(new ColorDrawable(i9));
    }

    public void setStatusBarBackgroundResource(int i9) {
        Drawable drawable;
        if (i9 != 0) {
            drawable = I.h.getDrawable(getContext(), i9);
        } else {
            drawable = null;
        }
        setStatusBarBackground(drawable);
    }

    @Override // android.view.View
    public void setVisibility(int i9) {
        boolean z8;
        super.setVisibility(i9);
        if (i9 == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        Drawable drawable = this.f4358r;
        if (drawable != null && drawable.isVisible() != z8) {
            this.f4358r.setVisible(z8, false);
        }
    }

    public final void t(boolean z8) {
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            G.b bVar = ((G.e) childAt.getLayoutParams()).f1225a;
            if (bVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z8) {
                    bVar.j(this, childAt, obtain);
                } else {
                    bVar.u(childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            ((G.e) getChildAt(i10).getLayoutParams()).m = false;
        }
        this.l = null;
        this.f4351i = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f4358r) {
            return false;
        }
        return true;
    }

    public final void w() {
        if (ViewCompat.getFitsSystemWindows(this)) {
            if (this.f4360t == null) {
                this.f4360t = new C2400c(this, 4);
            }
            ViewCompat.setOnApplyWindowInsetsListener(this, this.f4360t);
            setSystemUiVisibility(1280);
            return;
        }
        ViewCompat.setOnApplyWindowInsetsListener(this, null);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof G.e) {
            return new G.e((G.e) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new G.e((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new G.e(layoutParams);
    }
}
