package com.google.android.material.sidesheet;

import B3.c;
import B3.f;
import B3.l;
import F2.h;
import G.b;
import G.e;
import K.m;
import M3.i;
import M3.j;
import Q7.n0;
import R3.g;
import R3.k;
import S3.d;
import U.t;
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
import android.util.TypedValue;
import android.view.Gravity;
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
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.mbridge.msdk.foundation.entity.o;
import com.tools.arruler.photomeasure.camera.ruler.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p0.a;
import w3.AbstractC2861a;
import x0.AbstractC2914a;
import x3.AbstractC2920a;

/* loaded from: classes2.dex */
public class SideSheetBehavior<V extends View> extends b implements M3.b {

    /* renamed from: a, reason: collision with root package name */
    public h f14106a;
    public final g b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorStateList f14107c;

    /* renamed from: d, reason: collision with root package name */
    public final k f14108d;

    /* renamed from: e, reason: collision with root package name */
    public final l f14109e;

    /* renamed from: f, reason: collision with root package name */
    public final float f14110f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f14111g;

    /* renamed from: h, reason: collision with root package name */
    public int f14112h;

    /* renamed from: i, reason: collision with root package name */
    public C0585d f14113i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f14114j;

    /* renamed from: k, reason: collision with root package name */
    public final float f14115k;
    public int l;
    public int m;

    /* renamed from: n, reason: collision with root package name */
    public int f14116n;

    /* renamed from: o, reason: collision with root package name */
    public int f14117o;

    /* renamed from: p, reason: collision with root package name */
    public WeakReference f14118p;

    /* renamed from: q, reason: collision with root package name */
    public WeakReference f14119q;

    /* renamed from: r, reason: collision with root package name */
    public final int f14120r;

    /* renamed from: s, reason: collision with root package name */
    public VelocityTracker f14121s;

    /* renamed from: t, reason: collision with root package name */
    public j f14122t;

    /* renamed from: u, reason: collision with root package name */
    public int f14123u;

    /* renamed from: v, reason: collision with root package name */
    public final LinkedHashSet f14124v;

    /* renamed from: w, reason: collision with root package name */
    public final f f14125w;

    public SideSheetBehavior() {
        this.f14109e = new l(this);
        this.f14111g = true;
        this.f14112h = 5;
        this.f14115k = 0.1f;
        this.f14120r = -1;
        this.f14124v = new LinkedHashSet();
        this.f14125w = new f(this, 1);
    }

    @Override // M3.b
    public final void a(f.b bVar) {
        j jVar = this.f14122t;
        if (jVar == null) {
            return;
        }
        jVar.f1991f = bVar;
    }

