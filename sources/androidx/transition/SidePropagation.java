package androidx.transition;

import android.graphics.Rect;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public class SidePropagation extends VisibilityPropagation {
    @Override // androidx.transition.TransitionPropagation
    public final long c(ViewGroup viewGroup, Transition transition, TransitionValues transitionValues, TransitionValues transitionValues2) {
        int i2;
        Integer num;
        if (transitionValues == null && transitionValues2 == null) {
            return 0L;
        }
        Rect epicenter = transition.getEpicenter();
        if (transitionValues2 == null || !(transitionValues == null || (num = (Integer) transitionValues.f21617a.get("android:visibilityPropagation:visibility")) == null || num.intValue() != 0)) {
            i2 = -1;
        } else {
            transitionValues = transitionValues2;
            i2 = 1;
        }
        VisibilityPropagation.d(transitionValues, 0);
        VisibilityPropagation.d(transitionValues, 1);
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        int round = Math.round(viewGroup.getTranslationX()) + iArr[0];
        int round2 = Math.round(viewGroup.getTranslationY()) + iArr[1];
        int width = viewGroup.getWidth() + round;
        int height = viewGroup.getHeight() + round2;
        if (epicenter != null) {
            epicenter.centerX();
            epicenter.centerY();
        } else {
            int i3 = (round + width) / 2;
            int i4 = (round2 + height) / 2;
        }
        float height2 = 0 / viewGroup.getHeight();
        long duration = transition.getDuration();
        if (duration < 0) {
            duration = 300;
        }
        return Math.round((((float) (duration * i2)) / 0.0f) * height2);
    }
}
