package com.google.android.material.bottomsheet;

import B3.c;
import B3.f;
import B3.j;
import B3.l;
import B3.r;
import G.b;
import G.e;
import L3.m;
import M3.h;
import R3.g;
import R3.k;
import U.d;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Property;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import c0.C0585d;
import com.google.ar.core.ImageMetadata;
import com.mbridge.msdk.foundation.entity.o;
import com.tools.arruler.photomeasure.camera.ruler.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import p0.a;
import w3.AbstractC2861a;
import x0.AbstractC2914a;
import x3.AbstractC2920a;

/* loaded from: classes2.dex */
public class BottomSheetBehavior<V extends View> extends b implements M3.b {

    /* renamed from: A, reason: collision with root package name */
    public final l f13914A;

    /* renamed from: B, reason: collision with root package name */
    public final ValueAnimator f13915B;

    /* renamed from: C, reason: collision with root package name */
    public final int f13916C;

    /* renamed from: D, reason: collision with root package name */
    public int f13917D;

    /* renamed from: E, reason: collision with root package name */
    public int f13918E;

    /* renamed from: F, reason: collision with root package name */
    public final float f13919F;

    /* renamed from: G, reason: collision with root package name */
    public int f13920G;

    /* renamed from: H, reason: collision with root package name */
    public final float f13921H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f13922I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f13923J;

    /* renamed from: K, reason: collision with root package name */
    public final boolean f13924K;

    /* renamed from: L, reason: collision with root package name */
    public int f13925L;

    /* renamed from: M, reason: collision with root package name */
    public C0585d f13926M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f13927N;
    public int O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f13928P;

    /* renamed from: Q, reason: collision with root package name */
    public final float f13929Q;

    /* renamed from: R, reason: collision with root package name */
    public int f13930R;

    /* renamed from: S, reason: collision with root package name */
    public int f13931S;

    /* renamed from: T, reason: collision with root package name */
    public int f13932T;

    /* renamed from: U, reason: collision with root package name */
    public WeakReference f13933U;

    /* renamed from: V, reason: collision with root package name */
    public WeakReference f13934V;

    /* renamed from: W, reason: collision with root package name */
    public final ArrayList f13935W;

    /* renamed from: X, reason: collision with root package name */
    public VelocityTracker f13936X;

    /* renamed from: Y, reason: collision with root package name */
    public h f13937Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f13938Z;

    /* renamed from: a, reason: collision with root package name */
    public final int f13939a;

    /* renamed from: a0, reason: collision with root package name */
    public int f13940a0;
    public boolean b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f13941b0;

    /* renamed from: c, reason: collision with root package name */
    public final float f13942c;

    /* renamed from: c0, reason: collision with root package name */
    public HashMap f13943c0;

    /* renamed from: d, reason: collision with root package name */
    public final int f13944d;

    /* renamed from: d0, reason: collision with root package name */
    public final SparseIntArray f13945d0;

    /* renamed from: e, reason: collision with root package name */
    public int f13946e;

    /* renamed from: e0, reason: collision with root package name */
    public final f f13947e0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13948f;

    /* renamed from: g, reason: collision with root package name */
    public int f13949g;

    /* renamed from: h, reason: collision with root package name */
    public final int f13950h;

    /* renamed from: i, reason: collision with root package name */
    public final g f13951i;

    /* renamed from: j, reason: collision with root package name */
    public final ColorStateList f13952j;

    /* renamed from: k, reason: collision with root package name */
    public final int f13953k;
    public final int l;
    public int m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f13954n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f13955o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f13956p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f13957q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f13958r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f13959s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f13960t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f13961u;

    /* renamed from: v, reason: collision with root package name */
    public int f13962v;

    /* renamed from: w, reason: collision with root package name */
    public int f13963w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f13964x;

    /* renamed from: y, reason: collision with root package name */
    public final k f13965y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f13966z;

    public BottomSheetBehavior() {
        this.f13939a = 0;
        this.b = true;
        this.f13953k = -1;
        this.l = -1;
        this.f13914A = new l(this);
        this.f13919F = 0.5f;
        this.f13921H = -1.0f;
        this.f13924K = true;
        this.f13925L = 4;
        this.f13929Q = 0.1f;
        this.f13935W = new ArrayList();
        this.f13940a0 = -1;
        this.f13945d0 = new SparseIntArray();
        this.f13947e0 = new f(this, 0);
    }

