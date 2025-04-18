package o3;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import m3.a0;
import m3.x;

/* loaded from: classes.dex */
public final class o implements n, p3.a, l {

    /* renamed from: e, reason: collision with root package name */
    public final String f23080e;

    /* renamed from: f, reason: collision with root package name */
    public final x f23081f;

    /* renamed from: g, reason: collision with root package name */
    public final int f23082g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f23083h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f23084i;

    /* renamed from: j, reason: collision with root package name */
    public final p3.h f23085j;

    /* renamed from: k, reason: collision with root package name */
    public final p3.d f23086k;

    /* renamed from: l, reason: collision with root package name */
    public final p3.h f23087l;

    /* renamed from: m, reason: collision with root package name */
    public final p3.h f23088m;

    /* renamed from: n, reason: collision with root package name */
    public final p3.h f23089n;

    /* renamed from: o, reason: collision with root package name */
    public final p3.h f23090o;

    /* renamed from: p, reason: collision with root package name */
    public final p3.h f23091p;

    /* renamed from: r, reason: collision with root package name */
    public boolean f23093r;
    public final Path a = new Path();

    /* renamed from: b, reason: collision with root package name */
    public final Path f23077b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final PathMeasure f23078c = new PathMeasure();

    /* renamed from: d, reason: collision with root package name */
    public final float[] f23079d = new float[2];

    /* renamed from: q, reason: collision with root package name */
    public final c f23092q = new c(0);

    public o(x xVar, u3.b bVar, t3.h hVar) {
        this.f23081f = xVar;
        this.f23080e = hVar.a;
        int i10 = hVar.f25219b;
        this.f23082g = i10;
        this.f23083h = hVar.f25227j;
        this.f23084i = hVar.f25228k;
        p3.d a = hVar.f25220c.a();
        this.f23085j = (p3.h) a;
        p3.d a10 = hVar.f25221d.a();
        this.f23086k = a10;
        p3.d a11 = hVar.f25222e.a();
        this.f23087l = (p3.h) a11;
        p3.d a12 = hVar.f25224g.a();
        this.f23089n = (p3.h) a12;
        p3.d a13 = hVar.f25226i.a();
        this.f23091p = (p3.h) a13;
        if (i10 == 1) {
            this.f23088m = (p3.h) hVar.f25223f.a();
            this.f23090o = (p3.h) hVar.f25225h.a();
        } else {
            this.f23088m = null;
            this.f23090o = null;
        }
        bVar.f(a);
        bVar.f(a10);
        bVar.f(a11);
        bVar.f(a12);
        bVar.f(a13);
        if (i10 == 1) {
            bVar.f(this.f23088m);
            bVar.f(this.f23090o);
        }
        a.a(this);
        a10.a(this);
        a11.a(this);
        a12.a(this);
        a13.a(this);
        if (i10 == 1) {
            this.f23088m.a(this);
            this.f23090o.a(this);
        }
    }

    @Override // p3.a
    public final void a() {
        this.f23093r = false;
        this.f23081f.invalidateSelf();
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
                        this.f23092q.a.add(uVar);
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
        p3.h hVar;
        p3.h hVar2;
        if (obj == a0.f21517w) {
            this.f23085j.k(cVar);
            return;
        }
        if (obj == a0.f21518x) {
            this.f23087l.k(cVar);
            return;
        }
        if (obj == a0.f21509n) {
            this.f23086k.k(cVar);
            return;
        }
        if (obj == a0.f21519y && (hVar2 = this.f23088m) != null) {
            hVar2.k(cVar);
            return;
        }
        if (obj == a0.f21520z) {
            this.f23089n.k(cVar);
            return;
        }
        if (obj == a0.A && (hVar = this.f23090o) != null) {
            hVar.k(cVar);
        } else if (obj == a0.B) {
            this.f23091p.k(cVar);
        }
    }

    @Override // o3.d
    public final String getName() {
        return this.f23080e;
    }

