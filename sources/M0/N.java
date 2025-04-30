package M0;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes.dex */
public final class N extends M {
    @Override // w4.v0
    public final void A(View view, float f9) {
        view.setTransitionAlpha(f9);
    }

    @Override // M0.M, w4.v0
    public final void B(View view, int i9) {
        view.setTransitionVisibility(i9);
    }

    @Override // M0.M
    public final void F(View view, int i9, int i10, int i11, int i12) {
        view.setLeftTopRightBottom(i9, i10, i11, i12);
    }

    @Override // M0.M
    public final void G(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // M0.M
    public final void H(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // w4.v0
    public final float n(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }
}
