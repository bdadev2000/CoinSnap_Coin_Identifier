package com.google.android.material.bottomsheet;

import a4.g0;
import a4.h;
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
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.s0;
import b0.a;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.plantcare.ai.identifier.plantid.R;
import eb.j;
import fa.b;
import fa.g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import ka.i;
import ka.l;
import m9.h0;
import o0.c;
import v8.u0;
import vd.e;
import x0.d;

/* loaded from: classes3.dex */
public class BottomSheetBehavior<V extends View> extends a implements b {
    public final h A;
    public ValueAnimator B;
    public int C;
    public int D;
    public int E;
    public float F;
    public int G;
    public final float H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public int N;
    public d O;
    public boolean P;
    public int Q;
    public boolean R;
    public final float S;
    public int T;
    public int U;
    public int V;
    public WeakReference W;
    public WeakReference X;
    public final ArrayList Y;
    public VelocityTracker Z;
    public int a;

    /* renamed from: a0, reason: collision with root package name */
    public g f11567a0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f11568b;

    /* renamed from: b0, reason: collision with root package name */
    public int f11569b0;

    /* renamed from: c, reason: collision with root package name */
    public final float f11570c;

    /* renamed from: c0, reason: collision with root package name */
    public int f11571c0;

    /* renamed from: d, reason: collision with root package name */
    public int f11572d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f11573d0;

    /* renamed from: e, reason: collision with root package name */
    public int f11574e;

    /* renamed from: e0, reason: collision with root package name */
    public HashMap f11575e0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f11576f;

    /* renamed from: f0, reason: collision with root package name */
    public final SparseIntArray f11577f0;

    /* renamed from: g, reason: collision with root package name */
    public int f11578g;

    /* renamed from: g0, reason: collision with root package name */
    public final v9.a f11579g0;

    /* renamed from: h, reason: collision with root package name */
    public final int f11580h;

    /* renamed from: i, reason: collision with root package name */
    public i f11581i;

    /* renamed from: j, reason: collision with root package name */
    public final ColorStateList f11582j;

    /* renamed from: k, reason: collision with root package name */
    public int f11583k;

    /* renamed from: l, reason: collision with root package name */
    public int f11584l;

    /* renamed from: m, reason: collision with root package name */
    public int f11585m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f11586n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f11587o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f11588p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f11589q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f11590r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f11591s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f11592t;
    public final boolean u;

    /* renamed from: v, reason: collision with root package name */
    public int f11593v;

    /* renamed from: w, reason: collision with root package name */
    public int f11594w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f11595x;

    /* renamed from: y, reason: collision with root package name */
    public final l f11596y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f11597z;

    public BottomSheetBehavior() {
        this.a = 0;
        this.f11568b = true;
        this.f11583k = -1;
        this.f11584l = -1;
        this.A = new h(this, 0);
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = true;
        this.N = 4;
        this.S = 0.1f;
        this.Y = new ArrayList();
        this.f11571c0 = -1;
        this.f11577f0 = new SparseIntArray();
        this.f11579g0 = new v9.a(this);
    }

    public static View A(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (ViewCompat.isNestedScrollingEnabled(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View A = A(viewGroup.getChildAt(i10));
                if (A != null) {
                    return A;
                }
            }
        }
        return null;
    }

