package x1;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import v1.y;

/* loaded from: classes.dex */
public final class i extends b {

    /* renamed from: A, reason: collision with root package name */
    public final y1.j f24150A;

    /* renamed from: B, reason: collision with root package name */
    public y1.r f24151B;

    /* renamed from: r, reason: collision with root package name */
    public final String f24152r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f24153s;

    /* renamed from: t, reason: collision with root package name */
    public final x.f f24154t;

    /* renamed from: u, reason: collision with root package name */
    public final x.f f24155u;

    /* renamed from: v, reason: collision with root package name */
    public final RectF f24156v;

    /* renamed from: w, reason: collision with root package name */
    public final int f24157w;

    /* renamed from: x, reason: collision with root package name */
    public final int f24158x;

    /* renamed from: y, reason: collision with root package name */
    public final y1.j f24159y;

    /* renamed from: z, reason: collision with root package name */
    public final y1.j f24160z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public i(v1.v r13, D1.b r14, C1.e r15) {
        /*
            r12 = this;
            int r0 = r15.f439h
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
            int r0 = r15.f440i
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
            B1.b r11 = r15.l
            java.util.List r0 = r15.f442k
            r10 = r0
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            float r7 = r15.f441j
            B1.a r8 = r15.f435d
            B1.b r9 = r15.f438g
            r2 = r12
            r3 = r13
            r4 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            x.f r0 = new x.f
            r0.<init>()
            r12.f24154t = r0
            x.f r0 = new x.f
            r0.<init>()
            r12.f24155u = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r12.f24156v = r0
            java.lang.String r0 = r15.f433a
            r12.f24152r = r0
            int r0 = r15.b
            r12.f24157w = r0
            boolean r0 = r15.m
            r12.f24153s = r0
            v1.i r13 = r13.b
            float r13 = r13.b()
            r0 = 1107296256(0x42000000, float:32.0)
            float r13 = r13 / r0
            int r13 = (int) r13
            r12.f24158x = r13
            B1.a r13 = r15.f434c
            y1.e r13 = r13.g()
            r0 = r13
            y1.j r0 = (y1.j) r0
            r12.f24159y = r0
            r13.a(r12)
            r14.d(r13)
            B1.a r13 = r15.f436e
            y1.e r13 = r13.g()
            r0 = r13
            y1.j r0 = (y1.j) r0
            r12.f24160z = r0
            r13.a(r12)
            r14.d(r13)
            B1.a r13 = r15.f437f
            y1.e r13 = r13.g()
            r15 = r13
            y1.j r15 = (y1.j) r15
            r12.f24150A = r15
            r13.a(r12)
            r14.d(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.i.<init>(v1.v, D1.b, C1.e):void");
    }

    public final int[] d(int[] iArr) {
        y1.r rVar = this.f24151B;
        if (rVar != null) {
            Integer[] numArr = (Integer[]) rVar.e();
            int i9 = 0;
            if (iArr.length == numArr.length) {
                while (i9 < iArr.length) {
                    iArr[i9] = numArr[i9].intValue();
                    i9++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i9 < numArr.length) {
                    iArr[i9] = numArr[i9].intValue();
                    i9++;
                }
            }
        }
        return iArr;
    }

    @Override // x1.b, x1.e
    public final void e(Canvas canvas, Matrix matrix, int i9) {
        Shader shader;
        if (this.f24153s) {
            return;
        }
        c(this.f24156v, matrix, false);
        int i10 = this.f24157w;
        y1.j jVar = this.f24159y;
        y1.j jVar2 = this.f24150A;
        y1.j jVar3 = this.f24160z;
        if (i10 == 1) {
            long i11 = i();
            x.f fVar = this.f24154t;
            shader = (LinearGradient) fVar.d(null, i11);
            if (shader == null) {
                PointF pointF = (PointF) jVar3.e();
                PointF pointF2 = (PointF) jVar2.e();
                C1.c cVar = (C1.c) jVar.e();
                shader = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, d(cVar.b), cVar.f425a, Shader.TileMode.CLAMP);
                fVar.f(i11, shader);
            }
        } else {
            long i12 = i();
            x.f fVar2 = this.f24155u;
            shader = (RadialGradient) fVar2.d(null, i12);
            if (shader == null) {
                PointF pointF3 = (PointF) jVar3.e();
                PointF pointF4 = (PointF) jVar2.e();
                C1.c cVar2 = (C1.c) jVar.e();
                int[] d2 = d(cVar2.b);
                RadialGradient radialGradient = new RadialGradient(pointF3.x, pointF3.y, (float) Math.hypot(pointF4.x - r10, pointF4.y - r11), d2, cVar2.f425a, Shader.TileMode.CLAMP);
                fVar2.f(i12, radialGradient);
                shader = radialGradient;
            }
        }
        shader.setLocalMatrix(matrix);
        this.f24098i.setShader(shader);
        super.e(canvas, matrix, i9);
    }

    @Override // x1.b, A1.f
    public final void g(E1.d dVar, Object obj) {
        super.g(dVar, obj);
        if (obj == y.f23573G) {
            y1.r rVar = this.f24151B;
            D1.b bVar = this.f24095f;
            if (rVar != null) {
                bVar.p(rVar);
            }
            if (dVar == null) {
                this.f24151B = null;
                return;
            }
            y1.r rVar2 = new y1.r(dVar, null);
            this.f24151B = rVar2;
            rVar2.a(this);
            bVar.d(this.f24151B);
        }
    }

    @Override // x1.c
    public final String getName() {
        return this.f24152r;
    }

    public final int i() {
        int i9;
        float f9 = this.f24160z.f24291d;
        float f10 = this.f24158x;
        int round = Math.round(f9 * f10);
        int round2 = Math.round(this.f24150A.f24291d * f10);
        int round3 = Math.round(this.f24159y.f24291d * f10);
        if (round != 0) {
            i9 = 527 * round;
        } else {
            i9 = 17;
        }
        if (round2 != 0) {
            i9 = i9 * 31 * round2;
        }
        if (round3 != 0) {
            return i9 * 31 * round3;
        }
        return i9;
    }
}
