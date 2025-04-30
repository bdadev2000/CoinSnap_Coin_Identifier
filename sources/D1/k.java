package D1;

import U4.y;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import v1.v;
import y1.p;
import y1.r;
import z.AbstractC2965e;

/* loaded from: classes.dex */
public final class k extends b {

    /* renamed from: C, reason: collision with root package name */
    public final StringBuilder f710C;

    /* renamed from: D, reason: collision with root package name */
    public final RectF f711D;

    /* renamed from: E, reason: collision with root package name */
    public final Matrix f712E;

    /* renamed from: F, reason: collision with root package name */
    public final i f713F;

    /* renamed from: G, reason: collision with root package name */
    public final i f714G;

    /* renamed from: H, reason: collision with root package name */
    public final HashMap f715H;

    /* renamed from: I, reason: collision with root package name */
    public final x.f f716I;

    /* renamed from: J, reason: collision with root package name */
    public final ArrayList f717J;

    /* renamed from: K, reason: collision with root package name */
    public final y1.f f718K;

    /* renamed from: L, reason: collision with root package name */
    public final v f719L;

    /* renamed from: M, reason: collision with root package name */
    public final v1.i f720M;

    /* renamed from: N, reason: collision with root package name */
    public final y1.f f721N;
    public r O;

    /* renamed from: P, reason: collision with root package name */
    public final y1.f f722P;

    /* renamed from: Q, reason: collision with root package name */
    public r f723Q;

    /* renamed from: R, reason: collision with root package name */
    public final y1.i f724R;

    /* renamed from: S, reason: collision with root package name */
    public r f725S;

    /* renamed from: T, reason: collision with root package name */
    public final y1.i f726T;

    /* renamed from: U, reason: collision with root package name */
    public r f727U;

    /* renamed from: V, reason: collision with root package name */
    public r f728V;

    /* renamed from: W, reason: collision with root package name */
    public r f729W;

    public k(v vVar, e eVar) {
        super(vVar, eVar);
        B1.b bVar;
        B1.b bVar2;
        B1.a aVar;
        B1.a aVar2;
        this.f710C = new StringBuilder(2);
        this.f711D = new RectF();
        this.f712E = new Matrix();
        i iVar = new i(1, 0);
        iVar.setStyle(Paint.Style.FILL);
        this.f713F = iVar;
        i iVar2 = new i(1, 1);
        iVar2.setStyle(Paint.Style.STROKE);
        this.f714G = iVar2;
        this.f715H = new HashMap();
        this.f716I = new x.f();
        this.f717J = new ArrayList();
        this.f719L = vVar;
        this.f720M = eVar.b;
        y1.f fVar = new y1.f((List) eVar.f690q.f273c, 2);
        this.f718K = fVar;
        fVar.a(this);
        d(fVar);
        y yVar = eVar.f691r;
        if (yVar != null && (aVar2 = (B1.a) yVar.f3334a) != null) {
            y1.e g9 = aVar2.g();
            this.f721N = (y1.f) g9;
            g9.a(this);
            d(g9);
        }
        if (yVar != null && (aVar = (B1.a) yVar.b) != null) {
            y1.e g10 = aVar.g();
            this.f722P = (y1.f) g10;
            g10.a(this);
            d(g10);
        }
        if (yVar != null && (bVar2 = (B1.b) yVar.f3335c) != null) {
            y1.e g11 = bVar2.g();
            this.f724R = (y1.i) g11;
            g11.a(this);
            d(g11);
        }
        if (yVar != null && (bVar = (B1.b) yVar.f3336d) != null) {
            y1.e g12 = bVar.g();
            this.f726T = (y1.i) g12;
            g12.a(this);
            d(g12);
        }
    }

