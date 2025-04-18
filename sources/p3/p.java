package p3;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class p extends d {

    /* renamed from: i, reason: collision with root package name */
    public final PointF f23389i;

    /* renamed from: j, reason: collision with root package name */
    public final PointF f23390j;

    /* renamed from: k, reason: collision with root package name */
    public final d f23391k;

    /* renamed from: l, reason: collision with root package name */
    public final d f23392l;

    /* renamed from: m, reason: collision with root package name */
    public h.c f23393m;

    /* renamed from: n, reason: collision with root package name */
    public h.c f23394n;

    public p(h hVar, h hVar2) {
        super(Collections.emptyList());
        this.f23389i = new PointF();
        this.f23390j = new PointF();
        this.f23391k = hVar;
        this.f23392l = hVar2;
        j(this.f23362d);
    }

    @Override // p3.d
    public final Object f() {
        return l(0.0f);
    }

    @Override // p3.d
    public final /* bridge */ /* synthetic */ Object g(z3.a aVar, float f10) {
        return l(f10);
    }

    @Override // p3.d
    public final void j(float f10) {
        d dVar = this.f23391k;
        dVar.j(f10);
        d dVar2 = this.f23392l;
        dVar2.j(f10);
        this.f23389i.set(((Float) dVar.f()).floatValue(), ((Float) dVar2.f()).floatValue());
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i10 < arrayList.size()) {
                ((a) arrayList.get(i10)).a();
                i10++;
            } else {
                return;
            }
        }
    }

    public final PointF l(float f10) {
        Float f11;
        d dVar;
        z3.a b3;
        float floatValue;
        d dVar2;
        z3.a b10;
        float floatValue2;
        Float f12 = null;
        if (this.f23393m != null && (b10 = (dVar2 = this.f23391k).b()) != null) {
            float d10 = dVar2.d();
            Float f13 = b10.f28478h;
            h.c cVar = this.f23393m;
            float f14 = b10.f28477g;
            if (f13 == null) {
                floatValue2 = f14;
            } else {
                floatValue2 = f13.floatValue();
            }
            f11 = (Float) cVar.A(f14, floatValue2, (Float) b10.f28472b, (Float) b10.f28473c, f10, f10, d10);
        } else {
            f11 = null;
        }
        if (this.f23394n != null && (b3 = (dVar = this.f23392l).b()) != null) {
            float d11 = dVar.d();
            Float f15 = b3.f28478h;
            h.c cVar2 = this.f23394n;
            float f16 = b3.f28477g;
            if (f15 == null) {
                floatValue = f16;
            } else {
                floatValue = f15.floatValue();
            }
            f12 = (Float) cVar2.A(f16, floatValue, (Float) b3.f28472b, (Float) b3.f28473c, f10, f10, d11);
        }
        PointF pointF = this.f23389i;
        PointF pointF2 = this.f23390j;
        if (f11 == null) {
            pointF2.set(pointF.x, 0.0f);
        } else {
            pointF2.set(f11.floatValue(), 0.0f);
        }
        if (f12 == null) {
            pointF2.set(pointF2.x, pointF.y);
        } else {
            pointF2.set(pointF2.x, f12.floatValue());
        }
        return pointF2;
    }
}
