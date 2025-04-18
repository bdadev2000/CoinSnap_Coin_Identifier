package o3;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import m3.a0;
import m3.x;

/* loaded from: classes.dex */
public final class p implements p3.a, l, n {

    /* renamed from: c, reason: collision with root package name */
    public final String f23095c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f23096d;

    /* renamed from: e, reason: collision with root package name */
    public final x f23097e;

    /* renamed from: f, reason: collision with root package name */
    public final p3.d f23098f;

    /* renamed from: g, reason: collision with root package name */
    public final p3.d f23099g;

    /* renamed from: h, reason: collision with root package name */
    public final p3.h f23100h;

    /* renamed from: k, reason: collision with root package name */
    public boolean f23103k;
    public final Path a = new Path();

    /* renamed from: b, reason: collision with root package name */
    public final RectF f23094b = new RectF();

    /* renamed from: i, reason: collision with root package name */
    public final c f23101i = new c(0);

    /* renamed from: j, reason: collision with root package name */
    public p3.d f23102j = null;

    public p(x xVar, u3.b bVar, t3.i iVar) {
        this.f23095c = iVar.f25229b;
        this.f23096d = iVar.f25231d;
        this.f23097e = xVar;
        p3.d a = iVar.f25232e.a();
        this.f23098f = a;
        p3.d a10 = ((s3.d) iVar.f25233f).a();
        this.f23099g = a10;
        p3.d a11 = iVar.f25230c.a();
        this.f23100h = (p3.h) a11;
        bVar.f(a);
        bVar.f(a10);
        bVar.f(a11);
        a.a(this);
        a10.a(this);
        a11.a(this);
    }

    @Override // p3.a
    public final void a() {
        this.f23103k = false;
        this.f23097e.invalidateSelf();
    }

    @Override // o3.d
    public final void b(List list, List list2) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i10 < arrayList.size()) {
                d dVar = (d) arrayList.get(i10);
                if (dVar instanceof u) {
                    u uVar = (u) dVar;
                    if (uVar.f23126c == 1) {
                        this.f23101i.a.add(uVar);
                        uVar.c(this);
                        i10++;
                    }
                }
                if (dVar instanceof r) {
                    this.f23102j = ((r) dVar).f23113b;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // r3.f
    public final void c(r3.e eVar, int i10, ArrayList arrayList, r3.e eVar2) {
        y3.f.e(eVar, i10, arrayList, eVar2, this);
    }

    @Override // r3.f
    public final void d(h.c cVar, Object obj) {
        if (obj == a0.f21507l) {
            this.f23099g.k(cVar);
        } else if (obj == a0.f21509n) {
            this.f23098f.k(cVar);
        } else if (obj == a0.f21508m) {
            this.f23100h.k(cVar);
        }
    }

    @Override // o3.d
    public final String getName() {
        return this.f23095c;
    }

    @Override // o3.n
    public final Path z() {
        float l10;
        p3.d dVar;
        boolean z10 = this.f23103k;
        Path path = this.a;
        if (z10) {
            return path;
        }
        path.reset();
        if (this.f23096d) {
            this.f23103k = true;
            return path;
        }
        PointF pointF = (PointF) this.f23099g.f();
        float f10 = pointF.x / 2.0f;
        float f11 = pointF.y / 2.0f;
        p3.h hVar = this.f23100h;
        if (hVar == null) {
            l10 = 0.0f;
        } else {
            l10 = hVar.l();
        }
        if (l10 == 0.0f && (dVar = this.f23102j) != null) {
            l10 = Math.min(((Float) dVar.f()).floatValue(), Math.min(f10, f11));
        }
        float min = Math.min(f10, f11);
        if (l10 > min) {
            l10 = min;
        }
        PointF pointF2 = (PointF) this.f23098f.f();
        path.moveTo(pointF2.x + f10, (pointF2.y - f11) + l10);
        path.lineTo(pointF2.x + f10, (pointF2.y + f11) - l10);
        RectF rectF = this.f23094b;
        if (l10 > 0.0f) {
            float f12 = pointF2.x + f10;
            float f13 = l10 * 2.0f;
            float f14 = pointF2.y + f11;
            rectF.set(f12 - f13, f14 - f13, f12, f14);
            path.arcTo(rectF, 0.0f, 90.0f, false);
        }
        path.lineTo((pointF2.x - f10) + l10, pointF2.y + f11);
        if (l10 > 0.0f) {
            float f15 = pointF2.x - f10;
            float f16 = pointF2.y + f11;
            float f17 = l10 * 2.0f;
            rectF.set(f15, f16 - f17, f17 + f15, f16);
            path.arcTo(rectF, 90.0f, 90.0f, false);
        }
        path.lineTo(pointF2.x - f10, (pointF2.y - f11) + l10);
        if (l10 > 0.0f) {
            float f18 = pointF2.x - f10;
            float f19 = pointF2.y - f11;
            float f20 = l10 * 2.0f;
            rectF.set(f18, f19, f18 + f20, f20 + f19);
            path.arcTo(rectF, 180.0f, 90.0f, false);
        }
        path.lineTo((pointF2.x + f10) - l10, pointF2.y - f11);
        if (l10 > 0.0f) {
            float f21 = pointF2.x + f10;
            float f22 = l10 * 2.0f;
            float f23 = pointF2.y - f11;
            rectF.set(f21 - f22, f23, f21, f22 + f23);
            path.arcTo(rectF, 270.0f, 90.0f, false);
        }
        path.close();
        this.f23101i.a(path);
        this.f23103k = true;
        return path;
    }
}
