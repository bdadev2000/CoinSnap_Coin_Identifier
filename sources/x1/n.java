package x1;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import v1.v;
import v1.y;
import x0.AbstractC2914a;
import y1.InterfaceC2942a;
import z.AbstractC2965e;

/* loaded from: classes.dex */
public final class n implements m, InterfaceC2942a, k {

    /* renamed from: e, reason: collision with root package name */
    public final String f24168e;

    /* renamed from: f, reason: collision with root package name */
    public final v f24169f;

    /* renamed from: g, reason: collision with root package name */
    public final int f24170g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f24171h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f24172i;

    /* renamed from: j, reason: collision with root package name */
    public final y1.i f24173j;

    /* renamed from: k, reason: collision with root package name */
    public final y1.e f24174k;
    public final y1.i l;
    public final y1.i m;

    /* renamed from: n, reason: collision with root package name */
    public final y1.i f24175n;

    /* renamed from: o, reason: collision with root package name */
    public final y1.i f24176o;

    /* renamed from: p, reason: collision with root package name */
    public final y1.i f24177p;

    /* renamed from: r, reason: collision with root package name */
    public boolean f24179r;

    /* renamed from: a, reason: collision with root package name */
    public final Path f24165a = new Path();
    public final Path b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final PathMeasure f24166c = new PathMeasure();

    /* renamed from: d, reason: collision with root package name */
    public final float[] f24167d = new float[2];

    /* renamed from: q, reason: collision with root package name */
    public final J1.k f24178q = new J1.k(4);

    public n(v vVar, D1.b bVar, C1.h hVar) {
        this.f24169f = vVar;
        this.f24168e = hVar.f447a;
        int i9 = hVar.b;
        this.f24170g = i9;
        this.f24171h = hVar.f455j;
        this.f24172i = hVar.f456k;
        y1.e g9 = hVar.f448c.g();
        this.f24173j = (y1.i) g9;
        y1.e g10 = hVar.f449d.g();
        this.f24174k = g10;
        y1.e g11 = hVar.f450e.g();
        this.l = (y1.i) g11;
        y1.e g12 = hVar.f452g.g();
        this.f24175n = (y1.i) g12;
        y1.e g13 = hVar.f454i.g();
        this.f24177p = (y1.i) g13;
        if (i9 == 1) {
            this.m = (y1.i) hVar.f451f.g();
            this.f24176o = (y1.i) hVar.f453h.g();
        } else {
            this.m = null;
            this.f24176o = null;
        }
        bVar.d(g9);
        bVar.d(g10);
        bVar.d(g11);
        bVar.d(g12);
        bVar.d(g13);
        if (i9 == 1) {
            bVar.d(this.m);
            bVar.d(this.f24176o);
        }
        g9.a(this);
        g10.a(this);
        g11.a(this);
        g12.a(this);
        g13.a(this);
        if (i9 == 1) {
            this.m.a(this);
            this.f24176o.a(this);
        }
    }

