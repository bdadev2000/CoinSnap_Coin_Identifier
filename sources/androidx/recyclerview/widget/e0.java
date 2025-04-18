package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.google.android.material.carousel.CarouselLayoutManager;

/* loaded from: classes.dex */
public final class e0 extends b0 {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f1901q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f1902r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(int i10, Context context, Object obj) {
        super(context);
        this.f1901q = i10;
        this.f1902r = obj;
    }

    @Override // androidx.recyclerview.widget.j1
    public final PointF a(int i10) {
        switch (this.f1901q) {
            case 1:
                return ((CarouselLayoutManager) this.f1902r).computeScrollVectorForPosition(i10);
            default:
                return super.a(i10);
        }
    }

    @Override // androidx.recyclerview.widget.b0, androidx.recyclerview.widget.j1
    public final void c(View view, k1 k1Var, h1 h1Var) {
        switch (this.f1901q) {
            case 0:
                f0 f0Var = (f0) this.f1902r;
                int[] b3 = f0Var.b(f0Var.a.getLayoutManager(), view);
                int i10 = b3[0];
                int i11 = b3[1];
                int ceil = (int) Math.ceil(i(Math.max(Math.abs(i10), Math.abs(i11))) / 0.3356d);
                if (ceil > 0) {
                    DecelerateInterpolator decelerateInterpolator = this.f1868j;
                    h1Var.a = i10;
                    h1Var.f1923b = i11;
                    h1Var.f1924c = ceil;
                    h1Var.f1926e = decelerateInterpolator;
                    h1Var.f1927f = true;
                    return;
                }
                return;
            default:
                super.c(view, k1Var, h1Var);
                return;
        }
    }

    @Override // androidx.recyclerview.widget.b0
    public final int f(View view, int i10) {
        switch (this.f1901q) {
            case 1:
                CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) this.f1902r;
                if (carouselLayoutManager.f11631f != null && carouselLayoutManager.q()) {
                    int position = carouselLayoutManager.getPosition(view);
                    return (int) (carouselLayoutManager.a - carouselLayoutManager.n(position, carouselLayoutManager.l(position)));
                }
                return 0;
            default:
                return super.f(view, i10);
        }
    }

    @Override // androidx.recyclerview.widget.b0
    public final int g(View view, int i10) {
        switch (this.f1901q) {
            case 1:
                CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) this.f1902r;
                if (carouselLayoutManager.f11631f != null && !carouselLayoutManager.q()) {
                    int position = carouselLayoutManager.getPosition(view);
                    return (int) (carouselLayoutManager.a - carouselLayoutManager.n(position, carouselLayoutManager.l(position)));
                }
                return 0;
            default:
                return super.g(view, i10);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // androidx.recyclerview.widget.b0
    public final float h(DisplayMetrics displayMetrics) {
        int i10;
        switch (this.f1901q) {
            case 0:
                i10 = displayMetrics.densityDpi;
                return 100.0f / i10;
            case 1:
            default:
                return 25.0f / displayMetrics.densityDpi;
            case 2:
                i10 = displayMetrics.densityDpi;
                return 100.0f / i10;
        }
    }

    @Override // androidx.recyclerview.widget.b0
    public final int i(int i10) {
        switch (this.f1901q) {
            case 0:
                return Math.min(100, super.i(i10));
            default:
                return super.i(i10);
        }
    }
}
