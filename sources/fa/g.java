package fa;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.plantcare.ai.identifier.plantid.R;

/* loaded from: classes3.dex */
public final class g extends a {

    /* renamed from: g, reason: collision with root package name */
    public final float f17762g;

    /* renamed from: h, reason: collision with root package name */
    public final float f17763h;

    public g(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f17762g = resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
        this.f17763h = resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
    }

    public final AnimatorSet a() {
        AnimatorSet animatorSet = new AnimatorSet();
        View view = this.f17754b;
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i10), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setInterpolator(new i1.b());
        return animatorSet;
    }

    public final void b(float f10) {
        float f11;
        float interpolation = this.a.getInterpolation(f10);
        View view = this.f17754b;
        float width = view.getWidth();
        float height = view.getHeight();
        if (width > 0.0f && height > 0.0f) {
            float f12 = this.f17762g / width;
            float f13 = this.f17763h / height;
            LinearInterpolator linearInterpolator = s9.a.a;
            float b3 = 1.0f - vd.e.b(f12, 0.0f, interpolation, 0.0f);
            float b10 = 1.0f - vd.e.b(f13, 0.0f, interpolation, 0.0f);
            view.setScaleX(b3);
            view.setPivotY(height);
            view.setScaleY(b10);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    childAt.setPivotY(-childAt.getTop());
                    if (b10 != 0.0f) {
                        f11 = b3 / b10;
                    } else {
                        f11 = 1.0f;
                    }
                    childAt.setScaleY(f11);
                }
            }
        }
    }
}
