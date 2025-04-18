package x8;

import n9.o;
import v8.y0;
import y7.a0;

/* loaded from: classes3.dex */
public final class b implements f {
    public final int[] a;

    /* renamed from: b, reason: collision with root package name */
    public final y0[] f27505b;

    public b(int[] iArr, y0[] y0VarArr) {
        this.a = iArr;
        this.f27505b = y0VarArr;
    }

    public final a0 a(int i10) {
        int i11 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i11 < iArr.length) {
                if (i10 == iArr[i11]) {
                    return this.f27505b[i11];
                }
                i11++;
            } else {
                o.c("BaseMediaChunkOutput", "Unmatched track of type: " + i10);
                return new y7.k();
            }
        }
    }
}