    public static BottomSheetBehavior B(FrameLayout frameLayout) {
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams instanceof b0.d) {
            a aVar = ((b0.d) layoutParams).a;
            if (aVar instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) aVar;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    public final int C(int i10, int i11, int i12, int i13) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, i11, i13);
        if (i12 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode != 1073741824) {
            if (size != 0) {
                i12 = Math.min(size, i12);
            }
            return View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(size, i12), 1073741824);
    }

    public final int D() {
        int i10;
        if (this.f11568b) {
            return this.D;
        }
        int i11 = this.C;
        if (this.f11590r) {
            i10 = 0;
        } else {
            i10 = this.f11594w;
        }
        return Math.max(i11, i10);
    }

    public final int E(int i10) {
        if (i10 != 3) {
            if (i10 != 4) {
                if (i10 != 5) {
                    if (i10 == 6) {
                        return this.E;
                    }
                    throw new IllegalArgumentException(j.i("Invalid state to get top offset: ", i10));
                }
                return this.V;
            }
            return this.G;
        }
        return D();
    }

    public final boolean F() {
        WeakReference weakReference = this.W;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        int[] iArr = new int[2];
        ((View) this.W.get()).getLocationOnScreen(iArr);
        if (iArr[1] != 0) {
            return false;
        }
        return true;
    }

    public final void G(boolean z10) {
        if (this.I != z10) {
            this.I = z10;
            if (!z10 && this.N == 5) {
                I(4);
            }
            M();
        }
    }

    public final void H(int i10) {
        boolean z10 = false;
        if (i10 == -1) {
            if (!this.f11576f) {
                this.f11576f = true;
                z10 = true;
            }
        } else if (this.f11576f || this.f11574e != i10) {
            this.f11576f = false;
            this.f11574e = Math.max(0, i10);
            z10 = true;
        }
        if (z10) {
            P();
        }
    }

    public final void I(int i10) {
        String str;
        int i11;
        boolean z10 = true;
        if (i10 != 1 && i10 != 2) {
            if (!this.I && i10 == 5) {
                j.v("Cannot set state: ", i10, "BottomSheetBehavior");
                return;
            }
            if (i10 == 6 && this.f11568b && E(i10) <= this.D) {
                i11 = 3;
            } else {
                i11 = i10;
            }
            WeakReference weakReference = this.W;
            if (weakReference != null && weakReference.get() != null) {
                View view = (View) this.W.get();
                d.d dVar = new d.d(this, view, i11, 9);
                ViewParent parent = view.getParent();
                if (parent == null || !parent.isLayoutRequested() || !view.isAttachedToWindow()) {
                    z10 = false;
                }
                if (z10) {
                    view.post(dVar);
                    return;
                } else {
                    dVar.run();
                    return;
                }
            }
            J(i10);
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

    public final void J(int i10) {
        View view;
        if (this.N == i10) {
            return;
        }
        this.N = i10;
        WeakReference weakReference = this.W;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i11 = 0;
        if (i10 == 3) {
            O(true);
        } else if (i10 == 6 || i10 == 5 || i10 == 4) {
            O(false);
        }
        N(i10, true);
        while (true) {
            ArrayList arrayList = this.Y;
            if (i11 < arrayList.size()) {
                ((v9.b) arrayList.get(i11)).c(i10, view);
                i11++;
            } else {
                M();
                return;
            }
        }
    }

    public final boolean K(View view, float f10) {
        if (this.J) {
            return true;
        }
        if (view.getTop() < this.G) {
            return false;
        }
        if (Math.abs(((f10 * this.S) + view.getTop()) - this.G) / y() > 0.5f) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        if (r5 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r1.q(r5.getLeft(), r0) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0033, code lost:
    
        r2 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void L(android.view.View r5, int r6, boolean r7) {
        /*
            r4 = this;
            int r0 = r4.E(r6)
            x0.d r1 = r4.O
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L34
            if (r7 == 0) goto L17
            int r5 = r5.getLeft()
            boolean r5 = r1.q(r5, r0)
            if (r5 == 0) goto L34
            goto L33
        L17:
            int r7 = r5.getLeft()
            r1.f27324r = r5
            r5 = -1
            r1.f27309c = r5
            boolean r5 = r1.i(r7, r0, r2, r2)
            if (r5 != 0) goto L31
            int r7 = r1.a
            if (r7 != 0) goto L31
            android.view.View r7 = r1.f27324r
            if (r7 == 0) goto L31
            r7 = 0
            r1.f27324r = r7
        L31:
            if (r5 == 0) goto L34
        L33:
            r2 = r3
        L34:
            if (r2 == 0) goto L43
            r5 = 2
            r4.J(r5)
            r4.N(r6, r3)
            a4.h r5 = r4.A
            r5.a(r6)
            goto L46
        L43:
            r4.J(r6)
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.L(android.view.View, int, boolean):void");
    }

    public final void M() {
        View view;
        WeakReference weakReference = this.W;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            ViewCompat.removeAccessibilityAction(view, 524288);
            ViewCompat.removeAccessibilityAction(view, 262144);
            ViewCompat.removeAccessibilityAction(view, ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
            SparseIntArray sparseIntArray = this.f11577f0;
            int i10 = sparseIntArray.get(0, -1);
            if (i10 != -1) {
                ViewCompat.removeAccessibilityAction(view, i10);
                sparseIntArray.delete(0);
            }
            int i11 = 6;
            if (!this.f11568b && this.N != 6) {
                sparseIntArray.put(0, ViewCompat.addAccessibilityAction(view, view.getResources().getString(R.string.bottomsheet_action_expand_halfway), new s0(this, 6)));
            }
            if (this.I && this.N != 5) {
                ViewCompat.replaceAccessibilityAction(view, c.f22961j, null, new s0(this, 5));
            }
            int i12 = this.N;
            if (i12 != 3) {
                if (i12 != 4) {
                    if (i12 == 6) {
                        ViewCompat.replaceAccessibilityAction(view, c.f22960i, null, new s0(this, 4));
                        ViewCompat.replaceAccessibilityAction(view, c.f22959h, null, new s0(this, 3));
                        return;
                    }
                    return;
                }
                if (this.f11568b) {
                    i11 = 3;
                }
                ViewCompat.replaceAccessibilityAction(view, c.f22959h, null, new s0(this, i11));
                return;
            }
            if (this.f11568b) {
                i11 = 4;
            }
            ViewCompat.replaceAccessibilityAction(view, c.f22960i, null, new s0(this, i11));
        }
    }

    public final void N(int i10, boolean z10) {
        boolean z11;
        ValueAnimator valueAnimator;
        if (i10 == 2) {
            return;
        }
        if (this.N == 3 && (this.f11595x || F())) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f11597z != z11 && this.f11581i != null) {
            this.f11597z = z11;
            float f10 = 1.0f;
            if (z10 && (valueAnimator = this.B) != null) {
                if (valueAnimator.isRunning()) {
                    this.B.reverse();
                    return;
                }
                float f11 = this.f11581i.f20557b.f20545k;
                if (z11) {
                    f10 = x();
                }
                this.B.setFloatValues(f11, f10);
                this.B.start();
                return;
            }
            ValueAnimator valueAnimator2 = this.B;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.B.cancel();
            }
            i iVar = this.f11581i;
            if (this.f11597z) {
                f10 = x();
            }
            ka.h hVar = iVar.f20557b;
            if (hVar.f20545k != f10) {
                hVar.f20545k = f10;
                iVar.f20561g = true;
                iVar.invalidateSelf();
            }
        }
    }

    public final void O(boolean z10) {
        WeakReference weakReference = this.W;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (!(parent instanceof CoordinatorLayout)) {
            return;
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
        int childCount = coordinatorLayout.getChildCount();
        if (z10) {
            if (this.f11575e0 == null) {
                this.f11575e0 = new HashMap(childCount);
            } else {
                return;
            }
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = coordinatorLayout.getChildAt(i10);
            if (childAt != this.W.get() && z10) {
                this.f11575e0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
            }
        }
        if (!z10) {
            this.f11575e0 = null;
        }
    }

    public final void P() {
        View view;
        if (this.W != null) {
            w();
            if (this.N == 4 && (view = (View) this.W.get()) != null) {
                view.requestLayout();
            }
        }
    }

    @Override // fa.b
    public final void a() {
        g gVar = this.f11567a0;
        if (gVar == null) {
            return;
        }
        if (gVar.f17758f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        androidx.activity.b bVar = gVar.f17758f;
        gVar.f17758f = null;
        if (bVar != null) {
            AnimatorSet a = gVar.a();
            a.setDuration(gVar.f17757e);
            a.start();
        }
    }

    @Override // fa.b
    public final void b(androidx.activity.b bVar) {
        g gVar = this.f11567a0;
        if (gVar == null) {
            return;
        }
        gVar.f17758f = bVar;
    }

    @Override // fa.b
    public final void c(androidx.activity.b bVar) {
        g gVar = this.f11567a0;
        if (gVar == null) {
            return;
        }
        if (gVar.f17758f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        androidx.activity.b bVar2 = gVar.f17758f;
        gVar.f17758f = bVar;
        if (bVar2 != null) {
            gVar.b(bVar.f565c);
        }
    }

    @Override // fa.b
    public final void d() {
        g gVar = this.f11567a0;
        if (gVar == null) {
            return;
        }
        androidx.activity.b bVar = gVar.f17758f;
        gVar.f17758f = null;
        int i10 = 5;
        if (bVar != null && Build.VERSION.SDK_INT >= 34) {
            boolean z10 = this.I;
            int i11 = gVar.f17756d;
            int i12 = gVar.f17755c;
            float f10 = bVar.f565c;
            if (z10) {
                androidx.appcompat.widget.d dVar = new androidx.appcompat.widget.d(this, i10);
                View view = gVar.f17754b;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view.getScaleY() * view.getHeight());
                ofFloat.setInterpolator(new i1.b());
                ofFloat.setDuration(s9.a.b(f10, i12, i11));
                ofFloat.addListener(new androidx.appcompat.widget.d(gVar, 7));
                ofFloat.addListener(dVar);
                ofFloat.start();
                return;
            }
            AnimatorSet a = gVar.a();
            a.setDuration(s9.a.b(f10, i12, i11));
            a.start();
            I(4);
            return;
        }
        if (!this.I) {
            i10 = 4;
        }
        I(i10);
    }

    @Override // b0.a
    public final void g(b0.d dVar) {
        this.W = null;
        this.O = null;
        this.f11567a0 = null;
    }

    @Override // b0.a
    public final void j() {
        this.W = null;
        this.O = null;
        this.f11567a0 = null;
    }

    @Override // b0.a
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z10;
        View view2;
        int i10;
        d dVar;
        if (view.isShown() && this.K) {
            int actionMasked = motionEvent.getActionMasked();
            View view3 = null;
            if (actionMasked == 0) {
                this.f11569b0 = -1;
                this.f11571c0 = -1;
                VelocityTracker velocityTracker = this.Z;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.Z = null;
                }
            }
            if (this.Z == null) {
                this.Z = VelocityTracker.obtain();
            }
            this.Z.addMovement(motionEvent);
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    this.f11573d0 = false;
                    this.f11569b0 = -1;
                    if (this.P) {
                        this.P = false;
                        return false;
                    }
                }
            } else {
                int x10 = (int) motionEvent.getX();
                this.f11571c0 = (int) motionEvent.getY();
                if (this.N != 2) {
                    WeakReference weakReference = this.X;
                    if (weakReference != null) {
                        view2 = (View) weakReference.get();
                    } else {
                        view2 = null;
                    }
                    if (view2 != null && coordinatorLayout.o(view2, x10, this.f11571c0)) {
                        this.f11569b0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.f11573d0 = true;
                    }
                }
                if (this.f11569b0 == -1 && !coordinatorLayout.o(view, x10, this.f11571c0)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.P = z10;
            }
            if (!this.P && (dVar = this.O) != null && dVar.r(motionEvent)) {
                return true;
            }
            WeakReference weakReference2 = this.X;
            if (weakReference2 != null) {
                view3 = (View) weakReference2.get();
            }
            if (actionMasked != 2 || view3 == null || this.P || this.N == 1 || coordinatorLayout.o(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.O == null || (i10 = this.f11571c0) == -1 || Math.abs(i10 - motionEvent.getY()) <= this.O.f27308b) {
                return false;
            }
            return true;
        }
        this.P = true;
        return false;
    }

    @Override // b0.a
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        boolean z10;
        int i11 = 1;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        int i12 = 0;
        if (this.W == null) {
            this.f11578g = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            int i13 = 29;
            if (Build.VERSION.SDK_INT >= 29 && !this.f11586n && !this.f11576f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f11587o || this.f11588p || this.f11589q || this.f11591s || this.f11592t || this.u || z10) {
                ViewCompat.setOnApplyWindowInsetsListener(view, new r4.c(new g0(this, z10), new h0(view.getPaddingStart(), view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom()), i13));
                if (view.isAttachedToWindow()) {
                    ViewCompat.requestApplyInsets(view);
                } else {
                    view.addOnAttachStateChangeListener(new androidx.databinding.c(i11));
                }
            }
            ViewCompat.setWindowInsetsAnimationCallback(view, new v9.i(view));
            this.W = new WeakReference(view);
            this.f11567a0 = new g(view);
            i iVar = this.f11581i;
            if (iVar != null) {
                view.setBackground(iVar);
                i iVar2 = this.f11581i;
                float f10 = this.H;
                if (f10 == -1.0f) {
                    f10 = ViewCompat.getElevation(view);
                }
                iVar2.j(f10);
            } else {
                ColorStateList colorStateList = this.f11582j;
                if (colorStateList != null) {
                    ViewCompat.setBackgroundTintList(view, colorStateList);
                }
            }
            M();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.O == null) {
            this.O = new d(coordinatorLayout.getContext(), coordinatorLayout, this.f11579g0);
        }
        int top = view.getTop();
        coordinatorLayout.q(i10, view);
        this.U = coordinatorLayout.getWidth();
        this.V = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.T = height;
        int i14 = this.V;
        int i15 = i14 - height;
        int i16 = this.f11594w;
        if (i15 < i16) {
            if (this.f11590r) {
                int i17 = this.f11584l;
                if (i17 != -1) {
                    i14 = Math.min(i14, i17);
                }
                this.T = i14;
            } else {
                int i18 = i14 - i16;
                int i19 = this.f11584l;
                if (i19 != -1) {
                    i18 = Math.min(i18, i19);
                }
                this.T = i18;
            }
        }
        this.D = Math.max(0, this.V - this.T);
        this.E = (int) ((1.0f - this.F) * this.V);
        w();
        int i20 = this.N;
        if (i20 == 3) {
            ViewCompat.offsetTopAndBottom(view, D());
        } else if (i20 == 6) {
            ViewCompat.offsetTopAndBottom(view, this.E);
        } else if (this.I && i20 == 5) {
            ViewCompat.offsetTopAndBottom(view, this.V);
        } else if (i20 == 4) {
            ViewCompat.offsetTopAndBottom(view, this.G);
        } else if (i20 == 1 || i20 == 2) {
            ViewCompat.offsetTopAndBottom(view, top - view.getTop());
        }
        N(this.N, false);
        this.X = new WeakReference(A(view));
        while (true) {
            ArrayList arrayList = this.Y;
            if (i12 >= arrayList.size()) {
                return true;
            }
            ((v9.b) arrayList.get(i12)).a(view);
            i12++;
        }
    }

    @Override // b0.a
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(C(i10, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, this.f11583k, marginLayoutParams.width), C(i12, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, this.f11584l, marginLayoutParams.height));
        return true;
    }

    @Override // b0.a
    public final boolean n(View view) {
        WeakReference weakReference = this.X;
        if (weakReference != null && view == weakReference.get() && this.N != 3 && !this.M) {
            return true;
        }
        return false;
    }

    @Override // b0.a
    public final void o(View view, View view2, int i10, int[] iArr, int i11) {
        View view3;
        if (i11 == 1) {
            return;
        }
        WeakReference weakReference = this.X;
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
            if (!this.R && !this.L && view2 == view3 && view2.canScrollVertically(1)) {
                this.M = true;
                return;
            }
            if (i12 < D()) {
                int D = top - D();
                iArr[1] = D;
                ViewCompat.offsetTopAndBottom(view, -D);
                J(3);
            } else {
                if (!this.K) {
                    return;
                }
                iArr[1] = i10;
                ViewCompat.offsetTopAndBottom(view, -i10);
                J(1);
            }
        } else if (i10 < 0) {
            boolean canScrollVertically = view2.canScrollVertically(-1);
            if (!this.R && !this.L && view2 == view3 && canScrollVertically) {
                this.M = true;
                return;
            }
            if (!canScrollVertically) {
                int i13 = this.G;
                if (i12 > i13 && !this.I) {
                    int i14 = top - i13;
                    iArr[1] = i14;
                    ViewCompat.offsetTopAndBottom(view, -i14);
                    J(4);
                } else {
                    if (!this.K) {
                        return;
                    }
                    iArr[1] = i10;
                    ViewCompat.offsetTopAndBottom(view, -i10);
                    J(1);
                }
            }
        }
        z(view.getTop());
        this.Q = i10;
        this.R = true;
        this.M = false;
    }

    @Override // b0.a
    public final void p(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
    }

    @Override // b0.a
    public final void r(View view, Parcelable parcelable) {
        v9.c cVar = (v9.c) parcelable;
        int i10 = this.a;
        if (i10 != 0) {
            if (i10 == -1 || (i10 & 1) == 1) {
                this.f11574e = cVar.f26348f;
            }
            if (i10 == -1 || (i10 & 2) == 2) {
                this.f11568b = cVar.f26349g;
            }
            if (i10 == -1 || (i10 & 4) == 4) {
                this.I = cVar.f26350h;
            }
            if (i10 == -1 || (i10 & 8) == 8) {
                this.J = cVar.f26351i;
            }
        }
        int i11 = cVar.f26347d;
        if (i11 != 1 && i11 != 2) {
            this.N = i11;
        } else {
            this.N = 4;
        }
    }

    @Override // b0.a
    public final Parcelable s(View view) {
        return new v9.c(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // b0.a
    public final boolean t(View view, int i10, int i11) {
        this.Q = 0;
        this.R = false;
        if ((i10 & 2) == 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
    
        if (r3.getTop() <= r2.E) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006f, code lost:
    
        if (java.lang.Math.abs(r4 - r2.D) < java.lang.Math.abs(r4 - r2.G)) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007e, code lost:
    
        if (r4 < java.lang.Math.abs(r4 - r2.G)) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008e, code lost:
    
        if (java.lang.Math.abs(r4 - r5) < java.lang.Math.abs(r4 - r2.G)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a9, code lost:
    
        if (java.lang.Math.abs(r4 - r2.E) < java.lang.Math.abs(r4 - r2.G)) goto L50;
     */
    @Override // b0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(android.view.View r3, android.view.View r4, int r5) {
        /*
            r2 = this;
            int r5 = r3.getTop()
            int r0 = r2.D()
            r1 = 3
            if (r5 != r0) goto Lf
            r2.J(r1)
            return
        Lf:
            java.lang.ref.WeakReference r5 = r2.X
            if (r5 == 0) goto Lb4
            java.lang.Object r5 = r5.get()
            if (r4 != r5) goto Lb4
            boolean r4 = r2.R
            if (r4 != 0) goto L1f
            goto Lb4
        L1f:
            int r4 = r2.Q
            if (r4 <= 0) goto L33
            boolean r4 = r2.f11568b
            if (r4 == 0) goto L29
            goto Lae
        L29:
            int r4 = r3.getTop()
            int r5 = r2.E
            if (r4 <= r5) goto Lae
            goto Lab
        L33:
            boolean r4 = r2.I
            if (r4 == 0) goto L54
            android.view.VelocityTracker r4 = r2.Z
            if (r4 != 0) goto L3d
            r4 = 0
            goto L4c
        L3d:
            r5 = 1000(0x3e8, float:1.401E-42)
            float r0 = r2.f11570c
            r4.computeCurrentVelocity(r5, r0)
            android.view.VelocityTracker r4 = r2.Z
            int r5 = r2.f11569b0
            float r4 = r4.getYVelocity(r5)
        L4c:
            boolean r4 = r2.K(r3, r4)
            if (r4 == 0) goto L54
            r1 = 5
            goto Lae
        L54:
            int r4 = r2.Q
            if (r4 != 0) goto L91
            int r4 = r3.getTop()
            boolean r5 = r2.f11568b
            if (r5 == 0) goto L72
            int r5 = r2.D
            int r5 = r4 - r5
            int r5 = java.lang.Math.abs(r5)
            int r0 = r2.G
            int r4 = r4 - r0
            int r4 = java.lang.Math.abs(r4)
            if (r5 >= r4) goto Lad
            goto Lae
        L72:
            int r5 = r2.E
            if (r4 >= r5) goto L81
            int r5 = r2.G
            int r5 = r4 - r5
            int r5 = java.lang.Math.abs(r5)
            if (r4 >= r5) goto Lab
            goto Lae
        L81:
            int r5 = r4 - r5
            int r5 = java.lang.Math.abs(r5)
            int r0 = r2.G
            int r4 = r4 - r0
            int r4 = java.lang.Math.abs(r4)
            if (r5 >= r4) goto Lad
            goto Lab
        L91:
            boolean r4 = r2.f11568b
            if (r4 == 0) goto L96
            goto Lad
        L96:
            int r4 = r3.getTop()
            int r5 = r2.E
            int r5 = r4 - r5
            int r5 = java.lang.Math.abs(r5)
            int r0 = r2.G
            int r4 = r4 - r0
            int r4 = java.lang.Math.abs(r4)
            if (r5 >= r4) goto Lad
        Lab:
            r1 = 6
            goto Lae
        Lad:
            r1 = 4
        Lae:
            r4 = 0
            r2.L(r3, r1, r4)
            r2.R = r4
        Lb4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.u(android.view.View, android.view.View, int):void");
    }

    @Override // b0.a
    public final boolean v(View view, MotionEvent motionEvent) {
        boolean z10;
        boolean z11 = false;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i10 = this.N;
        if (i10 == 1 && actionMasked == 0) {
            return true;
        }
        d dVar = this.O;
        if (dVar != null && (this.K || i10 == 1)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            dVar.k(motionEvent);
        }
        if (actionMasked == 0) {
            this.f11569b0 = -1;
            this.f11571c0 = -1;
            VelocityTracker velocityTracker = this.Z;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.Z = null;
            }
        }
        if (this.Z == null) {
            this.Z = VelocityTracker.obtain();
        }
        this.Z.addMovement(motionEvent);
        if (this.O != null && (this.K || this.N == 1)) {
            z11 = true;
        }
        if (z11 && actionMasked == 2 && !this.P) {
            float abs = Math.abs(this.f11571c0 - motionEvent.getY());
            d dVar2 = this.O;
            if (abs > dVar2.f27308b) {
                dVar2.b(motionEvent.getPointerId(motionEvent.getActionIndex()), view);
            }
        }
        return !this.P;
    }

    public final void w() {
        int y4 = y();
        if (this.f11568b) {
            this.G = Math.max(this.V - y4, this.D);
        } else {
            this.G = this.V - y4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float x() {
        /*
            r5 = this;
            ka.i r0 = r5.f11581i
            r1 = 0
            if (r0 == 0) goto L79
            java.lang.ref.WeakReference r0 = r5.W
            if (r0 == 0) goto L79
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L79
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r0 < r2) goto L79
            java.lang.ref.WeakReference r0 = r5.W
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            boolean r2 = r5.F()
            if (r2 == 0) goto L79
            android.view.WindowInsets r0 = r0.getRootWindowInsets()
            if (r0 == 0) goto L79
            ka.i r2 = r5.f11581i
            ka.h r3 = r2.f20557b
            ka.l r3 = r3.a
            ka.c r3 = r3.f20582e
            android.graphics.RectF r2 = r2.g()
            float r2 = r3.a(r2)
            android.view.RoundedCorner r3 = u7.f0.c(r0)
            if (r3 == 0) goto L4e
            int r3 = androidx.core.app.c.c(r3)
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
            ka.i r2 = r5.f11581i
            ka.h r4 = r2.f20557b
            ka.l r4 = r4.a
            ka.c r4 = r4.f20583f
            android.graphics.RectF r2 = r2.g()
            float r2 = r4.a(r2)
            android.view.RoundedCorner r0 = u7.f0.f(r0)
            if (r0 == 0) goto L74
            int r0 = androidx.core.app.c.c(r0)
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.x():float");
    }

    public final int y() {
        int i10;
        if (this.f11576f) {
            return Math.min(Math.max(this.f11578g, this.V - ((this.U * 9) / 16)), this.T) + this.f11593v;
        }
        if (!this.f11586n && !this.f11587o && (i10 = this.f11585m) > 0) {
            return Math.max(this.f11574e, i10 + this.f11580h);
        }
        return this.f11574e + this.f11593v;
    }

    public final void z(int i10) {
        View view = (View) this.W.get();
        if (view != null) {
            ArrayList arrayList = this.Y;
            if (!arrayList.isEmpty()) {
                int i11 = this.G;
                if (i10 <= i11 && i11 != D()) {
                    D();
                }
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    ((v9.b) arrayList.get(i12)).b(view);
                }
            }
        }
    }

    public BottomSheetBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(0);
        int i10;
        this.a = 0;
        int i11 = 1;
        this.f11568b = true;
        this.f11583k = -1;
        this.f11584l = -1;
        this.A = new h(this, 0);
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = true;
        this.N = 4;
        this.S = 0.1f;
        this.Y = new ArrayList();
        this.f11571c0 = -1;
        this.f11577f0 = new SparseIntArray();
        this.f11579g0 = new v9.a(this);
        this.f11580h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r9.a.a);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f11582j = u0.z(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(22)) {
            this.f11596y = new l(l.b(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal));
        }
        l lVar = this.f11596y;
        if (lVar != null) {
            i iVar = new i(lVar);
            this.f11581i = iVar;
            iVar.h(context);
            ColorStateList colorStateList = this.f11582j;
            if (colorStateList != null) {
                this.f11581i.k(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f11581i.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(x(), 1.0f);
        this.B = ofFloat;
        ofFloat.setDuration(500L);
        this.B.addUpdateListener(new com.facebook.shimmer.d(this, i11));
        this.H = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.f11583k = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.f11584l = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(10);
        if (peekValue != null && (i10 = peekValue.data) == -1) {
            H(i10);
        } else {
            H(obtainStyledAttributes.getDimensionPixelSize(10, -1));
        }
        G(obtainStyledAttributes.getBoolean(9, false));
        this.f11586n = obtainStyledAttributes.getBoolean(14, false);
        boolean z10 = obtainStyledAttributes.getBoolean(7, true);
        if (this.f11568b != z10) {
            this.f11568b = z10;
            if (this.W != null) {
                w();
            }
            J((this.f11568b && this.N == 6) ? 3 : this.N);
            N(this.N, true);
            M();
        }
        this.J = obtainStyledAttributes.getBoolean(13, false);
        this.K = obtainStyledAttributes.getBoolean(4, true);
        this.L = obtainStyledAttributes.getBoolean(5, true);
        this.a = obtainStyledAttributes.getInt(11, 0);
        float f10 = obtainStyledAttributes.getFloat(8, 0.5f);
        if (f10 > 0.0f && f10 < 1.0f) {
            this.F = f10;
            if (this.W != null) {
                this.E = (int) ((1.0f - f10) * this.V);
            }
            TypedValue peekValue2 = obtainStyledAttributes.peekValue(6);
            if (peekValue2 != null && peekValue2.type == 16) {
                int i12 = peekValue2.data;
                if (i12 >= 0) {
                    this.C = i12;
                    N(this.N, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(6, 0);
                if (dimensionPixelOffset >= 0) {
                    this.C = dimensionPixelOffset;
                    N(this.N, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.f11572d = obtainStyledAttributes.getInt(12, 500);
            this.f11587o = obtainStyledAttributes.getBoolean(18, false);
            this.f11588p = obtainStyledAttributes.getBoolean(19, false);
            this.f11589q = obtainStyledAttributes.getBoolean(20, false);
            this.f11590r = obtainStyledAttributes.getBoolean(21, true);
            this.f11591s = obtainStyledAttributes.getBoolean(15, false);
            this.f11592t = obtainStyledAttributes.getBoolean(16, false);
            this.u = obtainStyledAttributes.getBoolean(17, false);
            this.f11595x = obtainStyledAttributes.getBoolean(24, true);
            obtainStyledAttributes.recycle();
            this.f11570c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }
}
