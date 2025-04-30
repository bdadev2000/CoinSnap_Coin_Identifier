package D1;

import C1.m;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import v1.v;

/* loaded from: classes.dex */
public final class g extends b {

    /* renamed from: C, reason: collision with root package name */
    public final x1.d f699C;

    /* renamed from: D, reason: collision with root package name */
    public final c f700D;

    public g(v vVar, e eVar, c cVar, v1.i iVar) {
        super(vVar, eVar);
        this.f700D = cVar;
        x1.d dVar = new x1.d(vVar, this, new m("__container", eVar.f677a, false), iVar);
        this.f699C = dVar;
        dVar.b(Collections.emptyList(), Collections.emptyList());
    }

    @Override // D1.b, x1.e
    public final void c(RectF rectF, Matrix matrix, boolean z8) {
        super.c(rectF, matrix, z8);
        this.f699C.c(rectF, this.f651n, z8);
    }

    @Override // D1.b
    public final void k(Canvas canvas, Matrix matrix, int i9) {
        this.f699C.e(canvas, matrix, i9);
    }

    @Override // D1.b
    public final E1.c l() {
        E1.c cVar = this.f653p.f696w;
        if (cVar != null) {
            return cVar;
        }
        return this.f700D.f653p.f696w;
    }

    @Override // D1.b
    public final F1.i m() {
        F1.i iVar = this.f653p.f697x;
        if (iVar != null) {
            return iVar;
        }
        return this.f700D.f653p.f697x;
    }

    @Override // D1.b
    public final void q(A1.e eVar, int i9, ArrayList arrayList, A1.e eVar2) {
        this.f699C.h(eVar, i9, arrayList, eVar2);
    }
}
