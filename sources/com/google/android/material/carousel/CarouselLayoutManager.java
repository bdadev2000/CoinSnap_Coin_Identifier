package com.google.android.material.carousel;

import D3.c;
import D3.d;
import D3.e;
import D3.f;
import D3.g;
import D3.h;
import a5.C0398b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.C0525e0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.W;
import androidx.recyclerview.widget.X;
import androidx.recyclerview.widget.j0;
import androidx.recyclerview.widget.l0;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.mbridge.msdk.foundation.entity.o;
import com.tools.arruler.photomeasure.camera.ruler.R;
import java.util.List;
import w3.AbstractC2861a;

/* loaded from: classes2.dex */
public class CarouselLayoutManager extends W implements j0 {

    /* renamed from: a, reason: collision with root package name */
    public final h f13988a;
    public f b;

    /* renamed from: c, reason: collision with root package name */
    public final View.OnLayoutChangeListener f13989c;

    public CarouselLayoutManager() {
        h hVar = new h();
        new d();
        this.f13989c = new View.OnLayoutChangeListener() { // from class: D3.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
                CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
                carouselLayoutManager.getClass();
                if (i9 != i13 || i10 != i14 || i11 != i15 || i12 != i16) {
                    view.post(new b(carouselLayoutManager, 0));
                }
            }
        };
        this.f13988a = hVar;
        requestLayout();
        setOrientation(0);
    }

    /* JADX WARN: Type inference failed for: r14v1, types: [a5.b, java.lang.Object] */
    public static C0398b h(List list, float f9, boolean z8) {
        float f10 = Float.MAX_VALUE;
        int i9 = -1;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        float f11 = -3.4028235E38f;
        float f12 = Float.MAX_VALUE;
        float f13 = Float.MAX_VALUE;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((g) list.get(i13)).getClass();
            float abs = Math.abs(0.0f - f9);
            if (0.0f <= f9 && abs <= f10) {
                i9 = i13;
                f10 = abs;
            }
            if (0.0f > f9 && abs <= f12) {
                i11 = i13;
                f12 = abs;
            }
            if (0.0f <= f13) {
                f13 = 0.0f;
                i10 = i13;
            }
            if (0.0f > f11) {
                f11 = 0.0f;
                i12 = i13;
            }
        }
        if (i9 == -1) {
            i9 = i10;
        }
        if (i11 == -1) {
            i11 = i12;
        }
        g gVar = (g) list.get(i9);
        g gVar2 = (g) list.get(i11);
        ?? obj = new Object();
        gVar.getClass();
        gVar2.getClass();
        if (0.0f <= 0.0f) {
            return obj;
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.recyclerview.widget.W
    public final boolean canScrollHorizontally() {
        return i();
    }

    @Override // androidx.recyclerview.widget.W
    public final boolean canScrollVertically() {
        return !i();
    }

    @Override // androidx.recyclerview.widget.W
    public final int computeHorizontalScrollExtent(l0 l0Var) {
        getChildCount();
        return 0;
    }

    @Override // androidx.recyclerview.widget.W
    public final int computeHorizontalScrollOffset(l0 l0Var) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.W
    public final int computeHorizontalScrollRange(l0 l0Var) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.j0
    public final PointF computeScrollVectorForPosition(int i9) {
        return null;
    }

    @Override // androidx.recyclerview.widget.W
    public final int computeVerticalScrollExtent(l0 l0Var) {
        getChildCount();
        return 0;
    }

    @Override // androidx.recyclerview.widget.W
    public final int computeVerticalScrollOffset(l0 l0Var) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.W
    public final int computeVerticalScrollRange(l0 l0Var) {
        return 0;
    }

    public final float f(int i9) {
        this.b.d();
        throw null;
    }

    public final int g() {
        if (i()) {
            return getWidth();
        }
        return getHeight();
    }

    @Override // androidx.recyclerview.widget.W
    public final X generateDefaultLayoutParams() {
        return new X(-2, -2);
    }

    @Override // androidx.recyclerview.widget.W
    public final void getDecoratedBoundsWithMargins(View view, Rect rect) {
        super.getDecoratedBoundsWithMargins(view, rect);
        rect.centerY();
        if (i()) {
            rect.centerX();
        }
        throw null;
    }

    public final boolean i() {
        if (this.b.f743a == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.W
    public final boolean isAutoMeasureEnabled() {
        return true;
    }

    public final boolean j() {
        if (i() && getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.W
    public final void measureChildWithMargins(View view, int i9, int i10) {
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // androidx.recyclerview.widget.W
    public final void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        h hVar = this.f13988a;
        Context context = recyclerView.getContext();
        float f9 = hVar.f744a;
        if (f9 <= 0.0f) {
            f9 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        hVar.f744a = f9;
        float f10 = hVar.b;
        if (f10 <= 0.0f) {
            f10 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        hVar.b = f10;
        c();
        recyclerView.addOnLayoutChangeListener(this.f13989c);
    }

    @Override // androidx.recyclerview.widget.W
    public final void onDetachedFromWindow(RecyclerView recyclerView, C0525e0 c0525e0) {
        onDetachedFromWindow(recyclerView);
        recyclerView.removeOnLayoutChangeListener(this.f13989c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x003a, code lost:
    
        if (r10 == 1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0043, code lost:
    
        if (j() != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0046, code lost:
    
        if (r10 == 1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x004f, code lost:
    
        if (j() != false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    @Override // androidx.recyclerview.widget.W
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View onFocusSearchFailed(android.view.View r7, int r8, androidx.recyclerview.widget.C0525e0 r9, androidx.recyclerview.widget.l0 r10) {
        /*
            r6 = this;
            int r10 = r6.getChildCount()
            r0 = 0
            if (r10 != 0) goto L8
            return r0
        L8:
            D3.f r10 = r6.b
            int r10 = r10.f743a
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = -1
            r3 = 1
            if (r8 == r3) goto L53
            r4 = 2
            if (r8 == r4) goto L51
            r4 = 17
            if (r8 == r4) goto L49
            r4 = 33
            if (r8 == r4) goto L46
            r4 = 66
            if (r8 == r4) goto L3d
            r4 = 130(0x82, float:1.82E-43)
            if (r8 == r4) goto L3a
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r4 = "Unknown focus request:"
            r10.<init>(r4)
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            java.lang.String r10 = "CarouselLayoutManager"
            android.util.Log.d(r10, r8)
        L38:
            r8 = r1
            goto L54
        L3a:
            if (r10 != r3) goto L38
            goto L51
        L3d:
            if (r10 != 0) goto L38
            boolean r8 = r6.j()
            if (r8 == 0) goto L51
            goto L53
        L46:
            if (r10 != r3) goto L38
            goto L53
        L49:
            if (r10 != 0) goto L38
            boolean r8 = r6.j()
            if (r8 == 0) goto L53
        L51:
            r8 = r3
            goto L54
        L53:
            r8 = r2
        L54:
            if (r8 != r1) goto L57
            return r0
        L57:
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10 = 0
            if (r8 != r2) goto L96
            int r7 = r6.getPosition(r7)
            if (r7 != 0) goto L66
            return r0
        L66:
            android.view.View r7 = r6.getChildAt(r10)
            int r7 = r6.getPosition(r7)
            int r7 = r7 - r3
            if (r7 < 0) goto L85
            int r8 = r6.getItemCount()
            if (r7 < r8) goto L78
            goto L85
        L78:
            r6.f(r7)
            androidx.recyclerview.widget.p0 r7 = r9.l(r7, r4)
            android.view.View r7 = r7.itemView
            r6.measureChildWithMargins(r7, r10, r10)
            throw r0
        L85:
            boolean r7 = r6.j()
            if (r7 == 0) goto L91
            int r7 = r6.getChildCount()
            int r10 = r7 + (-1)
        L91:
            android.view.View r7 = r6.getChildAt(r10)
            goto Ld7
        L96:
            int r7 = r6.getPosition(r7)
            int r8 = r6.getItemCount()
            int r8 = r8 - r3
            if (r7 != r8) goto La2
            return r0
        La2:
            int r7 = r6.getChildCount()
            int r7 = r7 - r3
            android.view.View r7 = r6.getChildAt(r7)
            int r7 = r6.getPosition(r7)
            int r7 = r7 + r3
            if (r7 < 0) goto Lc6
            int r8 = r6.getItemCount()
            if (r7 < r8) goto Lb9
            goto Lc6
        Lb9:
            r6.f(r7)
            androidx.recyclerview.widget.p0 r7 = r9.l(r7, r4)
            android.view.View r7 = r7.itemView
            r6.measureChildWithMargins(r7, r10, r10)
            throw r0
        Lc6:
            boolean r7 = r6.j()
            if (r7 == 0) goto Lcd
            goto Ld3
        Lcd:
            int r7 = r6.getChildCount()
            int r10 = r7 + (-1)
        Ld3:
            android.view.View r7 = r6.getChildAt(r10)
        Ld7:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.CarouselLayoutManager.onFocusSearchFailed(android.view.View, int, androidx.recyclerview.widget.e0, androidx.recyclerview.widget.l0):android.view.View");
    }

    @Override // androidx.recyclerview.widget.W
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(getPosition(getChildAt(0)));
            accessibilityEvent.setToIndex(getPosition(getChildAt(getChildCount() - 1)));
        }
    }

    @Override // androidx.recyclerview.widget.W
    public final void onItemsAdded(RecyclerView recyclerView, int i9, int i10) {
        super.onItemsAdded(recyclerView, i9, i10);
        e();
    }

    @Override // androidx.recyclerview.widget.W
    public final void onItemsRemoved(RecyclerView recyclerView, int i9, int i10) {
        super.onItemsRemoved(recyclerView, i9, i10);
        e();
    }

    @Override // androidx.recyclerview.widget.W
    public final void onLayoutChildren(C0525e0 c0525e0, l0 l0Var) {
        if (l0Var.b() > 0 && g() > 0.0f) {
            j();
            measureChildWithMargins(c0525e0.l(0, Long.MAX_VALUE).itemView, 0, 0);
            throw null;
        }
        removeAndRecycleAllViews(c0525e0);
    }

    @Override // androidx.recyclerview.widget.W
    public final void onLayoutCompleted(l0 l0Var) {
        if (getChildCount() != 0) {
            getPosition(getChildAt(0));
        }
    }

    @Override // androidx.recyclerview.widget.W
    public final boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z8, boolean z9) {
        return false;
    }

    @Override // androidx.recyclerview.widget.W
    public final int scrollHorizontallyBy(int i9, C0525e0 c0525e0, l0 l0Var) {
        if (!i() || getChildCount() == 0 || i9 == 0) {
            return 0;
        }
        measureChildWithMargins(c0525e0.l(0, Long.MAX_VALUE).itemView, 0, 0);
        throw null;
    }

    @Override // androidx.recyclerview.widget.W
    public final void scrollToPosition(int i9) {
    }

    @Override // androidx.recyclerview.widget.W
    public final int scrollVerticallyBy(int i9, C0525e0 c0525e0, l0 l0Var) {
        if (!canScrollVertically() || getChildCount() == 0 || i9 == 0) {
            return 0;
        }
        measureChildWithMargins(c0525e0.l(0, Long.MAX_VALUE).itemView, 0, 0);
        throw null;
    }

    public final void setOrientation(int i9) {
        e eVar;
        if (i9 != 0 && i9 != 1) {
            throw new IllegalArgumentException(o.h(i9, "invalid orientation:"));
        }
        assertNotInLayoutOrScroll(null);
        f fVar = this.b;
        if (fVar == null || i9 != fVar.f743a) {
            if (i9 != 0) {
                if (i9 == 1) {
                    eVar = new e(this, 0);
                } else {
                    throw new IllegalArgumentException("invalid orientation");
                }
            } else {
                eVar = new e(this, 1);
            }
            this.b = eVar;
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.W
    public final void smoothScrollToPosition(RecyclerView recyclerView, l0 l0Var, int i9) {
        c cVar = new c(0, recyclerView.getContext(), this);
        cVar.f5018a = i9;
        startSmoothScroll(cVar);
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i9, int i10) {
        new d();
        this.f13989c = new View.OnLayoutChangeListener() { // from class: D3.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i92, int i102, int i11, int i12, int i13, int i14, int i15, int i16) {
                CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
                carouselLayoutManager.getClass();
                if (i92 != i13 || i102 != i14 || i11 != i15 || i12 != i16) {
                    view.post(new b(carouselLayoutManager, 0));
                }
            }
        };
        this.f13988a = new h();
        requestLayout();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2861a.b);
            obtainStyledAttributes.getInt(0, 0);
            requestLayout();
            setOrientation(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
        }
    }
}
