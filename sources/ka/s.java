package ka;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes3.dex */
public final class s extends u {

    /* renamed from: h, reason: collision with root package name */
    public static final RectF f20612h = new RectF();

    /* renamed from: b, reason: collision with root package name */
    public float f20613b;

    /* renamed from: c, reason: collision with root package name */
    public float f20614c;

    /* renamed from: d, reason: collision with root package name */
    public float f20615d;

    /* renamed from: e, reason: collision with root package name */
    public float f20616e;

    /* renamed from: f, reason: collision with root package name */
    public float f20617f;

    /* renamed from: g, reason: collision with root package name */
    public float f20618g;

    public s(float f10, float f11, float f12, float f13) {
        this.f20613b = f10;
        this.f20614c = f11;
        this.f20615d = f12;
        this.f20616e = f13;
    }

    @Override // ka.u
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = f20612h;
        rectF.set(this.f20613b, this.f20614c, this.f20615d, this.f20616e);
        path.arcTo(rectF, this.f20617f, this.f20618g, false);
        path.transform(matrix);
    }
}
