package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d1;
import androidx.recyclerview.widget.e0;
import androidx.recyclerview.widget.i1;
import androidx.recyclerview.widget.k1;
import androidx.recyclerview.widget.v0;
import androidx.recyclerview.widget.w0;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.plantcare.ai.identifier.plantid.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import r4.c;
import s9.a;
import x9.b;
import x9.d;
import x9.e;
import x9.f;
import x9.h;
import x9.i;
import x9.j;
import x9.k;

/* loaded from: classes3.dex */
public class CarouselLayoutManager extends v0 implements i1 {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public int f11627b;

    /* renamed from: c, reason: collision with root package name */
    public int f11628c;

    /* renamed from: d, reason: collision with root package name */
    public final d f11629d;

    /* renamed from: e, reason: collision with root package name */
    public f f11630e;

    /* renamed from: f, reason: collision with root package name */
    public j f11631f;

    /* renamed from: g, reason: collision with root package name */
    public i f11632g;

    /* renamed from: h, reason: collision with root package name */
    public int f11633h;

    /* renamed from: i, reason: collision with root package name */
    public HashMap f11634i;

    /* renamed from: j, reason: collision with root package name */
    public e f11635j;

    /* renamed from: k, reason: collision with root package name */
    public final b f11636k;

    /* renamed from: l, reason: collision with root package name */
    public int f11637l;

    /* renamed from: m, reason: collision with root package name */
    public int f11638m;

    /* renamed from: n, reason: collision with root package name */
    public int f11639n;

    /* JADX WARN: Type inference failed for: r2v0, types: [x9.b] */
    public CarouselLayoutManager() {
        k kVar = new k();
        this.f11629d = new d();
        final int i10 = 0;
        this.f11633h = 0;
        this.f11636k = new View.OnLayoutChangeListener(this) { // from class: x9.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CarouselLayoutManager f27579c;

            {
                this.f27579c = this;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                int i19 = i10;
                int i20 = 3;
                CarouselLayoutManager carouselLayoutManager = this.f27579c;
                switch (i19) {
                    case 0:
                        carouselLayoutManager.getClass();
                        if (i11 != i15 || i12 != i16 || i13 != i17 || i14 != i18) {
                            view.post(new k8.f(carouselLayoutManager, i20));
                            return;
                        }
                        return;
                    default:
                        carouselLayoutManager.getClass();
                        if (i11 != i15 || i12 != i16 || i13 != i17 || i14 != i18) {
                            view.post(new k8.f(carouselLayoutManager, i20));
                            return;
                        }
                        return;
                }
            }
        };
        this.f11638m = -1;
        this.f11639n = 0;
        this.f11630e = kVar;
        w();
        setOrientation(0);
    }

    public static float m(float f10, c cVar) {
        h hVar = (h) cVar.f23999c;
        float f11 = hVar.f27596d;
        h hVar2 = (h) cVar.f24000d;
        return a.a(f11, hVar2.f27596d, hVar.f27594b, hVar2.f27594b, f10);
    }

    public static c p(float f10, List list, boolean z10) {
        float f11;
        float f12 = Float.MAX_VALUE;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        float f13 = -3.4028235E38f;
        float f14 = Float.MAX_VALUE;
        float f15 = Float.MAX_VALUE;
        for (int i14 = 0; i14 < list.size(); i14++) {
            h hVar = (h) list.get(i14);
            if (z10) {
                f11 = hVar.f27594b;
            } else {
                f11 = hVar.a;
            }
            float abs = Math.abs(f11 - f10);
            if (f11 <= f10 && abs <= f12) {
                i10 = i14;
                f12 = abs;
            }
            if (f11 > f10 && abs <= f14) {
                i12 = i14;
                f14 = abs;
            }
            if (f11 <= f15) {
                i11 = i14;
                f15 = f11;
            }
            if (f11 > f13) {
                i13 = i14;
                f13 = f11;
            }
        }
        if (i10 == -1) {
            i10 = i11;
        }
        if (i12 == -1) {
            i12 = i13;
        }
        return new c((h) list.get(i10), (h) list.get(i12));
    }

    @Override // androidx.recyclerview.widget.v0
    public final boolean canScrollHorizontally() {
        return q();
    }

    @Override // androidx.recyclerview.widget.v0
    public final boolean canScrollVertically() {
        return !q();
    }

