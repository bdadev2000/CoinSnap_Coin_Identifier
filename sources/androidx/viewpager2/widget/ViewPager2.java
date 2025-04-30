package androidx.viewpager2.widget;

import B3.k;
import E1.c;
import E6.f;
import Q0.a;
import Q7.n0;
import S0.d;
import S0.e;
import S0.g;
import S0.j;
import S0.l;
import S0.m;
import S0.n;
import S0.o;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
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
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.G;
import androidx.recyclerview.widget.J;
import androidx.recyclerview.widget.Q;
import b1.h;
import j5.C2400c;
import java.util.ArrayList;
import n1.C2475f;

/* loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {
    public final Rect b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f5167c;

    /* renamed from: d, reason: collision with root package name */
    public final f f5168d;

    /* renamed from: f, reason: collision with root package name */
    public int f5169f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5170g;

    /* renamed from: h, reason: collision with root package name */
    public final g f5171h;

    /* renamed from: i, reason: collision with root package name */
    public final j f5172i;

    /* renamed from: j, reason: collision with root package name */
    public int f5173j;

    /* renamed from: k, reason: collision with root package name */
    public Parcelable f5174k;
    public final n l;
    public final m m;

    /* renamed from: n, reason: collision with root package name */
    public final S0.f f5175n;

    /* renamed from: o, reason: collision with root package name */
    public final f f5176o;

    /* renamed from: p, reason: collision with root package name */
    public final C2400c f5177p;

    /* renamed from: q, reason: collision with root package name */
    public final d f5178q;

    /* renamed from: r, reason: collision with root package name */
    public Q f5179r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f5180s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f5181t;

    /* renamed from: u, reason: collision with root package name */
    public int f5182u;

    /* renamed from: v, reason: collision with root package name */
    public final h f5183v;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2, types: [androidx.recyclerview.widget.Y, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [b1.h, java.lang.Object] */
    public ViewPager2(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new Rect();
        this.f5167c = new Rect();
        f fVar = new f();
        this.f5168d = fVar;
        this.f5170g = false;
        this.f5171h = new g(this, 0);
        this.f5173j = -1;
        this.f5179r = null;
        this.f5180s = false;
        this.f5181t = true;
        this.f5182u = -1;
        ?? obj = new Object();
        obj.f5272f = this;
        obj.b = new C2475f((Object) obj, 8);
        obj.f5270c = new c((Object) obj, 12);
        this.f5183v = obj;
        n nVar = new n(this, context);
        this.l = nVar;
        nVar.setId(ViewCompat.generateViewId());
        this.l.setDescendantFocusability(131072);
        j jVar = new j(this, context);
        this.f5172i = jVar;
        this.l.setLayoutManager(jVar);
        this.l.setScrollingTouchSlop(1);
        int[] iArr = a.f2466a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        ViewCompat.saveAttributeDataForStyleable(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        try {
            setOrientation(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
            this.l.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.l.addOnChildAttachStateChangeListener(new Object());
            S0.f fVar2 = new S0.f(this);
            this.f5175n = fVar2;
            this.f5177p = new C2400c(fVar2, 10);
            m mVar = new m(this);
            this.m = mVar;
            mVar.a(this.l);
            this.l.addOnScrollListener(this.f5175n);
            f fVar3 = new f();
            this.f5176o = fVar3;
            this.f5175n.f2776a = fVar3;
            S0.h hVar = new S0.h(this, 0);
            S0.h hVar2 = new S0.h(this, 1);
            ((ArrayList) fVar3.b).add(hVar);
            ((ArrayList) this.f5176o.b).add(hVar2);
            this.f5183v.k(this.l);
            ((ArrayList) this.f5176o.b).add(fVar);
            d dVar = new d(this.f5172i);
            this.f5178q = dVar;
            ((ArrayList) this.f5176o.b).add(dVar);
            n nVar2 = this.l;
            attachViewToParent(nVar2, 0, nVar2.getLayoutParams());
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void a() {
        J adapter;
        boolean z8;
        if (this.f5173j == -1 || (adapter = getAdapter()) == null) {
            return;
        }
        Parcelable parcelable = this.f5174k;
        if (parcelable != null) {
            if (adapter instanceof F6.a) {
                F6.a aVar = (F6.a) adapter;
                x.f fVar = aVar.l;
                if (fVar.h() == 0) {
                    x.f fVar2 = aVar.f1212k;
                    if (fVar2.h() == 0) {
                        Bundle bundle = (Bundle) parcelable;
                        if (bundle.getClassLoader() == null) {
                            bundle.setClassLoader(F6.a.class.getClassLoader());
                        }
                        for (String str : bundle.keySet()) {
                            if (str.startsWith("f#") && str.length() > 2) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            if (z8) {
                                fVar2.f(Long.parseLong(str.substring(2)), aVar.f1211j.getFragment(bundle, str));
                            } else if (str.startsWith("s#") && str.length() > 2) {
                                long parseLong = Long.parseLong(str.substring(2));
                                G g9 = (G) bundle.getParcelable(str);
                                if (aVar.b(parseLong)) {
                                    fVar.f(parseLong, g9);
                                }
                            } else {
                                throw new IllegalArgumentException("Unexpected key in savedState: ".concat(str));
                            }
                        }
                        if (fVar2.h() != 0) {
                            aVar.f1216q = true;
                            aVar.f1215p = true;
                            aVar.c();
                            Handler handler = new Handler(Looper.getMainLooper());
                            k kVar = new k(aVar, 4);
                            aVar.f1210i.a(new R0.a(1, handler, kVar));
                            handler.postDelayed(kVar, 10000L);
                        }
                    }
                }
                throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
            }
            this.f5174k = null;
        }
        int max = Math.max(0, Math.min(this.f5173j, adapter.getItemCount() - 1));
        this.f5169f = max;
        this.f5173j = -1;
        this.l.scrollToPosition(max);
        this.f5183v.m();
    }

    public final void b(int i9) {
        int i10;
        S0.k kVar;
        J adapter = getAdapter();
        boolean z8 = false;
        if (adapter == null) {
            if (this.f5173j != -1) {
                this.f5173j = Math.max(i9, 0);
                return;
            }
            return;
        }
        if (adapter.getItemCount() <= 0) {
            return;
        }
        int min = Math.min(Math.max(i9, 0), adapter.getItemCount() - 1);
        int i11 = this.f5169f;
        if ((min == i11 && this.f5175n.f2780f == 0) || min == i11) {
            return;
        }
        double d2 = i11;
        this.f5169f = min;
        this.f5183v.m();
        S0.f fVar = this.f5175n;
        if (fVar.f2780f != 0) {
            fVar.e();
            e eVar = fVar.f2781g;
            d2 = eVar.f2774a + eVar.b;
        }
        S0.f fVar2 = this.f5175n;
        fVar2.getClass();
        fVar2.f2779e = 2;
        fVar2.m = false;
        if (fVar2.f2783i != min) {
            z8 = true;
        }
        fVar2.f2783i = min;
        fVar2.c(2);
        if (z8 && (kVar = fVar2.f2776a) != null) {
            kVar.c(min);
        }
        double d9 = min;
        if (Math.abs(d9 - d2) > 3.0d) {
            n nVar = this.l;
            if (d9 > d2) {
                i10 = min - 3;
            } else {
                i10 = min + 3;
            }
            nVar.scrollToPosition(i10);
            n nVar2 = this.l;
            nVar2.post(new Q.a(nVar2, min));
            return;
        }
        this.l.smoothScrollToPosition(min);
    }

    public final void c() {
        m mVar = this.m;
        if (mVar != null) {
            View e4 = mVar.e(this.f5172i);
            if (e4 == null) {
                return;
            }
            int position = this.f5172i.getPosition(e4);
            if (position != this.f5169f && getScrollState() == 0) {
                this.f5176o.c(position);
            }
            this.f5170g = false;
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i9) {
        return this.l.canScrollHorizontally(i9);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i9) {
        return this.l.canScrollVertically(i9);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof o) {
            int i9 = ((o) parcelable).b;
            sparseArray.put(this.l.getId(), (Parcelable) sparseArray.get(i9));
            sparseArray.remove(i9);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    @RequiresApi(23)
    public CharSequence getAccessibilityClassName() {
        this.f5183v.getClass();
        this.f5183v.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    @Nullable
    public J getAdapter() {
        return this.l.getAdapter();
    }

    public int getCurrentItem() {
        return this.f5169f;
    }

    public int getItemDecorationCount() {
        return this.l.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f5182u;
    }

    public int getOrientation() {
        if (this.f5172i.getOrientation() == 1) {
            return 1;
        }
        return 0;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        n nVar = this.l;
        if (getOrientation() == 0) {
            height = nVar.getWidth() - nVar.getPaddingLeft();
            paddingBottom = nVar.getPaddingRight();
        } else {
            height = nVar.getHeight() - nVar.getPaddingTop();
            paddingBottom = nVar.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.f5175n.f2780f;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i9;
        int i10;
        int itemCount;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ViewPager2 viewPager2 = (ViewPager2) this.f5183v.f5272f;
        if (viewPager2.getAdapter() != null) {
            if (viewPager2.getOrientation() == 1) {
                i9 = viewPager2.getAdapter().getItemCount();
                i10 = 1;
            } else {
                i10 = viewPager2.getAdapter().getItemCount();
                i9 = 1;
            }
        } else {
            i9 = 0;
            i10 = 0;
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(i9, i10, false, 0));
        J adapter = viewPager2.getAdapter();
        if (adapter != null && (itemCount = adapter.getItemCount()) != 0 && viewPager2.f5181t) {
            if (viewPager2.f5169f > 0) {
                accessibilityNodeInfo.addAction(FragmentTransaction.TRANSIT_EXIT_MASK);
            }
            if (viewPager2.f5169f < itemCount - 1) {
                accessibilityNodeInfo.addAction(4096);
            }
            accessibilityNodeInfo.setScrollable(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i9, int i10, int i11, int i12) {
        int measuredWidth = this.l.getMeasuredWidth();
        int measuredHeight = this.l.getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        Rect rect = this.b;
        rect.left = paddingLeft;
        rect.right = (i11 - i9) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i12 - i10) - getPaddingBottom();
        Rect rect2 = this.f5167c;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        this.l.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.f5170g) {
            c();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        measureChild(this.l, i9, i10);
        int measuredWidth = this.l.getMeasuredWidth();
        int measuredHeight = this.l.getMeasuredHeight();
        int measuredState = this.l.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + measuredHeight;
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i9, measuredState), View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i10, measuredState << 16));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof o)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        o oVar = (o) parcelable;
        super.onRestoreInstanceState(oVar.getSuperState());
        this.f5173j = oVar.f2790c;
        this.f5174k = oVar.f2791d;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, S0.o] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.b = this.l.getId();
        int i9 = this.f5173j;
        if (i9 == -1) {
            i9 = this.f5169f;
        }
        baseSavedState.f2790c = i9;
        Parcelable parcelable = this.f5174k;
        if (parcelable != null) {
            baseSavedState.f2791d = parcelable;
        } else {
            J adapter = this.l.getAdapter();
            if (adapter instanceof F6.a) {
                F6.a aVar = (F6.a) adapter;
                aVar.getClass();
                x.f fVar = aVar.f1212k;
                int h6 = fVar.h();
                x.f fVar2 = aVar.l;
                Bundle bundle = new Bundle(fVar2.h() + h6);
                for (int i10 = 0; i10 < fVar.h(); i10++) {
                    long e4 = fVar.e(i10);
                    Fragment fragment = (Fragment) fVar.d(null, e4);
                    if (fragment != null && fragment.isAdded()) {
                        aVar.f1211j.putFragment(bundle, n0.g(e4, "f#"), fragment);
                    }
                }
                for (int i11 = 0; i11 < fVar2.h(); i11++) {
                    long e9 = fVar2.e(i11);
                    if (aVar.b(e9)) {
                        bundle.putParcelable(n0.g(e9, "s#"), (Parcelable) fVar2.d(null, e9));
                    }
                }
                baseSavedState.f2791d = bundle;
            }
        }
        return baseSavedState;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i9, Bundle bundle) {
        int currentItem;
        this.f5183v.getClass();
        if (i9 != 8192 && i9 != 4096) {
            return super.performAccessibilityAction(i9, bundle);
        }
        h hVar = this.f5183v;
        hVar.getClass();
        if (i9 != 8192 && i9 != 4096) {
            throw new IllegalStateException();
        }
        ViewPager2 viewPager2 = (ViewPager2) hVar.f5272f;
        if (i9 == 8192) {
            currentItem = viewPager2.getCurrentItem() - 1;
        } else {
            currentItem = viewPager2.getCurrentItem() + 1;
        }
        if (viewPager2.f5181t) {
            viewPager2.b(currentItem);
        }
        return true;
    }

    public void setAdapter(@Nullable J j7) {
        J adapter = this.l.getAdapter();
        h hVar = this.f5183v;
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver((g) hVar.f5271d);
        } else {
            hVar.getClass();
        }
        g gVar = this.f5171h;
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver(gVar);
        }
        this.l.setAdapter(j7);
        this.f5169f = 0;
        a();
        h hVar2 = this.f5183v;
        hVar2.m();
        if (j7 != null) {
            j7.registerAdapterDataObserver((g) hVar2.f5271d);
        }
        if (j7 != null) {
            j7.registerAdapterDataObserver(gVar);
        }
    }

    public void setCurrentItem(int i9) {
        if (!((S0.f) this.f5177p.f21107c).m) {
            b(i9);
            return;
        }
        throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
    }

    @Override // android.view.View
    @RequiresApi(17)
    public void setLayoutDirection(int i9) {
        super.setLayoutDirection(i9);
        this.f5183v.m();
    }

    public void setOffscreenPageLimit(int i9) {
        if (i9 < 1 && i9 != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.f5182u = i9;
        this.l.requestLayout();
    }

    public void setOrientation(int i9) {
        this.f5172i.setOrientation(i9);
        this.f5183v.m();
    }

    public void setPageTransformer(@Nullable l lVar) {
        if (lVar != null) {
            if (!this.f5180s) {
                this.f5179r = this.l.getItemAnimator();
                this.f5180s = true;
            }
            this.l.setItemAnimator(null);
        } else if (this.f5180s) {
            this.l.setItemAnimator(this.f5179r);
            this.f5179r = null;
            this.f5180s = false;
        }
        d dVar = this.f5178q;
        if (lVar == dVar.b) {
            return;
        }
        dVar.b = lVar;
        if (lVar != null) {
            S0.f fVar = this.f5175n;
            fVar.e();
            e eVar = fVar.f2781g;
            double d2 = eVar.f2774a + eVar.b;
            int i9 = (int) d2;
            float f9 = (float) (d2 - i9);
            this.f5178q.b(i9, f9, Math.round(getPageSize() * f9));
        }
    }

    public void setUserInputEnabled(boolean z8) {
        this.f5181t = z8;
        this.f5183v.m();
    }
}
