package o3;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import m3.a0;
import m3.x;

/* loaded from: classes.dex */
public final class g implements n, p3.a, l {

    /* renamed from: b, reason: collision with root package name */
    public final String f23027b;

    /* renamed from: c, reason: collision with root package name */
    public final x f23028c;

    /* renamed from: d, reason: collision with root package name */
    public final p3.d f23029d;

    /* renamed from: e, reason: collision with root package name */
    public final p3.d f23030e;

    /* renamed from: f, reason: collision with root package name */
    public final t3.a f23031f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f23033h;
    public final Path a = new Path();

    /* renamed from: g, reason: collision with root package name */
    public final c f23032g = new c(0);

    public g(x xVar, u3.b bVar, t3.a aVar) {
        this.f23027b = aVar.a;
        this.f23028c = xVar;
        p3.d a = aVar.f25192c.a();
        this.f23029d = a;
        p3.d a10 = aVar.f25191b.a();
        this.f23030e = a10;
        this.f23031f = aVar;
        bVar.f(a);
        bVar.f(a10);
        a.a(this);
        a10.a(this);
    }

    @Override // p3.a
    public final void a() {
        this.f23033h = false;
        this.f23028c.invalidateSelf();
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
                        this.f23032g.a.add(uVar);
                        uVar.c(this);
                    }
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
        if (obj == a0.f21506k) {
            this.f23029d.k(cVar);
        } else if (obj == a0.f21509n) {
            this.f23030e.k(cVar);
        }
    }

    @Override // o3.d
    public final String getName() {
        return this.f23027b;
    }

    @Override // o3.n
    public final Path z() {
        boolean z10 = this.f23033h;
        Path path = this.a;
        if (z10) {
            return path;
        }
        path.reset();
        t3.a aVar = this.f23031f;
        if (aVar.f25194e) {
            this.f23033h = true;
            return path;
        }
        PointF pointF = (PointF) this.f23029d.f();
        float f10 = pointF.x / 2.0f;
        float f11 = pointF.y / 2.0f;
        float f12 = f10 * 0.55228f;
        float f13 = f11 * 0.55228f;
        path.reset();
        if (aVar.f25193d) {
            float f14 = -f11;
            path.moveTo(0.0f, f14);
            float f15 = 0.0f - f12;
            float f16 = -f10;
            float f17 = 0.0f - f13;
            path.cubicTo(f15, f14, f16, f17, f16, 0.0f);
            float f18 = f13 + 0.0f;
            path.cubicTo(f16, f18, f15, f11, 0.0f, f11);
            float f19 = f12 + 0.0f;
            path.cubicTo(f19, f11, f10, f18, f10, 0.0f);
            path.cubicTo(f10, f17, f19, f14, 0.0f, f14);
        } else {
            float f20 = -f11;
            path.moveTo(0.0f, f20);
            float f21 = f12 + 0.0f;
            float f22 = 0.0f - f13;
            path.cubicTo(f21, f20, f10, f22, f10, 0.0f);
            float f23 = f13 + 0.0f;
            path.cubicTo(f10, f23, f21, f11, 0.0f, f11);
            float f24 = 0.0f - f12;
            float f25 = -f10;
            path.cubicTo(f24, f11, f25, f23, f25, 0.0f);
            path.cubicTo(f25, f22, f24, f20, 0.0f, f20);
        }
        PointF pointF2 = (PointF) this.f23030e.f();
        path.offset(pointF2.x, pointF2.y);
        path.close();
        this.f23032g.a(path);
        this.f23033h = true;
        return path;
    }
}
