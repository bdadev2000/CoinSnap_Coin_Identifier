package u3;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import m3.a0;
import m3.x;
import p3.t;

/* loaded from: classes.dex */
public final class h extends b {
    public final RectF C;
    public final n3.a D;
    public final float[] E;
    public final Path F;
    public final e G;
    public t H;
    public t I;

    public h(x xVar, e eVar) {
        super(xVar, eVar);
        this.C = new RectF();
        n3.a aVar = new n3.a();
        this.D = aVar;
        this.E = new float[8];
        this.F = new Path();
        this.G = eVar;
        aVar.setAlpha(0);
        aVar.setStyle(Paint.Style.FILL);
        aVar.setColor(eVar.f25513l);
    }

    @Override // u3.b, r3.f
    public final void d(h.c cVar, Object obj) {
        super.d(cVar, obj);
        if (obj == a0.K) {
            if (cVar == null) {
                this.H = null;
                return;
            } else {
                this.H = new t(cVar, null);
                return;
            }
        }
        if (obj == a0.a) {
            if (cVar == null) {
                this.I = null;
                this.D.setColor(this.G.f25513l);
                return;
            }
            this.I = new t(cVar, null);
        }
    }

    @Override // u3.b, o3.f
    public final void e(RectF rectF, Matrix matrix, boolean z10) {
        super.e(rectF, matrix, z10);
        RectF rectF2 = this.C;
        e eVar = this.G;
        rectF2.set(0.0f, 0.0f, eVar.f25511j, eVar.f25512k);
        this.f25491n.mapRect(rectF2);
        rectF.set(rectF2);
    }

    @Override // u3.b
    public final void j(Canvas canvas, Matrix matrix, int i10) {
        Integer num;
        int intValue;
        e eVar = this.G;
        int alpha = Color.alpha(eVar.f25513l);
        if (alpha == 0) {
            return;
        }
        t tVar = this.I;
        if (tVar == null) {
            num = null;
        } else {
            num = (Integer) tVar.f();
        }
        n3.a aVar = this.D;
        if (num != null) {
            aVar.setColor(num.intValue());
        } else {
            aVar.setColor(eVar.f25513l);
        }
        p3.d dVar = this.f25499w.f23406j;
        if (dVar == null) {
            intValue = 100;
        } else {
            intValue = ((Integer) dVar.f()).intValue();
        }
        int i11 = (int) ((((alpha / 255.0f) * intValue) / 100.0f) * (i10 / 255.0f) * 255.0f);
        aVar.setAlpha(i11);
        t tVar2 = this.H;
        if (tVar2 != null) {
            aVar.setColorFilter((ColorFilter) tVar2.f());
        }
        if (i11 > 0) {
            float[] fArr = this.E;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            float f10 = eVar.f25511j;
            fArr[2] = f10;
            fArr[3] = 0.0f;
            fArr[4] = f10;
            float f11 = eVar.f25512k;
            fArr[5] = f11;
            fArr[6] = 0.0f;
            fArr[7] = f11;
            matrix.mapPoints(fArr);
            Path path = this.F;
            path.reset();
            path.moveTo(fArr[0], fArr[1]);
            path.lineTo(fArr[2], fArr[3]);
            path.lineTo(fArr[4], fArr[5]);
            path.lineTo(fArr[6], fArr[7]);
            path.lineTo(fArr[0], fArr[1]);
            path.close();
            canvas.drawPath(path, aVar);
        }
    }
}