    @Override // o3.n
    public final Path z() {
        double floatValue;
        float f10;
        float f11;
        float cos;
        float sin;
        float f12;
        double d10;
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
        double floatValue2;
        double d11;
        boolean z10 = this.f23093r;
        Path path = this.a;
        if (z10) {
            return path;
        }
        path.reset();
        if (this.f23083h) {
            this.f23093r = true;
            return path;
        }
        int b3 = t.h.b(this.f23082g);
        p3.d dVar = this.f23086k;
        p3.h hVar = this.f23091p;
        p3.h hVar2 = this.f23089n;
        p3.h hVar3 = this.f23087l;
        p3.h hVar4 = this.f23085j;
        if (b3 != 0) {
            if (b3 == 1) {
                int floor = (int) Math.floor(((Float) hVar4.f()).floatValue());
                if (hVar3 == null) {
                    floatValue2 = 0.0d;
                } else {
                    floatValue2 = ((Float) hVar3.f()).floatValue();
                }
                double radians = Math.toRadians(floatValue2 - 90.0d);
                double d12 = floor;
                float floatValue3 = ((Float) hVar.f()).floatValue() / 100.0f;
                float floatValue4 = ((Float) hVar2.f()).floatValue();
                double d13 = floatValue4;
                float cos2 = (float) (Math.cos(radians) * d13);
                float sin2 = (float) (Math.sin(radians) * d13);
                path.moveTo(cos2, sin2);
                double d14 = (float) (6.283185307179586d / d12);
                double d15 = radians + d14;
                double ceil = Math.ceil(d12);
                int i10 = 0;
                while (true) {
                    double d16 = i10;
                    if (d16 >= ceil) {
                        break;
                    }
                    int i11 = i10;
                    float cos3 = (float) (Math.cos(d15) * d13);
                    p3.d dVar2 = dVar;
                    double d17 = d15;
                    float sin3 = (float) (Math.sin(d15) * d13);
                    if (floatValue3 != 0.0f) {
                        double d18 = d13;
                        double atan2 = (float) (Math.atan2(sin2, cos2) - 1.5707963267948966d);
                        float cos4 = (float) Math.cos(atan2);
                        float sin4 = (float) Math.sin(atan2);
                        Path path2 = path;
                        double atan22 = (float) (Math.atan2(sin3, cos3) - 1.5707963267948966d);
                        float f26 = floatValue4 * floatValue3 * 0.25f;
                        float f27 = cos4 * f26;
                        float f28 = sin4 * f26;
                        float cos5 = ((float) Math.cos(atan22)) * f26;
                        float sin5 = f26 * ((float) Math.sin(atan22));
                        if (d16 == ceil - 1.0d) {
                            Path path3 = this.f23077b;
                            path3.reset();
                            path3.moveTo(cos2, sin2);
                            float f29 = cos2 - f27;
                            float f30 = sin2 - f28;
                            float f31 = cos5 + cos3;
                            float f32 = sin5 + sin3;
                            path3.cubicTo(f29, f30, f31, f32, cos3, sin3);
                            PathMeasure pathMeasure = this.f23078c;
                            pathMeasure.setPath(path3, false);
                            float length = pathMeasure.getLength() * 0.9999f;
                            float[] fArr = this.f23079d;
                            pathMeasure.getPosTan(length, fArr, null);
                            d11 = d18;
                            path2.cubicTo(f29, f30, f31, f32, fArr[0], fArr[1]);
                        } else {
                            d11 = d18;
                            path2.cubicTo(cos2 - f27, sin2 - f28, cos3 + cos5, sin5 + sin3, cos3, sin3);
                        }
                        path = path2;
                    } else {
                        d11 = d13;
                        Path path4 = path;
                        if (d16 == ceil - 1.0d) {
                            d15 = d17;
                            path = path4;
                            cos2 = cos3;
                            i10 = i11 + 1;
                            sin2 = sin3;
                            d13 = d11;
                            dVar = dVar2;
                        } else {
                            path = path4;
                            path.lineTo(cos3, sin3);
                        }
                    }
                    d15 = d17 + d14;
                    cos2 = cos3;
                    i10 = i11 + 1;
                    sin2 = sin3;
                    d13 = d11;
                    dVar = dVar2;
                }
                PointF pointF = (PointF) dVar.f();
                path.offset(pointF.x, pointF.y);
                path.close();
            }
        } else {
            float floatValue5 = ((Float) hVar4.f()).floatValue();
            if (hVar3 == null) {
                floatValue = 0.0d;
            } else {
                floatValue = ((Float) hVar3.f()).floatValue();
            }
            double radians2 = Math.toRadians(floatValue - 90.0d);
            double d19 = floatValue5;
            float f33 = (float) (6.283185307179586d / d19);
            if (this.f23084i) {
                f33 *= -1.0f;
            }
            float f34 = f33;
            float f35 = f34 / 2.0f;
            float f36 = floatValue5 - ((int) floatValue5);
            if (f36 != 0.0f) {
                radians2 += (1.0f - f36) * f35;
            }
            float floatValue6 = ((Float) hVar2.f()).floatValue();
            float floatValue7 = ((Float) this.f23088m.f()).floatValue();
            p3.h hVar5 = this.f23090o;
            if (hVar5 != null) {
                f10 = ((Float) hVar5.f()).floatValue() / 100.0f;
            } else {
                f10 = 0.0f;
            }
            float f37 = f10;
            if (hVar != null) {
                f11 = ((Float) hVar.f()).floatValue() / 100.0f;
            } else {
                f11 = 0.0f;
            }
            float f38 = f11;
            if (f36 != 0.0f) {
                float b10 = vd.e.b(floatValue6, floatValue7, f36, floatValue7);
                double d20 = b10;
                cos = (float) (Math.cos(radians2) * d20);
                float sin6 = (float) (d20 * Math.sin(radians2));
                path.moveTo(cos, sin6);
                d10 = radians2 + ((f34 * f36) / 2.0f);
                sin = sin6;
                f12 = floatValue6;
                f13 = b10;
            } else {
                double d21 = floatValue6;
                cos = (float) (Math.cos(radians2) * d21);
                sin = (float) (d21 * Math.sin(radians2));
                path.moveTo(cos, sin);
                f12 = floatValue6;
                d10 = radians2 + f35;
                f13 = 0.0f;
            }
            double ceil2 = Math.ceil(d19) * 2.0d;
            float f39 = floatValue7;
            double d22 = d10;
            int i12 = 0;
            boolean z11 = false;
            while (true) {
                double d23 = i12;
                if (d23 >= ceil2) {
                    break;
                }
                if (z11) {
                    f14 = f12;
                } else {
                    f14 = f39;
                }
                if (f13 != 0.0f && d23 == ceil2 - 2.0d) {
                    f15 = f13;
                    f16 = (f34 * f36) / 2.0f;
                } else {
                    f15 = f13;
                    f16 = f35;
                }
                if (f13 != 0.0f && d23 == ceil2 - 1.0d) {
                    f17 = f34;
                    f18 = f35;
                    f14 = f15;
                } else {
                    f17 = f34;
                    f18 = f35;
                }
                double d24 = f14;
                float f40 = f16;
                float cos6 = (float) (Math.cos(d22) * d24);
                float sin7 = (float) (Math.sin(d22) * d24);
                if (f37 == 0.0f && f38 == 0.0f) {
                    path.lineTo(cos6, sin7);
                    f23 = f39;
                    f24 = f36;
                    f25 = f40;
                } else {
                    float f41 = sin;
                    double atan23 = (float) (Math.atan2(sin, cos) - 1.5707963267948966d);
                    float cos7 = (float) Math.cos(atan23);
                    float sin8 = (float) Math.sin(atan23);
                    float f42 = cos;
                    float f43 = f39;
                    double atan24 = (float) (Math.atan2(sin7, cos6) - 1.5707963267948966d);
                    float cos8 = (float) Math.cos(atan24);
                    float sin9 = (float) Math.sin(atan24);
                    if (z11) {
                        f19 = f37;
                    } else {
                        f19 = f38;
                    }
                    if (z11) {
                        f20 = f38;
                    } else {
                        f20 = f37;
                    }
                    if (z11) {
                        f21 = f43;
                    } else {
                        f21 = f12;
                    }
                    if (z11) {
                        f22 = f12;
                    } else {
                        f22 = f43;
                    }
                    float f44 = f21 * f19 * 0.47829f;
                    float f45 = cos7 * f44;
                    float f46 = f44 * sin8;
                    float f47 = f22 * f20 * 0.47829f;
                    float f48 = cos8 * f47;
                    float f49 = f47 * sin9;
                    if (f36 != 0.0f) {
                        if (i12 == 0) {
                            f45 *= f36;
                            f46 *= f36;
                        } else if (d23 == ceil2 - 1.0d) {
                            f48 *= f36;
                            f49 *= f36;
                        }
                    }
                    f23 = f43;
                    f24 = f36;
                    path.cubicTo(f42 - f45, f41 - f46, f48 + cos6, sin7 + f49, cos6, sin7);
                    f25 = f40;
                }
                d22 += f25;
                z11 = !z11;
                i12++;
                cos = cos6;
                sin = sin7;
                f39 = f23;
                f36 = f24;
                f13 = f15;
                f35 = f18;
                f34 = f17;
            }
            PointF pointF2 = (PointF) dVar.f();
            path.offset(pointF2.x, pointF2.y);
            path.close();
        }
        path.close();
        this.f23092q.a(path);
        this.f23093r = true;
        return path;
    }
}
