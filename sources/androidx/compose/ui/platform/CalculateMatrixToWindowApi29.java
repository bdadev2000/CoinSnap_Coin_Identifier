package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import org.jetbrains.annotations.NotNull;

@RequiresApi
/* loaded from: classes3.dex */
final class CalculateMatrixToWindowApi29 implements CalculateMatrixToWindow {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f16400a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    public final int[] f16401b = new int[2];

    @Override // androidx.compose.ui.platform.CalculateMatrixToWindow
    @DoNotInline
    public void a(@NotNull View view, @NotNull float[] fArr) {
        Matrix matrix = this.f16400a;
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        int[] iArr = this.f16401b;
        view.getLocationOnScreen(iArr);
        int i2 = iArr[0];
        int i3 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i2, iArr[1] - i3);
        AndroidMatrixConversions_androidKt.b(matrix, fArr);
    }
}
