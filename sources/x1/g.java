package x1;

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
import v1.v;
import v1.y;
import y1.InterfaceC2942a;
import z.AbstractC2965e;

/* loaded from: classes.dex */
public final class g implements e, InterfaceC2942a, k {

    /* renamed from: a, reason: collision with root package name */
    public final Path f24122a;
    public final D1.i b;

    /* renamed from: c, reason: collision with root package name */
    public final D1.b f24123c;

    /* renamed from: d, reason: collision with root package name */
    public final String f24124d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f24125e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f24126f;

    /* renamed from: g, reason: collision with root package name */
    public final y1.f f24127g;

    /* renamed from: h, reason: collision with root package name */
    public final y1.f f24128h;

    /* renamed from: i, reason: collision with root package name */
    public y1.r f24129i;

    /* renamed from: j, reason: collision with root package name */
    public final v f24130j;

    /* renamed from: k, reason: collision with root package name */
    public y1.e f24131k;
    public float l;
    public final y1.h m;

    public g(v vVar, D1.b bVar, C1.l lVar) {
        B1.a aVar;
        L.a aVar2;
        PorterDuff.Mode mode;
        Path path = new Path();
        this.f24122a = path;
        D1.i iVar = new D1.i(1, 2);
        this.b = iVar;
        this.f24126f = new ArrayList();
        this.f24123c = bVar;
        this.f24124d = lVar.f466c;
        this.f24125e = lVar.f469f;
        this.f24130j = vVar;
        if (bVar.l() != null) {
            y1.e g9 = ((B1.b) bVar.l().f972c).g();
            this.f24131k = g9;
            g9.a(this);
            bVar.d(this.f24131k);
        }
        if (bVar.m() != null) {
            this.m = new y1.h(this, bVar, bVar.m());
        }
        B1.a aVar3 = lVar.f467d;
        if (aVar3 != null && (aVar = lVar.f468e) != null) {
            int d2 = AbstractC2965e.d(bVar.f653p.f698y);
            if (d2 != 2) {
                if (d2 != 3) {
                    if (d2 != 4) {
                        if (d2 != 5) {
                            if (d2 != 16) {
                                aVar2 = null;
                            } else {
                                aVar2 = L.a.b;
                            }
                        } else {
                            aVar2 = L.a.f1665g;
                        }
                    } else {
                        aVar2 = L.a.f1664f;
                    }
                } else {
                    aVar2 = L.a.f1663d;
                }
            } else {
                aVar2 = L.a.f1662c;
            }
            int i9 = L.h.f1672a;
            if (Build.VERSION.SDK_INT >= 29) {
                L.g.a(iVar, aVar2 != null ? L.b.a(aVar2) : null);
            } else if (aVar2 != null) {
                switch (aVar2.ordinal()) {
                    case 0:
                        mode = PorterDuff.Mode.CLEAR;
                        break;
                    case 1:
                        mode = PorterDuff.Mode.SRC;
                        break;
                    case 2:
                        mode = PorterDuff.Mode.DST;
                        break;
                    case 3:
                        mode = PorterDuff.Mode.SRC_OVER;
                        break;
                    case 4:
                        mode = PorterDuff.Mode.DST_OVER;
                        break;
                    case 5:
                        mode = PorterDuff.Mode.SRC_IN;
                        break;
                    case 6:
                        mode = PorterDuff.Mode.DST_IN;
                        break;
                    case 7:
                        mode = PorterDuff.Mode.SRC_OUT;
                        break;
                    case 8:
                        mode = PorterDuff.Mode.DST_OUT;
                        break;
                    case 9:
                        mode = PorterDuff.Mode.SRC_ATOP;
                        break;
                    case 10:
                        mode = PorterDuff.Mode.DST_ATOP;
                        break;
                    case 11:
                        mode = PorterDuff.Mode.XOR;
                        break;
                    case 12:
                        mode = PorterDuff.Mode.ADD;
                        break;
                    case 13:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 14:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.OVERLAY;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.DARKEN;
                        break;
                    case 17:
                        mode = PorterDuff.Mode.LIGHTEN;
                        break;
                    default:
                        mode = null;
                        break;
                }
                iVar.setXfermode(mode != null ? new PorterDuffXfermode(mode) : null);
            } else {
                iVar.setXfermode(null);
            }
            path.setFillType(lVar.b);
            y1.e g10 = aVar3.g();
            this.f24127g = (y1.f) g10;
            g10.a(this);
            bVar.d(g10);
            y1.e g11 = aVar.g();
            this.f24128h = (y1.f) g11;
            g11.a(this);
            bVar.d(g11);
            return;
        }
        this.f24127g = null;
        this.f24128h = null;
    }

