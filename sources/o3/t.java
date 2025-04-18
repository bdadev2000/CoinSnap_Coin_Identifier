package o3;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import m3.a0;

/* loaded from: classes.dex */
public final class t extends b {

    /* renamed from: r, reason: collision with root package name */
    public final u3.b f23121r;

    /* renamed from: s, reason: collision with root package name */
    public final String f23122s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f23123t;
    public final p3.d u;

    /* renamed from: v, reason: collision with root package name */
    public p3.t f23124v;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public t(m3.x r14, u3.b r15, t3.o r16) {
        /*
            r13 = this;
            r10 = r13
            r11 = r15
            r12 = r16
            int r0 = r12.f25251g
            r1 = 0
            if (r0 == 0) goto L5b
            int r0 = r0 + (-1)
            r2 = 1
            if (r0 == 0) goto L16
            if (r0 == r2) goto L13
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.SQUARE
            goto L18
        L13:
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.ROUND
            goto L18
        L16:
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.BUTT
        L18:
            r3 = r0
            int r0 = r12.f25252h
            if (r0 == 0) goto L5a
            int r0 = r0 + (-1)
            if (r0 == 0) goto L2e
            if (r0 == r2) goto L2b
            r2 = 2
            if (r0 == r2) goto L28
            r4 = r1
            goto L31
        L28:
            android.graphics.Paint$Join r0 = android.graphics.Paint.Join.BEVEL
            goto L30
        L2b:
            android.graphics.Paint$Join r0 = android.graphics.Paint.Join.ROUND
            goto L30
        L2e:
            android.graphics.Paint$Join r0 = android.graphics.Paint.Join.MITER
        L30:
            r4 = r0
        L31:
            float r5 = r12.f25253i
            h4.c r6 = r12.f25249e
            s3.a r7 = r12.f25250f
            java.util.List r8 = r12.f25247c
            s3.a r9 = r12.f25246b
            r0 = r13
            r1 = r14
            r2 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.f23121r = r11
            java.lang.String r0 = r12.a
            r10.f23122s = r0
            boolean r0 = r12.f25254j
            r10.f23123t = r0
            h4.c r0 = r12.f25248d
            p3.d r0 = r0.a()
            r10.u = r0
            r0.a(r13)
            r15.f(r0)
            return
        L5a:
            throw r1
        L5b:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o3.t.<init>(m3.x, u3.b, t3.o):void");
    }

    @Override // o3.b, r3.f
    public final void d(h.c cVar, Object obj) {
        super.d(cVar, obj);
        Integer num = a0.f21497b;
        p3.d dVar = this.u;
        if (obj == num) {
            dVar.k(cVar);
            return;
        }
        if (obj == a0.K) {
            p3.t tVar = this.f23124v;
            u3.b bVar = this.f23121r;
            if (tVar != null) {
                bVar.n(tVar);
            }
            if (cVar == null) {
                this.f23124v = null;
                return;
            }
            p3.t tVar2 = new p3.t(cVar, null);
            this.f23124v = tVar2;
            tVar2.a(this);
            bVar.f(dVar);
        }
    }

    @Override // o3.b, o3.f
    public final void g(Canvas canvas, Matrix matrix, int i10) {
        if (this.f23123t) {
            return;
        }
        p3.e eVar = (p3.e) this.u;
        int l10 = eVar.l(eVar.b(), eVar.d());
        n3.a aVar = this.f23008i;
        aVar.setColor(l10);
        p3.t tVar = this.f23124v;
        if (tVar != null) {
            aVar.setColorFilter((ColorFilter) tVar.f());
        }
        super.g(canvas, matrix, i10);
    }

    @Override // o3.d
    public final String getName() {
        return this.f23122s;
    }
}
