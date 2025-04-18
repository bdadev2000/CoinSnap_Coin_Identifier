package fa;

import android.content.res.Resources;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.plantcare.ai.identifier.plantid.R;

/* loaded from: classes3.dex */
public final class i extends a {

    /* renamed from: g, reason: collision with root package name */
    public final float f17766g;

    /* renamed from: h, reason: collision with root package name */
    public final float f17767h;

    /* renamed from: i, reason: collision with root package name */
    public final float f17768i;

    public i(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f17766g = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
        this.f17767h = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
        this.f17768i = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
    }

    public final void a(float f10, int i10, boolean z10) {
        boolean z11;
        float f11;
        float f12;
        float f13;
        float interpolation = this.a.getInterpolation(f10);
        View view = this.f17754b;
        boolean z12 = true;
        if ((Gravity.getAbsoluteGravity(i10, view.getLayoutDirection()) & 3) == 3) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            z12 = false;
        }
        int width = view.getWidth();
        int height = view.getHeight();
        float f14 = width;
        if (f14 > 0.0f) {
            float f15 = height;
            if (f15 > 0.0f) {
                float f16 = this.f17766g / f14;
                float f17 = this.f17767h / f14;
                float f18 = this.f17768i / f15;
                if (z11) {
                    f14 = 0.0f;
                }
                view.setPivotX(f14);
                if (!z12) {
                    f17 = -f16;
                }
                LinearInterpolator linearInterpolator = s9.a.a;
                float b3 = vd.e.b(f17, 0.0f, interpolation, 0.0f);
                float f19 = b3 + 1.0f;
                view.setScaleX(f19);
                float f20 = 1.0f - (((f18 - 0.0f) * interpolation) + 0.0f);
                view.setScaleY(f20);
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                        View childAt = viewGroup.getChildAt(i11);
                        if (z11) {
                            f11 = childAt.getWidth() + (width - childAt.getRight());
                        } else {
                            f11 = -childAt.getLeft();
                        }
                        childAt.setPivotX(f11);
                        childAt.setPivotY(-childAt.getTop());
                        if (z12) {
                            f12 = 1.0f - b3;
                        } else {
                            f12 = 1.0f;
                        }
                        if (f20 != 0.0f) {
                            f13 = (f19 / f20) * f12;
                        } else {
                            f13 = 1.0f;
                        }
                        childAt.setScaleX(f12);
                        childAt.setScaleY(f13);
                    }
                }
            }
        }
    }
}
