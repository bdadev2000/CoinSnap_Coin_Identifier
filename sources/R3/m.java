package R3;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final u[] f2703a = new u[4];
    public final Matrix[] b = new Matrix[4];

    /* renamed from: c, reason: collision with root package name */
    public final Matrix[] f2704c = new Matrix[4];

    /* renamed from: d, reason: collision with root package name */
    public final PointF f2705d = new PointF();

    /* renamed from: e, reason: collision with root package name */
    public final Path f2706e = new Path();

    /* renamed from: f, reason: collision with root package name */
    public final Path f2707f = new Path();

    /* renamed from: g, reason: collision with root package name */
    public final u f2708g = new u();

    /* renamed from: h, reason: collision with root package name */
    public final float[] f2709h = new float[2];

    /* renamed from: i, reason: collision with root package name */
    public final float[] f2710i = new float[2];

    /* renamed from: j, reason: collision with root package name */
    public final Path f2711j = new Path();

    /* renamed from: k, reason: collision with root package name */
    public final Path f2712k = new Path();
    public final boolean l = true;

    public m() {
        for (int i9 = 0; i9 < 4; i9++) {
            this.f2703a[i9] = new u();
            this.b[i9] = new Matrix();
            this.f2704c[i9] = new Matrix();
        }
    }

    public final void a(k kVar, float f9, RectF rectF, E1.c cVar, Path path) {
        int i9;
        Matrix[] matrixArr;
        float[] fArr;
        Matrix[] matrixArr2;
        u[] uVarArr;
        e eVar;
        c cVar2;
        y8.a aVar;
        int i10;
        m mVar = this;
        path.rewind();
        Path path2 = mVar.f2706e;
        path2.rewind();
        Path path3 = mVar.f2707f;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i11 = 0;
        while (true) {
            i9 = 4;
            matrixArr = mVar.f2704c;
            fArr = mVar.f2709h;
            matrixArr2 = mVar.b;
            uVarArr = mVar.f2703a;
            if (i11 >= 4) {
                break;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        cVar2 = kVar.f2696f;
                    } else {
                        cVar2 = kVar.f2695e;
                    }
                } else {
                    cVar2 = kVar.f2698h;
                }
            } else {
                cVar2 = kVar.f2697g;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        aVar = kVar.b;
                    } else {
                        aVar = kVar.f2692a;
                    }
                } else {
                    aVar = kVar.f2694d;
                }
            } else {
                aVar = kVar.f2693c;
            }
            u uVar = uVarArr[i11];
            aVar.getClass();
            aVar.h(uVar, f9, cVar2.a(rectF));
            int i12 = i11 + 1;
            float f10 = (i12 % 4) * 90;
            matrixArr2[i11].reset();
            PointF pointF = mVar.f2705d;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        i10 = i12;
                        pointF.set(rectF.right, rectF.top);
                    } else {
                        i10 = i12;
                        pointF.set(rectF.left, rectF.top);
                    }
                } else {
                    i10 = i12;
                    pointF.set(rectF.left, rectF.bottom);
                }
            } else {
                i10 = i12;
                pointF.set(rectF.right, rectF.bottom);
            }
            matrixArr2[i11].setTranslate(pointF.x, pointF.y);
            matrixArr2[i11].preRotate(f10);
            u uVar2 = uVarArr[i11];
            fArr[0] = uVar2.f2729c;
            fArr[1] = uVar2.f2730d;
            matrixArr2[i11].mapPoints(fArr);
            matrixArr[i11].reset();
            matrixArr[i11].setTranslate(fArr[0], fArr[1]);
            matrixArr[i11].preRotate(f10);
            i11 = i10;
        }
        int i13 = 0;
        while (i13 < i9) {
            u uVar3 = uVarArr[i13];
            fArr[0] = uVar3.f2728a;
            fArr[1] = uVar3.b;
            matrixArr2[i13].mapPoints(fArr);
            if (i13 == 0) {
                path.moveTo(fArr[0], fArr[1]);
            } else {
                path.lineTo(fArr[0], fArr[1]);
            }
            uVarArr[i13].b(matrixArr2[i13], path);
            if (cVar != null) {
                u uVar4 = uVarArr[i13];
                Matrix matrix = matrixArr2[i13];
                g gVar = (g) cVar.f972c;
                BitSet bitSet = gVar.f2664f;
                uVar4.getClass();
                bitSet.set(i13, false);
                uVar4.a(uVar4.f2732f);
                gVar.f2662c[i13] = new n(new ArrayList(uVar4.f2734h), new Matrix(matrix));
            }
            int i14 = i13 + 1;
            int i15 = i14 % 4;
            u uVar5 = uVarArr[i13];
            fArr[0] = uVar5.f2729c;
            fArr[1] = uVar5.f2730d;
            matrixArr2[i13].mapPoints(fArr);
            u uVar6 = uVarArr[i15];
            float f11 = uVar6.f2728a;
            float[] fArr2 = mVar.f2710i;
            fArr2[0] = f11;
            fArr2[1] = uVar6.b;
            matrixArr2[i15].mapPoints(fArr2);
            float max = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
            u uVar7 = uVarArr[i13];
            fArr[0] = uVar7.f2729c;
            fArr[1] = uVar7.f2730d;
            matrixArr2[i13].mapPoints(fArr);
            if (i13 != 1 && i13 != 3) {
                Math.abs(rectF.centerY() - fArr[1]);
            } else {
                Math.abs(rectF.centerX() - fArr[0]);
            }
            u uVar8 = mVar.f2708g;
            uVar8.d(0.0f, 270.0f, 0.0f);
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 != 3) {
                        eVar = kVar.f2700j;
                    } else {
                        eVar = kVar.f2699i;
                    }
                } else {
                    eVar = kVar.l;
                }
            } else {
                eVar = kVar.f2701k;
            }
            eVar.getClass();
            uVar8.c(max, 0.0f);
            Path path4 = mVar.f2711j;
            path4.reset();
            uVar8.b(matrixArr[i13], path4);
            if (mVar.l && (mVar.b(path4, i13) || mVar.b(path4, i15))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr[0] = uVar8.f2728a;
                fArr[1] = uVar8.b;
                matrixArr[i13].mapPoints(fArr);
                path2.moveTo(fArr[0], fArr[1]);
                uVar8.b(matrixArr[i13], path2);
            } else {
                uVar8.b(matrixArr[i13], path);
            }
            if (cVar != null) {
                Matrix matrix2 = matrixArr[i13];
                g gVar2 = (g) cVar.f972c;
                gVar2.f2664f.set(i13 + 4, false);
                uVar8.a(uVar8.f2732f);
                gVar2.f2663d[i13] = new n(new ArrayList(uVar8.f2734h), new Matrix(matrix2));
            }
            i9 = 4;
            mVar = this;
            i13 = i14;
        }
        path.close();
        path2.close();
        if (!path2.isEmpty()) {
            path.op(path2, Path.Op.UNION);
        }
    }

    public final boolean b(Path path, int i9) {
        Path path2 = this.f2712k;
        path2.reset();
        this.f2703a[i9].b(this.b[i9], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (!rectF.isEmpty()) {
            return true;
        }
        if (rectF.width() > 1.0f && rectF.height() > 1.0f) {
            return true;
        }
        return false;
    }
}
