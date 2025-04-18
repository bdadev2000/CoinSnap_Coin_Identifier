package androidx.viewpager2.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.j0;
import androidx.recyclerview.widget.q0;
import androidx.viewpager2.adapter.d;
import h.c;
import i2.a;
import j2.e;
import j2.f;
import j2.g;
import j2.h;
import j2.i;
import j2.k;
import j2.l;
import j2.m;
import j2.n;
import j2.o;
import j2.p;
import j2.q;
import j2.r;
import java.util.List;

/* loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {

    /* renamed from: b, reason: collision with root package name */
    public final Rect f2147b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f2148c;

    /* renamed from: d, reason: collision with root package name */
    public final d f2149d;

    /* renamed from: f, reason: collision with root package name */
    public int f2150f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2151g;

    /* renamed from: h, reason: collision with root package name */
    public final g f2152h;

    /* renamed from: i, reason: collision with root package name */
    public k f2153i;

    /* renamed from: j, reason: collision with root package name */
    public int f2154j;

    /* renamed from: k, reason: collision with root package name */
    public Parcelable f2155k;

    /* renamed from: l, reason: collision with root package name */
    public p f2156l;

    /* renamed from: m, reason: collision with root package name */
    public o f2157m;

    /* renamed from: n, reason: collision with root package name */
    public f f2158n;

    /* renamed from: o, reason: collision with root package name */
    public d f2159o;

    /* renamed from: p, reason: collision with root package name */
    public c f2160p;

    /* renamed from: q, reason: collision with root package name */
    public j2.d f2161q;

    /* renamed from: r, reason: collision with root package name */
    public q0 f2162r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2163s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2164t;
    public int u;

    /* renamed from: v, reason: collision with root package name */
    public m f2165v;

    public ViewPager2(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2147b = new Rect();
        this.f2148c = new Rect();
        d dVar = new d();
        this.f2149d = dVar;
        int i10 = 0;
        this.f2151g = false;
        this.f2152h = new g(this, i10);
        this.f2154j = -1;
        this.f2162r = null;
        this.f2163s = false;
        int i11 = 1;
        this.f2164t = true;
        this.u = -1;
        this.f2165v = new m(this);
        p pVar = new p(this, context);
        this.f2156l = pVar;
        pVar.setId(ViewCompat.generateViewId());
        this.f2156l.setDescendantFocusability(131072);
        k kVar = new k(this, context);
        this.f2153i = kVar;
        this.f2156l.setLayoutManager(kVar);
        this.f2156l.setScrollingTouchSlop(1);
        int[] iArr = a.a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        ViewCompat.saveAttributeDataForStyleable(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        try {
            setOrientation(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
            this.f2156l.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.f2156l.addOnChildAttachStateChangeListener(new i());
            f fVar = new f(this);
            this.f2158n = fVar;
            this.f2160p = new c(this, fVar, this.f2156l, 8);
            o oVar = new o(this);
            this.f2157m = oVar;
            oVar.a(this.f2156l);
            this.f2156l.addOnScrollListener(this.f2158n);
            d dVar2 = new d();
            this.f2159o = dVar2;
            this.f2158n.a = dVar2;
            h hVar = new h(this, i10);
            h hVar2 = new h(this, i11);
            ((List) dVar2.f2130b).add(hVar);
            ((List) this.f2159o.f2130b).add(hVar2);
            this.f2165v.m(this.f2156l);
            ((List) this.f2159o.f2130b).add(dVar);
            j2.d dVar3 = new j2.d(this.f2153i);
            this.f2161q = dVar3;
            ((List) this.f2159o.f2130b).add(dVar3);
            p pVar2 = this.f2156l;
            attachViewToParent(pVar2, 0, pVar2.getLayoutParams());
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public final void a(l lVar) {
        ((List) this.f2149d.f2130b).add(lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        j0 adapter;
        if (this.f2154j == -1 || (adapter = getAdapter()) == 0) {
            return;
        }
        Parcelable parcelable = this.f2155k;
        if (parcelable != null) {
            if (adapter instanceof androidx.viewpager2.adapter.i) {
                ((androidx.viewpager2.adapter.g) ((androidx.viewpager2.adapter.i) adapter)).h(parcelable);
            }
            this.f2155k = null;
        }
        int max = Math.max(0, Math.min(this.f2154j, adapter.getItemCount() - 1));
        this.f2150f = max;
        this.f2154j = -1;
        this.f2156l.scrollToPosition(max);
        this.f2165v.r();
    }

    public final void c(int i10) {
        boolean z10;
        int i11;
        l lVar;
        boolean z11;
        j0 adapter = getAdapter();
        boolean z12 = false;
        if (adapter == null) {
            if (this.f2154j != -1) {
                this.f2154j = Math.max(i10, 0);
                return;
            }
            return;
        }
        if (adapter.getItemCount() <= 0) {
            return;
        }
        int min = Math.min(Math.max(i10, 0), adapter.getItemCount() - 1);
        int i12 = this.f2150f;
        if (min == i12) {
            if (this.f2158n.f19722f == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                return;
            }
        }
        if (min == i12) {
            return;
        }
        double d10 = i12;
        this.f2150f = min;
        this.f2165v.r();
        f fVar = this.f2158n;
        if (fVar.f19722f == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            fVar.e();
            e eVar = fVar.f19723g;
            d10 = eVar.f19716b + eVar.a;
        }
        f fVar2 = this.f2158n;
        fVar2.getClass();
        fVar2.f19721e = 2;
        fVar2.f19729m = false;
        if (fVar2.f19725i != min) {
            z12 = true;
        }
        fVar2.f19725i = min;
        fVar2.c(2);
        if (z12 && (lVar = fVar2.a) != null) {
            lVar.c(min);
        }
        double d11 = min;
        if (Math.abs(d11 - d10) > 3.0d) {
            p pVar = this.f2156l;
            if (d11 > d10) {
                i11 = min - 3;
            } else {
                i11 = min + 3;
            }
            pVar.scrollToPosition(i11);
            p pVar2 = this.f2156l;
            pVar2.post(new r(pVar2, min));
            return;
        }
        this.f2156l.smoothScrollToPosition(min);
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i10) {
        return this.f2156l.canScrollHorizontally(i10);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i10) {
        return this.f2156l.canScrollVertically(i10);
    }

    public final void d() {
        o oVar = this.f2157m;
        if (oVar != null) {
            View e2 = oVar.e(this.f2153i);
            if (e2 == null) {
                return;
            }
            int position = this.f2153i.getPosition(e2);
            if (position != this.f2150f && getScrollState() == 0) {
                this.f2159o.c(position);
            }
            this.f2151g = false;
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof q) {
            int i10 = ((q) parcelable).f19739b;
            sparseArray.put(this.f2156l.getId(), (Parcelable) sparseArray.get(i10));
            sparseArray.remove(i10);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    @RequiresApi(23)
    public CharSequence getAccessibilityClassName() {
        this.f2165v.getClass();
        this.f2165v.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    @Nullable
    public j0 getAdapter() {
        return this.f2156l.getAdapter();
    }

    public int getCurrentItem() {
        return this.f2150f;
    }

    public int getItemDecorationCount() {
        return this.f2156l.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.u;
    }

    public int getOrientation() {
        return this.f2153i.getOrientation() == 1 ? 1 : 0;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        p pVar = this.f2156l;
        if (getOrientation() == 0) {
            height = pVar.getWidth() - pVar.getPaddingLeft();
            paddingBottom = pVar.getPaddingRight();
        } else {
            height = pVar.getHeight() - pVar.getPaddingTop();
            paddingBottom = pVar.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.f2158n.f19722f;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f2165v.n(accessibilityNodeInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = this.f2156l.getMeasuredWidth();
        int measuredHeight = this.f2156l.getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        Rect rect = this.f2147b;
        rect.left = paddingLeft;
        rect.right = (i12 - i10) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i13 - i11) - getPaddingBottom();
        Rect rect2 = this.f2148c;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        this.f2156l.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.f2151g) {
            d();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        measureChild(this.f2156l, i10, i11);
        int measuredWidth = this.f2156l.getMeasuredWidth();
        int measuredHeight = this.f2156l.getMeasuredHeight();
        int measuredState = this.f2156l.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + measuredHeight;
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i10, measuredState), View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i11, measuredState << 16));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof q)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        q qVar = (q) parcelable;
        super.onRestoreInstanceState(qVar.getSuperState());
        this.f2154j = qVar.f19740c;
        this.f2155k = qVar.f19741d;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        q qVar = new q(super.onSaveInstanceState());
        qVar.f19739b = this.f2156l.getId();
        int i10 = this.f2154j;
        if (i10 == -1) {
            i10 = this.f2150f;
        }
        qVar.f19740c = i10;
        Parcelable parcelable = this.f2155k;
        if (parcelable != null) {
            qVar.f19741d = parcelable;
        } else {
            Object adapter = this.f2156l.getAdapter();
            if (adapter instanceof androidx.viewpager2.adapter.i) {
                androidx.viewpager2.adapter.g gVar = (androidx.viewpager2.adapter.g) ((androidx.viewpager2.adapter.i) adapter);
                gVar.getClass();
                r.e eVar = gVar.f2139k;
                int h10 = eVar.h();
                r.e eVar2 = gVar.f2140l;
                Bundle bundle = new Bundle(eVar2.h() + h10);
                for (int i11 = 0; i11 < eVar.h(); i11++) {
                    long e2 = eVar.e(i11);
                    Fragment fragment = (Fragment) eVar.d(e2, null);
                    if (fragment != null && fragment.isAdded()) {
                        gVar.f2138j.putFragment(bundle, kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.k("f#", e2), fragment);
                    }
                }
                for (int i12 = 0; i12 < eVar2.h(); i12++) {
                    long e10 = eVar2.e(i12);
                    if (gVar.b(e10)) {
                        bundle.putParcelable(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.k("s#", e10), (Parcelable) eVar2.d(e10, null));
                    }
                }
                qVar.f19741d = bundle;
            }
        }
        return qVar;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        boolean z10;
        this.f2165v.getClass();
        if (i10 != 8192 && i10 != 4096) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            this.f2165v.p(i10, bundle);
            return true;
        }
        return super.performAccessibilityAction(i10, bundle);
    }

    public void setAdapter(@Nullable j0 j0Var) {
        j0 adapter = this.f2156l.getAdapter();
        this.f2165v.l(adapter);
        g gVar = this.f2152h;
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver(gVar);
        }
        this.f2156l.setAdapter(j0Var);
        this.f2150f = 0;
        b();
        this.f2165v.k(j0Var);
        if (j0Var != null) {
            j0Var.registerAdapterDataObserver(gVar);
        }
    }

    public void setCurrentItem(int i10) {
        if (!((f) this.f2160p.f18524d).f19729m) {
            c(i10);
            return;
        }
        throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
    }

    @Override // android.view.View
    @RequiresApi(17)
    public void setLayoutDirection(int i10) {
        super.setLayoutDirection(i10);
        this.f2165v.r();
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1 && i10 != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.u = i10;
        this.f2156l.requestLayout();
    }

    public void setOrientation(int i10) {
        this.f2153i.setOrientation(i10);
        this.f2165v.r();
    }

    public void setPageTransformer(@Nullable n nVar) {
        if (nVar != null) {
            if (!this.f2163s) {
                this.f2162r = this.f2156l.getItemAnimator();
                this.f2163s = true;
            }
            this.f2156l.setItemAnimator(null);
        } else if (this.f2163s) {
            this.f2156l.setItemAnimator(this.f2162r);
            this.f2162r = null;
            this.f2163s = false;
        }
        j2.d dVar = this.f2161q;
        if (nVar == dVar.f19715b) {
            return;
        }
        dVar.f19715b = nVar;
        if (nVar != null) {
            f fVar = this.f2158n;
            fVar.e();
            e eVar = fVar.f19723g;
            double d10 = eVar.f19716b + eVar.a;
            int i10 = (int) d10;
            float f10 = (float) (d10 - i10);
            this.f2161q.b(i10, f10, Math.round(getPageSize() * f10));
        }
    }

    public void setUserInputEnabled(boolean z10) {
        this.f2164t = z10;
        this.f2165v.r();
    }
}
