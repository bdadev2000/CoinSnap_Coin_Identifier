package M3;

import android.content.res.Resources;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import com.tools.arruler.photomeasure.camera.ruler.R;
import x3.AbstractC2920a;

/* loaded from: classes2.dex */
public final class j extends a {

    /* renamed from: g, reason: collision with root package name */
    public final float f1999g;

    /* renamed from: h, reason: collision with root package name */
    public final float f2000h;

    /* renamed from: i, reason: collision with root package name */
    public final float f2001i;

    public j(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f1999g = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
        this.f2000h = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
        this.f2001i = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
    }

    public final void a(float f9, boolean z8, int i9) {
        boolean z9;
        float f10;
        float f11;
        float f12;
        float interpolation = this.f1987a.getInterpolation(f9);
        View view = this.b;
        boolean z10 = true;
        if ((Gravity.getAbsoluteGravity(i9, ViewCompat.getLayoutDirection(view)) & 3) == 3) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z8 != z9) {
            z10 = false;
        }
        int width = view.getWidth();
        int height = view.getHeight();
        float f13 = width;
        if (f13 > 0.0f) {
            float f14 = height;
            if (f14 > 0.0f) {
                float f15 = this.f1999g / f13;
                float f16 = this.f2000h / f13;
                float f17 = this.f2001i / f14;
                if (z9) {
                    f13 = 0.0f;
                }
                view.setPivotX(f13);
                if (!z10) {
                    f16 = -f15;
                }
                float a6 = AbstractC2920a.a(0.0f, f16, interpolation);
                float f18 = a6 + 1.0f;
                view.setScaleX(f18);
                float a9 = 1.0f - AbstractC2920a.a(0.0f, f17, interpolation);
                view.setScaleY(a9);
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                        View childAt = viewGroup.getChildAt(i10);
                        if (z9) {
                            f10 = childAt.getWidth() + (width - childAt.getRight());
                        } else {
                            f10 = -childAt.getLeft();
                        }
                        childAt.setPivotX(f10);
                        childAt.setPivotY(-childAt.getTop());
                        if (z10) {
                            f11 = 1.0f - a6;
                        } else {
                            f11 = 1.0f;
                        }
                        if (a9 != 0.0f) {
                            f12 = (f18 / a9) * f11;
                        } else {
                            f12 = 1.0f;
                        }
                        childAt.setScaleX(f11);
                        childAt.setScaleY(f12);
                    }
                }
            }
        }
    }
}
