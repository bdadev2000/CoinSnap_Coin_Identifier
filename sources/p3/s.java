package p3;

import android.graphics.Matrix;
import android.graphics.PointF;
import java.util.Collections;
import m3.a0;

/* loaded from: classes.dex */
public final class s {
    public final Matrix a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    public final Matrix f23398b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f23399c;

    /* renamed from: d, reason: collision with root package name */
    public final Matrix f23400d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f23401e;

    /* renamed from: f, reason: collision with root package name */
    public d f23402f;

    /* renamed from: g, reason: collision with root package name */
    public d f23403g;

    /* renamed from: h, reason: collision with root package name */
    public d f23404h;

    /* renamed from: i, reason: collision with root package name */
    public d f23405i;

    /* renamed from: j, reason: collision with root package name */
    public d f23406j;

    /* renamed from: k, reason: collision with root package name */
    public h f23407k;

    /* renamed from: l, reason: collision with root package name */
    public h f23408l;

    /* renamed from: m, reason: collision with root package name */
    public d f23409m;

    /* renamed from: n, reason: collision with root package name */
    public d f23410n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f23411o;

    public s(s3.c cVar) {
        d a;
        d a10;
        d a11;
        d a12;
        h hVar;
        h hVar2;
        androidx.viewpager2.adapter.c cVar2 = cVar.a;
        if (cVar2 == null) {
            a = null;
        } else {
            a = cVar2.a();
        }
        this.f23402f = a;
        s3.d dVar = cVar.f24175b;
        if (dVar == null) {
            a10 = null;
        } else {
            a10 = dVar.a();
        }
        this.f23403g = a10;
        h4.c cVar3 = cVar.f24176c;
        if (cVar3 == null) {
            a11 = null;
        } else {
            a11 = cVar3.a();
        }
        this.f23404h = a11;
        s3.a aVar = cVar.f24177d;
        if (aVar == null) {
            a12 = null;
        } else {
            a12 = aVar.a();
        }
        this.f23405i = a12;
        s3.a aVar2 = cVar.f24179f;
        if (aVar2 == null) {
            hVar = null;
        } else {
            hVar = (h) aVar2.a();
        }
        this.f23407k = hVar;
        this.f23411o = cVar.f24183j;
        if (hVar != null) {
            this.f23398b = new Matrix();
            this.f23399c = new Matrix();
            this.f23400d = new Matrix();
            this.f23401e = new float[9];
        } else {
            this.f23398b = null;
            this.f23399c = null;
            this.f23400d = null;
            this.f23401e = null;
        }
        s3.a aVar3 = cVar.f24180g;
        if (aVar3 == null) {
            hVar2 = null;
        } else {
            hVar2 = (h) aVar3.a();
        }
        this.f23408l = hVar2;
        h4.c cVar4 = cVar.f24178e;
        if (cVar4 != null) {
            this.f23406j = cVar4.a();
        }
        s3.a aVar4 = cVar.f24181h;
        if (aVar4 != null) {
            this.f23409m = aVar4.a();
        } else {
            this.f23409m = null;
        }
        s3.a aVar5 = cVar.f24182i;
        if (aVar5 != null) {
            this.f23410n = aVar5.a();
        } else {
            this.f23410n = null;
        }
    }

    public final void a(u3.b bVar) {
        bVar.f(this.f23406j);
        bVar.f(this.f23409m);
        bVar.f(this.f23410n);
        bVar.f(this.f23402f);
        bVar.f(this.f23403g);
        bVar.f(this.f23404h);
        bVar.f(this.f23405i);
        bVar.f(this.f23407k);
        bVar.f(this.f23408l);
    }

    public final void b(a aVar) {
        d dVar = this.f23406j;
        if (dVar != null) {
            dVar.a(aVar);
        }
        d dVar2 = this.f23409m;
        if (dVar2 != null) {
            dVar2.a(aVar);
        }
        d dVar3 = this.f23410n;
        if (dVar3 != null) {
            dVar3.a(aVar);
        }
        d dVar4 = this.f23402f;
        if (dVar4 != null) {
            dVar4.a(aVar);
        }
        d dVar5 = this.f23403g;
        if (dVar5 != null) {
            dVar5.a(aVar);
        }
        d dVar6 = this.f23404h;
        if (dVar6 != null) {
            dVar6.a(aVar);
        }
        d dVar7 = this.f23405i;
        if (dVar7 != null) {
            dVar7.a(aVar);
        }
        h hVar = this.f23407k;
        if (hVar != null) {
            hVar.a(aVar);
        }
        h hVar2 = this.f23408l;
        if (hVar2 != null) {
            hVar2.a(aVar);
        }
    }

