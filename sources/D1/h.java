package D1;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import v1.v;
import v1.y;
import y1.r;

/* loaded from: classes.dex */
public final class h extends b {

    /* renamed from: C, reason: collision with root package name */
    public final RectF f701C;

    /* renamed from: D, reason: collision with root package name */
    public final i f702D;

    /* renamed from: E, reason: collision with root package name */
    public final float[] f703E;

    /* renamed from: F, reason: collision with root package name */
    public final Path f704F;

    /* renamed from: G, reason: collision with root package name */
    public final e f705G;

    /* renamed from: H, reason: collision with root package name */
    public r f706H;

    /* renamed from: I, reason: collision with root package name */
    public r f707I;

    public h(v vVar, e eVar) {
        super(vVar, eVar);
        this.f701C = new RectF();
        i iVar = new i();
        this.f702D = iVar;
        this.f703E = new float[8];
        this.f704F = new Path();
        this.f705G = eVar;
        iVar.setAlpha(0);
        iVar.setStyle(Paint.Style.FILL);
        iVar.setColor(eVar.l);
    }

    @Override // D1.b, x1.e
    public final void c(RectF rectF, Matrix matrix, boolean z8) {
        super.c(rectF, matrix, z8);
        RectF rectF2 = this.f701C;
        e eVar = this.f705G;
        rectF2.set(0.0f, 0.0f, eVar.f685j, eVar.f686k);
        this.f651n.mapRect(rectF2);
        rectF.set(rectF2);
    }

    @Override // D1.b, A1.f
    public final void g(E1.d dVar, Object obj) {
        super.g(dVar, obj);
        if (obj == y.f23572F) {
            if (dVar == null) {
                this.f706H = null;
                return;
            } else {
                this.f706H = new r(dVar, null);
                return;
            }
        }
        if (obj == 1) {
            if (dVar == null) {
                this.f707I = null;
                this.f702D.setColor(this.f705G.l);
                return;
            }
            this.f707I = new r(dVar, null);
        }
    }

    @Override // D1.b
    public final void k(Canvas canvas, Matrix matrix, int i9) {
        Integer num;
        int intValue;
        e eVar = this.f705G;
        int alpha = Color.alpha(eVar.l);
        if (alpha == 0) {
            return;
        }
        r rVar = this.f707I;
        if (rVar == null) {
            num = null;
        } else {
            num = (Integer) rVar.e();
        }
        i iVar = this.f702D;
        if (num != null) {
            iVar.setColor(num.intValue());
        } else {
            iVar.setColor(eVar.l);
        }
        y1.e eVar2 = this.f660w.f24329j;
        if (eVar2 == null) {
            intValue = 100;
        } else {
            intValue = ((Integer) eVar2.e()).intValue();
        }
        int i10 = (int) ((((alpha / 255.0f) * intValue) / 100.0f) * (i9 / 255.0f) * 255.0f);
        iVar.setAlpha(i10);
        r rVar2 = this.f706H;
        if (rVar2 != null) {
            iVar.setColorFilter((ColorFilter) rVar2.e());
        }
        if (i10 > 0) {
            float[] fArr = this.f703E;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            float f9 = eVar.f685j;
            fArr[2] = f9;
            fArr[3] = 0.0f;
            fArr[4] = f9;
            float f10 = eVar.f686k;
            fArr[5] = f10;
            fArr[6] = 0.0f;
            fArr[7] = f10;
            matrix.mapPoints(fArr);
            Path path = this.f704F;
            path.reset();
            path.moveTo(fArr[0], fArr[1]);
            path.lineTo(fArr[2], fArr[3]);
            path.lineTo(fArr[4], fArr[5]);
            path.lineTo(fArr[6], fArr[7]);
            path.lineTo(fArr[0], fArr[1]);
            path.close();
            canvas.drawPath(path, iVar);
        }
    }
}