    @Override // M3.b
    public final void b() {
        final View view;
        boolean z8;
        boolean z9;
        int i9;
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        j jVar = this.f14122t;
        if (jVar == null) {
            return;
        }
        f.b bVar = jVar.f1991f;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
        jVar.f1991f = null;
        int i10 = 5;
        if (bVar != null && Build.VERSION.SDK_INT >= 34) {
            h hVar = this.f14106a;
            if (hVar != null && hVar.v() != 0) {
                i10 = 3;
            }
            c cVar = new c(this, 4);
            WeakReference weakReference = this.f14119q;
            if (weakReference != null) {
                view = (View) weakReference.get();
            } else {
                view = null;
            }
            if (view != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()) != null) {
                final int o3 = this.f14106a.o(marginLayoutParams);
                animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: S3.c
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        SideSheetBehavior.this.f14106a.Y(marginLayoutParams, AbstractC2920a.c(valueAnimator.getAnimatedFraction(), o3, 0));
                        view.requestLayout();
                    }
                };
            }
            if (bVar.f20212d == 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            View view2 = jVar.b;
            if ((Gravity.getAbsoluteGravity(i10, ViewCompat.getLayoutDirection(view2)) & 3) == 3) {
                z9 = true;
            } else {
                z9 = false;
            }
            float scaleX = view2.getScaleX() * view2.getWidth();
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                if (z9) {
                    i9 = marginLayoutParams2.leftMargin;
                } else {
                    i9 = marginLayoutParams2.rightMargin;
                }
            } else {
                i9 = 0;
            }
            float f9 = scaleX + i9;
            Property property = View.TRANSLATION_X;
            if (z9) {
                f9 = -f9;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, f9);
            if (animatorUpdateListener != null) {
                ofFloat.addUpdateListener(animatorUpdateListener);
            }
            ofFloat.setInterpolator(new a(1));
            ofFloat.setDuration(AbstractC2920a.c(bVar.f20211c, jVar.f1988c, jVar.f1989d));
            ofFloat.addListener(new i(jVar, z8, i10));
            ofFloat.addListener(cVar);
            ofFloat.start();
            return;
        }
        v(5);
    }

    @Override // M3.b
    public final void c(f.b bVar) {
        View view;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        boolean z8;
        j jVar = this.f14122t;
        if (jVar == null) {
            return;
        }
        h hVar = this.f14106a;
        int i9 = 5;
        if (hVar != null && hVar.v() != 0) {
            i9 = 3;
        }
        if (jVar.f1991f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        f.b bVar2 = jVar.f1991f;
        jVar.f1991f = bVar;
        if (bVar2 != null) {
            if (bVar.f20212d == 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            jVar.a(bVar.f20211c, z8, i9);
        }
        WeakReference weakReference = this.f14118p;
        if (weakReference != null && weakReference.get() != null) {
            View view2 = (View) this.f14118p.get();
            WeakReference weakReference2 = this.f14119q;
            if (weakReference2 != null) {
                view = (View) weakReference2.get();
            } else {
                view = null;
            }
            if (view != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()) != null) {
                this.f14106a.Y(marginLayoutParams, (int) ((view2.getScaleX() * this.l) + this.f14117o));
                view.requestLayout();
            }
        }
    }

    @Override // M3.b
    public final void d() {
        j jVar = this.f14122t;
        if (jVar == null) {
            return;
        }
        if (jVar.f1991f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        f.b bVar = jVar.f1991f;
        jVar.f1991f = null;
        if (bVar != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            View view = jVar.b;
            animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
                    animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i9), (Property<View, Float>) View.SCALE_Y, 1.0f));
                }
            }
            animatorSet.setDuration(jVar.f1990e);
            animatorSet.start();
        }
    }

    @Override // G.b
    public final void g(e eVar) {
        this.f14118p = null;
        this.f14113i = null;
        this.f14122t = null;
    }

    @Override // G.b
    public final void i() {
        this.f14118p = null;
        this.f14113i = null;
        this.f14122t = null;
    }

    @Override // G.b
    public final boolean j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        C0585d c0585d;
        VelocityTracker velocityTracker;
        if ((view.isShown() || ViewCompat.getAccessibilityPaneTitle(view) != null) && this.f14111g) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0 && (velocityTracker = this.f14121s) != null) {
                velocityTracker.recycle();
                this.f14121s = null;
            }
            if (this.f14121s == null) {
                this.f14121s = VelocityTracker.obtain();
            }
            this.f14121s.addMovement(motionEvent);
            if (actionMasked != 0) {
                if ((actionMasked == 1 || actionMasked == 3) && this.f14114j) {
                    this.f14114j = false;
                    return false;
                }
            } else {
                this.f14123u = (int) motionEvent.getX();
            }
            if (!this.f14114j && (c0585d = this.f14113i) != null && c0585d.p(motionEvent)) {
                return true;
            }
            return false;
        }
        this.f14114j = true;
        return false;
    }

    @Override // G.b
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, int i9) {
        int i10;
        View view2;
        View view3;
        int i11;
        int i12;
        View findViewById;
        int i13;
        if (ViewCompat.getFitsSystemWindows(coordinatorLayout) && !ViewCompat.getFitsSystemWindows(view)) {
            view.setFitsSystemWindows(true);
        }
        int i14 = 0;
        if (this.f14118p == null) {
            this.f14118p = new WeakReference(view);
            this.f14122t = new j(view);
            g gVar = this.b;
            if (gVar != null) {
                ViewCompat.setBackground(view, gVar);
                g gVar2 = this.b;
                float f9 = this.f14110f;
                if (f9 == -1.0f) {
                    f9 = ViewCompat.getElevation(view);
                }
                gVar2.j(f9);
            } else {
                ColorStateList colorStateList = this.f14107c;
                if (colorStateList != null) {
                    ViewCompat.setBackgroundTintList(view, colorStateList);
                }
            }
            if (this.f14112h == 5) {
                i13 = 4;
            } else {
                i13 = 0;
            }
            if (view.getVisibility() != i13) {
                view.setVisibility(i13);
            }
            z();
            if (ViewCompat.getImportantForAccessibility(view) == 0) {
                ViewCompat.setImportantForAccessibility(view, 1);
            }
            if (ViewCompat.getAccessibilityPaneTitle(view) == null) {
                ViewCompat.setAccessibilityPaneTitle(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        if (Gravity.getAbsoluteGravity(((e) view.getLayoutParams()).f1226c, i9) == 3) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        h hVar = this.f14106a;
        if (hVar == null || hVar.v() != i10) {
            k kVar = this.f14108d;
            e eVar = null;
            if (i10 == 0) {
                this.f14106a = new S3.a(this, 1);
                if (kVar != null) {
                    WeakReference weakReference = this.f14118p;
                    if (weakReference != null && (view3 = (View) weakReference.get()) != null && (view3.getLayoutParams() instanceof e)) {
                        eVar = (e) view3.getLayoutParams();
                    }
                    if (eVar == null || ((ViewGroup.MarginLayoutParams) eVar).rightMargin <= 0) {
                        R3.j e4 = kVar.e();
                        e4.f2686f = new R3.a(0.0f);
                        e4.f2687g = new R3.a(0.0f);
                        k a6 = e4.a();
                        g gVar3 = this.b;
                        if (gVar3 != null) {
                            gVar3.setShapeAppearanceModel(a6);
                        }
                    }
                }
            } else if (i10 == 1) {
                this.f14106a = new S3.a(this, 0);
                if (kVar != null) {
                    WeakReference weakReference2 = this.f14118p;
                    if (weakReference2 != null && (view2 = (View) weakReference2.get()) != null && (view2.getLayoutParams() instanceof e)) {
                        eVar = (e) view2.getLayoutParams();
                    }
                    if (eVar == null || ((ViewGroup.MarginLayoutParams) eVar).leftMargin <= 0) {
                        R3.j e9 = kVar.e();
                        e9.f2685e = new R3.a(0.0f);
                        e9.f2688h = new R3.a(0.0f);
                        k a9 = e9.a();
                        g gVar4 = this.b;
                        if (gVar4 != null) {
                            gVar4.setShapeAppearanceModel(a9);
                        }
                    }
                }
            } else {
                throw new IllegalArgumentException(n0.f(i10, "Invalid sheet edge position value: ", ". Must be 0 or 1."));
            }
        }
        if (this.f14113i == null) {
            this.f14113i = new C0585d(coordinatorLayout.getContext(), coordinatorLayout, this.f14125w);
        }
        int t9 = this.f14106a.t(view);
        coordinatorLayout.q(view, i9);
        this.m = coordinatorLayout.getWidth();
        this.f14116n = this.f14106a.u(coordinatorLayout);
        this.l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams != null) {
            i11 = this.f14106a.d(marginLayoutParams);
        } else {
            i11 = 0;
        }
        this.f14117o = i11;
        int i15 = this.f14112h;
        if (i15 != 1 && i15 != 2) {
            if (i15 != 3) {
                if (i15 == 5) {
                    i14 = this.f14106a.q();
                } else {
                    throw new IllegalStateException("Unexpected value: " + this.f14112h);
                }
            }
        } else {
            i14 = t9 - this.f14106a.t(view);
        }
        ViewCompat.offsetLeftAndRight(view, i14);
        if (this.f14119q == null && (i12 = this.f14120r) != -1 && (findViewById = coordinatorLayout.findViewById(i12)) != null) {
            this.f14119q = new WeakReference(findViewById);
        }
        Iterator it = this.f14124v.iterator();
        while (it.hasNext()) {
            o.v(it.next());
        }
        return true;
    }

    @Override // G.b
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i9, int i10, int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i9, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i11, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // G.b
    public final void q(View view, Parcelable parcelable) {
        int i9 = ((d) parcelable).f2805d;
        if (i9 == 1 || i9 == 2) {
            i9 = 5;
        }
        this.f14112h = i9;
    }

    @Override // G.b
    public final Parcelable r(View view) {
        return new d(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // G.b
    public final boolean u(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f14112h == 1 && actionMasked == 0) {
            return true;
        }
        if (x()) {
            this.f14113i.j(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f14121s) != null) {
            velocityTracker.recycle();
            this.f14121s = null;
        }
        if (this.f14121s == null) {
            this.f14121s = VelocityTracker.obtain();
        }
        this.f14121s.addMovement(motionEvent);
        if (x() && actionMasked == 2 && !this.f14114j && x()) {
            float abs = Math.abs(this.f14123u - motionEvent.getX());
            C0585d c0585d = this.f14113i;
            if (abs > c0585d.b) {
                c0585d.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f14114j;
    }

    public final void v(int i9) {
        String str;
        if (i9 != 1 && i9 != 2) {
            WeakReference weakReference = this.f14118p;
            if (weakReference != null && weakReference.get() != null) {
                View view = (View) this.f14118p.get();
                m mVar = new m(i9, 1, this);
                ViewParent parent = view.getParent();
                if (parent != null && parent.isLayoutRequested() && ViewCompat.isAttachedToWindow(view)) {
                    view.post(mVar);
                    return;
                } else {
                    mVar.run();
                    return;
                }
            }
            w(i9);
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

    public final void w(int i9) {
        View view;
        int i10;
        if (this.f14112h == i9) {
            return;
        }
        this.f14112h = i9;
        WeakReference weakReference = this.f14118p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        if (this.f14112h == 5) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        if (view.getVisibility() != i10) {
            view.setVisibility(i10);
        }
        Iterator it = this.f14124v.iterator();
        if (!it.hasNext()) {
            z();
        } else {
            o.v(it.next());
            throw null;
        }
    }

    public final boolean x() {
        if (this.f14113i != null && (this.f14111g || this.f14112h == 1)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if (r1.o(r0, r3.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004d, code lost:
    
        w(2);
        r2.f14109e.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        if (r3 != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            r0 = 3
            if (r4 == r0) goto L19
            r0 = 5
            if (r4 != r0) goto Ld
            F2.h r0 = r2.f14106a
            int r0 = r0.q()
            goto L1f
        Ld:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Invalid state to get outer edge offset: "
            java.lang.String r4 = com.mbridge.msdk.foundation.entity.o.h(r4, r5)
            r3.<init>(r4)
            throw r3
        L19:
            F2.h r0 = r2.f14106a
            int r0 = r0.p()
        L1f:
            c0.d r1 = r2.f14113i
            if (r1 == 0) goto L57
            if (r5 == 0) goto L30
            int r3 = r3.getTop()
            boolean r3 = r1.o(r0, r3)
            if (r3 == 0) goto L57
            goto L4d
        L30:
            int r5 = r3.getTop()
            r1.f5373r = r3
            r3 = -1
            r1.f5360c = r3
            r3 = 0
            boolean r3 = r1.h(r0, r5, r3, r3)
            if (r3 != 0) goto L4b
            int r5 = r1.f5359a
            if (r5 != 0) goto L4b
            android.view.View r5 = r1.f5373r
            if (r5 == 0) goto L4b
            r5 = 0
            r1.f5373r = r5
        L4b:
            if (r3 == 0) goto L57
        L4d:
            r3 = 2
            r2.w(r3)
            B3.l r3 = r2.f14109e
            r3.a(r4)
            goto L5a
        L57:
            r2.w(r4)
        L5a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.y(android.view.View, int, boolean):void");
    }

    public final void z() {
        View view;
        WeakReference weakReference = this.f14118p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        ViewCompat.removeAccessibilityAction(view, 262144);
        ViewCompat.removeAccessibilityAction(view, 1048576);
        final int i9 = 5;
        if (this.f14112h != 5) {
            ViewCompat.replaceAccessibilityAction(view, U.d.f3091j, null, new t() { // from class: S3.b
                @Override // U.t
                public final boolean c(View view2) {
                    SideSheetBehavior.this.v(i9);
                    return true;
                }
            });
        }
        final int i10 = 3;
        if (this.f14112h != 3) {
            ViewCompat.replaceAccessibilityAction(view, U.d.f3089h, null, new t() { // from class: S3.b
                @Override // U.t
                public final boolean c(View view2) {
                    SideSheetBehavior.this.v(i10);
                    return true;
                }
            });
        }
    }

    public SideSheetBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this.f14109e = new l(this);
        this.f14111g = true;
        this.f14112h = 5;
        this.f14115k = 0.1f;
        this.f14120r = -1;
        this.f14124v = new LinkedHashSet();
        this.f14125w = new f(this, 1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2861a.f23682x);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f14107c = android.support.v4.media.session.a.p(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.f14108d = k.b(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).a();
        }
        if (obtainStyledAttributes.hasValue(5)) {
            int resourceId = obtainStyledAttributes.getResourceId(5, -1);
            this.f14120r = resourceId;
            WeakReference weakReference = this.f14119q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f14119q = null;
            WeakReference weakReference2 = this.f14118p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1 && ViewCompat.isLaidOut(view)) {
                    view.requestLayout();
                }
            }
        }
        k kVar = this.f14108d;
        if (kVar != null) {
            g gVar = new g(kVar);
            this.b = gVar;
            gVar.i(context);
            ColorStateList colorStateList = this.f14107c;
            if (colorStateList != null) {
                this.b.k(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.b.setTint(typedValue.data);
            }
        }
        this.f14110f = obtainStyledAttributes.getDimension(2, -1.0f);
        this.f14111g = obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
