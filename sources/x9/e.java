package x9;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.w0;
import com.google.android.material.carousel.CarouselLayoutManager;

/* loaded from: classes3.dex */
public final class e extends w7.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f27583d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f27584f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i10, CarouselLayoutManager carouselLayoutManager, int i11) {
        super(i10);
        this.f27583d = i11;
        this.f27584f = carouselLayoutManager;
    }

    public final int e(View view) {
        int decoratedMeasuredHeight;
        int i10;
        int i11 = this.f27583d;
        CarouselLayoutManager carouselLayoutManager = this.f27584f;
        switch (i11) {
            case 0:
                w0 w0Var = (w0) view.getLayoutParams();
                decoratedMeasuredHeight = carouselLayoutManager.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) w0Var).leftMargin;
                i10 = ((ViewGroup.MarginLayoutParams) w0Var).rightMargin;
                break;
            default:
                w0 w0Var2 = (w0) view.getLayoutParams();
                decoratedMeasuredHeight = carouselLayoutManager.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) w0Var2).topMargin;
                i10 = ((ViewGroup.MarginLayoutParams) w0Var2).bottomMargin;
                break;
        }
        return decoratedMeasuredHeight + i10;
    }

    public final float f(w0 w0Var) {
        int i10;
        int i11;
        switch (this.f27583d) {
            case 0:
                i10 = ((ViewGroup.MarginLayoutParams) w0Var).topMargin;
                i11 = ((ViewGroup.MarginLayoutParams) w0Var).bottomMargin;
                break;
            default:
                i10 = ((ViewGroup.MarginLayoutParams) w0Var).rightMargin;
                i11 = ((ViewGroup.MarginLayoutParams) w0Var).leftMargin;
                break;
        }
        return i10 + i11;
    }

    public final int g() {
        int i10 = this.f27583d;
        CarouselLayoutManager carouselLayoutManager = this.f27584f;
        switch (i10) {
            case 0:
                return carouselLayoutManager.getHeight();
            default:
                return carouselLayoutManager.getHeight() - carouselLayoutManager.getPaddingBottom();
        }
    }

    public final int h() {
        switch (this.f27583d) {
            case 0:
                return this.f27584f.getPaddingLeft();
            default:
                return 0;
        }
    }

    public final int i() {
        int i10 = this.f27583d;
        CarouselLayoutManager carouselLayoutManager = this.f27584f;
        switch (i10) {
            case 0:
                return carouselLayoutManager.getWidth() - carouselLayoutManager.getPaddingRight();
            default:
                return carouselLayoutManager.getWidth();
        }
    }

    public final int j() {
        switch (this.f27583d) {
            case 0:
                return k();
            default:
                if (this.f27584f.r()) {
                    return i();
                }
                return h();
        }
    }

    public final int k() {
        switch (this.f27583d) {
            case 0:
                return 0;
            default:
                return this.f27584f.getPaddingTop();
        }
    }

    public final void l(View view, int i10, int i11) {
        switch (this.f27583d) {
            case 0:
                int h10 = h();
                this.f27584f.layoutDecoratedWithMargins(view, h10, i10, e(view) + h10, i11);
                return;
            default:
                int k10 = k();
                this.f27584f.layoutDecoratedWithMargins(view, i10, k10, i11, e(view) + k10);
                return;
        }
    }

    public final void m(float f10, float f11, Rect rect, View view) {
        switch (this.f27583d) {
            case 0:
                view.offsetTopAndBottom((int) (f11 - (rect.top + f10)));
                return;
            default:
                view.offsetLeftAndRight((int) (f11 - (rect.left + f10)));
                return;
        }
    }
}
