package p3;

import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public final class i extends k {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f23374i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f23375j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(List list, int i10) {
        super(list);
        this.f23374i = i10;
        if (i10 != 1) {
            if (i10 != 2) {
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    t3.c cVar = (t3.c) ((z3.a) list.get(i12)).f28472b;
                    if (cVar != null) {
                        i11 = Math.max(i11, cVar.f25195b.length);
                    }
                }
                this.f23375j = new t3.c(new float[i11], new int[i11]);
                return;
            }
            super(list);
            this.f23375j = new z3.c();
            return;
        }
        super(list);
        this.f23375j = new PointF();
    }

    @Override // p3.d
    public final Object g(z3.a aVar, float f10) {
        Object obj;
        z3.c cVar;
        Object obj2 = aVar.f28472b;
        int i10 = this.f23374i;
        Object obj3 = this.f23375j;
        switch (i10) {
            case 0:
                t3.c cVar2 = (t3.c) obj3;
                t3.c cVar3 = (t3.c) obj2;
                t3.c cVar4 = (t3.c) aVar.f28473c;
                cVar2.getClass();
                if (cVar3.equals(cVar4)) {
                    cVar2.a(cVar3);
                } else if (f10 <= 0.0f) {
                    cVar2.a(cVar3);
                } else if (f10 >= 1.0f) {
                    cVar2.a(cVar4);
                } else {
                    int[] iArr = cVar3.f25195b;
                    int length = iArr.length;
                    int[] iArr2 = cVar4.f25195b;
                    if (length == iArr2.length) {
                        int i11 = 0;
                        while (true) {
                            int length2 = iArr.length;
                            int[] iArr3 = cVar2.f25195b;
                            float[] fArr = cVar2.a;
                            if (i11 < length2) {
                                float f11 = cVar3.a[i11];
                                float f12 = cVar4.a[i11];
                                PointF pointF = y3.f.a;
                                fArr[i11] = vd.e.b(f12, f11, f10, f11);
                                iArr3[i11] = d6.g.n(f10, iArr[i11], iArr2[i11]);
                                i11++;
                            } else {
                                for (int length3 = iArr.length; length3 < fArr.length; length3++) {
                                    fArr[length3] = fArr[iArr.length - 1];
                                    iArr3[length3] = iArr3[iArr.length - 1];
                                }
                            }
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
                        sb2.append(iArr.length);
                        sb2.append(" vs ");
                        throw new IllegalArgumentException(vd.e.g(sb2, iArr2.length, ")"));
                    }
                }
                return cVar2;
            case 1:
                return l(aVar, f10, f10, f10);
            default:
                if (obj2 != null && (obj = aVar.f28473c) != null) {
                    z3.c cVar5 = (z3.c) obj2;
                    z3.c cVar6 = (z3.c) obj;
                    h.c cVar7 = this.f23363e;
                    if (cVar7 == null || (cVar = (z3.c) cVar7.A(aVar.f28477g, aVar.f28478h.floatValue(), cVar5, cVar6, f10, e(), this.f23362d)) == null) {
                        z3.c cVar8 = (z3.c) obj3;
                        float f13 = cVar5.a;
                        float f14 = cVar6.a;
                        PointF pointF2 = y3.f.a;
                        float b3 = vd.e.b(f14, f13, f10, f13);
                        float f15 = cVar5.f28493b;
                        float b10 = vd.e.b(cVar6.f28493b, f15, f10, f15);
                        cVar8.a = b3;
                        cVar8.f28493b = b10;
                        return cVar8;
                    }
                    return cVar;
                }
                throw new IllegalStateException("Missing values for keyframe.");
        }
    }

    @Override // p3.d
    public final /* bridge */ /* synthetic */ Object h(z3.a aVar, float f10, float f11, float f12) {
        switch (this.f23374i) {
            case 1:
                return l(aVar, f10, f11, f12);
            default:
                super.h(aVar, f10, f11, f12);
                throw null;
        }
    }

    public final PointF l(z3.a aVar, float f10, float f11, float f12) {
        Object obj;
        PointF pointF;
        Object obj2 = aVar.f28472b;
        if (obj2 != null && (obj = aVar.f28473c) != null) {
            PointF pointF2 = (PointF) obj2;
            PointF pointF3 = (PointF) obj;
            h.c cVar = this.f23363e;
            if (cVar != null && (pointF = (PointF) cVar.A(aVar.f28477g, aVar.f28478h.floatValue(), pointF2, pointF3, f10, e(), this.f23362d)) != null) {
                return pointF;
            }
            PointF pointF4 = (PointF) this.f23375j;
            float f13 = pointF2.x;
            float b3 = vd.e.b(pointF3.x, f13, f11, f13);
            float f14 = pointF2.y;
            pointF4.set(b3, ((pointF3.y - f14) * f12) + f14);
            return pointF4;
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
