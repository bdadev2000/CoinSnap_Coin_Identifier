package u3;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import m3.a0;
import m3.x;
import m3.y;
import p3.t;

/* loaded from: classes.dex */
public final class d extends b {
    public final n3.a C;
    public final Rect D;
    public final Rect E;
    public final y F;
    public t G;
    public t H;

    public d(x xVar, e eVar) {
        super(xVar, eVar);
        y yVar;
        this.C = new n3.a(3);
        this.D = new Rect();
        this.E = new Rect();
        m3.j jVar = xVar.f21592b;
        if (jVar == null) {
            yVar = null;
        } else {
            yVar = (y) jVar.c().get(eVar.f25508g);
        }
        this.F = yVar;
    }

    @Override // u3.b, r3.f
    public final void d(h.c cVar, Object obj) {
        super.d(cVar, obj);
        if (obj == a0.K) {
            if (cVar == null) {
                this.G = null;
                return;
            } else {
                this.G = new t(cVar, null);
                return;
            }
        }
        if (obj == a0.N) {
            if (cVar == null) {
                this.H = null;
            } else {
                this.H = new t(cVar, null);
            }
        }
    }

    @Override // u3.b, o3.f
    public final void e(RectF rectF, Matrix matrix, boolean z10) {
        super.e(rectF, matrix, z10);
        if (this.F != null) {
            float c10 = y3.h.c();
            rectF.set(0.0f, 0.0f, r3.a * c10, r3.f21615b * c10);
            this.f25491n.mapRect(rectF);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0158  */
    @Override // u3.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(android.graphics.Canvas r15, android.graphics.Matrix r16, int r17) {
        /*
            Method dump skipped, instructions count: 449
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.d.j(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }
}