    @Override // y1.InterfaceC2942a
    public final void a() {
        this.f24130j.invalidateSelf();
    }

    @Override // x1.c
    public final void b(List list, List list2) {
        for (int i9 = 0; i9 < list2.size(); i9++) {
            c cVar = (c) list2.get(i9);
            if (cVar instanceof m) {
                this.f24126f.add((m) cVar);
            }
        }
    }

    @Override // x1.e
    public final void c(RectF rectF, Matrix matrix, boolean z8) {
        Path path = this.f24122a;
        path.reset();
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.f24126f;
            if (i9 < arrayList.size()) {
                path.addPath(((m) arrayList.get(i9)).f(), matrix);
                i9++;
            } else {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            }
        }
    }

    @Override // x1.e
    public final void e(Canvas canvas, Matrix matrix, int i9) {
        BlurMaskFilter blurMaskFilter;
        if (this.f24125e) {
            return;
        }
        y1.f fVar = this.f24127g;
        int k6 = fVar.k(fVar.f24290c.c(), fVar.c());
        PointF pointF = H1.g.f1365a;
        int i10 = 0;
        int max = (Math.max(0, Math.min(255, (int) ((((i9 / 255.0f) * ((Integer) this.f24128h.e()).intValue()) / 100.0f) * 255.0f))) << 24) | (k6 & ViewCompat.MEASURED_SIZE_MASK);
        D1.i iVar = this.b;
        iVar.setColor(max);
        y1.r rVar = this.f24129i;
        if (rVar != null) {
            iVar.setColorFilter((ColorFilter) rVar.e());
        }
        y1.e eVar = this.f24131k;
        if (eVar != null) {
            float floatValue = ((Float) eVar.e()).floatValue();
            if (floatValue == 0.0f) {
                iVar.setMaskFilter(null);
            } else if (floatValue != this.l) {
                D1.b bVar = this.f24123c;
                if (bVar.f639A == floatValue) {
                    blurMaskFilter = bVar.f640B;
                } else {
                    BlurMaskFilter blurMaskFilter2 = new BlurMaskFilter(floatValue / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    bVar.f640B = blurMaskFilter2;
                    bVar.f639A = floatValue;
                    blurMaskFilter = blurMaskFilter2;
                }
                iVar.setMaskFilter(blurMaskFilter);
            }
            this.l = floatValue;
        }
        y1.h hVar = this.m;
        if (hVar != null) {
            hVar.b(iVar);
        }
        Path path = this.f24122a;
        path.reset();
        while (true) {
            ArrayList arrayList = this.f24126f;
            if (i10 < arrayList.size()) {
                path.addPath(((m) arrayList.get(i10)).f(), matrix);
                i10++;
            } else {
                canvas.drawPath(path, iVar);
                return;
            }
        }
    }

    @Override // A1.f
    public final void g(E1.d dVar, Object obj) {
        PointF pointF = y.f23578a;
        if (obj == 1) {
            this.f24127g.j(dVar);
            return;
        }
        if (obj == 4) {
            this.f24128h.j(dVar);
            return;
        }
        ColorFilter colorFilter = y.f23572F;
        D1.b bVar = this.f24123c;
        if (obj == colorFilter) {
            y1.r rVar = this.f24129i;
            if (rVar != null) {
                bVar.p(rVar);
            }
            if (dVar == null) {
                this.f24129i = null;
                return;
            }
            y1.r rVar2 = new y1.r(dVar, null);
            this.f24129i = rVar2;
            rVar2.a(this);
            bVar.d(this.f24129i);
            return;
        }
        if (obj == y.f23581e) {
            y1.e eVar = this.f24131k;
            if (eVar != null) {
                eVar.j(dVar);
                return;
            }
            y1.r rVar3 = new y1.r(dVar, null);
            this.f24131k = rVar3;
            rVar3.a(this);
            bVar.d(this.f24131k);
            return;
        }
        y1.h hVar = this.m;
        if (obj == 5 && hVar != null) {
            hVar.b.j(dVar);
            return;
        }
        if (obj == y.f23568B && hVar != null) {
            hVar.c(dVar);
            return;
        }
        if (obj == y.f23569C && hVar != null) {
            hVar.f24300d.j(dVar);
            return;
        }
        if (obj == y.f23570D && hVar != null) {
            hVar.f24301e.j(dVar);
        } else if (obj == y.f23571E && hVar != null) {
            hVar.f24302f.j(dVar);
        }
    }

    @Override // x1.c
    public final String getName() {
        return this.f24124d;
    }

    @Override // A1.f
    public final void h(A1.e eVar, int i9, ArrayList arrayList, A1.e eVar2) {
        H1.g.f(eVar, i9, arrayList, eVar2, this);
    }
}
