package R3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* loaded from: classes2.dex */
public final class o extends t {

    /* renamed from: c, reason: collision with root package name */
    public final q f2715c;

    public o(q qVar) {
        this.f2715c = qVar;
    }

    @Override // R3.t
    public final void a(Matrix matrix, Q3.a aVar, int i9, Canvas canvas) {
        boolean z8;
        q qVar = this.f2715c;
        float f9 = qVar.f2723f;
        float f10 = qVar.f2724g;
        RectF rectF = new RectF(qVar.b, qVar.f2720c, qVar.f2721d, qVar.f2722e);
        aVar.getClass();
        if (f10 < 0.0f) {
            z8 = true;
        } else {
            z8 = false;
        }
        Path path = aVar.f2506g;
        int[] iArr = Q3.a.f2500k;
        if (z8) {
            iArr[0] = 0;
            iArr[1] = aVar.f2505f;
            iArr[2] = aVar.f2504e;
            iArr[3] = aVar.f2503d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f9, f10);
            path.close();
            float f11 = -i9;
            rectF.inset(f11, f11);
            iArr[0] = 0;
            iArr[1] = aVar.f2503d;
            iArr[2] = aVar.f2504e;
            iArr[3] = aVar.f2505f;
        }
        float width = rectF.width() / 2.0f;
        if (width > 0.0f) {
            float f12 = 1.0f - (i9 / width);
            float[] fArr = Q3.a.l;
            fArr[1] = f12;
            fArr[2] = ((1.0f - f12) / 2.0f) + f12;
            RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP);
            Paint paint = aVar.b;
            paint.setShader(radialGradient);
            canvas.save();
            canvas.concat(matrix);
            canvas.scale(1.0f, rectF.height() / rectF.width());
            if (!z8) {
                canvas.clipPath(path, Region.Op.DIFFERENCE);
                canvas.drawPath(path, aVar.f2507h);
            }
            canvas.drawArc(rectF, f9, f10, true, paint);
            canvas.restore();
        }
    }
}
