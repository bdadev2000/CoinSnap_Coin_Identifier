package androidx.constraintlayout.motion.utils;

import androidx.constraintlayout.motion.widget.MotionInterpolator;

/* loaded from: classes4.dex */
public class StopLogic extends MotionInterpolator {

    /* renamed from: a, reason: collision with root package name */
    public float f17755a;

    @Override // androidx.constraintlayout.motion.widget.MotionInterpolator
    public final float a() {
        return b(this.f17755a);
    }

    public final float b(float f2) {
        if (f2 > 0.0f) {
            f2 -= 0.0f;
            if (f2 >= 0.0f) {
                float f3 = f2 - 0.0f;
                if (f3 < 0.0f) {
                    return 0.0f - ((f3 * 0.0f) / 0.0f);
                }
                return 0.0f;
            }
        }
        return ((f2 * 0.0f) / 0.0f) + 0.0f;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f2) {
        float f3;
        if (f2 <= 0.0f) {
            f3 = (((0.0f * f2) * f2) / 0.0f) + (0.0f * f2);
        } else {
            float f4 = f2 - 0.0f;
            if (f4 < 0.0f) {
                f3 = (0.0f * f4) + 0.0f + (((0.0f * f4) * f4) / 0.0f);
            } else {
                float f5 = f4 - 0.0f;
                if (f5 < 0.0f) {
                    float f6 = 0.0f * f5;
                    f3 = (f6 + 0.0f) - ((f6 * f5) / 0.0f);
                } else {
                    f3 = 0.0f;
                }
            }
        }
        this.f17755a = f2;
        return 0.0f + f3;
    }
}
