package ka;

import android.graphics.Matrix;
import android.graphics.Path;

/* loaded from: classes3.dex */
public final class t extends u {

    /* renamed from: b, reason: collision with root package name */
    public float f20619b;

    /* renamed from: c, reason: collision with root package name */
    public float f20620c;

    @Override // ka.u
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f20619b, this.f20620c);
        path.transform(matrix);
    }
}
