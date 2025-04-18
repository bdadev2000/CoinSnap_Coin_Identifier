package ka;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* loaded from: classes3.dex */
public final class r extends v {

    /* renamed from: c, reason: collision with root package name */
    public final t f20609c;

    /* renamed from: d, reason: collision with root package name */
    public final float f20610d;

    /* renamed from: e, reason: collision with root package name */
    public final float f20611e;

    public r(t tVar, float f10, float f11) {
        this.f20609c = tVar;
        this.f20610d = f10;
        this.f20611e = f11;
    }

    @Override // ka.v
    public final void a(Matrix matrix, ja.a aVar, int i10, Canvas canvas) {
        t tVar = this.f20609c;
        float f10 = tVar.f20620c;
        float f11 = this.f20611e;
        float f12 = tVar.f20619b;
        float f13 = this.f20610d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f10 - f11, f12 - f13), 0.0f);
        Matrix matrix2 = this.a;
        matrix2.set(matrix);
        matrix2.preTranslate(f13, f11);
        matrix2.preRotate(b());
        aVar.getClass();
        rectF.bottom += i10;
        rectF.offset(0.0f, -i10);
        int[] iArr = ja.a.f19862i;
        iArr[0] = aVar.f19870f;
        iArr[1] = aVar.f19869e;
        iArr[2] = aVar.f19868d;
        Paint paint = aVar.f19867c;
        float f14 = rectF.left;
        paint.setShader(new LinearGradient(f14, rectF.top, f14, rectF.bottom, iArr, ja.a.f19863j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        t tVar = this.f20609c;
        return (float) Math.toDegrees(Math.atan((tVar.f20620c - this.f20611e) / (tVar.f20619b - this.f20610d)));
    }
}
