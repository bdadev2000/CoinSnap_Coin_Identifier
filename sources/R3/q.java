package R3;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes2.dex */
public final class q extends s {

    /* renamed from: h, reason: collision with root package name */
    public static final RectF f2719h = new RectF();
    public final float b;

    /* renamed from: c, reason: collision with root package name */
    public final float f2720c;

    /* renamed from: d, reason: collision with root package name */
    public final float f2721d;

    /* renamed from: e, reason: collision with root package name */
    public final float f2722e;

    /* renamed from: f, reason: collision with root package name */
    public float f2723f;

    /* renamed from: g, reason: collision with root package name */
    public float f2724g;

    public q(float f9, float f10, float f11, float f12) {
        this.b = f9;
        this.f2720c = f10;
        this.f2721d = f11;
        this.f2722e = f12;
    }

    @Override // R3.s
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f2726a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = f2719h;
        rectF.set(this.b, this.f2720c, this.f2721d, this.f2722e);
        path.arcTo(rectF, this.f2723f, this.f2724g, false);
        path.transform(matrix);
    }
}
