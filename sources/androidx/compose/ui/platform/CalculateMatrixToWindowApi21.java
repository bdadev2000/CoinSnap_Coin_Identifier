package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.compose.ui.graphics.Matrix;

/* loaded from: classes3.dex */
final class CalculateMatrixToWindowApi21 implements CalculateMatrixToWindow {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f16398a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f16399b = new int[2];

    public CalculateMatrixToWindowApi21(float[] fArr) {
        this.f16398a = fArr;
    }

    @Override // androidx.compose.ui.platform.CalculateMatrixToWindow
    public final void a(View view, float[] fArr) {
        Matrix.c(fArr);
        b(view, fArr);
    }

    public final void b(View view, float[] fArr) {
        Object parent = view.getParent();
        boolean z2 = parent instanceof View;
        float[] fArr2 = this.f16398a;
        if (z2) {
            b((View) parent, fArr);
            Matrix.c(fArr2);
            Matrix.g(-view.getScrollX(), -view.getScrollY(), 0.0f, fArr2);
            AndroidComposeView_androidKt.b(fArr, fArr2);
            float left = view.getLeft();
            float top = view.getTop();
            Matrix.c(fArr2);
            Matrix.g(left, top, 0.0f, fArr2);
            AndroidComposeView_androidKt.b(fArr, fArr2);
        } else {
            int[] iArr = this.f16399b;
            view.getLocationInWindow(iArr);
            Matrix.c(fArr2);
            Matrix.g(-view.getScrollX(), -view.getScrollY(), 0.0f, fArr2);
            AndroidComposeView_androidKt.b(fArr, fArr2);
            float f2 = iArr[0];
            float f3 = iArr[1];
            Matrix.c(fArr2);
            Matrix.g(f2, f3, 0.0f, fArr2);
            AndroidComposeView_androidKt.b(fArr, fArr2);
        }
        android.graphics.Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        AndroidMatrixConversions_androidKt.b(matrix, fArr2);
        AndroidComposeView_androidKt.b(fArr, fArr2);
    }
}
