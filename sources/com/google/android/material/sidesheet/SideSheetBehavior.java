package com.google.android.material.sidesheet;

import a4.h;
import a4.j;
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
import b0.a;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.plantcare.ai.identifier.plantid.R;
import f0.m;
import fa.b;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import ka.i;
import ka.l;
import la.c;
import v8.u0;
import vd.e;
import x0.d;

/* loaded from: classes3.dex */
public class SideSheetBehavior<V extends View> extends a implements b {
    public la.a a;

    /* renamed from: b, reason: collision with root package name */
    public i f11773b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorStateList f11774c;

    /* renamed from: d, reason: collision with root package name */
    public final l f11775d;

    /* renamed from: e, reason: collision with root package name */
    public final h f11776e;

    /* renamed from: f, reason: collision with root package name */
    public final float f11777f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f11778g;

    /* renamed from: h, reason: collision with root package name */
    public int f11779h;

    /* renamed from: i, reason: collision with root package name */
    public d f11780i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f11781j;

    /* renamed from: k, reason: collision with root package name */
    public final float f11782k;

    /* renamed from: l, reason: collision with root package name */
    public int f11783l;

    /* renamed from: m, reason: collision with root package name */
    public int f11784m;

    /* renamed from: n, reason: collision with root package name */
    public int f11785n;

    /* renamed from: o, reason: collision with root package name */
    public int f11786o;

    /* renamed from: p, reason: collision with root package name */
    public WeakReference f11787p;

    /* renamed from: q, reason: collision with root package name */
    public WeakReference f11788q;

    /* renamed from: r, reason: collision with root package name */
    public int f11789r;

    /* renamed from: s, reason: collision with root package name */
    public VelocityTracker f11790s;

    /* renamed from: t, reason: collision with root package name */
    public fa.i f11791t;
    public int u;

    /* renamed from: v, reason: collision with root package name */
    public final LinkedHashSet f11792v;

    /* renamed from: w, reason: collision with root package name */
    public final c f11793w;

    public SideSheetBehavior() {
        this.f11776e = new h(this);
        this.f11778g = true;
        this.f11779h = 5;
        this.f11782k = 0.1f;
        this.f11789r = -1;
        this.f11792v = new LinkedHashSet();
        this.f11793w = new c(this);
    }

