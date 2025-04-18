package androidx.transition;

import android.graphics.Rect;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public class CircularPropagation extends VisibilityPropagation {
    @Override // androidx.transition.TransitionPropagation
    public final long c(ViewGroup viewGroup, Transition transition, TransitionValues transitionValues, TransitionValues transitionValues2) {
        int i2;
        int round;
        int i3;
        Integer num;
        if (transitionValues == null && transitionValues2 == null) {
            return 0L;
        }
        if (transitionValues2 == null || !(transitionValues == null || (num = (Integer) transitionValues.f21617a.get("android:visibilityPropagation:visibility")) == null || num.intValue() != 0)) {
            i2 = -1;
        } else {
            transitionValues = transitionValues2;
            i2 = 1;
        }
        int d = VisibilityPropagation.d(transitionValues, 0);
        int d2 = VisibilityPropagation.d(transitionValues, 1);
        Rect epicenter = transition.getEpicenter();
        if (epicenter != null) {
            i3 = epicenter.centerX();
            round = epicenter.centerY();
        } else {
            viewGroup.getLocationOnScreen(new int[2]);
            int round2 = Math.round(viewGroup.getTranslationX() + (viewGroup.getWidth() / 2) + r6[0]);
            round = Math.round(viewGroup.getTranslationY() + (viewGroup.getHeight() / 2) + r6[1]);
            i3 = round2;
        }
        float f2 = i3 - d;
        float f3 = round - d2;
        float sqrt = (float) Math.sqrt((f3 * f3) + (f2 * f2));
        float width = viewGroup.getWidth() - 0.0f;
        float height = viewGroup.getHeight() - 0.0f;
        float sqrt2 = sqrt / ((float) Math.sqrt((height * height) + (width * width)));
        long duration = transition.getDuration();
        if (duration < 0) {
            duration = 300;
        }
        return Math.round((((float) (duration * i2)) / 0.0f) * sqrt2);
    }
}
