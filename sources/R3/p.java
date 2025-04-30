package R3;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* loaded from: classes2.dex */
public final class p extends t {

    /* renamed from: c, reason: collision with root package name */
    public final r f2716c;

    /* renamed from: d, reason: collision with root package name */
    public final float f2717d;

    /* renamed from: e, reason: collision with root package name */
    public final float f2718e;

    public p(r rVar, float f9, float f10) {
        this.f2716c = rVar;
        this.f2717d = f9;
        this.f2718e = f10;
    }

    @Override // R3.t
    public final void a(Matrix matrix, Q3.a aVar, int i9, Canvas canvas) {
        r rVar = this.f2716c;
        float f9 = rVar.f2725c;
        float f10 = this.f2718e;
        float f11 = rVar.b;
        float f12 = this.f2717d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f9 - f10, f11 - f12), 0.0f);
        Matrix matrix2 = this.f2727a;
        matrix2.set(matrix);
        matrix2.preTranslate(f12, f10);
        matrix2.preRotate(b());
        aVar.getClass();
        rectF.bottom += i9;
        rectF.offset(0.0f, -i9);
        int[] iArr = Q3.a.f2498i;
        iArr[0] = aVar.f2505f;
        iArr[1] = aVar.f2504e;
        iArr[2] = aVar.f2503d;
        Paint paint = aVar.f2502c;
        float f13 = rectF.left;
        paint.setShader(new LinearGradient(f13, rectF.top, f13, rectF.bottom, iArr, Q3.a.f2499j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        r rVar = this.f2716c;
        return (float) Math.toDegrees(Math.atan((rVar.f2725c - this.f2718e) / (rVar.b - this.f2717d)));
    }
}
