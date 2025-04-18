package o3;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import m3.a0;

/* loaded from: classes.dex */
public final class j extends b {
    public final p3.d A;
    public p3.t B;

    /* renamed from: r, reason: collision with root package name */
    public final String f23065r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f23066s;

    /* renamed from: t, reason: collision with root package name */
    public final r.e f23067t;
    public final r.e u;

    /* renamed from: v, reason: collision with root package name */
    public final RectF f23068v;

    /* renamed from: w, reason: collision with root package name */
    public final int f23069w;

    /* renamed from: x, reason: collision with root package name */
    public final int f23070x;

    /* renamed from: y, reason: collision with root package name */
    public final p3.d f23071y;

    /* renamed from: z, reason: collision with root package name */
    public final p3.d f23072z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public j(m3.x r14, u3.b r15, t3.e r16) {
        /*
            r13 = this;
            r10 = r13
            r11 = r15
            r12 = r16
            int r0 = r12.f25209h
            r1 = 0
            if (r0 == 0) goto L9b
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
            int r0 = r12.f25210i
            if (r0 == 0) goto L9a
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
            float r5 = r12.f25211j
            h4.c r6 = r12.f25205d
            s3.a r7 = r12.f25208g
            java.util.List r8 = r12.f25212k
            s3.a r9 = r12.f25213l
            r0 = r13
            r1 = r14
            r2 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r.e r0 = new r.e
            r0.<init>()
            r10.f23067t = r0
            r.e r0 = new r.e
            r0.<init>()
            r10.u = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r10.f23068v = r0
            java.lang.String r0 = r12.a
            r10.f23065r = r0
            int r0 = r12.f25203b
            r10.f23069w = r0
            boolean r0 = r12.f25214m
            r10.f23066s = r0
            r0 = r14
            m3.j r0 = r0.f21592b
            float r0 = r0.b()
            r1 = 1107296256(0x42000000, float:32.0)
            float r0 = r0 / r1
            int r0 = (int) r0
            r10.f23070x = r0
            h4.c r0 = r12.f25204c
            p3.d r0 = r0.a()
            r10.f23071y = r0
            r0.a(r13)
            r15.f(r0)
            h4.c r0 = r12.f25206e
            p3.d r0 = r0.a()
            r10.f23072z = r0
            r0.a(r13)
            r15.f(r0)
            h4.c r0 = r12.f25207f
            p3.d r0 = r0.a()
            r10.A = r0
            r0.a(r13)
            r15.f(r0)
            return
        L9a:
            throw r1
        L9b:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o3.j.<init>(m3.x, u3.b, t3.e):void");
    }

    @Override // o3.b, r3.f
    public final void d(h.c cVar, Object obj) {
        super.d(cVar, obj);
        if (obj == a0.L) {
            p3.t tVar = this.B;
            u3.b bVar = this.f23005f;
            if (tVar != null) {
                bVar.n(tVar);
            }
            if (cVar == null) {
                this.B = null;
                return;
            }
            p3.t tVar2 = new p3.t(cVar, null);
            this.B = tVar2;
            tVar2.a(this);
            bVar.f(this.B);
        }
    }

    public final int[] f(int[] iArr) {
        p3.t tVar = this.B;
        if (tVar != null) {
            Integer[] numArr = (Integer[]) tVar.f();
            int i10 = 0;
            if (iArr.length == numArr.length) {
                while (i10 < iArr.length) {
                    iArr[i10] = numArr[i10].intValue();
                    i10++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i10 < numArr.length) {
                    iArr[i10] = numArr[i10].intValue();
                    i10++;
                }
            }
        }
        return iArr;
    }

    @Override // o3.b, o3.f
    public final void g(Canvas canvas, Matrix matrix, int i10) {
        Shader shader;
        if (this.f23066s) {
            return;
        }
        e(this.f23068v, matrix, false);
        int i11 = this.f23069w;
        p3.d dVar = this.f23071y;
        p3.d dVar2 = this.A;
        p3.d dVar3 = this.f23072z;
        if (i11 == 1) {
            long h10 = h();
            r.e eVar = this.f23067t;
            shader = (LinearGradient) eVar.d(h10, null);
            if (shader == null) {
                PointF pointF = (PointF) dVar3.f();
                PointF pointF2 = (PointF) dVar2.f();
                t3.c cVar = (t3.c) dVar.f();
                shader = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, f(cVar.f25195b), cVar.a, Shader.TileMode.CLAMP);
                eVar.f(h10, shader);
            }
        } else {
            long h11 = h();
            r.e eVar2 = this.u;
            shader = (RadialGradient) eVar2.d(h11, null);
            if (shader == null) {
                PointF pointF3 = (PointF) dVar3.f();
                PointF pointF4 = (PointF) dVar2.f();
                t3.c cVar2 = (t3.c) dVar.f();
                int[] f10 = f(cVar2.f25195b);
                float[] fArr = cVar2.a;
                shader = new RadialGradient(pointF3.x, pointF3.y, (float) Math.hypot(pointF4.x - r10, pointF4.y - r11), f10, fArr, Shader.TileMode.CLAMP);
                eVar2.f(h11, shader);
            }
        }
        shader.setLocalMatrix(matrix);
        this.f23008i.setShader(shader);
        super.g(canvas, matrix, i10);
    }

    @Override // o3.d
    public final String getName() {
        return this.f23065r;
    }

    public final int h() {
        int i10;
        float f10 = this.f23072z.f23362d;
        int i11 = this.f23070x;
        int round = Math.round(f10 * i11);
        int round2 = Math.round(this.A.f23362d * i11);
        int round3 = Math.round(this.f23071y.f23362d * i11);
        if (round != 0) {
            i10 = 527 * round;
        } else {
            i10 = 17;
        }
        if (round2 != 0) {
            i10 = i10 * 31 * round2;
        }
        if (round3 != 0) {
            return i10 * 31 * round3;
        }
        return i10;
    }
}
