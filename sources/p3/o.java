package p3;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class o extends d {

    /* renamed from: i, reason: collision with root package name */
    public final t3.k f23384i;

    /* renamed from: j, reason: collision with root package name */
    public final Path f23385j;

    /* renamed from: k, reason: collision with root package name */
    public Path f23386k;

    /* renamed from: l, reason: collision with root package name */
    public Path f23387l;

    /* renamed from: m, reason: collision with root package name */
    public List f23388m;

    public o(List list) {
        super(list);
        this.f23384i = new t3.k();
        this.f23385j = new Path();
    }

    @Override // p3.d
    public final Object g(z3.a aVar, float f10) {
        t3.k kVar;
        boolean z10;
        t3.k kVar2;
        t3.k kVar3;
        o oVar;
        t3.k kVar4;
        t3.k kVar5;
        Path path;
        t3.k kVar6;
        t3.k kVar7;
        int i10;
        int i11;
        PointF pointF;
        boolean z11;
        PointF pointF2;
        t3.k kVar8;
        boolean z12;
        int i12;
        int i13;
        t3.k kVar9;
        ArrayList arrayList;
        int i14;
        PointF pointF3;
        PointF pointF4;
        boolean z13;
        o oVar2 = this;
        t3.k kVar10 = (t3.k) aVar.f28472b;
        t3.k kVar11 = (t3.k) aVar.f28473c;
        if (kVar11 == null) {
            kVar = kVar10;
        } else {
            kVar = kVar11;
        }
        t3.k kVar12 = oVar2.f23384i;
        if (kVar12.f25234b == null) {
            kVar12.f25234b = new PointF();
        }
        if (!kVar10.f25235c && !kVar.f25235c) {
            z10 = false;
        } else {
            z10 = true;
        }
        kVar12.f25235c = z10;
        ArrayList arrayList2 = kVar10.a;
        int size = arrayList2.size();
        int size2 = kVar.a.size();
        ArrayList arrayList3 = kVar.a;
        if (size != size2) {
            y3.b.b("Curves must have the same number of control points. Shape 1: " + arrayList2.size() + "\tShape 2: " + arrayList3.size());
        }
        int min = Math.min(arrayList2.size(), arrayList3.size());
        ArrayList arrayList4 = kVar12.a;
        if (arrayList4.size() < min) {
            for (int size3 = arrayList4.size(); size3 < min; size3++) {
                arrayList4.add(new r3.a());
            }
        } else if (arrayList4.size() > min) {
            for (int size4 = arrayList4.size() - 1; size4 >= min; size4--) {
                arrayList4.remove(arrayList4.size() - 1);
            }
        }
        PointF pointF5 = kVar10.f25234b;
        PointF pointF6 = kVar.f25234b;
        float f11 = pointF5.x;
        float f12 = pointF6.x;
        PointF pointF7 = y3.f.a;
        float b3 = vd.e.b(f12, f11, f10, f11);
        float f13 = pointF5.y;
        kVar12.a(b3, ((pointF6.y - f13) * f10) + f13);
        int size5 = arrayList4.size() - 1;
        while (size5 >= 0) {
            r3.a aVar2 = (r3.a) arrayList2.get(size5);
            r3.a aVar3 = (r3.a) arrayList3.get(size5);
            PointF pointF8 = aVar2.a;
            PointF pointF9 = aVar3.a;
            r3.a aVar4 = (r3.a) arrayList4.get(size5);
            float f14 = pointF8.x;
            t3.k kVar13 = kVar12;
            float b10 = vd.e.b(pointF9.x, f14, f10, f14);
            float f15 = pointF8.y;
            aVar4.a.set(b10, vd.e.b(pointF9.y, f15, f10, f15));
            r3.a aVar5 = (r3.a) arrayList4.get(size5);
            PointF pointF10 = aVar2.f23969b;
            float f16 = pointF10.x;
            PointF pointF11 = aVar3.f23969b;
            float b11 = vd.e.b(pointF11.x, f16, f10, f16);
            float f17 = pointF10.y;
            aVar5.f23969b.set(b11, vd.e.b(pointF11.y, f17, f10, f17));
            r3.a aVar6 = (r3.a) arrayList4.get(size5);
            PointF pointF12 = aVar2.f23970c;
            float f18 = pointF12.x;
            PointF pointF13 = aVar3.f23970c;
            float b12 = vd.e.b(pointF13.x, f18, f10, f18);
            float f19 = pointF12.y;
            aVar6.f23970c.set(b12, vd.e.b(pointF13.y, f19, f10, f19));
            size5--;
            kVar12 = kVar13;
        }
        t3.k kVar14 = kVar12;
        List list = oVar2.f23388m;
        if (list != null) {
            int size6 = list.size() - 1;
            kVar4 = kVar14;
            while (size6 >= 0) {
                o3.r rVar = (o3.r) oVar2.f23388m.get(size6);
                rVar.getClass();
                ArrayList arrayList5 = kVar4.a;
                if (arrayList5.size() > 2) {
                    float floatValue = ((Float) rVar.f23113b.f()).floatValue();
                    if (floatValue != 0.0f) {
                        ArrayList arrayList6 = kVar4.a;
                        boolean z14 = kVar4.f25235c;
                        int size7 = arrayList6.size() - 1;
                        int i15 = 0;
                        while (size7 >= 0) {
                            r3.a aVar7 = (r3.a) arrayList6.get(size7);
                            int i16 = size7 - 1;
                            r3.a aVar8 = (r3.a) arrayList6.get(o3.r.c(i16, arrayList6.size()));
                            if (size7 == 0 && !z14) {
                                i14 = i16;
                                pointF3 = kVar4.f25234b;
                            } else {
                                i14 = i16;
                                pointF3 = aVar8.f23970c;
                            }
                            if (size7 == 0 && !z14) {
                                pointF4 = pointF3;
                            } else {
                                pointF4 = aVar8.f23969b;
                            }
                            PointF pointF14 = aVar7.a;
                            if (!kVar4.f25235c && (size7 == 0 || size7 == arrayList6.size() - 1)) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (pointF4.equals(pointF3) && pointF14.equals(pointF3) && !z13) {
                                i15 += 2;
                            } else {
                                i15++;
                            }
                            size7 = i14;
                        }
                        t3.k kVar15 = rVar.f23114c;
                        if (kVar15 != null && kVar15.a.size() == i15) {
                            i11 = 0;
                        } else {
                            ArrayList arrayList7 = new ArrayList(i15);
                            for (int i17 = 0; i17 < i15; i17++) {
                                arrayList7.add(new r3.a());
                            }
                            rVar.f23114c = new t3.k(new PointF(0.0f, 0.0f), false, arrayList7);
                            i11 = 0;
                        }
                        t3.k kVar16 = rVar.f23114c;
                        kVar16.f25235c = z14;
                        PointF pointF15 = kVar4.f25234b;
                        kVar16.a(pointF15.x, pointF15.y);
                        ArrayList arrayList8 = kVar16.a;
                        boolean z15 = kVar4.f25235c;
                        int i18 = i11;
                        while (i11 < arrayList5.size()) {
                            r3.a aVar9 = (r3.a) arrayList5.get(i11);
                            r3.a aVar10 = (r3.a) arrayList5.get(o3.r.c(i11 - 1, arrayList5.size()));
                            r3.a aVar11 = (r3.a) arrayList5.get(o3.r.c(i11 - 2, arrayList5.size()));
                            if (i11 == 0 && !z15) {
                                pointF = kVar4.f25234b;
                            } else {
                                pointF = aVar10.f23970c;
                            }
                            if (i11 == 0 && !z15) {
                                kVar8 = kVar11;
                                z11 = z15;
                                pointF2 = pointF;
                            } else {
                                z11 = z15;
                                pointF2 = aVar10.f23969b;
                                kVar8 = kVar11;
                            }
                            PointF pointF16 = aVar9.a;
                            PointF pointF17 = aVar11.f23970c;
                            t3.k kVar17 = kVar10;
                            if (!kVar4.f25235c && (i11 == 0 || i11 == arrayList5.size() - 1)) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (pointF2.equals(pointF) && pointF16.equals(pointF) && !z12) {
                                float f20 = pointF.x;
                                float f21 = f20 - pointF17.x;
                                float f22 = pointF.y;
                                float f23 = f22 - pointF17.y;
                                PointF pointF18 = aVar9.f23970c;
                                kVar9 = kVar4;
                                float f24 = pointF18.x - f20;
                                float f25 = pointF18.y - f22;
                                i13 = size6;
                                i12 = i11;
                                float hypot = (float) Math.hypot(f21, f23);
                                float hypot2 = (float) Math.hypot(f24, f25);
                                float min2 = Math.min(floatValue / hypot, 0.5f);
                                float min3 = Math.min(floatValue / hypot2, 0.5f);
                                float f26 = pointF.x;
                                float b13 = vd.e.b(pointF17.x, f26, min2, f26);
                                float f27 = pointF.y;
                                float b14 = vd.e.b(pointF17.y, f27, min2, f27);
                                float b15 = vd.e.b(pointF18.x, f26, min3, f26);
                                float b16 = vd.e.b(pointF18.y, f27, min3, f27);
                                float f28 = b13 - ((b13 - f26) * 0.5519f);
                                float f29 = b14 - ((b14 - f27) * 0.5519f);
                                float f30 = b15 - ((b15 - f26) * 0.5519f);
                                float f31 = b16 - ((b16 - f27) * 0.5519f);
                                r3.a aVar12 = (r3.a) arrayList8.get(o3.r.c(i18 - 1, arrayList8.size()));
                                r3.a aVar13 = (r3.a) arrayList8.get(i18);
                                arrayList = arrayList5;
                                aVar12.f23969b.set(b13, b14);
                                aVar12.f23970c.set(b13, b14);
                                if (i12 == 0) {
                                    kVar16.a(b13, b14);
                                }
                                aVar13.a.set(f28, f29);
                                i18++;
                                r3.a aVar14 = (r3.a) arrayList8.get(i18);
                                aVar13.f23969b.set(f30, f31);
                                aVar13.f23970c.set(b15, b16);
                                aVar14.a.set(b15, b16);
                            } else {
                                i12 = i11;
                                i13 = size6;
                                kVar9 = kVar4;
                                arrayList = arrayList5;
                                r3.a aVar15 = (r3.a) arrayList8.get(o3.r.c(i18 - 1, arrayList8.size()));
                                r3.a aVar16 = (r3.a) arrayList8.get(i18);
                                PointF pointF19 = aVar10.f23969b;
                                aVar15.f23969b.set(pointF19.x, pointF19.y);
                                PointF pointF20 = aVar10.f23970c;
                                aVar15.f23970c.set(pointF20.x, pointF20.y);
                                PointF pointF21 = aVar9.a;
                                aVar16.a.set(pointF21.x, pointF21.y);
                            }
                            i18++;
                            i11 = i12 + 1;
                            size6 = i13;
                            z15 = z11;
                            kVar11 = kVar8;
                            kVar10 = kVar17;
                            kVar4 = kVar9;
                            arrayList5 = arrayList;
                        }
                        kVar6 = kVar10;
                        kVar7 = kVar11;
                        i10 = size6;
                        kVar4 = kVar16;
                        size6 = i10 - 1;
                        oVar2 = this;
                        kVar11 = kVar7;
                        kVar10 = kVar6;
                    }
                }
                kVar6 = kVar10;
                kVar7 = kVar11;
                i10 = size6;
                size6 = i10 - 1;
                oVar2 = this;
                kVar11 = kVar7;
                kVar10 = kVar6;
            }
            kVar2 = kVar10;
            kVar3 = kVar11;
            oVar = this;
        } else {
            kVar2 = kVar10;
            kVar3 = kVar11;
            oVar = this;
            kVar4 = kVar14;
        }
        Path path2 = oVar.f23385j;
        y3.f.d(kVar4, path2);
        if (oVar.f23363e != null) {
            if (oVar.f23386k == null) {
                oVar.f23386k = new Path();
                oVar.f23387l = new Path();
            }
            y3.f.d(kVar2, oVar.f23386k);
            if (kVar3 != null) {
                kVar5 = kVar3;
                y3.f.d(kVar5, oVar.f23387l);
            } else {
                kVar5 = kVar3;
            }
            h.c cVar = oVar.f23363e;
            float f32 = aVar.f28477g;
            float floatValue2 = aVar.f28478h.floatValue();
            Path path3 = oVar.f23386k;
            if (kVar5 == null) {
                path = path3;
            } else {
                path = oVar.f23387l;
            }
            return (Path) cVar.A(f32, floatValue2, path3, path, f10, e(), oVar.f23362d);
        }
        return path2;
    }
}
