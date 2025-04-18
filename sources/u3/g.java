package u3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import m3.x;
import t3.m;

/* loaded from: classes.dex */
public final class g extends b {
    public final o3.e C;
    public final c D;

    public g(m3.j jVar, x xVar, c cVar, e eVar) {
        super(xVar, eVar);
        this.D = cVar;
        o3.e eVar2 = new o3.e(xVar, this, new m("__container", eVar.a, false), jVar);
        this.C = eVar2;
        eVar2.b(Collections.emptyList(), Collections.emptyList());
    }

    @Override // u3.b, o3.f
    public final void e(RectF rectF, Matrix matrix, boolean z10) {
        super.e(rectF, matrix, z10);
        this.C.e(rectF, this.f25491n, z10);
    }

    @Override // u3.b
    public final void j(Canvas canvas, Matrix matrix, int i10) {
        this.C.g(canvas, matrix, i10);
    }

    @Override // u3.b
    public final v3.c k() {
        v3.c cVar = this.f25493p.f25523w;
        if (cVar != null) {
            return cVar;
        }
        return this.D.f25493p.f25523w;
    }

    @Override // u3.b
    public final w3.h l() {
        w3.h hVar = this.f25493p.f25524x;
        if (hVar != null) {
            return hVar;
        }
        return this.D.f25493p.f25524x;
    }

    @Override // u3.b
    public final void o(r3.e eVar, int i10, ArrayList arrayList, r3.e eVar2) {
        this.C.c(eVar, i10, arrayList, eVar2);
    }
}
