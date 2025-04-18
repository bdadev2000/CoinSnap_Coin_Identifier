package g2;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: p, reason: collision with root package name */
    public static final Matrix f17968p = new Matrix();
    public final Path a;

    /* renamed from: b, reason: collision with root package name */
    public final Path f17969b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f17970c;

    /* renamed from: d, reason: collision with root package name */
    public Paint f17971d;

    /* renamed from: e, reason: collision with root package name */
    public Paint f17972e;

    /* renamed from: f, reason: collision with root package name */
    public PathMeasure f17973f;

    /* renamed from: g, reason: collision with root package name */
    public final h f17974g;

    /* renamed from: h, reason: collision with root package name */
    public float f17975h;

    /* renamed from: i, reason: collision with root package name */
    public float f17976i;

    /* renamed from: j, reason: collision with root package name */
    public float f17977j;

    /* renamed from: k, reason: collision with root package name */
    public float f17978k;

    /* renamed from: l, reason: collision with root package name */
    public int f17979l;

    /* renamed from: m, reason: collision with root package name */
    public String f17980m;

    /* renamed from: n, reason: collision with root package name */
    public Boolean f17981n;

    /* renamed from: o, reason: collision with root package name */
    public final r.b f17982o;

    public k() {
        this.f17970c = new Matrix();
        this.f17975h = 0.0f;
        this.f17976i = 0.0f;
        this.f17977j = 0.0f;
        this.f17978k = 0.0f;
        this.f17979l = 255;
        this.f17980m = null;
        this.f17981n = null;
        this.f17982o = new r.b();
        this.f17974g = new h();
        this.a = new Path();
        this.f17969b = new Path();
    }

    public final void a(h hVar, Matrix matrix, Canvas canvas, int i10, int i11) {
        int i12;
        float f10;
        float f11;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        Path.FillType fillType;
        Path.FillType fillType2;
        hVar.a.set(matrix);
        Matrix matrix2 = hVar.a;
        matrix2.preConcat(hVar.f17962j);
        canvas.save();
        char c10 = 0;
        int i13 = 0;
        while (true) {
            ArrayList arrayList = hVar.f17954b;
            if (i13 < arrayList.size()) {
                i iVar = (i) arrayList.get(i13);
                if (iVar instanceof h) {
                    a((h) iVar, matrix2, canvas, i10, i11);
                } else if (iVar instanceof j) {
                    j jVar = (j) iVar;
                    float f12 = i10 / this.f17977j;
                    float f13 = i11 / this.f17978k;
                    float min = Math.min(f12, f13);
                    Matrix matrix3 = this.f17970c;
                    matrix3.set(matrix2);
                    matrix3.postScale(f12, f13);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix2.mapVectors(fArr);
                    float hypot = (float) Math.hypot(fArr[c10], fArr[1]);
                    i12 = i13;
                    float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                    float f14 = (fArr[0] * fArr[3]) - (fArr[1] * fArr[2]);
                    float max = Math.max(hypot, hypot2);
                    if (max > 0.0f) {
                        f10 = Math.abs(f14) / max;
                    } else {
                        f10 = 0.0f;
                    }
                    if (f10 != 0.0f) {
                        Path path = this.a;
                        jVar.getClass();
                        path.reset();
                        g0.k[] kVarArr = jVar.a;
                        if (kVarArr != null) {
                            g0.k.b(kVarArr, path);
                        }
                        Path path2 = this.f17969b;
                        path2.reset();
                        if (jVar instanceof f) {
                            if (jVar.f17966c == 0) {
                                fillType2 = Path.FillType.WINDING;
                            } else {
                                fillType2 = Path.FillType.EVEN_ODD;
                            }
                            path2.setFillType(fillType2);
                            path2.addPath(path, matrix3);
                            canvas.clipPath(path2);
                        } else {
                            g gVar = (g) jVar;
                            float f15 = gVar.f17948j;
                            if (f15 != 0.0f || gVar.f17949k != 1.0f) {
                                float f16 = gVar.f17950l;
                                float f17 = (f15 + f16) % 1.0f;
                                float f18 = (gVar.f17949k + f16) % 1.0f;
                                if (this.f17973f == null) {
                                    this.f17973f = new PathMeasure();
                                }
                                this.f17973f.setPath(path, false);
                                float length = this.f17973f.getLength();
                                float f19 = f17 * length;
                                float f20 = f18 * length;
                                path.reset();
                                if (f19 > f20) {
                                    this.f17973f.getSegment(f19, length, path, true);
                                    f11 = 0.0f;
                                    this.f17973f.getSegment(0.0f, f20, path, true);
                                } else {
                                    f11 = 0.0f;
                                    this.f17973f.getSegment(f19, f20, path, true);
                                }
                                path.rLineTo(f11, f11);
                            }
                            path2.addPath(path, matrix3);
                            f0.c cVar = gVar.f17945g;
                            if (((Shader) cVar.f17516c) != null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (!z10 && cVar.f17515b == 0) {
                                z11 = false;
                            } else {
                                z11 = true;
                            }
                            if (z11) {
                                if (this.f17972e == null) {
                                    Paint paint = new Paint(1);
                                    this.f17972e = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                }
                                Paint paint2 = this.f17972e;
                                Object obj = cVar.f17516c;
                                if (((Shader) obj) != null) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                if (z15) {
                                    Shader shader = (Shader) obj;
                                    shader.setLocalMatrix(matrix3);
                                    paint2.setShader(shader);
                                    paint2.setAlpha(Math.round(gVar.f17947i * 255.0f));
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(255);
                                    int i14 = cVar.f17515b;
                                    float f21 = gVar.f17947i;
                                    PorterDuff.Mode mode = n.f17994l;
                                    paint2.setColor((i14 & ViewCompat.MEASURED_SIZE_MASK) | (((int) (Color.alpha(i14) * f21)) << 24));
                                }
                                paint2.setColorFilter(null);
                                if (gVar.f17966c == 0) {
                                    fillType = Path.FillType.WINDING;
                                } else {
                                    fillType = Path.FillType.EVEN_ODD;
                                }
                                path2.setFillType(fillType);
                                canvas.drawPath(path2, paint2);
                            }
                            f0.c cVar2 = gVar.f17943e;
                            if (((Shader) cVar2.f17516c) != null) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (!z12 && cVar2.f17515b == 0) {
                                z13 = false;
                            } else {
                                z13 = true;
                            }
                            if (z13) {
                                if (this.f17971d == null) {
                                    z14 = true;
                                    Paint paint3 = new Paint(1);
                                    this.f17971d = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                } else {
                                    z14 = true;
                                }
                                Paint paint4 = this.f17971d;
                                Paint.Join join = gVar.f17952n;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = gVar.f17951m;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(gVar.f17953o);
                                Object obj2 = cVar2.f17516c;
                                if (((Shader) obj2) == null) {
                                    z14 = false;
                                }
                                if (z14) {
                                    Shader shader2 = (Shader) obj2;
                                    shader2.setLocalMatrix(matrix3);
                                    paint4.setShader(shader2);
                                    paint4.setAlpha(Math.round(gVar.f17946h * 255.0f));
                                } else {
                                    paint4.setShader(null);
                                    paint4.setAlpha(255);
                                    int i15 = cVar2.f17515b;
                                    float f22 = gVar.f17946h;
                                    PorterDuff.Mode mode2 = n.f17994l;
                                    paint4.setColor((i15 & ViewCompat.MEASURED_SIZE_MASK) | (((int) (Color.alpha(i15) * f22)) << 24));
                                }
                                paint4.setColorFilter(null);
                                paint4.setStrokeWidth(gVar.f17944f * f10 * min);
                                canvas.drawPath(path2, paint4);
                            }
                        }
                    }
                    i13 = i12 + 1;
                    c10 = 0;
                }
                i12 = i13;
                i13 = i12 + 1;
                c10 = 0;
            } else {
                canvas.restore();
                return;
            }
        }
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f17979l;
    }

    public void setAlpha(float f10) {
        setRootAlpha((int) (f10 * 255.0f));
    }

    public void setRootAlpha(int i10) {
        this.f17979l = i10;
    }

    public k(k kVar) {
        this.f17970c = new Matrix();
        this.f17975h = 0.0f;
        this.f17976i = 0.0f;
        this.f17977j = 0.0f;
        this.f17978k = 0.0f;
        this.f17979l = 255;
        this.f17980m = null;
        this.f17981n = null;
        r.b bVar = new r.b();
        this.f17982o = bVar;
        this.f17974g = new h(kVar.f17974g, bVar);
        this.a = new Path(kVar.a);
        this.f17969b = new Path(kVar.f17969b);
        this.f17975h = kVar.f17975h;
        this.f17976i = kVar.f17976i;
        this.f17977j = kVar.f17977j;
        this.f17978k = kVar.f17978k;
        this.f17979l = kVar.f17979l;
        this.f17980m = kVar.f17980m;
        String str = kVar.f17980m;
        if (str != null) {
            bVar.put(str, this);
        }
        this.f17981n = kVar.f17981n;
    }
}
