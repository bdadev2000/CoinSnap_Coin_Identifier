package o3;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.List;
import m3.a0;
import m3.x;

/* loaded from: classes.dex */
public final class h implements f, p3.a, l {
    public final Path a;

    /* renamed from: b, reason: collision with root package name */
    public final n3.a f23034b;

    /* renamed from: c, reason: collision with root package name */
    public final u3.b f23035c;

    /* renamed from: d, reason: collision with root package name */
    public final String f23036d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f23037e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f23038f;

    /* renamed from: g, reason: collision with root package name */
    public final p3.d f23039g;

    /* renamed from: h, reason: collision with root package name */
    public final p3.d f23040h;

    /* renamed from: i, reason: collision with root package name */
    public p3.t f23041i;

    /* renamed from: j, reason: collision with root package name */
    public final x f23042j;

    /* renamed from: k, reason: collision with root package name */
    public p3.d f23043k;

    /* renamed from: l, reason: collision with root package name */
    public float f23044l;

    /* renamed from: m, reason: collision with root package name */
    public final p3.g f23045m;

    public h(x xVar, u3.b bVar, t3.l lVar) {
        h4.c cVar;
        g0.a aVar;
        PorterDuff.Mode mode;
        Path path = new Path();
        this.a = path;
        n3.a aVar2 = new n3.a(1);
        this.f23034b = aVar2;
        this.f23038f = new ArrayList();
        this.f23035c = bVar;
        this.f23036d = lVar.f25237c;
        this.f23037e = lVar.f25240f;
        this.f23042j = xVar;
        if (bVar.k() != null) {
            p3.d a = ((s3.a) bVar.k().f26021c).a();
            this.f23043k = a;
            a.a(this);
            bVar.f(this.f23043k);
        }
        if (bVar.l() != null) {
            this.f23045m = new p3.g(this, bVar, bVar.l());
        }
        h4.c cVar2 = lVar.f25238d;
        if (cVar2 != null && (cVar = lVar.f25239e) != null) {
            int b3 = t.h.b(bVar.f25493p.f25525y);
            if (b3 != 2) {
                if (b3 != 3) {
                    if (b3 != 4) {
                        if (b3 != 5) {
                            if (b3 != 16) {
                                aVar = null;
                            } else {
                                aVar = g0.a.PLUS;
                            }
                        } else {
                            aVar = g0.a.LIGHTEN;
                        }
                    } else {
                        aVar = g0.a.DARKEN;
                    }
                } else {
                    aVar = g0.a.OVERLAY;
                }
            } else {
                aVar = g0.a.SCREEN;
            }
            int i10 = g0.i.a;
            if (Build.VERSION.SDK_INT >= 29) {
                g0.h.a(aVar2, aVar != null ? g0.c.a(aVar) : null);
            } else if (aVar != null) {
                switch (aVar) {
                    case CLEAR:
                        mode = PorterDuff.Mode.CLEAR;
                        break;
                    case SRC:
                        mode = PorterDuff.Mode.SRC;
                        break;
                    case DST:
                        mode = PorterDuff.Mode.DST;
                        break;
                    case SRC_OVER:
                        mode = PorterDuff.Mode.SRC_OVER;
                        break;
                    case DST_OVER:
                        mode = PorterDuff.Mode.DST_OVER;
                        break;
                    case SRC_IN:
                        mode = PorterDuff.Mode.SRC_IN;
                        break;
                    case DST_IN:
                        mode = PorterDuff.Mode.DST_IN;
                        break;
                    case SRC_OUT:
                        mode = PorterDuff.Mode.SRC_OUT;
                        break;
                    case DST_OUT:
                        mode = PorterDuff.Mode.DST_OUT;
                        break;
                    case SRC_ATOP:
                        mode = PorterDuff.Mode.SRC_ATOP;
                        break;
                    case DST_ATOP:
                        mode = PorterDuff.Mode.DST_ATOP;
                        break;
                    case XOR:
                        mode = PorterDuff.Mode.XOR;
                        break;
                    case PLUS:
                        mode = PorterDuff.Mode.ADD;
                        break;
                    case MODULATE:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case SCREEN:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case OVERLAY:
                        mode = PorterDuff.Mode.OVERLAY;
                        break;
                    case DARKEN:
                        mode = PorterDuff.Mode.DARKEN;
                        break;
                    case LIGHTEN:
                        mode = PorterDuff.Mode.LIGHTEN;
                        break;
                    default:
                        mode = null;
                        break;
                }
                aVar2.setXfermode(mode != null ? new PorterDuffXfermode(mode) : null);
            } else {
                aVar2.setXfermode(null);
            }
            path.setFillType(lVar.f25236b);
            p3.d a10 = cVar2.a();
            this.f23039g = a10;
            a10.a(this);
            bVar.f(a10);
            p3.d a11 = cVar.a();
            this.f23040h = a11;
            a11.a(this);
            bVar.f(a11);
            return;
        }
        this.f23039g = null;
        this.f23040h = null;
    }

