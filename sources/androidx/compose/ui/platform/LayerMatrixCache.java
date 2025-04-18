package androidx.compose.ui.platform;

import android.graphics.Matrix;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;

@StabilityInferred
/* loaded from: classes4.dex */
public final class LayerMatrixCache<T> {

    /* renamed from: a, reason: collision with root package name */
    public final q0.p f16525a;

    /* renamed from: b, reason: collision with root package name */
    public Matrix f16526b;

    /* renamed from: c, reason: collision with root package name */
    public Matrix f16527c;
    public float[] d;
    public float[] e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f16528f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f16529g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f16530h = true;

    public LayerMatrixCache(q0.p pVar) {
        this.f16525a = pVar;
    }

    public final float[] a(Object obj) {
        float[] fArr = this.e;
        if (fArr == null) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
            this.e = fArr;
        }
        if (this.f16529g) {
            this.f16530h = InvertMatrixKt.a(b(obj), fArr);
            this.f16529g = false;
        }
        if (this.f16530h) {
            return fArr;
        }
        return null;
    }

    public final float[] b(Object obj) {
        float[] fArr = this.d;
        if (fArr == null) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
            this.d = fArr;
        }
        if (!this.f16528f) {
            return fArr;
        }
        Matrix matrix = this.f16526b;
        if (matrix == null) {
            matrix = new Matrix();
            this.f16526b = matrix;
        }
        this.f16525a.invoke(obj, matrix);
        Matrix matrix2 = this.f16527c;
        if (matrix2 == null || !p0.a.g(matrix, matrix2)) {
            AndroidMatrixConversions_androidKt.b(matrix, fArr);
            this.f16526b = matrix2;
            this.f16527c = matrix;
        }
        this.f16528f = false;
        return fArr;
    }

    public final void c() {
        this.f16528f = true;
        this.f16529g = true;
    }
}
