package ka;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* loaded from: classes3.dex */
public final class q extends v {

    /* renamed from: c, reason: collision with root package name */
    public final s f20608c;

    public q(s sVar) {
        this.f20608c = sVar;
    }

    @Override // ka.v
    public final void a(Matrix matrix, ja.a aVar, int i10, Canvas canvas) {
        boolean z10;
        s sVar = this.f20608c;
        float f10 = sVar.f20617f;
        float f11 = sVar.f20618g;
        RectF rectF = new RectF(sVar.f20613b, sVar.f20614c, sVar.f20615d, sVar.f20616e);
        aVar.getClass();
        if (f11 < 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        Path path = aVar.f19871g;
        int[] iArr = ja.a.f19864k;
        if (z10) {
            iArr[0] = 0;
            iArr[1] = aVar.f19870f;
            iArr[2] = aVar.f19869e;
            iArr[3] = aVar.f19868d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f10, f11);
            path.close();
            float f12 = -i10;
            rectF.inset(f12, f12);
            iArr[0] = 0;
            iArr[1] = aVar.f19868d;
            iArr[2] = aVar.f19869e;
            iArr[3] = aVar.f19870f;
        }
        float width = rectF.width() / 2.0f;
        if (width > 0.0f) {
            float f13 = 1.0f - (i10 / width);
            float[] fArr = ja.a.f19865l;
            fArr[1] = f13;
            fArr[2] = ((1.0f - f13) / 2.0f) + f13;
            RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP);
            Paint paint = aVar.f19866b;
            paint.setShader(radialGradient);
            canvas.save();
            canvas.concat(matrix);
            canvas.scale(1.0f, rectF.height() / rectF.width());
            if (!z10) {
                canvas.clipPath(path, Region.Op.DIFFERENCE);
                canvas.drawPath(path, aVar.f19872h);
            }
            canvas.drawArc(rectF, f10, f11, true, paint);
            canvas.restore();
        }
    }
}
