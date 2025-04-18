package x9;

import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class j {
    public final i a;

    /* renamed from: b, reason: collision with root package name */
    public final List f27605b;

    /* renamed from: c, reason: collision with root package name */
    public final List f27606c;

    /* renamed from: d, reason: collision with root package name */
    public final float[] f27607d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f27608e;

    /* renamed from: f, reason: collision with root package name */
    public final float f27609f;

    /* renamed from: g, reason: collision with root package name */
    public final float f27610g;

    public j(i iVar, ArrayList arrayList, ArrayList arrayList2) {
        this.a = iVar;
        this.f27605b = Collections.unmodifiableList(arrayList);
        this.f27606c = Collections.unmodifiableList(arrayList2);
        float f10 = ((i) arrayList.get(arrayList.size() - 1)).b().a - iVar.b().a;
        this.f27609f = f10;
        float f11 = iVar.d().a - ((i) arrayList2.get(arrayList2.size() - 1)).d().a;
        this.f27610g = f11;
        this.f27607d = d(f10, arrayList, true);
        this.f27608e = d(f11, arrayList2, false);
    }

    public static float[] d(float f10, ArrayList arrayList, boolean z10) {
        float f11;
        float f12;
        int size = arrayList.size();
        float[] fArr = new float[size];
        for (int i10 = 1; i10 < size; i10++) {
            int i11 = i10 - 1;
            i iVar = (i) arrayList.get(i11);
            i iVar2 = (i) arrayList.get(i10);
            if (z10) {
                f11 = iVar2.b().a - iVar.b().a;
            } else {
                f11 = iVar.d().a - iVar2.d().a;
            }
            float f13 = f11 / f10;
            if (i10 == size - 1) {
                f12 = 1.0f;
            } else {
                f12 = fArr[i11] + f13;
            }
            fArr[i10] = f12;
        }
        return fArr;
    }

    public static i e(i iVar, int i10, int i11, float f10, int i12, int i13, float f11) {
        boolean z10;
        ArrayList arrayList = new ArrayList(iVar.f27602c);
        arrayList.add(i11, (h) arrayList.remove(i10));
        g gVar = new g(iVar.a, f11);
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            h hVar = (h) arrayList.get(i14);
            float f12 = hVar.f27596d;
            float f13 = (f12 / 2.0f) + f10;
            if (i14 >= i12 && i14 <= i13) {
                z10 = true;
            } else {
                z10 = false;
            }
            gVar.b(f13, hVar.f27595c, f12, z10, hVar.f27597e, hVar.f27598f);
            f10 += hVar.f27596d;
        }
        return gVar.e();
    }

    public static i f(i iVar, float f10, float f11, boolean z10, float f12) {
        float f13;
        int i10;
        boolean z11;
        float f14;
        float f15;
        int size;
        int i11;
        float f16;
        float f17;
        float f18;
        boolean z12;
        float min;
        int b3 = t.h.b(1);
        int i12 = iVar.f27604e;
        int i13 = iVar.f27603d;
        float f19 = iVar.a;
        List list = iVar.f27602c;
        float f20 = 2.0f;
        if (b3 != 0) {
            ArrayList arrayList = new ArrayList(list);
            g gVar = new g(f19, f11);
            if (z10) {
                size = 0;
            } else {
                size = arrayList.size() - 1;
            }
            int i14 = 0;
            while (i14 < arrayList.size()) {
                h hVar = (h) arrayList.get(i14);
                boolean z13 = hVar.f27597e;
                if (z13 && i14 == size) {
                    i11 = i14;
                    gVar.b(hVar.f27594b, hVar.f27595c, hVar.f27596d, false, true, hVar.f27598f);
                } else {
                    i11 = i14;
                    float f21 = hVar.f27594b;
                    if (z10) {
                        f16 = f21 + f10;
                    } else {
                        f16 = f21 - f10;
                    }
                    if (z10) {
                        f17 = f10;
                    } else {
                        f17 = 0.0f;
                    }
                    if (z10) {
                        f18 = 0.0f;
                    } else {
                        f18 = f10;
                    }
                    if (i11 >= i13 && i11 <= i12) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    float f22 = hVar.f27595c;
                    float f23 = hVar.f27596d;
                    if (z10) {
                        min = Math.max(0.0f, ((f23 / 2.0f) + f16) - f11);
                    } else {
                        min = Math.min(0.0f, f16 - (f23 / 2.0f));
                    }
                    gVar.c(f16, f22, f23, z12, z13, Math.abs(min), f17, f18);
                }
                i14 = i11 + 1;
            }
            return gVar.e();
        }
        ArrayList arrayList2 = new ArrayList(list);
        g gVar2 = new g(f19, f11);
        Iterator it = list.iterator();
        int i15 = 0;
        while (it.hasNext()) {
            if (((h) it.next()).f27597e) {
                i15++;
            }
        }
        float size2 = f10 / (list.size() - i15);
        if (z10) {
            f13 = f10;
        } else {
            f13 = 0.0f;
        }
        int i16 = 0;
        while (i16 < arrayList2.size()) {
            h hVar2 = (h) arrayList2.get(i16);
            if (hVar2.f27597e) {
                i10 = i16;
                gVar2.b(hVar2.f27594b, hVar2.f27595c, hVar2.f27596d, false, true, hVar2.f27598f);
            } else {
                i10 = i16;
                if (i10 >= i13 && i10 <= i12) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                float f24 = hVar2.f27596d - size2;
                float a = f.a(f24, f19, f12);
                float f25 = (f24 / f20) + f13;
                float abs = Math.abs(f25 - hVar2.f27594b);
                float f26 = hVar2.f27598f;
                if (z10) {
                    f14 = abs;
                } else {
                    f14 = 0.0f;
                }
                if (z10) {
                    f15 = 0.0f;
                } else {
                    f15 = abs;
                }
                gVar2.c(f25, a, f24, z11, false, f26, f14, f15);
                f13 += f24;
            }
            i16 = i10 + 1;
            f20 = 2.0f;
        }
        return gVar2.e();
    }

    public final i a() {
        return (i) this.f27606c.get(r0.size() - 1);
    }

    public final i b(float f10, float f11, float f12) {
        float a;
        List list;
        float[] fArr;
        float[] fArr2;
        float f13 = this.f27609f;
        float f14 = f11 + f13;
        float f15 = this.f27610g;
        float f16 = f12 - f15;
        float f17 = c().a().f27599g;
        float f18 = a().a().f27600h;
        if (f13 == f17) {
            f14 += f17;
        }
        if (f15 == f18) {
            f16 -= f18;
        }
        if (f10 < f14) {
            a = s9.a.a(1.0f, 0.0f, f11, f14, f10);
            list = this.f27605b;
            fArr = this.f27607d;
        } else if (f10 > f16) {
            a = s9.a.a(0.0f, 1.0f, f16, f12, f10);
            list = this.f27606c;
            fArr = this.f27608e;
        } else {
            return this.a;
        }
        int size = list.size();
        float f19 = fArr[0];
        int i10 = 1;
        while (true) {
            if (i10 < size) {
                float f20 = fArr[i10];
                if (a <= f20) {
                    fArr2 = new float[]{s9.a.a(0.0f, 1.0f, f19, f20, a), i10 - 1, i10};
                    break;
                }
                i10++;
                f19 = f20;
            } else {
                fArr2 = new float[]{0.0f, 0.0f, 0.0f};
                break;
            }
        }
        i iVar = (i) list.get((int) fArr2[1]);
        i iVar2 = (i) list.get((int) fArr2[2]);
        float f21 = fArr2[0];
        if (iVar.a == iVar2.a) {
            List list2 = iVar.f27602c;
            int size2 = list2.size();
            List list3 = iVar2.f27602c;
            if (size2 == list3.size()) {
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < list2.size(); i11++) {
                    h hVar = (h) list2.get(i11);
                    h hVar2 = (h) list3.get(i11);
                    float f22 = hVar.a;
                    float f23 = hVar2.a;
                    LinearInterpolator linearInterpolator = s9.a.a;
                    float b3 = vd.e.b(f23, f22, f21, f22);
                    float f24 = hVar2.f27594b;
                    float f25 = hVar.f27594b;
                    float b10 = vd.e.b(f24, f25, f21, f25);
                    float f26 = hVar2.f27595c;
                    float f27 = hVar.f27595c;
                    float b11 = vd.e.b(f26, f27, f21, f27);
                    float f28 = hVar2.f27596d;
                    float f29 = hVar.f27596d;
                    arrayList.add(new h(b3, b10, b11, vd.e.b(f28, f29, f21, f29), false, 0.0f, 0.0f, 0.0f));
                }
                return new i(iVar.a, arrayList, s9.a.b(f21, iVar.f27603d, iVar2.f27603d), s9.a.b(f21, iVar.f27604e, iVar2.f27604e));
            }
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
    }

    public final i c() {
        return (i) this.f27605b.get(r0.size() - 1);
    }
}