    @Override // y1.InterfaceC2942a
    public final void a() {
        this.f24179r = false;
        this.f24169f.invalidateSelf();
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
                        this.f24178q.f1526a.add(tVar);
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
        float f9;
        float f10;
        double d2;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        float f27;
        float f28;
        int i9;
        double d9;
        float f29;
        boolean z8 = this.f24179r;
        Path path = this.f24165a;
        if (z8) {
            return path;
        }
        path.reset();
        if (this.f24171h) {
            this.f24179r = true;
            return path;
        }
        int d10 = AbstractC2965e.d(this.f24170g);
        y1.e eVar = this.f24174k;
        y1.i iVar = this.f24175n;
        y1.i iVar2 = this.f24177p;
        double d11 = 0.0d;
        y1.i iVar3 = this.l;
        y1.i iVar4 = this.f24173j;
        if (d10 != 0) {
            if (d10 == 1) {
                int floor = (int) Math.floor(((Float) iVar4.e()).floatValue());
                if (iVar3 != null) {
                    d11 = ((Float) iVar3.e()).floatValue();
                }
                double radians = Math.toRadians(d11 - 90.0d);
                double d12 = floor;
                float floatValue = ((Float) iVar2.e()).floatValue() / 100.0f;
                float floatValue2 = ((Float) iVar.e()).floatValue();
                double d13 = floatValue2;
                float cos = (float) (Math.cos(radians) * d13);
                float sin = (float) (Math.sin(radians) * d13);
                path.moveTo(cos, sin);
                double d14 = (float) (6.283185307179586d / d12);
                double ceil = Math.ceil(d12);
                double d15 = radians + d14;
                int i10 = 0;
                while (true) {
                    double d16 = i10;
                    if (d16 >= ceil) {
                        break;
                    }
                    float cos2 = (float) (Math.cos(d15) * d13);
                    double d17 = d14;
                    float sin2 = (float) (Math.sin(d15) * d13);
                    if (floatValue != 0.0f) {
                        d9 = d13;
                        double atan2 = (float) (Math.atan2(sin, cos) - 1.5707963267948966d);
                        float cos3 = (float) Math.cos(atan2);
                        float sin3 = (float) Math.sin(atan2);
                        i9 = i10;
                        float f30 = cos;
                        double atan22 = (float) (Math.atan2(sin2, cos2) - 1.5707963267948966d);
                        float f31 = floatValue2 * floatValue * 0.25f;
                        float f32 = cos3 * f31;
                        float f33 = sin3 * f31;
                        float cos4 = ((float) Math.cos(atan22)) * f31;
                        float sin4 = f31 * ((float) Math.sin(atan22));
                        if (d16 == ceil - 1.0d) {
                            Path path2 = this.b;
                            path2.reset();
                            path2.moveTo(f30, sin);
                            float f34 = f30 - f32;
                            float f35 = sin - f33;
                            float f36 = cos4 + cos2;
                            float f37 = sin2 + sin4;
                            path2.cubicTo(f34, f35, f36, f37, cos2, sin2);
                            PathMeasure pathMeasure = this.f24166c;
                            pathMeasure.setPath(path2, false);
                            float length = pathMeasure.getLength() * 0.9999f;
                            f29 = floatValue2;
                            float[] fArr = this.f24167d;
                            pathMeasure.getPosTan(length, fArr, null);
                            path.cubicTo(f34, f35, f36, f37, fArr[0], fArr[1]);
                        } else {
                            f29 = floatValue2;
                            path.cubicTo(f30 - f32, sin - f33, cos2 + cos4, sin2 + sin4, cos2, sin2);
                        }
                    } else {
                        i9 = i10;
                        d9 = d13;
                        f29 = floatValue2;
                        if (d16 != ceil - 1.0d) {
                            path.lineTo(cos2, sin2);
                        } else {
                            i10 = i9 + 1;
                            cos = cos2;
                            sin = sin2;
                            floatValue2 = f29;
                            d13 = d9;
                            d14 = d17;
                        }
                    }
                    d15 += d17;
                    i10 = i9 + 1;
                    cos = cos2;
                    sin = sin2;
                    floatValue2 = f29;
                    d13 = d9;
                    d14 = d17;
                }
                PointF pointF = (PointF) eVar.e();
                path.offset(pointF.x, pointF.y);
                path.close();
            }
        } else {
            float floatValue3 = ((Float) iVar4.e()).floatValue();
            if (iVar3 != null) {
                d11 = ((Float) iVar3.e()).floatValue();
            }
            double radians2 = Math.toRadians(d11 - 90.0d);
            double d18 = floatValue3;
            float f38 = (float) (6.283185307179586d / d18);
            if (this.f24172i) {
                f38 *= -1.0f;
            }
            float f39 = f38;
            float f40 = 2.0f;
            float f41 = f39 / 2.0f;
            float f42 = floatValue3 - ((int) floatValue3);
            if (f42 != 0.0f) {
                radians2 += (1.0f - f42) * f41;
            }
            float floatValue4 = ((Float) iVar.e()).floatValue();
            float floatValue5 = ((Float) this.m.e()).floatValue();
            y1.i iVar5 = this.f24176o;
            if (iVar5 != null) {
                f9 = ((Float) iVar5.e()).floatValue() / 100.0f;
            } else {
                f9 = 0.0f;
            }
            if (iVar2 != null) {
                f10 = ((Float) iVar2.e()).floatValue() / 100.0f;
            } else {
                f10 = 0.0f;
            }
            if (f42 != 0.0f) {
                float a6 = AbstractC2914a.a(floatValue4, floatValue5, f42, floatValue5);
                double d19 = a6;
                f13 = a6;
                f11 = (float) (Math.cos(radians2) * d19);
                f12 = (float) (Math.sin(radians2) * d19);
                path.moveTo(f11, f12);
                d2 = radians2 + ((f39 * f42) / 2.0f);
            } else {
                double d20 = floatValue4;
                float cos5 = (float) (Math.cos(radians2) * d20);
                float sin5 = (float) (d20 * Math.sin(radians2));
                path.moveTo(cos5, sin5);
                d2 = radians2 + f41;
                f11 = cos5;
                f12 = sin5;
                f13 = 0.0f;
            }
            double ceil2 = Math.ceil(d18);
            double d21 = 2.0d;
            double d22 = ceil2 * 2.0d;
            double d23 = d2;
            int i11 = 0;
            boolean z9 = false;
            while (true) {
                double d24 = i11;
                if (d24 >= d22) {
                    break;
                }
                if (z9) {
                    f14 = floatValue4;
                } else {
                    f14 = floatValue5;
                }
                if (f13 != 0.0f && d24 == d22 - d21) {
                    f15 = (f39 * f42) / f40;
                } else {
                    f15 = f41;
                }
                if (f13 != 0.0f && d24 == d22 - 1.0d) {
                    f16 = floatValue5;
                    f17 = floatValue4;
                    f14 = f13;
                } else {
                    f16 = floatValue5;
                    f17 = floatValue4;
                }
                double d25 = f14;
                float f43 = f17;
                float f44 = f39;
                float cos6 = (float) (Math.cos(d23) * d25);
                float sin6 = (float) (d25 * Math.sin(d23));
                if (f9 == 0.0f && f10 == 0.0f) {
                    path.lineTo(cos6, sin6);
                    f18 = f44;
                    f19 = sin6;
                    f24 = f16;
                    f25 = f43;
                    f26 = f41;
                    f28 = f15;
                    f27 = f42;
                } else {
                    f18 = f44;
                    float f45 = f15;
                    double atan23 = (float) (Math.atan2(f12, f11) - 1.5707963267948966d);
                    float cos7 = (float) Math.cos(atan23);
                    float sin7 = (float) Math.sin(atan23);
                    float f46 = f41;
                    f19 = sin6;
                    double atan24 = (float) (Math.atan2(sin6, cos6) - 1.5707963267948966d);
                    float cos8 = (float) Math.cos(atan24);
                    float sin8 = (float) Math.sin(atan24);
                    if (z9) {
                        f20 = f9;
                    } else {
                        f20 = f10;
                    }
                    if (z9) {
                        f21 = f10;
                    } else {
                        f21 = f9;
                    }
                    if (z9) {
                        f22 = f16;
                    } else {
                        f22 = f43;
                    }
                    if (z9) {
                        f23 = f43;
                    } else {
                        f23 = f16;
                    }
                    float f47 = f22 * f20 * 0.47829f;
                    float f48 = cos7 * f47;
                    float f49 = f47 * sin7;
                    float f50 = f23 * f21 * 0.47829f;
                    float f51 = cos8 * f50;
                    float f52 = f50 * sin8;
                    if (f42 != 0.0f) {
                        if (i11 == 0) {
                            f48 *= f42;
                            f49 *= f42;
                        } else {
                            if (d24 == d22 - 1.0d) {
                                f51 *= f42;
                                f52 *= f42;
                            }
                            f24 = f16;
                            f25 = f43;
                            f26 = f46;
                            f27 = f42;
                            path.cubicTo(f11 - f48, f12 - f49, cos6 + f51, f19 + f52, cos6, f19);
                            f28 = f45;
                        }
                    }
                    f24 = f16;
                    f25 = f43;
                    f26 = f46;
                    f27 = f42;
                    path.cubicTo(f11 - f48, f12 - f49, cos6 + f51, f19 + f52, cos6, f19);
                    f28 = f45;
                }
                d23 += f28;
                z9 = !z9;
                i11++;
                floatValue5 = f24;
                floatValue4 = f25;
                f42 = f27;
                f11 = cos6;
                f41 = f26;
                f39 = f18;
                f12 = f19;
                d21 = 2.0d;
                f40 = 2.0f;
            }
            PointF pointF2 = (PointF) eVar.e();
            path.offset(pointF2.x, pointF2.y);
            path.close();
        }
        path.close();
        this.f24178q.d(path);
        this.f24179r = true;
        return path;
    }

    @Override // A1.f
    public final void g(E1.d dVar, Object obj) {
        y1.i iVar;
        y1.i iVar2;
        if (obj == y.f23592r) {
            this.f24173j.j(dVar);
            return;
        }
        if (obj == y.f23593s) {
            this.l.j(dVar);
            return;
        }
        if (obj == y.f23585i) {
            this.f24174k.j(dVar);
            return;
        }
        if (obj == y.f23594t && (iVar2 = this.m) != null) {
            iVar2.j(dVar);
            return;
        }
        if (obj == y.f23595u) {
            this.f24175n.j(dVar);
            return;
        }
        if (obj == y.f23596v && (iVar = this.f24176o) != null) {
            iVar.j(dVar);
        } else if (obj == y.f23597w) {
            this.f24177p.j(dVar);
        }
    }

    @Override // x1.c
    public final String getName() {
        return this.f24168e;
    }

    @Override // A1.f
    public final void h(A1.e eVar, int i9, ArrayList arrayList, A1.e eVar2) {
        H1.g.f(eVar, i9, arrayList, eVar2, this);
    }
}
