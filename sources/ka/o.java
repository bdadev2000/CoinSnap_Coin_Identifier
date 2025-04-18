package ka;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;

/* loaded from: classes3.dex */
public final class o {
    public final w[] a = new w[4];

    /* renamed from: b, reason: collision with root package name */
    public final Matrix[] f20595b = new Matrix[4];

    /* renamed from: c, reason: collision with root package name */
    public final Matrix[] f20596c = new Matrix[4];

    /* renamed from: d, reason: collision with root package name */
    public final PointF f20597d = new PointF();

    /* renamed from: e, reason: collision with root package name */
    public final Path f20598e = new Path();

    /* renamed from: f, reason: collision with root package name */
    public final Path f20599f = new Path();

    /* renamed from: g, reason: collision with root package name */
    public final w f20600g = new w();

    /* renamed from: h, reason: collision with root package name */
    public final float[] f20601h = new float[2];

    /* renamed from: i, reason: collision with root package name */
    public final float[] f20602i = new float[2];

    /* renamed from: j, reason: collision with root package name */
    public final Path f20603j = new Path();

    /* renamed from: k, reason: collision with root package name */
    public final Path f20604k = new Path();

    /* renamed from: l, reason: collision with root package name */
    public final boolean f20605l = true;

    public o() {
        for (int i10 = 0; i10 < 4; i10++) {
            this.a[i10] = new w();
            this.f20595b[i10] = new Matrix();
            this.f20596c[i10] = new Matrix();
        }
    }