    @Override // p3.a
    public final void a() {
        this.f23042j.invalidateSelf();
    }

    @Override // o3.d
    public final void b(List list, List list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            d dVar = (d) list2.get(i10);
            if (dVar instanceof n) {
                this.f23038f.add((n) dVar);
            }
        }
    }

    @Override // r3.f
    public final void c(r3.e eVar, int i10, ArrayList arrayList, r3.e eVar2) {
        y3.f.e(eVar, i10, arrayList, eVar2, this);
    }

    @Override // r3.f
    public final void d(h.c cVar, Object obj) {
        if (obj == a0.a) {
            this.f23039g.k(cVar);
            return;
        }
        if (obj == a0.f21499d) {
            this.f23040h.k(cVar);
            return;
        }
        ColorFilter colorFilter = a0.K;
        u3.b bVar = this.f23035c;
        if (obj == colorFilter) {
            p3.t tVar = this.f23041i;
            if (tVar != null) {
                bVar.n(tVar);
            }
            if (cVar == null) {
                this.f23041i = null;
                return;
            }
            p3.t tVar2 = new p3.t(cVar, null);
            this.f23041i = tVar2;
            tVar2.a(this);
            bVar.f(this.f23041i);
            return;
        }
        if (obj == a0.f21505j) {
            p3.d dVar = this.f23043k;
            if (dVar != null) {
                dVar.k(cVar);
                return;
            }
            p3.t tVar3 = new p3.t(cVar, null);
            this.f23043k = tVar3;
            tVar3.a(this);
            bVar.f(this.f23043k);
            return;
        }
        Integer num = a0.f21500e;
        p3.g gVar = this.f23045m;
        if (obj == num && gVar != null) {
            gVar.f23368b.k(cVar);
            return;
        }
        if (obj == a0.G && gVar != null) {
            gVar.c(cVar);
            return;
        }
        if (obj == a0.H && gVar != null) {
            gVar.f23370d.k(cVar);
            return;
        }
        if (obj == a0.I && gVar != null) {
            gVar.f23371e.k(cVar);
        } else if (obj == a0.J && gVar != null) {
            gVar.f23372f.k(cVar);
        }
    }

    @Override // o3.f
    public final void e(RectF rectF, Matrix matrix, boolean z10) {
        Path path = this.a;
        path.reset();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f23038f;
            if (i10 < arrayList.size()) {
                path.addPath(((n) arrayList.get(i10)).z(), matrix);
                i10++;
            } else {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            }
        }
    }

    @Override // o3.f
    public final void g(Canvas canvas, Matrix matrix, int i10) {
        BlurMaskFilter blurMaskFilter;
        if (this.f23037e) {
            return;
        }
        p3.e eVar = (p3.e) this.f23039g;
        int l10 = eVar.l(eVar.b(), eVar.d());
        PointF pointF = y3.f.a;
        int i11 = 0;
        int max = (Math.max(0, Math.min(255, (int) ((((i10 / 255.0f) * ((Integer) this.f23040h.f()).intValue()) / 100.0f) * 255.0f))) << 24) | (l10 & ViewCompat.MEASURED_SIZE_MASK);
        n3.a aVar = this.f23034b;
        aVar.setColor(max);
        p3.t tVar = this.f23041i;
        if (tVar != null) {
            aVar.setColorFilter((ColorFilter) tVar.f());
        }
        p3.d dVar = this.f23043k;
        if (dVar != null) {
            float floatValue = ((Float) dVar.f()).floatValue();
            if (floatValue == 0.0f) {
                aVar.setMaskFilter(null);
            } else if (floatValue != this.f23044l) {
                u3.b bVar = this.f23035c;
                if (bVar.A == floatValue) {
                    blurMaskFilter = bVar.B;
                } else {
                    BlurMaskFilter blurMaskFilter2 = new BlurMaskFilter(floatValue / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    bVar.B = blurMaskFilter2;
                    bVar.A = floatValue;
                    blurMaskFilter = blurMaskFilter2;
                }
                aVar.setMaskFilter(blurMaskFilter);
            }
            this.f23044l = floatValue;
        }
        p3.g gVar = this.f23045m;
        if (gVar != null) {
            gVar.b(aVar);
        }
        Path path = this.a;
        path.reset();
        while (true) {
            ArrayList arrayList = this.f23038f;
            if (i11 < arrayList.size()) {
                path.addPath(((n) arrayList.get(i11)).z(), matrix);
                i11++;
            } else {
                canvas.drawPath(path, aVar);
                return;
            }
        }
    }

    @Override // o3.d
    public final String getName() {
        return this.f23036d;
    }
}
