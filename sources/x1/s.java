package x1;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import v1.y;

/* loaded from: classes.dex */
public final class s extends b {

    /* renamed from: r, reason: collision with root package name */
    public final D1.b f24207r;

    /* renamed from: s, reason: collision with root package name */
    public final String f24208s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f24209t;

    /* renamed from: u, reason: collision with root package name */
    public final y1.f f24210u;

    /* renamed from: v, reason: collision with root package name */
    public y1.r f24211v;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public s(v1.v r13, D1.b r14, C1.o r15) {
        /*
            r12 = this;
            int r0 = r15.f480g
            int r0 = z.AbstractC2965e.d(r0)
            r1 = 1
            if (r0 == 0) goto L12
            if (r0 == r1) goto Lf
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.SQUARE
        Ld:
            r5 = r0
            goto L15
        Lf:
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.ROUND
            goto Ld
        L12:
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.BUTT
            goto Ld
        L15:
            int r0 = r15.f481h
            int r0 = z.AbstractC2965e.d(r0)
            if (r0 == 0) goto L2b
            if (r0 == r1) goto L28
            r1 = 2
            if (r0 == r1) goto L25
            r0 = 0
        L23:
            r6 = r0
            goto L2e
        L25:
            android.graphics.Paint$Join r0 = android.graphics.Paint.Join.BEVEL
            goto L23
        L28:
            android.graphics.Paint$Join r0 = android.graphics.Paint.Join.ROUND
            goto L23
        L2b:
            android.graphics.Paint$Join r0 = android.graphics.Paint.Join.MITER
            goto L23
        L2e:
            B1.b r11 = r15.b
            java.util.List r0 = r15.f476c
            r10 = r0
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            float r7 = r15.f482i
            B1.a r8 = r15.f478e
            B1.b r9 = r15.f479f
            r2 = r12
            r3 = r13
            r4 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.f24207r = r14
            java.lang.String r13 = r15.f475a
            r12.f24208s = r13
            boolean r13 = r15.f483j
            r12.f24209t = r13
            B1.a r13 = r15.f477d
            y1.e r13 = r13.g()
            r15 = r13
            y1.f r15 = (y1.f) r15
            r12.f24210u = r15
            r13.a(r12)
            r14.d(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.s.<init>(v1.v, D1.b, C1.o):void");
    }

    @Override // x1.b, x1.e
    public final void e(Canvas canvas, Matrix matrix, int i9) {
        if (this.f24209t) {
            return;
        }
        y1.f fVar = this.f24210u;
        int k6 = fVar.k(fVar.f24290c.c(), fVar.c());
        D1.i iVar = this.f24098i;
        iVar.setColor(k6);
        y1.r rVar = this.f24211v;
        if (rVar != null) {
            iVar.setColorFilter((ColorFilter) rVar.e());
        }
        super.e(canvas, matrix, i9);
    }

    @Override // x1.b, A1.f
    public final void g(E1.d dVar, Object obj) {
        super.g(dVar, obj);
        PointF pointF = y.f23578a;
        y1.f fVar = this.f24210u;
        if (obj == 2) {
            fVar.j(dVar);
            return;
        }
        if (obj == y.f23572F) {
            y1.r rVar = this.f24211v;
            D1.b bVar = this.f24207r;
            if (rVar != null) {
                bVar.p(rVar);
            }
            if (dVar == null) {
                this.f24211v = null;
                return;
            }
            y1.r rVar2 = new y1.r(dVar, null);
            this.f24211v = rVar2;
            rVar2.a(this);
            bVar.d(fVar);
        }
    }

    @Override // x1.c
    public final String getName() {
        return this.f24208s;
    }
}
