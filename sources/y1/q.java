package y1;

import android.graphics.Matrix;
import android.graphics.PointF;
import java.util.Collections;
import v1.y;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f24321a = new Matrix();
    public final Matrix b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f24322c;

    /* renamed from: d, reason: collision with root package name */
    public final Matrix f24323d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f24324e;

    /* renamed from: f, reason: collision with root package name */
    public e f24325f;

    /* renamed from: g, reason: collision with root package name */
    public e f24326g;

    /* renamed from: h, reason: collision with root package name */
    public e f24327h;

    /* renamed from: i, reason: collision with root package name */
    public e f24328i;

    /* renamed from: j, reason: collision with root package name */
    public e f24329j;

    /* renamed from: k, reason: collision with root package name */
    public i f24330k;
    public i l;
    public e m;

    /* renamed from: n, reason: collision with root package name */
    public e f24331n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f24332o;

    public q(B1.d dVar) {
        e g9;
        e g10;
        e g11;
        e g12;
        i iVar;
        i iVar2;
        E1.c cVar = dVar.f264a;
        if (cVar == null) {
            g9 = null;
        } else {
            g9 = cVar.g();
        }
        this.f24325f = g9;
        B1.e eVar = dVar.b;
        if (eVar == null) {
            g10 = null;
        } else {
            g10 = eVar.g();
        }
        this.f24326g = g10;
        B1.a aVar = dVar.f265c;
        if (aVar == null) {
            g11 = null;
        } else {
            g11 = aVar.g();
        }
        this.f24327h = g11;
        B1.b bVar = dVar.f266d;
        if (bVar == null) {
            g12 = null;
        } else {
            g12 = bVar.g();
        }
        this.f24328i = g12;
        B1.b bVar2 = dVar.f268f;
        if (bVar2 == null) {
            iVar = null;
        } else {
            iVar = (i) bVar2.g();
        }
        this.f24330k = iVar;
        this.f24332o = dVar.f272j;
        if (iVar != null) {
            this.b = new Matrix();
            this.f24322c = new Matrix();
            this.f24323d = new Matrix();
            this.f24324e = new float[9];
        } else {
            this.b = null;
            this.f24322c = null;
            this.f24323d = null;
            this.f24324e = null;
        }
        B1.b bVar3 = dVar.f269g;
        if (bVar3 == null) {
            iVar2 = null;
        } else {
            iVar2 = (i) bVar3.g();
        }
        this.l = iVar2;
        B1.a aVar2 = dVar.f267e;
        if (aVar2 != null) {
            this.f24329j = aVar2.g();
        }
        B1.b bVar4 = dVar.f270h;
        if (bVar4 != null) {
            this.m = bVar4.g();
        } else {
            this.m = null;
        }
        B1.b bVar5 = dVar.f271i;
        if (bVar5 != null) {
            this.f24331n = bVar5.g();
        } else {
            this.f24331n = null;
        }
    }

    public final void a(D1.b bVar) {
        bVar.d(this.f24329j);
        bVar.d(this.m);
        bVar.d(this.f24331n);
        bVar.d(this.f24325f);
        bVar.d(this.f24326g);
        bVar.d(this.f24327h);
        bVar.d(this.f24328i);
        bVar.d(this.f24330k);
        bVar.d(this.l);
    }

    public final void b(InterfaceC2942a interfaceC2942a) {
        e eVar = this.f24329j;
        if (eVar != null) {
            eVar.a(interfaceC2942a);
        }
        e eVar2 = this.m;
        if (eVar2 != null) {
            eVar2.a(interfaceC2942a);
        }
        e eVar3 = this.f24331n;
        if (eVar3 != null) {
            eVar3.a(interfaceC2942a);
        }
        e eVar4 = this.f24325f;
        if (eVar4 != null) {
            eVar4.a(interfaceC2942a);
        }
        e eVar5 = this.f24326g;
        if (eVar5 != null) {
            eVar5.a(interfaceC2942a);
        }
        e eVar6 = this.f24327h;
        if (eVar6 != null) {
            eVar6.a(interfaceC2942a);
        }
        e eVar7 = this.f24328i;
        if (eVar7 != null) {
            eVar7.a(interfaceC2942a);
        }
        i iVar = this.f24330k;
        if (iVar != null) {
            iVar.a(interfaceC2942a);
        }
        i iVar2 = this.l;
        if (iVar2 != null) {
            iVar2.a(interfaceC2942a);
        }
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [y1.i, y1.e] */
    /* JADX WARN: Type inference failed for: r5v6, types: [y1.i, y1.e] */
    public final boolean c(E1.d dVar, Object obj) {
        if (obj == y.f23578a) {
            e eVar = this.f24325f;
            if (eVar == null) {
                this.f24325f = new r(dVar, new PointF());
                return true;
            }
            eVar.j(dVar);
            return true;
        }
        if (obj == y.b) {
            e eVar2 = this.f24326g;
            if (eVar2 == null) {
                this.f24326g = new r(dVar, new PointF());
                return true;
            }
            eVar2.j(dVar);
            return true;
        }
        if (obj == y.f23579c) {
            e eVar3 = this.f24326g;
            if (eVar3 instanceof o) {
                o oVar = (o) eVar3;
                E1.d dVar2 = oVar.m;
                oVar.m = dVar;
                return true;
            }
        }
        if (obj == y.f23580d) {
            e eVar4 = this.f24326g;
            if (eVar4 instanceof o) {
                o oVar2 = (o) eVar4;
                E1.d dVar3 = oVar2.f24317n;
                oVar2.f24317n = dVar;
                return true;
            }
        }
        if (obj == y.f23586j) {
            e eVar5 = this.f24327h;
            if (eVar5 == null) {
                this.f24327h = new r(dVar, new I1.c());
                return true;
            }
            eVar5.j(dVar);
            return true;
        }
        if (obj == y.f23587k) {
            e eVar6 = this.f24328i;
            if (eVar6 == null) {
                this.f24328i = new r(dVar, Float.valueOf(0.0f));
                return true;
            }
            eVar6.j(dVar);
            return true;
        }
        if (obj == 3) {
            e eVar7 = this.f24329j;
            if (eVar7 == null) {
                this.f24329j = new r(dVar, 100);
                return true;
            }
            eVar7.j(dVar);
            return true;
        }
        if (obj == y.f23598x) {
            e eVar8 = this.m;
            if (eVar8 == null) {
                this.m = new r(dVar, Float.valueOf(100.0f));
                return true;
            }
            eVar8.j(dVar);
            return true;
        }
        if (obj == y.f23599y) {
            e eVar9 = this.f24331n;
            if (eVar9 == null) {
                this.f24331n = new r(dVar, Float.valueOf(100.0f));
                return true;
            }
            eVar9.j(dVar);
            return true;
        }
        if (obj == y.l) {
            if (this.f24330k == null) {
                this.f24330k = new e(Collections.singletonList(new I1.a(Float.valueOf(0.0f))));
            }
            this.f24330k.j(dVar);
            return true;
        }
        if (obj == y.m) {
            if (this.l == null) {
                this.l = new e(Collections.singletonList(new I1.a(Float.valueOf(0.0f))));
            }
            this.l.j(dVar);
            return true;
        }
        return false;
    }

    public final void d() {
        for (int i9 = 0; i9 < 9; i9++) {
            this.f24324e[i9] = 0.0f;
        }
    }

    public final Matrix e() {
        float k6;
        PointF pointF;
        I1.c cVar;
        float cos;
        float sin;
        PointF pointF2;
        Matrix matrix = this.f24321a;
        matrix.reset();
        e eVar = this.f24326g;
        if (eVar != null && (pointF2 = (PointF) eVar.e()) != null) {
            float f9 = pointF2.x;
            if (f9 != 0.0f || pointF2.y != 0.0f) {
                matrix.preTranslate(f9, pointF2.y);
            }
        }
        if (this.f24332o) {
            if (eVar != null) {
                float f10 = eVar.f24291d;
                PointF pointF3 = (PointF) eVar.e();
                float f11 = pointF3.x;
                float f12 = pointF3.y;
                eVar.i(1.0E-4f + f10);
                PointF pointF4 = (PointF) eVar.e();
                eVar.i(f10);
                matrix.preRotate((float) Math.toDegrees(Math.atan2(pointF4.y - f12, pointF4.x - f11)));
            }
        } else {
            e eVar2 = this.f24328i;
            if (eVar2 != null) {
                if (eVar2 instanceof r) {
                    k6 = ((Float) eVar2.e()).floatValue();
                } else {
                    k6 = ((i) eVar2).k();
                }
                if (k6 != 0.0f) {
                    matrix.preRotate(k6);
                }
            }
        }
        if (this.f24330k != null) {
            if (this.l == null) {
                cos = 0.0f;
            } else {
                cos = (float) Math.cos(Math.toRadians((-r4.k()) + 90.0f));
            }
            if (this.l == null) {
                sin = 1.0f;
            } else {
                sin = (float) Math.sin(Math.toRadians((-r6.k()) + 90.0f));
            }
            float tan = (float) Math.tan(Math.toRadians(r1.k()));
            d();
            float[] fArr = this.f24324e;
            fArr[0] = cos;
            fArr[1] = sin;
            float f13 = -sin;
            fArr[3] = f13;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            Matrix matrix2 = this.b;
            matrix2.setValues(fArr);
            d();
            fArr[0] = 1.0f;
            fArr[3] = tan;
            fArr[4] = 1.0f;
            fArr[8] = 1.0f;
            Matrix matrix3 = this.f24322c;
            matrix3.setValues(fArr);
            d();
            fArr[0] = cos;
            fArr[1] = f13;
            fArr[3] = sin;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            Matrix matrix4 = this.f24323d;
            matrix4.setValues(fArr);
            matrix3.preConcat(matrix2);
            matrix4.preConcat(matrix3);
            matrix.preConcat(matrix4);
        }
        e eVar3 = this.f24327h;
        if (eVar3 != null && (cVar = (I1.c) eVar3.e()) != null) {
            float f14 = cVar.f1427a;
            if (f14 != 1.0f || cVar.b != 1.0f) {
                matrix.preScale(f14, cVar.b);
            }
        }
        e eVar4 = this.f24325f;
        if (eVar4 != null && (pointF = (PointF) eVar4.e()) != null) {
            float f15 = pointF.x;
            if (f15 != 0.0f || pointF.y != 0.0f) {
                matrix.preTranslate(-f15, -pointF.y);
            }
        }
        return matrix;
    }

    public final Matrix f(float f9) {
        PointF pointF;
        I1.c cVar;
        float f10;
        e eVar = this.f24326g;
        PointF pointF2 = null;
        if (eVar == null) {
            pointF = null;
        } else {
            pointF = (PointF) eVar.e();
        }
        e eVar2 = this.f24327h;
        if (eVar2 == null) {
            cVar = null;
        } else {
            cVar = (I1.c) eVar2.e();
        }
        Matrix matrix = this.f24321a;
        matrix.reset();
        if (pointF != null) {
            matrix.preTranslate(pointF.x * f9, pointF.y * f9);
        }
        if (cVar != null) {
            double d2 = f9;
            matrix.preScale((float) Math.pow(cVar.f1427a, d2), (float) Math.pow(cVar.b, d2));
        }
        e eVar3 = this.f24328i;
        if (eVar3 != null) {
            float floatValue = ((Float) eVar3.e()).floatValue();
            e eVar4 = this.f24325f;
            if (eVar4 != null) {
                pointF2 = (PointF) eVar4.e();
            }
            float f11 = floatValue * f9;
            float f12 = 0.0f;
            if (pointF2 == null) {
                f10 = 0.0f;
            } else {
                f10 = pointF2.x;
            }
            if (pointF2 != null) {
                f12 = pointF2.y;
            }
            matrix.preRotate(f11, f10, f12);
        }
        return matrix;
    }
}
