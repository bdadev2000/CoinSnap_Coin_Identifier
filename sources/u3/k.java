package u3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import m3.a0;
import m3.x;
import p3.q;
import p3.r;
import p3.t;

/* loaded from: classes.dex */
public final class k extends b {
    public final StringBuilder C;
    public final RectF D;
    public final Matrix E;
    public final i F;
    public final i G;
    public final HashMap H;
    public final r.e I;
    public final ArrayList J;
    public final r K;
    public final x L;
    public final m3.j M;
    public final p3.d N;
    public t O;
    public final p3.d P;
    public t Q;
    public final p3.h R;
    public t S;
    public final p3.h T;
    public t U;
    public t V;
    public t W;

    public k(x xVar, e eVar) {
        super(xVar, eVar);
        s3.a aVar;
        s3.a aVar2;
        h4.c cVar;
        h4.c cVar2;
        this.C = new StringBuilder(2);
        this.D = new RectF();
        this.E = new Matrix();
        this.F = new i(0);
        this.G = new i(1);
        this.H = new HashMap();
        this.I = new r.e();
        this.J = new ArrayList();
        this.L = xVar;
        this.M = eVar.f25503b;
        r rVar = new r((List) eVar.f25518q.f21106c);
        this.K = rVar;
        rVar.a(this);
        f(rVar);
        ic.t tVar = eVar.f25519r;
        if (tVar != null && (cVar2 = (h4.c) tVar.a) != null) {
            p3.d a = cVar2.a();
            this.N = a;
            a.a(this);
            f(a);
        }
        if (tVar != null && (cVar = (h4.c) tVar.f19574b) != null) {
            p3.d a10 = cVar.a();
            this.P = a10;
            a10.a(this);
            f(a10);
        }
        if (tVar != null && (aVar2 = (s3.a) tVar.f19575c) != null) {
            p3.d a11 = aVar2.a();
            this.R = (p3.h) a11;
            a11.a(this);
            f(a11);
        }
        if (tVar != null && (aVar = (s3.a) tVar.f19576d) != null) {
            p3.d a12 = aVar.a();
            this.T = (p3.h) a12;
            a12.a(this);
            f(a12);
        }
    }

    public static void r(String str, i iVar, Canvas canvas) {
        if (iVar.getColor() == 0) {
            return;
        }
        if (iVar.getStyle() == Paint.Style.STROKE && iVar.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, (Paint) iVar);
    }

    public static void s(Path path, i iVar, Canvas canvas) {
        if (iVar.getColor() == 0) {
            return;
        }
        if (iVar.getStyle() == Paint.Style.STROKE && iVar.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, iVar);
    }

    public static List u(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
    }

    @Override // u3.b, r3.f
    public final void d(h.c cVar, Object obj) {
        super.d(cVar, obj);
        if (obj == a0.a) {
            t tVar = this.O;
            if (tVar != null) {
                n(tVar);
            }
            if (cVar == null) {
                this.O = null;
                return;
            }
            t tVar2 = new t(cVar, null);
            this.O = tVar2;
            tVar2.a(this);
            f(this.O);
            return;
        }
        if (obj == a0.f21497b) {
            t tVar3 = this.Q;
            if (tVar3 != null) {
                n(tVar3);
            }
            if (cVar == null) {
                this.Q = null;
                return;
            }
            t tVar4 = new t(cVar, null);
            this.Q = tVar4;
            tVar4.a(this);
            f(this.Q);
            return;
        }
        if (obj == a0.f21514s) {
            t tVar5 = this.S;
            if (tVar5 != null) {
                n(tVar5);
            }
            if (cVar == null) {
                this.S = null;
                return;
            }
            t tVar6 = new t(cVar, null);
            this.S = tVar6;
            tVar6.a(this);
            f(this.S);
            return;
        }
        if (obj == a0.f21515t) {
            t tVar7 = this.U;
            if (tVar7 != null) {
                n(tVar7);
            }
            if (cVar == null) {
                this.U = null;
                return;
            }
            t tVar8 = new t(cVar, null);
            this.U = tVar8;
            tVar8.a(this);
            f(this.U);
            return;
        }
        if (obj == a0.F) {
            t tVar9 = this.V;
            if (tVar9 != null) {
                n(tVar9);
            }
            if (cVar == null) {
                this.V = null;
                return;
            }
            t tVar10 = new t(cVar, null);
            this.V = tVar10;
            tVar10.a(this);
            f(this.V);
            return;
        }
        if (obj == a0.M) {
            t tVar11 = this.W;
            if (tVar11 != null) {
                n(tVar11);
            }
            if (cVar == null) {
                this.W = null;
                return;
            }
            t tVar12 = new t(cVar, null);
            this.W = tVar12;
            tVar12.a(this);
            f(this.W);
            return;
        }
        if (obj == a0.O) {
            r rVar = this.K;
            rVar.getClass();
            rVar.k(new q(new z3.b(), cVar, new r3.b()));
        }
    }

