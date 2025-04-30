package F1;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f1101a = new LinearInterpolator();
    public static final a7.b b = a7.b.u("t", "s", "e", "o", com.mbridge.msdk.foundation.same.report.i.f15948a, "h", "to", "ti");

    /* renamed from: c, reason: collision with root package name */
    public static final a7.b f1102c = a7.b.u("x", "y");

    public static Interpolator a(PointF pointF, PointF pointF2) {
        pointF.x = H1.g.b(pointF.x, -1.0f, 1.0f);
        pointF.y = H1.g.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = H1.g.b(pointF2.x, -1.0f, 1.0f);
        float b8 = H1.g.b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = b8;
        H1.h hVar = H1.i.f1367a;
        try {
            return V.a.b(pointF.x, pointF.y, pointF2.x, b8);
        } catch (IllegalArgumentException e4) {
            if ("The Path cannot loop back on itself.".equals(e4.getMessage())) {
                return V.a.b(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y);
            }
            return new LinearInterpolator();
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x002d. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.animation.Interpolator] */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.view.animation.Interpolator] */
    public static I1.a b(G1.c cVar, v1.i iVar, float f9, E e4, boolean z8, boolean z9) {
        Object obj;
        LinearInterpolator a6;
        Interpolator a9;
        Interpolator a10;
        Object obj2;
        I1.a aVar;
        a7.b bVar;
        PointF pointF;
        Object obj3;
        PointF pointF2;
        boolean z10;
        LinearInterpolator linearInterpolator = f1101a;
        a7.b bVar2 = b;
        if (z8 && z9) {
            cVar.b();
            PointF pointF3 = null;
            PointF pointF4 = null;
            PointF pointF5 = null;
            boolean z11 = false;
            PointF pointF6 = null;
            PointF pointF7 = null;
            PointF pointF8 = null;
            Object obj4 = null;
            PointF pointF9 = null;
            PointF pointF10 = null;
            float f10 = 0.0f;
            Object obj5 = null;
            while (cVar.j()) {
                int q9 = cVar.q(bVar2);
                a7.b bVar3 = f1102c;
                LinearInterpolator linearInterpolator2 = linearInterpolator;
                switch (q9) {
                    case 0:
                        bVar = bVar2;
                        pointF = pointF4;
                        f10 = (float) cVar.l();
                        bVar2 = bVar;
                        linearInterpolator = linearInterpolator2;
                        pointF4 = pointF;
                        break;
                    case 1:
                        pointF = pointF4;
                        obj4 = e4.a(cVar, f9);
                        linearInterpolator = linearInterpolator2;
                        pointF4 = pointF;
                        break;
                    case 2:
                        pointF = pointF4;
                        obj5 = e4.a(cVar, f9);
                        linearInterpolator = linearInterpolator2;
                        pointF4 = pointF;
                        break;
                    case 3:
                        a7.b bVar4 = bVar2;
                        pointF = pointF4;
                        PointF pointF11 = pointF5;
                        boolean z12 = z11;
                        if (cVar.o() == 3) {
                            cVar.b();
                            float f11 = 0.0f;
                            float f12 = 0.0f;
                            float f13 = 0.0f;
                            float f14 = 0.0f;
                            while (cVar.j()) {
                                int q10 = cVar.q(bVar3);
                                if (q10 != 0) {
                                    if (q10 != 1) {
                                        cVar.s();
                                    } else if (cVar.o() == 7) {
                                        f14 = (float) cVar.l();
                                        obj4 = obj4;
                                        f12 = f14;
                                    } else {
                                        obj3 = obj4;
                                        cVar.a();
                                        f12 = (float) cVar.l();
                                        if (cVar.o() == 7) {
                                            f14 = (float) cVar.l();
                                        } else {
                                            f14 = f12;
                                        }
                                        cVar.c();
                                        obj4 = obj3;
                                    }
                                } else {
                                    obj3 = obj4;
                                    if (cVar.o() == 7) {
                                        f13 = (float) cVar.l();
                                        obj4 = obj3;
                                        f11 = f13;
                                    } else {
                                        cVar.a();
                                        f11 = (float) cVar.l();
                                        if (cVar.o() == 7) {
                                            f13 = (float) cVar.l();
                                        } else {
                                            f13 = f11;
                                        }
                                        cVar.c();
                                        obj4 = obj3;
                                    }
                                }
                            }
                            pointF8 = new PointF(f11, f12);
                            pointF9 = new PointF(f13, f14);
                            cVar.h();
                        } else {
                            pointF6 = o.b(cVar, f9);
                        }
                        z11 = z12;
                        bVar2 = bVar4;
                        linearInterpolator = linearInterpolator2;
                        pointF5 = pointF11;
                        pointF4 = pointF;
                        break;
                    case 4:
                        bVar = bVar2;
                        if (cVar.o() == 3) {
                            cVar.b();
                            float f15 = 0.0f;
                            float f16 = 0.0f;
                            float f17 = 0.0f;
                            float f18 = 0.0f;
                            while (cVar.j()) {
                                PointF pointF12 = pointF5;
                                int q11 = cVar.q(bVar3);
                                if (q11 != 0) {
                                    pointF2 = pointF4;
                                    if (q11 != 1) {
                                        cVar.s();
                                    } else if (cVar.o() == 7) {
                                        f18 = (float) cVar.l();
                                        f16 = f18;
                                    } else {
                                        cVar.a();
                                        f16 = (float) cVar.l();
                                        if (cVar.o() == 7) {
                                            z10 = z11;
                                            f18 = (float) cVar.l();
                                        } else {
                                            z10 = z11;
                                            f18 = f16;
                                        }
                                        cVar.c();
                                    }
                                    pointF5 = pointF12;
                                    pointF4 = pointF2;
                                } else {
                                    pointF2 = pointF4;
                                    z10 = z11;
                                    if (cVar.o() == 7) {
                                        f15 = (float) cVar.l();
                                        f17 = f15;
                                    } else {
                                        cVar.a();
                                        f15 = (float) cVar.l();
                                        if (cVar.o() == 7) {
                                            f17 = (float) cVar.l();
                                        } else {
                                            f17 = f15;
                                        }
                                        cVar.c();
                                    }
                                }
                                z11 = z10;
                                pointF5 = pointF12;
                                pointF4 = pointF2;
                            }
                            pointF = pointF4;
                            PointF pointF13 = new PointF(f15, f16);
                            PointF pointF14 = new PointF(f17, f18);
                            cVar.h();
                            pointF3 = pointF14;
                            pointF10 = pointF13;
                        } else {
                            pointF = pointF4;
                            pointF7 = o.b(cVar, f9);
                        }
                        bVar2 = bVar;
                        linearInterpolator = linearInterpolator2;
                        pointF4 = pointF;
                        break;
                    case 5:
                        if (cVar.m() == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        linearInterpolator = linearInterpolator2;
                        break;
                    case 6:
                        pointF4 = o.b(cVar, f9);
                        linearInterpolator = linearInterpolator2;
                        break;
                    case 7:
                        pointF5 = o.b(cVar, f9);
                        linearInterpolator = linearInterpolator2;
                        break;
                    default:
                        cVar.s();
                        linearInterpolator = linearInterpolator2;
                        break;
                }
            }
            LinearInterpolator linearInterpolator3 = linearInterpolator;
            PointF pointF15 = pointF4;
            PointF pointF16 = pointF5;
            boolean z13 = z11;
            Object obj6 = obj4;
            cVar.h();
            if (z13) {
                obj2 = obj6;
            } else {
                if (pointF6 != null && pointF7 != null) {
                    linearInterpolator3 = a(pointF6, pointF7);
                } else if (pointF8 != null && pointF9 != null && pointF10 != null && pointF3 != null) {
                    a9 = a(pointF8, pointF10);
                    a10 = a(pointF9, pointF3);
                    obj2 = obj5;
                    linearInterpolator3 = null;
                    if (a9 == null && a10 != null) {
                        aVar = new I1.a(iVar, obj6, obj2, a9, a10, f10);
                    } else {
                        aVar = new I1.a(iVar, obj6, obj2, linearInterpolator3, f10, (Float) null);
                    }
                    aVar.f1419o = pointF15;
                    aVar.f1420p = pointF16;
                    return aVar;
                }
                obj2 = obj5;
            }
            a9 = null;
            a10 = null;
            if (a9 == null) {
            }
            aVar = new I1.a(iVar, obj6, obj2, linearInterpolator3, f10, (Float) null);
            aVar.f1419o = pointF15;
            aVar.f1420p = pointF16;
            return aVar;
        }
        a7.b bVar5 = bVar2;
        if (z8) {
            cVar.b();
            Object obj7 = null;
            PointF pointF17 = null;
            boolean z14 = false;
            float f19 = 0.0f;
            PointF pointF18 = null;
            PointF pointF19 = null;
            PointF pointF20 = null;
            Object obj8 = null;
            while (cVar.j()) {
                a7.b bVar6 = bVar5;
                switch (cVar.q(bVar6)) {
                    case 0:
                        f19 = (float) cVar.l();
                        break;
                    case 1:
                        obj7 = e4.a(cVar, f9);
                        break;
                    case 2:
                        obj8 = e4.a(cVar, f9);
                        break;
                    case 3:
                        pointF18 = o.b(cVar, 1.0f);
                        break;
                    case 4:
                        pointF17 = o.b(cVar, 1.0f);
                        break;
                    case 5:
                        if (cVar.m() == 1) {
                            z14 = true;
                            break;
                        } else {
                            z14 = false;
                            break;
                        }
                    case 6:
                        pointF19 = o.b(cVar, f9);
                        break;
                    case 7:
                        pointF20 = o.b(cVar, f9);
                        break;
                    default:
                        cVar.s();
                        break;
                }
                bVar5 = bVar6;
            }
            cVar.h();
            if (z14) {
                obj = obj7;
            } else {
                if (pointF18 != null && pointF17 != null) {
                    a6 = a(pointF18, pointF17);
                    obj = obj8;
                    I1.a aVar2 = new I1.a(iVar, obj7, obj, a6, f19, (Float) null);
                    aVar2.f1419o = pointF19;
                    aVar2.f1420p = pointF20;
                    return aVar2;
                }
                obj = obj8;
            }
            a6 = linearInterpolator;
            I1.a aVar22 = new I1.a(iVar, obj7, obj, a6, f19, (Float) null);
            aVar22.f1419o = pointF19;
            aVar22.f1420p = pointF20;
            return aVar22;
        }
        return new I1.a(e4.a(cVar, f9));
    }
}