    public final void A() {
        View view;
        WeakReference weakReference = this.f11787p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        ViewCompat.removeAccessibilityAction(view, 262144);
        ViewCompat.removeAccessibilityAction(view, ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
        int i10 = 5;
        if (this.f11779h != 5) {
            ViewCompat.replaceAccessibilityAction(view, o0.c.f22961j, null, new gb.d(this, i10));
        }
        int i11 = 3;
        if (this.f11779h != 3) {
            ViewCompat.replaceAccessibilityAction(view, o0.c.f22959h, null, new gb.d(this, i11));
        }
    }

    @Override // fa.b
    public final void a() {
        fa.i iVar = this.f11791t;
        if (iVar == null) {
            return;
        }
        if (iVar.f17758f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        androidx.activity.b bVar = iVar.f17758f;
        iVar.f17758f = null;
        if (bVar != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            View view = iVar.f17754b;
            animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i10), (Property<View, Float>) View.SCALE_Y, 1.0f));
                }
            }
            animatorSet.setDuration(iVar.f17757e);
            animatorSet.start();
        }
    }

    @Override // fa.b
    public final void b(androidx.activity.b bVar) {
        fa.i iVar = this.f11791t;
        if (iVar == null) {
            return;
        }
        iVar.f17758f = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002b  */
    @Override // fa.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(androidx.activity.b r7) {
        /*
            r6 = this;
            fa.i r0 = r6.f11791t
            if (r0 != 0) goto L5
            return
        L5:
            la.a r1 = r6.a
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L18
            int r1 = r1.f21286f
            switch(r1) {
                case 0: goto L12;
                default: goto L10;
            }
        L10:
            r1 = r2
            goto L13
        L12:
            r1 = r3
        L13:
            if (r1 != 0) goto L16
            goto L18
        L16:
            r1 = 3
            goto L19
        L18:
            r1 = 5
        L19:
            androidx.activity.b r4 = r0.f17758f
            if (r4 != 0) goto L24
            java.lang.String r4 = "MaterialBackHelper"
            java.lang.String r5 = "Must call startBackProgress() before updateBackProgress()"
            android.util.Log.w(r4, r5)
        L24:
            androidx.activity.b r4 = r0.f17758f
            r0.f17758f = r7
            if (r4 != 0) goto L2b
            goto L35
        L2b:
            int r4 = r7.f566d
            if (r4 != 0) goto L30
            r2 = r3
        L30:
            float r7 = r7.f565c
            r0.a(r7, r1, r2)
        L35:
            java.lang.ref.WeakReference r7 = r6.f11787p
            if (r7 == 0) goto L7d
            java.lang.Object r7 = r7.get()
            if (r7 != 0) goto L40
            goto L7d
        L40:
            java.lang.ref.WeakReference r7 = r6.f11787p
            java.lang.Object r7 = r7.get()
            android.view.View r7 = (android.view.View) r7
            java.lang.ref.WeakReference r0 = r6.f11788q
            if (r0 == 0) goto L53
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            goto L54
        L53:
            r0 = 0
        L54:
            if (r0 != 0) goto L57
            goto L7d
        L57:
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            if (r1 != 0) goto L60
            goto L7d
        L60:
            int r2 = r6.f11783l
            float r2 = (float) r2
            float r7 = r7.getScaleX()
            float r7 = r7 * r2
            int r2 = r6.f11786o
            float r2 = (float) r2
            float r7 = r7 + r2
            int r7 = (int) r7
            la.a r2 = r6.a
            int r2 = r2.f21286f
            switch(r2) {
                case 0: goto L75;
                default: goto L74;
            }
        L74:
            goto L78
        L75:
            r1.leftMargin = r7
            goto L7a
        L78:
            r1.rightMargin = r7
        L7a:
            r0.requestLayout()
        L7d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.c(androidx.activity.b):void");
    }

    @Override // fa.b
    public final void d() {
        final View view;
        boolean z10;
        boolean z11;
        int i10;
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        boolean z12;
        fa.i iVar = this.f11791t;
        if (iVar == null) {
            return;
        }
        androidx.activity.b bVar = iVar.f17758f;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
        iVar.f17758f = null;
        int i11 = 5;
        if (bVar != null && Build.VERSION.SDK_INT >= 34) {
            la.a aVar = this.a;
            if (aVar != null) {
                switch (aVar.f21286f) {
                    case 0:
                        z12 = true;
                        break;
                    default:
                        z12 = false;
                        break;
                }
                if (z12) {
                    i11 = 3;
                }
            }
            androidx.appcompat.widget.d dVar = new androidx.appcompat.widget.d(this, 8);
            WeakReference weakReference = this.f11788q;
            if (weakReference != null) {
                view = (View) weakReference.get();
            } else {
                view = null;
            }
            if (view != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()) != null) {
                final int G = this.a.G(marginLayoutParams);
                animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: la.b
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        a aVar2 = SideSheetBehavior.this.a;
                        int b3 = s9.a.b(valueAnimator.getAnimatedFraction(), G, 0);
                        int i12 = aVar2.f21286f;
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                        switch (i12) {
                            case 0:
                                marginLayoutParams2.leftMargin = b3;
                                break;
                            default:
                                marginLayoutParams2.rightMargin = b3;
                                break;
                        }
                        view.requestLayout();
                    }
                };
            }
            if (bVar.f566d == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            View view2 = iVar.f17754b;
            if ((Gravity.getAbsoluteGravity(i11, view2.getLayoutDirection()) & 3) == 3) {
                z11 = true;
            } else {
                z11 = false;
            }
            float scaleX = view2.getScaleX() * view2.getWidth();
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                if (z11) {
                    i10 = marginLayoutParams2.leftMargin;
                } else {
                    i10 = marginLayoutParams2.rightMargin;
                }
            } else {
                i10 = 0;
            }
            float f10 = scaleX + i10;
            Property property = View.TRANSLATION_X;
            float[] fArr = new float[1];
            if (z11) {
                f10 = -f10;
            }
            fArr[0] = f10;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, fArr);
            if (animatorUpdateListener != null) {
                ofFloat.addUpdateListener(animatorUpdateListener);
            }
            ofFloat.setInterpolator(new i1.b());
            ofFloat.setDuration(s9.a.b(bVar.f565c, iVar.f17755c, iVar.f17756d));
            ofFloat.addListener(new fa.h(iVar, z10, i11));
            ofFloat.addListener(dVar);
            ofFloat.start();
            return;
        }
        x(5);
    }

    @Override // b0.a
    public final void g(b0.d dVar) {
        this.f11787p = null;
        this.f11780i = null;
        this.f11791t = null;
    }

    @Override // b0.a
    public final void j() {
        this.f11787p = null;
        this.f11780i = null;
        this.f11791t = null;
    }

    @Override // b0.a
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z10;
        d dVar;
        VelocityTracker velocityTracker;
        if ((view.isShown() || ViewCompat.getAccessibilityPaneTitle(view) != null) && this.f11778g) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            this.f11781j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f11790s) != null) {
            velocityTracker.recycle();
            this.f11790s = null;
        }
        if (this.f11790s == null) {
            this.f11790s = VelocityTracker.obtain();
        }
        this.f11790s.addMovement(motionEvent);
        if (actionMasked != 0) {
            if ((actionMasked == 1 || actionMasked == 3) && this.f11781j) {
                this.f11781j = false;
                return false;
            }
        } else {
            this.u = (int) motionEvent.getX();
        }
        if (!this.f11781j && (dVar = this.f11780i) != null && dVar.r(motionEvent)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0092, code lost:
    
        if (r5 != r0) goto L42;
     */
    @Override // b0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean l(androidx.coordinatorlayout.widget.CoordinatorLayout r8, android.view.View r9, int r10) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.l(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    @Override // b0.a
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, marginLayoutParams.height));
        return true;
    }

    @Override // b0.a
    public final void r(View view, Parcelable parcelable) {
        int i10 = ((la.d) parcelable).f21292d;
        if (i10 == 1 || i10 == 2) {
            i10 = 5;
        }
        this.f11779h = i10;
    }

    @Override // b0.a
    public final Parcelable s(View view) {
        return new la.d(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // b0.a
    public final boolean v(View view, MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        VelocityTracker velocityTracker;
        boolean z13 = false;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i10 = this.f11779h;
        if (i10 == 1 && actionMasked == 0) {
            return true;
        }
        d dVar = this.f11780i;
        if (dVar != null && (this.f11778g || i10 == 1)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            dVar.k(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f11790s) != null) {
            velocityTracker.recycle();
            this.f11790s = null;
        }
        if (this.f11790s == null) {
            this.f11790s = VelocityTracker.obtain();
        }
        this.f11790s.addMovement(motionEvent);
        d dVar2 = this.f11780i;
        if (dVar2 != null && (this.f11778g || this.f11779h == 1)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 && actionMasked == 2 && !this.f11781j) {
            if (dVar2 != null && (this.f11778g || this.f11779h == 1)) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 && Math.abs(this.u - motionEvent.getX()) > this.f11780i.f27308b) {
                z13 = true;
            }
            if (z13) {
                this.f11780i.b(motionEvent.getPointerId(motionEvent.getActionIndex()), view);
            }
        }
        return !this.f11781j;
    }

    public final b0.d w() {
        View view;
        WeakReference weakReference = this.f11787p;
        if (weakReference != null && (view = (View) weakReference.get()) != null && (view.getLayoutParams() instanceof b0.d)) {
            return (b0.d) view.getLayoutParams();
        }
        return null;
    }

    public final void x(int i10) {
        String str;
        boolean z10 = true;
        if (i10 != 1 && i10 != 2) {
            WeakReference weakReference = this.f11787p;
            if (weakReference != null && weakReference.get() != null) {
                View view = (View) this.f11787p.get();
                m mVar = new m(i10, 5, this);
                ViewParent parent = view.getParent();
                if (parent == null || !parent.isLayoutRequested() || !view.isAttachedToWindow()) {
                    z10 = false;
                }
                if (z10) {
                    view.post(mVar);
                    return;
                } else {
                    mVar.run();
                    return;
                }
            }
            y(i10);
            return;
        }
        StringBuilder sb2 = new StringBuilder("STATE_");
        if (i10 == 1) {
            str = "DRAGGING";
        } else {
            str = "SETTLING";
        }
        throw new IllegalArgumentException(e.h(sb2, str, " should not be set externally."));
    }

    public final void y(int i10) {
        View view;
        int i11;
        if (this.f11779h == i10) {
            return;
        }
        this.f11779h = i10;
        WeakReference weakReference = this.f11787p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        if (this.f11779h == 5) {
            i11 = 4;
        } else {
            i11 = 0;
        }
        if (view.getVisibility() != i11) {
            view.setVisibility(i11);
        }
        Iterator it = this.f11792v.iterator();
        if (!it.hasNext()) {
            A();
        } else {
            j.t(it.next());
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        if (r1.q(r0, r4.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004d, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        if (r4 != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z(android.view.View r4, int r5, boolean r6) {
        /*
            r3 = this;
            r0 = 3
            if (r5 == r0) goto L19
            r0 = 5
            if (r5 != r0) goto Ld
            la.a r0 = r3.a
            int r0 = r0.I()
            goto L1f
        Ld:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Invalid state to get outer edge offset: "
            java.lang.String r5 = eb.j.i(r6, r5)
            r4.<init>(r5)
            throw r4
        L19:
            la.a r0 = r3.a
            int r0 = r0.H()
        L1f:
            x0.d r1 = r3.f11780i
            r2 = 0
            if (r1 == 0) goto L4e
            if (r6 == 0) goto L31
            int r4 = r4.getTop()
            boolean r4 = r1.q(r0, r4)
            if (r4 == 0) goto L4e
            goto L4d
        L31:
            int r6 = r4.getTop()
            r1.f27324r = r4
            r4 = -1
            r1.f27309c = r4
            boolean r4 = r1.i(r0, r6, r2, r2)
            if (r4 != 0) goto L4b
            int r6 = r1.a
            if (r6 != 0) goto L4b
            android.view.View r6 = r1.f27324r
            if (r6 == 0) goto L4b
            r6 = 0
            r1.f27324r = r6
        L4b:
            if (r4 == 0) goto L4e
        L4d:
            r2 = 1
        L4e:
            if (r2 == 0) goto L5a
            r4 = 2
            r3.y(r4)
            a4.h r4 = r3.f11776e
            r4.a(r5)
            goto L5d
        L5a:
            r3.y(r5)
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.z(android.view.View, int, boolean):void");
    }

    public SideSheetBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(0);
        this.f11776e = new h(this);
        this.f11778g = true;
        this.f11779h = 5;
        this.f11782k = 0.1f;
        this.f11789r = -1;
        this.f11792v = new LinkedHashSet();
        this.f11793w = new c(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r9.a.f24041x);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f11774c = u0.z(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.f11775d = new l(l.b(context, attributeSet, 0, R.style.Widget_Material3_SideSheet));
        }
        if (obtainStyledAttributes.hasValue(5)) {
            int resourceId = obtainStyledAttributes.getResourceId(5, -1);
            this.f11789r = resourceId;
            WeakReference weakReference = this.f11788q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f11788q = null;
            WeakReference weakReference2 = this.f11787p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1 && view.isLaidOut()) {
                    view.requestLayout();
                }
            }
        }
        l lVar = this.f11775d;
        if (lVar != null) {
            i iVar = new i(lVar);
            this.f11773b = iVar;
            iVar.h(context);
            ColorStateList colorStateList = this.f11774c;
            if (colorStateList != null) {
                this.f11773b.k(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f11773b.setTint(typedValue.data);
            }
        }
        this.f11777f = obtainStyledAttributes.getDimension(2, -1.0f);
        this.f11778g = obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
