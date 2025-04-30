package x1;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import v1.v;
import v1.y;
import y1.InterfaceC2942a;

/* loaded from: classes.dex */
public final class o implements InterfaceC2942a, k, m {

    /* renamed from: c, reason: collision with root package name */
    public final String f24181c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f24182d;

    /* renamed from: e, reason: collision with root package name */
    public final v f24183e;

    /* renamed from: f, reason: collision with root package name */
    public final y1.e f24184f;

    /* renamed from: g, reason: collision with root package name */
    public final y1.e f24185g;

    /* renamed from: h, reason: collision with root package name */
    public final y1.i f24186h;

    /* renamed from: k, reason: collision with root package name */
    public boolean f24189k;

    /* renamed from: a, reason: collision with root package name */
    public final Path f24180a = new Path();
    public final RectF b = new RectF();

    /* renamed from: i, reason: collision with root package name */
    public final J1.k f24187i = new J1.k(4);

    /* renamed from: j, reason: collision with root package name */
    public y1.e f24188j = null;

    public o(v vVar, D1.b bVar, C1.i iVar) {
        this.f24181c = iVar.b;
        this.f24182d = iVar.f459d;
        this.f24183e = vVar;
        y1.e g9 = iVar.f460e.g();
        this.f24184f = g9;
        y1.e g10 = ((B1.e) iVar.f461f).g();
        this.f24185g = g10;
        y1.e g11 = iVar.f458c.g();
        this.f24186h = (y1.i) g11;
        bVar.d(g9);
        bVar.d(g10);
        bVar.d(g11);
        g9.a(this);
        g10.a(this);
        g11.a(this);
    }

    @Override // y1.InterfaceC2942a
    public final void a() {
        this.f24189k = false;
        this.f24183e.invalidateSelf();
    }

    @Override // x1.c
    public final void b(List list, List list2) {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i9 < arrayList.size()) {
                c cVar = (c) arrayList.get(i9);
                if (cVar instanceof t) {
                    t tVar = (t) cVar;
                    if (tVar.f24213c == 1) {
                        this.f24187i.f1526a.add(tVar);
                        tVar.d(this);
                        i9++;
                    }
                }
                if (cVar instanceof q) {
                    this.f24188j = ((q) cVar).b;
                }
                i9++;
            } else {
                return;
            }
        }
    }

    @Override // x1.m
    public final Path f() {
        float k6;
        y1.e eVar;
        boolean z8 = this.f24189k;
        Path path = this.f24180a;
        if (z8) {
            return path;
        }
        path.reset();
        if (this.f24182d) {
            this.f24189k = true;
            return path;
        }
        PointF pointF = (PointF) this.f24185g.e();
        float f9 = pointF.x / 2.0f;
        float f10 = pointF.y / 2.0f;
        y1.i iVar = this.f24186h;
        if (iVar == null) {
            k6 = 0.0f;
        } else {
            k6 = iVar.k();
        }
        if (k6 == 0.0f && (eVar = this.f24188j) != null) {
            k6 = Math.min(((Float) eVar.e()).floatValue(), Math.min(f9, f10));
        }
        float min = Math.min(f9, f10);
        if (k6 > min) {
            k6 = min;
        }
        PointF pointF2 = (PointF) this.f24184f.e();
        path.moveTo(pointF2.x + f9, (pointF2.y - f10) + k6);
        path.lineTo(pointF2.x + f9, (pointF2.y + f10) - k6);
        RectF rectF = this.b;
        if (k6 > 0.0f) {
            float f11 = pointF2.x + f9;
            float f12 = k6 * 2.0f;
            float f13 = pointF2.y + f10;
            rectF.set(f11 - f12, f13 - f12, f11, f13);
            path.arcTo(rectF, 0.0f, 90.0f, false);
        }
        path.lineTo((pointF2.x - f9) + k6, pointF2.y + f10);
        if (k6 > 0.0f) {
            float f14 = pointF2.x - f9;
            float f15 = pointF2.y + f10;
            float f16 = k6 * 2.0f;
            rectF.set(f14, f15 - f16, f16 + f14, f15);
            path.arcTo(rectF, 90.0f, 90.0f, false);
        }
        path.lineTo(pointF2.x - f9, (pointF2.y - f10) + k6);
        if (k6 > 0.0f) {
            float f17 = pointF2.x - f9;
            float f18 = pointF2.y - f10;
            float f19 = k6 * 2.0f;
            rectF.set(f17, f18, f17 + f19, f19 + f18);
            path.arcTo(rectF, 180.0f, 90.0f, false);
        }
        path.lineTo((pointF2.x + f9) - k6, pointF2.y - f10);
        if (k6 > 0.0f) {
            float f20 = pointF2.x + f9;
            float f21 = k6 * 2.0f;
            float f22 = pointF2.y - f10;
            rectF.set(f20 - f21, f22, f20, f21 + f22);
            path.arcTo(rectF, 270.0f, 90.0f, false);
        }
        path.close();
        this.f24187i.d(path);
        this.f24189k = true;
        return path;
    }

    @Override // A1.f
    public final void g(E1.d dVar, Object obj) {
        if (obj == y.f23583g) {
            this.f24185g.j(dVar);
        } else if (obj == y.f23585i) {
            this.f24184f.j(dVar);
        } else if (obj == y.f23584h) {
            this.f24186h.j(dVar);
        }
    }

    @Override // x1.c
    public final String getName() {
        return this.f24181c;
    }

    @Override // A1.f
    public final void h(A1.e eVar, int i9, ArrayList arrayList, A1.e eVar2) {
        H1.g.f(eVar, i9, arrayList, eVar2, this);
    }
}