    @Override // androidx.recyclerview.widget.v0
    public final int computeHorizontalScrollExtent(k1 k1Var) {
        if (getChildCount() != 0 && this.f11631f != null && getItemCount() > 1) {
            return (int) (getWidth() * (this.f11631f.a.a / (this.f11628c - this.f11627b)));
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.v0
    public final int computeHorizontalScrollOffset(k1 k1Var) {
        return this.a;
    }

    @Override // androidx.recyclerview.widget.v0
    public final int computeHorizontalScrollRange(k1 k1Var) {
        return this.f11628c - this.f11627b;
    }

    @Override // androidx.recyclerview.widget.i1
    public final PointF computeScrollVectorForPosition(int i10) {
        if (this.f11631f == null) {
            return null;
        }
        int n10 = n(i10, l(i10)) - this.a;
        if (q()) {
            return new PointF(n10, 0.0f);
        }
        return new PointF(0.0f, n10);
    }

    @Override // androidx.recyclerview.widget.v0
    public final int computeVerticalScrollExtent(k1 k1Var) {
        if (getChildCount() != 0 && this.f11631f != null && getItemCount() > 1) {
            return (int) (getHeight() * (this.f11631f.a.a / (this.f11628c - this.f11627b)));
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.v0
    public final int computeVerticalScrollOffset(k1 k1Var) {
        return this.a;
    }

    @Override // androidx.recyclerview.widget.v0
    public final int computeVerticalScrollRange(k1 k1Var) {
        return this.f11628c - this.f11627b;
    }

    public final void d(View view, int i10, x9.c cVar) {
        float f10 = this.f11632g.a / 2.0f;
        addView(view, i10);
        float f11 = cVar.f27580b;
        this.f11635j.l(view, (int) (f11 - f10), (int) (f11 + f10));
    }

    public final float e(float f10, float f11) {
        return r() ? f10 - f11 : f10 + f11;
    }

    public final void f(int i10, d1 d1Var, k1 k1Var) {
        float i11 = i(i10);
        while (i10 < k1Var.b()) {
            x9.c u = u(d1Var, i11, i10);
            float f10 = u.f27580b;
            c cVar = u.f27581c;
            if (!s(f10, cVar)) {
                i11 = e(i11, this.f11632g.a);
                if (!t(f10, cVar)) {
                    d(u.a, -1, u);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void g(d1 d1Var, int i10) {
        float i11 = i(i10);
        while (i10 >= 0) {
            x9.c u = u(d1Var, i11, i10);
            float f10 = u.f27580b;
            c cVar = u.f27581c;
            if (!t(f10, cVar)) {
                float f11 = this.f11632g.a;
                if (r()) {
                    i11 += f11;
                } else {
                    i11 -= f11;
                }
                if (!s(f10, cVar)) {
                    d(u.a, 0, u);
                }
                i10--;
            } else {
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.v0
    public final w0 generateDefaultLayoutParams() {
        return new w0(-2, -2);
    }

    @Override // androidx.recyclerview.widget.v0
    public final void getDecoratedBoundsWithMargins(View view, Rect rect) {
        float f10;
        super.getDecoratedBoundsWithMargins(view, rect);
        float centerY = rect.centerY();
        if (q()) {
            centerY = rect.centerX();
        }
        float m10 = m(centerY, p(centerY, this.f11632g.f27602c, true));
        float f11 = 0.0f;
        if (q()) {
            f10 = (rect.width() - m10) / 2.0f;
        } else {
            f10 = 0.0f;
        }
        if (!q()) {
            f11 = (rect.height() - m10) / 2.0f;
        }
        rect.set((int) (rect.left + f10), (int) (rect.top + f11), (int) (rect.right - f10), (int) (rect.bottom - f11));
    }

    public final float h(View view, float f10, c cVar) {
        h hVar = (h) cVar.f23999c;
        float f11 = hVar.f27594b;
        h hVar2 = (h) cVar.f24000d;
        float a = a.a(f11, hVar2.f27594b, hVar.a, hVar2.a, f10);
        if (((h) cVar.f24000d) == this.f11632g.b() || ((h) cVar.f23999c) == this.f11632g.d()) {
            float f12 = this.f11635j.f((w0) view.getLayoutParams()) / this.f11632g.a;
            h hVar3 = (h) cVar.f24000d;
            return a + (((1.0f - hVar3.f27595c) + f12) * (f10 - hVar3.a));
        }
        return a;
    }

    public final float i(int i10) {
        return e(this.f11635j.j() - this.a, this.f11632g.a * i10);
    }

    @Override // androidx.recyclerview.widget.v0
    public final boolean isAutoMeasureEnabled() {
        return true;
    }

    public final void j(d1 d1Var, k1 k1Var) {
        int centerY;
        int centerY2;
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            Rect rect = new Rect();
            super.getDecoratedBoundsWithMargins(childAt, rect);
            if (q()) {
                centerY2 = rect.centerX();
            } else {
                centerY2 = rect.centerY();
            }
            float f10 = centerY2;
            if (!t(f10, p(f10, this.f11632g.f27602c, true))) {
                break;
            } else {
                removeAndRecycleView(childAt, d1Var);
            }
        }
        while (getChildCount() - 1 >= 0) {
            View childAt2 = getChildAt(getChildCount() - 1);
            Rect rect2 = new Rect();
            super.getDecoratedBoundsWithMargins(childAt2, rect2);
            if (q()) {
                centerY = rect2.centerX();
            } else {
                centerY = rect2.centerY();
            }
            float f11 = centerY;
            if (!s(f11, p(f11, this.f11632g.f27602c, true))) {
                break;
            } else {
                removeAndRecycleView(childAt2, d1Var);
            }
        }
        if (getChildCount() == 0) {
            g(d1Var, this.f11633h - 1);
            f(this.f11633h, d1Var, k1Var);
        } else {
            int position = getPosition(getChildAt(0));
            int position2 = getPosition(getChildAt(getChildCount() - 1));
            g(d1Var, position - 1);
            f(position2 + 1, d1Var, k1Var);
        }
    }

    public final int k() {
        if (q()) {
            return getWidth();
        }
        return getHeight();
    }

    public final i l(int i10) {
        i iVar;
        HashMap hashMap = this.f11634i;
        if (hashMap != null && (iVar = (i) hashMap.get(Integer.valueOf(com.bumptech.glide.e.o(i10, 0, Math.max(0, getItemCount() - 1))))) != null) {
            return iVar;
        }
        return this.f11631f.a;
    }

    @Override // androidx.recyclerview.widget.v0
    public final void measureChildWithMargins(View view, int i10, int i11) {
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    public final int n(int i10, i iVar) {
        if (r()) {
            float k10 = k() - iVar.c().a;
            float f10 = iVar.a;
            return (int) ((k10 - (i10 * f10)) - (f10 / 2.0f));
        }
        return (int) ((iVar.a / 2.0f) + ((i10 * iVar.a) - iVar.a().a));
    }

    public final int o(int i10, i iVar) {
        int i11;
        int i12 = Integer.MAX_VALUE;
        for (h hVar : iVar.f27602c.subList(iVar.f27603d, iVar.f27604e + 1)) {
            float f10 = iVar.a;
            float f11 = (f10 / 2.0f) + (i10 * f10);
            if (r()) {
                i11 = (int) ((k() - hVar.a) - f11);
            } else {
                i11 = (int) (f11 - hVar.a);
            }
            int i13 = i11 - this.a;
            if (Math.abs(i12) > Math.abs(i13)) {
                i12 = i13;
            }
        }
        return i12;
    }

    @Override // androidx.recyclerview.widget.v0
    public final void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        f fVar = this.f11630e;
        Context context = recyclerView.getContext();
        float f10 = fVar.a;
        if (f10 <= 0.0f) {
            f10 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        fVar.a = f10;
        float f11 = fVar.f27585b;
        if (f11 <= 0.0f) {
            f11 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        fVar.f27585b = f11;
        w();
        recyclerView.addOnLayoutChangeListener(this.f11636k);
    }

    @Override // androidx.recyclerview.widget.v0
    public final void onDetachedFromWindow(RecyclerView recyclerView, d1 d1Var) {
        onDetachedFromWindow(recyclerView);
        recyclerView.removeOnLayoutChangeListener(this.f11636k);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0039, code lost:
    
        if (r9 == 1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0042, code lost:
    
        if (r() != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0045, code lost:
    
        if (r9 == 1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x004e, code lost:
    
        if (r() != false) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    @Override // androidx.recyclerview.widget.v0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View onFocusSearchFailed(android.view.View r6, int r7, androidx.recyclerview.widget.d1 r8, androidx.recyclerview.widget.k1 r9) {
        /*
            r5 = this;
            int r9 = r5.getChildCount()
            r0 = 0
            if (r9 != 0) goto L8
            return r0
        L8:
            x9.e r9 = r5.f11635j
            int r9 = r9.f26867c
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1
            if (r7 == r3) goto L55
            r4 = 2
            if (r7 == r4) goto L53
            r4 = 17
            if (r7 == r4) goto L48
            r4 = 33
            if (r7 == r4) goto L45
            r4 = 66
            if (r7 == r4) goto L3c
            r4 = 130(0x82, float:1.82E-43)
            if (r7 == r4) goto L39
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r4 = "Unknown focus request:"
            r9.<init>(r4)
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            java.lang.String r9 = "CarouselLayoutManager"
            android.util.Log.d(r9, r7)
            goto L51
        L39:
            if (r9 != r3) goto L51
            goto L53
        L3c:
            if (r9 != 0) goto L51
            boolean r7 = r5.r()
            if (r7 == 0) goto L53
            goto L55
        L45:
            if (r9 != r3) goto L51
            goto L55
        L48:
            if (r9 != 0) goto L51
            boolean r7 = r5.r()
            if (r7 == 0) goto L55
            goto L53
        L51:
            r7 = r2
            goto L56
        L53:
            r7 = r3
            goto L56
        L55:
            r7 = r1
        L56:
            if (r7 != r2) goto L59
            return r0
        L59:
            r9 = 0
            if (r7 != r1) goto L93
            int r6 = r5.getPosition(r6)
            if (r6 != 0) goto L63
            return r0
        L63:
            android.view.View r6 = r5.getChildAt(r9)
            int r6 = r5.getPosition(r6)
            int r6 = r6 - r3
            if (r6 < 0) goto L82
            int r7 = r5.getItemCount()
            if (r6 < r7) goto L75
            goto L82
        L75:
            float r7 = r5.i(r6)
            x9.c r6 = r5.u(r8, r7, r6)
            android.view.View r7 = r6.a
            r5.d(r7, r9, r6)
        L82:
            boolean r6 = r5.r()
            if (r6 == 0) goto L8e
            int r6 = r5.getChildCount()
            int r9 = r6 + (-1)
        L8e:
            android.view.View r6 = r5.getChildAt(r9)
            goto Ld4
        L93:
            int r6 = r5.getPosition(r6)
            int r7 = r5.getItemCount()
            int r7 = r7 - r3
            if (r6 != r7) goto L9f
            return r0
        L9f:
            int r6 = r5.getChildCount()
            int r6 = r6 - r3
            android.view.View r6 = r5.getChildAt(r6)
            int r6 = r5.getPosition(r6)
            int r6 = r6 + r3
            if (r6 < 0) goto Lc3
            int r7 = r5.getItemCount()
            if (r6 < r7) goto Lb6
            goto Lc3
        Lb6:
            float r7 = r5.i(r6)
            x9.c r6 = r5.u(r8, r7, r6)
            android.view.View r7 = r6.a
            r5.d(r7, r1, r6)
        Lc3:
            boolean r6 = r5.r()
            if (r6 == 0) goto Lca
            goto Ld0
        Lca:
            int r6 = r5.getChildCount()
            int r9 = r6 + (-1)
        Ld0:
            android.view.View r6 = r5.getChildAt(r9)
        Ld4:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.CarouselLayoutManager.onFocusSearchFailed(android.view.View, int, androidx.recyclerview.widget.d1, androidx.recyclerview.widget.k1):android.view.View");
    }

    @Override // androidx.recyclerview.widget.v0
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(getPosition(getChildAt(0)));
            accessibilityEvent.setToIndex(getPosition(getChildAt(getChildCount() - 1)));
        }
    }

    @Override // androidx.recyclerview.widget.v0
    public final void onItemsAdded(RecyclerView recyclerView, int i10, int i11) {
        super.onItemsAdded(recyclerView, i10, i11);
        y();
    }

    @Override // androidx.recyclerview.widget.v0
    public final void onItemsRemoved(RecyclerView recyclerView, int i10, int i11) {
        super.onItemsRemoved(recyclerView, i10, i11);
        y();
    }

    @Override // androidx.recyclerview.widget.v0
    public final void onLayoutChildren(d1 d1Var, k1 k1Var) {
        boolean z10;
        i c10;
        h a;
        float f10;
        i a10;
        h c11;
        float f11;
        int i10;
        int max;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        if (k1Var.b() > 0 && k() > 0.0f) {
            boolean r6 = r();
            if (this.f11631f == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                v(d1Var);
            }
            j jVar = this.f11631f;
            boolean r10 = r();
            if (r10) {
                c10 = jVar.a();
            } else {
                c10 = jVar.c();
            }
            if (r10) {
                a = c10.c();
            } else {
                a = c10.a();
            }
            float f12 = a.a;
            float f13 = c10.a / 2.0f;
            if (r()) {
                f10 = f12 + f13;
            } else {
                f10 = f12 - f13;
            }
            int j3 = (int) (this.f11635j.j() - f10);
            j jVar2 = this.f11631f;
            boolean r11 = r();
            if (r11) {
                a10 = jVar2.c();
            } else {
                a10 = jVar2.a();
            }
            if (r11) {
                c11 = a10.a();
            } else {
                c11 = a10.c();
            }
            float b3 = (k1Var.b() - 1) * a10.a;
            if (r11) {
                f11 = -1.0f;
            } else {
                f11 = 1.0f;
            }
            float j10 = (b3 * f11) - (c11.a - this.f11635j.j());
            if (r11) {
                i10 = -1;
            } else {
                i10 = 1;
            }
            int i17 = (int) (((i10 * c11.f27596d) / 2.0f) + j10);
            if (r11) {
                max = Math.min(0, i17);
            } else {
                max = Math.max(0, i17);
            }
            if (r6) {
                i11 = max;
            } else {
                i11 = j3;
            }
            this.f11627b = i11;
            if (r6) {
                max = j3;
            }
            this.f11628c = max;
            if (z10) {
                this.a = j3;
                j jVar3 = this.f11631f;
                int itemCount = getItemCount();
                int i18 = this.f11627b;
                int i19 = this.f11628c;
                boolean r12 = r();
                float f14 = jVar3.a.a;
                HashMap hashMap = new HashMap();
                int i20 = 0;
                for (int i21 = 0; i21 < itemCount; i21++) {
                    if (r12) {
                        i15 = (itemCount - i21) - 1;
                    } else {
                        i15 = i21;
                    }
                    float f15 = i15 * f14;
                    if (r12) {
                        i16 = -1;
                    } else {
                        i16 = 1;
                    }
                    float f16 = f15 * i16;
                    float f17 = i19 - jVar3.f27610g;
                    List list = jVar3.f27606c;
                    if (f16 > f17 || i21 >= itemCount - list.size()) {
                        hashMap.put(Integer.valueOf(i15), (i) list.get(com.bumptech.glide.e.o(i20, 0, list.size() - 1)));
                        i20++;
                    }
                }
                int i22 = 0;
                for (int i23 = itemCount - 1; i23 >= 0; i23--) {
                    if (r12) {
                        i13 = (itemCount - i23) - 1;
                    } else {
                        i13 = i23;
                    }
                    float f18 = i13 * f14;
                    if (r12) {
                        i14 = -1;
                    } else {
                        i14 = 1;
                    }
                    float f19 = f18 * i14;
                    float f20 = i18 + jVar3.f27609f;
                    List list2 = jVar3.f27605b;
                    if (f19 < f20 || i23 < list2.size()) {
                        hashMap.put(Integer.valueOf(i13), (i) list2.get(com.bumptech.glide.e.o(i22, 0, list2.size() - 1)));
                        i22++;
                    }
                }
                this.f11634i = hashMap;
                int i24 = this.f11638m;
                if (i24 != -1) {
                    this.a = n(i24, l(i24));
                }
            }
            int i25 = this.a;
            int i26 = this.f11627b;
            int i27 = this.f11628c;
            int i28 = i25 + 0;
            if (i28 < i26) {
                i12 = i26 - i25;
            } else if (i28 > i27) {
                i12 = i27 - i25;
            } else {
                i12 = 0;
            }
            this.a = i12 + i25;
            this.f11633h = com.bumptech.glide.e.o(this.f11633h, 0, k1Var.b());
            x(this.f11631f);
            detachAndScrapAttachedViews(d1Var);
            j(d1Var, k1Var);
            this.f11637l = getItemCount();
            return;
        }
        removeAndRecycleAllViews(d1Var);
        this.f11633h = 0;
    }

    @Override // androidx.recyclerview.widget.v0
    public final void onLayoutCompleted(k1 k1Var) {
        if (getChildCount() == 0) {
            this.f11633h = 0;
        } else {
            this.f11633h = getPosition(getChildAt(0));
        }
    }

    public final boolean q() {
        return this.f11635j.f26867c == 0;
    }

    public final boolean r() {
        return q() && getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.v0
    public final boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
        int o10;
        if (this.f11631f == null || (o10 = o(getPosition(view), l(getPosition(view)))) == 0) {
            return false;
        }
        int i10 = this.a;
        int i11 = this.f11627b;
        int i12 = this.f11628c;
        int i13 = i10 + o10;
        if (i13 < i11) {
            o10 = i11 - i10;
        } else if (i13 > i12) {
            o10 = i12 - i10;
        }
        int o11 = o(getPosition(view), this.f11631f.b(i10 + o10, i11, i12));
        if (q()) {
            recyclerView.scrollBy(o11, 0);
            return true;
        }
        recyclerView.scrollBy(0, o11);
        return true;
    }

    public final boolean s(float f10, c cVar) {
        float f11;
        float m10 = m(f10, cVar) / 2.0f;
        if (r()) {
            f11 = f10 + m10;
        } else {
            f11 = f10 - m10;
        }
        if (!r() ? f11 > k() : f11 < 0.0f) {
            return true;
        }
        return false;
    }

    public final int scrollBy(int i10, d1 d1Var, k1 k1Var) {
        i c10;
        float f10;
        if (getChildCount() == 0 || i10 == 0) {
            return 0;
        }
        if (this.f11631f == null) {
            v(d1Var);
        }
        int itemCount = getItemCount();
        j jVar = this.f11631f;
        if (r()) {
            c10 = jVar.a();
        } else {
            c10 = jVar.c();
        }
        if (itemCount <= c10.f27601b) {
            return 0;
        }
        int i11 = this.a;
        int i12 = this.f11627b;
        int i13 = this.f11628c;
        int i14 = i11 + i10;
        if (i14 < i12) {
            i10 = i12 - i11;
        } else if (i14 > i13) {
            i10 = i13 - i11;
        }
        this.a = i11 + i10;
        x(this.f11631f);
        float f11 = this.f11632g.a / 2.0f;
        float i15 = i(getPosition(getChildAt(0)));
        Rect rect = new Rect();
        if (r()) {
            f10 = this.f11632g.c().f27594b;
        } else {
            f10 = this.f11632g.a().f27594b;
        }
        float f12 = Float.MAX_VALUE;
        for (int i16 = 0; i16 < getChildCount(); i16++) {
            View childAt = getChildAt(i16);
            float e2 = e(i15, f11);
            float h10 = h(childAt, e2, p(e2, this.f11632g.f27602c, false));
            super.getDecoratedBoundsWithMargins(childAt, rect);
            this.f11635j.m(f11, h10, rect, childAt);
            float abs = Math.abs(f10 - h10);
            if (abs < f12) {
                this.f11638m = getPosition(childAt);
                f12 = abs;
            }
            i15 = e(i15, this.f11632g.a);
        }
        j(d1Var, k1Var);
        return i10;
    }

    @Override // androidx.recyclerview.widget.v0
    public final int scrollHorizontallyBy(int i10, d1 d1Var, k1 k1Var) {
        if (q()) {
            return scrollBy(i10, d1Var, k1Var);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.v0
    public final void scrollToPosition(int i10) {
        this.f11638m = i10;
        if (this.f11631f == null) {
            return;
        }
        this.a = n(i10, l(i10));
        this.f11633h = com.bumptech.glide.e.o(i10, 0, Math.max(0, getItemCount() - 1));
        x(this.f11631f);
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.v0
    public final int scrollVerticallyBy(int i10, d1 d1Var, k1 k1Var) {
        if (canScrollVertically()) {
            return scrollBy(i10, d1Var, k1Var);
        }
        return 0;
    }

    public final void setOrientation(int i10) {
        e eVar;
        int i11 = 1;
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException(eb.j.i("invalid orientation:", i10));
        }
        assertNotInLayoutOrScroll(null);
        e eVar2 = this.f11635j;
        if (eVar2 == null || i10 != eVar2.f26867c) {
            int i12 = 0;
            if (i10 != 0) {
                if (i10 == 1) {
                    eVar = new e(i11, this, i12);
                } else {
                    throw new IllegalArgumentException("invalid orientation");
                }
            } else {
                eVar = new e(i12, this, i11);
            }
            this.f11635j = eVar;
            w();
        }
    }

    @Override // androidx.recyclerview.widget.v0
    public final void smoothScrollToPosition(RecyclerView recyclerView, k1 k1Var, int i10) {
        e0 e0Var = new e0(1, recyclerView.getContext(), this);
        e0Var.a = i10;
        startSmoothScroll(e0Var);
    }

    public final boolean t(float f10, c cVar) {
        float e2 = e(f10, m(f10, cVar) / 2.0f);
        if (!r() ? e2 < 0.0f : e2 > k()) {
            return true;
        }
        return false;
    }

    public final x9.c u(d1 d1Var, float f10, int i10) {
        View d10 = d1Var.d(i10);
        measureChildWithMargins(d10, 0, 0);
        float e2 = e(f10, this.f11632g.a / 2.0f);
        c p10 = p(e2, this.f11632g.f27602c, false);
        return new x9.c(d10, e2, h(d10, e2, p10), p10);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v32 x9.j, still in use, count: 4, list:
          (r5v32 x9.j) from 0x058f: MOVE (r29v0 x9.j) = (r5v32 x9.j) (LINE:1424)
          (r5v32 x9.j) from 0x04f7: PHI (r5v46 x9.j) = (r5v32 x9.j), (r5v47 x9.j) binds: [B:210:0x04ef, B:229:0x0579] A[DONT_GENERATE, DONT_INLINE]
          (r5v32 x9.j) from 0x0588: PHI (r5v50 x9.j) = (r5v46 x9.j), (r5v32 x9.j) binds: [B:235:0x0588, B:208:0x04cb] A[DONT_GENERATE, DONT_INLINE]
          (r5v32 x9.j) from 0x04a4: MOVE (r29v7 x9.j) = (r5v32 x9.j) (LINE:1189)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:56)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public final void v(androidx.recyclerview.widget.d1 r32) {
        /*
            Method dump skipped, instructions count: 1777
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.CarouselLayoutManager.v(androidx.recyclerview.widget.d1):void");
    }

    public final void w() {
        this.f11631f = null;
        requestLayout();
    }

    public final void x(j jVar) {
        i c10;
        int i10 = this.f11628c;
        int i11 = this.f11627b;
        if (i10 <= i11) {
            if (r()) {
                c10 = jVar.a();
            } else {
                c10 = jVar.c();
            }
            this.f11632g = c10;
        } else {
            this.f11632g = jVar.b(this.a, i11, i10);
        }
        List list = this.f11632g.f27602c;
        d dVar = this.f11629d;
        dVar.getClass();
        dVar.f27582b = Collections.unmodifiableList(list);
    }

    public final void y() {
        boolean z10;
        int itemCount = getItemCount();
        int i10 = this.f11637l;
        if (itemCount != i10 && this.f11631f != null) {
            k kVar = (k) this.f11630e;
            if ((i10 < kVar.f27613c && getItemCount() >= kVar.f27613c) || (i10 >= kVar.f27613c && getItemCount() < kVar.f27613c)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                w();
            }
            this.f11637l = itemCount;
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [x9.b] */
    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f11629d = new d();
        this.f11633h = 0;
        final int i12 = 1;
        this.f11636k = new View.OnLayoutChangeListener(this) { // from class: x9.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CarouselLayoutManager f27579c;

            {
                this.f27579c = this;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i112, int i122, int i13, int i14, int i15, int i16, int i17, int i18) {
                int i19 = i12;
                int i20 = 3;
                CarouselLayoutManager carouselLayoutManager = this.f27579c;
                switch (i19) {
                    case 0:
                        carouselLayoutManager.getClass();
                        if (i112 != i15 || i122 != i16 || i13 != i17 || i14 != i18) {
                            view.post(new k8.f(carouselLayoutManager, i20));
                            return;
                        }
                        return;
                    default:
                        carouselLayoutManager.getClass();
                        if (i112 != i15 || i122 != i16 || i13 != i17 || i14 != i18) {
                            view.post(new k8.f(carouselLayoutManager, i20));
                            return;
                        }
                        return;
                }
            }
        };
        this.f11638m = -1;
        this.f11639n = 0;
        this.f11630e = new k();
        w();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r9.a.f24020b);
            this.f11639n = obtainStyledAttributes.getInt(0, 0);
            w();
            setOrientation(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
        }
    }
}
