package f2;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes.dex */
public final class m0 extends l0 {
    @Override // f2.h0
    public final void A(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // f2.h0
    public final void B(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // f2.j0
    public final void C(View view, int i10, int i11, int i12, int i13) {
        view.setLeftTopRightBottom(i10, i11, i12, i13);
    }

    @Override // com.facebook.appevents.o
    public final float m(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // com.facebook.appevents.o
    public final void w(View view, float f10) {
        view.setTransitionAlpha(f10);
    }

    @Override // f2.l0, com.facebook.appevents.o
    public final void x(View view, int i10) {
        view.setTransitionVisibility(i10);
    }
}
