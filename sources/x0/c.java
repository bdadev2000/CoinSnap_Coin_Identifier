package x0;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class c implements Interpolator {
    public final /* synthetic */ int a;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        switch (this.a) {
            case 0:
            case 1:
            default:
                float f11 = f10 - 1.0f;
                return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }
}