    public final boolean c(h.c cVar, Object obj) {
        if (obj == a0.f21501f) {
            d dVar = this.f23402f;
            if (dVar == null) {
                this.f23402f = new t(cVar, new PointF());
                return true;
            }
            dVar.k(cVar);
            return true;
        }
        if (obj == a0.f21502g) {
            d dVar2 = this.f23403g;
            if (dVar2 == null) {
                this.f23403g = new t(cVar, new PointF());
                return true;
            }
            dVar2.k(cVar);
            return true;
        }
        if (obj == a0.f21503h) {
            d dVar3 = this.f23403g;
            if (dVar3 instanceof p) {
                p pVar = (p) dVar3;
                h.c cVar2 = pVar.f23393m;
                if (cVar2 != null) {
                    cVar2.f18524d = null;
                }
                pVar.f23393m = cVar;
                if (cVar != null) {
                    cVar.f18524d = pVar;
                    return true;
                }
                return true;
            }
        }
        if (obj == a0.f21504i) {
            d dVar4 = this.f23403g;
            if (dVar4 instanceof p) {
                p pVar2 = (p) dVar4;
                h.c cVar3 = pVar2.f23394n;
                if (cVar3 != null) {
                    cVar3.f18524d = null;
                }
                pVar2.f23394n = cVar;
                if (cVar != null) {
                    cVar.f18524d = pVar2;
                    return true;
                }
                return true;
            }
        }
        if (obj == a0.f21510o) {
            d dVar5 = this.f23404h;
            if (dVar5 == null) {
                this.f23404h = new t(cVar, new z3.c());
                return true;
            }
            dVar5.k(cVar);
            return true;
        }
        if (obj == a0.f21511p) {
            d dVar6 = this.f23405i;
            if (dVar6 == null) {
                this.f23405i = new t(cVar, Float.valueOf(0.0f));
                return true;
            }
            dVar6.k(cVar);
            return true;
        }
        if (obj == a0.f21498c) {
            d dVar7 = this.f23406j;
            if (dVar7 == null) {
                this.f23406j = new t(cVar, 100);
                return true;
            }
            dVar7.k(cVar);
            return true;
        }
        if (obj == a0.C) {
            d dVar8 = this.f23409m;
            if (dVar8 == null) {
                this.f23409m = new t(cVar, Float.valueOf(100.0f));
                return true;
            }
            dVar8.k(cVar);
            return true;
        }
        if (obj == a0.D) {
            d dVar9 = this.f23410n;
            if (dVar9 == null) {
                this.f23410n = new t(cVar, Float.valueOf(100.0f));
                return true;
            }
            dVar9.k(cVar);
            return true;
        }
        if (obj == a0.f21512q) {
            if (this.f23407k == null) {
                this.f23407k = new h(Collections.singletonList(new z3.a(Float.valueOf(0.0f))));
            }
            this.f23407k.k(cVar);
            return true;
        }
        if (obj == a0.f21513r) {
            if (this.f23408l == null) {
                this.f23408l = new h(Collections.singletonList(new z3.a(Float.valueOf(0.0f))));
            }
            this.f23408l.k(cVar);
            return true;
        }
        return false;
    }

