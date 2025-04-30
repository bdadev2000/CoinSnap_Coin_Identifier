package R3;

import android.graphics.Matrix;
import android.graphics.Path;

/* loaded from: classes2.dex */
public final class r extends s {
    public float b;

    /* renamed from: c, reason: collision with root package name */
    public float f2725c;

    @Override // R3.s
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f2726a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.b, this.f2725c);
        path.transform(matrix);
    }
}
