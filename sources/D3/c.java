package D3;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.B;
import androidx.recyclerview.widget.E;
import androidx.recyclerview.widget.i0;
import com.google.android.material.carousel.CarouselLayoutManager;

/* loaded from: classes2.dex */
public final class c extends B {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f739q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f740r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i9, Context context, Object obj) {
        super(context);
        this.f739q = i9;
        this.f740r = obj;
    }

    @Override // androidx.recyclerview.widget.k0
    public PointF a(int i9) {
        switch (this.f739q) {
            case 0:
                return ((CarouselLayoutManager) this.f740r).computeScrollVectorForPosition(i9);
            default:
                return super.a(i9);
        }
    }

    @Override // androidx.recyclerview.widget.B, androidx.recyclerview.widget.k0
    public void c(View view, i0 i0Var) {
        switch (this.f739q) {
            case 1:
                E e4 = (E) this.f740r;
                int[] b = e4.b(e4.f4929a.getLayoutManager(), view);
                int i9 = b[0];
                int i10 = b[1];
                int ceil = (int) Math.ceil(i(Math.max(Math.abs(i9), Math.abs(i10))) / 0.3356d);
                if (ceil > 0) {
                    DecelerateInterpolator decelerateInterpolator = this.f4920j;
                    i0Var.f4997a = i9;
                    i0Var.b = i10;
                    i0Var.f4998c = ceil;
                    i0Var.f5000e = decelerateInterpolator;
                    i0Var.f5001f = true;
                    return;
                }
                return;
            default:
                super.c(view, i0Var);
                return;
        }
    }

    @Override // androidx.recyclerview.widget.B
    public int f(View view, int i9) {
        switch (this.f739q) {
            case 0:
                ((CarouselLayoutManager) this.f740r).getClass();
                return 0;
            default:
                return super.f(view, i9);
        }
    }

    @Override // androidx.recyclerview.widget.B
    public int g(View view, int i9) {
        switch (this.f739q) {
            case 0:
                ((CarouselLayoutManager) this.f740r).getClass();
                return 0;
            default:
                return super.g(view, i9);
        }
    }

    @Override // androidx.recyclerview.widget.B
    public float h(DisplayMetrics displayMetrics) {
        switch (this.f739q) {
            case 1:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.h(displayMetrics);
        }
    }

    @Override // androidx.recyclerview.widget.B
    public int i(int i9) {
        switch (this.f739q) {
            case 1:
                return Math.min(100, super.i(i9));
            default:
                return super.i(i9);
        }
    }
}
