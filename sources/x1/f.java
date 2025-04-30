package x1;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import v1.v;
import v1.y;
import y1.InterfaceC2942a;

/* loaded from: classes.dex */
public final class f implements m, InterfaceC2942a, k {
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final v f24116c;

    /* renamed from: d, reason: collision with root package name */
    public final y1.j f24117d;

    /* renamed from: e, reason: collision with root package name */
    public final y1.e f24118e;

    /* renamed from: f, reason: collision with root package name */
    public final C1.a f24119f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f24121h;

    /* renamed from: a, reason: collision with root package name */
    public final Path f24115a = new Path();

    /* renamed from: g, reason: collision with root package name */
    public final J1.k f24120g = new J1.k(4);

    public f(v vVar, D1.b bVar, C1.a aVar) {
        this.b = aVar.f421a;
        this.f24116c = vVar;
        y1.e g9 = aVar.f422c.g();
        this.f24117d = (y1.j) g9;
        y1.e g10 = aVar.b.g();
        this.f24118e = g10;
        this.f24119f = aVar;
        bVar.d(g9);
        bVar.d(g10);
        g9.a(this);
        g10.a(this);
    }

    @Override // y1.InterfaceC2942a
    public final void a() {
        this.f24121h = false;
        this.f24116c.invalidateSelf();
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
                        this.f24120g.f1526a.add(tVar);
                        tVar.d(this);
                    }
                }
                i9++;
            } else {
                return;
            }
        }
    }

    @Override // x1.m
    public final Path f() {
        boolean z8 = this.f24121h;
        Path path = this.f24115a;
        if (z8) {
            return path;
        }
        path.reset();
        C1.a aVar = this.f24119f;
        if (aVar.f424e) {
            this.f24121h = true;
            return path;
        }
        PointF pointF = (PointF) this.f24117d.e();
        float f9 = pointF.x / 2.0f;
        float f10 = pointF.y / 2.0f;
        float f11 = f9 * 0.55228f;
        float f12 = f10 * 0.55228f;
        path.reset();
        if (aVar.f423d) {
            float f13 = -f10;
            path.moveTo(0.0f, f13);
            float f14 = 0.0f - f11;
            float f15 = -f9;
            float f16 = 0.0f - f12;
            path.cubicTo(f14, f13, f15, f16, f15, 0.0f);
            float f17 = f12 + 0.0f;
            path.cubicTo(f15, f17, f14, f10, 0.0f, f10);
            float f18 = f11 + 0.0f;
            path.cubicTo(f18, f10, f9, f17, f9, 0.0f);
            path.cubicTo(f9, f16, f18, f13, 0.0f, f13);
        } else {
            float f19 = -f10;
            path.moveTo(0.0f, f19);
            float f20 = f11 + 0.0f;
            float f21 = 0.0f - f12;
            path.cubicTo(f20, f19, f9, f21, f9, 0.0f);
            float f22 = f12 + 0.0f;
            path.cubicTo(f9, f22, f20, f10, 0.0f, f10);
            float f23 = 0.0f - f11;
            float f24 = -f9;
            path.cubicTo(f23, f10, f24, f22, f24, 0.0f);
            path.cubicTo(f24, f21, f23, f19, 0.0f, f19);
        }
        PointF pointF2 = (PointF) this.f24118e.e();
        path.offset(pointF2.x, pointF2.y);
        path.close();
        this.f24120g.d(path);
        this.f24121h = true;
        return path;
    }

    @Override // A1.f
    public final void g(E1.d dVar, Object obj) {
        if (obj == y.f23582f) {
            this.f24117d.j(dVar);
        } else if (obj == y.f23585i) {
            this.f24118e.j(dVar);
        }
    }

    @Override // x1.c
    public final String getName() {
        return this.b;
    }

    @Override // A1.f
    public final void h(A1.e eVar, int i9, ArrayList arrayList, A1.e eVar2) {
        H1.g.f(eVar, i9, arrayList, eVar2, this);
    }
}