    public final Matrix d() {
        float l10;
        PointF pointF;
        z3.c cVar;
        float cos;
        float sin;
        float[] fArr;
        PointF pointF2;
        Matrix matrix = this.a;
        matrix.reset();
        d dVar = this.f23403g;
        if (dVar != null && (pointF2 = (PointF) dVar.f()) != null) {
            float f10 = pointF2.x;
            if (f10 != 0.0f || pointF2.y != 0.0f) {
                matrix.preTranslate(f10, pointF2.y);
            }
        }
        if (this.f23411o) {
            if (dVar != null) {
                float f11 = dVar.f23362d;
                PointF pointF3 = (PointF) dVar.f();
                float f12 = pointF3.x;
                float f13 = pointF3.y;
                dVar.j(1.0E-4f + f11);
                PointF pointF4 = (PointF) dVar.f();
                dVar.j(f11);
                matrix.preRotate((float) Math.toDegrees(Math.atan2(pointF4.y - f13, pointF4.x - f12)));
            }
        } else {
            d dVar2 = this.f23405i;
            if (dVar2 != null) {
                if (dVar2 instanceof t) {
                    l10 = ((Float) dVar2.f()).floatValue();
                } else {
                    l10 = ((h) dVar2).l();
                }
                if (l10 != 0.0f) {
                    matrix.preRotate(l10);
                }
            }
        }
        if (this.f23407k != null) {
            if (this.f23408l == null) {
                cos = 0.0f;
            } else {
                cos = (float) Math.cos(Math.toRadians((-r5.l()) + 90.0f));
            }
            if (this.f23408l == null) {
                sin = 1.0f;
            } else {
                sin = (float) Math.sin(Math.toRadians((-r7.l()) + 90.0f));
            }
            float tan = (float) Math.tan(Math.toRadians(r2.l()));
            int i10 = 0;
            while (true) {
                fArr = this.f23401e;
                if (i10 >= 9) {
                    break;
                }
                fArr[i10] = 0.0f;
                i10++;
            }
            fArr[0] = cos;
            fArr[1] = sin;
            float f14 = -sin;
            fArr[3] = f14;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            Matrix matrix2 = this.f23398b;
            matrix2.setValues(fArr);
            for (int i11 = 0; i11 < 9; i11++) {
                fArr[i11] = 0.0f;
            }
            fArr[0] = 1.0f;
            fArr[3] = tan;
            fArr[4] = 1.0f;
            fArr[8] = 1.0f;
            Matrix matrix3 = this.f23399c;
            matrix3.setValues(fArr);
            for (int i12 = 0; i12 < 9; i12++) {
                fArr[i12] = 0.0f;
            }
            fArr[0] = cos;
            fArr[1] = f14;
            fArr[3] = sin;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            Matrix matrix4 = this.f23400d;
            matrix4.setValues(fArr);
            matrix3.preConcat(matrix2);
            matrix4.preConcat(matrix3);
            matrix.preConcat(matrix4);
        }
        d dVar3 = this.f23404h;
        if (dVar3 != null && (cVar = (z3.c) dVar3.f()) != null) {
            float f15 = cVar.a;
            if (f15 != 1.0f || cVar.f28493b != 1.0f) {
                matrix.preScale(f15, cVar.f28493b);
            }
        }
        d dVar4 = this.f23402f;
        if (dVar4 != null && (pointF = (PointF) dVar4.f()) != null) {
            float f16 = pointF.x;
            if (f16 != 0.0f || pointF.y != 0.0f) {
                matrix.preTranslate(-f16, -pointF.y);
            }
        }
        return matrix;
    }

    public final Matrix e(float f10) {
        PointF pointF;
        z3.c cVar;
        float f11;
        d dVar = this.f23403g;
        PointF pointF2 = null;
        if (dVar == null) {
            pointF = null;
        } else {
            pointF = (PointF) dVar.f();
        }
        d dVar2 = this.f23404h;
        if (dVar2 == null) {
            cVar = null;
        } else {
            cVar = (z3.c) dVar2.f();
        }
        Matrix matrix = this.a;
        matrix.reset();
        if (pointF != null) {
            matrix.preTranslate(pointF.x * f10, pointF.y * f10);
        }
        if (cVar != null) {
            double d10 = f10;
            matrix.preScale((float) Math.pow(cVar.a, d10), (float) Math.pow(cVar.f28493b, d10));
        }
        d dVar3 = this.f23405i;
        if (dVar3 != null) {
            float floatValue = ((Float) dVar3.f()).floatValue();
            d dVar4 = this.f23402f;
            if (dVar4 != null) {
                pointF2 = (PointF) dVar4.f();
            }
            float f12 = floatValue * f10;
            float f13 = 0.0f;
            if (pointF2 == null) {
                f11 = 0.0f;
            } else {
                f11 = pointF2.x;
            }
            if (pointF2 != null) {
                f13 = pointF2.y;
            }
            matrix.preRotate(f12, f11, f13);
        }
        return matrix;
    }
}