    @Override // u3.b, o3.f
    public final void e(RectF rectF, Matrix matrix, boolean z10) {
        super.e(rectF, matrix, z10);
        m3.j jVar = this.M;
        rectF.set(0.0f, 0.0f, jVar.f21560k.width(), jVar.f21560k.height());
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03dc  */
    @Override // u3.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(android.graphics.Canvas r27, android.graphics.Matrix r28, int r29) {
        /*
            Method dump skipped, instructions count: 1311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.k.j(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    public final j t(int i10) {
        ArrayList arrayList = this.J;
        for (int size = arrayList.size(); size < i10; size++) {
            arrayList.add(new j());
        }
        return (j) arrayList.get(i10 - 1);
    }

    public final boolean v(Canvas canvas, r3.b bVar, int i10, float f10) {
        float f11;
        float f12;
        PointF pointF = bVar.f23981l;
        PointF pointF2 = bVar.f23982m;
        float c10 = y3.h.c();
        float f13 = 0.0f;
        if (pointF == null) {
            f11 = 0.0f;
        } else {
            f11 = (bVar.f23975f * c10) + pointF.y;
        }
        float f14 = (i10 * bVar.f23975f * c10) + f11;
        if (this.L.f21610v && pointF2 != null && pointF != null && f14 >= pointF.y + pointF2.y + bVar.f23972c) {
            return false;
        }
        if (pointF == null) {
            f12 = 0.0f;
        } else {
            f12 = pointF.x;
        }
        if (pointF2 != null) {
            f13 = pointF2.x;
        }
        int b3 = t.h.b(bVar.f23973d);
        if (b3 != 0) {
            if (b3 != 1) {
                if (b3 == 2) {
                    canvas.translate(((f13 / 2.0f) + f12) - (f10 / 2.0f), f14);
                }
            } else {
                canvas.translate((f12 + f13) - f10, f14);
            }
        } else {
            canvas.translate(f12, f14);
        }
        return true;
    }

    public final List w(String str, float f10, r3.c cVar, float f11, float f12, boolean z10) {
        float measureText;
        int i10 = 0;
        int i11 = 0;
        boolean z11 = false;
        int i12 = 0;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        for (int i13 = 0; i13 < str.length(); i13++) {
            char charAt = str.charAt(i13);
            if (z10) {
                r3.d dVar = (r3.d) this.M.f21557h.c(cVar.f23984c.hashCode() + vd.e.c(cVar.a, charAt * 31, 31), null);
                if (dVar != null) {
                    measureText = (y3.h.c() * ((float) dVar.f23987c) * f11) + f12;
                }
            } else {
                measureText = this.F.measureText(str.substring(i13, i13 + 1)) + f12;
            }
            if (charAt == ' ') {
                z11 = true;
                f15 = measureText;
            } else if (z11) {
                z11 = false;
                i12 = i13;
                f14 = measureText;
            } else {
                f14 += measureText;
            }
            f13 += measureText;
            if (f10 > 0.0f && f13 >= f10 && charAt != ' ') {
                i10++;
                j t5 = t(i10);
                if (i12 == i11) {
                    t5.a = str.substring(i11, i13).trim();
                    t5.f25526b = (f13 - measureText) - ((r8.length() - r6.length()) * f15);
                    i11 = i13;
                    i12 = i11;
                    f13 = measureText;
                    f14 = f13;
                } else {
                    t5.a = str.substring(i11, i12 - 1).trim();
                    t5.f25526b = ((f13 - f14) - ((r6.length() - r13.length()) * f15)) - f15;
                    i11 = i12;
                    f13 = f14;
                }
            }
        }
        if (f13 > 0.0f) {
            i10++;
            j t10 = t(i10);
            t10.a = str.substring(i11);
            t10.f25526b = f13;
        }
        return this.J.subList(0, i10);
    }
}
