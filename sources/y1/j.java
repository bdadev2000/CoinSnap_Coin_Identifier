package y1;

import android.graphics.PointF;
import java.util.List;
import w4.v0;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public final class j extends k {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f24304i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f24305j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(List list, int i9) {
        super(list);
        this.f24304i = i9;
        switch (i9) {
            case 1:
                super(list);
                this.f24305j = new PointF();
                return;
            case 2:
                super(list);
                this.f24305j = new I1.c();
                return;
            default:
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    C1.c cVar = (C1.c) ((I1.a) list.get(i11)).b;
                    if (cVar != null) {
                        i10 = Math.max(i10, cVar.b.length);
                    }
                }
                this.f24305j = new C1.c(new float[i10], new int[i10]);
                return;
        }
    }

    @Override // y1.e
    public final Object f(I1.a aVar, float f9) {
        Object obj;
        switch (this.f24304i) {
            case 0:
                C1.c cVar = (C1.c) aVar.b;
                C1.c cVar2 = (C1.c) aVar.f1409c;
                C1.c cVar3 = (C1.c) this.f24305j;
                cVar3.getClass();
                if (cVar.equals(cVar2)) {
                    cVar3.a(cVar);
                } else if (f9 <= 0.0f) {
                    cVar3.a(cVar);
                } else if (f9 >= 1.0f) {
                    cVar3.a(cVar2);
                } else {
                    int[] iArr = cVar.b;
                    int length = iArr.length;
                    int[] iArr2 = cVar2.b;
                    if (length == iArr2.length) {
                        int i9 = 0;
                        while (true) {
                            int length2 = iArr.length;
                            int[] iArr3 = cVar3.b;
                            float[] fArr = cVar3.f425a;
                            if (i9 < length2) {
                                fArr[i9] = H1.g.e(cVar.f425a[i9], cVar2.f425a[i9], f9);
                                iArr3[i9] = v0.k(f9, iArr[i9], iArr2[i9]);
                                i9++;
                            } else {
                                for (int length3 = iArr.length; length3 < fArr.length; length3++) {
                                    fArr[length3] = fArr[iArr.length - 1];
                                    iArr3[length3] = iArr3[iArr.length - 1];
                                }
                            }
                        }
                    } else {
                        StringBuilder sb = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
                        sb.append(iArr.length);
                        sb.append(" vs ");
                        throw new IllegalArgumentException(AbstractC2914a.g(sb, iArr2.length, ")"));
                    }
                }
                return cVar3;
            case 1:
                return k(aVar, f9, f9, f9);
            default:
                Object obj2 = aVar.b;
                if (obj2 != null && (obj = aVar.f1409c) != null) {
                    I1.c cVar4 = (I1.c) obj2;
                    I1.c cVar5 = (I1.c) obj;
                    E1.d dVar = this.f24292e;
                    if (dVar != null) {
                        I1.c cVar6 = (I1.c) dVar.t(aVar.f1413g, aVar.f1414h.floatValue(), cVar4, cVar5, f9, d(), this.f24291d);
                        if (cVar6 != null) {
                            return cVar6;
                        }
                    }
                    float e4 = H1.g.e(cVar4.f1427a, cVar5.f1427a, f9);
                    float e9 = H1.g.e(cVar4.b, cVar5.b, f9);
                    I1.c cVar7 = (I1.c) this.f24305j;
                    cVar7.f1427a = e4;
                    cVar7.b = e9;
                    return cVar7;
                }
                throw new IllegalStateException("Missing values for keyframe.");
        }
    }

    @Override // y1.e
    public /* bridge */ /* synthetic */ Object g(I1.a aVar, float f9, float f10, float f11) {
        switch (this.f24304i) {
            case 1:
                return k(aVar, f9, f10, f11);
            default:
                return super.g(aVar, f9, f10, f11);
        }
    }

    public PointF k(I1.a aVar, float f9, float f10, float f11) {
        Object obj;
        Object obj2 = aVar.b;
        if (obj2 != null && (obj = aVar.f1409c) != null) {
            PointF pointF = (PointF) obj2;
            PointF pointF2 = (PointF) obj;
            E1.d dVar = this.f24292e;
            if (dVar != null) {
                PointF pointF3 = (PointF) dVar.t(aVar.f1413g, aVar.f1414h.floatValue(), pointF, pointF2, f9, d(), this.f24291d);
                if (pointF3 != null) {
                    return pointF3;
                }
            }
            PointF pointF4 = (PointF) this.f24305j;
            float f12 = pointF.x;
            float a6 = AbstractC2914a.a(pointF2.x, f12, f10, f12);
            float f13 = pointF.y;
            pointF4.set(a6, AbstractC2914a.a(pointF2.y, f13, f11, f13));
            return pointF4;
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