    public static void t(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    public static void u(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    @Override // D1.b, x1.e
    public final void c(RectF rectF, Matrix matrix, boolean z8) {
        super.c(rectF, matrix, z8);
        v1.i iVar = this.f720M;
        rectF.set(0.0f, 0.0f, iVar.f23493k.width(), iVar.f23493k.height());
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, I1.b] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, A1.b] */
    @Override // D1.b, A1.f
    public final void g(E1.d dVar, Object obj) {
        super.g(dVar, obj);
        PointF pointF = v1.y.f23578a;
        if (obj == 1) {
            r rVar = this.O;
            if (rVar != null) {
                p(rVar);
            }
            if (dVar == null) {
                this.O = null;
                return;
            }
            r rVar2 = new r(dVar, null);
            this.O = rVar2;
            rVar2.a(this);
            d(this.O);
            return;
        }
        if (obj == 2) {
            r rVar3 = this.f723Q;
            if (rVar3 != null) {
                p(rVar3);
            }
            if (dVar == null) {
                this.f723Q = null;
                return;
            }
            r rVar4 = new r(dVar, null);
            this.f723Q = rVar4;
            rVar4.a(this);
            d(this.f723Q);
            return;
        }
        if (obj == v1.y.f23588n) {
            r rVar5 = this.f725S;
            if (rVar5 != null) {
                p(rVar5);
            }
            if (dVar == null) {
                this.f725S = null;
                return;
            }
            r rVar6 = new r(dVar, null);
            this.f725S = rVar6;
            rVar6.a(this);
            d(this.f725S);
            return;
        }
        if (obj == v1.y.f23589o) {
            r rVar7 = this.f727U;
            if (rVar7 != null) {
                p(rVar7);
            }
            if (dVar == null) {
                this.f727U = null;
                return;
            }
            r rVar8 = new r(dVar, null);
            this.f727U = rVar8;
            rVar8.a(this);
            d(this.f727U);
            return;
        }
        if (obj == v1.y.f23567A) {
            r rVar9 = this.f728V;
            if (rVar9 != null) {
                p(rVar9);
            }
            if (dVar == null) {
                this.f728V = null;
                return;
            }
            r rVar10 = new r(dVar, null);
            this.f728V = rVar10;
            rVar10.a(this);
            d(this.f728V);
            return;
        }
        if (obj == v1.y.f23574H) {
            r rVar11 = this.f729W;
            if (rVar11 != null) {
                p(rVar11);
            }
            if (dVar == null) {
                this.f729W = null;
                return;
            }
            r rVar12 = new r(dVar, null);
            this.f729W = rVar12;
            rVar12.a(this);
            d(this.f729W);
            return;
        }
        if (obj == v1.y.f23576J) {
            y1.f fVar = this.f718K;
            fVar.getClass();
            fVar.j(new p(new Object(), dVar, new Object()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03fc  */
    @Override // D1.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(android.graphics.Canvas r28, android.graphics.Matrix r29, int r30) {
        /*
            Method dump skipped, instructions count: 1327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: D1.k.k(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [D1.j, java.lang.Object] */
    public final j v(int i9) {
        ArrayList arrayList = this.f717J;
        for (int size = arrayList.size(); size < i9; size++) {
            ?? obj = new Object();
            obj.f709a = "";
            obj.b = 0.0f;
            arrayList.add(obj);
        }
        return (j) arrayList.get(i9 - 1);
    }

    public final boolean w(Canvas canvas, A1.b bVar, int i9, float f9) {
        float f10;
        float f11;
        PointF pointF = bVar.l;
        PointF pointF2 = bVar.m;
        float c9 = H1.i.c();
        float f12 = 0.0f;
        if (pointF == null) {
            f10 = 0.0f;
        } else {
            f10 = (bVar.f8f * c9) + pointF.y;
        }
        float f13 = (i9 * bVar.f8f * c9) + f10;
        if (this.f719L.f23557v && pointF2 != null && pointF != null && f13 >= pointF.y + pointF2.y + bVar.f5c) {
            return false;
        }
        if (pointF == null) {
            f11 = 0.0f;
        } else {
            f11 = pointF.x;
        }
        if (pointF2 != null) {
            f12 = pointF2.x;
        }
        int d2 = AbstractC2965e.d(bVar.f6d);
        if (d2 != 0) {
            if (d2 != 1) {
                if (d2 == 2) {
                    canvas.translate(((f12 / 2.0f) + f11) - (f9 / 2.0f), f13);
                }
            } else {
                canvas.translate((f11 + f12) - f9, f13);
            }
        } else {
            canvas.translate(f11, f13);
        }
        return true;
    }

    public final List x(String str, float f9, A1.c cVar, float f10, float f11, boolean z8) {
        float measureText;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        int i9 = 0;
        int i10 = 0;
        boolean z9 = false;
        int i11 = 0;
        for (int i12 = 0; i12 < str.length(); i12++) {
            char charAt = str.charAt(i12);
            if (z8) {
                A1.d dVar = (A1.d) this.f720M.f23490h.c(A1.d.a(charAt, cVar.f14a, cVar.f15c), null);
                if (dVar != null) {
                    measureText = (H1.i.c() * ((float) dVar.f18c) * f10) + f11;
                }
            } else {
                measureText = this.f713F.measureText(str.substring(i12, i12 + 1)) + f11;
            }
            if (charAt == ' ') {
                z9 = true;
                f14 = measureText;
            } else if (z9) {
                i11 = i12;
                f13 = measureText;
                z9 = false;
            } else {
                f13 += measureText;
            }
            f12 += measureText;
            if (f9 > 0.0f && f12 >= f9 && charAt != ' ') {
                i9++;
                j v6 = v(i9);
                if (i11 == i10) {
                    v6.f709a = str.substring(i10, i12).trim();
                    v6.b = (f12 - measureText) - ((r10.length() - r8.length()) * f14);
                    i10 = i12;
                    i11 = i10;
                    f12 = measureText;
                    f13 = f12;
                } else {
                    v6.f709a = str.substring(i10, i11 - 1).trim();
                    v6.b = ((f12 - f13) - ((r8.length() - r13.length()) * f14)) - f14;
                    f12 = f13;
                    i10 = i11;
                }
            }
        }
        if (f12 > 0.0f) {
            i9++;
            j v9 = v(i9);
            v9.f709a = str.substring(i10);
            v9.b = f12;
        }
        return this.f717J.subList(0, i9);
    }
}