    public static BottomSheetBehavior A(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof e) {
            b bVar = ((e) layoutParams).f1225a;
            if (bVar instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) bVar;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    public static int B(int i9, int i10, int i11, int i12) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i9, i10, i12);
        if (i11 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode != 1073741824) {
            if (size != 0) {
                i11 = Math.min(size, i11);
            }
            return View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(size, i11), 1073741824);
    }

    public static View z(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (ViewCompat.isNestedScrollingEnabled(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                View z8 = z(viewGroup.getChildAt(i9));
                if (z8 != null) {
                    return z8;
                }
            }
        }
        return null;
    }

    public final int C() {
        int i9;
        if (this.b) {
            return this.f13917D;
        }
        int i10 = this.f13916C;
        if (this.f13958r) {
            i9 = 0;
        } else {
            i9 = this.f13963w;
        }
        return Math.max(i10, i9);
    }

    public final int D(int i9) {
        if (i9 != 3) {
            if (i9 != 4) {
                if (i9 != 5) {
                    if (i9 == 6) {
                        return this.f13918E;
                    }
                    throw new IllegalArgumentException(o.h(i9, "Invalid state to get top offset: "));
                }
                return this.f13932T;
            }
            return this.f13920G;
        }
        return C();
    }

    public final boolean E() {
        WeakReference weakReference = this.f13933U;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        int[] iArr = new int[2];
        ((View) this.f13933U.get()).getLocationOnScreen(iArr);
        if (iArr[1] != 0) {
            return false;
        }
        return true;
    }

    public final void F(boolean z8) {
        if (this.f13922I != z8) {
            this.f13922I = z8;
            if (!z8 && this.f13925L == 5) {
                H(4);
            }
            L();
        }
    }

    public final void G(int i9) {
        if (i9 == -1) {
            if (!this.f13948f) {
                this.f13948f = true;
            } else {
                return;
            }
        } else if (this.f13948f || this.f13946e != i9) {
            this.f13948f = false;
            this.f13946e = Math.max(0, i9);
        } else {
            return;
        }
        O();
    }

    public final void H(int i9) {
        String str;
        int i10;
        if (i9 != 1 && i9 != 2) {
            if (!this.f13922I && i9 == 5) {
                o.z(i9, "Cannot set state: ", "BottomSheetBehavior");
                return;
            }
            if (i9 == 6 && this.b && D(i9) <= this.f13917D) {
                i10 = 3;
            } else {
                i10 = i9;
            }
            WeakReference weakReference = this.f13933U;
            if (weakReference != null && weakReference.get() != null) {
                View view = (View) this.f13933U.get();
                B3.b bVar = new B3.b(this, view, i10);
                ViewParent parent = view.getParent();
                if (parent != null && parent.isLayoutRequested() && ViewCompat.isAttachedToWindow(view)) {
                    view.post(bVar);
                    return;
                } else {
                    bVar.run();
                    return;
                }
            }
            I(i9);
            return;
        }
        StringBuilder sb = new StringBuilder("STATE_");
        if (i9 == 1) {
            str = "DRAGGING";
        } else {
            str = "SETTLING";
        }
        throw new IllegalArgumentException(AbstractC2914a.h(sb, str, " should not be set externally."));
    }

    public final void I(int i9) {
        View view;
        if (this.f13925L == i9) {
            return;
        }
        this.f13925L = i9;
        if (i9 != 4 && i9 != 3 && i9 != 6) {
            boolean z8 = this.f13922I;
        }
        WeakReference weakReference = this.f13933U;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i10 = 0;
        if (i9 == 3) {
            N(true);
        } else if (i9 == 6 || i9 == 5 || i9 == 4) {
            N(false);
        }
        M(i9, true);
        while (true) {
            ArrayList arrayList = this.f13935W;
            if (i10 < arrayList.size()) {
                ((B3.h) arrayList.get(i10)).c(view, i9);
                i10++;
            } else {
                L();
                return;
            }
        }
    }

    public final boolean J(View view, float f9) {
        if (this.f13923J) {
            return true;
        }
        if (view.getTop() < this.f13920G) {
            return false;
        }
        if (Math.abs(((f9 * this.f13929Q) + view.getTop()) - this.f13920G) / x() > 0.5f) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (r3 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r1.o(r3.getLeft(), r0) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0032, code lost:
    
        I(2);
        M(r4, true);
        r2.f13914A.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void K(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            int r0 = r2.D(r4)
            c0.d r1 = r2.f13926M
            if (r1 == 0) goto L40
            if (r5 == 0) goto L15
            int r3 = r3.getLeft()
            boolean r3 = r1.o(r3, r0)
            if (r3 == 0) goto L40
            goto L32
        L15:
            int r5 = r3.getLeft()
            r1.f5373r = r3
            r3 = -1
            r1.f5360c = r3
            r3 = 0
            boolean r3 = r1.h(r5, r0, r3, r3)
            if (r3 != 0) goto L30
            int r5 = r1.f5359a
            if (r5 != 0) goto L30
            android.view.View r5 = r1.f5373r
            if (r5 == 0) goto L30
            r5 = 0
            r1.f5373r = r5
        L30:
            if (r3 == 0) goto L40
        L32:
            r3 = 2
            r2.I(r3)
            r3 = 1
            r2.M(r4, r3)
            B3.l r3 = r2.f13914A
            r3.a(r4)
            goto L43
        L40:
            r2.I(r4)
        L43:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.K(android.view.View, int, boolean):void");
    }

    public final void L() {
        View view;
        WeakReference weakReference = this.f13933U;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            ViewCompat.removeAccessibilityAction(view, ImageMetadata.LENS_APERTURE);
            ViewCompat.removeAccessibilityAction(view, 262144);
            ViewCompat.removeAccessibilityAction(view, 1048576);
            SparseIntArray sparseIntArray = this.f13945d0;
            int i9 = sparseIntArray.get(0, -1);
            if (i9 != -1) {
                ViewCompat.removeAccessibilityAction(view, i9);
                sparseIntArray.delete(0);
            }
            int i10 = 6;
            if (!this.b && this.f13925L != 6) {
                sparseIntArray.put(0, ViewCompat.addAccessibilityAction(view, view.getResources().getString(R.string.bottomsheet_action_expand_halfway), new B3.g(i10, 0, this)));
            }
            if (this.f13922I) {
                int i11 = 5;
                if (this.f13925L != 5) {
                    ViewCompat.replaceAccessibilityAction(view, d.f3091j, null, new B3.g(i11, 0, this));
                }
            }
            int i12 = this.f13925L;
            int i13 = 4;
            int i14 = 3;
            if (i12 != 3) {
                if (i12 != 4) {
                    if (i12 == 6) {
                        ViewCompat.replaceAccessibilityAction(view, d.f3090i, null, new B3.g(i13, 0, this));
                        ViewCompat.replaceAccessibilityAction(view, d.f3089h, null, new B3.g(i14, 0, this));
                        return;
                    }
                    return;
                }
                if (this.b) {
                    i10 = 3;
                }
                ViewCompat.replaceAccessibilityAction(view, d.f3089h, null, new B3.g(i10, 0, this));
                return;
            }
            if (this.b) {
                i10 = 4;
            }
            ViewCompat.replaceAccessibilityAction(view, d.f3090i, null, new B3.g(i10, 0, this));
        }
    }

    public final void M(int i9, boolean z8) {
        boolean z9;
        g gVar = this.f13951i;
        ValueAnimator valueAnimator = this.f13915B;
        if (i9 == 2) {
            return;
        }
        if (this.f13925L == 3 && (this.f13964x || E())) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (this.f13966z != z9 && gVar != null) {
            this.f13966z = z9;
            float f9 = 1.0f;
            if (z8 && valueAnimator != null) {
                if (valueAnimator.isRunning()) {
                    valueAnimator.reverse();
                    return;
                }
                float f10 = gVar.b.f2651j;
                if (z9) {
                    f9 = w();
                }
                valueAnimator.setFloatValues(f10, f9);
                valueAnimator.start();
                return;
            }
            if (valueAnimator != null && valueAnimator.isRunning()) {
                valueAnimator.cancel();
            }
            if (this.f13966z) {
                f9 = w();
            }
            R3.f fVar = gVar.b;
            if (fVar.f2651j != f9) {
                fVar.f2651j = f9;
                gVar.f2665g = true;
                gVar.invalidateSelf();
            }
        }
    }

    public final void N(boolean z8) {
        WeakReference weakReference = this.f13933U;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (!(parent instanceof CoordinatorLayout)) {
            return;
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
        int childCount = coordinatorLayout.getChildCount();
        if (z8) {
            if (this.f13943c0 == null) {
                this.f13943c0 = new HashMap(childCount);
            } else {
                return;
            }
        }
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = coordinatorLayout.getChildAt(i9);
            if (childAt != this.f13933U.get() && z8) {
                this.f13943c0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
            }
        }
        if (!z8) {
            this.f13943c0 = null;
        }
    }

    public final void O() {
        View view;
        if (this.f13933U != null) {
            v();
            if (this.f13925L == 4 && (view = (View) this.f13933U.get()) != null) {
                view.requestLayout();
            }
        }
    }

    @Override // M3.b
    public final void a(f.b bVar) {
        h hVar = this.f13937Y;
        if (hVar == null) {
            return;
        }
        hVar.f1991f = bVar;
    }

    @Override // M3.b
    public final void b() {
        int i9 = 0;
        h hVar = this.f13937Y;
        if (hVar == null) {
            return;
        }
        f.b bVar = hVar.f1991f;
        hVar.f1991f = null;
        int i10 = 4;
        if (bVar != null && Build.VERSION.SDK_INT >= 34) {
            boolean z8 = this.f13922I;
            int i11 = hVar.f1989d;
            int i12 = hVar.f1988c;
            float f9 = bVar.f20211c;
            if (z8) {
                c cVar = new c(this, i9);
                View view = hVar.b;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view.getScaleY() * view.getHeight());
                ofFloat.setInterpolator(new a(1));
                ofFloat.setDuration(AbstractC2920a.c(f9, i12, i11));
                ofFloat.addListener(new c(hVar, 2));
                ofFloat.addListener(cVar);
                ofFloat.start();
                return;
            }
            AnimatorSet a6 = hVar.a();
            a6.setDuration(AbstractC2920a.c(f9, i12, i11));
            a6.start();
            H(4);
            return;
        }
        if (this.f13922I) {
            i10 = 5;
        }
        H(i10);
    }

    @Override // M3.b
    public final void c(f.b bVar) {
        h hVar = this.f13937Y;
        if (hVar == null) {
            return;
        }
        if (hVar.f1991f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        f.b bVar2 = hVar.f1991f;
        hVar.f1991f = bVar;
        if (bVar2 != null) {
            hVar.b(bVar.f20211c);
        }
    }

    @Override // M3.b
    public final void d() {
        h hVar = this.f13937Y;
        if (hVar == null) {
            return;
        }
        if (hVar.f1991f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        f.b bVar = hVar.f1991f;
        hVar.f1991f = null;
        if (bVar != null) {
            AnimatorSet a6 = hVar.a();
            a6.setDuration(hVar.f1990e);
            a6.start();
        }
    }

    @Override // G.b
    public final void g(e eVar) {
        this.f13933U = null;
        this.f13926M = null;
        this.f13937Y = null;
    }

    @Override // G.b
    public final void i() {
        this.f13933U = null;
        this.f13926M = null;
        this.f13937Y = null;
    }

    @Override // G.b
    public final boolean j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z8;
        View view2;
        int i9;
        C0585d c0585d;
        if (view.isShown() && this.f13924K) {
            int actionMasked = motionEvent.getActionMasked();
            View view3 = null;
            if (actionMasked == 0) {
                this.f13938Z = -1;
                this.f13940a0 = -1;
                VelocityTracker velocityTracker = this.f13936X;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f13936X = null;
                }
            }
            if (this.f13936X == null) {
                this.f13936X = VelocityTracker.obtain();
            }
            this.f13936X.addMovement(motionEvent);
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    this.f13941b0 = false;
                    this.f13938Z = -1;
                    if (this.f13927N) {
                        this.f13927N = false;
                        return false;
                    }
                }
            } else {
                int x9 = (int) motionEvent.getX();
                this.f13940a0 = (int) motionEvent.getY();
                if (this.f13925L != 2) {
                    WeakReference weakReference = this.f13934V;
                    if (weakReference != null) {
                        view2 = (View) weakReference.get();
                    } else {
                        view2 = null;
                    }
                    if (view2 != null && coordinatorLayout.o(view2, x9, this.f13940a0)) {
                        this.f13938Z = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.f13941b0 = true;
                    }
                }
                if (this.f13938Z == -1 && !coordinatorLayout.o(view, x9, this.f13940a0)) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                this.f13927N = z8;
            }
            if (!this.f13927N && (c0585d = this.f13926M) != null && c0585d.p(motionEvent)) {
                return true;
            }
            WeakReference weakReference2 = this.f13934V;
            if (weakReference2 != null) {
                view3 = (View) weakReference2.get();
            }
            if (actionMasked != 2 || view3 == null || this.f13927N || this.f13925L == 1 || coordinatorLayout.o(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f13926M == null || (i9 = this.f13940a0) == -1 || Math.abs(i9 - motionEvent.getY()) <= this.f13926M.b) {
                return false;
            }
            return true;
        }
        this.f13927N = true;
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [L3.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [B3.e, java.lang.Object] */
    @Override // G.b
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, int i9) {
        boolean z8;
        if (ViewCompat.getFitsSystemWindows(coordinatorLayout) && !ViewCompat.getFitsSystemWindows(view)) {
            view.setFitsSystemWindows(true);
        }
        int i10 = 0;
        if (this.f13933U == null) {
            this.f13949g = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            if (Build.VERSION.SDK_INT >= 29 && !this.f13954n && !this.f13948f) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (this.f13955o || this.f13956p || this.f13957q || this.f13959s || this.f13960t || this.f13961u || z8) {
                ?? obj = new Object();
                obj.b = this;
                obj.f283a = z8;
                int paddingStart = ViewCompat.getPaddingStart(view);
                view.getPaddingTop();
                int paddingEnd = ViewCompat.getPaddingEnd(view);
                int paddingBottom = view.getPaddingBottom();
                ?? obj2 = new Object();
                obj2.f1804a = paddingStart;
                obj2.b = paddingEnd;
                obj2.f1805c = paddingBottom;
                ViewCompat.setOnApplyWindowInsetsListener(view, new a7.b(6, obj, obj2));
                if (ViewCompat.isAttachedToWindow(view)) {
                    ViewCompat.requestApplyInsets(view);
                } else {
                    view.addOnAttachStateChangeListener(new m(0));
                }
            }
            ViewCompat.setWindowInsetsAnimationCallback(view, new r(view));
            this.f13933U = new WeakReference(view);
            this.f13937Y = new h(view);
            g gVar = this.f13951i;
            if (gVar != null) {
                ViewCompat.setBackground(view, gVar);
                g gVar2 = this.f13951i;
                float f9 = this.f13921H;
                if (f9 == -1.0f) {
                    f9 = ViewCompat.getElevation(view);
                }
                gVar2.j(f9);
            } else {
                ColorStateList colorStateList = this.f13952j;
                if (colorStateList != null) {
                    ViewCompat.setBackgroundTintList(view, colorStateList);
                }
            }
            L();
            if (ViewCompat.getImportantForAccessibility(view) == 0) {
                ViewCompat.setImportantForAccessibility(view, 1);
            }
        }
        if (this.f13926M == null) {
            this.f13926M = new C0585d(coordinatorLayout.getContext(), coordinatorLayout, this.f13947e0);
        }
        int top = view.getTop();
        coordinatorLayout.q(view, i9);
        this.f13931S = coordinatorLayout.getWidth();
        this.f13932T = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f13930R = height;
        int i11 = this.f13932T;
        int i12 = i11 - height;
        int i13 = this.f13963w;
        if (i12 < i13) {
            if (this.f13958r) {
                int i14 = this.l;
                if (i14 != -1) {
                    i11 = Math.min(i11, i14);
                }
                this.f13930R = i11;
            } else {
                int i15 = i11 - i13;
                int i16 = this.l;
                if (i16 != -1) {
                    i15 = Math.min(i15, i16);
                }
                this.f13930R = i15;
            }
        }
        this.f13917D = Math.max(0, this.f13932T - this.f13930R);
        this.f13918E = (int) ((1.0f - this.f13919F) * this.f13932T);
        v();
        int i17 = this.f13925L;
        if (i17 == 3) {
            ViewCompat.offsetTopAndBottom(view, C());
        } else if (i17 == 6) {
            ViewCompat.offsetTopAndBottom(view, this.f13918E);
        } else if (this.f13922I && i17 == 5) {
            ViewCompat.offsetTopAndBottom(view, this.f13932T);
        } else if (i17 == 4) {
            ViewCompat.offsetTopAndBottom(view, this.f13920G);
        } else if (i17 == 1 || i17 == 2) {
            ViewCompat.offsetTopAndBottom(view, top - view.getTop());
        }
        M(this.f13925L, false);
        this.f13934V = new WeakReference(z(view));
        while (true) {
            ArrayList arrayList = this.f13935W;
            if (i10 >= arrayList.size()) {
                return true;
            }
            ((B3.h) arrayList.get(i10)).a(view);
            i10++;
        }
    }

    @Override // G.b
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i9, int i10, int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(B(i9, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, this.f13953k, marginLayoutParams.width), B(i11, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.l, marginLayoutParams.height));
        return true;
    }

    @Override // G.b
    public final boolean m(View view) {
        WeakReference weakReference = this.f13934V;
        if (weakReference == null || view != weakReference.get() || this.f13925L == 3) {
            return false;
        }
        return true;
    }

    @Override // G.b
    public final void n(CoordinatorLayout coordinatorLayout, View view, View view2, int i9, int i10, int[] iArr, int i11) {
        View view3;
        if (i11 == 1) {
            return;
        }
        WeakReference weakReference = this.f13934V;
        if (weakReference != null) {
            view3 = (View) weakReference.get();
        } else {
            view3 = null;
        }
        if (view2 != view3) {
            return;
        }
        int top = view.getTop();
        int i12 = top - i10;
        if (i10 > 0) {
            if (i12 < C()) {
                int C8 = top - C();
                iArr[1] = C8;
                ViewCompat.offsetTopAndBottom(view, -C8);
                I(3);
            } else {
                if (!this.f13924K) {
                    return;
                }
                iArr[1] = i10;
                ViewCompat.offsetTopAndBottom(view, -i10);
                I(1);
            }
        } else if (i10 < 0 && !view2.canScrollVertically(-1)) {
            int i13 = this.f13920G;
            if (i12 > i13 && !this.f13922I) {
                int i14 = top - i13;
                iArr[1] = i14;
                ViewCompat.offsetTopAndBottom(view, -i14);
                I(4);
            } else {
                if (!this.f13924K) {
                    return;
                }
                iArr[1] = i10;
                ViewCompat.offsetTopAndBottom(view, -i10);
                I(1);
            }
        }
        y(view.getTop());
        this.O = i10;
        this.f13928P = true;
    }

    @Override // G.b
    public final void q(View view, Parcelable parcelable) {
        j jVar = (j) parcelable;
        int i9 = this.f13939a;
        if (i9 != 0) {
            if (i9 == -1 || (i9 & 1) == 1) {
                this.f13946e = jVar.f289f;
            }
            if (i9 == -1 || (i9 & 2) == 2) {
                this.b = jVar.f290g;
            }
            if (i9 == -1 || (i9 & 4) == 4) {
                this.f13922I = jVar.f291h;
            }
            if (i9 == -1 || (i9 & 8) == 8) {
                this.f13923J = jVar.f292i;
            }
        }
        int i10 = jVar.f288d;
        if (i10 != 1 && i10 != 2) {
            this.f13925L = i10;
        } else {
            this.f13925L = 4;
        }
    }

    @Override // G.b
    public final Parcelable r(View view) {
        return new j(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // G.b
    public final boolean s(View view, int i9, int i10) {
        this.O = 0;
        this.f13928P = false;
        if ((i9 & 2) == 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (r4.getTop() <= r3.f13918E) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
    
        if (java.lang.Math.abs(r5 - r3.f13917D) < java.lang.Math.abs(r5 - r3.f13920G)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0080, code lost:
    
        if (r5 < java.lang.Math.abs(r5 - r3.f13920G)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0090, code lost:
    
        if (java.lang.Math.abs(r5 - r2) < java.lang.Math.abs(r5 - r3.f13920G)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ac, code lost:
    
        if (java.lang.Math.abs(r5 - r3.f13918E) < java.lang.Math.abs(r5 - r3.f13920G)) goto L50;
     */
    @Override // G.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(android.view.View r4, android.view.View r5, int r6) {
        /*
            r3 = this;
            int r6 = r4.getTop()
            int r0 = r3.C()
            r1 = 3
            if (r6 != r0) goto Lf
            r3.I(r1)
            return
        Lf:
            java.lang.ref.WeakReference r6 = r3.f13934V
            if (r6 == 0) goto Lb5
            java.lang.Object r6 = r6.get()
            if (r5 != r6) goto Lb5
            boolean r5 = r3.f13928P
            if (r5 != 0) goto L1f
            goto Lb5
        L1f:
            int r5 = r3.O
            r6 = 6
            if (r5 <= 0) goto L34
            boolean r5 = r3.b
            if (r5 == 0) goto L2a
            goto Laf
        L2a:
            int r5 = r4.getTop()
            int r0 = r3.f13918E
            if (r5 <= r0) goto Laf
            goto Lae
        L34:
            boolean r5 = r3.f13922I
            if (r5 == 0) goto L55
            android.view.VelocityTracker r5 = r3.f13936X
            if (r5 != 0) goto L3e
            r5 = 0
            goto L4d
        L3e:
            r0 = 1000(0x3e8, float:1.401E-42)
            float r2 = r3.f13942c
            r5.computeCurrentVelocity(r0, r2)
            android.view.VelocityTracker r5 = r3.f13936X
            int r0 = r3.f13938Z
            float r5 = r5.getYVelocity(r0)
        L4d:
            boolean r5 = r3.J(r4, r5)
            if (r5 == 0) goto L55
            r1 = 5
            goto Laf
        L55:
            int r5 = r3.O
            r0 = 4
            if (r5 != 0) goto L93
            int r5 = r4.getTop()
            boolean r2 = r3.b
            if (r2 == 0) goto L74
            int r6 = r3.f13917D
            int r6 = r5 - r6
            int r6 = java.lang.Math.abs(r6)
            int r2 = r3.f13920G
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r6 >= r5) goto L97
            goto Laf
        L74:
            int r2 = r3.f13918E
            if (r5 >= r2) goto L83
            int r0 = r3.f13920G
            int r0 = r5 - r0
            int r0 = java.lang.Math.abs(r0)
            if (r5 >= r0) goto Lae
            goto Laf
        L83:
            int r1 = r5 - r2
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.f13920G
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r1 >= r5) goto L97
            goto Lae
        L93:
            boolean r5 = r3.b
            if (r5 == 0) goto L99
        L97:
            r1 = r0
            goto Laf
        L99:
            int r5 = r4.getTop()
            int r1 = r3.f13918E
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.f13920G
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r1 >= r5) goto L97
        Lae:
            r1 = r6
        Laf:
            r5 = 0
            r3.K(r4, r1, r5)
            r3.f13928P = r5
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.t(android.view.View, android.view.View, int):void");
    }

    @Override // G.b
    public final boolean u(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i9 = this.f13925L;
        if (i9 == 1 && actionMasked == 0) {
            return true;
        }
        C0585d c0585d = this.f13926M;
        if (c0585d != null && (this.f13924K || i9 == 1)) {
            c0585d.j(motionEvent);
        }
        if (actionMasked == 0) {
            this.f13938Z = -1;
            this.f13940a0 = -1;
            VelocityTracker velocityTracker = this.f13936X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f13936X = null;
            }
        }
        if (this.f13936X == null) {
            this.f13936X = VelocityTracker.obtain();
        }
        this.f13936X.addMovement(motionEvent);
        if (this.f13926M != null && ((this.f13924K || this.f13925L == 1) && actionMasked == 2 && !this.f13927N)) {
            float abs = Math.abs(this.f13940a0 - motionEvent.getY());
            C0585d c0585d2 = this.f13926M;
            if (abs > c0585d2.b) {
                c0585d2.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f13927N;
    }

    public final void v() {
        int x9 = x();
        if (this.b) {
            this.f13920G = Math.max(this.f13932T - x9, this.f13917D);
        } else {
            this.f13920G = this.f13932T - x9;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float w() {
        /*
            r5 = this;
            R3.g r0 = r5.f13951i
            r1 = 0
            if (r0 == 0) goto L79
            java.lang.ref.WeakReference r0 = r5.f13933U
            if (r0 == 0) goto L79
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L79
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r0 < r2) goto L79
            java.lang.ref.WeakReference r0 = r5.f13933U
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            boolean r2 = r5.E()
            if (r2 == 0) goto L79
            android.view.WindowInsets r0 = r0.getRootWindowInsets()
            if (r0 == 0) goto L79
            R3.g r2 = r5.f13951i
            R3.f r3 = r2.b
            R3.k r3 = r3.f2643a
            R3.c r3 = r3.f2695e
            android.graphics.RectF r2 = r2.g()
            float r2 = r3.a(r2)
            android.view.RoundedCorner r3 = B3.a.p(r0)
            if (r3 == 0) goto L4e
            int r3 = B3.a.e(r3)
            float r3 = (float) r3
            int r4 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r4 <= 0) goto L4e
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L4e
            float r3 = r3 / r2
            goto L4f
        L4e:
            r3 = r1
        L4f:
            R3.g r2 = r5.f13951i
            R3.f r4 = r2.b
            R3.k r4 = r4.f2643a
            R3.c r4 = r4.f2696f
            android.graphics.RectF r2 = r2.g()
            float r2 = r4.a(r2)
            android.view.RoundedCorner r0 = B3.a.A(r0)
            if (r0 == 0) goto L74
            int r0 = B3.a.e(r0)
            float r0 = (float) r0
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 <= 0) goto L74
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L74
            float r1 = r0 / r2
        L74:
            float r0 = java.lang.Math.max(r3, r1)
            return r0
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.w():float");
    }

    public final int x() {
        int i9;
        if (this.f13948f) {
            return Math.min(Math.max(this.f13949g, this.f13932T - ((this.f13931S * 9) / 16)), this.f13930R) + this.f13962v;
        }
        if (!this.f13954n && !this.f13955o && (i9 = this.m) > 0) {
            return Math.max(this.f13946e, i9 + this.f13950h);
        }
        return this.f13946e + this.f13962v;
    }

    public final void y(int i9) {
        View view = (View) this.f13933U.get();
        if (view != null) {
            ArrayList arrayList = this.f13935W;
            if (!arrayList.isEmpty()) {
                int i10 = this.f13920G;
                if (i9 <= i10 && i10 != C()) {
                    C();
                }
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ((B3.h) arrayList.get(i11)).b(view);
                }
            }
        }
    }

    public BottomSheetBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        int i9;
        this.f13939a = 0;
        this.b = true;
        this.f13953k = -1;
        this.l = -1;
        this.f13914A = new l(this);
        this.f13919F = 0.5f;
        this.f13921H = -1.0f;
        this.f13924K = true;
        this.f13925L = 4;
        this.f13929Q = 0.1f;
        this.f13935W = new ArrayList();
        this.f13940a0 = -1;
        this.f13945d0 = new SparseIntArray();
        this.f13947e0 = new f(this, 0);
        this.f13950h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2861a.f23662a);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f13952j = android.support.v4.media.session.a.p(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(21)) {
            this.f13965y = k.b(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).a();
        }
        k kVar = this.f13965y;
        if (kVar != null) {
            g gVar = new g(kVar);
            this.f13951i = gVar;
            gVar.i(context);
            ColorStateList colorStateList = this.f13952j;
            if (colorStateList != null) {
                this.f13951i.k(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f13951i.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(w(), 1.0f);
        this.f13915B = ofFloat;
        ofFloat.setDuration(500L);
        this.f13915B.addUpdateListener(new B3.d(this, 0));
        this.f13921H = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.f13953k = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.l = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue != null && (i9 = peekValue.data) == -1) {
            G(i9);
        } else {
            G(obtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        F(obtainStyledAttributes.getBoolean(8, false));
        this.f13954n = obtainStyledAttributes.getBoolean(13, false);
        boolean z8 = obtainStyledAttributes.getBoolean(6, true);
        if (this.b != z8) {
            this.b = z8;
            if (this.f13933U != null) {
                v();
            }
            I((this.b && this.f13925L == 6) ? 3 : this.f13925L);
            M(this.f13925L, true);
            L();
        }
        this.f13923J = obtainStyledAttributes.getBoolean(12, false);
        this.f13924K = obtainStyledAttributes.getBoolean(4, true);
        this.f13939a = obtainStyledAttributes.getInt(10, 0);
        float f9 = obtainStyledAttributes.getFloat(7, 0.5f);
        if (f9 > 0.0f && f9 < 1.0f) {
            this.f13919F = f9;
            if (this.f13933U != null) {
                this.f13918E = (int) ((1.0f - f9) * this.f13932T);
            }
            TypedValue peekValue2 = obtainStyledAttributes.peekValue(5);
            if (peekValue2 != null && peekValue2.type == 16) {
                int i10 = peekValue2.data;
                if (i10 >= 0) {
                    this.f13916C = i10;
                    M(this.f13925L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(5, 0);
                if (dimensionPixelOffset >= 0) {
                    this.f13916C = dimensionPixelOffset;
                    M(this.f13925L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.f13944d = obtainStyledAttributes.getInt(11, 500);
            this.f13955o = obtainStyledAttributes.getBoolean(17, false);
            this.f13956p = obtainStyledAttributes.getBoolean(18, false);
            this.f13957q = obtainStyledAttributes.getBoolean(19, false);
            this.f13958r = obtainStyledAttributes.getBoolean(20, true);
            this.f13959s = obtainStyledAttributes.getBoolean(14, false);
            this.f13960t = obtainStyledAttributes.getBoolean(15, false);
            this.f13961u = obtainStyledAttributes.getBoolean(16, false);
            this.f13964x = obtainStyledAttributes.getBoolean(23, true);
            obtainStyledAttributes.recycle();
            this.f13942c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    @Override // G.b
    public final void o(CoordinatorLayout coordinatorLayout, View view, int i9, int i10, int i11, int[] iArr) {
    }
}
