package M3;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.tools.arruler.photomeasure.camera.ruler.R;
import x3.AbstractC2920a;

/* loaded from: classes2.dex */
public final class h extends a {

    /* renamed from: g, reason: collision with root package name */
    public final float f1995g;

    /* renamed from: h, reason: collision with root package name */
    public final float f1996h;

    public h(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f1995g = resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
        this.f1996h = resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
    }

    public final AnimatorSet a() {
        AnimatorSet animatorSet = new AnimatorSet();
        View view = this.b;
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i9), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setInterpolator(new p0.a(1));
        return animatorSet;
    }

    public final void b(float f9) {
        float f10;
        float interpolation = this.f1987a.getInterpolation(f9);
        View view = this.b;
        float width = view.getWidth();
        float height = view.getHeight();
        if (width > 0.0f && height > 0.0f) {
            float f11 = this.f1995g / width;
            float f12 = this.f1996h / height;
            float a6 = 1.0f - AbstractC2920a.a(0.0f, f11, interpolation);
            float a9 = 1.0f - AbstractC2920a.a(0.0f, f12, interpolation);
            view.setScaleX(a6);
            view.setPivotY(height);
            view.setScaleY(a9);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
                    View childAt = viewGroup.getChildAt(i9);
                    childAt.setPivotY(-childAt.getTop());
                    if (a9 != 0.0f) {
                        f10 = a6 / a9;
                    } else {
                        f10 = 1.0f;
                    }
                    childAt.setScaleY(f10);
                }
            }
        }
    }
}