    public final void a(l lVar, l lVar2, float f10, RectF rectF, f fVar, Path path) {
        int i10;
        char c10;
        Matrix[] matrixArr;
        float[] fArr;
        Matrix[] matrixArr2;
        w[] wVarArr;
        RectF rectF2;
        l lVar3;
        n nVar;
        e eVar;
        char c11;
        c cVar;
        c cVar2;
        p6.a aVar;
        path.rewind();
        Path path2 = this.f20598e;
        path2.rewind();
        Path path3 = this.f20599f;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        n nVar2 = new n(lVar, lVar2, f10, rectF, fVar, path);
        int i11 = 0;
        while (true) {
            i10 = 4;
            c10 = 1;
            matrixArr = this.f20596c;
            fArr = this.f20601h;
            matrixArr2 = this.f20595b;
            wVarArr = this.a;
            rectF2 = nVar2.f20592d;
            lVar3 = nVar2.a;
            if (i11 >= 4) {
                break;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        cVar = lVar3.f20583f;
                    } else {
                        cVar = lVar3.f20582e;
                    }
                } else {
                    cVar = lVar3.f20585h;
                }
            } else {
                cVar = lVar3.f20584g;
            }
            l lVar4 = nVar2.f20590b;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        cVar2 = lVar4.f20583f;
                    } else {
                        cVar2 = lVar4.f20582e;
                    }
                } else {
                    cVar2 = lVar4.f20585h;
                }
            } else {
                cVar2 = lVar4.f20584g;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        aVar = lVar3.f20579b;
                    } else {
                        aVar = lVar3.a;
                    }
                } else {
                    aVar = lVar3.f20581d;
                }
            } else {
                aVar = lVar3.f20580c;
            }
            w wVar = wVarArr[i11];
            aVar.getClass();
            aVar.i(wVar, nVar2.f20594f, cVar2.a(rectF2), cVar.a(rectF2));
            int i12 = i11 + 1;
            float f11 = (i12 % 4) * 90;
            matrixArr2[i11].reset();
            PointF pointF = this.f20597d;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        pointF.set(rectF2.right, rectF2.top);
                    } else {
                        pointF.set(rectF2.left, rectF2.top);
                    }
                } else {
                    pointF.set(rectF2.left, rectF2.bottom);
                }
            } else {
                pointF.set(rectF2.right, rectF2.bottom);
            }
            matrixArr2[i11].setTranslate(pointF.x, pointF.y);
            matrixArr2[i11].preRotate(f11);
            w wVar2 = wVarArr[i11];
            fArr[0] = wVar2.f20623c;
            fArr[1] = wVar2.f20624d;
            matrixArr2[i11].mapPoints(fArr);
            matrixArr[i11].reset();
            matrixArr[i11].setTranslate(fArr[0], fArr[1]);
            matrixArr[i11].preRotate(f11);
            i11 = i12;
        }
        char c12 = 0;
        int i13 = 0;
        while (i13 < i10) {
            w wVar3 = wVarArr[i13];
            fArr[c12] = wVar3.a;
            fArr[c10] = wVar3.f20622b;
            matrixArr2[i13].mapPoints(fArr);
            Path path4 = nVar2.f20591c;
            if (i13 == 0) {
                path4.moveTo(fArr[c12], fArr[c10]);
            } else {
                path4.lineTo(fArr[c12], fArr[c10]);
            }
            wVarArr[i13].b(matrixArr2[i13], path4);
            f fVar2 = nVar2.f20593e;
            if (fVar2 != null) {
                w wVar4 = wVarArr[i13];
                Matrix matrix = matrixArr2[i13];
                BitSet bitSet = ((i) fVar2.f20532b).f20560f;
                wVar4.getClass();
                nVar = nVar2;
                bitSet.set(i13, false);
                v[] vVarArr = ((i) fVar2.f20532b).f20558c;
                wVar4.a(wVar4.f20626f);
                vVarArr[i13] = new p(new ArrayList(wVar4.f20628h), new Matrix(matrix));
            } else {
                nVar = nVar2;
            }
            int i14 = i13 + 1;
            int i15 = i14 % 4;
            w wVar5 = wVarArr[i13];
            fArr[0] = wVar5.f20623c;
            fArr[1] = wVar5.f20624d;
            matrixArr2[i13].mapPoints(fArr);
            w wVar6 = wVarArr[i15];
            float f12 = wVar6.a;
            float[] fArr2 = this.f20602i;
            fArr2[0] = f12;
            fArr2[1] = wVar6.f20622b;
            matrixArr2[i15].mapPoints(fArr2);
            float max = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
            w wVar7 = wVarArr[i13];
            fArr[0] = wVar7.f20623c;
            fArr[1] = wVar7.f20624d;
            matrixArr2[i13].mapPoints(fArr);
            if (i13 != 1 && i13 != 3) {
                Math.abs(rectF2.centerY() - fArr[1]);
            } else {
                Math.abs(rectF2.centerX() - fArr[0]);
            }
            w wVar8 = this.f20600g;
            wVar8.d(0.0f, 270.0f, 0.0f);
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 != 3) {
                        eVar = lVar3.f20587j;
                    } else {
                        eVar = lVar3.f20586i;
                    }
                } else {
                    eVar = lVar3.f20589l;
                }
            } else {
                eVar = lVar3.f20588k;
            }
            eVar.getClass();
            wVar8.c(max, 0.0f);
            Path path5 = this.f20603j;
            path5.reset();
            wVar8.b(matrixArr[i13], path5);
            if (this.f20605l && (b(path5, i13) || b(path5, i15))) {
                path5.op(path5, path3, Path.Op.DIFFERENCE);
                fArr[0] = wVar8.a;
                fArr[1] = wVar8.f20622b;
                matrixArr[i13].mapPoints(fArr);
                path2.moveTo(fArr[0], fArr[1]);
                wVar8.b(matrixArr[i13], path2);
            } else {
                wVar8.b(matrixArr[i13], path4);
            }
            if (fVar2 != null) {
                Matrix matrix2 = matrixArr[i13];
                c11 = 0;
                ((i) fVar2.f20532b).f20560f.set(i13 + 4, false);
                v[] vVarArr2 = ((i) fVar2.f20532b).f20559d;
                wVar8.a(wVar8.f20626f);
                vVarArr2[i13] = new p(new ArrayList(wVar8.f20628h), new Matrix(matrix2));
            } else {
                c11 = 0;
            }
            nVar2 = nVar;
            i13 = i14;
            i10 = 4;
            c12 = c11;
            c10 = 1;
        }
        path.close();
        path2.close();
        if (!path2.isEmpty()) {
            path.op(path2, Path.Op.UNION);
        }
    }

    public final boolean b(Path path, int i10) {
        Path path2 = this.f20604k;
        path2.reset();
        this.a[i10].b(this.f20595b[i10], path2);
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
