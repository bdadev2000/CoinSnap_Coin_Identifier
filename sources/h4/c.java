package h4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p3.o;
import p3.r;

/* loaded from: classes.dex */
public final class c extends l0.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f18738d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10) {
        super(4);
        this.f18738d = i10;
    }

    @Override // s3.d
    public p3.d a() {
        switch (this.f18738d) {
            case 0:
                return new p3.e((List) this.f21106c);
            case 1:
                return new p3.i((List) this.f21106c, 0);
            case 2:
                return new p3.j((List) this.f21106c);
            case 3:
                return new p3.i((List) this.f21106c, 1);
            case 4:
                return new p3.i((List) this.f21106c, 2);
            case 5:
                return new o((List) this.f21106c);
            default:
                return new r((List) this.f21106c);
        }
    }

    @Override // l0.h
    public k f() {
        switch (this.f18738d) {
            case 0:
                return new b(this);
            case 1:
                return new g(this);
            default:
                return new m(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(List list, int i10) {
        super(list, 3);
        this.f18738d = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(ArrayList arrayList) {
        super(arrayList, 3);
        this.f18738d = 1;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            z3.a aVar = (z3.a) arrayList.get(i10);
            t3.c cVar = (t3.c) aVar.f28472b;
            t3.c cVar2 = (t3.c) aVar.f28473c;
            if (cVar != null && cVar2 != null) {
                float[] fArr = cVar.a;
                int length = fArr.length;
                float[] fArr2 = cVar2.a;
                if (length != fArr2.length) {
                    int length2 = fArr.length + fArr2.length;
                    float[] fArr3 = new float[length2];
                    System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
                    System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
                    Arrays.sort(fArr3);
                    float f10 = Float.NaN;
                    int i11 = 0;
                    for (int i12 = 0; i12 < length2; i12++) {
                        float f11 = fArr3[i12];
                        if (f11 != f10) {
                            fArr3[i11] = f11;
                            i11++;
                            f10 = fArr3[i12];
                        }
                    }
                    float[] copyOfRange = Arrays.copyOfRange(fArr3, 0, i11);
                    aVar = new z3.a(cVar.b(copyOfRange), cVar2.b(copyOfRange));
                }
            }
            arrayList.set(i10, aVar);
        }
    }
}
